package com.jdbcexample.democ1220751_38;


import org.springframework.web.bind.annotation.*;



import java.util.Collection;



@RestController

public class orderController {



    private final orderService service;



    public orderController (orderService service) {

        this.service = service;

    }



    //get all students

    @GetMapping("/all")

    public Collection<order> getAllStudents(){

        return service.getAllStudents();

    }



    // Add students



    @PostMapping()

    public void CreateStudent(@RequestBody order std){

        service.createStudent(std);

    }







    // update student



    @PutMapping("{id}")

    public void updateStudents(@RequestBody order std, @PathVariable int id){

        service.updateStudent(std,id);

    }



}