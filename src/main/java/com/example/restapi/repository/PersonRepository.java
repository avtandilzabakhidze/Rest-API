package com.example.restapi.repository;

import com.example.restapi.domain.Person;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.*;

@Repository
public class PersonRepository {
    private static final Set<Person> db = new HashSet<>();

    @PostConstruct
    private void init() {
        db.add(createPerson("1001", "nick kol", LocalDate.of(2000, 10, 20)));
        db.add(createPerson("1002", "luck kin", LocalDate.of(2001, 7, 2)));
        db.add(createPerson("1003", "mary bil", LocalDate.of(2002, 2, 10)));

    }

    public Collection<Person> findAll() {
        return Collections.unmodifiableCollection(db);
    }

    public Optional<Person> findById(String id) {
        return db.stream()
                .filter(person -> person.getPersonalNo().equals(id)).findAny();
    }
public Person save(Person person){
    if (Objects.isNull(person.getPersonalNo())) {
        Person newPerson = Person.builder().personalNo(UUID.randomUUID().toString())
                .fullName(person.getFullName())
                .bdt(person.getBdt())
                .build();

        db.add(newPerson);
        return newPerson;
    }
    db.remove(Person.builder().personalNo(person.getPersonalNo()).build());
    db.add(person);
    return person;
}
    public Optional<Person> delete(String id) {
        Optional<Person> byId = findById(id);
        byId.ifPresent(db::remove);
        return byId;
    }

    private Person createPerson(String personalNo, String name, LocalDate bdt) {
        return Person.builder().personalNo(personalNo).fullName(name).bdt(bdt).build();
    }
}
