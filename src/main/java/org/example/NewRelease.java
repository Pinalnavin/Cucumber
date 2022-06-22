package org.example;

import org.openqa.selenium.By;

public class NewRelease extends Utils {



    public static void NewProduct(){
        //   open the url
        driver.get("https://demo.nopcommerce.com/");
        //   go to new release
        clickOnElement(By.className("news-title"));
        // go to the texbar
        driver.findElement(By.className("enter-comment-title")).sendKeys("Mr Navin");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Product is useful");
        clickOnElement(By.xpath("//*[@id=\"comments\"]/form/div[2]/button"));
    }

}

