# Modular Architecture

## Architectural Style

The Enterprise Healthcare Integration Platform adopts a **Modular Monolith Architecture**.

This approach organizes the application into independent business modules while deploying them as a single application.

---

## Why Modular Monolith?

The architecture was selected because it:

- Reduces operational complexity.
- Encourages clear business boundaries.
- Improves maintainability.
- Simplifies deployment.
- Supports future migration to microservices if required.

---

## Modules

### Authentication

Responsible for:

- Login
- JWT
- RBAC
- User Management

---

### Patient

Responsible for:

- Patient Registration
- Patient Search
- Patient History
- Medical Record Numbers

---

### Laboratory

Responsible for:

- Laboratory Orders
- Laboratory Results
- LIS Integration

---

### Pharmacy

Responsible for:

- Medication
- Dispensing
- Inventory

---

### Billing

Responsible for:

- Invoice Generation
- Payments
- Insurance Claims

---

### Reporting

Responsible for:

- Operational Reports
- Ministry of Health Reports
- Dashboards

---

### Administration

Responsible for:

- Departments
- System Configuration
- User Administration

---

### Integration

Responsible for:

- FHIR
- HL7
- ERP
- Insurance
- External EMR/HMIS

---

## Communication Principles

Modules communicate through well-defined services and interfaces.

Direct access to another module's internal implementation should be avoided.

Each module owns its business logic and data.