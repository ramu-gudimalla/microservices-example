package org.microservices.fraud;

import java.time.LocalDateTime;

public record FraudCheckResponse(Boolean isFraudster) {
}
