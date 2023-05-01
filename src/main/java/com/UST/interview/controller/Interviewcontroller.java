package com.UST.interview.controller;

import com.UST.interview.model.Interview;
import com.UST.interview.service.Interviewservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class Interviewcontroller {

    @Autowired
    private Interviewservice interviewservice;

    @PostMapping("/adddetails")
    public Interview address(@RequestBody Interview interviewdetails) {

        return interviewservice.createInterview(interviewdetails);
    }
    @GetMapping("/Interview")
    public List<Interview> getAllEmployee() {

        return interviewservice.getInterview();

    }

    @GetMapping("/Interview/{id}")
    public Interview getInterviewById(@PathVariable int id) {


        return interviewservice.getInterviewById(id);

    }

}
