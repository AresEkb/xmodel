/**
 */
package org.w3._1999.xhtml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.BaseType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.BaseType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getBaseType()
 * @model extendedMetaData="name='xhtml.base.type' kind='elementOnly'"
 * @generated
 */
public interface BaseType extends EObject {
    /**
     * Returns the value of the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Href</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Href</em>' attribute.
     * @see #setHref(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getBaseType_Href()
     * @model dataType="org.w3._1999.xhtml.datatypes.URI" required="true"
     *        extendedMetaData="kind='attribute' name='href'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.BaseType#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' attribute.
     * @see #setTarget(Object)
     * @see org.w3._1999.xhtml.XHTML11Package#getBaseType_Target()
     * @model dataType="org.w3._1999.xhtml.datatypes.FrameTarget"
     *        extendedMetaData="kind='attribute' name='target'"
     * @generated
     */
    Object getTarget();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.BaseType#getTarget <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' attribute.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Object value);

} // BaseType
