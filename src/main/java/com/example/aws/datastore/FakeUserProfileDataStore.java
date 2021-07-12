package com.example.aws.datastore;

import com.example.aws.profile.UserProfile;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Radek", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Marek", null));
    }


    public List<UserProfile> getUserProfileList() {
        return USER_PROFILES;
    }
}
