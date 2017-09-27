package cl.bicevida.object;

import java.io.Serializable;

public class ResultadoConsultaVO implements Serializable{

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int resultado;
    private String mensajeResultado = "";
    private String numeroTransaccionBanco = "";
    private String numeroCuotasBanco = "";
    private String fechaBanco = "";
    private String horaBanco = "";
    private String numeroOrdenCompra = "";
    private String numeroTarjeta = "";
    private String codigoAutorizacion = "";    
    private String tipoCuotas = "";
    private String monedaPago = "";
    private String medioCodigoRespuesta = "";
    private int codigoEstadoTransaccion;
    private String CodigoEmpresa = "";
    private Integer CodigoMedioPago;
    private Long idEmpresa; 
    
	public ResultadoConsultaVO() {
		// TODO Auto-generated constructor stub
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getMensajeResultado() {
		return mensajeResultado;
	}

	public void setMensajeResultado(String mensajeResultado) {
		this.mensajeResultado = mensajeResultado;
	}

	public String getNumeroTransaccionBanco() {
		return numeroTransaccionBanco;
	}

	public void setNumeroTransaccionBanco(String numeroTransaccionBanco) {
		this.numeroTransaccionBanco = numeroTransaccionBanco;
	}

	public String getNumeroCuotasBanco() {
		return numeroCuotasBanco;
	}

	public void setNumeroCuotasBanco(String numeroCuotasBanco) {
		this.numeroCuotasBanco = numeroCuotasBanco;
	}

	public String getFechaBanco() {
		return fechaBanco;
	}

	public void setFechaBanco(String fechaBanco) {
		this.fechaBanco = fechaBanco;
	}

	public String getHoraBanco() {
		return horaBanco;
	}

	public void setHoraBanco(String horaBanco) {
		this.horaBanco = horaBanco;
	}

	public String getNumeroOrdenCompra() {
		return numeroOrdenCompra;
	}

	public void setNumeroOrdenCompra(String numeroOrdenCompra) {
		this.numeroOrdenCompra = numeroOrdenCompra;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCodigoAutorizacion() {
		return codigoAutorizacion;
	}

	public void setCodigoAutorizacion(String codigoAutorizacion) {
		this.codigoAutorizacion = codigoAutorizacion;
	}

	public String getTipoCuotas() {
		return tipoCuotas;
	}

	public void setTipoCuotas(String tipoCuotas) {
		this.tipoCuotas = tipoCuotas;
	}

	public String getMonedaPago() {
		return monedaPago;
	}

	public void setMonedaPago(String monedaPago) {
		this.monedaPago = monedaPago;
	}

	public String getMedioCodigoRespuesta() {
		return medioCodigoRespuesta;
	}

	public void setMedioCodigoRespuesta(String medioCodigoRespuesta) {
		this.medioCodigoRespuesta = medioCodigoRespuesta;
	}

	public int getCodigoEstadoTransaccion() {
		return codigoEstadoTransaccion;
	}

	public void setCodigoEstadoTransaccion(int codigoEstadoTransaccion) {
		this.codigoEstadoTransaccion = codigoEstadoTransaccion;
	}

	public String getCodigoEmpresa() {
		return CodigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		CodigoEmpresa = codigoEmpresa;
	}

	public Integer getCodigoMedioPago() {
		return CodigoMedioPago;
	}

	public void setCodigoMedioPago(Integer codigoMedioPago) {
		CodigoMedioPago = codigoMedioPago;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	

}
