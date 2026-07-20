package com.kipngeno.ehip.patient.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class DuplicateMedicalRecordNumberException extends RuntimeException {
    public DuplicateMedicalRecordNumberException(String message) {
        super(message);
    }
}
