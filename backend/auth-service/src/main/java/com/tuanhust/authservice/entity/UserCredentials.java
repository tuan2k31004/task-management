package com.tuanhust.authservice.entity;

import java.time.LocalDateTime;

public class UserCredentials {
    private Long user_credentials_id;
    private Long user_id;
    private CredentialType credential_type;
    private String secretHash;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
