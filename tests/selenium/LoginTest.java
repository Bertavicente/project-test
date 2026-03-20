import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {
    @Test
    public void testEmailInvalido() {
        // Simula o teste 1 do UC01
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/src/login.php");
        driver.findElement(By.name("email")).sendKeys("email-errado");
        driver.findElement(By.name("senha")).sendKeys("12345678");
        driver.findElement(By.id("btn-login")).click();
        
        String mensagem = driver.findElement(By.id("erro")).getText();
        assertEquals("Email inválido", mensagem);
        driver.quit();
    }
}
