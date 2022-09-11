package com.pk.bakend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BakendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("phy"));
        System.out.println(passwordEncoder.matches("hy","$2a$10$Rb7FucQF4ZRVIsfQA4j9IugylcM0VnObbRZMnZ1SHSN37vqFPED/W"));

    }

}
