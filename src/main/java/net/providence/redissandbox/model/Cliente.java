package net.providence.redissandbox.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;

@Data
@RedisHash
public class Cliente {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String correo;

}
