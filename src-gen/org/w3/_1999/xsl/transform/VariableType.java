/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.VariableType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.VariableType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.VariableType#getAs <em>As</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getVariableType()
 * @model extendedMetaData="name='variable_._type' kind='mixed'"
 * @generated
 */
public interface VariableType extends SequenceConstructor {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getVariableType_Name()
     * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.VariableType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getVariableType_Select()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.VariableType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select</em>' attribute.
     * @see #getSelect()
     * @generated
     */
    void setSelect(String value);

    /**
     * Returns the value of the '<em><b>As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>As</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>As</em>' attribute.
     * @see #setAs(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getVariableType_As()
     * @model dataType="org.w3._1999.xsl.transform.SequenceType1"
     *        extendedMetaData="kind='attribute' name='as'"
     * @generated
     */
    String getAs();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.VariableType#getAs <em>As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>As</em>' attribute.
     * @see #getAs()
     * @generated
     */
    void setAs(String value);

} // VariableType
