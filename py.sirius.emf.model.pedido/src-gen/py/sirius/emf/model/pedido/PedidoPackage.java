/**
 */
package py.sirius.emf.model.pedido;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see py.sirius.emf.model.pedido.PedidoFactory
 * @model kind="package"
 * @generated
 */
public interface PedidoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pedido";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/py/sirius/emf/model/pedido";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pedido";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PedidoPackage eINSTANCE = py.sirius.emf.model.pedido.impl.PedidoPackageImpl.init();

	/**
	 * The meta object id for the '{@link py.sirius.emf.model.pedido.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see py.sirius.emf.model.pedido.impl.PersonaImpl
	 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CORREO = 2;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__USUARIO = 3;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CLIENTE = 4;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link py.sirius.emf.model.pedido.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see py.sirius.emf.model.pedido.impl.ClienteImpl
	 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ID = PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = PERSONA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CORREO = PERSONA__CORREO;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__USUARIO = PERSONA__USUARIO;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CLIENTE = PERSONA__CLIENTE;

	/**
	 * The feature id for the '<em><b>Celular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CELULAR = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__PEDIDO = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link py.sirius.emf.model.pedido.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see py.sirius.emf.model.pedido.impl.UsuarioImpl
	 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRE = PERSONA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CORREO = PERSONA__CORREO;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__USUARIO = PERSONA__USUARIO;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CLIENTE = PERSONA__CLIENTE;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PASSWORD = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PEDIDO = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link py.sirius.emf.model.pedido.impl.PedidoImpl <em>Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see py.sirius.emf.model.pedido.impl.PedidoImpl
	 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getPedido()
	 * @generated
	 */
	int PEDIDO = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ID = 0;

	/**
	 * The feature id for the '<em><b>Fecha Toma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__FECHA_TOMA = 1;

	/**
	 * The feature id for the '<em><b>Fecha Entrega</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__FECHA_ENTREGA = 2;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__TOTAL = 3;

	/**
	 * The feature id for the '<em><b>Itempedido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ITEMPEDIDO = 4;

	/**
	 * The number of structural features of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link py.sirius.emf.model.pedido.impl.ItemPedidoImpl <em>Item Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see py.sirius.emf.model.pedido.impl.ItemPedidoImpl
	 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getItemPedido()
	 * @generated
	 */
	int ITEM_PEDIDO = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__ID = 0;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__CANTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__SUB_TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__PRODUCTO = 3;

	/**
	 * The number of structural features of the '<em>Item Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link py.sirius.emf.model.pedido.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see py.sirius.emf.model.pedido.impl.ProductoImpl
	 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ID = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Fecha Vencimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__FECHA_VENCIMIENTO = 2;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PRECIO = 3;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CANTIDAD = 4;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__TIPO = 5;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link py.sirius.emf.model.pedido.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see py.sirius.emf.model.pedido.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Persona#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see py.sirius.emf.model.pedido.Persona#getId()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Id();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Persona#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see py.sirius.emf.model.pedido.Persona#getNombre()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Persona#getCorreo <em>Correo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correo</em>'.
	 * @see py.sirius.emf.model.pedido.Persona#getCorreo()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Correo();

	/**
	 * Returns the meta object for the reference '{@link py.sirius.emf.model.pedido.Persona#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see py.sirius.emf.model.pedido.Persona#getUsuario()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Usuario();

	/**
	 * Returns the meta object for the reference '{@link py.sirius.emf.model.pedido.Persona#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cliente</em>'.
	 * @see py.sirius.emf.model.pedido.Persona#getCliente()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Cliente();

	/**
	 * Returns the meta object for class '{@link py.sirius.emf.model.pedido.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see py.sirius.emf.model.pedido.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Cliente#getCelular <em>Celular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Celular</em>'.
	 * @see py.sirius.emf.model.pedido.Cliente#getCelular()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Celular();

	/**
	 * Returns the meta object for the reference list '{@link py.sirius.emf.model.pedido.Cliente#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pedido</em>'.
	 * @see py.sirius.emf.model.pedido.Cliente#getPedido()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Pedido();

	/**
	 * Returns the meta object for class '{@link py.sirius.emf.model.pedido.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see py.sirius.emf.model.pedido.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Usuario#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see py.sirius.emf.model.pedido.Usuario#getPassword()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Password();

	/**
	 * Returns the meta object for the reference list '{@link py.sirius.emf.model.pedido.Usuario#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pedido</em>'.
	 * @see py.sirius.emf.model.pedido.Usuario#getPedido()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Pedido();

	/**
	 * Returns the meta object for class '{@link py.sirius.emf.model.pedido.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido</em>'.
	 * @see py.sirius.emf.model.pedido.Pedido
	 * @generated
	 */
	EClass getPedido();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Pedido#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see py.sirius.emf.model.pedido.Pedido#getId()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Id();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Pedido#getFechaToma <em>Fecha Toma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Toma</em>'.
	 * @see py.sirius.emf.model.pedido.Pedido#getFechaToma()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_FechaToma();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Pedido#getFechaEntrega <em>Fecha Entrega</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Entrega</em>'.
	 * @see py.sirius.emf.model.pedido.Pedido#getFechaEntrega()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_FechaEntrega();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Pedido#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see py.sirius.emf.model.pedido.Pedido#getTotal()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Total();

	/**
	 * Returns the meta object for the containment reference list '{@link py.sirius.emf.model.pedido.Pedido#getItempedido <em>Itempedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Itempedido</em>'.
	 * @see py.sirius.emf.model.pedido.Pedido#getItempedido()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Itempedido();

	/**
	 * Returns the meta object for class '{@link py.sirius.emf.model.pedido.ItemPedido <em>Item Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Pedido</em>'.
	 * @see py.sirius.emf.model.pedido.ItemPedido
	 * @generated
	 */
	EClass getItemPedido();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.ItemPedido#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see py.sirius.emf.model.pedido.ItemPedido#getId()
	 * @see #getItemPedido()
	 * @generated
	 */
	EAttribute getItemPedido_Id();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.ItemPedido#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see py.sirius.emf.model.pedido.ItemPedido#getCantidad()
	 * @see #getItemPedido()
	 * @generated
	 */
	EAttribute getItemPedido_Cantidad();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.ItemPedido#getSubTotal <em>Sub Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Total</em>'.
	 * @see py.sirius.emf.model.pedido.ItemPedido#getSubTotal()
	 * @see #getItemPedido()
	 * @generated
	 */
	EAttribute getItemPedido_SubTotal();

	/**
	 * Returns the meta object for the containment reference list '{@link py.sirius.emf.model.pedido.ItemPedido#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Producto</em>'.
	 * @see py.sirius.emf.model.pedido.ItemPedido#getProducto()
	 * @see #getItemPedido()
	 * @generated
	 */
	EReference getItemPedido_Producto();

	/**
	 * Returns the meta object for class '{@link py.sirius.emf.model.pedido.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see py.sirius.emf.model.pedido.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Producto#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see py.sirius.emf.model.pedido.Producto#getId()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Id();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Producto#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see py.sirius.emf.model.pedido.Producto#getDescripcion()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Producto#getFechaVencimiento <em>Fecha Vencimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Vencimiento</em>'.
	 * @see py.sirius.emf.model.pedido.Producto#getFechaVencimiento()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_FechaVencimiento();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Producto#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see py.sirius.emf.model.pedido.Producto#getPrecio()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Precio();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Producto#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see py.sirius.emf.model.pedido.Producto#getCantidad()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Cantidad();

	/**
	 * Returns the meta object for the attribute '{@link py.sirius.emf.model.pedido.Producto#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see py.sirius.emf.model.pedido.Producto#getTipo()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Tipo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PedidoFactory getPedidoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link py.sirius.emf.model.pedido.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see py.sirius.emf.model.pedido.impl.PersonaImpl
		 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ID = eINSTANCE.getPersona_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NOMBRE = eINSTANCE.getPersona_Nombre();

		/**
		 * The meta object literal for the '<em><b>Correo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__CORREO = eINSTANCE.getPersona_Correo();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__USUARIO = eINSTANCE.getPersona_Usuario();

		/**
		 * The meta object literal for the '<em><b>Cliente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__CLIENTE = eINSTANCE.getPersona_Cliente();

		/**
		 * The meta object literal for the '{@link py.sirius.emf.model.pedido.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see py.sirius.emf.model.pedido.impl.ClienteImpl
		 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Celular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__CELULAR = eINSTANCE.getCliente_Celular();

		/**
		 * The meta object literal for the '<em><b>Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__PEDIDO = eINSTANCE.getCliente_Pedido();

		/**
		 * The meta object literal for the '{@link py.sirius.emf.model.pedido.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see py.sirius.emf.model.pedido.impl.UsuarioImpl
		 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PASSWORD = eINSTANCE.getUsuario_Password();

		/**
		 * The meta object literal for the '<em><b>Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__PEDIDO = eINSTANCE.getUsuario_Pedido();

		/**
		 * The meta object literal for the '{@link py.sirius.emf.model.pedido.impl.PedidoImpl <em>Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see py.sirius.emf.model.pedido.impl.PedidoImpl
		 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getPedido()
		 * @generated
		 */
		EClass PEDIDO = eINSTANCE.getPedido();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__ID = eINSTANCE.getPedido_Id();

		/**
		 * The meta object literal for the '<em><b>Fecha Toma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__FECHA_TOMA = eINSTANCE.getPedido_FechaToma();

		/**
		 * The meta object literal for the '<em><b>Fecha Entrega</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__FECHA_ENTREGA = eINSTANCE.getPedido_FechaEntrega();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__TOTAL = eINSTANCE.getPedido_Total();

		/**
		 * The meta object literal for the '<em><b>Itempedido</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__ITEMPEDIDO = eINSTANCE.getPedido_Itempedido();

		/**
		 * The meta object literal for the '{@link py.sirius.emf.model.pedido.impl.ItemPedidoImpl <em>Item Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see py.sirius.emf.model.pedido.impl.ItemPedidoImpl
		 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getItemPedido()
		 * @generated
		 */
		EClass ITEM_PEDIDO = eINSTANCE.getItemPedido();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PEDIDO__ID = eINSTANCE.getItemPedido_Id();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PEDIDO__CANTIDAD = eINSTANCE.getItemPedido_Cantidad();

		/**
		 * The meta object literal for the '<em><b>Sub Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PEDIDO__SUB_TOTAL = eINSTANCE.getItemPedido_SubTotal();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PEDIDO__PRODUCTO = eINSTANCE.getItemPedido_Producto();

		/**
		 * The meta object literal for the '{@link py.sirius.emf.model.pedido.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see py.sirius.emf.model.pedido.impl.ProductoImpl
		 * @see py.sirius.emf.model.pedido.impl.PedidoPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__ID = eINSTANCE.getProducto_Id();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__DESCRIPCION = eINSTANCE.getProducto_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Fecha Vencimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__FECHA_VENCIMIENTO = eINSTANCE.getProducto_FechaVencimiento();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PRECIO = eINSTANCE.getProducto_Precio();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__CANTIDAD = eINSTANCE.getProducto_Cantidad();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__TIPO = eINSTANCE.getProducto_Tipo();

	}

} //PedidoPackage
