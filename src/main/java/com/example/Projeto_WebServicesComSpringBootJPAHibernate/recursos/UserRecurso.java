package com.example.Projeto_WebServicesComSpringBootJPAHibernate.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projeto_WebServicesComSpringBootJPAHibernate.entities.User;

//RestController e uma anotação para trabalhar com recursos web.
@RestController
//ResquestMapping e uma anotação para fazer uma requisição do endereço sera usado no localStorage.
@RequestMapping(value = "/users")
public class UserRecurso {

//Esse metodo esta sendo criado para testa se esta trazendo os dados da requisição.
//ResponseEntity responsavel em retorna requisições web.
public ResponseEntity<User> findAll(){
	User u = new User(1, "Maria", "maria@gmail.com", "88888888", "11234");
	//ok() e um metodo que confirmação.
	//body() e um metodo que vai trazer o corpo da respota.
	return ResponseEntity.ok().body(u);
}

}
