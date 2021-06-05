/**
 */
package py.sirius.emf.model.pedido;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribuidora</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Distribuidora#getNombre <em>Nombre</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Distribuidora#getCliente <em>Cliente</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Distribuidora#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Distribuidora#getPedido <em>Pedido</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Distribuidora#getProducto <em>Producto</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Distribuidora#getItempedido <em>Itempedido</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora()
 * @model
 * @generated
 */
public interface Distribuidora extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Distribuidora#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Cliente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora_Cliente()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cliente> getCliente();

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Usuario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora_Usuario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Usuario> getUsuario();

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora_Pedido()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pedido> getPedido();

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora_Producto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Producto> getProducto();

	/**
	 * Returns the value of the '<em><b>Itempedido</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.ItemPedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itempedido</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getDistribuidora_Itempedido()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemPedido> getItempedido();

} // Distribuidora
