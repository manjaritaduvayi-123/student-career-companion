package com.manjari.careercompanion.service;

import org.springframework.stereotype.Service;

@Service
public class CareerService {
    public String recommendCareer(String skills) {

    skills = skills.toLowerCase();

    if (skills.contains("java")) {

        return """
Career : Java Developer

Description :
Develop enterprise applications using Java.

Skills To Learn :
✔ Spring Boot
✔ REST APIs
✔ Microservices
✔ Docker

Skill Gap Analysis :
✔ Spring Boot
✔ Maven
✔ REST APIs

Salary :
₹5 - ₹15 LPA

Learning Roadmap :

Month 1 :
Core Java
OOP Concepts

Month 2 :
Spring Boot
Maven

Month 3 :
REST APIs
MySQL

Month 4 :
Build Projects
""";
    }

    if (skills.contains("python")) {

        return """
Career : Data Scientist

Description :
Extract insights from data.

Skills To Learn :
✔ Pandas
✔ NumPy
✔ Machine Learning
✔ Statistics

Skill Gap Analysis :
✔ Pandas
✔ Machine Learning
✔ Statistics

Salary :
₹6 - ₹20 LPA

Learning Roadmap :

Month 1 :
Python

Month 2 :
Pandas & NumPy

Month 3 :
Data Visualization

Month 4 :
Machine Learning
""";
    }

    if (skills.contains("html") &&
        skills.contains("css")) {

        return """
Career : Frontend Developer

Description :
Build modern websites and web applications.

Skills To Learn :
✔ JavaScript
✔ Bootstrap
✔ React

Skill Gap Analysis :
✔ JavaScript
✔ React

Salary :
₹4 - ₹12 LPA

Learning Roadmap :

Month 1 :
HTML & CSS

Month 2 :
JavaScript

Month 3 :
Bootstrap

Month 4 :
React
""";
    }

    if (skills.contains("aws")) {

        return """
Career : Cloud Engineer

Description :
Manage cloud infrastructure and deployments.

Skills To Learn :
✔ Docker
✔ Kubernetes
✔ Terraform

Salary :
₹8 - ₹20 LPA
""";
    }

    return """
Career : Software Engineer

Description :
General software development role.

Skills To Learn :
✔ DSA
✔ Git
✔ Problem Solving

Salary :
₹4 - ₹12 LPA
""";
} 
    
}