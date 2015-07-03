/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Alias Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.NamespaceAliasType#getStylesheetPrefix <em>Stylesheet Prefix</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NamespaceAliasType#getResultPrefix <em>Result Prefix</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getNamespaceAliasType()
 * @model extendedMetaData="name='namespace-alias_._type' kind='mixed'"
 * @generated
 */
public interface NamespaceAliasType extends ElementOnlyVersionedElementType {
    /**
     * Returns the value of the '<em><b>Stylesheet Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stylesheet Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stylesheet Prefix</em>' attribute.
     * @see #setStylesheetPrefix(Object)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNamespaceAliasType_StylesheetPrefix()
     * @model dataType="org.w3._1999.xsl.transform.PrefixOrDefault" required="true"
     *        extendedMetaData="kind='attribute' name='stylesheet-prefix'"
     * @generated
     */
    Object getStylesheetPrefix();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NamespaceAliasType#getStylesheetPrefix <em>Stylesheet Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stylesheet Prefix</em>' attribute.
     * @see #getStylesheetPrefix()
     * @generated
     */
    void setStylesheetPrefix(Object value);

    /**
     * Returns the value of the '<em><b>Result Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result Prefix</em>' attribute.
     * @see #setResultPrefix(Object)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNamespaceAliasType_ResultPrefix()
     * @model dataType="org.w3._1999.xsl.transform.PrefixOrDefault" required="true"
     *        extendedMetaData="kind='attribute' name='result-prefix'"
     * @generated
     */
    Object getResultPrefix();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NamespaceAliasType#getResultPrefix <em>Result Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result Prefix</em>' attribute.
     * @see #getResultPrefix()
     * @generated
     */
    void setResultPrefix(Object value);

} // NamespaceAliasType
