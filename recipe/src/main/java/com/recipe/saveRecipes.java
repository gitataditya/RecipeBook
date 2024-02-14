package com.recipe;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class saveRecipes {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new FirefoxDriver();
        driver.get("https://projectfitnesscompany.notion.site/projectfitnesscompany/4a04f898597c475d99888641b905fe83?v=2fb2303c496b4378ae428c1c470da370");
        
        List<WebElement> allItemsLink = driver.findElements(By.xpath("//a[contains(@href,'pvs=25')]"));
        int countOfAllItems = allItemsLink.size();
        System.out.println(countOfAllItems);

        // for (int i = 0; i < countOfAllItems; i++) {
            
        // }





    }
    
}