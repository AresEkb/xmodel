/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Match Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.NextMatchType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NextMatchType#getWithParam <em>With Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.NextMatchType#getFallback <em>Fallback</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getNextMatchType()
 * @model extendedMetaData="name='next-match_._type' kind='mixed'"
 * @generated
 */
public interface NextMatchType extends ElementOnlyVersionedElementType {
    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNextMatchType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='group:8'"
     * @generated
     */
    FeatureMap getGroup();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNextMatchType_WithParam()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='with-param' namespace='##targetNamespace' group='#group:8'"
     * @generated
     */
    EList<WithParamType> getWithParam();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getNextMatchType_Fallback()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='fallback' namespace='##targetNamespace' group='#group:8'"
     * @generated
     */
    EList<SequenceConstructor> getFallback();

} // NextMatchType
