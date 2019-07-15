package com.wagwalking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst() {

        WebElement walkFreeButton =  driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));

        walkFreeButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input[type=\"email\"]"));

        emailField.sendKeys(user.getEmail());

        WebElement passwordlField = driver.findElement(By.cssSelector("input[type=\"password\"]"));

        passwordlField.sendKeys(user.getPassword());

        WebElement firstNamelField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNamelField.sendKeys(user.getFirstName());

        WebElement lastNamelField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNamelField.sendKeys(user.getLastName());

        WebElement telField = driver.findElement(By.cssSelector("input[type=\"tel\"]"));

        telField.sendKeys(user.getCellPhone());

    }
    

}
