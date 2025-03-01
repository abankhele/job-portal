package com.example.jobApp.service;

import com.example.jobApp.model.JobPost;
import com.example.jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepo jobrepo;
    public List<JobPost> getAllJobs(){
        return jobrepo.getAllJobs();
    }

    public void addJob(JobPost jobpost){
        jobrepo.addJob(jobpost);
    }
}
