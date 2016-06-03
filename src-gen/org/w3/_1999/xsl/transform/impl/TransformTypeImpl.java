/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.GenericElementType;
import org.w3._1999.xsl.transform.ImportType;
import org.w3._1999.xsl.transform.InputTypeAnnotationsType;
import org.w3._1999.xsl.transform.ParamType;
import org.w3._1999.xsl.transform.TransformType;
import org.w3._1999.xsl.transform.ValidationStripOrPreserve;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getDeclarationGroup <em>Declaration Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getDefaultValidation <em>Default Validation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl#getInputTypeAnnotations <em>Input Type Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformTypeImpl extends TransformElementBaseTypeImpl implements TransformType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValidation() <em>Default Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValidation()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationStripOrPreserve DEFAULT_VALIDATION_EDEFAULT = ValidationStripOrPreserve.STRIP;

	/**
	 * The cached value of the '{@link #getDefaultValidation() <em>Default Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValidation()
	 * @generated
	 * @ordered
	 */
	protected ValidationStripOrPreserve defaultValidation = DEFAULT_VALIDATION_EDEFAULT;

	/**
	 * This is true if the Default Validation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValidationESet;

	/**
	 * The default value of the '{@link #getInputTypeAnnotations() <em>Input Type Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTypeAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final InputTypeAnnotationsType INPUT_TYPE_ANNOTATIONS_EDEFAULT = InputTypeAnnotationsType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getInputTypeAnnotations() <em>Input Type Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTypeAnnotations()
	 * @generated
	 * @ordered
	 */
	protected InputTypeAnnotationsType inputTypeAnnotations = INPUT_TYPE_ANNOTATIONS_EDEFAULT;

	/**
	 * This is true if the Input Type Annotations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputTypeAnnotationsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.TRANSFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportType> getImport() {
		return getMixed().list(XSLT20Package.Literals.TRANSFORM_TYPE__IMPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.TRANSFORM_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDeclarationGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.TRANSFORM_TYPE__DECLARATION_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericElementType> getDeclaration() {
		return getDeclarationGroup().list(XSLT20Package.Literals.TRANSFORM_TYPE__DECLARATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableType> getVariable() {
		return getGroup().list(XSLT20Package.Literals.TRANSFORM_TYPE__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getParam() {
		return getGroup().list(XSLT20Package.Literals.TRANSFORM_TYPE__PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.TRANSFORM_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TRANSFORM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStripOrPreserve getDefaultValidation() {
		return defaultValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValidation(ValidationStripOrPreserve newDefaultValidation) {
		ValidationStripOrPreserve oldDefaultValidation = defaultValidation;
		defaultValidation = newDefaultValidation == null ? DEFAULT_VALIDATION_EDEFAULT : newDefaultValidation;
		boolean oldDefaultValidationESet = defaultValidationESet;
		defaultValidationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TRANSFORM_TYPE__DEFAULT_VALIDATION, oldDefaultValidation, defaultValidation, !oldDefaultValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValidation() {
		ValidationStripOrPreserve oldDefaultValidation = defaultValidation;
		boolean oldDefaultValidationESet = defaultValidationESet;
		defaultValidation = DEFAULT_VALIDATION_EDEFAULT;
		defaultValidationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.TRANSFORM_TYPE__DEFAULT_VALIDATION, oldDefaultValidation, DEFAULT_VALIDATION_EDEFAULT, oldDefaultValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValidation() {
		return defaultValidationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTypeAnnotationsType getInputTypeAnnotations() {
		return inputTypeAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTypeAnnotations(InputTypeAnnotationsType newInputTypeAnnotations) {
		InputTypeAnnotationsType oldInputTypeAnnotations = inputTypeAnnotations;
		inputTypeAnnotations = newInputTypeAnnotations == null ? INPUT_TYPE_ANNOTATIONS_EDEFAULT : newInputTypeAnnotations;
		boolean oldInputTypeAnnotationsESet = inputTypeAnnotationsESet;
		inputTypeAnnotationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS, oldInputTypeAnnotations, inputTypeAnnotations, !oldInputTypeAnnotationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputTypeAnnotations() {
		InputTypeAnnotationsType oldInputTypeAnnotations = inputTypeAnnotations;
		boolean oldInputTypeAnnotationsESet = inputTypeAnnotationsESet;
		inputTypeAnnotations = INPUT_TYPE_ANNOTATIONS_EDEFAULT;
		inputTypeAnnotationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS, oldInputTypeAnnotations, INPUT_TYPE_ANNOTATIONS_EDEFAULT, oldInputTypeAnnotationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputTypeAnnotations() {
		return inputTypeAnnotationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.TRANSFORM_TYPE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TRANSFORM_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION_GROUP:
				return ((InternalEList<?>)getDeclarationGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TRANSFORM_TYPE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TRANSFORM_TYPE__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TRANSFORM_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case XSLT20Package.TRANSFORM_TYPE__IMPORT:
				return getImport();
			case XSLT20Package.TRANSFORM_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION_GROUP:
				if (coreType) return getDeclarationGroup();
				return ((FeatureMap.Internal)getDeclarationGroup()).getWrapper();
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION:
				return getDeclaration();
			case XSLT20Package.TRANSFORM_TYPE__VARIABLE:
				return getVariable();
			case XSLT20Package.TRANSFORM_TYPE__PARAM:
				return getParam();
			case XSLT20Package.TRANSFORM_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XSLT20Package.TRANSFORM_TYPE__ID:
				return getId();
			case XSLT20Package.TRANSFORM_TYPE__DEFAULT_VALIDATION:
				return getDefaultValidation();
			case XSLT20Package.TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS:
				return getInputTypeAnnotations();
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
			case XSLT20Package.TRANSFORM_TYPE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ImportType>)newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION_GROUP:
				((FeatureMap.Internal)getDeclarationGroup()).set(newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends VariableType>)newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends ParamType>)newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__ID:
				setId((String)newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__DEFAULT_VALIDATION:
				setDefaultValidation((ValidationStripOrPreserve)newValue);
				return;
			case XSLT20Package.TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS:
				setInputTypeAnnotations((InputTypeAnnotationsType)newValue);
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
			case XSLT20Package.TRANSFORM_TYPE__IMPORT:
				getImport().clear();
				return;
			case XSLT20Package.TRANSFORM_TYPE__GROUP:
				getGroup().clear();
				return;
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION_GROUP:
				getDeclarationGroup().clear();
				return;
			case XSLT20Package.TRANSFORM_TYPE__VARIABLE:
				getVariable().clear();
				return;
			case XSLT20Package.TRANSFORM_TYPE__PARAM:
				getParam().clear();
				return;
			case XSLT20Package.TRANSFORM_TYPE__ANY:
				getAny().clear();
				return;
			case XSLT20Package.TRANSFORM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XSLT20Package.TRANSFORM_TYPE__DEFAULT_VALIDATION:
				unsetDefaultValidation();
				return;
			case XSLT20Package.TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS:
				unsetInputTypeAnnotations();
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
			case XSLT20Package.TRANSFORM_TYPE__IMPORT:
				return !getImport().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__GROUP:
				return !getGroup().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION_GROUP:
				return !getDeclarationGroup().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__DECLARATION:
				return !getDeclaration().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__VARIABLE:
				return !getVariable().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__PARAM:
				return !getParam().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__ANY:
				return !getAny().isEmpty();
			case XSLT20Package.TRANSFORM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XSLT20Package.TRANSFORM_TYPE__DEFAULT_VALIDATION:
				return isSetDefaultValidation();
			case XSLT20Package.TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS:
				return isSetInputTypeAnnotations();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", defaultValidation: ");
		if (defaultValidationESet) result.append(defaultValidation); else result.append("<unset>");
		result.append(", inputTypeAnnotations: ");
		if (inputTypeAnnotationsESet) result.append(inputTypeAnnotations); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransformTypeImpl
