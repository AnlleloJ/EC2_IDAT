package EC2AnlleloYactayo.EC2_Web.Service;

import java.util.ArrayList;
import java.util.List;

import EC2AnlleloYactayo.EC2_Web.Dto.BodegaDTORequest;
import EC2AnlleloYactayo.EC2_Web.Dto.BodegaDTOResponse;
import EC2AnlleloYactayo.EC2_Web.Modelo.Bodega;
import EC2AnlleloYactayo.EC2_Web.Repository.BodegaRepository;

public class BodegaServicelmpl implements BodegaService {
	
	private BodegaRepository repository;

	@Override
	public void guardarBodega(BodegaDTORequest bodega) {
		Bodega b= new Bodega();
		
		b.setNombre(bodega.getNombrebod());
		b.setDireccion(bodega.getDirbod());
		repository.save(b);
		
	}

	@Override
	public void actualizarBodega(BodegaDTORequest bodega) {
Bodega b= new Bodega();
		
		b.setNombre(bodega.getNombrebod());
		b.setDireccion(bodega.getDirbod());
		b.setIdbodega(bodega.getIdbod());
		repository.saveAndFlush(b);
		
	}

	@Override
	public void eliminarBodega(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<BodegaDTOResponse> listarBodegas() {

		List<BodegaDTOResponse>listar = new ArrayList<>();
		BodegaDTOResponse dto = null;
		List<Bodega> b= repository.findAll();
		
		for(Bodega bodega : b) {
			
			dto= new BodegaDTOResponse();
			
			dto.setIdbod(bodega.getIdbodega());
			dto.setNombrebod(bodega.getNombre());
			dto.setDirbod(bodega.getDireccion());
			
			listar.add(dto);
			
		}
		
		return listar;
	}

	@Override
	public BodegaDTOResponse obtenerBodegaId(Integer id) {

		Bodega bodega = repository.findById(id).orElse(null);
		BodegaDTOResponse dto= new BodegaDTOResponse();
		
		dto = new BodegaDTOResponse();
		
		dto.setIdbod(bodega.getIdbodega());
		dto.setNombrebod(bodega.getNombre());
		dto.setDirbod(bodega.getDireccion());	
		
		
		return dto;
	}

}
