/**
 */
package py.sirius.emf.model.pedido.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import py.sirius.emf.model.pedido.PedidoPackage;
import py.sirius.emf.model.pedido.Producto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ProductoImpl#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ProductoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ProductoImpl#getFechaVencimiento <em>Fecha Vencimiento</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ProductoImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ProductoImpl#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ProductoImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto {
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
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaVencimiento() <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaVencimiento()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_VENCIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaVencimiento() <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaVencimiento()
	 * @generated
	 * @ordered
	 */
	protected Date fechaVencimiento = FECHA_VENCIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRECIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal precio = PRECIO_EDEFAULT;

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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.PRODUCTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PRODUCTO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PRODUCTO__DESCRIPCION, oldDescripcion,
					descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaVencimiento(Date newFechaVencimiento) {
		Date oldFechaVencimiento = fechaVencimiento;
		fechaVencimiento = newFechaVencimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PRODUCTO__FECHA_VENCIMIENTO,
					oldFechaVencimiento, fechaVencimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecio(BigDecimal newPrecio) {
		BigDecimal oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PRODUCTO__PRECIO, oldPrecio, precio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PRODUCTO__CANTIDAD, oldCantidad,
					cantidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PRODUCTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PedidoPackage.PRODUCTO__ID:
			return getId();
		case PedidoPackage.PRODUCTO__DESCRIPCION:
			return getDescripcion();
		case PedidoPackage.PRODUCTO__FECHA_VENCIMIENTO:
			return getFechaVencimiento();
		case PedidoPackage.PRODUCTO__PRECIO:
			return getPrecio();
		case PedidoPackage.PRODUCTO__CANTIDAD:
			return getCantidad();
		case PedidoPackage.PRODUCTO__TIPO:
			return getTipo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PedidoPackage.PRODUCTO__ID:
			setId((Long) newValue);
			return;
		case PedidoPackage.PRODUCTO__DESCRIPCION:
			setDescripcion((String) newValue);
			return;
		case PedidoPackage.PRODUCTO__FECHA_VENCIMIENTO:
			setFechaVencimiento((Date) newValue);
			return;
		case PedidoPackage.PRODUCTO__PRECIO:
			setPrecio((BigDecimal) newValue);
			return;
		case PedidoPackage.PRODUCTO__CANTIDAD:
			setCantidad((Integer) newValue);
			return;
		case PedidoPackage.PRODUCTO__TIPO:
			setTipo((String) newValue);
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
		case PedidoPackage.PRODUCTO__ID:
			setId(ID_EDEFAULT);
			return;
		case PedidoPackage.PRODUCTO__DESCRIPCION:
			setDescripcion(DESCRIPCION_EDEFAULT);
			return;
		case PedidoPackage.PRODUCTO__FECHA_VENCIMIENTO:
			setFechaVencimiento(FECHA_VENCIMIENTO_EDEFAULT);
			return;
		case PedidoPackage.PRODUCTO__PRECIO:
			setPrecio(PRECIO_EDEFAULT);
			return;
		case PedidoPackage.PRODUCTO__CANTIDAD:
			setCantidad(CANTIDAD_EDEFAULT);
			return;
		case PedidoPackage.PRODUCTO__TIPO:
			setTipo(TIPO_EDEFAULT);
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
		case PedidoPackage.PRODUCTO__ID:
			return id != ID_EDEFAULT;
		case PedidoPackage.PRODUCTO__DESCRIPCION:
			return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
		case PedidoPackage.PRODUCTO__FECHA_VENCIMIENTO:
			return FECHA_VENCIMIENTO_EDEFAULT == null ? fechaVencimiento != null
					: !FECHA_VENCIMIENTO_EDEFAULT.equals(fechaVencimiento);
		case PedidoPackage.PRODUCTO__PRECIO:
			return PRECIO_EDEFAULT == null ? precio != null : !PRECIO_EDEFAULT.equals(precio);
		case PedidoPackage.PRODUCTO__CANTIDAD:
			return cantidad != CANTIDAD_EDEFAULT;
		case PedidoPackage.PRODUCTO__TIPO:
			return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
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
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", fechaVencimiento: ");
		result.append(fechaVencimiento);
		result.append(", precio: ");
		result.append(precio);
		result.append(", cantidad: ");
		result.append(cantidad);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
