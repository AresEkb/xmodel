/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getDeclarationGroup <em>Declaration Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getDefaultValidation <em>Default Validation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.TransformType#getInputTypeAnnotations <em>Input Type Annotations</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType()
 * @model extendedMetaData="name='transform_._type' kind='mixed'"
 * @generated
 */
public interface TransformType extends TransformElementBaseType {
    /**
     * Returns the value of the '<em><b>Import</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xsl.transform.ImportType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Import</em>' containment reference list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Import()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
     * @generated
     */
    EList<ImportType> getImport();

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='group:9'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Declaration Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declaration Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declaration Group</em>' attribute list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_DeclarationGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='declaration:group' namespace='##targetNamespace' group='#group:9'"
     * @generated
     */
    FeatureMap getDeclarationGroup();

    /**
     * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xsl.transform.GenericElementType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declaration</em>' containment reference list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Declaration()
     * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='declaration' namespace='##targetNamespace' group='declaration:group'"
     * @generated
     */
    EList<GenericElementType> getDeclaration();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Variable()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace' group='#group:9'"
     * @generated
     */
    EList<VariableType> getVariable();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Param()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace' group='#group:9'"
     * @generated
     */
    EList<ParamType> getParam();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':14' processing='lax' group='#group:9'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.TransformType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Default Validation</b></em>' attribute.
     * The default value is <code>"strip"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.ValidationStripOrPreserve}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Validation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Validation</em>' attribute.
     * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
     * @see #isSetDefaultValidation()
     * @see #unsetDefaultValidation()
     * @see #setDefaultValidation(ValidationStripOrPreserve)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_DefaultValidation()
     * @model default="strip" unsettable="true"
     *        extendedMetaData="kind='attribute' name='default-validation'"
     * @generated
     */
    ValidationStripOrPreserve getDefaultValidation();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.TransformType#getDefaultValidation <em>Default Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Validation</em>' attribute.
     * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
     * @see #isSetDefaultValidation()
     * @see #unsetDefaultValidation()
     * @see #getDefaultValidation()
     * @generated
     */
    void setDefaultValidation(ValidationStripOrPreserve value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.TransformType#getDefaultValidation <em>Default Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDefaultValidation()
     * @see #getDefaultValidation()
     * @see #setDefaultValidation(ValidationStripOrPreserve)
     * @generated
     */
    void unsetDefaultValidation();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.TransformType#getDefaultValidation <em>Default Validation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Default Validation</em>' attribute is set.
     * @see #unsetDefaultValidation()
     * @see #getDefaultValidation()
     * @see #setDefaultValidation(ValidationStripOrPreserve)
     * @generated
     */
    boolean isSetDefaultValidation();

    /**
     * Returns the value of the '<em><b>Input Type Annotations</b></em>' attribute.
     * The default value is <code>"unspecified"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.InputTypeAnnotationsType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Type Annotations</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Type Annotations</em>' attribute.
     * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
     * @see #isSetInputTypeAnnotations()
     * @see #unsetInputTypeAnnotations()
     * @see #setInputTypeAnnotations(InputTypeAnnotationsType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTransformType_InputTypeAnnotations()
     * @model default="unspecified" unsettable="true"
     *        extendedMetaData="kind='attribute' name='input-type-annotations'"
     * @generated
     */
    InputTypeAnnotationsType getInputTypeAnnotations();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.TransformType#getInputTypeAnnotations <em>Input Type Annotations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Type Annotations</em>' attribute.
     * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
     * @see #isSetInputTypeAnnotations()
     * @see #unsetInputTypeAnnotations()
     * @see #getInputTypeAnnotations()
     * @generated
     */
    void setInputTypeAnnotations(InputTypeAnnotationsType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.TransformType#getInputTypeAnnotations <em>Input Type Annotations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputTypeAnnotations()
     * @see #getInputTypeAnnotations()
     * @see #setInputTypeAnnotations(InputTypeAnnotationsType)
     * @generated
     */
    void unsetInputTypeAnnotations();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.TransformType#getInputTypeAnnotations <em>Input Type Annotations</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Type Annotations</em>' attribute is set.
     * @see #unsetInputTypeAnnotations()
     * @see #getInputTypeAnnotations()
     * @see #setInputTypeAnnotations(InputTypeAnnotationsType)
     * @generated
     */
    boolean isSetInputTypeAnnotations();

} // TransformType
