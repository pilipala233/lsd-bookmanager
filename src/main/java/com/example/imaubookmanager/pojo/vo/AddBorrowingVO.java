package com.example.imaubookmanager.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

@AllArgsConstructor
public class AddBorrowingVO {
    private long bookId;


    private long userId;
}
