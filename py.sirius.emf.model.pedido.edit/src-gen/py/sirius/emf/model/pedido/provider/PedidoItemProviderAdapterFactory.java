/**
 */
package py.sirius.emf.model.pedido.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import py.sirius.emf.model.pedido.util.PedidoAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PedidoItemProviderAdapterFactory extends PedidoAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.Cliente} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteItemProvider clienteItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.Cliente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClienteAdapter() {
		if (clienteItemProvider == null) {
			clienteItemProvider = new ClienteItemProvider(this);
		}

		return clienteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.Usuario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioItemProvider usuarioItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.Usuario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsuarioAdapter() {
		if (usuarioItemProvider == null) {
			usuarioItemProvider = new UsuarioItemProvider(this);
		}

		return usuarioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.Pedido} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoItemProvider pedidoItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.Pedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPedidoAdapter() {
		if (pedidoItemProvider == null) {
			pedidoItemProvider = new PedidoItemProvider(this);
		}

		return pedidoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.ItemPedido} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemPedidoItemProvider itemPedidoItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.ItemPedido}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemPedidoAdapter() {
		if (itemPedidoItemProvider == null) {
			itemPedidoItemProvider = new ItemPedidoItemProvider(this);
		}

		return itemPedidoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.Producto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoItemProvider productoItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductoAdapter() {
		if (productoItemProvider == null) {
			productoItemProvider = new ProductoItemProvider(this);
		}

		return productoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.Factura} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacturaItemProvider facturaItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.Factura}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFacturaAdapter() {
		if (facturaItemProvider == null) {
			facturaItemProvider = new FacturaItemProvider(this);
		}

		return facturaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link py.sirius.emf.model.pedido.Distribuidora} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistribuidoraItemProvider distribuidoraItemProvider;

	/**
	 * This creates an adapter for a {@link py.sirius.emf.model.pedido.Distribuidora}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistribuidoraAdapter() {
		if (distribuidoraItemProvider == null) {
			distribuidoraItemProvider = new DistribuidoraItemProvider(this);
		}

		return distribuidoraItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (clienteItemProvider != null)
			clienteItemProvider.dispose();
		if (usuarioItemProvider != null)
			usuarioItemProvider.dispose();
		if (pedidoItemProvider != null)
			pedidoItemProvider.dispose();
		if (itemPedidoItemProvider != null)
			itemPedidoItemProvider.dispose();
		if (productoItemProvider != null)
			productoItemProvider.dispose();
		if (facturaItemProvider != null)
			facturaItemProvider.dispose();
		if (distribuidoraItemProvider != null)
			distribuidoraItemProvider.dispose();
	}

}
