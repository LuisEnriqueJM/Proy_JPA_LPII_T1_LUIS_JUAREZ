package Interfaces;
import java.util.List;
import model.TblProductot1;

public interface IProducto {
	void RegistrarProducto(TblProductot1 tblProducto);
	void ActualizarProducto(TblProductot1 tblProducto);
	void EliminarProducto(TblProductot1 tblProducto);
	TblProductot1 BuscarProducto(TblProductot1 tblProducto);
	List<TblProductot1> ListadoProductos();
}
