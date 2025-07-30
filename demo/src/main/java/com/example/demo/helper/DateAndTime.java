package com.example.demo.helper;


import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateAndTime {

    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
    @Getter
    private LocalDateTime currentDateTime;
    @Getter
    private String formattedDateTime ;

    public DateAndTime(){
        // Current date
       currentDateTime = LocalDateTime.now();
        // Format the LocalDate using the formatter
        formattedDateTime = currentDateTime.format(formatter);

    }



}
