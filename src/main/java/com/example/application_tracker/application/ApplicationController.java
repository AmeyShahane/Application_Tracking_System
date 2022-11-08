package com.example.application_tracker.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getApplications(){
        return this.applicationService.getApplications();
    }

    @PostMapping
    public void newApplication(@RequestBody Application application){
        this.applicationService.addNewApplication(application);
    }

    @DeleteMapping(path = "{applicationId}")
    public void deleteApplication(@PathVariable("applicationId") int applicationId){
        this.applicationService.deleteApplication(applicationId);
    }

    @PutMapping(path = "{applicationId}")
    public void updateApplication(
            @PathVariable("applicationId") int applicationId,
            @RequestParam(required = false) String status){
        this.applicationService.updateApplication(applicationId, status);
    }

}
