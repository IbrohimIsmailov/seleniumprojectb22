package com.cybertek.tests.day12_actions_upload_jsexecutor;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 1)
    public void singleton_understanding_test1() {

        String st1 = Singleton.getWord();
        System.out.println("st1 = " + st1);

        String st2 = Singleton.getWord();
        System.out.println("st2 = " + st2);

        String st3 = Singleton.getWord();
        System.out.println("st3 = " + st3);
    }

    @Test(priority = 2)
    public void singleton_test2() {
        String st4 = Singleton.getWord();
        System.out.println("st4 = " + st4);

    }

}
