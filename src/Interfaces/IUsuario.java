package Interfaces;
import java.util.List;
import model.TblUsuariot1;

public interface IUsuario {
	void RegistrarUsuario(TblUsuariot1 tblUsuario);
	void ActualizarUsuario(TblUsuariot1 tblUsuario);
	void EliminarUsuario(TblUsuariot1 tblUsuario);
	TblUsuariot1 BuscarUsuario(TblUsuariot1 tblUsuario);
	List<TblUsuariot1> ListadoUsuarios();

}