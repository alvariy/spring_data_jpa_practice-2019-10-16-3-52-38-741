package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Prosecutor;
import com.tw.apistackbase.entity.ProsecutorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProsecutorController {

    @Autowired
    ProsecutorRepo prosecutorRepo;

    @GetMapping(path = "/prosecutors", produces = {"application/json"})
    public List<Prosecutor> getAll() {

        return  prosecutorRepo.findAll();
    }


    @PostMapping(path = "/prosecutor", produces = {"application/json"})
    public ResponseEntity addProsecutor(@RequestBody Prosecutor prosecutor){
        if(prosecutor.getAge() < 18)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        prosecutorRepo.save(prosecutor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
