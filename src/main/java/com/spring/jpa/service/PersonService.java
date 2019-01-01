package com.spring.jpa.service;

import com.spring.jpa.dto.PersonDto;
import com.spring.jpa.model.Person;
import com.spring.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPersonList() {
        return personRepository.findAll();
    }

    public void save(@Valid PersonDto personDto) {
        personRepository.save(new Person(personDto.getFname(), personDto.getLname(), personDto.getContact()));
    }

}
