/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupAdjacent <em>Group Adjacent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupStartingWith <em>Group Starting With</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupEndingWith <em>Group Ending With</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ForEachGroupType#getCollation <em>Collation</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType()
 * @model extendedMetaData="name='for-each-group_._type' kind='mixed'"
 * @generated
 */
public interface ForEachGroupType extends VersionedElementType {
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Sort()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_SequenceConstructorGroup()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Variable()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_InstructionGroup()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Instruction()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_LiteralResultElementGroup()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_LiteralResultElement()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Any()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Any1()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Select()
	 * @model dataType="org.w3._1999.xsl.transform.Expression" required="true"
	 *        extendedMetaData="kind='attribute' name='select'"
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachGroupType#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

	/**
	 * Returns the value of the '<em><b>Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' attribute.
	 * @see #setGroupBy(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_GroupBy()
	 * @model dataType="org.w3._1999.xsl.transform.Expression"
	 *        extendedMetaData="kind='attribute' name='group-by'"
	 * @generated
	 */
	String getGroupBy();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupBy <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group By</em>' attribute.
	 * @see #getGroupBy()
	 * @generated
	 */
	void setGroupBy(String value);

	/**
	 * Returns the value of the '<em><b>Group Adjacent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Adjacent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Adjacent</em>' attribute.
	 * @see #setGroupAdjacent(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_GroupAdjacent()
	 * @model dataType="org.w3._1999.xsl.transform.Expression"
	 *        extendedMetaData="kind='attribute' name='group-adjacent'"
	 * @generated
	 */
	String getGroupAdjacent();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupAdjacent <em>Group Adjacent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Adjacent</em>' attribute.
	 * @see #getGroupAdjacent()
	 * @generated
	 */
	void setGroupAdjacent(String value);

	/**
	 * Returns the value of the '<em><b>Group Starting With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Starting With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Starting With</em>' attribute.
	 * @see #setGroupStartingWith(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_GroupStartingWith()
	 * @model dataType="org.w3._1999.xsl.transform.Pattern"
	 *        extendedMetaData="kind='attribute' name='group-starting-with'"
	 * @generated
	 */
	String getGroupStartingWith();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupStartingWith <em>Group Starting With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Starting With</em>' attribute.
	 * @see #getGroupStartingWith()
	 * @generated
	 */
	void setGroupStartingWith(String value);

	/**
	 * Returns the value of the '<em><b>Group Ending With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Ending With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Ending With</em>' attribute.
	 * @see #setGroupEndingWith(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_GroupEndingWith()
	 * @model dataType="org.w3._1999.xsl.transform.Pattern"
	 *        extendedMetaData="kind='attribute' name='group-ending-with'"
	 * @generated
	 */
	String getGroupEndingWith();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupEndingWith <em>Group Ending With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Ending With</em>' attribute.
	 * @see #getGroupEndingWith()
	 * @generated
	 */
	void setGroupEndingWith(String value);

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getForEachGroupType_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ForEachGroupType#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

} // ForEachGroupType
