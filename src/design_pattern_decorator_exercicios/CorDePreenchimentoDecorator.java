package design_pattern_decorator_exercicios;

import java.util.Random;

public class CorDePreenchimentoDecorator {
	
	private GeomectricFigure Figura;

	public CorDePreenchimentoDecorator(GeomectricFigure figura)
	{
		Figura = figura;
		Cor();
	}
	
	public void Cor()
	{
		String[] cores = new String[]{"azul","prata","preto","amarelo"};
		Figura.setCorInterna(cores[new Random().nextInt(cores.length)]);
	
	}	
}
