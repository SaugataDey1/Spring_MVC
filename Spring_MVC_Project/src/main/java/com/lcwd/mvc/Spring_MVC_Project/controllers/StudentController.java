package com.lcwd.mvc.Spring_MVC_Project.controllers;

import com.lcwd.mvc.Spring_MVC_Project.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController
{
    // Create Student
    /*
       Data : Required

       we are receiving data in JSON format

       json --> java object :: DeSerialization
       java object --> json :: Serialization

     */

       /*
            @PostMapping("/create")
            public String createData(@RequestBody Map<String, Object> data)
            {
                System.out.println(data);
                Object name = data.get("name");
                Object empID = data.get("empID");
                System.out.println("Name " + name);
                System.out.println("EmpID " + empID);
                return "created";
            }
    */

    /*
            @PostMapping("/create")
            public void createData(@RequestBody Student student)
            {
                System.out.println(student);
                // save : data : process
            }
     */

    /*
        @PostMapping("/create")
        public List<Student> createData(@RequestBody List<Student> students)
        {
            System.out.println(students.size());
            // save : data : process
            return students;
           // return students.get(0);
        }
    */

    /*
            // Producing JSON
            @PostMapping("/create")
            public Student createData(@RequestBody List<Student> students)
            {
                System.out.println(students.size());
                // save : data : process
                return students.get(0);
            }
    */

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students)
    {
        Student student = students.get(0);
    //    ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.CREATED);
        ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.OK).body(student);
        return response;
    }
}
