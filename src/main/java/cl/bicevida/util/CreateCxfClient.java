package cl.bicevida.util;

import java.io.IOException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cl.bicevida.view.planillacaja.ws.PlanillaCajaWS;


public class CreateCxfClient {
	

	public static PlanillaCajaWS createCXFClient(String url) throws IOException{
		
//		obtengo el endpoint correspondiente al servicio del sam desde el archivo properties
		String url2 = GetProperties.obtieneValorProperties("url.endpoint.planilla");	
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PlanillaCajaWS.class);
		factory.setAddress(url2);
		return (PlanillaCajaWS)factory.create();		
	} 
	

}
