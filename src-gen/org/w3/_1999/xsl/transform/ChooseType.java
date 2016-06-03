/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choose Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ChooseType#getWhen <em>When</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ChooseType#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getChooseType()
 * @model extendedMetaData="name='choose_._type' kind='mixed'"
 * @generated
 */
public interface ChooseType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.WhenType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getChooseType_When()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WhenType> getWhen();

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference.
	 * @see #setOtherwise(SequenceConstructor)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getChooseType_Otherwise()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceConstructor getOtherwise();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ChooseType#getOtherwise <em>Otherwise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' containment reference.
	 * @see #getOtherwise()
	 * @generated
	 */
	void setOtherwise(SequenceConstructor value);

} // ChooseType
