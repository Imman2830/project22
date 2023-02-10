package org.room;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelAdactin {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement reg = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		reg.click();
		//Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Immanuvel");
		WebElement psw = driver.findElement(By.id("password"));
		psw.sendKeys("Imman@23");
		WebElement repsw = driver.findElement(By.name("re_password"));
		repsw.sendKeys("Imman@23");
	}

}
