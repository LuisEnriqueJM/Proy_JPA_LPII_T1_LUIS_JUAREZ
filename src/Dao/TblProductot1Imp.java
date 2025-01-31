package Dao;
import java.util.List;
import Interfaces.IProducto;
import model.TblProductot1;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class TblProductot1Imp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductot1 tblProducto) {
		/* nos conectamos a la unidad de persistencia | registrar datos en la BD */ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_LUIS_JUAREZ");
		EntityManager em = emf.createEntityManager();
		
		/* iniciar la transaccion */
		try{
			em.getTransaction().begin();
			em.persist(tblProducto);
			em.getTransaction().commit();			
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}
	} // fin RegistrarProducto

	
	
	@Override
	public void ActualizarProducto(TblProductot1 tblProducto) {
		/* nos conectamos a la unidad de persistencia | registrar datos en la BD */ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_LUIS_JUAREZ");
		EntityManager em = emf.createEntityManager();
		
		/* iniciar la transaccion */
		try{
			em.getTransaction().begin();
			em.merge(tblProducto);
			em.getTransaction().commit();			
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}
	} // fin ActualizarProducto

	
	
	@Override
	public void EliminarProducto(TblProductot1 tblProducto) {
		/* nos conectamos a la unidad de persistencia | registrar datos en la BD */ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_LUIS_JUAREZ");
		EntityManager em = emf.createEntityManager();
		
		/* iniciar la transaccion */
		try{
			em.getTransaction().begin();
				//recupera codigo a eliminar
				TblProductot1 tblproelim = em.find(TblProductot1.class, tblProducto.getIdproductot1());
				//aplicamos condicion
				if (tblProducto!=null){
					//eliminamos el codigo
					em.remove(tblproelim);
					//confirmamos
					em.getTransaction().commit();
				}						
		}catch(RuntimeException e){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}
		
	} //fin EliminarProducto

	
	@Override
	public TblProductot1 BuscarProducto(TblProductot1 tblProducto) {

		return null;
		
	} // fin BuscarProducto

	
	@Override
	public List<TblProductot1> ListadoProductos() {

		return null;
		
	} // fin ListadoProductos

}

