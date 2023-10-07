package com.example.restapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@RequiredArgsConstructor
@Builder
@Getter
public class Person {
    private final String personalNo;
    private final String fullName;
    private final LocalDate bdt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personalNo, person.personalNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalNo);
    }
}
