package com.one211.restapi.model;

import java.time.LocalDateTime;

public record User(
        Long id,
        String name,
        String email,
        String password,
        String role,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}
