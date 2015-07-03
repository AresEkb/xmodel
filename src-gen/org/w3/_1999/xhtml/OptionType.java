/**
 */
package org.w3._1999.xhtml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.OptionType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getOptionType()
 * @model extendedMetaData="name='xhtml.option.type' kind='mixed'"
 * @generated
 */
public interface OptionType extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

    /**
     * Returns the value of the '<em><b>Disabled</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.DisabledType3}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disabled</em>' attribute.
     * @see org.w3._1999.xhtml.DisabledType3
     * @see #isSetDisabled()
     * @see #unsetDisabled()
     * @see #setDisabled(DisabledType3)
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Disabled()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='disabled'"
     * @generated
     */
    DisabledType3 getDisabled();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disabled</em>' attribute.
     * @see org.w3._1999.xhtml.DisabledType3
     * @see #isSetDisabled()
     * @see #unsetDisabled()
     * @see #getDisabled()
     * @generated
     */
    void setDisabled(DisabledType3 value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.OptionType#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisabled()
     * @see #getDisabled()
     * @see #setDisabled(DisabledType3)
     * @generated
     */
    void unsetDisabled();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.OptionType#getDisabled <em>Disabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disabled</em>' attribute is set.
     * @see #unsetDisabled()
     * @see #getDisabled()
     * @see #setDisabled(DisabledType3)
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Label()
     * @model dataType="org.w3._1999.xhtml.datatypes.Text"
     *        extendedMetaData="kind='attribute' name='label'"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getLang <em>Lang</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Lang1()
     * @model dataType="org.w3._1999.xhtml.datatypes.LanguageCode"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onclick'"
     * @generated
     */
    String getOnclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnclick <em>Onclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Ondblclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='ondblclick'"
     * @generated
     */
    String getOndblclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOndblclick <em>Ondblclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ondblclick</em>' attribute.
     * @see #getOndblclick()
     * @generated
     */
    void setOndblclick(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onkeydown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeydown'"
     * @generated
     */
    String getOnkeydown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnkeydown <em>Onkeydown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onkeypress()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeypress'"
     * @generated
     */
    String getOnkeypress();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnkeypress <em>Onkeypress</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onkeyup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeyup'"
     * @generated
     */
    String getOnkeyup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnkeyup <em>Onkeyup</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onmousedown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousedown'"
     * @generated
     */
    String getOnmousedown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnmousedown <em>Onmousedown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onmousemove()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousemove'"
     * @generated
     */
    String getOnmousemove();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnmousemove <em>Onmousemove</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onmouseout()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseout'"
     * @generated
     */
    String getOnmouseout();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnmouseout <em>Onmouseout</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onmouseover()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseover'"
     * @generated
     */
    String getOnmouseover();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnmouseover <em>Onmouseover</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Onmouseup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseup'"
     * @generated
     */
    String getOnmouseup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getOnmouseup <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseup</em>' attribute.
     * @see #getOnmouseup()
     * @generated
     */
    void setOnmouseup(String value);

    /**
     * Returns the value of the '<em><b>Selected</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.SelectedType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see org.w3._1999.xhtml.SelectedType
     * @see #isSetSelected()
     * @see #unsetSelected()
     * @see #setSelected(SelectedType)
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Selected()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='selected'"
     * @generated
     */
    SelectedType getSelected();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected</em>' attribute.
     * @see org.w3._1999.xhtml.SelectedType
     * @see #isSetSelected()
     * @see #unsetSelected()
     * @see #getSelected()
     * @generated
     */
    void setSelected(SelectedType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.OptionType#getSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSelected()
     * @see #getSelected()
     * @see #setSelected(SelectedType)
     * @generated
     */
    void unsetSelected();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.OptionType#getSelected <em>Selected</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Selected</em>' attribute is set.
     * @see #unsetSelected()
     * @see #getSelected()
     * @see #setSelected(SelectedType)
     * @generated
     */
    boolean isSetSelected();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Space()
     * @model default="preserve" unsettable="true"
     *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    SpaceType getSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getSpace <em>Space</em>}' attribute.
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
     * Unsets the value of the '{@link org.w3._1999.xhtml.OptionType#getSpace <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpace()
     * @see #getSpace()
     * @see #setSpace(SpaceType)
     * @generated
     */
    void unsetSpace();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.OptionType#getSpace <em>Space</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' attribute.
     * @see #setStyle(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Style()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='style'"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getStyle <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see #getStyle()
     * @generated
     */
    void setStyle(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getOptionType_Value()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.OptionType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // OptionType
