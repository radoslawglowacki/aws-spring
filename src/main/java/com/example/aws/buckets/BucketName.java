package com.example.aws.buckets;

import lombok.Getter;

@Getter
public enum BucketName {
    PROFILE_IMAGE("pet-expert-cc");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
