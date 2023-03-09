package cuentas;

    /**
     * Clase CCuenta para gestionar cuenta bancaria
     * 
     * @author Ivan_G
     * @version 1.0
     * @since 06/03/2022
     * 
     */
public class CCuenta {
	
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Constructor sin parametros    
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructo parametrizado:
     * @param nom, nombre titular cuenta
     * @param cue, numero cuenta
     * @param sal, saldo cuenta
     * @param tipo, tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }
    
    /**
     * METODO ESTADO CUENTA
     * @return saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * METODO INGRESAR
     * @param cantidad que se desea ingresar
     * @throws Exception si se ingresa cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * METODO RETIRAR
     * @param cantidad que se desea retirar
     * @throws Exception  si la cantidad es negativa o = a '0', o cantidad retirada > al saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * GETTER
     * @return nombre del titular
     */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * SETTER
	 * @param nombre del titular que se desea pasar al parametro 'nombre'
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * GETTER
	 * @return id cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * SETTER
	 * @param cuenta, id cuenta que se desea pasar al parametro 'cuenta'
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * GETTER
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * SETTER
	 * @param saldo que se desea pasar al parametro 'saldo'
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * GETTER
	 * @return tipo de interes
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * SETTER
	 * @param tipoInteres que se desea pasar al parametro 'tipoInteres'
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
