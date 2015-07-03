/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentType#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentType()
 * @model extendedMetaData="name='document_._type' kind='mixed'"
 * @generated
 */
public interface DocumentType extends SequenceConstructor {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentType_Type()
     * @model dataType="org.w3._1999.xsl.transform.QName"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentType#getType <em>Type</em>}' attribute.
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentType_Validation()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='validation'"
     * @generated
     */
    ValidationType getValidation();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentType#getValidation <em>Validation</em>}' attribute.
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
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.DocumentType#getValidation <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValidation()
     * @see #getValidation()
     * @see #setValidation(ValidationType)
     * @generated
     */
    void unsetValidation();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DocumentType#getValidation <em>Validation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Validation</em>' attribute is set.
     * @see #unsetValidation()
     * @see #getValidation()
     * @see #setValidation(ValidationType)
     * @generated
     */
    boolean isSetValidation();

} // DocumentType
