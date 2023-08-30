package lightsout;
import java.util.Random;

public class JuegoModel {
	
	private boolean matriz[][];
	private int tamanioMatriz;
	
	public JuegoModel(int tamanioMatriz) {
		this.tamanioMatriz = tamanioMatriz;
		this.matriz = new boolean[tamanioMatriz][tamanioMatriz];
	}
	
	public boolean[][] randomizarMatriz() {
		Random random = new Random();
		for(int fila = 0; fila < this.tamanioMatriz; fila++){
	        for(int columna = 0; columna < this.tamanioMatriz; columna++){
	        	this.matriz[fila][columna] = random.nextBoolean();
	        }
	    }
		return matriz;
	}
	
	public void switchEstadoColumna(int indFila, int indColumna) {
		for(int fila = 0; fila < this.tamanioMatriz; fila++){
			if(fila != indFila) {
				this.matriz[fila][indColumna] = !this.matriz[fila][indColumna];
			}
		}
	}
	
	public void switchEstadoFila(int indFila, int indColumna) { //recorre la fila y le delega el cambio de estado al model y el cambio de color se hace en esta clase.
		for(int columna = 0; columna < this.tamanioMatriz; columna++){ //esto es logica de negocio?? como hago esto sin pasarle la matriz al model?
																			//estaría bien que el modelo conozca la matriz y haga esto?
			if(columna != indColumna) {
				this.matriz[indFila][columna] = !this.matriz[indFila][columna];
			}
			
		}
	}
	
	public void switchEstadoBoton(int indFila, int indColumna) {
		this.matriz[indFila][indColumna] = !this.matriz[indFila][indColumna];
	}
	
	public boolean gano() {
		boolean todosApagados = true;
		for(int fila = 0; fila < this.tamanioMatriz; fila++){
	        for(int columna = 0; columna < this.tamanioMatriz; columna++){
	        	todosApagados = todosApagados && !this.matriz[fila][columna];
	        }
	    }
		
		return todosApagados;
	}

	public boolean[][] getMatriz() {
		return this.matriz;
	}
}
