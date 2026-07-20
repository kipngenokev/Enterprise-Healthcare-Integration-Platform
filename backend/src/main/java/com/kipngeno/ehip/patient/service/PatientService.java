package com.kipngeno.ehip.patient.service;

import com.kipngeno.ehip.patient.dto.CreatePatientRequest;
import com.kipngeno.ehip.patient.dto.PatientResponse;
import com.kipngeno.ehip.patient.entity.Patient;
import com.kipngeno.ehip.patient.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public PatientResponse registerPatient(CreatePatientRequest patientRequest) {
        if(patientRepository.existsByMedicalRecordNumber(patientRequest.getMedicalRecordNumber())) {
            throw new IllegalArgumentException("Medical record number already exists");
        }

        Patient patient = new Patient();
        patient.setMedicalRecordNumber(
                patientRequest.getMedicalRecordNumber());

        patient.setFirstName(
                patientRequest.getFirstName());

        patient.setLastName(
                patientRequest.getLastName());

        patient.setPhoneNumber(
                patientRequest.getPhoneNumber());

        patient.setEmail(
                patientRequest.getEmail());

        patient.setDateOfBirth(
                patientRequest.getDateOfBirth());

        patient.setGender(
                patientRequest.getGender());

        LocalDateTime now = LocalDateTime.now();
        patient.setCreatedAt(now);
        patient.setUpdatedAt(now);

        Patient savedPatient = patientRepository.save(patient);

        PatientResponse response = new PatientResponse();
        response.setId(savedPatient.getId());
        response.setMedicalRecordNumber(savedPatient.getMedicalRecordNumber());
        response.setFirstName(savedPatient.getFirstName());
        response.setLastName(savedPatient.getLastName());
        response.setCreatedAt(savedPatient.getCreatedAt());

        return response;

    }
}
