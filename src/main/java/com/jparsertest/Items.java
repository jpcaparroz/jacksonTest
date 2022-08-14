package com.jparsertest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {

  private List<Filme> items;

  public List<Filme> getItems() {
    return items;
  }

  public void setItems(List<Filme> items) {
    this.items = items;
  }

}
