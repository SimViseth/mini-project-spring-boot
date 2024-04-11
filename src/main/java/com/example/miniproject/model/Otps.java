package com.example.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Otps {
    private Integer optId;
    private String optCode;
    private Timestamp issued_at;
    private Timestamp expiration;
    private Boolean verify;
    private Users users;
}
