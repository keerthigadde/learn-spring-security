package com.baeldung.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.baeldung.lss.spring.LssApp6;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = LssApp6.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class Lss6IntegrationTest {



    @Test
    public void whenLoadApplication_thenSuccess() {

    }
}
