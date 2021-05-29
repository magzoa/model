/**
 */
package py.sirius.emf.model.pedido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Persona#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Persona#getNombre <em>Nombre</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Persona#getCorreo <em>Correo</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Persona#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Persona#getCliente <em>Cliente</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona()
 * @model abstract="true"
 * @generated
 */
public interface Persona extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Persona#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Persona#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correo</em>' attribute.
	 * @see #setCorreo(String)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona_Correo()
	 * @model
	 * @generated
	 */
	String getCorreo();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Persona#getCorreo <em>Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correo</em>' attribute.
	 * @see #getCorreo()
	 * @generated
	 */
	void setCorreo(String value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference.
	 * @see #setUsuario(Usuario)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona_Usuario()
	 * @model derived="true"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Persona#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' reference.
	 * @see #setCliente(Cliente)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona_Cliente()
	 * @model derived="true"
	 * @generated
	 */
	Cliente getCliente();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Persona#getCliente <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cliente</em>' reference.
	 * @see #getCliente()
	 * @generated
	 */
	void setCliente(Cliente value);

} // Persona
