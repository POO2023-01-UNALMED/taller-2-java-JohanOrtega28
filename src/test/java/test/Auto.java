package test;

public class Auto {
	    String modelo;
	    Integer precio;
	    Asiento asientos[];
	    String marca;
	    Motor motor;
	    Integer registro;
	    public Integer cantidadCreados;
	    
	    public int cantidadAsientos() {
	    	    Integer contador = 0;
	    	    for (int i = 0; i < asientos.length; i++) {
	    	    	    if (asientos[i] != null) {
	    	    	    	    contador++;
	    	    	    }
	    	    }
	            return contador;
	    }

	    public String verificarIntegridad() {
	    	   for (int i = 0; i < asientos.length; i++) {
	    		        if (asientos[i] == null) {
	    		        	    continue;
	    		        }
	    	            if (motor.registro != registro || registro != asientos[i].registro) {
	                            return "Las piezas no son originales";
	    	            }
	    	   }
	    	   return "Auto original";
	    }
}