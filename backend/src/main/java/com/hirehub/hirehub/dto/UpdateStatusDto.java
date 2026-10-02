package com.hirehub.hirehub.dto;

import com.hirehub.hirehub.entity.ApplicationStatus;
import jakarta.validation.constraints.NotNull;

public class UpdateStatusDto {

    @NotNull(message = "Application status is required (APPLIED, REVIEWING, SHORTLISTED, REJECTED, SELECTED)")
    private ApplicationStatus status;

    public UpdateStatusDto() {
    }

    public UpdateStatusDto(ApplicationStatus status) {
        this.status = status;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }
}
