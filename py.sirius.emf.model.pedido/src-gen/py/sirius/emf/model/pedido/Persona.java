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
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getPersona()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validarLetra novaciocorreo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validarLetra='self.nombre.matches(\'[A-Z][A-Aa-z]*\')' novaciocorreo='self.correo-&gt;notEmpty()'"
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
	 * @model required="true"
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

} // Persona
