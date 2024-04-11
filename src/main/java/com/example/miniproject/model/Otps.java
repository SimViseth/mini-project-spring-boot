package com.example.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Otps {
    private Integer optId;
    private String optCode;
    private LocalDateTime issued_at;
    private LocalDateTime expiration;
    private Boolean verify;
    private Users users;
}
