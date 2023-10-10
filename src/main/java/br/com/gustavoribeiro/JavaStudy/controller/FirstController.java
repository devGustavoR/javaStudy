package br.com.gustavoribeiro.JavaStudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FirstRouter")

public class FirstController {
  @GetMapping("/")
  public String FirstMessage(){
    return "Hello World";
  }  
}
