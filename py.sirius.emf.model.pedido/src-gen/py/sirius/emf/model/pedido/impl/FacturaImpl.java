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
import py.sirius.emf.model.pedido.Factura;
import py.sirius.emf.model.pedido.Pedido;
import py.sirius.emf.model.pedido.PedidoPackage;
import py.sirius.emf.model.pedido.Producto;
import py.sirius.emf.model.pedido.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.FacturaImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.FacturaImpl#getPedidos <em>Pedidos</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.FacturaImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.FacturaImpl#getCliente <em>Cliente</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.FacturaImpl#getUsuario <em>Usuario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacturaImpl extends MinimalEObjectImpl.Container implements Factura {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPedidos() <em>Pedidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> pedidos;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.FACTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.FACTURA__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getPedidos() {
		if (pedidos == null) {
			pedidos = new EObjectContainmentEList<Pedido>(Pedido.class, this, PedidoPackage.FACTURA__PEDIDOS);
		}
		return pedidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProducto() {
		if (producto == null) {
			producto = new EObjectContainmentEList<Producto>(Producto.class, this, PedidoPackage.FACTURA__PRODUCTO);
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cliente> getCliente() {
		if (cliente == null) {
			cliente = new EObjectContainmentEList<Cliente>(Cliente.class, this, PedidoPackage.FACTURA__CLIENTE);
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
			usuario = new EObjectContainmentEList<Usuario>(Usuario.class, this, PedidoPackage.FACTURA__USUARIO);
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PedidoPackage.FACTURA__PEDIDOS:
			return ((InternalEList<?>) getPedidos()).basicRemove(otherEnd, msgs);
		case PedidoPackage.FACTURA__PRODUCTO:
			return ((InternalEList<?>) getProducto()).basicRemove(otherEnd, msgs);
		case PedidoPackage.FACTURA__CLIENTE:
			return ((InternalEList<?>) getCliente()).basicRemove(otherEnd, msgs);
		case PedidoPackage.FACTURA__USUARIO:
			return ((InternalEList<?>) getUsuario()).basicRemove(otherEnd, msgs);
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
		case PedidoPackage.FACTURA__NUMERO:
			return getNumero();
		case PedidoPackage.FACTURA__PEDIDOS:
			return getPedidos();
		case PedidoPackage.FACTURA__PRODUCTO:
			return getProducto();
		case PedidoPackage.FACTURA__CLIENTE:
			return getCliente();
		case PedidoPackage.FACTURA__USUARIO:
			return getUsuario();
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
		case PedidoPackage.FACTURA__NUMERO:
			setNumero((Integer) newValue);
			return;
		case PedidoPackage.FACTURA__PEDIDOS:
			getPedidos().clear();
			getPedidos().addAll((Collection<? extends Pedido>) newValue);
			return;
		case PedidoPackage.FACTURA__PRODUCTO:
			getProducto().clear();
			getProducto().addAll((Collection<? extends Producto>) newValue);
			return;
		case PedidoPackage.FACTURA__CLIENTE:
			getCliente().clear();
			getCliente().addAll((Collection<? extends Cliente>) newValue);
			return;
		case PedidoPackage.FACTURA__USUARIO:
			getUsuario().clear();
			getUsuario().addAll((Collection<? extends Usuario>) newValue);
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
		case PedidoPackage.FACTURA__NUMERO:
			setNumero(NUMERO_EDEFAULT);
			return;
		case PedidoPackage.FACTURA__PEDIDOS:
			getPedidos().clear();
			return;
		case PedidoPackage.FACTURA__PRODUCTO:
			getProducto().clear();
			return;
		case PedidoPackage.FACTURA__CLIENTE:
			getCliente().clear();
			return;
		case PedidoPackage.FACTURA__USUARIO:
			getUsuario().clear();
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
		case PedidoPackage.FACTURA__NUMERO:
			return numero != NUMERO_EDEFAULT;
		case PedidoPackage.FACTURA__PEDIDOS:
			return pedidos != null && !pedidos.isEmpty();
		case PedidoPackage.FACTURA__PRODUCTO:
			return producto != null && !producto.isEmpty();
		case PedidoPackage.FACTURA__CLIENTE:
			return cliente != null && !cliente.isEmpty();
		case PedidoPackage.FACTURA__USUARIO:
			return usuario != null && !usuario.isEmpty();
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(')');
		return result.toString();
	}

} //FacturaImpl
