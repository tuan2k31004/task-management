package com.tuanhust.authservice.entity;

import java.time.LocalDateTime;

public class User {
    private Long user_id;
    private String email;
    private String username;
    private Roles role;
    private String status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
