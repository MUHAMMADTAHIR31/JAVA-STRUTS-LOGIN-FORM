/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Dell
 */
@Action(value="login",results={@Result(name="ok",location="/login_success.jsp")})  
public class LoginAction extends ActionSupport {
   
    private String email;
    private String password;
 
    /**
     *
     * @return
     */
    @Override
    public String execute() {
        if (email != null && email.equals("tahir@gmail.com")) {
            return SUCCESS;        
        } else {
            return INPUT;
        }
    }
     
    @RequiredStringValidator(message = "Please enter your e-mail address.")
    @EmailValidator(message = "Please enter a valid e-mail address.")
    public void setEmail(String email) {
        this.email = email;
    }
     
    @RequiredStringValidator(message = "Please enter your password.")
    public void setPassword(String password) {
        this.password = password;
    }
     
    public String getEmail() {
        return email;
    }
     
    public String getPassword() {
        return password;
    }
}