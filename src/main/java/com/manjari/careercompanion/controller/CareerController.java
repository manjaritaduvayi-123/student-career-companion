package com.manjari.careercompanion.controller;

import com.manjari.careercompanion.model.Student;
import com.manjari.careercompanion.service.CareerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career")
@CrossOrigin("*")
public class CareerController {

    private final CareerService careerService;

    public CareerController(CareerService careerService) {
        this.careerService = careerService;
    }

    @PostMapping("/recommend")
    public String recommendCareer(@RequestBody Student student) {

        return careerService.recommendCareer(
                student.getSkills()
        );
    }
}