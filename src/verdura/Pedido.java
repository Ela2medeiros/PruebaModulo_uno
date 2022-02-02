package verdura;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private String canal;
	private String fechaPedido;
	private Cliente cliente;
	private int cantidad;
	private ArrayList<Producto> producto;
	
	public Pedido(int id, String canal, String fechaPedido, Cliente cliente, int cantidad,
			ArrayList<Producto> producto) {
		
		this.id = id;
		this.canal = canal;
		this.fechaPedido = fechaPedido;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	
}
