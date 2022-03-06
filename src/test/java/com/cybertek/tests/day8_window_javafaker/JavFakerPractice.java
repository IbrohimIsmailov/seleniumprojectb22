package com.cybertek.tests.day8_window_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavFakerPractice {

    @Test
    public void test1() {
        Faker faker = new Faker();

        String fullName = faker.name().fullName();
        System.out.println(fullName);

        String address = faker.address().fullAddress();
        System.out.println("address = " + address);

        String firstname = faker.name().firstName();
        System.out.println("firstname = " + firstname);
        String lastName=faker.code().toString();
        System.out.println("lastName = " + lastName);
        System.out.println("faker.app() = " + faker.app());

    }
}
