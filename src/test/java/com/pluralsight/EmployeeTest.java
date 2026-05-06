package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest
{
    @Test
    public void punchTimeCard_shouldAddToEmployee_hoursWorked()
    {
        // arrange
        Employee employee = new Employee(01, "Asuna", "Housekeeping", 30.45, 30);
        // act
        employee.punchTimeCard(10,20); // written as military time
        // assert
        assertEquals(40.0, employee.getHoursWorked(), "Employee's hours worked should be 40.0 after using punchTimeCard()");
    }

}