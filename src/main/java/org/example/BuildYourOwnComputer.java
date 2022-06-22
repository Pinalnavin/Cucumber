package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BuildYourOwnComputer extends Utils {

    public void UserShouldBeAddTheComputerInTheCart() {



        //select processor
        Select processor = new Select(driver.findElement(By.name("product_attribute_1")));
        processor.selectByIndex(1);

        //select RAM
        Select ram = new Select(driver.findElement(By.name("product_attribute_2")));
        ram.selectByIndex(1);

        //select HDD
        clickOnElement(By.name("product_attribute_3"));

        //select OS
        clickOnElement(By.name("product_attribute_4"));

        //select software
        List<WebElement> elements = driver.findElements(By.xpath("//input[@name=\"product_attribute_5\"]"));
        System.out.println(Integer.toString(elements.size()));
        for (WebElement el : elements) {
            el.click();
        }
        //click add to cart button
        clickOnElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]"));

        //open shopping cart
        clickOnElement(By.xpath("//span[@class=\"cart-label\"]"));
    }
}