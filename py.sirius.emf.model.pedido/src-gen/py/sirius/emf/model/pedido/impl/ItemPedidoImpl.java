/**
 */
package py.sirius.emf.model.pedido.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import py.sirius.emf.model.pedido.ItemPedido;
import py.sirius.emf.model.pedido.PedidoPackage;
import py.sirius.emf.model.pedido.Producto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ItemPedidoImpl#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ItemPedidoImpl#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ItemPedidoImpl#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ItemPedidoImpl#getProducto <em>Producto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemPedidoImpl extends MinimalEObjectImpl.Container implements ItemPedido {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected static final int CANTIDAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected int cantidad = CANTIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubTotal() <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SUB_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubTotal() <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal subTotal = SUB_TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> producto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemPedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.ITEM_PEDIDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.ITEM_PEDIDO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidad(int newCantidad) {
		int oldCantidad = cantidad;
		cantidad = newCantidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.ITEM_PEDIDO__CANTIDAD, oldCantidad,
					cantidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSubTotal() {
		return subTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTotal(BigDecimal newSubTotal) {
		BigDecimal oldSubTotal = subTotal;
		subTotal = newSubTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.ITEM_PEDIDO__SUB_TOTAL, oldSubTotal,
					subTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProducto() {
		if (producto == null) {
			producto = new EObjectContainmentEList<Producto>(Producto.class, this, PedidoPackage.ITEM_PEDIDO__PRODUCTO);
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PedidoPackage.ITEM_PEDIDO__PRODUCTO:
			return ((InternalEList<?>) getProducto()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PedidoPackage.ITEM_PEDIDO__ID:
			return getId();
		case PedidoPackage.ITEM_PEDIDO__CANTIDAD:
			return getCantidad();
		case PedidoPackage.ITEM_PEDIDO__SUB_TOTAL:
			return getSubTotal();
		case PedidoPackage.ITEM_PEDIDO__PRODUCTO:
			return getProducto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PedidoPackage.ITEM_PEDIDO__ID:
			setId((Long) newValue);
			return;
		case PedidoPackage.ITEM_PEDIDO__CANTIDAD:
			setCantidad((Integer) newValue);
			return;
		case PedidoPackage.ITEM_PEDIDO__SUB_TOTAL:
			setSubTotal((BigDecimal) newValue);
			return;
		case PedidoPackage.ITEM_PEDIDO__PRODUCTO:
			getProducto().clear();
			getProducto().addAll((Collection<? extends Producto>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PedidoPackage.ITEM_PEDIDO__ID:
			setId(ID_EDEFAULT);
			return;
		case PedidoPackage.ITEM_PEDIDO__CANTIDAD:
			setCantidad(CANTIDAD_EDEFAULT);
			return;
		case PedidoPackage.ITEM_PEDIDO__SUB_TOTAL:
			setSubTotal(SUB_TOTAL_EDEFAULT);
			return;
		case PedidoPackage.ITEM_PEDIDO__PRODUCTO:
			getProducto().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PedidoPackage.ITEM_PEDIDO__ID:
			return id != ID_EDEFAULT;
		case PedidoPackage.ITEM_PEDIDO__CANTIDAD:
			return cantidad != CANTIDAD_EDEFAULT;
		case PedidoPackage.ITEM_PEDIDO__SUB_TOTAL:
			return SUB_TOTAL_EDEFAULT == null ? subTotal != null : !SUB_TOTAL_EDEFAULT.equals(subTotal);
		case PedidoPackage.ITEM_PEDIDO__PRODUCTO:
			return producto != null && !producto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", cantidad: ");
		result.append(cantidad);
		result.append(", subTotal: ");
		result.append(subTotal);
		result.append(')');
		return result.toString();
	}

} //ItemPedidoImpl
