package net.providence.redissandbox.model;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.Searchable;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@RedisHash(value = "cliente")
public class Cliente {

    @Id
    private String id;

    @Indexed
    private String nombre;

    private String apellidos;

    private Date fechaNacimiento;

    @Indexed
    private String correo;

    @Reference
    private List<Contacto> contactos = new ArrayList<>();

    public void addContacto(Contacto contacto){
        contactos.add(contacto);
    }

}
