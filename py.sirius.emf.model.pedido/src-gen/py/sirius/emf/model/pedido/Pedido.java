/**
 */
package py.sirius.emf.model.pedido;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getFechaToma <em>Fecha Toma</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getFechaEntrega <em>Fecha Entrega</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getTotal <em>Total</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getCliente <em>Cliente</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Pedido#getItempedido <em>Itempedido</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido()
 * @model
 * @generated
 */
public interface Pedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Pedido#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Fecha Toma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Toma</em>' attribute.
	 * @see #setFechaToma(Date)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_FechaToma()
	 * @model
	 * @generated
	 */
	Date getFechaToma();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Pedido#getFechaToma <em>Fecha Toma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Toma</em>' attribute.
	 * @see #getFechaToma()
	 * @generated
	 */
	void setFechaToma(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha Entrega</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Entrega</em>' attribute.
	 * @see #setFechaEntrega(Date)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_FechaEntrega()
	 * @model
	 * @generated
	 */
	Date getFechaEntrega();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Pedido#getFechaEntrega <em>Fecha Entrega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Entrega</em>' attribute.
	 * @see #getFechaEntrega()
	 * @generated
	 */
	void setFechaEntrega(Date value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(BigDecimal)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_Total()
	 * @model
	 * @generated
	 */
	BigDecimal getTotal();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Pedido#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Itempedido</b></em>' reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.ItemPedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itempedido</em>' reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_Itempedido()
	 * @model
	 * @generated
	 */
	EList<ItemPedido> getItempedido();

	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' reference.
	 * @see #setCliente(Cliente)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_Cliente()
	 * @model
	 * @generated
	 */
	Cliente getCliente();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Pedido#getCliente <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cliente</em>' reference.
	 * @see #getCliente()
	 * @generated
	 */
	void setCliente(Cliente value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference.
	 * @see #setUsuario(Usuario)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getPedido_Usuario()
	 * @model
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Pedido#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

} // Pedido
