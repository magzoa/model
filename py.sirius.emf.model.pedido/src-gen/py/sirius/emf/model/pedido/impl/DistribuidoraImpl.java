/**
 */
package py.sirius.emf.model.pedido.impl;

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

import py.sirius.emf.model.pedido.Cliente;
import py.sirius.emf.model.pedido.Distribuidora;
import py.sirius.emf.model.pedido.ItemPedido;
import py.sirius.emf.model.pedido.Pedido;
import py.sirius.emf.model.pedido.PedidoPackage;
import py.sirius.emf.model.pedido.Producto;
import py.sirius.emf.model.pedido.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribuidora</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.DistribuidoraImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.DistribuidoraImpl#getCliente <em>Cliente</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.DistribuidoraImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.DistribuidoraImpl#getPedido <em>Pedido</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.DistribuidoraImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.DistribuidoraImpl#getItempedido <em>Itempedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistribuidoraImpl extends MinimalEObjectImpl.Container implements Distribuidora {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> cliente;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected EList<Usuario> usuario;

	/**
	 * The cached value of the '{@link #getPedido() <em>Pedido</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedido()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> pedido;

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
	 * The cached value of the '{@link #getItempedido() <em>Itempedido</em>}' containment reference list.
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
	protected DistribuidoraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.DISTRIBUIDORA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DISTRIBUIDORA__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cliente> getCliente() {
		if (cliente == null) {
			cliente = new EObjectContainmentEList<Cliente>(Cliente.class, this, PedidoPackage.DISTRIBUIDORA__CLIENTE);
		}
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usuario> getUsuario() {
		if (usuario == null) {
			usuario = new EObjectContainmentEList<Usuario>(Usuario.class, this, PedidoPackage.DISTRIBUIDORA__USUARIO);
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getPedido() {
		if (pedido == null) {
			pedido = new EObjectContainmentEList<Pedido>(Pedido.class, this, PedidoPackage.DISTRIBUIDORA__PEDIDO);
		}
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProducto() {
		if (producto == null) {
			producto = new EObjectContainmentEList<Producto>(Producto.class, this,
					PedidoPackage.DISTRIBUIDORA__PRODUCTO);
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemPedido> getItempedido() {
		if (itempedido == null) {
			itempedido = new EObjectContainmentEList<ItemPedido>(ItemPedido.class, this,
					PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO);
		}
		return itempedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PedidoPackage.DISTRIBUIDORA__CLIENTE:
			return ((InternalEList<?>) getCliente()).basicRemove(otherEnd, msgs);
		case PedidoPackage.DISTRIBUIDORA__USUARIO:
			return ((InternalEList<?>) getUsuario()).basicRemove(otherEnd, msgs);
		case PedidoPackage.DISTRIBUIDORA__PEDIDO:
			return ((InternalEList<?>) getPedido()).basicRemove(otherEnd, msgs);
		case PedidoPackage.DISTRIBUIDORA__PRODUCTO:
			return ((InternalEList<?>) getProducto()).basicRemove(otherEnd, msgs);
		case PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO:
			return ((InternalEList<?>) getItempedido()).basicRemove(otherEnd, msgs);
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
		case PedidoPackage.DISTRIBUIDORA__NOMBRE:
			return getNombre();
		case PedidoPackage.DISTRIBUIDORA__CLIENTE:
			return getCliente();
		case PedidoPackage.DISTRIBUIDORA__USUARIO:
			return getUsuario();
		case PedidoPackage.DISTRIBUIDORA__PEDIDO:
			return getPedido();
		case PedidoPackage.DISTRIBUIDORA__PRODUCTO:
			return getProducto();
		case PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO:
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
		case PedidoPackage.DISTRIBUIDORA__NOMBRE:
			setNombre((String) newValue);
			return;
		case PedidoPackage.DISTRIBUIDORA__CLIENTE:
			getCliente().clear();
			getCliente().addAll((Collection<? extends Cliente>) newValue);
			return;
		case PedidoPackage.DISTRIBUIDORA__USUARIO:
			getUsuario().clear();
			getUsuario().addAll((Collection<? extends Usuario>) newValue);
			return;
		case PedidoPackage.DISTRIBUIDORA__PEDIDO:
			getPedido().clear();
			getPedido().addAll((Collection<? extends Pedido>) newValue);
			return;
		case PedidoPackage.DISTRIBUIDORA__PRODUCTO:
			getProducto().clear();
			getProducto().addAll((Collection<? extends Producto>) newValue);
			return;
		case PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO:
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
		case PedidoPackage.DISTRIBUIDORA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case PedidoPackage.DISTRIBUIDORA__CLIENTE:
			getCliente().clear();
			return;
		case PedidoPackage.DISTRIBUIDORA__USUARIO:
			getUsuario().clear();
			return;
		case PedidoPackage.DISTRIBUIDORA__PEDIDO:
			getPedido().clear();
			return;
		case PedidoPackage.DISTRIBUIDORA__PRODUCTO:
			getProducto().clear();
			return;
		case PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO:
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
		case PedidoPackage.DISTRIBUIDORA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case PedidoPackage.DISTRIBUIDORA__CLIENTE:
			return cliente != null && !cliente.isEmpty();
		case PedidoPackage.DISTRIBUIDORA__USUARIO:
			return usuario != null && !usuario.isEmpty();
		case PedidoPackage.DISTRIBUIDORA__PEDIDO:
			return pedido != null && !pedido.isEmpty();
		case PedidoPackage.DISTRIBUIDORA__PRODUCTO:
			return producto != null && !producto.isEmpty();
		case PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO:
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //DistribuidoraImpl
