package com.spring.jpa.web;

import com.spring.jpa.dto.PersonDto;
import com.spring.jpa.model.Person;
import com.spring.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<Person> getPersonList() {
        return personService.getPersonList();
    }

    @PostMapping("/add/")
    public void addPerson(@RequestBody @Valid PersonDto personDto) {
        personService.save(personDto);
    }
}