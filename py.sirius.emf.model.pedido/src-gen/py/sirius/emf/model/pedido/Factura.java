/**
 */
package py.sirius.emf.model.pedido;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Factura#getNumero <em>Numero</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Factura#getPedidos <em>Pedidos</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Factura#getProducto <em>Producto</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Factura#getCliente <em>Cliente</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Factura#getUsuario <em>Usuario</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getFactura()
 * @model
 * @generated
 */
public interface Factura extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getFactura_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Factura#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Pedidos</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedidos</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getFactura_Pedidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pedido> getPedidos();

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getFactura_Producto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Producto> getProducto();

	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Cliente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getFactura_Cliente()
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
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getFactura_Usuario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Usuario> getUsuario();

} // Factura
