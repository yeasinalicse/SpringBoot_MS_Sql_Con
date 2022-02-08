package com.example.springboot_ms_sql_con.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by yeasin ali on 08/Feb/20.
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Hello and Welcome to the EasyNotes application. You can create a new Note by making a POST request to /api/notes endpoint."
                + "\n For Post url localhost:8080/api/notes add this in body {\"title\":\"Java books\"\r\n" +
                ",\"content\":\"Java apis\"}\n"
                + "";

    }
}
