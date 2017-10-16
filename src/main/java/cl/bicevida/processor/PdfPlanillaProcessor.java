package cl.bicevida.processor;



import java.io.IOException;

import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.view.planillacaja.ws.GetUrlPDFResponse;
import cl.bicevida.util.CreateCxfClient;
import cl.bicevida.util.GetProperties;
import cl.bicevida.view.planillacaja.ws.PlanillaCajaWS;

public class PdfPlanillaProcessor implements Processor{

	Logger logger = LoggerFactory.getLogger(PdfPlanillaProcessor.class);
	
	public PdfPlanillaProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Exchange ex) throws Exception {
		try {
			if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.endpoint.planilla}}");
				
				String rut = ex.getIn().getHeader("rut",String.class);
				logger.info("rutCliente: " + rut);
				
				GetUrlPDFResponse outD = new GetUrlPDFResponse();

				PlanillaCajaWS cliente = createCXFClient(url);
				outD.setReturn((cliente.getUrlPDF(rut)));
				ex.getOut().setBody(outD);
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
	}
	public static PlanillaCajaWS createCXFClient(String url) throws IOException{
		
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PlanillaCajaWS.class);
		factory.setAddress(url);
		return (PlanillaCajaWS)factory.create();		
	}

}
