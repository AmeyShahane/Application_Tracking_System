package com.example.application_tracker.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getApplications(){
        return this.applicationRepository.findAll();
    }

    public void addNewApplication(Application application) {
        this.applicationRepository.save(application);
    }

    public void deleteApplication(int applicationId){
        this.applicationRepository.findById(applicationId);
        boolean exists = this.applicationRepository.existsById(applicationId);
        if (!exists) {
            throw new IllegalStateException(
                    "Application with Id" + applicationId + "does not exists");
        }
        this.applicationRepository.deleteById(applicationId);

    }

    @Transactional
    public void updateApplication(int applicationId, String status){
        Application application = applicationRepository.findById(applicationId).orElseThrow(
                () -> new IllegalStateException("Application with id " + applicationId + " does not exists"));
        if(status != null && status.length() > 0 && !Objects.equals(application.getStatus(), status)){
            application.setStatus(status);
        }
    }
}
