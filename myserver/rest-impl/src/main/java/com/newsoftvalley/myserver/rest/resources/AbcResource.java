package com.newsoftvalley.myserver.rest.resources;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.newsoftvalley.myserver.rest.services.AbcService;
import nam.e.spa.ce.Abc;


@RestLiCollection(name = "reverse", namespace = "nam.e.spa.ce")
public class AbcResource
    extends CollectionResourceTemplate<String, Abc> {

  private AbcService _abcService = new AbcService();

  @Override
  public Abc get(String key) {
    return _abcService.get(key);
  }
}

