package com.wr.jonstory.config;

import com.wr.jonstory.entities.Cliente;
import com.wr.jonstory.entities.Endereco;
import com.wr.jonstory.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {


    }
}
