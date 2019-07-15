package com.wagwalking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class BaseTest {

    protected WebDriver driver;
    protected  User user;
    protected  User2 user2;
    protected  User3 user3;


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/oksanakim/Downloads/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        System.out.println("Start");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(expectedTitle,actualTitle);

        user = new User("kim281082@gmail.com","12344fdr78","Oksana","Kim","2136789876");

        user2 = new User2("83hjakak@mail.ru","97464tgbsj","Olga","Ivanova","2134567876");

        user3 = new User3("iyre@ncd.com","456yredcvhb8","Ivan","Petrov","5432246899");

    }


    @After
    public void quit(){

        System.out.println("Finish");
//        driver.quit();

    }

    //I added some code


}
