/**
 */
package py.sirius.emf.model.pedido;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.ItemPedido#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.ItemPedido#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.ItemPedido#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.ItemPedido#getProducto <em>Producto</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getItemPedido()
 * @model
 * @generated
 */
public interface ItemPedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getItemPedido_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.ItemPedido#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad</em>' attribute.
	 * @see #setCantidad(int)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getItemPedido_Cantidad()
	 * @model
	 * @generated
	 */
	int getCantidad();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.ItemPedido#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(int value);

	/**
	 * Returns the value of the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Total</em>' attribute.
	 * @see #setSubTotal(BigDecimal)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getItemPedido_SubTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getSubTotal();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.ItemPedido#getSubTotal <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Total</em>' attribute.
	 * @see #getSubTotal()
	 * @generated
	 */
	void setSubTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Producto</b></em>' containment reference list.
	 * The list contents are of type {@link py.sirius.emf.model.pedido.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto</em>' containment reference list.
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getItemPedido_Producto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Producto> getProducto();

} // ItemPedido
