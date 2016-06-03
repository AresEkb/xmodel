/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.TextType#getDisableOutputEscaping <em>Disable Output Escaping</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getTextType()
 * @model extendedMetaData="name='text_._type' kind='simple'"
 * @generated
 */
public interface TextType extends TextElementBaseType {
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getTextType_DisableOutputEscaping()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disable-output-escaping'"
	 * @generated
	 */
	YesOrNo getDisableOutputEscaping();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.TextType#getDisableOutputEscaping <em>Disable Output Escaping</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.TextType#getDisableOutputEscaping <em>Disable Output Escaping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisableOutputEscaping()
	 * @see #getDisableOutputEscaping()
	 * @see #setDisableOutputEscaping(YesOrNo)
	 * @generated
	 */
	void unsetDisableOutputEscaping();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.TextType#getDisableOutputEscaping <em>Disable Output Escaping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disable Output Escaping</em>' attribute is set.
	 * @see #unsetDisableOutputEscaping()
	 * @see #getDisableOutputEscaping()
	 * @see #setDisableOutputEscaping(YesOrNo)
	 * @generated
	 */
	boolean isSetDisableOutputEscaping();

} // TextType
