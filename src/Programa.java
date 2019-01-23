
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Session;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		//insertar(session);
		obtener(session);
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
	
	

private static void insertar(Session session) {
		
		
		
		session.beginTransaction();
		
		Empresa e1 = new Empresa("53760185R","Aitor",12,"pepeland");
		Pedido p2 = new Pedido();
		Item i1 = new Item();
		
		
		java.util.Date utilDate = new java.util.Date();

		p2.setFecha(new java.sql.Date(utilDate.getTime()));
		p2.setID(2);
		
		i1.setCantidad(12);
		i1.setNombre("primer item");
		
		session.save(e1);
		//session.evict(e1);
		//e1.setNombre("prueba");
		//e1.setCIF("123124124");
		//session.update(e1);
		session.save(p2);
		session.save(i1);
		
		session.getTransaction().commit();
		
		
		

		
		
	}
private static void obtener(Session session) {
	
	
	
	session.beginTransaction();
	
	Empresa e = session.get(Empresa.class, "53760185R");
	System.out.println("Empresa recuperada :" +e.getCIF().toString());
	
	
	session.getTransaction().commit();
	
	
	
}
private static void update(Session session) {
	
	session.beginTransaction();
	
	
	
	
	
	session.getTransaction().commit();
	
	
}

}
