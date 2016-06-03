/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl;

import org.w3._1999.xsl.transform.GenericElementType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl#getDefaultCollation <em>Default Collation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl#getExcludeResultPrefixes <em>Exclude Result Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl#getExtensionElementPrefixes <em>Extension Element Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl#getUseWhen <em>Use When</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericElementTypeImpl extends XMLTypeDocumentRootImpl implements GenericElementType {
	/**
	 * The default value of the '{@link #getDefaultCollation() <em>Default Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCollation()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> DEFAULT_COLLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCollation() <em>Default Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCollation()
	 * @generated
	 * @ordered
	 */
	protected List<String> defaultCollation = DEFAULT_COLLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeResultPrefixes() <em>Exclude Result Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeResultPrefixes()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXCLUDE_RESULT_PREFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeResultPrefixes() <em>Exclude Result Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeResultPrefixes()
	 * @generated
	 * @ordered
	 */
	protected Object excludeResultPrefixes = EXCLUDE_RESULT_PREFIXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionElementPrefixes() <em>Extension Element Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionElementPrefixes()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> EXTENSION_ELEMENT_PREFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionElementPrefixes() <em>Extension Element Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionElementPrefixes()
	 * @generated
	 * @ordered
	 */
	protected List<Object> extensionElementPrefixes = EXTENSION_ELEMENT_PREFIXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseWhen() <em>Use When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseWhen() <em>Use When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseWhen()
	 * @generated
	 * @ordered
	 */
	protected String useWhen = USE_WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpathDefaultNamespace() <em>Xpath Default Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathDefaultNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_DEFAULT_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpathDefaultNamespace() <em>Xpath Default Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathDefaultNamespace()
	 * @generated
	 * @ordered
	 */
	protected String xpathDefaultNamespace = XPATH_DEFAULT_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.GENERIC_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getDefaultCollation() {
		return defaultCollation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCollation(List<String> newDefaultCollation) {
		List<String> oldDefaultCollation = defaultCollation;
		defaultCollation = newDefaultCollation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION, oldDefaultCollation, defaultCollation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExcludeResultPrefixes() {
		return excludeResultPrefixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeResultPrefixes(Object newExcludeResultPrefixes) {
		Object oldExcludeResultPrefixes = excludeResultPrefixes;
		excludeResultPrefixes = newExcludeResultPrefixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES, oldExcludeResultPrefixes, excludeResultPrefixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> getExtensionElementPrefixes() {
		return extensionElementPrefixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionElementPrefixes(List<Object> newExtensionElementPrefixes) {
		List<Object> oldExtensionElementPrefixes = extensionElementPrefixes;
		extensionElementPrefixes = newExtensionElementPrefixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES, oldExtensionElementPrefixes, extensionElementPrefixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseWhen() {
		return useWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseWhen(String newUseWhen) {
		String oldUseWhen = useWhen;
		useWhen = newUseWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.GENERIC_ELEMENT_TYPE__USE_WHEN, oldUseWhen, useWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpathDefaultNamespace() {
		return xpathDefaultNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpathDefaultNamespace(String newXpathDefaultNamespace) {
		String oldXpathDefaultNamespace = xpathDefaultNamespace;
		xpathDefaultNamespace = newXpathDefaultNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE, oldXpathDefaultNamespace, xpathDefaultNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XSLT20Package.GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case XSLT20Package.GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION:
				return getDefaultCollation();
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES:
				return getExcludeResultPrefixes();
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES:
				return getExtensionElementPrefixes();
			case XSLT20Package.GENERIC_ELEMENT_TYPE__USE_WHEN:
				return getUseWhen();
			case XSLT20Package.GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE:
				return getXpathDefaultNamespace();
			case XSLT20Package.GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case XSLT20Package.GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION:
				setDefaultCollation((List<String>)newValue);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES:
				setExcludeResultPrefixes(newValue);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES:
				setExtensionElementPrefixes((List<Object>)newValue);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__USE_WHEN:
				setUseWhen((String)newValue);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE:
				setXpathDefaultNamespace((String)newValue);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case XSLT20Package.GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION:
				setDefaultCollation(DEFAULT_COLLATION_EDEFAULT);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES:
				setExcludeResultPrefixes(EXCLUDE_RESULT_PREFIXES_EDEFAULT);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES:
				setExtensionElementPrefixes(EXTENSION_ELEMENT_PREFIXES_EDEFAULT);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__USE_WHEN:
				setUseWhen(USE_WHEN_EDEFAULT);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE:
				setXpathDefaultNamespace(XPATH_DEFAULT_NAMESPACE_EDEFAULT);
				return;
			case XSLT20Package.GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case XSLT20Package.GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION:
				return DEFAULT_COLLATION_EDEFAULT == null ? defaultCollation != null : !DEFAULT_COLLATION_EDEFAULT.equals(defaultCollation);
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES:
				return EXCLUDE_RESULT_PREFIXES_EDEFAULT == null ? excludeResultPrefixes != null : !EXCLUDE_RESULT_PREFIXES_EDEFAULT.equals(excludeResultPrefixes);
			case XSLT20Package.GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES:
				return EXTENSION_ELEMENT_PREFIXES_EDEFAULT == null ? extensionElementPrefixes != null : !EXTENSION_ELEMENT_PREFIXES_EDEFAULT.equals(extensionElementPrefixes);
			case XSLT20Package.GENERIC_ELEMENT_TYPE__USE_WHEN:
				return USE_WHEN_EDEFAULT == null ? useWhen != null : !USE_WHEN_EDEFAULT.equals(useWhen);
			case XSLT20Package.GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE:
				return XPATH_DEFAULT_NAMESPACE_EDEFAULT == null ? xpathDefaultNamespace != null : !XPATH_DEFAULT_NAMESPACE_EDEFAULT.equals(xpathDefaultNamespace);
			case XSLT20Package.GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (defaultCollation: ");
		result.append(defaultCollation);
		result.append(", excludeResultPrefixes: ");
		result.append(excludeResultPrefixes);
		result.append(", extensionElementPrefixes: ");
		result.append(extensionElementPrefixes);
		result.append(", useWhen: ");
		result.append(useWhen);
		result.append(", xpathDefaultNamespace: ");
		result.append(xpathDefaultNamespace);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //GenericElementTypeImpl
