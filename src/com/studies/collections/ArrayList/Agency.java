package com.studies.collections.ArrayList;

import java.util.ArrayList;

public class Agency {
    private ArrayList<Hotel> hotels = new ArrayList<>();

    public void add(String name, String city, double daily) {
        var newHotel = new Hotel(name, city, daily);

        try {
            if (hotels.contains(newHotel)) {
                throw new HotelsExceptions("Hotel already registered.");
            }
            hotels.add(newHotel);
        } catch (HotelsExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void PrintHotels() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}
