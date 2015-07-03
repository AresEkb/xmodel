/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.SequenceType#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceType()
 * @model extendedMetaData="name='sequence_._type' kind='mixed'"
 * @generated
 */
public interface SequenceType extends ElementOnlyVersionedElementType {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='group:8'"
     * @generated
     */
    FeatureMap getGroup();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceType_Fallback()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='fallback' namespace='##targetNamespace' group='#group:8'"
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getSequenceType_Select()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.SequenceType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select</em>' attribute.
     * @see #getSelect()
     * @generated
     */
    void setSelect(String value);

} // SequenceType
