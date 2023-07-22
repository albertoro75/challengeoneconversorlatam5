package Proceso;

import javax.swing.JOptionPane;

public class ConvertirAColones {
		public void DolaresAColones(double valor) {
		double monedaDolar = valor * 520.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ "  Colones");
	}
}


/*proceso

Convertir viceversa

	- 	Convertir de la moneda de tu país a Dólar
     - Convertir de la moneda de tu país  a Euros
     - Convertir de la moneda de tu país  a Libras Esterlinas
     - Convertir de la moneda de tu país  a Yen Japonés
     - Convertir de la moneda de tu país  a Won sul-coreano 
 
*/