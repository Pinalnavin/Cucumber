package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {

    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(By.className("ico-register"));
    }

    public void clickOnBuildYourOwnComputer() {
        //click on  clickOnBuildYourOwnComputer
        clickOnElement(By.xpath("//h2/a[@href=\"/build-your-own-computer\"]"));

    }

    public void UserShouldBeAbleToChangeCurrency() {
        //click on UserShouldBeAbleToChangeCurrency
        clickOnElement(By.xpath("//select[@id=\"customerCurrency\"]"));
        //select USDollar
        Select USDollar = new Select(driver.findElement(By.xpath("//select[@name=\"customerCurrency\"]")));
        USDollar.selectByIndex(0);

        clickOnElement(By.xpath("//span[contains(text(),'$1,200.00')]"));
        String expectedMessage = "$1,200.00";
        String actualMessage = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]")).getText();
        System.out.println("Actual message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage, "price doesnt match");

        Select euro = new Select(driver.findElement(By.xpath("//select[@name=\"customerCurrency\"]")));
        euro.selectByIndex(1);

        clickOnElement(By.xpath("//span[contains(text(),'€1032.00')]"));

        String expectedMessage1 = "€1032.00";
        String actualMessage1 = driver.findElement(By.xpath("//span[contains(text(),'€1032.00')]")).getText();
        System.out.println("Actual Message:" + actualMessage1);
        Assert.assertEquals(actualMessage1, expectedMessage1, "Price does not match");
    }

    public void getProductTitle() {

        driver.get("https://demo.nopcommerce.com/");

        List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));

        for (WebElement e : productTitles) {

            System.out.println(e.getText());
        }

      //  public void verifyIfNonRegisteredUserIsAbleToVote () {
            //click on radio button good
        //    clickOnElement(_clickonradiobuttongood);

            //click on vote
        //     clickOnElement(_clickonvote);
            //verify user is not able to vote without being registered

            // delays until message appears
         //   try {
           //     Thread.sleep(500);
          //  } catch (InterruptedException e) {
            }

        //    String actualMessage = driver.findElement(By.xpath("//*[@id=\"block-poll-vote-error-1\"]"));z

        }









