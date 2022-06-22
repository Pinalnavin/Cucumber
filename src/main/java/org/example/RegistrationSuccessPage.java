package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends Utils{
  //  private By _clickOnContinueButton = By.xpath("//a[@class='button-1 register-continue-button']");



    public void UserShouldBeAbleToRegisterSuccessfully()
    {
        String expectedMessage = "Your registration completed";
        String actualMessage =  driver.findElement(By.xpath("//div[contains(text(),\"Your registration completed\")]")).getText();
        //System.out.println("Actual message:" + actualMessage);
        Assert.assertEquals(actualMessage,expectedMessage,"Registration is not working");

    }
    //click on continue//
  //  clickOnElement(_clickOnContinueButton);
}

