/**
 */
package py.sirius.emf.model.pedido;

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

} // Cliente
