package EC2AnlleloYactayo.EC2_Web.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import EC2AnlleloYactayo.EC2_Web.Dto.ProductoDTORequest;
import EC2AnlleloYactayo.EC2_Web.Dto.ProductoDTOResponse;
import EC2AnlleloYactayo.EC2_Web.Modelo.Productos;
import EC2AnlleloYactayo.EC2_Web.Repository.ProductoRepository;


public class ProductoServicelmpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(ProductoDTORequest producto) {

		Productos p = new Productos();
		
		p.setProducto(producto.getNomprod());
		p.setDescripcion(producto.getDescrip());
		p.setPrecio(producto.getPrecioprod());
		p.setStock(producto.getStockprod());
		
		repository.save(p);
		
	}

	@Override
	public void actualizarProducto(ProductoDTORequest producto) {
		Productos p = new Productos();
		
		p.setIdproducto(producto.getIdprod());
		p.setProducto(producto.getNomprod());
		p.setDescripcion(producto.getDescrip());
		p.setPrecio(producto.getPrecioprod());
		p.setStock(producto.getStockprod());
		
		repository.saveAndFlush(p);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {

		List<ProductoDTOResponse>listar = new ArrayList<>();
		ProductoDTOResponse dto= null;
		List<Productos> p= repository.findAll();
		
		for(Productos producto:p) {
			dto= new ProductoDTOResponse();
			
			dto.setIdprod(producto.getIdproducto());
			dto.setNomprod(producto.getProducto());
			dto.setDescrip(producto.getDescripcion());
			dto.setPrecioprod(producto.getPrecio());
			dto.setStockprod(producto.getStock());
			
			listar.add(dto);
			
		}
		
		
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {

		Productos producto = repository.findById(id).orElse(null);
		ProductoDTOResponse dto= new ProductoDTOResponse();
		
		dto=new ProductoDTOResponse();
		
		dto.setIdprod(producto.getIdproducto());
		dto.setNomprod(producto.getProducto());
		dto.setDescrip(producto.getDescripcion());
		dto.setPrecioprod(producto.getPrecio());
		dto.setStockprod(producto.getStock());
		
		return dto;
	}
}
