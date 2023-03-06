package cuentas;

/**
 * 
 * @author Ivan_G
 * @version 1.0
 * @since 06/03/2022
 * 
 */
public class CCuenta {
	
/**
 * Atributos clase Ccuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Constructor sin parámetros    
 */
    public CCuenta()
    {
    }
/**
 * Constructor con parámetros:
 * @param nom, nombre titular cuenta
 * @param cue, número cuenta
 * @param sal, saldo cuenta
 * @param tipo, tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInterés;
	}
}
