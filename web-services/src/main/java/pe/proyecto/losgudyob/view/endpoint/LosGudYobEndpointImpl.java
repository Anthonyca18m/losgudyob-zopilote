package pe.proyecto.losgudyob.view.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.proyecto.losgudyob.transactional.service.ClienteService;
import pe.proyecto.losgudyob.transactional.service.ServicioService;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelResponse;

@Component
public class LosGudYobEndpointImpl implements LosGudYobEndpoint {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ServicioService servicioService;

	@Override
	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request) {
		return clienteService.insertClient(request);
	}

	@Override
	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request) {
		return clienteService.updateClient(request);
	}

	@Override
	public ServicioRegistroModelResponse insertService(ServicioRegistroModelRequest request) {
		return servicioService.insertService(request);
	}

	@Override
	public ServicioUpdateModelResponse updateService(ServicioUpdateModelRequest request) {
		return servicioService.updateService(request);
	}

}
