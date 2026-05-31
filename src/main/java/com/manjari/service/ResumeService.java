package com.manjari.careercompanion.service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class ResumeService {

    public Map<String, Object> analyzeResume(
            MultipartFile file) throws Exception {

        PDDocument document =
                PDDocument.load(file.getInputStream());

        PDFTextStripper stripper =
                new PDFTextStripper();

        String text =
                stripper.getText(document).toLowerCase();

        document.close();

        List<String> foundSkills =
                new ArrayList<>();

        List<String> skillDatabase =
                Arrays.asList(
                        "java",
                        "spring",
                        "spring boot",
                        "sql",
                        "mysql",
                        "docker",
                        "aws",
                        "python",
                        "html",
                        "css",
                        "javascript",
                        "react",
                        "git"
                );

        for (String skill : skillDatabase) {
            if (text.contains(skill)) {
                foundSkills.add(skill);
            }
        }

        String career = "Software Developer";

        if (foundSkills.contains("java")) {
            career = "Java Developer";
        }

        if (foundSkills.contains("python")) {
            career = "Python Developer";
        }

        int atsScore =
                Math.min(foundSkills.size() * 10, 100);

        Map<String, Object> response =
                new HashMap<>();

        response.put("career", career);
        response.put("atsScore", atsScore);
        response.put("skills", foundSkills);
        response.put("salary", "₹5 - ₹15 LPA");

        response.put(
                "missingSkills",
                Arrays.asList(
                        "Spring Boot",
                        "Docker",
                        "AWS"
                )
        );

        return response;
    }
}