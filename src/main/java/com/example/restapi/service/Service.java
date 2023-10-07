package com.example.restapi.service;

import com.example.restapi.domain.Person;
import com.example.restapi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.Optional;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final PersonRepository repo;

    public Collection<Person> findAll() {
        return repo.findAll();
    }

    public Optional<Person> findById(String id) {
        return repo.findById(id);
    }

    public Person save(Person person) {
        return repo.save(person);
    }

    public Optional<Person> delete(String id) {
        return repo.delete(id);
    }
}
