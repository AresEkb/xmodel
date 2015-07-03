/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ElementType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ElementType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ElementType#getInheritNamespaces <em>Inherit Namespaces</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ElementType#getUseAttributeSets <em>Use Attribute Sets</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ElementType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ElementType#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType()
 * @model extendedMetaData="name='element_._type' kind='mixed'"
 * @generated
 */
public interface ElementType extends SequenceConstructor {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType_Name()
     * @model dataType="org.w3._1999.xsl.transform.Avt" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType_Namespace()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='namespace'"
     * @generated
     */
    String getNamespace();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(String value);

    /**
     * Returns the value of the '<em><b>Inherit Namespaces</b></em>' attribute.
     * The default value is <code>"yes"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inherit Namespaces</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inherit Namespaces</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetInheritNamespaces()
     * @see #unsetInheritNamespaces()
     * @see #setInheritNamespaces(YesOrNo)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType_InheritNamespaces()
     * @model default="yes" unsettable="true"
     *        extendedMetaData="kind='attribute' name='inherit-namespaces'"
     * @generated
     */
    YesOrNo getInheritNamespaces();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getInheritNamespaces <em>Inherit Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inherit Namespaces</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetInheritNamespaces()
     * @see #unsetInheritNamespaces()
     * @see #getInheritNamespaces()
     * @generated
     */
    void setInheritNamespaces(YesOrNo value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getInheritNamespaces <em>Inherit Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInheritNamespaces()
     * @see #getInheritNamespaces()
     * @see #setInheritNamespaces(YesOrNo)
     * @generated
     */
    void unsetInheritNamespaces();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.ElementType#getInheritNamespaces <em>Inherit Namespaces</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inherit Namespaces</em>' attribute is set.
     * @see #unsetInheritNamespaces()
     * @see #getInheritNamespaces()
     * @see #setInheritNamespaces(YesOrNo)
     * @generated
     */
    boolean isSetInheritNamespaces();

    /**
     * Returns the value of the '<em><b>Use Attribute Sets</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Attribute Sets</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Attribute Sets</em>' attribute.
     * @see #isSetUseAttributeSets()
     * @see #unsetUseAttributeSets()
     * @see #setUseAttributeSets(List)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType_UseAttributeSets()
     * @model default="" unsettable="true" dataType="org.w3._1999.xsl.transform.QNames" many="false"
     *        extendedMetaData="kind='attribute' name='use-attribute-sets'"
     * @generated
     */
    List<String> getUseAttributeSets();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getUseAttributeSets <em>Use Attribute Sets</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Attribute Sets</em>' attribute.
     * @see #isSetUseAttributeSets()
     * @see #unsetUseAttributeSets()
     * @see #getUseAttributeSets()
     * @generated
     */
    void setUseAttributeSets(List<String> value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getUseAttributeSets <em>Use Attribute Sets</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseAttributeSets()
     * @see #getUseAttributeSets()
     * @see #setUseAttributeSets(List)
     * @generated
     */
    void unsetUseAttributeSets();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.ElementType#getUseAttributeSets <em>Use Attribute Sets</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Attribute Sets</em>' attribute is set.
     * @see #unsetUseAttributeSets()
     * @see #getUseAttributeSets()
     * @see #setUseAttributeSets(List)
     * @generated
     */
    boolean isSetUseAttributeSets();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType_Type()
     * @model dataType="org.w3._1999.xsl.transform.QName"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Validation</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.ValidationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Validation</em>' attribute.
     * @see org.w3._1999.xsl.transform.ValidationType
     * @see #isSetValidation()
     * @see #unsetValidation()
     * @see #setValidation(ValidationType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getElementType_Validation()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='validation'"
     * @generated
     */
    ValidationType getValidation();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getValidation <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation</em>' attribute.
     * @see org.w3._1999.xsl.transform.ValidationType
     * @see #isSetValidation()
     * @see #unsetValidation()
     * @see #getValidation()
     * @generated
     */
    void setValidation(ValidationType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.ElementType#getValidation <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValidation()
     * @see #getValidation()
     * @see #setValidation(ValidationType)
     * @generated
     */
    void unsetValidation();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.ElementType#getValidation <em>Validation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Validation</em>' attribute is set.
     * @see #unsetValidation()
     * @see #getValidation()
     * @see #setValidation(ValidationType)
     * @generated
     */
    boolean isSetValidation();

} // ElementType
