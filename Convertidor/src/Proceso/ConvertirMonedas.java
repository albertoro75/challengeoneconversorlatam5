package Proceso;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ColonesADolares(double valor) {
		double monedaDolar = valor / 520.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + "Dolares");
	}

}

/*proceso
  
 Convertir de y viceversa
 
	- 	Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano 
      - Convertir de grados celsious a farenheit
      - de centimetros a pulgadas
  
  crear lo cuadros correspondientes de 3 opciones
  
  Crear el repositorio de tu proyecto en GitHub
  Utilice la clase JOptionPane de la biblioteca Javax;
	Utilice el método showInputDialog como un objeto para presentar más de una opción;

Cuadro de diálogo - Menú Principal
Cuadro de diálogo - Entrada de valor
Cuadro de diálogo - Opciones de Monedas
Cuadro de diálogo - Valor de la conversión
Cuadro de diálogo - Manejo de errores
Cuadro de diálogo - ¿Desea continuar?
 */