import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClassMainPage {

    @Before
    public void setUp() {
        Configuration.setUp(); //открытие драйвера с помощью файла конфигурации
    }

    @Test
    public void TEStCheckButtonStartReading() {


    }
    public void TEStStateButtonStartReading() {


    }

    public void TEStStateButtonGetStarted() {


    }
    public void TEStMenuCustomization() {


    }

    public void TEStGoToANewPageMedium() {


    }

    public void TEStDescriptionWindowCommentator(){

    }
    public void TEStAddToBookmarks(){

    }
    public void TEStCheckAnimation(){

    }
    @After
    public static void tearDown() {
        Configuration.tearDown();
    }     //выключить драйвер с помощю файла конфигурации
}
