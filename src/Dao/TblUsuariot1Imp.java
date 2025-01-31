package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblProductot1;
import model.TblUsuariot1;

public class TblUsuariot1Imp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariot1 tblUsuario) {
		/* nos conectamos a la unidad de persistencia | registrar datos en la BD */ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_LUIS_JUAREZ");
		EntityManager em = emf.createEntityManager();
		
		/* iniciar la transaccion */
		try{
			em.getTransaction().begin();
			em.persist(tblUsuario);
			em.getTransaction().commit();			
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}		
		
	} //fin RegistrarUsuario

	
	@Override
	public void ActualizarUsuario(TblUsuariot1 tblUsuario) {
		/* nos conectamos a la unidad de persistencia | registrar datos en la BD */ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_LUIS_JUAREZ");
		EntityManager em = emf.createEntityManager();
		
		/* iniciar la transaccion */
		try{
			em.getTransaction().begin();
			em.merge(tblUsuario);
			em.getTransaction().commit();			
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}
		
	} //fin ActualizarUsuario

	
	@Override
	public void EliminarUsuario(TblUsuariot1 tblUsuario) {
		/* nos conectamos a la unidad de persistencia | registrar datos en la BD */ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proy_JPA_LPII_T1_LUIS_JUAREZ");
		EntityManager em = emf.createEntityManager();
		
		/* iniciar la transaccion */
		try{
			em.getTransaction().begin();
				//recupera codigo a eliminar
				TblUsuariot1 tblusuelim = em.find(TblUsuariot1.class, tblUsuario.getIdusuariot1());
				//aplicamos condicion
				if (tblUsuario!=null){
					//eliminamos el codigo
					em.remove(tblusuelim);
					//confirmamos
					em.getTransaction().commit();
				}						
		}catch(RuntimeException e){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}	
		
	}//fin EliminarUsuario

	
	@Override
	public TblUsuariot1 BuscarUsuario(TblUsuariot1 tblUsuario) {

		return null;
	}//fin BuscarUsuario

	
	@Override
	public List<TblUsuariot1> ListadoUsuarios() {
		
		return null;
	}//fin ListadoUsuarios

}
