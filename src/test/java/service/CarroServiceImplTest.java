package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceImplTest {

    @Test
    public void deveAcelerarCorretamente() {
        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carroTeste01 = new Carro("Azul", "Fiat", "Uno", 2015, 150);
        carroService.ligar(carroTeste01);

        // When
        carroService.acelerar(carroTeste01, 10);

        // Then
        // Assertivas
        // O Junit busca por Asserts no método para validar que o teste passou
        Assert.assertTrue(carroTeste01.getVelocidadeAtual() == 10);
    }

    @Test
    public void deveLigarCorretamente() {
        CarroService carroService = new CarroServiceImpl();

        // Dado
        Carro carro =
                new Carro("vermelho", "marca", "modelo", 1990, 100);

        // Quando
        carroService.ligar(carro);

        // Então
        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void velocidadeNaoDeveSerMenorQueZero() {
        // O Junit busca por Assets no método para validar que o teste passou

        // Dado:
        CarroService carroService = new CarroServiceImpl();
        Carro celtinha = new Carro("Prata", "Chevrolet", "Celta", 2001, 50);
        carroService.ligar(celtinha); // velocidade zero

        // Quando:
        carroService.frear(celtinha, 10);

        // Então:
        Assert.assertTrue(celtinha.isLigado());
        Assert.assertEquals(0, celtinha.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamenteEAcelerarCorretamente() {
        // Dado:
        CarroService carroService = new CarroServiceImpl();
        Carro celtinha = new Carro("Prata", "Chevrolet", "Celta", 2001, 50);

        // Quando:
        carroService.ligar(celtinha);
        carroService.acelerar(celtinha, 10);

        // Então:
        Assert.assertTrue(celtinha.isLigado());
        Assert.assertEquals(10, celtinha.getVelocidadeAtual());
    }

}
