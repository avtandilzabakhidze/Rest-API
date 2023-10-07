package com.example.restapi.controller;

import com.example.restapi.domain.Person;
import com.example.restapi.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("persons")
public class PersonController {
    private final Service service;

    @GetMapping
    public Collection<Person> findAll() {
        return service.findAll();
    }

    @GetMapping("{personalNo}")
    public Optional<Person> findById(@PathVariable(value = "personalNo") String id) {
        return service.findById(id);
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return service.save(person);
    }
    @PutMapping("/{personalNo}")
    public Person update(@PathVariable String personalNo, @RequestBody Person person) {
        return service.save(person);
    }

    @DeleteMapping("{personalNo}")
    public Optional<Person> delete(@PathVariable("personalNo") String id) {
        return service.delete(id);
    }
}
