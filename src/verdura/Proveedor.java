package verdura;

public class Proveedor {
	private int id;
	private String nombre;
	private String tipoProd;
	
	public Proveedor(int id, String nombre, String tipoProd) {
		
		this.id = id;
		this.nombre = nombre;
		this.tipoProd = tipoProd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoProd() {
		return tipoProd;
	}

	public void setTipoProd(String tipoProd) {
		this.tipoProd = tipoProd;
	}
	

}
