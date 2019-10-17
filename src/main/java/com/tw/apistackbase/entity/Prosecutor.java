package com.tw.apistackbase.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Prosecutor {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @NotNull
    private String name;

    @NotNull
    private Integer age;

    @NotNull
    private String sex;

    @NotNull
    private Integer experience;

    @NotNull
    private String birthday;

    public Prosecutor(String id, @NotNull String name, @NotNull Integer age, @NotNull String sex, @NotNull Integer experience, @NotNull String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.experience = experience;
        this.birthday = birthday;
    }

    public Prosecutor() {
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
