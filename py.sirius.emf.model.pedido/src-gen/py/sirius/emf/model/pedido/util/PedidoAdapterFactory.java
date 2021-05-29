/**
 */
package py.sirius.emf.model.pedido.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import py.sirius.emf.model.pedido.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see py.sirius.emf.model.pedido.PedidoPackage
 * @generated
 */
public class PedidoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PedidoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PedidoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoSwitch<Adapter> modelSwitch = new PedidoSwitch<Adapter>() {
		@Override
		public Adapter casePersona(Persona object) {
			return createPersonaAdapter();
		}

		@Override
		public Adapter caseCliente(Cliente object) {
			return createClienteAdapter();
		}

		@Override
		public Adapter caseUsuario(Usuario object) {
			return createUsuarioAdapter();
		}

		@Override
		public Adapter casePedido(Pedido object) {
			return createPedidoAdapter();
		}

		@Override
		public Adapter caseItemPedido(ItemPedido object) {
			return createItemPedidoAdapter();
		}

		@Override
		public Adapter caseProducto(Producto object) {
			return createProductoAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link py.sirius.emf.model.pedido.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see py.sirius.emf.model.pedido.Persona
	 * @generated
	 */
	public Adapter createPersonaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link py.sirius.emf.model.pedido.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see py.sirius.emf.model.pedido.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link py.sirius.emf.model.pedido.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see py.sirius.emf.model.pedido.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link py.sirius.emf.model.pedido.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see py.sirius.emf.model.pedido.Pedido
	 * @generated
	 */
	public Adapter createPedidoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link py.sirius.emf.model.pedido.ItemPedido <em>Item Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see py.sirius.emf.model.pedido.ItemPedido
	 * @generated
	 */
	public Adapter createItemPedidoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link py.sirius.emf.model.pedido.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see py.sirius.emf.model.pedido.Producto
	 * @generated
	 */
	public Adapter createProductoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PedidoAdapterFactory
