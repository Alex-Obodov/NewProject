package com.qatestlab.homeworks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkTwo {

    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException{
 String driverPath = "D:\\Instal Soft\\Selenium\\chromedriver.exe";
        String URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
  String email = "webinar.test@gmail.com";
       String pass = "Xcg7299bnSmMuRLp9ITw";
        By emailLocator = By.cssSelector("#email");
        By passLocator = By.cssSelector("#passwd");
      By enterBtnLocator = By.cssSelector("#login_form > div.form-group.row-padding-top > button");
      By userРic = By.cssSelector("#employee_infos > a > span > img");
      By exitBtn = By.cssSelector("#header_logout");

        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passLocator).sendKeys(pass);
        driver.findElement(enterBtnLocator).click();
        Thread.sleep(2000);
        driver.findElement(userРic).click();
        driver.findElement(exitBtn).click();

        driver.quit();
    }

}
