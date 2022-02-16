package com.example.upwardapi.repository;

public class JobIndustryInfo {
    public String industry;

    public String jobTitle;

    public String superiors;

    public String subordinate;

    @Override
    public String toString() {
        return "{" +
                "industry='" + industry + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", superiors='" + superiors + '\'' +
                ", subordinate='" + subordinate + '\'' +
                '}';
    }
}
