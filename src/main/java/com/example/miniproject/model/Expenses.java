package com.example.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expenses {
    private Integer expenseId;
    private int amount;
    private String description;
    private Timestamp date;
    private Categories categories;
}
