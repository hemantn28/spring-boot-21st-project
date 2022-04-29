package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    ArrayList<Student> studentArrayList=new ArrayList<>();

    //1. Create => Add

    @RequestMapping("/add_student")
    public String add(@RequestBody Student student){
       // Student student=new Student("Rakesh","PCB",45);
        studentArrayList.add(student);
        return "student added successfully";
    }


    //2. Read => Get

    @RequestMapping("/get_student")
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }


    //3.Update

    @RequestMapping("/update_student")
    public String update(){
        studentArrayList.get(0).setName("Rajesh");
        return "student updated successfully";
    }


    //4/.Delete

    @RequestMapping("/delete_student")
    public String delete(){
        studentArrayList.remove(1);
        return "student deleted successfully";
    }
}
