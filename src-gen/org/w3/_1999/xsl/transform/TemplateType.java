/**
 */
package org.w3._1999.xsl.transform;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getMatch <em>Match</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getMode <em>Mode</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TemplateType#getAs <em>As</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType()
 * @model extendedMetaData="name='template_._type' kind='mixed'"
 * @generated
 */
public interface TemplateType extends VersionedElementType {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.ParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Param()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamType> getParam();

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_SequenceConstructorGroup()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Variable()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_InstructionGroup()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Instruction()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_LiteralResultElementGroup()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_LiteralResultElement()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Any()
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':16' processing='lax' group='#SequenceConstructorGroup:9'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see #setMatch(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Match()
	 * @model dataType="org.w3._1999.xsl.transform.Pattern"
	 *        extendedMetaData="kind='attribute' name='match'"
	 * @generated
	 */
	String getMatch();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(BigDecimal)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Priority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	BigDecimal getPriority();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(Object)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Mode()
	 * @model dataType="org.w3._1999.xsl.transform.Modes"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	Object getMode();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_Name()
	 * @model dataType="org.w3._1999.xsl.transform.QName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>As</b></em>' attribute.
	 * The default value is <code>"item()*"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' attribute.
	 * @see #isSetAs()
	 * @see #unsetAs()
	 * @see #setAs(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTemplateType_As()
	 * @model default="item()*" unsettable="true" dataType="org.w3._1999.xsl.transform.SequenceType1"
	 *        extendedMetaData="kind='attribute' name='as'"
	 * @generated
	 */
	String getAs();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getAs <em>As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As</em>' attribute.
	 * @see #isSetAs()
	 * @see #unsetAs()
	 * @see #getAs()
	 * @generated
	 */
	void setAs(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getAs <em>As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAs()
	 * @see #getAs()
	 * @see #setAs(String)
	 * @generated
	 */
	void unsetAs();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.TemplateType#getAs <em>As</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>As</em>' attribute is set.
	 * @see #unsetAs()
	 * @see #getAs()
	 * @see #setAs(String)
	 * @generated
	 */
	boolean isSetAs();

} // TemplateType
