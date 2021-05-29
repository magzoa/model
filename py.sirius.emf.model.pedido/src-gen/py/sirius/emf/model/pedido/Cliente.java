/**
 */
package py.sirius.emf.model.pedido;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Cliente#getCelular <em>Celular</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Cliente#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends Persona {
	/**
	 * Returns the value of the '<em><b>Celular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Celular</em>' attribute.
	 * @see #setCelular(String)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getCliente_Celular()
	 * @model
	 * @generated
	 */
	String getCelular();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Cliente#getCelular <em>Celular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celular</em>' attribute.
	 * @see #getCelular()
	 * @generated
	 */
	void setCelular(String value);

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getCliente_Pedido()
	 * @model
	 * @generated
	 */
	EList<Pedido> getPedido();

} // Cliente
