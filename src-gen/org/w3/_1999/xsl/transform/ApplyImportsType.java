/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Imports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ApplyImportsType#getWithParam <em>With Param</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyImportsType()
 * @model extendedMetaData="name='apply-imports_._type' kind='mixed'"
 * @generated
 */
public interface ApplyImportsType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>With Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.WithParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Param</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyImportsType_WithParam()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='with-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WithParamType> getWithParam();

} // ApplyImportsType
