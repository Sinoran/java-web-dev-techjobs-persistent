package org.launchcode.javawebdevtechjobspersistent.models;



import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Valid
    @NotNull
    @NotBlank(message = "No skills available.")
    private String description;


    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}