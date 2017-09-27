package cl.bicevida.processor;



import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.view.planillacaja.ws.GetUrlPDFResponse;
import cl.bicevida.util.CreateCxfClient;
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

				PlanillaCajaWS cliente = CreateCxfClient.createCXFClient(url);
				outD.setReturn((cliente.getUrlPDF(rut)));
				ex.getOut().setBody(outD);
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
	}

}
