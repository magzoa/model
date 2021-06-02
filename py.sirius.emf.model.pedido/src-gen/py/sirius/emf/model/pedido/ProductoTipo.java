/**
 */
package py.sirius.emf.model.pedido;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Producto Tipo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see py.sirius.emf.model.pedido.PedidoPackage#getProductoTipo()
 * @model
 * @generated
 */
public enum ProductoTipo implements Enumerator {
	/**
	 * The '<em><b>SUPERMERCADO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERMERCADO_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERMERCADO(0, "SUPERMERCADO", "SUPERMERCADO"),

	/**
	 * The '<em><b>FARMACIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FARMACIA_VALUE
	 * @generated
	 * @ordered
	 */
	FARMACIA(1, "FARMACIA", "FARMACIA"),

	/**
	 * The '<em><b>ELECTRONICOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONICOS_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRONICOS(2, "ELECTRONICOS", "ELECTRONICOS");

	/**
	 * The '<em><b>SUPERMERCADO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERMERCADO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPERMERCADO_VALUE = 0;

	/**
	 * The '<em><b>FARMACIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FARMACIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FARMACIA_VALUE = 1;

	/**
	 * The '<em><b>ELECTRONICOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONICOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONICOS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Producto Tipo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductoTipo[] VALUES_ARRAY = new ProductoTipo[] { SUPERMERCADO, FARMACIA, ELECTRONICOS, };

	/**
	 * A public read-only list of all the '<em><b>Producto Tipo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductoTipo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Producto Tipo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductoTipo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductoTipo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Producto Tipo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductoTipo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductoTipo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Producto Tipo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductoTipo get(int value) {
		switch (value) {
		case SUPERMERCADO_VALUE:
			return SUPERMERCADO;
		case FARMACIA_VALUE:
			return FARMACIA;
		case ELECTRONICOS_VALUE:
			return ELECTRONICOS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProductoTipo(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ProductoTipo
