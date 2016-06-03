/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.MessageType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.MessageType#getTerminate <em>Terminate</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getMessageType()
 * @model extendedMetaData="name='message_._type' kind='mixed'"
 * @generated
 */
public interface MessageType extends SequenceConstructor {
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getMessageType_Select()
	 * @model dataType="org.w3._1999.xsl.transform.Expression"
	 *        extendedMetaData="kind='attribute' name='select'"
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.MessageType#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

	/**
	 * Returns the value of the '<em><b>Terminate</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminate</em>' attribute.
	 * @see #isSetTerminate()
	 * @see #unsetTerminate()
	 * @see #setTerminate(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getMessageType_Terminate()
	 * @model default="no" unsettable="true" dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='terminate'"
	 * @generated
	 */
	String getTerminate();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.MessageType#getTerminate <em>Terminate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminate</em>' attribute.
	 * @see #isSetTerminate()
	 * @see #unsetTerminate()
	 * @see #getTerminate()
	 * @generated
	 */
	void setTerminate(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.MessageType#getTerminate <em>Terminate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTerminate()
	 * @see #getTerminate()
	 * @see #setTerminate(String)
	 * @generated
	 */
	void unsetTerminate();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.MessageType#getTerminate <em>Terminate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Terminate</em>' attribute is set.
	 * @see #unsetTerminate()
	 * @see #getTerminate()
	 * @see #setTerminate(String)
	 * @generated
	 */
	boolean isSetTerminate();

} // MessageType
