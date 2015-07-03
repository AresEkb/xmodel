/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getOverride <em>Override</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.FunctionType#getAs <em>As</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType()
 * @model extendedMetaData="name='function_._type' kind='mixed'"
 * @generated
 */
public interface FunctionType extends VersionedElementType {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Param()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_SequenceConstructorGroup()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Variable()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_InstructionGroup()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Instruction()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_LiteralResultElementGroup()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_LiteralResultElement()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Any()
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Any1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':16' processing='lax' group='#SequenceConstructorGroup:9'"
     * @generated
     */
    FeatureMap getAny1();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Name()
     * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Override</b></em>' attribute.
     * The default value is <code>"yes"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Override</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Override</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetOverride()
     * @see #unsetOverride()
     * @see #setOverride(YesOrNo)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_Override()
     * @model default="yes" unsettable="true"
     *        extendedMetaData="kind='attribute' name='override'"
     * @generated
     */
    YesOrNo getOverride();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getOverride <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Override</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetOverride()
     * @see #unsetOverride()
     * @see #getOverride()
     * @generated
     */
    void setOverride(YesOrNo value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getOverride <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOverride()
     * @see #getOverride()
     * @see #setOverride(YesOrNo)
     * @generated
     */
    void unsetOverride();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getOverride <em>Override</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Override</em>' attribute is set.
     * @see #unsetOverride()
     * @see #getOverride()
     * @see #setOverride(YesOrNo)
     * @generated
     */
    boolean isSetOverride();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getFunctionType_As()
     * @model default="item()*" unsettable="true" dataType="org.w3._1999.xsl.transform.SequenceType1"
     *        extendedMetaData="kind='attribute' name='as'"
     * @generated
     */
    String getAs();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getAs <em>As</em>}' attribute.
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
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getAs <em>As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAs()
     * @see #getAs()
     * @see #setAs(String)
     * @generated
     */
    void unsetAs();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.FunctionType#getAs <em>As</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>As</em>' attribute is set.
     * @see #unsetAs()
     * @see #getAs()
     * @see #setAs(String)
     * @generated
     */
    boolean isSetAs();

} // FunctionType
