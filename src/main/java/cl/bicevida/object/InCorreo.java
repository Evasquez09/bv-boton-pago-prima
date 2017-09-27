package cl.bicevida.object;

import java.util.Hashtable;

public class InCorreo {

	
    private Hashtable hashcuotas;
    private String urlPdfDownload;
    private String nombreCliente;
    private java.util.Date fechaTransaccion;
    private String emailCustom;
	
	public InCorreo() {
		// TODO Auto-generated constructor stub
	}

	public Hashtable getHashcuotas() {
		return hashcuotas;
	}

	public void setHashcuotas(Hashtable hashcuotas) {
		this.hashcuotas = hashcuotas;
	}

	public String getUrlPdfDownload() {
		return urlPdfDownload;
	}

	public void setUrlPdfDownload(String urlPdfDownload) {
		this.urlPdfDownload = urlPdfDownload;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public java.util.Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(java.util.Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public String getEmailCustom() {
		return emailCustom;
	}

	public void setEmailCustom(String emailCustom) {
		this.emailCustom = emailCustom;
	}
	
	
}
