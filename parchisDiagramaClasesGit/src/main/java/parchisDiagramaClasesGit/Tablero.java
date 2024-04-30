/**
 * 
 */
package parchisDiagramaClasesGit;

/**
 * 
 */
public class Tablero {

	private int numCasillas;
	
	private int[] casillas; //Cada casilla tiene asociado un numero (0: no ficha, 1: ficha jugador 1, 2: ficha jugador 2, 3: 2 fichas jugador 1, 4: 2 fichas jugador 2)
	
	/**
	 * 
	 */
	public Tablero() {
		
		numCasillas = 21; 
		
		casillas = new int [numCasillas];
		
		
	}
	
	/**
	 * @param numCasillas
	 */
	public Tablero(int numCasillas) {	
		
		this.numCasillas = numCasillas;
		
		casillas = new int[numCasillas+1];
		
		
	}
	
	public void cambiarFicha(int origen, int destino  , Ficha ficha) {
		
		// IMPLEMENTAR
		
	}
	
	public int consultarNumCasillas() {
		
		return numCasillas;
		
	}
	
	public int[] consultarCasillas() {
		
		return casillas;
		
	}

}
