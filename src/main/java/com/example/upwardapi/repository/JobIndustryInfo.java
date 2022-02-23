package com.example.upwardapi.repository;

public class JobIndustryInfo {
    public String id;

    public String industryCode;

    public String industryTitle;

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", industryCode='" + industryCode + '\'' +
                ", industryTitle='" + industryTitle + '\'' +
                '}';
    }
}
