/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceConstructor#getAny1 <em>Any1</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor()
 * @model extendedMetaData="name='sequence-constructor' kind='mixed'"
 * @generated
 */
public interface SequenceConstructor extends VersionedElementType {
	/**
	 * Returns the value of the '<em><b>Sequence Constructor Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Constructor Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Constructor Group</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_SequenceConstructorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='SequenceConstructorGroup:8'"
	 * @generated
	 */
	FeatureMap getSequenceConstructorGroup();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_Variable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace' group='#SequenceConstructorGroup:8'"
	 * @generated
	 */
	EList<VariableType> getVariable();

	/**
	 * Returns the value of the '<em><b>Instruction Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Group</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_InstructionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='instruction:group' namespace='##targetNamespace' group='#SequenceConstructorGroup:8'"
	 * @generated
	 */
	FeatureMap getInstructionGroup();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.VersionedElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_Instruction()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='instruction' namespace='##targetNamespace' group='instruction:group'"
	 * @generated
	 */
	EList<VersionedElementType> getInstruction();

	/**
	 * Returns the value of the '<em><b>Literal Result Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Result Element Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Result Element Group</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_LiteralResultElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='literal-result-element:group' namespace='##targetNamespace' group='#SequenceConstructorGroup:8'"
	 * @generated
	 */
	FeatureMap getLiteralResultElementGroup();

	/**
	 * Returns the value of the '<em><b>Literal Result Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Result Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Result Element</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_LiteralResultElement()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literal-result-element' namespace='##targetNamespace' group='literal-result-element:group'"
	 * @generated
	 */
	EList<EObject> getLiteralResultElement();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':14' processing='lax' group='#SequenceConstructorGroup:8'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any1</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceConstructor_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':15' processing='lax' group='#SequenceConstructorGroup:8'"
	 * @generated
	 */
	FeatureMap getAny1();

} // SequenceConstructor
