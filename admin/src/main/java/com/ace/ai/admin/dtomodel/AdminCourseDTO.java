package com.ace.ai.admin.dtomodel;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminCourseDTO {
    private int id;
    private String name;
    private LocalDate createdDate;
    private Boolean deleteStatus;

}
