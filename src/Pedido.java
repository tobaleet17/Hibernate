import java.sql.Date;

public class Pedido {
	
	private int ID;
	private Date fecha;
	
	public Pedido(int iD, Date fecha) {
		
		ID = iD;
		this.fecha = fecha;
	}
	
	public Pedido() {
		
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
