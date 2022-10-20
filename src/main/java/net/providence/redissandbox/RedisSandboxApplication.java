package net.providence.redissandbox;

import com.redis.om.spring.annotations.EnableRedisEnhancedRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedisEnhancedRepositories(basePackages = "net.providence.redissandbox.hashes.*")
public class RedisSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSandboxApplication.class, args);
    }

}
