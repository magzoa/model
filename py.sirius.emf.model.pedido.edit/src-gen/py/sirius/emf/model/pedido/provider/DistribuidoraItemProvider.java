/**
 */
package py.sirius.emf.model.pedido.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import py.sirius.emf.model.pedido.Distribuidora;
import py.sirius.emf.model.pedido.PedidoFactory;
import py.sirius.emf.model.pedido.PedidoPackage;

/**
 * This is the item provider adapter for a {@link py.sirius.emf.model.pedido.Distribuidora} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DistribuidoraItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistribuidoraItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNombrePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Distribuidora_nombre_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Distribuidora_nombre_feature",
								"_UI_Distribuidora_type"),
						PedidoPackage.Literals.DISTRIBUIDORA__NOMBRE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PedidoPackage.Literals.DISTRIBUIDORA__CLIENTE);
			childrenFeatures.add(PedidoPackage.Literals.DISTRIBUIDORA__USUARIO);
			childrenFeatures.add(PedidoPackage.Literals.DISTRIBUIDORA__PEDIDO);
			childrenFeatures.add(PedidoPackage.Literals.DISTRIBUIDORA__PRODUCTO);
			childrenFeatures.add(PedidoPackage.Literals.DISTRIBUIDORA__ITEMPEDIDO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Distribuidora.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Distribuidora"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Distribuidora) object).getNombre();
		return label == null || label.length() == 0 ? getString("_UI_Distribuidora_type")
				: getString("_UI_Distribuidora_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Distribuidora.class)) {
		case PedidoPackage.DISTRIBUIDORA__NOMBRE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case PedidoPackage.DISTRIBUIDORA__CLIENTE:
		case PedidoPackage.DISTRIBUIDORA__USUARIO:
		case PedidoPackage.DISTRIBUIDORA__PEDIDO:
		case PedidoPackage.DISTRIBUIDORA__PRODUCTO:
		case PedidoPackage.DISTRIBUIDORA__ITEMPEDIDO:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PedidoPackage.Literals.DISTRIBUIDORA__CLIENTE,
				PedidoFactory.eINSTANCE.createCliente()));

		newChildDescriptors.add(createChildParameter(PedidoPackage.Literals.DISTRIBUIDORA__USUARIO,
				PedidoFactory.eINSTANCE.createUsuario()));

		newChildDescriptors.add(createChildParameter(PedidoPackage.Literals.DISTRIBUIDORA__PEDIDO,
				PedidoFactory.eINSTANCE.createPedido()));

		newChildDescriptors.add(createChildParameter(PedidoPackage.Literals.DISTRIBUIDORA__PRODUCTO,
				PedidoFactory.eINSTANCE.createProducto()));

		newChildDescriptors.add(createChildParameter(PedidoPackage.Literals.DISTRIBUIDORA__ITEMPEDIDO,
				PedidoFactory.eINSTANCE.createItemPedido()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PedidoEditPlugin.INSTANCE;
	}

}
