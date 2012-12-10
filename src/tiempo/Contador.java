package tiempo;

import interfaceMain.InterfaceMain;

public class Contador implements InterfaceMain

{

	int unidad = 0;
	/**
	 * este metodo devuelve 1 si la unidad es igual al limite y 0 si no lo es
	 * @param limite que se quiere establecer
	 * @return 1 cuando se alcanza el limite
	 */
	public int pasoUnidad (int limite)
	{
		int carry = 0;
		if(unidad == limite)
		{
			unidad = 0;
			carry = 1;
		}
		else
		{
			carry = 0;
		}
		return carry ;
	}
	/**
	 * Este metodo incrementa la variable unidad + el parametro que se le introduzca
	 * @param miunidad
	 */
	public void incremento(int miunidad)
	{
		unidad = unidad + miunidad;
	}
    /**
     * Este metodo devuelve el valor de la unidad
     * @return unidad
     */
	public int getUnidad()
	{
		return unidad;
	}
	@Override
	public void ejecuta() {
		// TODO Auto-generated method stub
		
	}
	
}