package com.pluralsight;

public class Main
{
    static void main()
    {
        // testing make into methods later if needed
        System.out.println();


        Room room404 = new Room("double", 2, 200.50, false, false);
        System.out.println("Room404's availability: " + room404.isAvailable());
        System.out.println();


        Reservation catFamily = new Reservation(room404, 7, true);
        System.out.printf("$" + "%.2f", catFamily.getReservationTotal());
        System.out.println();
        System.out.println();


        Employee employee1 = new Employee(75, "Skibidi", "Housekeeping", 24.00, 8);

        System.out.println("before day 2 punch in: " + employee1.getHoursWorked());
        employee1.punchTimeCard(8, 16);
        System.out.println("after day 2 punch in: " + employee1.getHoursWorked());
        System.out.println(employee1.getName() + "'s overtime hours worked: " + String.format("%.1f",employee1.getOvertimeHours()));

    }

}
