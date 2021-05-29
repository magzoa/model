/**
 */
package py.sirius.emf.model.pedido.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import py.sirius.emf.model.pedido.Cliente;
import py.sirius.emf.model.pedido.Pedido;
import py.sirius.emf.model.pedido.PedidoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ClienteImpl#getCelular <em>Celular</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.ClienteImpl#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteImpl extends PersonaImpl implements Cliente {
	/**
	 * The default value of the '{@link #getCelular() <em>Celular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelular()
	 * @generated
	 * @ordered
	 */
	protected static final String CELULAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCelular() <em>Celular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelular()
	 * @generated
	 * @ordered
	 */
	protected String celular = CELULAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPedido() <em>Pedido</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedido()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> pedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCelular(String newCelular) {
		String oldCelular = celular;
		celular = newCelular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.CLIENTE__CELULAR, oldCelular, celular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getPedido() {
		if (pedido == null) {
			pedido = new EObjectResolvingEList<Pedido>(Pedido.class, this, PedidoPackage.CLIENTE__PEDIDO);
		}
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PedidoPackage.CLIENTE__CELULAR:
			return getCelular();
		case PedidoPackage.CLIENTE__PEDIDO:
			return getPedido();
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
		case PedidoPackage.CLIENTE__CELULAR:
			setCelular((String) newValue);
			return;
		case PedidoPackage.CLIENTE__PEDIDO:
			getPedido().clear();
			getPedido().addAll((Collection<? extends Pedido>) newValue);
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
		case PedidoPackage.CLIENTE__CELULAR:
			setCelular(CELULAR_EDEFAULT);
			return;
		case PedidoPackage.CLIENTE__PEDIDO:
			getPedido().clear();
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
		case PedidoPackage.CLIENTE__CELULAR:
			return CELULAR_EDEFAULT == null ? celular != null : !CELULAR_EDEFAULT.equals(celular);
		case PedidoPackage.CLIENTE__PEDIDO:
			return pedido != null && !pedido.isEmpty();
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
		result.append(" (celular: ");
		result.append(celular);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl
