package EC2AnlleloYactayo.EC2_Web.Dto;


public class ProductoDTORequest {
	private Integer idprod;
	private String nomprod;
	private String descrip;
	private String precioprod;
	private Integer stockprod;
	
	
	public Integer getIdprod() {
		return idprod;
	}
	public void setIdprod(Integer idprod) {
		this.idprod = idprod;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getPrecioprod() {
		return precioprod;
	}
	public void setPrecioprod(String precioprod) {
		this.precioprod = precioprod;
	}
	public Integer getStockprod() {
		return stockprod;
	}
	public void setStockprod(Integer stockprod) {
		this.stockprod = stockprod;
	}
	
	

}
