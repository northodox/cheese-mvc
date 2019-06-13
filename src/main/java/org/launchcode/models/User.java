package org.launchcode.models;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;


    @NotNull
    @Size(min = 6)
    private String password;

    @NotNull
    @Size(min = 6)
    private String verify;


    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }
    private void setVerify(String verify) {
        this.verify = verify;
    }
}