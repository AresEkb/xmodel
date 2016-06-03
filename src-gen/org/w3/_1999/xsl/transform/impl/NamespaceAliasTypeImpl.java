/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.NamespaceAliasType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Alias Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NamespaceAliasTypeImpl#getStylesheetPrefix <em>Stylesheet Prefix</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NamespaceAliasTypeImpl#getResultPrefix <em>Result Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceAliasTypeImpl extends ElementOnlyVersionedElementTypeImpl implements NamespaceAliasType {
	/**
	 * The default value of the '{@link #getStylesheetPrefix() <em>Stylesheet Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylesheetPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final Object STYLESHEET_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStylesheetPrefix() <em>Stylesheet Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylesheetPrefix()
	 * @generated
	 * @ordered
	 */
	protected Object stylesheetPrefix = STYLESHEET_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultPrefix() <em>Result Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESULT_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultPrefix() <em>Result Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultPrefix()
	 * @generated
	 * @ordered
	 */
	protected Object resultPrefix = RESULT_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceAliasTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.NAMESPACE_ALIAS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStylesheetPrefix() {
		return stylesheetPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylesheetPrefix(Object newStylesheetPrefix) {
		Object oldStylesheetPrefix = stylesheetPrefix;
		stylesheetPrefix = newStylesheetPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX, oldStylesheetPrefix, stylesheetPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getResultPrefix() {
		return resultPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultPrefix(Object newResultPrefix) {
		Object oldResultPrefix = resultPrefix;
		resultPrefix = newResultPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NAMESPACE_ALIAS_TYPE__RESULT_PREFIX, oldResultPrefix, resultPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX:
				return getStylesheetPrefix();
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__RESULT_PREFIX:
				return getResultPrefix();
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
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX:
				setStylesheetPrefix(newValue);
				return;
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__RESULT_PREFIX:
				setResultPrefix(newValue);
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
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX:
				setStylesheetPrefix(STYLESHEET_PREFIX_EDEFAULT);
				return;
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__RESULT_PREFIX:
				setResultPrefix(RESULT_PREFIX_EDEFAULT);
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
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX:
				return STYLESHEET_PREFIX_EDEFAULT == null ? stylesheetPrefix != null : !STYLESHEET_PREFIX_EDEFAULT.equals(stylesheetPrefix);
			case XSLT20Package.NAMESPACE_ALIAS_TYPE__RESULT_PREFIX:
				return RESULT_PREFIX_EDEFAULT == null ? resultPrefix != null : !RESULT_PREFIX_EDEFAULT.equals(resultPrefix);
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
		result.append(" (stylesheetPrefix: ");
		result.append(stylesheetPrefix);
		result.append(", resultPrefix: ");
		result.append(resultPrefix);
		result.append(')');
		return result.toString();
	}

} //NamespaceAliasTypeImpl
