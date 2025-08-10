package com.renev.task.tracker.domain.dto;

public record ErrorResponse(int status, String message, String details) {
}
