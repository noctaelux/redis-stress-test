package net.providence.redissandbox.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;
import java.util.List;

@Data
@RedisHash(value = "cliente")
public class Cliente {

    @Id
    private Long id;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String correo;
    private List<Contacto> contactos;

}
