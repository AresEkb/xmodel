/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Of Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ValueOfType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ValueOfType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ValueOfType#getDisableOutputEscaping <em>Disable Output Escaping</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getValueOfType()
 * @model extendedMetaData="name='value-of_._type' kind='mixed'"
 * @generated
 */
public interface ValueOfType extends SequenceConstructor {
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getValueOfType_Select()
	 * @model dataType="org.w3._1999.xsl.transform.Expression"
	 *        extendedMetaData="kind='attribute' name='select'"
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ValueOfType#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getValueOfType_Separator()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='separator'"
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ValueOfType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Disable Output Escaping</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Output Escaping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Output Escaping</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetDisableOutputEscaping()
	 * @see #unsetDisableOutputEscaping()
	 * @see #setDisableOutputEscaping(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getValueOfType_DisableOutputEscaping()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disable-output-escaping'"
	 * @generated
	 */
	YesOrNo getDisableOutputEscaping();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ValueOfType#getDisableOutputEscaping <em>Disable Output Escaping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Output Escaping</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetDisableOutputEscaping()
	 * @see #unsetDisableOutputEscaping()
	 * @see #getDisableOutputEscaping()
	 * @generated
	 */
	void setDisableOutputEscaping(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.ValueOfType#getDisableOutputEscaping <em>Disable Output Escaping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisableOutputEscaping()
	 * @see #getDisableOutputEscaping()
	 * @see #setDisableOutputEscaping(YesOrNo)
	 * @generated
	 */
	void unsetDisableOutputEscaping();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.ValueOfType#getDisableOutputEscaping <em>Disable Output Escaping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disable Output Escaping</em>' attribute is set.
	 * @see #unsetDisableOutputEscaping()
	 * @see #getDisableOutputEscaping()
	 * @see #setDisableOutputEscaping(YesOrNo)
	 * @generated
	 */
	boolean isSetDisableOutputEscaping();

} // ValueOfType
