package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("This is coming BEFORE method\n");

    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }

    @Before("@store_manager")
    public void setupStoreManager() {
        System.out.println("\tThis is coming BEFORE StoreManager\n");

    }
    @After("@store_manager")
    public void tearDownStoreManager() {

        System.out.println("\tThis is coming AFTER Store Manager\n");
    }

    @Before ("@smoke")
    public void setupSmokeTest() {
        System.out.println("This is coming BEFORE smoke test\n");

    }

    @After("@smoke")
    public void tearDownSmokeTest() {

        System.out.println("\t\tThis is coming After Smoke test\n");
    }

    @Before ("@db")
    public void setupDbTest() {
        System.out.println("Connection DataBase\n");

    }

    @After("@db")
    public void tearDownDbTest() {

        System.out.println("\t\tClosing DataBase Connection\n");
    }
}
