package co.istad.springwebmvc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ProductEditRequest(
        @NotBlank
        String name,
        @Positive
        Double price
) {
}
