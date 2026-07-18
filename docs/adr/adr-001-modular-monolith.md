# ADR-001: Adopt a Modular Monolith Architecture

## Status

Accepted

---

## Context

The Enterprise Healthcare Integration Platform (EHIP) is intended to demonstrate the design and implementation of a modern hospital information system capable of supporting patient management, billing, pharmacy, laboratory operations, reporting, and interoperability with external healthcare systems.

The project is initially developed by a single engineer with the goal of demonstrating enterprise software engineering practices while remaining manageable within the project's scope.

Although the platform may eventually grow to support additional services and integrations, the initial implementation does not require independently deployable services.

---

## Decision

The system will adopt a **Modular Monolith Architecture**.

Business capabilities will be separated into independent modules including:

- Authentication
- Patient Management
- Laboratory
- Pharmacy
- Billing
- Reporting
- Administration
- Integration

Each module will own:

- Business logic
- Entities
- Services
- Repositories
- REST Controllers

Modules will communicate through well-defined interfaces rather than accessing each other's internal implementation directly.

The entire application will be deployed as a single Spring Boot application.

---

## Alternatives Considered

### 1. Microservices

Advantages

- Independent deployment
- Independent scaling
- Technology flexibility

Disadvantages

- Higher operational complexity
- Requires service discovery
- Distributed transactions
- Increased infrastructure requirements
- More difficult local development

Rejected because the project's current scope does not justify the additional complexity.

---

### 2. Traditional Layered Monolith

Advantages

- Simple structure
- Easy to learn

Disadvantages

- Business features become scattered across packages.
- Difficult to maintain as the system grows.
- High coupling between unrelated features.

Rejected because feature ownership becomes unclear in larger enterprise systems.

---

## Consequences

### Positive

- Clear business boundaries.
- Easier maintenance.
- Easier onboarding of developers.
- Simpler deployment.
- Lower infrastructure costs.
- Easier future migration toward microservices.

### Negative

- Entire application must be redeployed for changes.
- Modules cannot be scaled independently.
- Strong architectural discipline is required to prevent tight coupling.

---

## Review

This decision should be reviewed if:

- Independent scaling of modules becomes necessary.
- Different teams require independent deployments.
- The application grows significantly in size and operational complexity.