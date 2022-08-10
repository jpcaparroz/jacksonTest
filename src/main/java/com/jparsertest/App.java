package com.jparsertest;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
  public static void main(String[] args) throws Exception {

    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    
    File json = new File("./test.json");

    // Filme filme = mapper.readValue(json, Filme.class);

    // System.out.println(filme.getFullTitle());

    // System.out.println(mapper.canSerialize(Filme.class));

    List<Filme> filmes = mapper.readValue(json, new TypeReference<List<Filme>>() {
    });

    System.out.println(filmes.get(0).getFullTitle());

  }
}
