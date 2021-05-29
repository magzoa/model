/**
 */
package py.sirius.emf.model.pedido.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import py.sirius.emf.model.pedido.Cliente;
import py.sirius.emf.model.pedido.PedidoPackage;
import py.sirius.emf.model.pedido.Persona;
import py.sirius.emf.model.pedido.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PersonaImpl#getId <em>Id</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PersonaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PersonaImpl#getCorreo <em>Correo</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PersonaImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link py.sirius.emf.model.pedido.impl.PersonaImpl#getCliente <em>Cliente</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonaImpl extends MinimalEObjectImpl.Container implements Persona {
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
	 * The default value of the '{@link #getCorreo() <em>Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreo()
	 * @generated
	 * @ordered
	 */
	protected static final String CORREO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorreo() <em>Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreo()
	 * @generated
	 * @ordered
	 */
	protected String correo = CORREO_EDEFAULT;

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
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente cliente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.PERSONA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PERSONA__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PERSONA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorreo(String newCorreo) {
		String oldCorreo = correo;
		correo = newCorreo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PERSONA__CORREO, oldCorreo, correo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PedidoPackage.PERSONA__USUARIO,
							oldUsuario, usuario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PERSONA__USUARIO, oldUsuario, usuario));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PedidoPackage.PERSONA__CLIENTE,
							oldCliente, cliente));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PERSONA__CLIENTE, oldCliente, cliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PedidoPackage.PERSONA__ID:
			return getId();
		case PedidoPackage.PERSONA__NOMBRE:
			return getNombre();
		case PedidoPackage.PERSONA__CORREO:
			return getCorreo();
		case PedidoPackage.PERSONA__USUARIO:
			if (resolve)
				return getUsuario();
			return basicGetUsuario();
		case PedidoPackage.PERSONA__CLIENTE:
			if (resolve)
				return getCliente();
			return basicGetCliente();
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
		case PedidoPackage.PERSONA__ID:
			setId((Long) newValue);
			return;
		case PedidoPackage.PERSONA__NOMBRE:
			setNombre((String) newValue);
			return;
		case PedidoPackage.PERSONA__CORREO:
			setCorreo((String) newValue);
			return;
		case PedidoPackage.PERSONA__USUARIO:
			setUsuario((Usuario) newValue);
			return;
		case PedidoPackage.PERSONA__CLIENTE:
			setCliente((Cliente) newValue);
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
		case PedidoPackage.PERSONA__ID:
			setId(ID_EDEFAULT);
			return;
		case PedidoPackage.PERSONA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case PedidoPackage.PERSONA__CORREO:
			setCorreo(CORREO_EDEFAULT);
			return;
		case PedidoPackage.PERSONA__USUARIO:
			setUsuario((Usuario) null);
			return;
		case PedidoPackage.PERSONA__CLIENTE:
			setCliente((Cliente) null);
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
		case PedidoPackage.PERSONA__ID:
			return id != ID_EDEFAULT;
		case PedidoPackage.PERSONA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case PedidoPackage.PERSONA__CORREO:
			return CORREO_EDEFAULT == null ? correo != null : !CORREO_EDEFAULT.equals(correo);
		case PedidoPackage.PERSONA__USUARIO:
			return usuario != null;
		case PedidoPackage.PERSONA__CLIENTE:
			return cliente != null;
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", correo: ");
		result.append(correo);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl
