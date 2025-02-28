package com.sonu.beans;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeakDayFinder {

    private LocalDate date;

    public WeakDayFinder() {
        this.date = LocalDate.now(); // Default to the current date
    }

    public WeakDayFinder(LocalDate date) {
        this.date = date;
    }

    public String showMessage(String user) {
        if (date == null) {
            return "Date is not initialized!";
        }

        int day = date.getDayOfWeek().getValue();

        if (day >= 1 && day <= 5) {
            return "--Work hard until you achieve success, " + user + "!";
        } else {
            return "--Today is a Week Off. Enjoy, " + user + "!";
        }
    }
}
