package com.locators;

import org.openqa.selenium.By;

public class LoginPageLoc {
    public By btn_Login = By.xpath("//a[text()='Log in']");
    public By input_Email = By.xpath("(//input[@name='email'])[last()]");
    public By input_Pwd = By.xpath("//input[@name='pass']");

    public By btn_Continue = By.xpath("//button[@value='Continue']");
    public By btn_MyProfile = By.xpath("//h3[text()='My Profile']");

    public By myProfile_SubMenu = By.xpath(" //ul[@class='sub-menu']/li/a");








}
