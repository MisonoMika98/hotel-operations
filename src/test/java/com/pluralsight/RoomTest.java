package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{
    @Test
    public void checkIn_shouldMarkRoom_asDirtyAndOccupied()
    {
        // arrange
        Room room = new Room("King Size", 2, 250.52, false, false);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isOccupied(), "Room should be marked as occupied");
        assertTrue(room.isDirty(), "Room should be marked as dirty");
    }

    @Test
    public void checkOut_shouldMarkRoom_asUnoccupied()
    {
        // arrange
        Room room = new Room("Regular Size", 2, 125.77, true, false);
        // act
        room.checkOut();
        // assert
        assertFalse(room.isOccupied(), "Room should be marked as unoccupied/false");
        assertTrue(room.isDirty(), "Room should be marked as dirty/true, because you can't clean a room that hasn't been checked out");

    }

    @Test
    public void cleanRoom_shouldMarkRoom_asClean()
    {
        // arrange
        Room room = new Room("Queen Size", 2, 204.49, false, true);
        // act
        room.cleanRoom();
        // assert
        assertFalse(room.isOccupied(), "Room should be marked as clean/false, method doesn't use isOccupied bool");
    }

}