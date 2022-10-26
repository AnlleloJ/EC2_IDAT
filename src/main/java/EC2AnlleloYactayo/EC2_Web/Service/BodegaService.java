package EC2AnlleloYactayo.EC2_Web.Service;

import java.util.List;

import EC2AnlleloYactayo.EC2_Web.Dto.BodegaDTORequest;
import EC2AnlleloYactayo.EC2_Web.Dto.BodegaDTOResponse;

public interface BodegaService {
	
	
	void guardarBodega(BodegaDTORequest bodega);
	void actualizarBodega(BodegaDTORequest bodega);
	void eliminarBodega(Integer id);
	List<BodegaDTOResponse> listarBodegas();
	BodegaDTOResponse obtenerBodegaId(Integer id); 

}
