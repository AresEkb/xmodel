/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.AttributeType;
import org.w3._1999.xsl.transform.ValidationType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeImpl extends SequenceConstructorImpl implements AttributeType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

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
	protected AttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.ATTRIBUTE_TYPE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_TYPE__NAMESPACE, oldNamespace, namespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_TYPE__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_TYPE__SEPARATOR, oldSeparator, separator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_TYPE__VALIDATION, oldValidation, validation, !oldValidationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.ATTRIBUTE_TYPE__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
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
			case XSLT20Package.ATTRIBUTE_TYPE__NAME:
				return getName();
			case XSLT20Package.ATTRIBUTE_TYPE__NAMESPACE:
				return getNamespace();
			case XSLT20Package.ATTRIBUTE_TYPE__SELECT:
				return getSelect();
			case XSLT20Package.ATTRIBUTE_TYPE__SEPARATOR:
				return getSeparator();
			case XSLT20Package.ATTRIBUTE_TYPE__TYPE:
				return getType();
			case XSLT20Package.ATTRIBUTE_TYPE__VALIDATION:
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
			case XSLT20Package.ATTRIBUTE_TYPE__NAME:
				setName((String)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__SELECT:
				setSelect((String)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__SEPARATOR:
				setSeparator((String)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__TYPE:
				setType((String)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__VALIDATION:
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
			case XSLT20Package.ATTRIBUTE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XSLT20Package.ATTRIBUTE_TYPE__VALIDATION:
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
			case XSLT20Package.ATTRIBUTE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSLT20Package.ATTRIBUTE_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case XSLT20Package.ATTRIBUTE_TYPE__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case XSLT20Package.ATTRIBUTE_TYPE__SEPARATOR:
				return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
			case XSLT20Package.ATTRIBUTE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XSLT20Package.ATTRIBUTE_TYPE__VALIDATION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", select: ");
		result.append(select);
		result.append(", separator: ");
		result.append(separator);
		result.append(", type: ");
		result.append(type);
		result.append(", validation: ");
		if (validationESet) result.append(validation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AttributeTypeImpl
