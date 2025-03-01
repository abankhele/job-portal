package com.example.jobApp;

import com.example.jobApp.model.JobPost;
import com.example.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {
    /*
    We replaced @Requestmapping with Get and post because by default it is only get and we need to add data and not only fetch
     */
    @Autowired
    JobService service;
    @GetMapping({"/", "home"})
    public String Home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){

        return "addjob";

    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String jobPosts(Model m){
        List<JobPost> jobPosts = service.getAllJobs();
        m.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}
