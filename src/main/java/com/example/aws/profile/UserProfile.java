package com.example.aws.profile;

import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String username;
    private String profileImageLink;

    public UserProfile(UUID userProfileId, String username, String profileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.profileImageLink = profileImageLink;
    }
}
