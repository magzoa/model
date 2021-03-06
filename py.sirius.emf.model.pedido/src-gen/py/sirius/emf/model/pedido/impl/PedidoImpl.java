/**
 */
package py.sirius.emf.model.pedido.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import py.sirius.emf.model.pedido.Cliente;
import py.sirius.emf.model.pedido.ItemPedido;
import py.sirius.emf.model.pedido.Pedido;
import py.sirius.emf.model.pedido.PedidoPackage;
import py.sirius.emf.model.pedido.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getFechaToma <em>Fecha Toma</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getFechaEntrega <em>Fecha Entrega</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getCliente <em>Cliente</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PedidoImpl#getItempedido <em>Itempedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedidoImpl extends MinimalEObjectImpl.Container implements Pedido {
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
	 * The default value of the '{@link #getFechaToma() <em>Fecha Toma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaToma()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_TOMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaToma() <em>Fecha Toma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaToma()
	 * @generated
	 * @ordered
	 */
	protected Date fechaToma = FECHA_TOMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaEntrega() <em>Fecha Entrega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaEntrega()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_ENTREGA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaEntrega() <em>Fecha Entrega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaEntrega()
	 * @generated
	 * @ordered
	 */
	protected Date fechaEntrega = FECHA_ENTREGA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal total = TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente cliente;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected Usuario usuario;

	/**
	 * The cached value of the '{@link #getItempedido() <em>Itempedido</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItempedido()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemPedido> itempedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.PEDIDO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaToma() {
		return fechaToma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaToma(Date newFechaToma) {
		Date oldFechaToma = fechaToma;
		fechaToma = newFechaToma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__FECHA_TOMA, oldFechaToma,
					fechaToma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaEntrega(Date newFechaEntrega) {
		Date oldFechaEntrega = fechaEntrega;
		fechaEntrega = newFechaEntrega;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__FECHA_ENTREGA, oldFechaEntrega,
					fechaEntrega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(BigDecimal newTotal) {
		BigDecimal oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemPedido> getItempedido() {
		if (itempedido == null) {
			itempedido = new EObjectResolvingEList<ItemPedido>(ItemPedido.class, this,
					PedidoPackage.PEDIDO__ITEMPEDIDO);
		}
		return itempedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente getCliente() {
		if (cliente != null && cliente.eIsProxy()) {
			InternalEObject oldCliente = (InternalEObject) cliente;
			cliente = (Cliente) eResolveProxy(oldCliente);
			if (cliente != oldCliente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PedidoPackage.PEDIDO__CLIENTE, oldCliente,
							cliente));
			}
		}
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente basicGetCliente() {
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCliente(Cliente newCliente) {
		Cliente oldCliente = cliente;
		cliente = newCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__CLIENTE, oldCliente, cliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario getUsuario() {
		if (usuario != null && usuario.eIsProxy()) {
			InternalEObject oldUsuario = (InternalEObject) usuario;
			usuario = (Usuario) eResolveProxy(oldUsuario);
			if (usuario != oldUsuario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PedidoPackage.PEDIDO__USUARIO, oldUsuario,
							usuario));
			}
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario basicGetUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(Usuario newUsuario) {
		Usuario oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PedidoPackage.PEDIDO__ID:
			return getId();
		case PedidoPackage.PEDIDO__FECHA_TOMA:
			return getFechaToma();
		case PedidoPackage.PEDIDO__FECHA_ENTREGA:
			return getFechaEntrega();
		case PedidoPackage.PEDIDO__TOTAL:
			return getTotal();
		case PedidoPackage.PEDIDO__CLIENTE:
			if (resolve)
				return getCliente();
			return basicGetCliente();
		case PedidoPackage.PEDIDO__USUARIO:
			if (resolve)
				return getUsuario();
			return basicGetUsuario();
		case PedidoPackage.PEDIDO__ITEMPEDIDO:
			return getItempedido();
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
		case PedidoPackage.PEDIDO__ID:
			setId((Long) newValue);
			return;
		case PedidoPackage.PEDIDO__FECHA_TOMA:
			setFechaToma((Date) newValue);
			return;
		case PedidoPackage.PEDIDO__FECHA_ENTREGA:
			setFechaEntrega((Date) newValue);
			return;
		case PedidoPackage.PEDIDO__TOTAL:
			setTotal((BigDecimal) newValue);
			return;
		case PedidoPackage.PEDIDO__CLIENTE:
			setCliente((Cliente) newValue);
			return;
		case PedidoPackage.PEDIDO__USUARIO:
			setUsuario((Usuario) newValue);
			return;
		case PedidoPackage.PEDIDO__ITEMPEDIDO:
			getItempedido().clear();
			getItempedido().addAll((Collection<? extends ItemPedido>) newValue);
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
		case PedidoPackage.PEDIDO__ID:
			setId(ID_EDEFAULT);
			return;
		case PedidoPackage.PEDIDO__FECHA_TOMA:
			setFechaToma(FECHA_TOMA_EDEFAULT);
			return;
		case PedidoPackage.PEDIDO__FECHA_ENTREGA:
			setFechaEntrega(FECHA_ENTREGA_EDEFAULT);
			return;
		case PedidoPackage.PEDIDO__TOTAL:
			setTotal(TOTAL_EDEFAULT);
			return;
		case PedidoPackage.PEDIDO__CLIENTE:
			setCliente((Cliente) null);
			return;
		case PedidoPackage.PEDIDO__USUARIO:
			setUsuario((Usuario) null);
			return;
		case PedidoPackage.PEDIDO__ITEMPEDIDO:
			getItempedido().clear();
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
		case PedidoPackage.PEDIDO__ID:
			return id != ID_EDEFAULT;
		case PedidoPackage.PEDIDO__FECHA_TOMA:
			return FECHA_TOMA_EDEFAULT == null ? fechaToma != null : !FECHA_TOMA_EDEFAULT.equals(fechaToma);
		case PedidoPackage.PEDIDO__FECHA_ENTREGA:
			return FECHA_ENTREGA_EDEFAULT == null ? fechaEntrega != null : !FECHA_ENTREGA_EDEFAULT.equals(fechaEntrega);
		case PedidoPackage.PEDIDO__TOTAL:
			return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
		case PedidoPackage.PEDIDO__CLIENTE:
			return cliente != null;
		case PedidoPackage.PEDIDO__USUARIO:
			return usuario != null;
		case PedidoPackage.PEDIDO__ITEMPEDIDO:
			return itempedido != null && !itempedido.isEmpty();
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
		result.append(", fechaToma: ");
		result.append(fechaToma);
		result.append(", fechaEntrega: ");
		result.append(fechaEntrega);
		result.append(", total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl
