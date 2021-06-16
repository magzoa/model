/**
 */
package py.sirius.emf.model.pedido;

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
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getUsuario()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='novaciopass'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot novaciopass='self.password-&gt;notEmpty()'"
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

} // Usuario
