/**
 */
package org.w3._1999.xsl.transform;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.VersionedElementType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getVersionedElementType()
 * @model extendedMetaData="name='versioned-element-type' kind='mixed'"
 * @generated
 */
public interface VersionedElementType extends GenericElementType {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(BigDecimal)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getVersionedElementType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	BigDecimal getVersion();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.VersionedElementType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BigDecimal value);

} // VersionedElementType
