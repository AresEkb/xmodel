/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getLevel <em>Level</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getCount <em>Count</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getFrom <em>From</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getFormat <em>Format</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getLetterValue <em>Letter Value</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getGroupingSeparator <em>Grouping Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NumberType#getGroupingSize <em>Grouping Size</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType()
 * @model extendedMetaData="name='number_._type' kind='mixed'"
 * @generated
 */
public interface NumberType extends VersionedElementType {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Value()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Select()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select</em>' attribute.
     * @see #getSelect()
     * @generated
     */
    void setSelect(String value);

    /**
     * Returns the value of the '<em><b>Level</b></em>' attribute.
     * The default value is <code>"single"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xsl.transform.Level}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Level</em>' attribute.
     * @see org.w3._1999.xsl.transform.Level
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #setLevel(Level)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Level()
     * @model default="single" unsettable="true"
     *        extendedMetaData="kind='attribute' name='level'"
     * @generated
     */
    Level getLevel();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Level</em>' attribute.
     * @see org.w3._1999.xsl.transform.Level
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #getLevel()
     * @generated
     */
    void setLevel(Level value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLevel()
     * @see #getLevel()
     * @see #setLevel(Level)
     * @generated
     */
    void unsetLevel();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.NumberType#getLevel <em>Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Level</em>' attribute is set.
     * @see #unsetLevel()
     * @see #getLevel()
     * @see #setLevel(Level)
     * @generated
     */
    boolean isSetLevel();

    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Count</em>' attribute.
     * @see #setCount(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Count()
     * @model dataType="org.w3._1999.xsl.transform.Pattern"
     *        extendedMetaData="kind='attribute' name='count'"
     * @generated
     */
    String getCount();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Count</em>' attribute.
     * @see #getCount()
     * @generated
     */
    void setCount(String value);

    /**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_From()
     * @model dataType="org.w3._1999.xsl.transform.Pattern"
     *        extendedMetaData="kind='attribute' name='from'"
     * @generated
     */
    String getFrom();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
    void setFrom(String value);

    /**
     * Returns the value of the '<em><b>Format</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Format</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Format</em>' attribute.
     * @see #isSetFormat()
     * @see #unsetFormat()
     * @see #setFormat(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Format()
     * @model default="1" unsettable="true" dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='format'"
     * @generated
     */
    String getFormat();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getFormat <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Format</em>' attribute.
     * @see #isSetFormat()
     * @see #unsetFormat()
     * @see #getFormat()
     * @generated
     */
    void setFormat(String value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getFormat <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFormat()
     * @see #getFormat()
     * @see #setFormat(String)
     * @generated
     */
    void unsetFormat();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.NumberType#getFormat <em>Format</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Format</em>' attribute is set.
     * @see #unsetFormat()
     * @see #getFormat()
     * @see #setFormat(String)
     * @generated
     */
    boolean isSetFormat();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Lang()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

    /**
     * Returns the value of the '<em><b>Letter Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Letter Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Letter Value</em>' attribute.
     * @see #setLetterValue(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_LetterValue()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='letter-value'"
     * @generated
     */
    String getLetterValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getLetterValue <em>Letter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Letter Value</em>' attribute.
     * @see #getLetterValue()
     * @generated
     */
    void setLetterValue(String value);

    /**
     * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ordinal</em>' attribute.
     * @see #setOrdinal(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_Ordinal()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='ordinal'"
     * @generated
     */
    String getOrdinal();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getOrdinal <em>Ordinal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ordinal</em>' attribute.
     * @see #getOrdinal()
     * @generated
     */
    void setOrdinal(String value);

    /**
     * Returns the value of the '<em><b>Grouping Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grouping Separator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grouping Separator</em>' attribute.
     * @see #setGroupingSeparator(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_GroupingSeparator()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='grouping-separator'"
     * @generated
     */
    String getGroupingSeparator();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getGroupingSeparator <em>Grouping Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grouping Separator</em>' attribute.
     * @see #getGroupingSeparator()
     * @generated
     */
    void setGroupingSeparator(String value);

    /**
     * Returns the value of the '<em><b>Grouping Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grouping Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grouping Size</em>' attribute.
     * @see #setGroupingSize(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNumberType_GroupingSize()
     * @model dataType="org.w3._1999.xsl.transform.Avt"
     *        extendedMetaData="kind='attribute' name='grouping-size'"
     * @generated
     */
    String getGroupingSize();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.NumberType#getGroupingSize <em>Grouping Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grouping Size</em>' attribute.
     * @see #getGroupingSize()
     * @generated
     */
    void setGroupingSize(String value);

} // NumberType
