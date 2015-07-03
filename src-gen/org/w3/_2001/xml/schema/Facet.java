/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.Facet#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Facet#isFixed <em>Fixed</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getFacet()
 * @model extendedMetaData="name='facet' kind='mixed'"
 * @generated
 */
public interface Facet extends Annotated {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Object)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getFacet_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    Object getValue();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Facet#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Object value);

    /**
     * Returns the value of the '<em><b>Fixed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed</em>' attribute.
     * @see #isSetFixed()
     * @see #unsetFixed()
     * @see #setFixed(boolean)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getFacet_Fixed()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='fixed'"
     * @generated
     */
    boolean isFixed();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Facet#isFixed <em>Fixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed</em>' attribute.
     * @see #isSetFixed()
     * @see #unsetFixed()
     * @see #isFixed()
     * @generated
     */
    void setFixed(boolean value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.Facet#isFixed <em>Fixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFixed()
     * @see #isFixed()
     * @see #setFixed(boolean)
     * @generated
     */
    void unsetFixed();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.Facet#isFixed <em>Fixed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed</em>' attribute is set.
     * @see #unsetFixed()
     * @see #isFixed()
     * @see #setFixed(boolean)
     * @generated
     */
    boolean isSetFixed();

} // Facet
