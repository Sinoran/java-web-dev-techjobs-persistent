package org.launchcode.javawebdevtechjobspersistent.models;



import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @NotNull(message = "No skills available.")
    private String skill;

    public Skill() {}

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}