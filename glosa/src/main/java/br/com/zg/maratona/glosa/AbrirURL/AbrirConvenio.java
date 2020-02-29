package br.com.zg.maratona.glosa.AbrirURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AbrirConvenio {

    private static WebDriver driverWeb;
    public static ChromeOptions chromeOptions = new ChromeOptions();

    public static WebDriver getURL(String navegador) {

        if (driverWeb == null){
            CreateDriverWebChrome();
        }
        return driverWeb;
    }

    public static void CreateDriverWebChrome() {
        File arquivo = new File("src\\main\\driverNavegador\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", arquivo.getAbsolutePath());
        //chromeOptions.addArguments("--headless");//rodar sem abrir navegador
        //driverWeb = new ChromeDriver(chromeOptions);
        driverWeb = new ChromeDriver();
        buscarURL();
    }

    public static void buscarURL(){
        driverWeb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverWeb.get("https://glosamax.zeroglosa.com.br/glosamax/arquivo/index");
        driverWeb.manage().window().maximize();
    }

    public void fecharNavegador() {
        driverWeb.quit();
    }
}
