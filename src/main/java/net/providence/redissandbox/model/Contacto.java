package net.providence.redissandbox.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash
public class Contacto {

    @Id
    private Long id;
    private String nombre;

}
