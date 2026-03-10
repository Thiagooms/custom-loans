package com.desafios.custom_loans.dto;

import java.util.List;

public record CustomerResponseDto(
    String customer,
    List<LoanOfferDto> loans
) {}