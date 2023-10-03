package com.login.crud.demo.controller;

import com.login.crud.demo.RepositorioPessoa;
import com.login.crud.demo.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired

    private RepositorioPessoa RepositorioPessoa;

    @GetMapping("hello")
        public @ResponseBody String index(){
        return "Hello World!";
    }
    @PostMapping("add")
        public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email){
        Pessoa p = new Pessoa();
        p.setNome(name);
        p.setEmail(email);
        RepositorioPessoa.save(p);
        return "Saved";
    }

    @GetMapping("all")
        public @ResponseBody Iterable<Pessoa> VerPessoa(){
        return RepositorioPessoa.findAll();
    }
}
