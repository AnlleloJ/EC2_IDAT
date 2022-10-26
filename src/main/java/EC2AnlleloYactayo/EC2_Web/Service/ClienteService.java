package EC2AnlleloYactayo.EC2_Web.Service;

import java.util.List;

import EC2AnlleloYactayo.EC2_Web.Dto.ClienteDTORequest;
import EC2AnlleloYactayo.EC2_Web.Dto.ClienteDTOResponse;

public interface ClienteService {
	
	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarClientes();
	ClienteDTOResponse obtenerClienteId(Integer id); 

}
