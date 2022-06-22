package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart  extends Utils{

    public void UserShouldBeAddToProductInShoppingCart(){



        String expectedMessage = "Shopping cart";
        String actualMessage = driver.findElement(By.linkText("Shopping cart")).getText();
        System.out.println("Actual message:" +actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage,"Shopping cart is not working");


    }
}
