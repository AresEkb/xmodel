/**
 */
package org.w3._1999.xhtml.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.w3._1999.xhtml.CheckedType;
import org.w3._1999.xhtml.DisabledType5;
import org.w3._1999.xhtml.InputType;
import org.w3._1999.xhtml.InputTypeClass;
import org.w3._1999.xhtml.ReadonlyType1;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getInputmode <em>Inputmode</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnblur <em>Onblur</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnchange <em>Onchange</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnfocus <em>Onfocus</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getOnselect <em>Onselect</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InputTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputTypeImpl extends MinimalEObjectImpl.Container implements InputType {
    /**
     * The default value of the '{@link #getAccept() <em>Accept</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccept()
     * @generated
     * @ordered
     */
    protected static final String ACCEPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccept() <em>Accept</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccept()
     * @generated
     * @ordered
     */
    protected String accept = ACCEPT_EDEFAULT;

    /**
     * The default value of the '{@link #getAccesskey() <em>Accesskey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccesskey()
     * @generated
     * @ordered
     */
    protected static final String ACCESSKEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccesskey() <em>Accesskey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccesskey()
     * @generated
     * @ordered
     */
    protected String accesskey = ACCESSKEY_EDEFAULT;

    /**
     * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlt()
     * @generated
     * @ordered
     */
    protected static final String ALT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlt()
     * @generated
     * @ordered
     */
    protected String alt = ALT_EDEFAULT;

    /**
     * The default value of the '{@link #getChecked() <em>Checked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChecked()
     * @generated
     * @ordered
     */
    protected static final CheckedType CHECKED_EDEFAULT = CheckedType.CHECKED;

    /**
     * The cached value of the '{@link #getChecked() <em>Checked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChecked()
     * @generated
     * @ordered
     */
    protected CheckedType checked = CHECKED_EDEFAULT;

    /**
     * This is true if the Checked attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean checkedESet;

    /**
     * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
    protected static final String CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
    protected String class_ = CLASS_EDEFAULT;

    /**
     * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisabled()
     * @generated
     * @ordered
     */
    protected static final DisabledType5 DISABLED_EDEFAULT = DisabledType5.DISABLED;

    /**
     * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisabled()
     * @generated
     * @ordered
     */
    protected DisabledType5 disabled = DISABLED_EDEFAULT;

    /**
     * This is true if the Disabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disabledESet;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getInputmode() <em>Inputmode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputmode()
     * @generated
     * @ordered
     */
    protected static final Object INPUTMODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputmode() <em>Inputmode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputmode()
     * @generated
     * @ordered
     */
    protected Object inputmode = INPUTMODE_EDEFAULT;

    /**
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang1()
     * @generated
     * @ordered
     */
    protected static final String LANG1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang1()
     * @generated
     * @ordered
     */
    protected String lang1 = LANG1_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxlength()
     * @generated
     * @ordered
     */
    protected static final BigInteger MAXLENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxlength()
     * @generated
     * @ordered
     */
    protected BigInteger maxlength = MAXLENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getOnblur() <em>Onblur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnblur()
     * @generated
     * @ordered
     */
    protected static final String ONBLUR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnblur() <em>Onblur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnblur()
     * @generated
     * @ordered
     */
    protected String onblur = ONBLUR_EDEFAULT;

    /**
     * The default value of the '{@link #getOnchange() <em>Onchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnchange()
     * @generated
     * @ordered
     */
    protected static final String ONCHANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnchange() <em>Onchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnchange()
     * @generated
     * @ordered
     */
    protected String onchange = ONCHANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnclick()
     * @generated
     * @ordered
     */
    protected static final String ONCLICK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnclick()
     * @generated
     * @ordered
     */
    protected String onclick = ONCLICK_EDEFAULT;

    /**
     * The default value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOndblclick()
     * @generated
     * @ordered
     */
    protected static final String ONDBLCLICK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOndblclick()
     * @generated
     * @ordered
     */
    protected String ondblclick = ONDBLCLICK_EDEFAULT;

    /**
     * The default value of the '{@link #getOnfocus() <em>Onfocus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnfocus()
     * @generated
     * @ordered
     */
    protected static final String ONFOCUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnfocus() <em>Onfocus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnfocus()
     * @generated
     * @ordered
     */
    protected String onfocus = ONFOCUS_EDEFAULT;

    /**
     * The default value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnkeydown()
     * @generated
     * @ordered
     */
    protected static final String ONKEYDOWN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnkeydown()
     * @generated
     * @ordered
     */
    protected String onkeydown = ONKEYDOWN_EDEFAULT;

    /**
     * The default value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnkeypress()
     * @generated
     * @ordered
     */
    protected static final String ONKEYPRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnkeypress()
     * @generated
     * @ordered
     */
    protected String onkeypress = ONKEYPRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnkeyup()
     * @generated
     * @ordered
     */
    protected static final String ONKEYUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnkeyup()
     * @generated
     * @ordered
     */
    protected String onkeyup = ONKEYUP_EDEFAULT;

    /**
     * The default value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmousedown()
     * @generated
     * @ordered
     */
    protected static final String ONMOUSEDOWN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmousedown()
     * @generated
     * @ordered
     */
    protected String onmousedown = ONMOUSEDOWN_EDEFAULT;

    /**
     * The default value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmousemove()
     * @generated
     * @ordered
     */
    protected static final String ONMOUSEMOVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmousemove()
     * @generated
     * @ordered
     */
    protected String onmousemove = ONMOUSEMOVE_EDEFAULT;

    /**
     * The default value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmouseout()
     * @generated
     * @ordered
     */
    protected static final String ONMOUSEOUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmouseout()
     * @generated
     * @ordered
     */
    protected String onmouseout = ONMOUSEOUT_EDEFAULT;

    /**
     * The default value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmouseover()
     * @generated
     * @ordered
     */
    protected static final String ONMOUSEOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmouseover()
     * @generated
     * @ordered
     */
    protected String onmouseover = ONMOUSEOVER_EDEFAULT;

    /**
     * The default value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmouseup()
     * @generated
     * @ordered
     */
    protected static final String ONMOUSEUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnmouseup()
     * @generated
     * @ordered
     */
    protected String onmouseup = ONMOUSEUP_EDEFAULT;

    /**
     * The default value of the '{@link #getOnselect() <em>Onselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnselect()
     * @generated
     * @ordered
     */
    protected static final String ONSELECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnselect() <em>Onselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnselect()
     * @generated
     * @ordered
     */
    protected String onselect = ONSELECT_EDEFAULT;

    /**
     * The default value of the '{@link #getReadonly() <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadonly()
     * @generated
     * @ordered
     */
    protected static final ReadonlyType1 READONLY_EDEFAULT = ReadonlyType1.READONLY;

    /**
     * The cached value of the '{@link #getReadonly() <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadonly()
     * @generated
     * @ordered
     */
    protected ReadonlyType1 readonly = READONLY_EDEFAULT;

    /**
     * This is true if the Readonly attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readonlyESet;

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final BigInteger SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected BigInteger size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpace()
     * @generated
     * @ordered
     */
    protected static final SpaceType SPACE_EDEFAULT = SpaceType.PRESERVE_LITERAL;

    /**
     * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpace()
     * @generated
     * @ordered
     */
    protected SpaceType space = SPACE_EDEFAULT;

    /**
     * This is true if the Space attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spaceESet;

    /**
     * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrc()
     * @generated
     * @ordered
     */
    protected static final String SRC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrc()
     * @generated
     * @ordered
     */
    protected String src = SRC_EDEFAULT;

    /**
     * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected static final String STYLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected String style = STYLE_EDEFAULT;

    /**
     * The default value of the '{@link #getTabindex() <em>Tabindex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTabindex()
     * @generated
     * @ordered
     */
    protected static final BigInteger TABINDEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTabindex() <em>Tabindex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTabindex()
     * @generated
     * @ordered
     */
    protected BigInteger tabindex = TABINDEX_EDEFAULT;

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final InputTypeClass TYPE_EDEFAULT = InputTypeClass.TEXT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected InputTypeClass type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getInputType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAccept() {
        return accept;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccept(String newAccept) {
        String oldAccept = accept;
        accept = newAccept;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ACCEPT, oldAccept, accept));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAccesskey() {
        return accesskey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccesskey(String newAccesskey) {
        String oldAccesskey = accesskey;
        accesskey = newAccesskey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ACCESSKEY, oldAccesskey, accesskey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlt() {
        return alt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlt(String newAlt) {
        String oldAlt = alt;
        alt = newAlt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ALT, oldAlt, alt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CheckedType getChecked() {
        return checked;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChecked(CheckedType newChecked) {
        CheckedType oldChecked = checked;
        checked = newChecked == null ? CHECKED_EDEFAULT : newChecked;
        boolean oldCheckedESet = checkedESet;
        checkedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__CHECKED, oldChecked, checked, !oldCheckedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetChecked() {
        CheckedType oldChecked = checked;
        boolean oldCheckedESet = checkedESet;
        checked = CHECKED_EDEFAULT;
        checkedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.INPUT_TYPE__CHECKED, oldChecked, CHECKED_EDEFAULT, oldCheckedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetChecked() {
        return checkedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClass_() {
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClass(String newClass) {
        String oldClass = class_;
        class_ = newClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__CLASS, oldClass, class_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType5 getDisabled() {
        return disabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisabled(DisabledType5 newDisabled) {
        DisabledType5 oldDisabled = disabled;
        disabled = newDisabled == null ? DISABLED_EDEFAULT : newDisabled;
        boolean oldDisabledESet = disabledESet;
        disabledESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisabled() {
        DisabledType5 oldDisabled = disabled;
        boolean oldDisabledESet = disabledESet;
        disabled = DISABLED_EDEFAULT;
        disabledESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.INPUT_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisabled() {
        return disabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getInputmode() {
        return inputmode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputmode(Object newInputmode) {
        Object oldInputmode = inputmode;
        inputmode = newInputmode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__INPUTMODE, oldInputmode, inputmode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang() {
        return lang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang(String newLang) {
        String oldLang = lang;
        lang = newLang;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__LANG, oldLang, lang));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang1() {
        return lang1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang1(String newLang1) {
        String oldLang1 = lang1;
        lang1 = newLang1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__LANG1, oldLang1, lang1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getMaxlength() {
        return maxlength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxlength(BigInteger newMaxlength) {
        BigInteger oldMaxlength = maxlength;
        maxlength = newMaxlength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__MAXLENGTH, oldMaxlength, maxlength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnblur() {
        return onblur;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnblur(String newOnblur) {
        String oldOnblur = onblur;
        onblur = newOnblur;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONBLUR, oldOnblur, onblur));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnchange() {
        return onchange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnchange(String newOnchange) {
        String oldOnchange = onchange;
        onchange = newOnchange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONCHANGE, oldOnchange, onchange));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnclick(String newOnclick) {
        String oldOnclick = onclick;
        onclick = newOnclick;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONCLICK, oldOnclick, onclick));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOndblclick() {
        return ondblclick;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOndblclick(String newOndblclick) {
        String oldOndblclick = ondblclick;
        ondblclick = newOndblclick;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnfocus() {
        return onfocus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnfocus(String newOnfocus) {
        String oldOnfocus = onfocus;
        onfocus = newOnfocus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONFOCUS, oldOnfocus, onfocus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnkeydown() {
        return onkeydown;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnkeydown(String newOnkeydown) {
        String oldOnkeydown = onkeydown;
        onkeydown = newOnkeydown;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnkeypress() {
        return onkeypress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnkeypress(String newOnkeypress) {
        String oldOnkeypress = onkeypress;
        onkeypress = newOnkeypress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnkeyup() {
        return onkeyup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnkeyup(String newOnkeyup) {
        String oldOnkeyup = onkeyup;
        onkeyup = newOnkeyup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnmousedown() {
        return onmousedown;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnmousedown(String newOnmousedown) {
        String oldOnmousedown = onmousedown;
        onmousedown = newOnmousedown;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnmousemove() {
        return onmousemove;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnmousemove(String newOnmousemove) {
        String oldOnmousemove = onmousemove;
        onmousemove = newOnmousemove;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnmouseout() {
        return onmouseout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnmouseout(String newOnmouseout) {
        String oldOnmouseout = onmouseout;
        onmouseout = newOnmouseout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnmouseover() {
        return onmouseover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnmouseover(String newOnmouseover) {
        String oldOnmouseover = onmouseover;
        onmouseover = newOnmouseover;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnmouseup() {
        return onmouseup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnmouseup(String newOnmouseup) {
        String oldOnmouseup = onmouseup;
        onmouseup = newOnmouseup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnselect() {
        return onselect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnselect(String newOnselect) {
        String oldOnselect = onselect;
        onselect = newOnselect;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__ONSELECT, oldOnselect, onselect));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadonlyType1 getReadonly() {
        return readonly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadonly(ReadonlyType1 newReadonly) {
        ReadonlyType1 oldReadonly = readonly;
        readonly = newReadonly == null ? READONLY_EDEFAULT : newReadonly;
        boolean oldReadonlyESet = readonlyESet;
        readonlyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__READONLY, oldReadonly, readonly, !oldReadonlyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReadonly() {
        ReadonlyType1 oldReadonly = readonly;
        boolean oldReadonlyESet = readonlyESet;
        readonly = READONLY_EDEFAULT;
        readonlyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.INPUT_TYPE__READONLY, oldReadonly, READONLY_EDEFAULT, oldReadonlyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReadonly() {
        return readonlyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSize(BigInteger newSize) {
        BigInteger oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpaceType getSpace() {
        return space;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpace(SpaceType newSpace) {
        SpaceType oldSpace = space;
        space = newSpace == null ? SPACE_EDEFAULT : newSpace;
        boolean oldSpaceESet = spaceESet;
        spaceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSpace() {
        SpaceType oldSpace = space;
        boolean oldSpaceESet = spaceESet;
        space = SPACE_EDEFAULT;
        spaceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.INPUT_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSpace() {
        return spaceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSrc() {
        return src;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSrc(String newSrc) {
        String oldSrc = src;
        src = newSrc;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__SRC, oldSrc, src));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStyle() {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(String newStyle) {
        String oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__STYLE, oldStyle, style));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getTabindex() {
        return tabindex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTabindex(BigInteger newTabindex) {
        BigInteger oldTabindex = tabindex;
        tabindex = newTabindex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__TABINDEX, oldTabindex, tabindex));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputTypeClass getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(InputTypeClass newType) {
        InputTypeClass oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        InputTypeClass oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.INPUT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.INPUT_TYPE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XHTML11Package.INPUT_TYPE__ACCEPT:
                return getAccept();
            case XHTML11Package.INPUT_TYPE__ACCESSKEY:
                return getAccesskey();
            case XHTML11Package.INPUT_TYPE__ALT:
                return getAlt();
            case XHTML11Package.INPUT_TYPE__CHECKED:
                return getChecked();
            case XHTML11Package.INPUT_TYPE__CLASS:
                return getClass_();
            case XHTML11Package.INPUT_TYPE__DISABLED:
                return getDisabled();
            case XHTML11Package.INPUT_TYPE__ID:
                return getId();
            case XHTML11Package.INPUT_TYPE__INPUTMODE:
                return getInputmode();
            case XHTML11Package.INPUT_TYPE__LANG:
                return getLang();
            case XHTML11Package.INPUT_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.INPUT_TYPE__MAXLENGTH:
                return getMaxlength();
            case XHTML11Package.INPUT_TYPE__NAME:
                return getName();
            case XHTML11Package.INPUT_TYPE__ONBLUR:
                return getOnblur();
            case XHTML11Package.INPUT_TYPE__ONCHANGE:
                return getOnchange();
            case XHTML11Package.INPUT_TYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.INPUT_TYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.INPUT_TYPE__ONFOCUS:
                return getOnfocus();
            case XHTML11Package.INPUT_TYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.INPUT_TYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.INPUT_TYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.INPUT_TYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.INPUT_TYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.INPUT_TYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.INPUT_TYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.INPUT_TYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.INPUT_TYPE__ONSELECT:
                return getOnselect();
            case XHTML11Package.INPUT_TYPE__READONLY:
                return getReadonly();
            case XHTML11Package.INPUT_TYPE__SIZE:
                return getSize();
            case XHTML11Package.INPUT_TYPE__SPACE:
                return getSpace();
            case XHTML11Package.INPUT_TYPE__SRC:
                return getSrc();
            case XHTML11Package.INPUT_TYPE__STYLE:
                return getStyle();
            case XHTML11Package.INPUT_TYPE__TABINDEX:
                return getTabindex();
            case XHTML11Package.INPUT_TYPE__TITLE:
                return getTitle();
            case XHTML11Package.INPUT_TYPE__TYPE:
                return getType();
            case XHTML11Package.INPUT_TYPE__VALUE:
                return getValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XHTML11Package.INPUT_TYPE__ACCEPT:
                setAccept((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ACCESSKEY:
                setAccesskey((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ALT:
                setAlt((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__CHECKED:
                setChecked((CheckedType)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__DISABLED:
                setDisabled((DisabledType5)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__INPUTMODE:
                setInputmode(newValue);
                return;
            case XHTML11Package.INPUT_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__MAXLENGTH:
                setMaxlength((BigInteger)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__NAME:
                setName((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONBLUR:
                setOnblur((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONCHANGE:
                setOnchange((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONFOCUS:
                setOnfocus((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__ONSELECT:
                setOnselect((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__READONLY:
                setReadonly((ReadonlyType1)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__SIZE:
                setSize((BigInteger)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__SRC:
                setSrc((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__TABINDEX:
                setTabindex((BigInteger)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__TYPE:
                setType((InputTypeClass)newValue);
                return;
            case XHTML11Package.INPUT_TYPE__VALUE:
                setValue((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XHTML11Package.INPUT_TYPE__ACCEPT:
                setAccept(ACCEPT_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ACCESSKEY:
                setAccesskey(ACCESSKEY_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ALT:
                setAlt(ALT_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__CHECKED:
                unsetChecked();
                return;
            case XHTML11Package.INPUT_TYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__DISABLED:
                unsetDisabled();
                return;
            case XHTML11Package.INPUT_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__INPUTMODE:
                setInputmode(INPUTMODE_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__MAXLENGTH:
                setMaxlength(MAXLENGTH_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONBLUR:
                setOnblur(ONBLUR_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONCHANGE:
                setOnchange(ONCHANGE_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONFOCUS:
                setOnfocus(ONFOCUS_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__ONSELECT:
                setOnselect(ONSELECT_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__READONLY:
                unsetReadonly();
                return;
            case XHTML11Package.INPUT_TYPE__SIZE:
                setSize(SIZE_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.INPUT_TYPE__SRC:
                setSrc(SRC_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__TABINDEX:
                setTabindex(TABINDEX_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case XHTML11Package.INPUT_TYPE__TYPE:
                unsetType();
                return;
            case XHTML11Package.INPUT_TYPE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XHTML11Package.INPUT_TYPE__ACCEPT:
                return ACCEPT_EDEFAULT == null ? accept != null : !ACCEPT_EDEFAULT.equals(accept);
            case XHTML11Package.INPUT_TYPE__ACCESSKEY:
                return ACCESSKEY_EDEFAULT == null ? accesskey != null : !ACCESSKEY_EDEFAULT.equals(accesskey);
            case XHTML11Package.INPUT_TYPE__ALT:
                return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
            case XHTML11Package.INPUT_TYPE__CHECKED:
                return isSetChecked();
            case XHTML11Package.INPUT_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.INPUT_TYPE__DISABLED:
                return isSetDisabled();
            case XHTML11Package.INPUT_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.INPUT_TYPE__INPUTMODE:
                return INPUTMODE_EDEFAULT == null ? inputmode != null : !INPUTMODE_EDEFAULT.equals(inputmode);
            case XHTML11Package.INPUT_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.INPUT_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.INPUT_TYPE__MAXLENGTH:
                return MAXLENGTH_EDEFAULT == null ? maxlength != null : !MAXLENGTH_EDEFAULT.equals(maxlength);
            case XHTML11Package.INPUT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XHTML11Package.INPUT_TYPE__ONBLUR:
                return ONBLUR_EDEFAULT == null ? onblur != null : !ONBLUR_EDEFAULT.equals(onblur);
            case XHTML11Package.INPUT_TYPE__ONCHANGE:
                return ONCHANGE_EDEFAULT == null ? onchange != null : !ONCHANGE_EDEFAULT.equals(onchange);
            case XHTML11Package.INPUT_TYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.INPUT_TYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.INPUT_TYPE__ONFOCUS:
                return ONFOCUS_EDEFAULT == null ? onfocus != null : !ONFOCUS_EDEFAULT.equals(onfocus);
            case XHTML11Package.INPUT_TYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.INPUT_TYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.INPUT_TYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.INPUT_TYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.INPUT_TYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.INPUT_TYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.INPUT_TYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.INPUT_TYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.INPUT_TYPE__ONSELECT:
                return ONSELECT_EDEFAULT == null ? onselect != null : !ONSELECT_EDEFAULT.equals(onselect);
            case XHTML11Package.INPUT_TYPE__READONLY:
                return isSetReadonly();
            case XHTML11Package.INPUT_TYPE__SIZE:
                return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
            case XHTML11Package.INPUT_TYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.INPUT_TYPE__SRC:
                return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
            case XHTML11Package.INPUT_TYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.INPUT_TYPE__TABINDEX:
                return TABINDEX_EDEFAULT == null ? tabindex != null : !TABINDEX_EDEFAULT.equals(tabindex);
            case XHTML11Package.INPUT_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case XHTML11Package.INPUT_TYPE__TYPE:
                return isSetType();
            case XHTML11Package.INPUT_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (accept: ");
        result.append(accept);
        result.append(", accesskey: ");
        result.append(accesskey);
        result.append(", alt: ");
        result.append(alt);
        result.append(", checked: ");
        if (checkedESet) result.append(checked); else result.append("<unset>");
        result.append(", class: ");
        result.append(class_);
        result.append(", disabled: ");
        if (disabledESet) result.append(disabled); else result.append("<unset>");
        result.append(", id: ");
        result.append(id);
        result.append(", inputmode: ");
        result.append(inputmode);
        result.append(", lang: ");
        result.append(lang);
        result.append(", lang1: ");
        result.append(lang1);
        result.append(", maxlength: ");
        result.append(maxlength);
        result.append(", name: ");
        result.append(name);
        result.append(", onblur: ");
        result.append(onblur);
        result.append(", onchange: ");
        result.append(onchange);
        result.append(", onclick: ");
        result.append(onclick);
        result.append(", ondblclick: ");
        result.append(ondblclick);
        result.append(", onfocus: ");
        result.append(onfocus);
        result.append(", onkeydown: ");
        result.append(onkeydown);
        result.append(", onkeypress: ");
        result.append(onkeypress);
        result.append(", onkeyup: ");
        result.append(onkeyup);
        result.append(", onmousedown: ");
        result.append(onmousedown);
        result.append(", onmousemove: ");
        result.append(onmousemove);
        result.append(", onmouseout: ");
        result.append(onmouseout);
        result.append(", onmouseover: ");
        result.append(onmouseover);
        result.append(", onmouseup: ");
        result.append(onmouseup);
        result.append(", onselect: ");
        result.append(onselect);
        result.append(", readonly: ");
        if (readonlyESet) result.append(readonly); else result.append("<unset>");
        result.append(", size: ");
        result.append(size);
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(", src: ");
        result.append(src);
        result.append(", style: ");
        result.append(style);
        result.append(", tabindex: ");
        result.append(tabindex);
        result.append(", title: ");
        result.append(title);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //InputTypeImpl
