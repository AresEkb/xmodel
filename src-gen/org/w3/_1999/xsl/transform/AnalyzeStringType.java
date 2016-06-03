/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyze String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.AnalyzeStringType#getMatchingSubstring <em>Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AnalyzeStringType#getNonMatchingSubstring <em>Non Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AnalyzeStringType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AnalyzeStringType#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType()
 * @model extendedMetaData="name='analyze-string_._type' kind='mixed'"
 * @generated
 */
public interface AnalyzeStringType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>Matching Substring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Substring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Substring</em>' containment reference.
	 * @see #setMatchingSubstring(SequenceConstructor)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType_MatchingSubstring()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='matching-substring' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceConstructor getMatchingSubstring();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getMatchingSubstring <em>Matching Substring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Substring</em>' containment reference.
	 * @see #getMatchingSubstring()
	 * @generated
	 */
	void setMatchingSubstring(SequenceConstructor value);

	/**
	 * Returns the value of the '<em><b>Non Matching Substring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Matching Substring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Matching Substring</em>' containment reference.
	 * @see #setNonMatchingSubstring(SequenceConstructor)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType_NonMatchingSubstring()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='non-matching-substring' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceConstructor getNonMatchingSubstring();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getNonMatchingSubstring <em>Non Matching Substring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Matching Substring</em>' containment reference.
	 * @see #getNonMatchingSubstring()
	 * @generated
	 */
	void setNonMatchingSubstring(SequenceConstructor value);

	/**
	 * Returns the value of the '<em><b>Fallback</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.SequenceConstructor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fallback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType_Fallback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fallback' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceConstructor> getFallback();

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType_Select()
	 * @model dataType="org.w3._1999.xsl.transform.Expression" required="true"
	 *        extendedMetaData="kind='attribute' name='select'"
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType_Regex()
	 * @model dataType="org.w3._1999.xsl.transform.Avt" required="true"
	 *        extendedMetaData="kind='attribute' name='regex'"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #isSetFlags()
	 * @see #unsetFlags()
	 * @see #setFlags(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAnalyzeStringType_Flags()
	 * @model default="" unsettable="true" dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='flags'"
	 * @generated
	 */
	String getFlags();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #isSetFlags()
	 * @see #unsetFlags()
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlags()
	 * @see #getFlags()
	 * @see #setFlags(String)
	 * @generated
	 */
	void unsetFlags();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFlags <em>Flags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flags</em>' attribute is set.
	 * @see #unsetFlags()
	 * @see #getFlags()
	 * @see #setFlags(String)
	 * @generated
	 */
	boolean isSetFlags();

} // AnalyzeStringType
