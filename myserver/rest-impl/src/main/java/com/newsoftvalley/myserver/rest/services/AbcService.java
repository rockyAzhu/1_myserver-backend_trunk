package com.newsoftvalley.myserver.rest.services;

import nam.e.spa.ce.Abc;

public class AbcService {
  public Abc get(String key) {
    String result = new StringBuilder(key).reverse().toString();
    return new Abc()
        .setMessage(result);
  }
}
