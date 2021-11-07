package com.revert.srv.service;

import com.revert.srv.dto.PatientDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PatientsService {
    public Boolean getLivingStatusForPatient(PatientDTO patientDTO){
        Random rd = new Random();
        return rd.nextBoolean();
    }
}
