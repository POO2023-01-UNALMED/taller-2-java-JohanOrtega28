package test;
public class Motor {
	   Integer numeroCilindros;
	   String tipo;
	   Integer registro;
	   
	   public void cambiarRegistro(Integer registro) {
		       this.registro = registro;
	   }
	   
	   public void asignarTipo(String tipo) {
		       if (tipo=="gasolina" || tipo=="electrico") {
		    	       this.tipo = tipo;
		       }
	   }

}
