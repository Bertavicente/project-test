import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MpesaTest {
    @Test
    public void testValorAbaixoDoMinimo() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/src/mpesa.php");
        driver.findElement(By.name("valor")).sendKeys("5"); // Teste com 5 MT
        driver.findElement(By.id("btn-levantar")).click();
        
        String mensagem = driver.findElement(By.id("resultado")).getText();
        assertEquals("Abaixo do mínimo", mensagem);
        driver.quit();
    }
}
