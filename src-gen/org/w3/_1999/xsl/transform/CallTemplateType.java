/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.CallTemplateType#getWithParam <em>With Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.CallTemplateType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getCallTemplateType()
 * @model extendedMetaData="name='call-template_._type' kind='mixed'"
 * @generated
 */
public interface CallTemplateType extends ElementOnlyVersionedElementType {
    /**
     * Returns the value of the '<em><b>With Param</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xsl.transform.WithParamType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>With Param</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>With Param</em>' containment reference list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getCallTemplateType_WithParam()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='with-param' namespace='##targetNamespace'"
     * @generated
     */
    EList<WithParamType> getWithParam();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getCallTemplateType_Name()
     * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.CallTemplateType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // CallTemplateType
