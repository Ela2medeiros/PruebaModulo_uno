package verdura;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Func func1 = new Func(12, "Juan Contrera");
		Func func2 = new Func(13, "Carlos Rubio");
		
		Cliente cliente1 = new Cliente(21, "Lissie Rodriguez", "Calle Nueva - 21, Maipú", 22222222);
		Cliente cliente2 = new Cliente(23, "Samira Hidi", "Portales - 3451, Maipú", 33333333);
		
		Producto producto1 = new Producto(210, "cebolla",890);
		Producto producto2 = new Producto(215, "papa",750);
		Producto producto3 = new Producto(220, "zapallo",990);
		
		ArrayList<Producto> listProd1 = new ArrayList<Producto>();
			listProd1.add(producto1);
			listProd1.add(producto2);
			listProd1.add(producto3);
			
		String listaproducto = "";
			for (int i = 0; i<listProd1.size(); i++) {
				listaproducto = listaproducto + listProd1.get(i).getDescripcion() + "";
			}
		
		
		Proveedor proveedor1 = new Proveedor(42, "Lo Valledor", "Mayorista");
		Proveedor proveedor2 = new Proveedor(42, "La Vega", "Mayorista y Detalle");
		
		Pedido pedido1 = new Pedido(426, "web", "02-02-2022",cliente1, 2, listProd1);
		Pedido pedido2 = new Pedido(427, "telefono", "02-02-2022",cliente2, 4, listProd1);
		
		Picking picking1 = new Picking(12, "Juan Contrera", pedido1,"02-02-2022", "19:00");
		Picking picking2 = new Picking(12, "Juan Contrera", pedido2,"02-02-2022", "19:30");
		
		Delivery delivery1 = new Delivery(13, "Carlos Rubio", picking1,"19:15");
		Delivery delivery2 = new Delivery(13, "Carlos Rubio", picking2,"19:45");
		
		CompraInsumo comprains = new CompraInsumo(754, 2 ,producto1, proveedor1);
		CompraInsumo comprains2 = new CompraInsumo(756, 4 ,producto2, proveedor2);
		
		
	System.out.println("----------------------------------");
	System.out.println("         Pedido Recebido");
	System.out.println("----------------------------------" + "\n");
	
	System.out.println(" ID pedido: " + pedido1.getId());
	System.out.println(" Fecha pedido: " + pedido1.getFechaPedido());
	System.out.println(" Cliente: " + cliente1.getNombre() + "\n" + " Telefono: " + cliente1.getTelefono() + "\n" + " Dirección: " + cliente1.getDireccion());
	System.out.println("----------------------------------");
	System.out.println(" Cod    Descripción  Cant  Precio");
	System.out.println(" " + producto1.getId() + "    " + producto1.getDescripcion() + "      " + pedido1.getCantidad() +  "     " +producto1.getPrecio());
	System.out.println("----------------------------------" + "\n");
	
	
	System.out.println("----------------------------------");
	System.out.println("     Pedido en Procesamiento");
	System.out.println("----------------------------------" + "\n");
	
	System.out.println(" ID pedido: " + pedido1.getId());
	System.out.println(" Fecha pedido: " + pedido1.getFechaPedido());
	System.out.println(" Cliente: " + cliente1.getNombre() + "\n" + " Telefono: " + cliente1.getTelefono() + "\n" + " Dirección: " + cliente1.getDireccion());
	System.out.println("----------------------------------");
	System.out.println(" Cod    Descripción  Cant  Precio");
	System.out.println(" " + producto1.getId() + "    " + producto1.getDescripcion() + "      " + pedido1.getCantidad() +  "     " +producto1.getPrecio() + "\n");
	System.out.println(" Func responsable: " + func1.getId() + " - " + func1.getNombre());
	System.out.println(" Fecha/Hora picking: " + picking1.getFechaProcesamiento() + " / " + picking1.getHoraConclusion());
	System.out.println("----------------------------------" + "\n");
	
	
	System.out.println("----------------------------------");
	System.out.println("            Delivery");
	System.out.println("----------------------------------" + "\n");
	
	System.out.println(" ID pedido: " + pedido1.getId());
	System.out.println(" Fecha pedido: " + pedido1.getFechaPedido());
	System.out.println(" Cliente: " + cliente1.getNombre() + "\n" + " Telefono: " + cliente1.getTelefono() + "\n" + " Dirección: " + cliente1.getDireccion());
	System.out.println("----------------------------------");
	System.out.println(" Cod    Descripción  Cant  Precio");
	System.out.println(" " + producto1.getId() + "    " + producto1.getDescripcion() + "      " + pedido1.getCantidad() +  "     " +producto1.getPrecio() + "\n");
	System.out.println(" Func responsable: " + func2.getId() + " - " + func2.getNombre());
	System.out.println(" Hora Delivery: " + delivery1.getHoraDespacho());
	System.out.println("----------------------------------" + "\n" + "\n" + "\n" + "\n");
	
	System.out.println("----------------------------------");
	System.out.println("   	Pedido de Insumos");
	System.out.println("----------------------------------" + "\n");
	
	System.out.println(" N° Pedido: " + comprains.getId());
	System.out.println(" Proveedor: " + proveedor1.getNombre());
	System.out.println(" Descripción  Cant");
	System.out.println(" " + producto1.getDescripcion() + "      "  + pedido1.getCantidad());
	System.out.println("----------------------------------" + "\n");
	
	
	// usando la impresion de ArrayList
	
	System.out.println("La cliente podría tener comprado los siguientes productos: ");
	
	/* Tuve problemas con la "i"
	System.out.println(listaproducto = listaproducto + listProd1.get(i).getDescripcion() + "");
	*/
	
	
	
	
	}

}
