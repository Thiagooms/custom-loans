package com.desafios.custom_loans.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record LoanOfferDto(
        String type,
        @JsonProperty("interest_rate") int interestRate
) {
}
