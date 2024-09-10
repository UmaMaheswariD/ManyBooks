package com.pageobjects;


import com.acc.standardobjects.DriverCap;
import com.acc.standardobjects.PropertyReader;
import com.locators.LoginPageLoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LoginPage extends DriverCap {
    private DriverCap driverCap ;
    private PropertyReader propertyReader;
    private LoginPageLoc loginPageLoc;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        propertyReader=new PropertyReader();
        driverCap=new DriverCap();
        loginPageLoc=new LoginPageLoc();
    }





    public void launchUrl(){
    driverCap.initializeDriver();
    String url=propertyReader.loadRunConfiguration("Url");
    driver.get(url);

    }

    public void login() throws InterruptedException {
        driverCap.setFromJson("LoginCredentials");
        driverCap.waitForelementToBeVisible(loginPageLoc.btn_Login,60);
        driver.findElement(loginPageLoc.btn_Login).click();
        Thread.sleep(5000);
        driverCap.waitForelementToBeVisible(loginPageLoc.input_Email,180);
        driver.findElement(loginPageLoc.input_Email).click();
        driver.findElement(loginPageLoc.input_Email).sendKeys(myMap.get("email"));
        driver.findElement(loginPageLoc.input_Pwd).click();
        driver.findElement(loginPageLoc.input_Pwd).sendKeys(myMap.get("password"));
        driver.findElement(loginPageLoc.btn_Continue).click();

    }

    public void verifySuccessfulLogin() throws InterruptedException {
        driverCap.setFromJson("profileMenu");
        Thread.sleep(5000);
        driverCap.waitForelementToBeVisible(loginPageLoc.btn_MyProfile,180);
        driver.findElement(loginPageLoc.btn_MyProfile).click();
        List<WebElement> submenu=driver.findElements(loginPageLoc.myProfile_SubMenu);
        Assert.assertEquals(submenu.size(),3);
        for(int i=1;i<=submenu.size();i++){
           Assert.assertEquals(submenu.get(i-1).getText().trim(),myMap.get(String.valueOf(i)));
           Thread.sleep(2000);

        }
        driver.quit();


    }
}
