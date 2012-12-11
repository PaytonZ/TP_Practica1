package persona;

import interfaceMain.InterfaceEjecuta;

public class Persona implements InterfaceEjecuta {
	protected float peso;
	protected float altura;

	public void persona() {

	}

	/**
	 * asigna el peso
	 * 
	 * @param miPeso
	 */
	public void setPeso(float miPeso) {
		peso = miPeso;
	}

	/**
	 * devuelve el peso
	 * 
	 * @return
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * asigna la altura
	 * 
	 * @param miAltura
	 */
	public void setAltura(float miAltura) {
		altura = miAltura;
	}

	/**
	 * devuelve la altura
	 * 
	 * @return
	 */
	public float getAltura() {
		return altura;
	}

	@Override
	public void ejecuta() {
	

	}

}