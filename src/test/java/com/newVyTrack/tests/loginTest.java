package com.newVyTrack.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

// Bu class'i sadece deneme amacli olusturdum
     // Diger sayfalari olusturduktan sonra silebiliriz.

public class loginTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://qa1.vytrack.com/");

       WebElement nameBox = driver.findElement(By.id("prependedInput"));
       nameBox.sendKeys("user1");

       WebElement password = driver.findElement(By.id("prependedInput2"));
       password.sendKeys("UserUser123");

       WebElement login = driver.findElement(By.id("_submit"));
       login.click();

        Thread.sleep(5000);


        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul"));

        for (WebElement element : elements) {
            System.out.println(element.getText());
        }



       /*  Actions actions = new Actions(driver);
        WebElement fleetModule = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));
         WebElement vehicleFuel = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[7]/a/span"));

         actions.moveToElement(fleetModule).perform();
         Thread.sleep(5000);
         vehicleFuel.click();

         // Hello from US


        */



    }
}
