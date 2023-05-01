package com.UST.interview.repo;

import com.UST.interview.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Interviewrepo extends JpaRepository<Interview,Integer> {
}
