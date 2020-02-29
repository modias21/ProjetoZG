package br.com.zg.maratona.glosa.BuscarArquivo;

import org.junit.Test;
import org.openqa.selenium.By;

public class RealizarDownload {

    private acoes acao = new acoes();

    @Test
    public void download(){
        for (int i=1; i<=218; i++)  {
            acao.clicar(By.xpath("//*[@id='list-arquivo']/div/a["+i+"]"));
            acao.clicar(By.xpath("//*[@id='list-arquivo']/div/ul/li/a"));
            acao.clicar(By.xpath("//*[@id=\"list-arquivo\"]/a"));

            acao.esperar(1000);
        }
    }
}
