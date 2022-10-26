package EC2AnlleloYactayo.EC2_Web.Service;

import java.util.List;

import EC2AnlleloYactayo.EC2_Web.Dto.ProductoDTORequest;
import EC2AnlleloYactayo.EC2_Web.Dto.ProductoDTOResponse;

public interface ProductoService {
	
	
	void guardarProducto(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);

}
