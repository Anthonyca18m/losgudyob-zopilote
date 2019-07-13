package pe.proyecto.losgudyob.transactional.service;

import java.util.List;

import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.EliminarModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.listarClientesModelResponse;

public interface ClienteService {

	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request);

	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request);

	public ClienteUpdateModelResponse eliminarClient(EliminarModelRequest request);

	public List<listarClientesModelResponse> listAllClients();
	
	// aqui irán las de la solicitud

	public SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request);

	public ClienteUpdateModelResponse eliminarSolicitud(EliminarModelRequest request);

	public SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request);

}
