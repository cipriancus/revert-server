package com.revert.srv.service;

import com.revert.srv.dto.PatientDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientsService {
  public String getLivingStatusForPatient(PatientDTO patientDTO) {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.postForObject("https://revert-server-ml.herokuapp.com/", patientDTO, String.class);
    //http://192.168.1.18:5000/
  }
}
