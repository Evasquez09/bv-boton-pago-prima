package cl.bicevida.object;

import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

public class PagoPublicoVO implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idTransaccion;
    private int idNavegacion;
    private Date fechaTransaccion;
    private String xmloriginal;
    private String xmlpagopublico;
    private String xmlconfirmacion;
    private String xmlconfirmacionDataBancos;
    private PagoBancoInfoVo banco = new PagoBancoInfoVo();
    private Date   ultimoVencimientoDeuda;
    private String estadoDeuda = "";//"AL DIA";
    private Double totalPagar;
    private Double valorUF;
    private PagoDatosClienteVO datosCliente;
    private List cuotas;
    private Hashtable hashcuotas = new Hashtable();
    private int idBancoPago;
    private String urlPdfDownload;
    private String urlPdfEnEsperaDownload;
    private String absoluteServerPathPdfDownload;
    private String absoluteServerPathPdfEnEsperaDownload;    
    private String formaPago;
    private String pdfUrlVolantes = null;
    private ResultadoConsultaVO resultadoPagoBanco;
    private int tipoTransaccion;

    private boolean estado;
    private String mensajeRespuesta;
    private Integer codRespuesta;
    private String fechaAccesoUsuario;
    private int medioPago;
    private List<OutDatosPdf> pdfPolizas;
    private OutDatosPdf pdfConsolidado;
    private String sessionID;
    private String tbkURLExitoError;//para el medio de pago 4,9,10 (webpay,BCI)
    private String urlcgi;
    private Integer bancoId;
    private String methodSend;
    private String accion;
    
    
	public PagoPublicoVO() {
		// TODO Auto-generated constructor stub
	}


	public int getIdTransaccion() {
		return idTransaccion;
	}


	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}


	public int getIdNavegacion() {
		return idNavegacion;
	}


	public void setIdNavegacion(int idNavegacion) {
		this.idNavegacion = idNavegacion;
	}


	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}


	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}


	public String getXmloriginal() {
		return xmloriginal;
	}


	public void setXmloriginal(String xmloriginal) {
		this.xmloriginal = xmloriginal;
	}


	public String getXmlpagopublico() {
		return xmlpagopublico;
	}


	public void setXmlpagopublico(String xmlpagopublico) {
		this.xmlpagopublico = xmlpagopublico;
	}


	public String getXmlconfirmacion() {
		return xmlconfirmacion;
	}


	public void setXmlconfirmacion(String xmlconfirmacion) {
		this.xmlconfirmacion = xmlconfirmacion;
	}


	public String getXmlconfirmacionDataBancos() {
		return xmlconfirmacionDataBancos;
	}


	public void setXmlconfirmacionDataBancos(String xmlconfirmacionDataBancos) {
		this.xmlconfirmacionDataBancos = xmlconfirmacionDataBancos;
	}


	public PagoBancoInfoVo getBanco() {
		return banco;
	}


	public void setBanco(PagoBancoInfoVo banco) {
		this.banco = banco;
	}


	public Date getUltimoVencimientoDeuda() {
		return ultimoVencimientoDeuda;
	}


	public void setUltimoVencimientoDeuda(Date ultimoVencimientoDeuda) {
		this.ultimoVencimientoDeuda = ultimoVencimientoDeuda;
	}


	public String getEstadoDeuda() {
		return estadoDeuda;
	}


	public void setEstadoDeuda(String estadoDeuda) {
		this.estadoDeuda = estadoDeuda;
	}


	public Double getTotalPagar() {
		return totalPagar;
	}


	public void setTotalPagar(Double totalPagar) {
		this.totalPagar = totalPagar;
	}


	public Double getValorUF() {
		return valorUF;
	}


	public void setValorUF(Double valorUF) {
		this.valorUF = valorUF;
	}


	public PagoDatosClienteVO getDatosCliente() {
		return datosCliente;
	}


	public void setDatosCliente(PagoDatosClienteVO datosCliente) {
		this.datosCliente = datosCliente;
	}


	public List getCuotas() {
		return cuotas;
	}


	public void setCuotas(List cuotas) {
		this.cuotas = cuotas;
	}


	public Hashtable getHashcuotas() {
		return hashcuotas;
	}


	public void setHashcuotas(Hashtable hashcuotas) {
		this.hashcuotas = hashcuotas;
	}


	public int getIdBancoPago() {
		return idBancoPago;
	}


	public void setIdBancoPago(int idBancoPago) {
		this.idBancoPago = idBancoPago;
	}


	public String getUrlPdfDownload() {
		return urlPdfDownload;
	}


	public void setUrlPdfDownload(String urlPdfDownload) {
		this.urlPdfDownload = urlPdfDownload;
	}


	public String getUrlPdfEnEsperaDownload() {
		return urlPdfEnEsperaDownload;
	}


	public void setUrlPdfEnEsperaDownload(String urlPdfEnEsperaDownload) {
		this.urlPdfEnEsperaDownload = urlPdfEnEsperaDownload;
	}


	public String getAbsoluteServerPathPdfDownload() {
		return absoluteServerPathPdfDownload;
	}


	public void setAbsoluteServerPathPdfDownload(String absoluteServerPathPdfDownload) {
		this.absoluteServerPathPdfDownload = absoluteServerPathPdfDownload;
	}


	public String getAbsoluteServerPathPdfEnEsperaDownload() {
		return absoluteServerPathPdfEnEsperaDownload;
	}


	public void setAbsoluteServerPathPdfEnEsperaDownload(String absoluteServerPathPdfEnEsperaDownload) {
		this.absoluteServerPathPdfEnEsperaDownload = absoluteServerPathPdfEnEsperaDownload;
	}


	public String getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	public String getPdfUrlVolantes() {
		return pdfUrlVolantes;
	}


	public void setPdfUrlVolantes(String pdfUrlVolantes) {
		this.pdfUrlVolantes = pdfUrlVolantes;
	}


	public ResultadoConsultaVO getResultadoPagoBanco() {
		return resultadoPagoBanco;
	}


	public void setResultadoPagoBanco(ResultadoConsultaVO resultadoPagoBanco) {
		this.resultadoPagoBanco = resultadoPagoBanco;
	}


	public int getTipoTransaccion() {
		return tipoTransaccion;
	}


	public void setTipoTransaccion(int tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}


	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}


	public Integer getCodRespuesta() {
		return codRespuesta;
	}


	public void setCodRespuesta(Integer codRespuesta) {
		this.codRespuesta = codRespuesta;
	}


	public String getFechaAccesoUsuario() {
		return fechaAccesoUsuario;
	}


	public void setFechaAccesoUsuario(String fechaAccesoUsuario) {
		this.fechaAccesoUsuario = fechaAccesoUsuario;
	}


	public int getMedioPago() {
		return medioPago;
	}


	public void setMedioPago(int medioPago) {
		this.medioPago = medioPago;
	}


	public List<OutDatosPdf> getPdfPolizas() {
		return pdfPolizas;
	}


	public void setPdfPolizas(List<OutDatosPdf> pdfPolizas) {
		this.pdfPolizas = pdfPolizas;
	}


	public OutDatosPdf getPdfConsolidado() {
		return pdfConsolidado;
	}


	public void setPdfConsolidado(OutDatosPdf pdfConsolidado) {
		this.pdfConsolidado = pdfConsolidado;
	}


	public String getSessionID() {
		return sessionID;
	}


	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}


	public String getTbkURLExitoError() {
		return tbkURLExitoError;
	}


	public void setTbkURLExitoError(String tbkURLExitoError) {
		this.tbkURLExitoError = tbkURLExitoError;
	}


	public String getUrlcgi() {
		return urlcgi;
	}


	public void setUrlcgi(String urlcgi) {
		this.urlcgi = urlcgi;
	}


	public Integer getBancoId() {
		return bancoId;
	}


	public void setBancoId(Integer bancoId) {
		this.bancoId = bancoId;
	}


	public String getMethodSend() {
		return methodSend;
	}


	public void setMethodSend(String methodSend) {
		this.methodSend = methodSend;
	}


	public String getAccion() {
		return accion;
	}


	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	

}
