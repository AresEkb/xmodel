/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getCaseOrder <em>Case Order</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SortType#getStable <em>Stable</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType()
 * @model extendedMetaData="name='sort_._type' kind='mixed'"
 * @generated
 */
public interface SortType extends SequenceConstructor {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_Select()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select</em>' attribute.
     * @see #getSelect()
     * @generated
     */
    void setSelect(String value);

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lang</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #setLang(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_Lang()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * The default value is <code>"text"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see #isSetDataType()
     * @see #unsetDataType()
     * @see #setDataType(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_DataType()
     * @model default="text" unsettable="true" dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='data-type'"
     * @generated
     */
    String getDataType();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see #isSetDataType()
     * @see #unsetDataType()
     * @see #getDataType()
     * @generated
     */
    void setDataType(String value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.SortType#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDataType()
     * @see #getDataType()
     * @see #setDataType(String)
     * @generated
     */
    void unsetDataType();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.SortType#getDataType <em>Data Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Type</em>' attribute is set.
     * @see #unsetDataType()
     * @see #getDataType()
     * @see #setDataType(String)
     * @generated
     */
    boolean isSetDataType();

    /**
     * Returns the value of the '<em><b>Order</b></em>' attribute.
     * The default value is <code>"ascending"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Order</em>' attribute.
     * @see #isSetOrder()
     * @see #unsetOrder()
     * @see #setOrder(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_Order()
     * @model default="ascending" unsettable="true" dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='order'"
     * @generated
     */
    String getOrder();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Order</em>' attribute.
     * @see #isSetOrder()
     * @see #unsetOrder()
     * @see #getOrder()
     * @generated
     */
    void setOrder(String value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.SortType#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOrder()
     * @see #getOrder()
     * @see #setOrder(String)
     * @generated
     */
    void unsetOrder();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.SortType#getOrder <em>Order</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Order</em>' attribute is set.
     * @see #unsetOrder()
     * @see #getOrder()
     * @see #setOrder(String)
     * @generated
     */
    boolean isSetOrder();

    /**
     * Returns the value of the '<em><b>Case Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Case Order</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Case Order</em>' attribute.
     * @see #setCaseOrder(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_CaseOrder()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='case-order'"
     * @generated
     */
    String getCaseOrder();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getCaseOrder <em>Case Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Case Order</em>' attribute.
     * @see #getCaseOrder()
     * @generated
     */
    void setCaseOrder(String value);

    /**
     * Returns the value of the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collation</em>' attribute.
     * @see #setCollation(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_Collation()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='collation'"
     * @generated
     */
    String getCollation();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getCollation <em>Collation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation</em>' attribute.
     * @see #getCollation()
     * @generated
     */
    void setCollation(String value);

    /**
     * Returns the value of the '<em><b>Stable</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stable</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetStable()
     * @see #unsetStable()
     * @see #setStable(YesOrNo)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSortType_Stable()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='stable'"
     * @generated
     */
    YesOrNo getStable();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SortType#getStable <em>Stable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stable</em>' attribute.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see #isSetStable()
     * @see #unsetStable()
     * @see #getStable()
     * @generated
     */
    void setStable(YesOrNo value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.SortType#getStable <em>Stable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStable()
     * @see #getStable()
     * @see #setStable(YesOrNo)
     * @generated
     */
    void unsetStable();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.SortType#getStable <em>Stable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stable</em>' attribute is set.
     * @see #unsetStable()
     * @see #getStable()
     * @see #setStable(YesOrNo)
     * @generated
     */
    boolean isSetStable();

} // SortType
