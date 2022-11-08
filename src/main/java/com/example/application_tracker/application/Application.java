package com.example.application_tracker.application;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Application {
    @Id
    @SequenceGenerator(
            name = "application_sequence",
            sequenceName = "application_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "application_sequence"
    )
    private int id;
    private String name;
    private String position;
    private String link;
    private String status;
    private LocalDate dateOfApplication;

    public Application() {
    }

    public Application(int id, String name, String position,
                       String link, String status,
                       LocalDate dateOfApplication) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.link = link;
        this.status = status;
        this.dateOfApplication = dateOfApplication;
    }

    public Application(String name, String position,
                       String link, String status,
                       LocalDate dateOfApplication) {
        this.name = name;
        this.position = position;
        this.link = link;
        this.status = status;
        this.dateOfApplication = dateOfApplication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(LocalDate dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", link='" + link + '\'' +
                ", status='" + status + '\'' +
                ", dateOfApplication=" + dateOfApplication +
                '}';
    }
}
