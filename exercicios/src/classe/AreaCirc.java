package classe;

public class AreaCirc {
	
	double raio;
	static double pi;
	
	AreaCirc(double raioInicial){
		pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}

}
