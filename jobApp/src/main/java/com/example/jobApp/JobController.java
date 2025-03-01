package com.example.jobApp;

import com.example.jobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {
    /*
    We replaced @Requestmapping with Get and post because by default it is only get and we need to add data and not only fetch
     */

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

        return "success";
    }

}
