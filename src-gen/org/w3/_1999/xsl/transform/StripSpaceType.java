/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strip Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.StripSpaceType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getStripSpaceType()
 * @model extendedMetaData="name='strip-space_._type' kind='mixed'"
 * @generated
 */
public interface StripSpaceType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute.
	 * @see #setElements(List)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getStripSpaceType_Elements()
	 * @model dataType="org.w3._1999.xsl.transform.Nametests" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='elements'"
	 * @generated
	 */
	List<Object> getElements();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.StripSpaceType#getElements <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' attribute.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(List<Object> value);

} // StripSpaceType
