package com.stackroute.domain;

public class Movie {
    private Actor HR;

    public Actor getHR() {
        return HR;
    }

    public void setHR(Actor HR) {
        this.HR = HR;
    }
    public void disp(){
        System.out.println("Name: "+HR.getName()+" Gender: "+HR.getGender()+" Age: "+HR.getAge());
    }
}
