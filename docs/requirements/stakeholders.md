# Stakeholders

## Overview

The Enterprise Healthcare Integration Platform (EHIP) serves multiple stakeholders involved in healthcare delivery, hospital administration, and external healthcare integration.

---

# Internal Stakeholders

## 1. Receptionist

### Responsibilities

- Register patients
- Update patient information
- Search patient records

### System Interaction

- Patient Registration
- Patient Search
- Appointment Scheduling (future)

---

## 2. Doctor

### Responsibilities

- View patient information
- Review laboratory results
- Prescribe medications

### System Interaction

- Patient Records
- Laboratory Module
- Pharmacy Module

---

## 3. Nurse

### Responsibilities

- Record patient observations
- View patient history
- Update patient information

### System Interaction

- Patient Module
- Clinical Records

---

## 4. Laboratory Technician

### Responsibilities

- Receive laboratory requests
- Record laboratory results
- Update laboratory status

### System Interaction

- Laboratory Module
- Integration Module

---

## 5. Pharmacist

### Responsibilities

- Dispense medication
- Update inventory
- View prescriptions

### System Interaction

- Pharmacy Module
- Inventory

---

## 6. Billing Officer

### Responsibilities

- Generate invoices
- Record payments
- Submit insurance claims

### System Interaction

- Billing Module
- Insurance Integration

---

## 7. Hospital Administrator

### Responsibilities

- Monitor hospital operations
- Generate reports
- Configure departments

### System Interaction

- Reporting Module
- Administration Module

---

## 8. System Administrator

### Responsibilities

- Manage users
- Assign roles
- Configure integrations
- Monitor system health

### System Interaction

- Administration Module
- Security
- Integrations

---

# External Stakeholders

## 1. Patient

### Interests

- Accurate records
- Timely service
- Secure personal information

---

## 2. Insurance Provider

### Responsibilities

- Verify insurance eligibility
- Process insurance claims

### Integration

REST APIs

---

## 3. Ministry of Health

### Responsibilities

- Receive healthcare reports
- Monitor healthcare statistics

### Integration

Reporting APIs / Data Exports

---

## 4. Laboratory Information System (LIS)

### Responsibilities

- Exchange laboratory orders
- Return laboratory results

### Integration

HL7 / FHIR

---

## 5. ERP System

### Responsibilities

- Financial integration
- Procurement
- Inventory synchronization

### Integration

REST APIs

---

## 6. External EMR/HMIS

### Responsibilities

- Exchange patient information

### Integration

FHIR APIs

---

# Stakeholder Goals

The platform should:

- Improve patient care.
- Reduce duplicated work.
- Improve communication between hospital departments.
- Support healthcare interoperability.
- Improve operational efficiency.
- Protect sensitive healthcare information.