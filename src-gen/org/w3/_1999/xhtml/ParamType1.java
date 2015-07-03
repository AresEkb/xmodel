/**
 */
package org.w3._1999.xhtml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.ParamType1#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.ParamType1#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.ParamType1#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.ParamType1#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.ParamType1#getValuetype <em>Valuetype</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getParamType1()
 * @model extendedMetaData="name='xhtml.param.type' kind='elementOnly'"
 * @generated
 */
public interface ParamType1 extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getParamType1_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.ParamType1#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getParamType1_Name()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.ParamType1#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getParamType1_Type()
     * @model dataType="org.w3._1999.xhtml.datatypes.ContentType"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.ParamType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getParamType1_Value()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.ParamType1#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Valuetype</b></em>' attribute.
     * The default value is <code>"data"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.ValuetypeType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valuetype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valuetype</em>' attribute.
     * @see org.w3._1999.xhtml.ValuetypeType1
     * @see #isSetValuetype()
     * @see #unsetValuetype()
     * @see #setValuetype(ValuetypeType1)
     * @see org.w3._1999.xhtml.XHTML11Package#getParamType1_Valuetype()
     * @model default="data" unsettable="true"
     *        extendedMetaData="kind='attribute' name='valuetype'"
     * @generated
     */
    ValuetypeType1 getValuetype();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.ParamType1#getValuetype <em>Valuetype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valuetype</em>' attribute.
     * @see org.w3._1999.xhtml.ValuetypeType1
     * @see #isSetValuetype()
     * @see #unsetValuetype()
     * @see #getValuetype()
     * @generated
     */
    void setValuetype(ValuetypeType1 value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.ParamType1#getValuetype <em>Valuetype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValuetype()
     * @see #getValuetype()
     * @see #setValuetype(ValuetypeType1)
     * @generated
     */
    void unsetValuetype();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.ParamType1#getValuetype <em>Valuetype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Valuetype</em>' attribute is set.
     * @see #unsetValuetype()
     * @see #getValuetype()
     * @see #setValuetype(ValuetypeType1)
     * @generated
     */
    boolean isSetValuetype();

} // ParamType1