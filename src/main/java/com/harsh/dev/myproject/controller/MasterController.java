package com.harsh.dev.myproject.controller;


import com.harsh.dev.myproject.requestprocessor.StarterRequestProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/master")
public class MasterController {



    private StarterRequestProcessor starterRequestProcessor;


    @PreAuthorize("hasRole('Master')")
    @GetMapping("/getItem")
    private ResponseEntity<Map<Object,Object>> getItemMethod(){
//        System.out.println("hello");
        Map<Object,Object> map = new HashMap<>();
        map.put("userName","admin");
        map.put("password","admin");
        return ResponseEntity.ok(map);
    }
}
