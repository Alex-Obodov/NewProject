package com.qatestlab.homeworks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkPartTwo{
    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException{
        String driverPath = "D:\\Instal Soft\\Selenium\\chromedriver.exe";
        String URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
        String email = "webinar.test@gmail.com";
        String pass = "Xcg7299bnSmMuRLp9ITw";
        By emailLocator = By.cssSelector("#email");
        By passLocator = By.cssSelector("#passwd");
        By enterBtnLocator = By.cssSelector("#login_form > div.form-group.row-padding-top > button");
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passLocator).sendKeys(pass);
        driver.findElement(enterBtnLocator).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#subtab-AdminParentOrders > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#subtab-AdminCatalog > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > nav > ul > li:nth-child(5) > a > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#subtab-AdminParentCustomerThreads > a > span")).click(); //служба поддержки
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#subtab-AdminStats > a")).click(); //статистика
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#subtab-AdminParentModulesSf > a")).click(); //модули
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > nav > ul > li:nth-child(10) > a")).click(); //дизайн
        driver.findElement(By.cssSelector("#subtab-AdminParentShipping > a > span")).click(); //доставка
        Thread.sleep(2000);
       driver.findElement(By.cssSelector("#subtab-AdminParentPayment > a > span")).click(); //способ оплаты
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#subtab-AdminInternational > a")).click(); // м/народн.
         Thread.sleep(2000);
       driver.findElement(By.cssSelector("#subtab-ShopParameters > a > span")).click(); //параменты
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#subtab-AdminAdvancedParameters > a > span")).click(); // конфиг
        Thread.sleep(3000);
        String a = driver.getCurrentUrl();
        driver.navigate().refresh();
        String b = driver.getCurrentUrl();

            if(a.equals(b)){
                System.out.println("The page is same");
            }

        //Thread.sleep(2000);


    }

}
