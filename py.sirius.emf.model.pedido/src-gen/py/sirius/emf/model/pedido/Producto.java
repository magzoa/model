/**
 */
package py.sirius.emf.model.pedido;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.Producto#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Producto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Producto#getFechaVencimiento <em>Fecha Vencimiento</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Producto#getPrecio <em>Precio</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Producto#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.Producto#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Producto#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Producto#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Vencimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Vencimiento</em>' attribute.
	 * @see #setFechaVencimiento(Date)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto_FechaVencimiento()
	 * @model
	 * @generated
	 */
	Date getFechaVencimiento();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Producto#getFechaVencimiento <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Vencimiento</em>' attribute.
	 * @see #getFechaVencimiento()
	 * @generated
	 */
	void setFechaVencimiento(Date value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(BigDecimal)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto_Precio()
	 * @model
	 * @generated
	 */
	BigDecimal getPrecio();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Producto#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad</em>' attribute.
	 * @see #setCantidad(int)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto_Cantidad()
	 * @model
	 * @generated
	 */
	int getCantidad();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Producto#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(int value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link py.sirius.emf.model.pedido.ProductoTipo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see py.sirius.emf.model.pedido.ProductoTipo
	 * @see #setTipo(ProductoTipo)
	 * @see py.sirius.emf.model.pedido.PedidoPackage#getProducto_Tipo()
	 * @model
	 * @generated
	 */
	ProductoTipo getTipo();

	/**
	 * Sets the value of the '{@link py.sirius.emf.model.pedido.Producto#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see py.sirius.emf.model.pedido.ProductoTipo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(ProductoTipo value);

} // Producto
