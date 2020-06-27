package design_pattern_decorator_exercicios;
import java.util.Random;

public class CorDaLinhaDecorator 
{
	private GeomectricFigure Figura;

	public CorDaLinhaDecorator(GeomectricFigure figura)
	{
		Figura = figura;
		Cor();
	}
	
	public void Cor()
	{
		String[] cores = new String[]{"Verde","vermelho","azul","roxo"};
		Figura.setCorLinha(cores[new Random().nextInt(cores.length)]);
		
	}	

}
