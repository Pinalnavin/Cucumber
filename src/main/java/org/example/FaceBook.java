package org.example;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class FaceBook extends  Utils{

    public static void NopcommerceToFaceBook(){


        //  driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();

        //
        driver.get("https://www.facebook.com/nopCommerce");

        //   set class to store multiple window ID
        Set<String> id=  driver.getWindowHandles();

        //
        Iterator<String> itr = id.iterator();

        String parentwindow=itr.next();
        String childwindow=itr.next();

        //
        System.out.println("parent window id:"+parentwindow );
        System.out.println("child window id:"+childwindow );
        //
        driver.switchTo().window(childwindow);

        System.out.println(driver.getCurrentUrl());


    }
}
