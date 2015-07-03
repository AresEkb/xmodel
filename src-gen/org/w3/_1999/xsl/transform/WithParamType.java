/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.WithParamType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.WithParamType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.WithParamType#getAs <em>As</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.WithParamType#getTunnel <em>Tunnel</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getWithParamType()
 * @model extendedMetaData="name='with-param_._type' kind='mixed'"
 * @generated
 */
public interface WithParamType extends SequenceConstructor {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getWithParamType_Name()
     * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.WithParamType#getName <em>Name</em>}' attribute.
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getWithParamType_Select()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.WithParamType#getSelect <em>Select</em>}' attribute.
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getWithParamType_As()
     * @model dataType="org.w3._1999.xsl.transform.SequenceType1"
     *        extendedMetaData="kind='attribute' name='as'"
     * @generated
     */
    String getAs();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.WithParamType#getAs <em>As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>As</em>' attribute.
     * @see #getAs()
     * @generated
     */
    void setAs(String value);

    /**
     * Returns the value of the '<em><b>Tunnel</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tunnel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tunnel</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetTunnel()
     * @see #unsetTunnel()
     * @see #setTunnel(YesOrNo)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getWithParamType_Tunnel()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='tunnel'"
     * @generated
     */
    YesOrNo getTunnel();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.WithParamType#getTunnel <em>Tunnel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tunnel</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetTunnel()
     * @see #unsetTunnel()
     * @see #getTunnel()
     * @generated
     */
    void setTunnel(YesOrNo value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.WithParamType#getTunnel <em>Tunnel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTunnel()
     * @see #getTunnel()
     * @see #setTunnel(YesOrNo)
     * @generated
     */
    void unsetTunnel();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.WithParamType#getTunnel <em>Tunnel</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tunnel</em>' attribute is set.
     * @see #unsetTunnel()
     * @see #getTunnel()
     * @see #setTunnel(YesOrNo)
     * @generated
     */
    boolean isSetTunnel();

} // WithParamType
