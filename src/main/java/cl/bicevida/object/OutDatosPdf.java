package cl.bicevida.object;

import java.io.Serializable;

public class OutDatosPdf implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 4354498455788548560L;
	private String poliza;
    private String url;
    
    
	public OutDatosPdf() {
		// TODO Auto-generated constructor stub
	}


	public String getPoliza() {
		return poliza;
	}


	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
