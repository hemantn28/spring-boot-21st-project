package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    //create
    @Autowired
    StudentRepository repository;

    @RequestMapping(value = "/add_student_db",method= RequestMethod.POST)
    public String add(@RequestBody Student student){

        repository.save(student);
        return "Student added to DB...";

    }

    //get

    @RequestMapping(value = "get_student_db",method= RequestMethod.GET)
    public List<Student> getAll(){

       return repository.findAll();
    }

    //delete

    @RequestMapping(value = "delete_student_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer rollNo){
        repository.deleteById(rollNo);
        return "student deleted successfully";


    }

    //update

    @RequestMapping(value = "update_student_db",method = RequestMethod.PUT)
    public String update(@RequestParam String name){
        repository.getById(1).setName("Rohan");
        return "student updated successfully";

    }
}
