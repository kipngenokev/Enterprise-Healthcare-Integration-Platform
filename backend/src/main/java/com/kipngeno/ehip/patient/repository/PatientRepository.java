package com.kipngeno.ehip.patient.repository;

import com.kipngeno.ehip.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {

    boolean existsByMedicalRecordNumber(String medicalRecordNumber);
}
