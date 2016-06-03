/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Character Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.OutputCharacterType#getCharacter <em>Character</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputCharacterType#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputCharacterType()
 * @model extendedMetaData="name='output-character_._type' kind='mixed'"
 * @generated
 */
public interface OutputCharacterType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' attribute.
	 * @see #setCharacter(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputCharacterType_Character()
	 * @model dataType="org.w3._1999.xsl.transform.Char" required="true"
	 *        extendedMetaData="kind='attribute' name='character'"
	 * @generated
	 */
	String getCharacter();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputCharacterType#getCharacter <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' attribute.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(String value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputCharacterType_String()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='string'"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputCharacterType#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // OutputCharacterType
