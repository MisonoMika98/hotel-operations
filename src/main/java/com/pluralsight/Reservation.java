package com.pluralsight;

public class Reservation
{
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;

    // constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend)
    {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.price = 0;
    }



    // getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        return price;
    }

    // derived getter
    public double getReservationTotal()
    {
        return numberOfNights * price;
    }
}
