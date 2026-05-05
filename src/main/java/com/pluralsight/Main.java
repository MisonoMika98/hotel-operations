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
        room404.checkIn();
        System.out.println("Room404's availability: " + room404.isAvailable());
        System.out.println();
        room404.checkOut();
        // still dirty
        System.out.println("Room404's availability: " + room404.isAvailable());
        System.out.println();
        room404.cleanRoom();
        // room is now clean and empty
        System.out.println("Room404's availability: " + room404.isAvailable());
        System.out.println();



        Reservation reservation1 = new Reservation(room404, 7, true);
        System.out.printf("Reservation total: " + "$" + "%.2f", reservation1.getReservationTotal());
        System.out.println();
        System.out.println();


        Employee employee1 = new Employee(75, "Skibidi", "Housekeeping", 24.00, 8);

        System.out.println(employee1.getName() + "'s hours worked before day 2 punch in: " + employee1.getHoursWorked());
        employee1.punchTimeCard(8, 16);
        System.out.println(employee1.getName() + "'s hours worked after day 2 punch in: " + employee1.getHoursWorked());
        System.out.println(employee1.getName() + "'s overtime hours worked: " + String.format("%.1f",employee1.getOvertimeHours()));
        System.out.println(employee1.getName() + " has made: $" + employee1.getTotalPay() + " this week");

    }

}
