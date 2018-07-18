package com.martinetherton.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;


/**
 * Created by martin on 23/05/17.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String firstName;
    @NotNull
    private String surname;

//    private Date dateOfBirth;
//    private String placeOfBirth;
//    private String branch;
//    private String gender;
//    private long fatherId;
//    private long motherId;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//
//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }
//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String getPlaceOfBirth() {
//        return placeOfBirth;
//    }
//    public void setPlaceOfBirth(String placeOfBirth) {
//        this.placeOfBirth = placeOfBirth;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//    public void setGender(String gender) {
//        this.gender = gender;
//    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public long getFatherId() {
//        return fatherId;
//    }
//
//    public void setFatherId(long fatherId) {
//        this.fatherId = fatherId;
//    }
//
//    public long getMotherId() {
//        return motherId;
//    }
//
//    public void setMotherId(long motherId) {
//        this.motherId = motherId;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    // Public methods

    public User() { }

    public User(long id) {
        this.id = id;
    }

    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

}
