package com.tuanhust.authservice.entity;

import java.time.Instant;
import java.util.UUID;

public class UserSession {
    private UUID id;
    private Long user_id;
    private String userAgent;
    private String ipAddress;
    private Instant issuedAt;
    private Instant expiresAt;
    private Instant lastAccessAt;
    private Instant revokedAt;
    private String revokedBy;
    private String refreshTokenHash;
}
