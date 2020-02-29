package br.com.zg.maratona.glosa.BuscarArquivo;

import br.com.zg.maratona.glosa.AbrirURL.AbrirConvenio;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class acoes {

    private static String NAVEGADOR = "chrome";

    private WebDriver driverWeb = AbrirConvenio.getURL(NAVEGADOR);

    public void esperar(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicar(By by) {
        driverWeb.findElement(by).click();
    }
}
