package operaciones;

/** Se van a implementar cuatro maneras de multiplicar para realizar operaciones num�ricas b�sicas 
 * con las funciones:
 * 
 * <p>-Producto de dos n�meros reales.
 * <p>-Producto de dos n�meros enteros.
 * <p>-Producto de tres n�meros reales.
 * <p>-Potencia.
 *  
 * @author Angel Sanchez-Sierra Cruz
 * @since 09/02/2021
 *
 */
public class Producto {
	/**
	 * @param producto_dos_reales Tendra un valor real, como resultado que nos devolver� la 
	 * funci�n producto_realesdos()
	 */
	double producto_dos_reales;
	
	/**@param producto_dos_enteros Tendra un valor entero, como resultado que nos devolver� la 
	 * funci�n producto_enterosdos()
	 */
	int producto_dos_enteros;
	
	/**@param producto_tres_reales Tendra un valor real, como resultado que nos devolver� la 
	 * funci�n producto_realestres()
	 */
	double producto_tres_reales;
	
	/**@param valorPotencia Tendra un valor real, como resultado que nos devolver� la 
	 * funcion producto_potencia()
	 */
	double producto_potencia;
	
	/**Constructor por defecto de la clase Producto <p>
	 * Inicia el objeto Producto reci�n creado sin el paso de ning�n par�metro.
	 * 
	 */
	public Producto(){
		
	}//Cierre constructor
	
	 /**

     * Multiplica dos n�meros reales, tendr� dos par�metros de entrada y uno de salida que ser� la soluci�n. <p>
     *        NOTA:<p> valor n1 * n2
     * 
     * @return Valor real que nos devuelve la funci�n o m�todo (producto)
     * @param n1Real Primer valor numerico entero que sera el multiplicando 
     * @param n2Real Segundo valor numerico real que ser� el multiplicador
     * @throws Exception -Numero mayor de 64 bits en n1Real,n2Real o producto_dos_reales
     * Introducir letras en vez de n�meros
     * 
     *{@link Exception#getMessage()}

     */
	public double producto_dos_reales(double n1Real, double n2Real) throws Exception {
		
		producto_dos_reales=n1Real*n2Real;
		
		return producto_dos_reales;
	}//Cierre funci�n producto_dos_reales

	/**

     * Multiplica dos n�meros enteros, tendr� dos par�metros de entrada y uno de salida que ser� la soluci�n. <p>
     * 
     	          NOTA: valor n1 * n2<p>
     	
     * @return Valor real que nos devuelve la funci�n o m�todo (producto)
     * @param n1Real Primer numero entero que ser� el multiplicando 
     * @param n2Real Segundo numero entero que ser� el multiplicador
		@throws Exception -Numero mayor de 32 bits en n1Entero,n2Real o producto_dos_enteros
		Introducir letras en vez de n�meros. Introducir numero real en numero entero.
		{@link Exception#getMessage()}
     */
	public int producto_dos_enteros(int n1Entero, int n2Entero)throws Exception {
		
		producto_dos_enteros=n1Entero*n2Entero;
		
		return producto_dos_enteros;
	}//Cierre funcion producto_dos_enteros
	
	/**

     *  Multiplica tres n�meros reales, tendr� tres par�metros de entrada y uno de salida que ser� la soluci�n. <p>
     	 NOTA:<p>valor n1 * n2 * n3. 
     	 	
     * @return Valor real que nos devuelve la funci�n o m�todo (producto)
     * @param n1Real Primer numero real que ser� el multiplicando en la primera operaci�n que hace la funci�n
     * @param n2Real Segundo numero real que ser� el multiplicador en la primera operacion que hace la funci�n
     * @param n3Real Tercer numero real  que sera el multiplicador del resultado del producto entre n1Real y n2Real
		
		@throws Exception -Numero mayor de 64 bits en n1Real,n2Real,n3Real o producto_tres_reales
		{@link Exception#getMessage()}
     */

	public double producto_tres_reales(double n1Real,double n2Real,double n3Real)throws Exception {
		
		producto_tres_reales=n1Real*n2Real*n3Real;
		
		return producto_tres_reales;
	}//Cierre funcion producto_Real3
	
	 /**

     * Devuelve el resultado de calcular la potencia de un numero REAL <p>
     * 
     * NOTA:<p>Se debe introducir el valor numerico al que le aplicamos la potencia y otro valor numerico que es la potencia 
     * NOTA:<p>valor potencia pot de n1 
     * 
     * @return Valor REAL que nos devuelve la funci�n o m�todo (potencia)
     * @param base Numero real sobre el cual se calculara su potencia.
     * @param exponente N�mero entero que significa el n�mero de veces que se multiplica la base.
     * @throws Exception Numero mayor de 64bits base o potenciaNumero. Numero mayor de 32 bits en exponente.
     * Introducir letras en vez de n�meros. Introducir numero real en numero entero.
     * 
     * {@link Exception#getMessage()}

     */

	public double producto_potencia(double base, int exponente) {
		producto_potencia=Math.pow(base, exponente);
		
		return producto_potencia;

	}//Cierre funci�n potencia_Numero
	
}//Cierre de la clase Producto
