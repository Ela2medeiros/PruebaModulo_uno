package verdura;

public class Picking extends Func {
	private Pedido pedido;
	private String fechaProcesamiento;
	private String horaConclusion;
	
	public Picking(int id, String nombre, Pedido pedido, String fechaProcesamiento, String horaConclusion) {
		super(id, nombre);
		this.pedido = pedido;
		this.fechaProcesamiento = fechaProcesamiento;
		this.horaConclusion = horaConclusion;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getFechaProcesamiento() {
		return fechaProcesamiento;
	}

	public void setFechaProcesamiento(String fechaProcesamiento) {
		this.fechaProcesamiento = fechaProcesamiento;
	}

	public String getHoraConclusion() {
		return horaConclusion;
	}

	public void setHoraConclusion(String horaConclusion) {
		this.horaConclusion = horaConclusion;
	}
	
	
}
