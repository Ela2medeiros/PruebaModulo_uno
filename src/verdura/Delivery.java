package verdura;

public class Delivery extends Func{
	private Picking picking;
	private String horaDespacho;
	
	public Delivery(int id, String nombre, Picking picking, String horaDespacho) {
		super(id, nombre);
		this.picking = picking;
		this.horaDespacho = horaDespacho;
	}

	public Picking getPicking() {
		return picking;
	}

	public void setPicking(Picking picking) {
		this.picking = picking;
	}

	public String getHoraDespacho() {
		return horaDespacho;
	}

	public void setHoraDespacho(String horaDespacho) {
		this.horaDespacho = horaDespacho;
	}
	
}
