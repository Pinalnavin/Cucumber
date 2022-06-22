package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils{
    private By _gender = By.xpath("//input[@id=\"gender-female\"]");
    private By _firstname =By.xpath("//input[@name='FirstName']");
    private By _lastname =By.id("LastName");
    private By _birthday=By.name("DateofBirthDay");
    private By _birthMonth=By.name("DateOfBirthMonth");
    private By _birthYear=By.name("1960");
    private By _Email=By.xpath("//input[@name=\"Email\"]");
    private By _Password=By.id("12345@abc");
    private By _ConfirmPassword=By.id("12345@abc");
    LoadProp loadProp = new LoadProp();

    public void userEnterRegistration()
    {

        //select gender
        clickOnElement(_gender);

        // enter firstname
        //driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Autoamtion");
        typeText(_firstname,loadProp.getProperty("FirstName"));

        //enter lastname
        //driver.findElement(By.id("LastName")).sendKeys("LastNameTest");
        typeText(_lastname, loadProp.getProperty("LastName"));



        //select birthdate
       Select birthday = new Select(driver.findElement(By.name("DateOfBirthDay")));
       birthday.selectByIndex(10);
          //selectDropdownByValue(_birthday, loadProp.getProperty("10"));

        //birthMonth
        Select birthMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        birthMonth.selectByValue("4");
          //selectDropdownByValue(_birthMonth, loadProp.getProperty("4"));
        //birthYear
        Select birthYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        birthYear.selectByVisibleText("1960");
        //selectDropdownByValue(_birthYear, loadProp.getProperty("1960"));
        //enter email
        driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("Pinal24"+randomDate()+"@gmail.com");
        //typeText(_Email, loadProp.getProperty("Pinal24@gmil.com"));
        //enter password
        //driver.findElement(By.id("Password")).sendKeys("12345@abc.com");
        typeText(By.id("Password"),"12345@abc");
          //typeText(_Password, loadProp.getProperty("12345@abc"));
        //enter confirm password
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("12345@abc.com");
        typeText(By.id("ConfirmPassword"),"12345@abc");
         // typeText(_ConfirmPassword, loadProp.getProperty("12345@abc.com"));
        //enter register button
        //  driver.findElement(By.name("register-button")).click();
        clickOnElement(By.name("register-button"));

    }
}
