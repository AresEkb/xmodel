/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.CopyOfType;
import org.w3._1999.xsl.transform.ValidationType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyOfTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyOfTypeImpl#getCopyNamespaces <em>Copy Namespaces</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyOfTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyOfTypeImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyOfTypeImpl extends VersionedElementTypeImpl implements CopyOfType {
	/**
	 * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected String select = SELECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyNamespaces() <em>Copy Namespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyNamespaces()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo COPY_NAMESPACES_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getCopyNamespaces() <em>Copy Namespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyNamespaces()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo copyNamespaces = COPY_NAMESPACES_EDEFAULT;

	/**
	 * This is true if the Copy Namespaces attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyNamespacesESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationType VALIDATION_EDEFAULT = ValidationType.STRICT;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected ValidationType validation = VALIDATION_EDEFAULT;

	/**
	 * This is true if the Validation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyOfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.COPY_OF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(String newSelect) {
		String oldSelect = select;
		select = newSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_OF_TYPE__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getCopyNamespaces() {
		return copyNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyNamespaces(YesOrNo newCopyNamespaces) {
		YesOrNo oldCopyNamespaces = copyNamespaces;
		copyNamespaces = newCopyNamespaces == null ? COPY_NAMESPACES_EDEFAULT : newCopyNamespaces;
		boolean oldCopyNamespacesESet = copyNamespacesESet;
		copyNamespacesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_OF_TYPE__COPY_NAMESPACES, oldCopyNamespaces, copyNamespaces, !oldCopyNamespacesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyNamespaces() {
		YesOrNo oldCopyNamespaces = copyNamespaces;
		boolean oldCopyNamespacesESet = copyNamespacesESet;
		copyNamespaces = COPY_NAMESPACES_EDEFAULT;
		copyNamespacesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.COPY_OF_TYPE__COPY_NAMESPACES, oldCopyNamespaces, COPY_NAMESPACES_EDEFAULT, oldCopyNamespacesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyNamespaces() {
		return copyNamespacesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_OF_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationType getValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(ValidationType newValidation) {
		ValidationType oldValidation = validation;
		validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
		boolean oldValidationESet = validationESet;
		validationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_OF_TYPE__VALIDATION, oldValidation, validation, !oldValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidation() {
		ValidationType oldValidation = validation;
		boolean oldValidationESet = validationESet;
		validation = VALIDATION_EDEFAULT;
		validationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.COPY_OF_TYPE__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidation() {
		return validationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.COPY_OF_TYPE__SELECT:
				return getSelect();
			case XSLT20Package.COPY_OF_TYPE__COPY_NAMESPACES:
				return getCopyNamespaces();
			case XSLT20Package.COPY_OF_TYPE__TYPE:
				return getType();
			case XSLT20Package.COPY_OF_TYPE__VALIDATION:
				return getValidation();
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
			case XSLT20Package.COPY_OF_TYPE__SELECT:
				setSelect((String)newValue);
				return;
			case XSLT20Package.COPY_OF_TYPE__COPY_NAMESPACES:
				setCopyNamespaces((YesOrNo)newValue);
				return;
			case XSLT20Package.COPY_OF_TYPE__TYPE:
				setType((String)newValue);
				return;
			case XSLT20Package.COPY_OF_TYPE__VALIDATION:
				setValidation((ValidationType)newValue);
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
			case XSLT20Package.COPY_OF_TYPE__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case XSLT20Package.COPY_OF_TYPE__COPY_NAMESPACES:
				unsetCopyNamespaces();
				return;
			case XSLT20Package.COPY_OF_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XSLT20Package.COPY_OF_TYPE__VALIDATION:
				unsetValidation();
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
			case XSLT20Package.COPY_OF_TYPE__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case XSLT20Package.COPY_OF_TYPE__COPY_NAMESPACES:
				return isSetCopyNamespaces();
			case XSLT20Package.COPY_OF_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XSLT20Package.COPY_OF_TYPE__VALIDATION:
				return isSetValidation();
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
		result.append(" (select: ");
		result.append(select);
		result.append(", copyNamespaces: ");
		if (copyNamespacesESet) result.append(copyNamespaces); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", validation: ");
		if (validationESet) result.append(validation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CopyOfTypeImpl
