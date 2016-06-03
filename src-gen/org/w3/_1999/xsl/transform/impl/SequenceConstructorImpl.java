/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.VersionedElementType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl#getAny1 <em>Any1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceConstructorImpl extends VersionedElementTypeImpl implements SequenceConstructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSequenceConstructorGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableType> getVariable() {
		return getSequenceConstructorGroup().list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInstructionGroup() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedElementType> getInstruction() {
		return getInstructionGroup().list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__INSTRUCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLiteralResultElementGroup() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLiteralResultElement() {
		return getLiteralResultElementGroup().list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.SEQUENCE_CONSTRUCTOR__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP:
				return ((InternalEList<?>)getSequenceConstructorGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP:
				return ((InternalEList<?>)getInstructionGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION:
				return ((InternalEList<?>)getInstruction()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP:
				return ((InternalEList<?>)getLiteralResultElementGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT:
				return ((InternalEList<?>)getLiteralResultElement()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
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
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP:
				if (coreType) return getSequenceConstructorGroup();
				return ((FeatureMap.Internal)getSequenceConstructorGroup()).getWrapper();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__VARIABLE:
				return getVariable();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP:
				if (coreType) return getInstructionGroup();
				return ((FeatureMap.Internal)getInstructionGroup()).getWrapper();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION:
				return getInstruction();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP:
				if (coreType) return getLiteralResultElementGroup();
				return ((FeatureMap.Internal)getLiteralResultElementGroup()).getWrapper();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT:
				return getLiteralResultElement();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
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
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP:
				((FeatureMap.Internal)getSequenceConstructorGroup()).set(newValue);
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends VariableType>)newValue);
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP:
				((FeatureMap.Internal)getInstructionGroup()).set(newValue);
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP:
				((FeatureMap.Internal)getLiteralResultElementGroup()).set(newValue);
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
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
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP:
				getSequenceConstructorGroup().clear();
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__VARIABLE:
				getVariable().clear();
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP:
				getInstructionGroup().clear();
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP:
				getLiteralResultElementGroup().clear();
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY:
				getAny().clear();
				return;
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY1:
				getAny1().clear();
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
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP:
				return !getSequenceConstructorGroup().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__VARIABLE:
				return !getVariable().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP:
				return !getInstructionGroup().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__INSTRUCTION:
				return !getInstruction().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP:
				return !getLiteralResultElementGroup().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT:
				return !getLiteralResultElement().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY:
				return !getAny().isEmpty();
			case XSLT20Package.SEQUENCE_CONSTRUCTOR__ANY1:
				return !getAny1().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceConstructorImpl
