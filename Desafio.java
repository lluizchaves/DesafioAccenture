import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Desafio {
	
	
	@Test
	public void preencherCampos() {
		WebDriver drive = new FirefoxDriver(); // Instancia do Firefox
		drive.get("http://sampleapp.tricentis.com/101/app.php");  // Abre o site
		Assert.assertEquals("Enter Vehicle Data", drive.getTitle()); //Válida o titulo da pagina no browser
					
		
			/********** Preencher/Validar os campos da aba 1 **********/
		
			WebElement element = drive.findElement(By.id("make"));
			 Select combo = new Select(element);
			 combo.selectByIndex(2);
			 Assert.assertEquals("BMW", combo.getFirstSelectedOption().getText());
	
			WebElement element2 = drive.findElement(By.id("model"));
			 Select combo2 = new Select(element2);
			 combo2.selectByIndex(1);
			 Assert.assertEquals("Scooter", combo2.getFirstSelectedOption().getText());
				
			drive.findElement(By.id("cylindercapacity")).sendKeys("250"); 
			 Assert.assertEquals("250", drive.findElement(By.id("cylindercapacity")).getAttribute("value"));	
	
			drive.findElement(By.id("engineperformance")).sendKeys("350"); 
			 Assert.assertEquals("350", drive.findElement(By.id("engineperformance")).getAttribute("value"));
			
			drive.findElement(By.id("dateofmanufacture")).sendKeys("01/10/2022"); 
			 Assert.assertEquals("01/10/2022", drive.findElement(By.id("dateofmanufacture")).getAttribute("value"));
			
			WebElement element3 = drive.findElement(By.id("numberofseats"));
			 Select combo3 = new Select(element3);
			 combo3.selectByIndex(2);
			 Assert.assertEquals("2", combo3.getFirstSelectedOption().getText());
	
			drive.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]")).click();
	 																
			WebElement element4 = drive.findElement(By.id("numberofseatsmotorcycle"));
			 Select combo4 = new Select(element4);
			 combo4.selectByIndex(2);
			 Assert.assertEquals("2", combo4.getFirstSelectedOption().getText());	
			
			WebElement element5 = drive.findElement(By.id("fuel"));
			 Select combo5 = new Select(element5);
			 combo5.selectByIndex(3);
			 Assert.assertEquals("Electric Power", combo5.getFirstSelectedOption().getText());
			
			drive.findElement(By.id("payload")).sendKeys("130"); 
			 Assert.assertEquals("130", drive.findElement(By.id("payload")).getAttribute("value"));
			
			drive.findElement(By.id("totalweight")).sendKeys("180"); 
			 Assert.assertEquals("180", drive.findElement(By.id("totalweight")).getAttribute("value"));

			drive.findElement(By.id("listprice")).sendKeys("60000"); 
			 Assert.assertEquals("60000", drive.findElement(By.id("listprice")).getAttribute("value"));
			
			drive.findElement(By.id("licenseplatenumber")).sendKeys("20230000"); 
			 Assert.assertEquals("20230000", drive.findElement(By.id("licenseplatenumber")).getAttribute("value"));
			
			drive.findElement(By.id("annualmileage")).sendKeys("12000"); 
			 Assert.assertEquals("12000", drive.findElement(By.id("annualmileage")).getAttribute("value"));			
	
			drive.findElement(By.id("nextenterinsurantdata")).click(); 	//Botão Next			
			
		
			/********** Preencher/Validar os campos da aba 2 **********/
				
			drive.findElement(By.id("firstname")).sendKeys("Luiz"); 
			 Assert.assertEquals("Luiz", drive.findElement(By.id("firstname")).getAttribute("value"));		
			
			drive.findElement(By.id("lastname")).sendKeys("Filho"); 
			 Assert.assertEquals("Filho", drive.findElement(By.id("lastname")).getAttribute("value"));	
			
			drive.findElement(By.id("birthdate")).sendKeys("06/03/1994"); 
			 Assert.assertEquals("06/03/1994", drive.findElement(By.id("birthdate")).getAttribute("value"));	
			
			drive.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]")).click();			
			
			drive.findElement(By.id("streetaddress")).sendKeys("Rua Catulo da Paixão Cearense"); 
			 Assert.assertEquals("Rua Catulo da Paixão Cearense", drive.findElement(By.id("streetaddress")).getAttribute("value"));			
			
			WebElement element6 = drive.findElement(By.id("country"));
			 Select combo6 = new Select(element6);
			 combo6.selectByIndex(31);
			 Assert.assertEquals("Brazil", combo6.getFirstSelectedOption().getText());	
			
			drive.findElement(By.id("zipcode")).sendKeys("53050090"); 
			 Assert.assertEquals("53050090", drive.findElement(By.id("zipcode")).getAttribute("value"));
		
			drive.findElement(By.id("city")).sendKeys("Olinda"); 
			 Assert.assertEquals("Olinda", drive.findElement(By.id("city")).getAttribute("value"));
			
			WebElement element7 = drive.findElement(By.id("occupation"));
			 Select combo7 = new Select(element7);
			 combo7.selectByIndex(1);
			 Assert.assertEquals("Employee", combo7.getFirstSelectedOption().getText());	
			
			drive.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]")).click();			

			drive.findElement(By.id("website")).sendKeys("www.luizchaves.com.br"); 
			 Assert.assertEquals("www.luizchaves.com.br", drive.findElement(By.id("website")).getAttribute("value"));				
			
			drive.findElement(By.id("nextenterproductdata")).click(); //Botão Next
				
								
			/********** Preencher/Validar os campos da aba 3 **********/

			drive.findElement(By.id("startdate")).sendKeys("01/01/2024"); 
			 Assert.assertEquals("01/01/2024", drive.findElement(By.id("startdate")).getAttribute("value"));		
	
			WebElement element8 = drive.findElement(By.id("insurancesum"));
			 Select combo8 = new Select(element8);
			 combo8.selectByIndex(5);
			 Assert.assertEquals("15.000.000,00", combo8.getFirstSelectedOption().getText());
			
			WebElement element9 = drive.findElement(By.id("meritrating"));
			 Select combo9 = new Select(element9);
			 combo9.selectByIndex(5);
			 Assert.assertEquals("Bonus 4", combo9.getFirstSelectedOption().getText());
			
			WebElement element10 = drive.findElement(By.id("damageinsurance"));
			 Select combo10 = new Select(element10);
			 combo10.selectByIndex(3);
			 Assert.assertEquals("Full Coverage", combo10.getFirstSelectedOption().getText());
	
			drive.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]")).click();
			
			WebElement element11 = drive.findElement(By.id("courtesycar"));
			 Select combo11 = new Select(element11);
			 combo11.selectByIndex(2);
			 Assert.assertEquals("Yes", combo11.getFirstSelectedOption().getText());		
			
			drive.findElement(By.id("nextselectpriceoption")).click(); //Botão Next
							
			
			/********** Preencher/Validar os campos da aba 4 **********/
			
			drive.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]")).click();	
							
			drive.findElement(By.id("nextsendquote")).click(); ////Botão Next
							
				
			/********** Preencher/Validar os campos da aba 5 **********/
		
			drive.findElement(By.id("email")).sendKeys("luizchaves@gmail.com"); 
			 Assert.assertEquals("luizchaves@gmail.com", drive.findElement(By.id("email")).getAttribute("value"));
			
			drive.findElement(By.id("phone")).sendKeys("81989774554"); 
			 Assert.assertEquals("81989774554", drive.findElement(By.id("phone")).getAttribute("value"));
			
			drive.findElement(By.id("username")).sendKeys("lchaves"); 
			 Assert.assertEquals("lchaves", drive.findElement(By.id("username")).getAttribute("value"));
			
			drive.findElement(By.id("password")).sendKeys("Luiz$040"); 
			 Assert.assertEquals("Luiz$040", drive.findElement(By.id("password")).getAttribute("value"));
			
			drive.findElement(By.id("confirmpassword")).sendKeys("Luiz$040"); 
			 Assert.assertEquals("Luiz$040", drive.findElement(By.id("confirmpassword")).getAttribute("value")); 
			
			drive.findElement(By.id("Comments")).sendKeys("Automação de teste finalizada com sucesso!!!!"); 
			 Assert.assertEquals("Automação de teste finalizada com sucesso!!!!", drive.findElement(By.id("Comments")).getAttribute("value"));
											
			drive.findElement(By.id("sendemail")).click(); //Botão Send
			
		}	
		
}