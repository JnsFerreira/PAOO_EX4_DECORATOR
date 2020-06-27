package design_pattern_decorator_exercicios;
import java.util.Random;

public class Execution {

	public static void main(String[] args) 
	{
		
		GeomectricFigure Figura;
		
		int selecionaFigura = new Random().nextInt(3);
		int selecionaQttDecorator = new Random().nextInt(3);
		if(selecionaFigura == 0)
		{
			Figura = new SquareFigure();
		}
		else if(selecionaFigura == 1)
		{
			Figura = new RectangleFigure();
		}
		else
		{
			Figura = new CircleFigure();
		}
		
				
		if(selecionaQttDecorator == 0)
		{
			System.out.println(Figura.getFigureName() + " - Figura desenhada sem cores");
		}
		
		if(selecionaQttDecorator == 1)
		{
			switch(new Random().nextInt(2))
			{
				case 0:
					new CorDaLinhaDecorator(Figura);
					System.out.println(Figura.getFigureName() + " - Cor da Linha: " + Figura.getCorLinha() + " - Sem Cor Interna" );
					break;
				case 1:
					new CorDePreenchimentoDecorator(Figura);
					System.out.println(Figura.getFigureName() + " -  Sem Cor da Linha" +  " - Cor Interna: "  + Figura.getCorInterna());
					break;
			}
		}
		else if(selecionaQttDecorator == 2)
		{
			new CorDaLinhaDecorator(Figura);
			new CorDePreenchimentoDecorator(Figura);
			
			System.out.println(Figura.getFigureName() + " - Cor da Linha: " + Figura.getCorLinha() +  " - Cor Interna: "  + Figura.getCorInterna());
		}
		
		
	}
		

}
