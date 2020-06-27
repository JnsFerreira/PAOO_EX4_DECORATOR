package design_pattern_decorator_exercicios;

public abstract class GeomectricFigure {

	String FigureName;
	String CorInterna;
	String CorLinha;
	
	
	public GeomectricFigure() {
		// TODO Auto-generated constructor stub
		FigureName = "Geometric Figure";
	}
	
	public String getFigureName() {
		return FigureName;
	}

	public String getCorInterna() {
		return CorInterna;
	}

	public void setCorInterna(String corInterna) {
		CorInterna = corInterna;
	}

	public String getCorLinha() {
		return CorLinha;
	}

	public void setCorLinha(String corLinha) {
		CorLinha = corLinha;
	}


}


