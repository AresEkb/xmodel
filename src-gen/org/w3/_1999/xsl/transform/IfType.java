/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.IfType#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getIfType()
 * @model extendedMetaData="name='if_._type' kind='mixed'"
 * @generated
 */
public interface IfType extends SequenceConstructor {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getIfType_Test()
	 * @model dataType="org.w3._1999.xsl.transform.Expression" required="true"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.IfType#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

} // IfType
