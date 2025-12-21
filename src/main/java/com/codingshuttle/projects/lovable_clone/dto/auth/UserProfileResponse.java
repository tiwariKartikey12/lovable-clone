package com.codingshuttle.projects.lovable_clone.dto.auth;

public record UserProfileResponse(
        Long id,
        String mail,
        String name,
        String avatarUrl
) {
}
