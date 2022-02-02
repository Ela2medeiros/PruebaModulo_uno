package verdura;

public class CompraInsumo {
	private int id;
	private int cantidad;
	private Producto producto;
	private Proveedor proveedor;
	
	public CompraInsumo(int id, int cantidad, Producto producto, Proveedor proveedor) {
		
		this.id = id;
		this.cantidad = cantidad;
		this.producto = producto;
		this.proveedor = proveedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
}
