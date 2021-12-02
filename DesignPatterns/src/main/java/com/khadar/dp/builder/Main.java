package com.khadar.dp.builder;

public class Main {
    public static void main(String[] args) {

        User user1 = new User.UserBuilder("Khadar", "Basha")
                .age(28)
                .address("Badvel")
                .phone("7829454293")
                .build();

        User user2 = new User.UserBuilder("Asifa", "Pattan")
                .age(21)
                .phone("9866837043")
                .address("Karatampad")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
