package com.login.crud.demo;

import com.login.crud.demo.entities.Pessoa;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioPessoa extends CrudRepository<Pessoa, Integer>{

}