/**
 */
package org.w3._1999.xhtml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.InputType#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getInputmode <em>Inputmode</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnblur <em>Onblur</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnchange <em>Onchange</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnfocus <em>Onfocus</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getOnselect <em>Onselect</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getSize <em>Size</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getSrc <em>Src</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.InputType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getInputType()
 * @model extendedMetaData="name='xhtml.input.type' kind='elementOnly'"
 * @generated
 */
public interface InputType extends EObject {
    /**
     * Returns the value of the '<em><b>Accept</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accept</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accept</em>' attribute.
     * @see #setAccept(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Accept()
     * @model dataType="org.w3._1999.xhtml.datatypes.ContentTypes"
     *        extendedMetaData="kind='attribute' name='accept'"
     * @generated
     */
    String getAccept();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getAccept <em>Accept</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accept</em>' attribute.
     * @see #getAccept()
     * @generated
     */
    void setAccept(String value);

    /**
     * Returns the value of the '<em><b>Accesskey</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accesskey</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accesskey</em>' attribute.
     * @see #setAccesskey(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Accesskey()
     * @model dataType="org.w3._1999.xhtml.datatypes.Character"
     *        extendedMetaData="kind='attribute' name='accesskey'"
     * @generated
     */
    String getAccesskey();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getAccesskey <em>Accesskey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accesskey</em>' attribute.
     * @see #getAccesskey()
     * @generated
     */
    void setAccesskey(String value);

    /**
     * Returns the value of the '<em><b>Alt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alt</em>' attribute.
     * @see #setAlt(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Alt()
     * @model dataType="org.w3._1999.xhtml.datatypes.Text"
     *        extendedMetaData="kind='attribute' name='alt'"
     * @generated
     */
    String getAlt();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getAlt <em>Alt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alt</em>' attribute.
     * @see #getAlt()
     * @generated
     */
    void setAlt(String value);

    /**
     * Returns the value of the '<em><b>Checked</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.CheckedType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Checked</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Checked</em>' attribute.
     * @see org.w3._1999.xhtml.CheckedType
     * @see #isSetChecked()
     * @see #unsetChecked()
     * @see #setChecked(CheckedType)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Checked()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='checked'"
     * @generated
     */
    CheckedType getChecked();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getChecked <em>Checked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Checked</em>' attribute.
     * @see org.w3._1999.xhtml.CheckedType
     * @see #isSetChecked()
     * @see #unsetChecked()
     * @see #getChecked()
     * @generated
     */
    void setChecked(CheckedType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.InputType#getChecked <em>Checked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChecked()
     * @see #getChecked()
     * @see #setChecked(CheckedType)
     * @generated
     */
    void unsetChecked();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.InputType#getChecked <em>Checked</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Checked</em>' attribute is set.
     * @see #unsetChecked()
     * @see #getChecked()
     * @see #setChecked(CheckedType)
     * @generated
     */
    boolean isSetChecked();

    /**
     * Returns the value of the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' attribute.
     * @see #setClass(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

    /**
     * Returns the value of the '<em><b>Disabled</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.DisabledType5}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disabled</em>' attribute.
     * @see org.w3._1999.xhtml.DisabledType5
     * @see #isSetDisabled()
     * @see #unsetDisabled()
     * @see #setDisabled(DisabledType5)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Disabled()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='disabled'"
     * @generated
     */
    DisabledType5 getDisabled();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disabled</em>' attribute.
     * @see org.w3._1999.xhtml.DisabledType5
     * @see #isSetDisabled()
     * @see #unsetDisabled()
     * @see #getDisabled()
     * @generated
     */
    void setDisabled(DisabledType5 value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.InputType#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisabled()
     * @see #getDisabled()
     * @see #setDisabled(DisabledType5)
     * @generated
     */
    void unsetDisabled();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.InputType#getDisabled <em>Disabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disabled</em>' attribute is set.
     * @see #unsetDisabled()
     * @see #getDisabled()
     * @see #setDisabled(DisabledType5)
     * @generated
     */
    boolean isSetDisabled();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Inputmode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputmode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputmode</em>' attribute.
     * @see #setInputmode(Object)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Inputmode()
     * @model dataType="org.w3._1999.xhtml.datatypes.FrameTarget"
     *        extendedMetaData="kind='attribute' name='inputmode'"
     * @generated
     */
    Object getInputmode();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getInputmode <em>Inputmode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inputmode</em>' attribute.
     * @see #getInputmode()
     * @generated
     */
    void setInputmode(Object value);

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *     <div xmlns="http://www.w3.org/1999/xhtml">
     *      
     *       <h3>lang (as an attribute name)</h3>
     *       <p>
     *        denotes an attribute whose value
     *        is a language code for the natural language of the content of
     *        any element; its value is inherited.  This name is reserved
     *        by virtue of its definition in the XML specification.</p>
     *      
     *     </div>
     *     <div xmlns="http://www.w3.org/1999/xhtml">
     *      <h4>Notes</h4>
     *      <p>
     *       Attempting to install the relevant ISO 2- and 3-letter
     *       codes as the enumerated possible values is probably never
     *       going to be a realistic possibility.  
     *      </p>
     *      <p>
     *       See BCP 47 at <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
     *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
     *       and the IANA language subtag registry at
     *       <a href="http://www.iana.org/assignments/language-subtag-registry">
     *        http://www.iana.org/assignments/language-subtag-registry</a>
     *       for further information.
     *      </p>
     *      <p>
     *       The union allows for the 'un-declaration' of xml:lang with
     *       the empty string.
     *      </p>
     *     </div>
     *    
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #setLang(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang</em>' attribute.
     * @see #getLang()
     * @generated
     */
    void setLang(String value);

    /**
     * Returns the value of the '<em><b>Lang1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lang1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lang1</em>' attribute.
     * @see #setLang1(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Lang1()
     * @model dataType="org.w3._1999.xhtml.datatypes.LanguageCode"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

    /**
     * Returns the value of the '<em><b>Maxlength</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maxlength</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maxlength</em>' attribute.
     * @see #setMaxlength(BigInteger)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Maxlength()
     * @model dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='maxlength'"
     * @generated
     */
    BigInteger getMaxlength();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getMaxlength <em>Maxlength</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maxlength</em>' attribute.
     * @see #getMaxlength()
     * @generated
     */
    void setMaxlength(BigInteger value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Name()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Onblur</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onblur</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onblur</em>' attribute.
     * @see #setOnblur(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onblur()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onblur'"
     * @generated
     */
    String getOnblur();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnblur <em>Onblur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onblur</em>' attribute.
     * @see #getOnblur()
     * @generated
     */
    void setOnblur(String value);

    /**
     * Returns the value of the '<em><b>Onchange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onchange</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onchange</em>' attribute.
     * @see #setOnchange(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onchange()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onchange'"
     * @generated
     */
    String getOnchange();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnchange <em>Onchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onchange</em>' attribute.
     * @see #getOnchange()
     * @generated
     */
    void setOnchange(String value);

    /**
     * Returns the value of the '<em><b>Onclick</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onclick</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onclick</em>' attribute.
     * @see #setOnclick(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onclick'"
     * @generated
     */
    String getOnclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnclick <em>Onclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onclick</em>' attribute.
     * @see #getOnclick()
     * @generated
     */
    void setOnclick(String value);

    /**
     * Returns the value of the '<em><b>Ondblclick</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ondblclick</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ondblclick</em>' attribute.
     * @see #setOndblclick(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Ondblclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='ondblclick'"
     * @generated
     */
    String getOndblclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOndblclick <em>Ondblclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ondblclick</em>' attribute.
     * @see #getOndblclick()
     * @generated
     */
    void setOndblclick(String value);

    /**
     * Returns the value of the '<em><b>Onfocus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onfocus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onfocus</em>' attribute.
     * @see #setOnfocus(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onfocus()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onfocus'"
     * @generated
     */
    String getOnfocus();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnfocus <em>Onfocus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onfocus</em>' attribute.
     * @see #getOnfocus()
     * @generated
     */
    void setOnfocus(String value);

    /**
     * Returns the value of the '<em><b>Onkeydown</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onkeydown</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onkeydown</em>' attribute.
     * @see #setOnkeydown(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onkeydown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeydown'"
     * @generated
     */
    String getOnkeydown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnkeydown <em>Onkeydown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onkeydown</em>' attribute.
     * @see #getOnkeydown()
     * @generated
     */
    void setOnkeydown(String value);

    /**
     * Returns the value of the '<em><b>Onkeypress</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onkeypress</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onkeypress</em>' attribute.
     * @see #setOnkeypress(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onkeypress()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeypress'"
     * @generated
     */
    String getOnkeypress();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnkeypress <em>Onkeypress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onkeypress</em>' attribute.
     * @see #getOnkeypress()
     * @generated
     */
    void setOnkeypress(String value);

    /**
     * Returns the value of the '<em><b>Onkeyup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onkeyup</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onkeyup</em>' attribute.
     * @see #setOnkeyup(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onkeyup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeyup'"
     * @generated
     */
    String getOnkeyup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnkeyup <em>Onkeyup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onkeyup</em>' attribute.
     * @see #getOnkeyup()
     * @generated
     */
    void setOnkeyup(String value);

    /**
     * Returns the value of the '<em><b>Onmousedown</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onmousedown</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onmousedown</em>' attribute.
     * @see #setOnmousedown(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onmousedown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousedown'"
     * @generated
     */
    String getOnmousedown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnmousedown <em>Onmousedown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmousedown</em>' attribute.
     * @see #getOnmousedown()
     * @generated
     */
    void setOnmousedown(String value);

    /**
     * Returns the value of the '<em><b>Onmousemove</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onmousemove</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onmousemove</em>' attribute.
     * @see #setOnmousemove(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onmousemove()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousemove'"
     * @generated
     */
    String getOnmousemove();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnmousemove <em>Onmousemove</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmousemove</em>' attribute.
     * @see #getOnmousemove()
     * @generated
     */
    void setOnmousemove(String value);

    /**
     * Returns the value of the '<em><b>Onmouseout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onmouseout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onmouseout</em>' attribute.
     * @see #setOnmouseout(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onmouseout()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseout'"
     * @generated
     */
    String getOnmouseout();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnmouseout <em>Onmouseout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseout</em>' attribute.
     * @see #getOnmouseout()
     * @generated
     */
    void setOnmouseout(String value);

    /**
     * Returns the value of the '<em><b>Onmouseover</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onmouseover</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onmouseover</em>' attribute.
     * @see #setOnmouseover(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onmouseover()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseover'"
     * @generated
     */
    String getOnmouseover();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnmouseover <em>Onmouseover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseover</em>' attribute.
     * @see #getOnmouseover()
     * @generated
     */
    void setOnmouseover(String value);

    /**
     * Returns the value of the '<em><b>Onmouseup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onmouseup</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onmouseup</em>' attribute.
     * @see #setOnmouseup(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onmouseup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseup'"
     * @generated
     */
    String getOnmouseup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnmouseup <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseup</em>' attribute.
     * @see #getOnmouseup()
     * @generated
     */
    void setOnmouseup(String value);

    /**
     * Returns the value of the '<em><b>Onselect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onselect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onselect</em>' attribute.
     * @see #setOnselect(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Onselect()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onselect'"
     * @generated
     */
    String getOnselect();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getOnselect <em>Onselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onselect</em>' attribute.
     * @see #getOnselect()
     * @generated
     */
    void setOnselect(String value);

    /**
     * Returns the value of the '<em><b>Readonly</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.ReadonlyType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Readonly</em>' attribute.
     * @see org.w3._1999.xhtml.ReadonlyType1
     * @see #isSetReadonly()
     * @see #unsetReadonly()
     * @see #setReadonly(ReadonlyType1)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Readonly()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='readonly'"
     * @generated
     */
    ReadonlyType1 getReadonly();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getReadonly <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Readonly</em>' attribute.
     * @see org.w3._1999.xhtml.ReadonlyType1
     * @see #isSetReadonly()
     * @see #unsetReadonly()
     * @see #getReadonly()
     * @generated
     */
    void setReadonly(ReadonlyType1 value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.InputType#getReadonly <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadonly()
     * @see #getReadonly()
     * @see #setReadonly(ReadonlyType1)
     * @generated
     */
    void unsetReadonly();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.InputType#getReadonly <em>Readonly</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Readonly</em>' attribute is set.
     * @see #unsetReadonly()
     * @see #getReadonly()
     * @see #setReadonly(ReadonlyType1)
     * @generated
     */
    boolean isSetReadonly();

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(BigInteger)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Size()
     * @model dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='size'"
     * @generated
     */
    BigInteger getSize();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(BigInteger value);

    /**
     * Returns the value of the '<em><b>Space</b></em>' attribute.
     * The default value is <code>"preserve"</code>.
     * The literals are from the enumeration {@link org.eclipse.emf.ecore.xml.namespace.SpaceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *     <div xmlns="http://www.w3.org/1999/xhtml">
     *      
     *       <h3>space (as an attribute name)</h3>
     *       <p>
     *        denotes an attribute whose
     *        value is a keyword indicating what whitespace processing
     *        discipline is intended for the content of the element; its
     *        value is inherited.  This name is reserved by virtue of its
     *        definition in the XML specification.</p>
     *      
     *     </div>
     *    
     * <!-- end-model-doc -->
     * @return the value of the '<em>Space</em>' attribute.
     * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
     * @see #isSetSpace()
     * @see #unsetSpace()
     * @see #setSpace(SpaceType)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Space()
     * @model default="preserve" unsettable="true"
     *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    SpaceType getSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getSpace <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Space</em>' attribute.
     * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
     * @see #isSetSpace()
     * @see #unsetSpace()
     * @see #getSpace()
     * @generated
     */
    void setSpace(SpaceType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.InputType#getSpace <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpace()
     * @see #getSpace()
     * @see #setSpace(SpaceType)
     * @generated
     */
    void unsetSpace();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.InputType#getSpace <em>Space</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Space</em>' attribute is set.
     * @see #unsetSpace()
     * @see #getSpace()
     * @see #setSpace(SpaceType)
     * @generated
     */
    boolean isSetSpace();

    /**
     * Returns the value of the '<em><b>Src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Src</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Src</em>' attribute.
     * @see #setSrc(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Src()
     * @model dataType="org.w3._1999.xhtml.datatypes.URI"
     *        extendedMetaData="kind='attribute' name='src'"
     * @generated
     */
    String getSrc();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getSrc <em>Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Src</em>' attribute.
     * @see #getSrc()
     * @generated
     */
    void setSrc(String value);

    /**
     * Returns the value of the '<em><b>Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' attribute.
     * @see #setStyle(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Style()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='style'"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getStyle <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see #getStyle()
     * @generated
     */
    void setStyle(String value);

    /**
     * Returns the value of the '<em><b>Tabindex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tabindex</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tabindex</em>' attribute.
     * @see #setTabindex(BigInteger)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Tabindex()
     * @model dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='tabindex'"
     * @generated
     */
    BigInteger getTabindex();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getTabindex <em>Tabindex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tabindex</em>' attribute.
     * @see #getTabindex()
     * @generated
     */
    void setTabindex(BigInteger value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"text"</code>.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.InputTypeClass}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.w3._1999.xhtml.InputTypeClass
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(InputTypeClass)
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Type()
     * @model default="text" unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    InputTypeClass getType();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.w3._1999.xhtml.InputTypeClass
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(InputTypeClass value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.InputType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(InputTypeClass)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.InputType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(InputTypeClass)
     * @generated
     */
    boolean isSetType();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getInputType_Value()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.InputType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // InputType
