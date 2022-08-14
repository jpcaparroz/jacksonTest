package com.jparsertest;

import java.io.File;

public class App {
  public static void main(String[] args) throws Exception {

    Http client = new Http();

    String json = client.buscaDados("https://imdb-api.com/en/API/Top250Movies/k_h2ku7xc7");

    Parser parser = new Parser();

    System.out.println(parser.parsear(json).get(8).getFullTitle());

  }
}
