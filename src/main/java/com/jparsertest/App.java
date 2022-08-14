package com.jparsertest;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
  public static void main(String[] args) throws Exception {

    ObjectMapper mapper = new ObjectMapper();

    File json = new File("./imdb.json");
    Items items = mapper.readValue(json, new TypeReference<Items>() {
    });

    List<Filme> filmes = items.getItems();

    System.out.println(filmes.get(0).getFullTitle());

  }
}
