package com.assignment.one.one.controller;

import com.assignment.one.one.model.Student;
import com.assignment.one.one.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repository;

    @RequestMapping(value="/students", method= RequestMethod.GET)
    public List<Student> getStudents(){

        return repository.findAll();
    }
    @RequestMapping(value="/students/{id}", method= RequestMethod.GET)
    public Student getStudent(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }
    @RequestMapping(value="/students", method= RequestMethod.POST)
    public Student createStudent(@RequestBody Student student){
        return repository.save(student);
    }
    @RequestMapping(value="/students", method= RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        return repository.save(student);
    }
    @RequestMapping(value="/students/{id}", method= RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") Long id){
        repository.deleteById(id);
    }


}
