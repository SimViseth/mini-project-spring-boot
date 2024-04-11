package com.example.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expenses {
    private Integer expenseId;
    private int amount;
    private String description;
    private LocalDateTime date;
    private Categories categories;
}
