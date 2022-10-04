package net.providence.redissandbox.controller;

import lombok.RequiredArgsConstructor;
import net.providence.redissandbox.model.Cliente;
import net.providence.redissandbox.repository.ClientesRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/redis-stress")
@RequiredArgsConstructor
public class ApiController {

    private final ClientesRepository clientesRepository;

    @PostMapping("/agregar/{datos}")
    public String generateData(@PathVariable Long datos){
        for(int i = 0 ; i < datos ; i++){
            Cliente cliente = new Cliente();
            cliente.setId(RandomUtils.nextLong());
            cliente.setNombre(RandomStringUtils.randomAlphanumeric(40));
            cliente.setApellidos(RandomStringUtils.randomAlphanumeric(40));
            cliente.setCorreo(RandomStringUtils.randomAlphanumeric(30));
            cliente.setFechaNacimiento(new Date());

            clientesRepository.save(cliente);
        }

        return "OK";
    }

    @PostMapping(value = "/agregar/lista", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String agregaListaClientes(@RequestBody Set<Cliente> clientes){
        clientesRepository.saveAll(clientes);
        return "OK";
    }

    @GetMapping("/id/{id}")
    public Cliente traePorId(@PathVariable Long id){
        return clientesRepository.findById(id).orElseThrow();
    }

    @GetMapping("/list")
    public List<Cliente> traeData(){
        return (List<Cliente>) clientesRepository.findAll();
    }

    @DeleteMapping("/flush")
    public String flushData(){
        clientesRepository.deleteAll();
        return "OK";
    }

}
