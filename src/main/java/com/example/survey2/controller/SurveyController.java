package com.example.survey2.controller;

import com.example.survey2.model.Survey;
import com.example.survey2.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }


    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    // Endpoints for POST, PUT, DELETE
    @PostMapping
    public Survey addSurvey(@RequestBody Survey survey) {
        return surveyService.addSurvey(survey);
    }

//    @PutMapping("/{id}")
//    public Survey updateSurvey(@PathVariable Long id, @RequestBody Survey survey) {
//        return surveyService.updateSurvey(id, survey)
//                .orElseThrow(() -> new RuntimeException("Survey not found with id " + id));
//    }

    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
    }
}
