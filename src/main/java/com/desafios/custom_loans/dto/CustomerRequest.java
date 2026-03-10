package com.desafios.custom_loans.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record CustomerRequest(
        @NotNull @Min(18)
        int age,

        @NotBlank
        String cpf,

        @NotBlank
        String name,

        @NotNull @Positive
        BigDecimal income,

        @NotBlank @Size(min = 2, max = 2)
        String location
) {
}
