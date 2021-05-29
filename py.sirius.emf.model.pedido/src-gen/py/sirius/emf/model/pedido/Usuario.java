/**
 */
package py.sirius.emf.model.pedido;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Usuario#getPassword <em>Password</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Usuario#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends Persona {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getUsuario_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Usuario#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getUsuario_Pedido()
	 * @model
	 * @generated
	 */
	EList<Pedido> getPedido();

} // Usuario
