package convertidorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ColonesADolares(double valor) {
		double monedaDolar = valor / 536.86;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "Dolares");
	}
	
	public void ColonesAEuros(double valor) {
		double monedaEuro = valor / 597.15;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + "Euros");
	}
	public void ColonesALibrasEsterlinas(double valor) {
		double monedaLibraEsterlina = valor / 696.39;
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraEsterlina + "LibrasEsterlinas");
	}
	
	public void ColonesAYenes(double valor) {
		double monedaYen = valor / 3.79;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + "Yenes");
	}
	
	public void ColonesAWon(double valor) {
		double monedaWon = valor / 0.42;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + "Wones");
	}
	

}

/*proceso
  
 Convertir
 
	- 	Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano
      
       
       
       
       
       
       
      - Convertir de grados celsious a farenheit
      - de centimetros a pulgadas
  
  crear lo cuadros correspondientes de 3 opciones
  
  
	Utilice el método showInputDialog como un objeto para presentar más de una opción;

Cuadro de diálogo - Menú Principal
Cuadro de diálogo - Entrada de valor
Cuadro de diálogo - Opciones de Monedas
Cuadro de diálogo - Valor de la conversión
Cuadro de diálogo - Manejo de errores
Cuadro de diálogo - ¿Desea continuar?
 */