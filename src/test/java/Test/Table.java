package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>tableheader=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));
		for(int i=0; i<tableheader.size(); i++)
		{
			String tabletext=tableheader.get(i).getText();
			System.out.println(tabletext);
			
			switch (tabletext) {
			case "Company":
				List<WebElement> companylisst=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[1]"));
				for(int j=0; j<companylisst.size(); j++)
				{
				String companytext=companylisst.get(j).getText();
				System.out.println("Company list" +companylisst);
				}

		
	
		case "Contact":
			List<WebElement> contactlisst=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[2]"));
			for(int k=0; k<contactlisst.size(); k++)
			{
			String contacttext=contactlisst.get(k).getText();
			System.out.println("Contact list" +contactlisst);
			}

		case "Country":
			
			List<WebElement> countrylist=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
			for(int m=0; m<countrylist.size(); m++)
			{
			String countrytext=countrylist.get(m).getText();
			System.out.println("Country list" +countrytext);
			}

	
}
}
	}
}
