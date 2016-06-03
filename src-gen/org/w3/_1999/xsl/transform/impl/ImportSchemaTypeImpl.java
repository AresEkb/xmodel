/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._1999.xsl.transform.ImportSchemaType;
import org.w3._1999.xsl.transform.XSLT20Package;

import org.w3._2001.xml.schema.SchemaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportSchemaTypeImpl extends ElementOnlyVersionedElementTypeImpl implements ImportSchemaType {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportSchemaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.IMPORT_SCHEMA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaType getSchema() {
		return (SchemaType)getMixed().get(XSLT20Package.Literals.IMPORT_SCHEMA_TYPE__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(SchemaType newSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.IMPORT_SCHEMA_TYPE__SCHEMA, newSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(SchemaType newSchema) {
		((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.IMPORT_SCHEMA_TYPE__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.IMPORT_SCHEMA_TYPE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA:
				return basicSetSchema(null, msgs);
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
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA:
				return getSchema();
			case XSLT20Package.IMPORT_SCHEMA_TYPE__NAMESPACE:
				return getNamespace();
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION:
				return getSchemaLocation();
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
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA:
				setSchema((SchemaType)newValue);
				return;
			case XSLT20Package.IMPORT_SCHEMA_TYPE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
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
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA:
				setSchema((SchemaType)null);
				return;
			case XSLT20Package.IMPORT_SCHEMA_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION:
				setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
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
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA:
				return getSchema() != null;
			case XSLT20Package.IMPORT_SCHEMA_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case XSLT20Package.IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION:
				return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", schemaLocation: ");
		result.append(schemaLocation);
		result.append(')');
		return result.toString();
	}

} //ImportSchemaTypeImpl
