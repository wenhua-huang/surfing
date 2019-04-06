package com.petrel.surfing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ConfigurationProperties("application.properties")
@SpringBootTest
public class JacksonTest {

    @Test
    public void contextLoads() {
        System.out.println("hellowrold");
    }

}
