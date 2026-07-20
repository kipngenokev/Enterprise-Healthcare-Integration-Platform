package com.kipngeno.ehip.patient.controller;

import com.kipngeno.ehip.patient.dto.CreatePatientRequest;
import com.kipngeno.ehip.patient.dto.PatientResponse;
import com.kipngeno.ehip.patient.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<PatientResponse> registerPatient(@Valid @RequestBody CreatePatientRequest patientRequest) {
        PatientResponse response = patientService.registerPatient(patientRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
