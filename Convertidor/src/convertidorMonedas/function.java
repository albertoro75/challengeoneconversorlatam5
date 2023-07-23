package convertidorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirAColones colones = new ConvertirAColones();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Colones a Dólar", "De Colones a Euro", "De Colones a Libras","De Colones a Yen","De Colones a Won Coreano","De Dólar a Colones", "De Euro a Colones", "De Libras a Colones","De Yen a Colones","De Won Coreano a Colones"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De colones a Dólar":
        	monedas.ColonesADolares(Minput);
        	break;
        case "De colones a Euro":
        	monedas.ColonesAEuros(Minput);
        	break;
        case "De colones a Libras":
        	monedas.ColonesALibrasEsterlinas(Minput);
        	break;
        case "De colones a Yen":
        	monedas.ColonesAYenes(Minput);
        	break;
        case "De colones a Won Coreano":
        	monedas.ColonesAWon(Minput);
        	break;    	    	                          
        case "De Dólar a colones":
        	colones.DolaresAColones(Minput);
        	break;
        case "De Euro a colones":
        	colones.EurosAColones(Minput);
        	break;
        case "De Libras a colones":
        	colones.LibrasEsterlinasAColones(Minput);
        	break;
        case "De Yenes a colones":
        	colones.YenesAColones(Minput);
        	break;
        case "De Won Coreano a Colones":
        	colones.WonAColones(Minput);
            break;
        }      
    }
        
}
