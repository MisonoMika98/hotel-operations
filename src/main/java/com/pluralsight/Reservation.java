package com.pluralsight;

public class Reservation
{
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;

    // calls the Room class and creates a room object that uses its getters inside the constructor
    // less typing and, because Room already knows the same roomType and price of the room per night
    public Reservation(Room room, int numberOfNights, boolean isWeekend)
    {
        this.roomType = room.getRoomType();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.price = room.getPrice();
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



    // derived getter
    public double getReservationTotal()
    {
        if (isWeekend)
        {
            return numberOfNights * price * 1.10;
        }
        return numberOfNights * price;
    }
}
