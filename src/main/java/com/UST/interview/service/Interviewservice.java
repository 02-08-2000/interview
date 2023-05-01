package com.UST.interview.service;

import com.UST.interview.model.Interview;
import com.UST.interview.repo.Interviewrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Interviewservice {
    @Autowired
    private Interviewrepo repo;
    public Interview createInterview(Interview interviewdetails) {
        return repo.save(interviewdetails);
    }

    public List<Interview> getInterview() {
        return repo.findAll();
    }

    public Interview getInterviewById(int id) {
        return repo.findById(id).orElse(null);
    }

}
