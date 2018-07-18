package cz.bevas.experiments.webservices.endpoint;


import cz.bevas.experiments.webservices.model.UpdateCustomerRequest;
import cz.bevas.experiments.webservices.model.UpdateCustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CustomerEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(CustomerEndpoint.class);

    private static final String NAMESPACE_URI = "http://model.webservices.experiments.bevas.cz";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateCustomerRequest")
    @ResponsePayload
    public UpdateCustomerResponse updateCustomer(@RequestPayload UpdateCustomerRequest customer) {
        logger.info("Update customer: {}", customer);
        return new UpdateCustomerResponse();
    }

}
