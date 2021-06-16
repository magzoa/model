/**
 */
package py.sirius.emf.model.pedido.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import py.sirius.emf.model.pedido.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see py.sirius.emf.model.pedido.PedidoPackage
 * @generated
 */
public class PedidoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PedidoValidator INSTANCE = new PedidoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "py.sirius.emf.model.pedido";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PedidoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case PedidoPackage.PERSONA:
			return validatePersona((Persona) value, diagnostics, context);
		case PedidoPackage.CLIENTE:
			return validateCliente((Cliente) value, diagnostics, context);
		case PedidoPackage.USUARIO:
			return validateUsuario((Usuario) value, diagnostics, context);
		case PedidoPackage.PEDIDO:
			return validatePedido((Pedido) value, diagnostics, context);
		case PedidoPackage.ITEM_PEDIDO:
			return validateItemPedido((ItemPedido) value, diagnostics, context);
		case PedidoPackage.PRODUCTO:
			return validateProducto((Producto) value, diagnostics, context);
		case PedidoPackage.FACTURA:
			return validateFactura((Factura) value, diagnostics, context);
		case PedidoPackage.DISTRIBUIDORA:
			return validateDistribuidora((Distribuidora) value, diagnostics, context);
		case PedidoPackage.PRODUCTO_TIPO:
			return validateProductoTipo((ProductoTipo) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersona(Persona persona, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persona, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePersona_validarLetra(persona, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePersona_novaciocorreo(persona, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validarLetra constraint of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSONA__VALIDAR_LETRA__EEXPRESSION = "self.nombre.matches('[A-Z][A-Aa-z]*')";

	/**
	 * Validates the validarLetra constraint of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersona_validarLetra(Persona persona, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PedidoPackage.Literals.PERSONA, persona, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validarLetra", PERSONA__VALIDAR_LETRA__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the novaciocorreo constraint of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSONA__NOVACIOCORREO__EEXPRESSION = "self.correo->notEmpty()";

	/**
	 * Validates the novaciocorreo constraint of '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersona_novaciocorreo(Persona persona, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PedidoPackage.Literals.PERSONA, persona, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "novaciocorreo", PERSONA__NOVACIOCORREO__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCliente(Cliente cliente, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cliente, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePersona_validarLetra(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePersona_novaciocorreo(cliente, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCliente_novaciocelular(cliente, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the novaciocelular constraint of '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLIENTE__NOVACIOCELULAR__EEXPRESSION = "self.celular->notEmpty()";

	/**
	 * Validates the novaciocelular constraint of '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCliente_novaciocelular(Cliente cliente, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PedidoPackage.Literals.CLIENTE, cliente, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "novaciocelular",
				CLIENTE__NOVACIOCELULAR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsuario(Usuario usuario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usuario, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePersona_validarLetra(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePersona_novaciocorreo(usuario, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUsuario_novaciopass(usuario, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the novaciopass constraint of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USUARIO__NOVACIOPASS__EEXPRESSION = "self.password->notEmpty()";

	/**
	 * Validates the novaciopass constraint of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsuario_novaciopass(Usuario usuario, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PedidoPackage.Literals.USUARIO, usuario, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "novaciopass", USUARIO__NOVACIOPASS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePedido(Pedido pedido, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pedido, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemPedido(ItemPedido itemPedido, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemPedido, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProducto(Producto producto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(producto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactura(Factura factura, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factura, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistribuidora(Distribuidora distribuidora, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distribuidora, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductoTipo(ProductoTipo productoTipo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PedidoValidator
