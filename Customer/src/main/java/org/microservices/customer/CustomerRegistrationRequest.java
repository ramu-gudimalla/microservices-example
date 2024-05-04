package org.microservices.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email) {
}
