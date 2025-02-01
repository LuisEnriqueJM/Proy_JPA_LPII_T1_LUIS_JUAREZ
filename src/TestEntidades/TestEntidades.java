package TestEntidades;

import java.util.Date;

import Dao.TblProductot1Imp;
import Dao.TblUsuariot1Imp;
import model.TblProductot1;
import model.TblUsuariot1;

public class TestEntidades {

	public static void main(String[] args) {
		
		/*
		TblProductot1 tblprod = new TblProductot1();
		TblProductot1Imp tblprodimp = new TblProductot1Imp();
		*/
		
		/* ****** testeando el metodo RegistrarProducto ****** */
		/* ****** testeando el metodo RegistrarProducto ****** */
		/*
		//tblprod.setIdproductot1(1);
		tblprod.setNombret1("Silla Gamer Qunatum");
		tblprod.setPreciot1(625);
		tblprod.setDescripciont1("negro - blanco");
		tblprod.setEstadot1("activo");
		//fecha 1
		Date fechaF = new Date();
		Date fechaFsql = new Date(fechaF.getTime());
		tblprod.setFechafabrit1(fechaFsql);
		//fecha 2
		Date fechaV = new Date();
		Date fechaVsql = new Date(fechaV.getTime());
		tblprod.setFechavencimt1(fechaVsql);
		
		//registrar
		tblprodimp.RegistrarProducto(tblprod);
		//mensaje en consola
		System.out.println("Dato de producto REGISTRADO correctamente en BD");
		*/
		
		
		
		/* ****** testeando el metodo ActualizarProducto ****** */
		/* ****** testeando el metodo ActualizarProducto ****** */	
		/*
		tblprod.setIdproductot1(6);
		tblprod.setNombret1("Disco Duro kingston-3");
		tblprod.setPreciot1(333);
		tblprod.setDescripciont1("HD kingston 1TB-3");
		tblprod.setEstadot1("activo-3");
		//fecha 1
		Date fechaF = new Date();
		Date fechaFsql = new Date(fechaF.getTime());
		tblprod.setFechafabrit1(fechaFsql);
		//fecha 2
		Date fechaV = new Date();
		Date fechaVsql = new Date(fechaV.getTime());
		tblprod.setFechavencimt1(fechaVsql);
		
		//registrar
		tblprodimp.ActualizarProducto(tblprod);
		//mensaje en consola
		System.out.println("Dato ACTUALIZADO correctamente en BD");		
		*/
		
		
		
		/* ****** testeando el metodo EliminarProducto ****** */
		/* ****** testeando el metodo EliminarProducto ****** */		
		/*
		tblprod.setIdproductot1(6);
		tblprodimp.EliminarProducto(tblprod);
		//mensaje en consola
		System.out.println("Dato ELIMINADO correctamente en BD");			
		*/
		
		
		
		/* ===================================================== */
		/* ===================================================== */
		
		TblUsuariot1 tblusu = new TblUsuariot1();
		TblUsuariot1Imp tblusuimp = new TblUsuariot1Imp();		
		
		
		/* ****** testeando el metodo RegistrarUsuario ****** */
		/* ****** testeando el metodo RegistrarUsuario ****** */
		
		//tblprod.setIdusuariot1(1);
		tblusu.setUsuariot1("Octavio II");
		tblusu.setPasswordt1("5128dfg9");
		
		//registrar
		tblusuimp.RegistrarUsuario(tblusu);
		//mensaje en consola
		System.out.println("Dato de Usuario REGISTRADO correctamente en BD");
		
		
		
		/* ****** testeando el metodo ActualizarUsuario ****** */
		/* ****** testeando el metodo ActualizarUsuario ****** */
		/*
		tblusu.setIdusuariot1(1);
		tblusu.setUsuariot1("Marco Antonio-2");
		tblusu.setPasswordt1("245fgd-2");
		
		//registrar
		tblusuimp.ActualizarUsuario(tblusu);
		//mensaje en consola
		System.out.println("Dato de Usuario ACTUALIZADO correctamente en BD");		
		*/
		
		
		/* ****** testeando el metodo EliminarProducto ****** */
		/* ****** testeando el metodo EliminarProducto ****** */	
		/*
		tblusu.setIdusuariot1(1);
		tblusuimp.EliminarUsuario(tblusu);
		//mensaje en consola
		System.out.println("Dato de Usuario ELIMINADO correctamente en BD");
		*/		
				
	}
}

