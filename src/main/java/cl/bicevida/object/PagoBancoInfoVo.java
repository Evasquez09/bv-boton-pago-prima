package cl.bicevida.object;

import java.io.Serializable;

public class PagoBancoInfoVo implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1945481403101588889L;
	
	private String xmlBancoDataPago;
    private String xmlUrlRedirect;
    private String xmlUrlParametroRedirect;
    private String idTransaccionBanco;    
    private String bancoNombre;    
    private String htmlHiddenPago;
    
    private DataBanco[] newHiddenParam;
	
    public PagoBancoInfoVo() {
		// TODO Auto-generated constructor stub
	}

	public String getXmlBancoDataPago() {
		return xmlBancoDataPago;
	}

	public void setXmlBancoDataPago(String xmlBancoDataPago) {
		this.xmlBancoDataPago = xmlBancoDataPago;
	}

	public String getXmlUrlRedirect() {
		return xmlUrlRedirect;
	}

	public void setXmlUrlRedirect(String xmlUrlRedirect) {
		this.xmlUrlRedirect = xmlUrlRedirect;
	}

	public String getXmlUrlParametroRedirect() {
		return xmlUrlParametroRedirect;
	}

	public void setXmlUrlParametroRedirect(String xmlUrlParametroRedirect) {
		this.xmlUrlParametroRedirect = xmlUrlParametroRedirect;
	}

	public String getIdTransaccionBanco() {
		return idTransaccionBanco;
	}

	public void setIdTransaccionBanco(String idTransaccionBanco) {
		this.idTransaccionBanco = idTransaccionBanco;
	}

	public String getBancoNombre() {
		return bancoNombre;
	}

	public void setBancoNombre(String bancoNombre) {
		this.bancoNombre = bancoNombre;
	}

	public String getHtmlHiddenPago() {
		return htmlHiddenPago;
	}

	public void setHtmlHiddenPago(String htmlHiddenPago) {
		this.htmlHiddenPago = htmlHiddenPago;
	}

	public DataBanco[] getNewHiddenParam() {
		return newHiddenParam;
	}

	public void setNewHiddenParam(DataBanco[] newHiddenParam) {
		this.newHiddenParam = newHiddenParam;
	}
    
}
