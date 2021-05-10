package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LibraryTestSuite {
    @Autowired
    private Library library;
    @Test
    void testLoadFromDb(){
        library.loadFromDb();
    }
    @Test
    void testSaveToDb(){

        library.saveToDb();
    }
    @Test
    void testContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        System.out.println("=== Beans List: ===>>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("<<=== Beans List ===");

    }
}
