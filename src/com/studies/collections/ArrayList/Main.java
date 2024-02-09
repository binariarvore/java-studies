package com.studies.collections.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var agency = new Agency();
        agency.add("Copacabana", "Rio de Janeiro", 500);
        agency.add("Copacabana", "Rio de Janeiro", 500);
        agency.add("Copacabana", "Rio de Janeiro", 500);
        agency.add("Copacabana", "Rio de Janeiro", 500);


        ArrayList<Hotel> hotels = agency.getHotels();

        System.out.println(hotels);
    }
}
