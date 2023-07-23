package convertidorMonedas;

import javax.swing.JOptionPane;

public class ConvertirAColones {
	
	public void DolaresAColones(double valor) {
		double monedaColones = valor / 0.0018;
		monedaColones = (double) Math.round(monedaColones *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaColones + "Dolares");
	}
	
	public void EurosAColones(double valor) {
		double monedaColones = valor / 0.0016;
		monedaColones = (double) Math.round(monedaColones *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaColones + "Euros");
	}
	public void LibrasEsterlinasAColones(double valor) {
		double monedaColones = valor / 0.0014;
		monedaColones = (double) Math.round(monedaColones *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaColones + "LibrasEsterlinas");
	}
	
	public void YenesAColones(double valor) {
		double monedaColones = valor / 0.26;
		monedaColones = (double) Math.round(monedaColones *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaColones + "Yenes");
	}
	
	public void WonAColones(double valor) {
		double monedaColones = valor / 2.37;
		monedaColones = (double) Math.round(monedaColones *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaColones + "Wones");
	}

}

/*

Convertir al contrario

	- 	Convertir de Dólar a la moneda de tu país 
     - Convertir de Euros a la moneda de tu país 
     - Convertir de Libras Esterlinas a la moneda de tu país 
     - Convertir de Yen Japonés a la moneda de tu país 
     - Convertir de Won sur-coreano a la moneda de tu país 
 
*/