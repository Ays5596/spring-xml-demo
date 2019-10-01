package com.stackroute.domain;

public class Movie {
    private Actor HR;
    private Actor DP;
    private Actor RK;

    public Movie(Actor HR, Actor DP, Actor RK) {
        this.HR = HR;
        this.DP = DP;
        this.RK = RK;
    }

    public Actor getHR() {
        return HR;
    }

    public Actor getDP() {
        return DP;
    }

    public Actor getRK() {
        return RK;
    }

    public void setDP(Actor DP) {
        this.DP = DP;
    }

    public void setRK(Actor RK) {
        this.RK = RK;
    }

    public void setHR(Actor HR) {
        this.HR = HR;
    }
    public void disp1(){
        System.out.println("Name: "+HR.getName()+" Gender: "+HR.getGender()+" Age: "+HR.getAge());
    }
    public void disp2(){
        System.out.println("Name: "+DP.getName()+" Gender: "+DP.getGender()+" Age: "+DP.getAge());
    }
    public void disp3(){
        System.out.println("Name: "+RK.getName()+" Gender: "+RK.getGender()+" Age: "+RK.getAge());
    }
}
