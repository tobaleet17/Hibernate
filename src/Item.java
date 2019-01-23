
public class Item {
	
	private int ID;
	private String nombre;
	private int cantidad;
	
	public Item() {
		
		
		
	}
	
	public Item(int iD, String nombre, int cantidad) {
		
		ID = iD;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
