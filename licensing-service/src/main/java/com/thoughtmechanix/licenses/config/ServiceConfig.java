package com.thoughtmechanix.licenses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig{

  @Value("${signing.key}")
  private String jwtSigningKey="";

  public String getJwtSigningKey() {
    return jwtSigningKey;
  }

  // Example code for getting a property from configuration
  @Value("${example.property}")
  private String exampleProperty;

  public String getExampleProperty(){
    return exampleProperty;
  }
}