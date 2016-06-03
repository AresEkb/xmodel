/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachType#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType()
 * @model extendedMetaData="name='for-each_._type' kind='mixed'"
 * @generated
 */
public interface ForEachType extends VersionedElementType {
	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.SortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_Sort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SortType> getSort();

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_SequenceConstructorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='SequenceConstructorGroup:9'"
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_Variable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace' group='#SequenceConstructorGroup:9'"
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_InstructionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='instruction:group' namespace='##targetNamespace' group='#SequenceConstructorGroup:9'"
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_Instruction()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_LiteralResultElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='literal-result-element:group' namespace='##targetNamespace' group='#SequenceConstructorGroup:9'"
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_LiteralResultElement()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':15' processing='lax' group='#SequenceConstructorGroup:9'"
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':16' processing='lax' group='#SequenceConstructorGroup:9'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' attribute.
	 * @see #setSelect(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachType_Select()
	 * @model dataType="org.w3._1999.xsl.transform.Expression" required="true"
	 *        extendedMetaData="kind='attribute' name='select'"
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachType#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

} // ForEachType
