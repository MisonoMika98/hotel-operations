package com.pluralsight;

public class Hotel
{
    private String hotelName;
    private int numberOfSuites;
    private int numberOfBasicRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    // constructors
    public Hotel(String hotelName, int numberOfBasicRooms, int numberOfSuites)
    {
        this.hotelName = hotelName;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.numberOfSuites = numberOfSuites;
    }

    public Hotel(String hotelName, int numberOfBasicRooms, int numberOfSuites, int bookedBasicRooms, int bookedSuites)
    {
        this.hotelName = hotelName;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;

    }


    // getters
    public String getHotelName() {
        return hotelName;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfBasicRooms() {
        return numberOfBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }


    // methods/derived getters

    public boolean bookRoom(int numberOfBasicRooms, boolean isSuite)
    {
        if (isSuite)
        {
            bookedSuites += 1;
        }
        else
        {
            bookedBasicRooms += 1;
        }
        return true;
    }

    public int getAvailableRooms()
    {
        return this.numberOfBasicRooms - this.bookedBasicRooms;
    }

    public int getAvailableSuites()
    {
        return this.numberOfSuites - this.bookedSuites;
    }

}
