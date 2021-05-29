/**
 */
package py.sirius.emf.model.pedido.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import py.sirius.emf.model.pedido.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PedidoFactoryImpl extends EFactoryImpl implements PedidoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PedidoFactory init() {
		try {
			PedidoFactory thePedidoFactory = (PedidoFactory) EPackage.Registry.INSTANCE
					.getEFactory(PedidoPackage.eNS_URI);
			if (thePedidoFactory != null) {
				return thePedidoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PedidoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PedidoPackage.CLIENTE:
			return createCliente();
		case PedidoPackage.USUARIO:
			return createUsuario();
		case PedidoPackage.PEDIDO:
			return createPedido();
		case PedidoPackage.ITEM_PEDIDO:
			return createItemPedido();
		case PedidoPackage.PRODUCTO:
			return createProducto();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido createPedido() {
		PedidoImpl pedido = new PedidoImpl();
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemPedido createItemPedido() {
		ItemPedidoImpl itemPedido = new ItemPedidoImpl();
		return itemPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoPackage getPedidoPackage() {
		return (PedidoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PedidoPackage getPackage() {
		return PedidoPackage.eINSTANCE;
	}

} //PedidoFactoryImpl
