/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Element Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.TextElementBaseType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getTextElementBaseType()
 * @model extendedMetaData="name='text-element-base-type' kind='simple'"
 * @generated
 */
public interface TextElementBaseType extends VersionedElementType {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getTextElementBaseType_Value()
     * @model dataType="org.w3._1999.xsl.transform.TextElementBaseTypeBaseBase" transient="true" volatile="true" derived="true"
     *        extendedMetaData="name=':8' kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.TextElementBaseType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // TextElementBaseType
