/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Templates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getWithParam <em>With Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyTemplatesType()
 * @model extendedMetaData="name='apply-templates_._type' kind='mixed'"
 * @generated
 */
public interface ApplyTemplatesType extends ElementOnlyVersionedElementType {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyTemplatesType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='group:8'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xsl.transform.SortType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sort</em>' containment reference list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyTemplatesType_Sort()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:8'"
     * @generated
     */
    EList<SortType> getSort();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyTemplatesType_WithParam()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='with-param' namespace='##targetNamespace' group='#group:8'"
     * @generated
     */
    EList<WithParamType> getWithParam();

    /**
     * Returns the value of the '<em><b>Select</b></em>' attribute.
     * The default value is <code>"child::node()"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select</em>' attribute.
     * @see #isSetSelect()
     * @see #unsetSelect()
     * @see #setSelect(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyTemplatesType_Select()
     * @model default="child::node()" unsettable="true" dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select</em>' attribute.
     * @see #isSetSelect()
     * @see #unsetSelect()
     * @see #getSelect()
     * @generated
     */
    void setSelect(String value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSelect()
     * @see #getSelect()
     * @see #setSelect(String)
     * @generated
     */
    void unsetSelect();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSelect <em>Select</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Select</em>' attribute is set.
     * @see #unsetSelect()
     * @see #getSelect()
     * @see #setSelect(String)
     * @generated
     */
    boolean isSetSelect();

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see #setMode(Object)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getApplyTemplatesType_Mode()
     * @model dataType="org.w3._1999.xsl.transform.Mode"
     *        extendedMetaData="kind='attribute' name='mode'"
     * @generated
     */
    Object getMode();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see #getMode()
     * @generated
     */
    void setMode(Object value);

} // ApplyTemplatesType
