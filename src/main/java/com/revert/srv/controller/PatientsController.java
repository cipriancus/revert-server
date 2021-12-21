package com.revert.srv.controller;

import com.revert.srv.dto.PatientDTO;
import com.revert.srv.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patients")
public class PatientsController {

    private PatientsService patientsService;

    @Autowired
    public PatientsController(PatientsService patientsService){
        this.patientsService = patientsService;
    }

    @PostMapping
    public String getLivingStatusForPatient(@RequestBody PatientDTO patientDTO){
        return patientsService.getLivingStatusForPatient(patientDTO);
    }
}
