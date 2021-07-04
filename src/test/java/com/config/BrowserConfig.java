package com.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {

    public static WebDriver driver;

    public static void main(String[] args) {
        chromeLaunch();
    }
    public static void chromeLaunch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        driver=new ChromeDriver();
    }
}
