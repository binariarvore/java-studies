package com.studies.collections.ArrayList;

import java.util.Objects;

public class Hotel {
    private String name;
    private String city;
    private double daily;

    public Hotel(String name, String city, double daily){
        this.name = name;
        this.city = city;
        this.daily = daily;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name);
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        Objects.requireNonNull(city);
        this.city = city;
    }

    public double getDaily() {
        return daily;
    }

    public void setDaily(double daily) {
        if(daily < 0) {
            throw new IllegalArgumentException("daily values must be positive.");
        }

        this.daily = daily;
    }

    @Override
    public String toString() {
        return String.format("\nHotel: %s in %s, daily value: %.2f", this.name, this.city, this.daily);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return name.equals(hotel.name);
    }
}
