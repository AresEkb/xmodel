/**
 */
package org.w3._1999.xhtml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.w3._1999.xhtml.AddressType;
import org.w3._1999.xhtml.BlockquoteType;
import org.w3._1999.xhtml.DivType;
import org.w3._1999.xhtml.DlType;
import org.w3._1999.xhtml.FieldsetType;
import org.w3._1999.xhtml.FormType;
import org.w3._1999.xhtml.H1Type;
import org.w3._1999.xhtml.H2Type;
import org.w3._1999.xhtml.H3Type;
import org.w3._1999.xhtml.H4Type;
import org.w3._1999.xhtml.H5Type;
import org.w3._1999.xhtml.H6Type;
import org.w3._1999.xhtml.HrType;
import org.w3._1999.xhtml.MethodType;
import org.w3._1999.xhtml.NoscriptType;
import org.w3._1999.xhtml.OlType;
import org.w3._1999.xhtml.PType;
import org.w3._1999.xhtml.PreType;
import org.w3._1999.xhtml.ScriptType;
import org.w3._1999.xhtml.TableType;
import org.w3._1999.xhtml.UlType;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getFieldset <em>Fieldset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getAcceptCharset <em>Accept Charset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnreset <em>Onreset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getOnsubmit <em>Onsubmit</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.FormTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormTypeImpl extends MinimalEObjectImpl.Container implements FormType {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

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
     * The default value of the '{@link #getAcceptCharset() <em>Accept Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcceptCharset()
     * @generated
     * @ordered
     */
    protected static final List<String> ACCEPT_CHARSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAcceptCharset() <em>Accept Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcceptCharset()
     * @generated
     * @ordered
     */
    protected List<String> acceptCharset = ACCEPT_CHARSET_EDEFAULT;

    /**
     * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
    protected static final String ACTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
    protected String action = ACTION_EDEFAULT;

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
     * The default value of the '{@link #getEnctype() <em>Enctype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnctype()
     * @generated
     * @ordered
     */
    protected static final String ENCTYPE_EDEFAULT = "application/x-www-form-urlencoded";

    /**
     * The cached value of the '{@link #getEnctype() <em>Enctype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnctype()
     * @generated
     * @ordered
     */
    protected String enctype = ENCTYPE_EDEFAULT;

    /**
     * This is true if the Enctype attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enctypeESet;

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
     * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected static final MethodType METHOD_EDEFAULT = MethodType.GET;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected MethodType method = METHOD_EDEFAULT;

    /**
     * This is true if the Method attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean methodESet;

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
     * The default value of the '{@link #getOnreset() <em>Onreset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnreset()
     * @generated
     * @ordered
     */
    protected static final String ONRESET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnreset() <em>Onreset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnreset()
     * @generated
     * @ordered
     */
    protected String onreset = ONRESET_EDEFAULT;

    /**
     * The default value of the '{@link #getOnsubmit() <em>Onsubmit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnsubmit()
     * @generated
     * @ordered
     */
    protected static final String ONSUBMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnsubmit() <em>Onsubmit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnsubmit()
     * @generated
     * @ordered
     */
    protected String onsubmit = ONSUBMIT_EDEFAULT;

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
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected static final Object TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected Object target = TARGET_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FormTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getFormType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XHTML11Package.FORM_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H1Type> getH1() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_H1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H2Type> getH2() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_H2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H3Type> getH3() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_H3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H4Type> getH4() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_H4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H5Type> getH5() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_H5());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H6Type> getH6() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_H6());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UlType> getUl() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Ul());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OlType> getOl() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Ol());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DlType> getDl() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Dl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PType> getP() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_P());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DivType> getDiv() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Div());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PreType> getPre() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Pre());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BlockquoteType> getBlockquote() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Blockquote());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AddressType> getAddress() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Address());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HrType> getHr() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Hr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TableType> getTable() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Table());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoscriptType> getNoscript() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Noscript());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FieldsetType> getFieldset() {
        return getGroup().list(XHTML11Package.eINSTANCE.getFormType_Fieldset());
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ACCEPT, oldAccept, accept));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getAcceptCharset() {
        return acceptCharset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAcceptCharset(List<String> newAcceptCharset) {
        List<String> oldAcceptCharset = acceptCharset;
        acceptCharset = newAcceptCharset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ACCEPT_CHARSET, oldAcceptCharset, acceptCharset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAction() {
        return action;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAction(String newAction) {
        String oldAction = action;
        action = newAction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ACTION, oldAction, action));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__CLASS, oldClass, class_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEnctype() {
        return enctype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnctype(String newEnctype) {
        String oldEnctype = enctype;
        enctype = newEnctype;
        boolean oldEnctypeESet = enctypeESet;
        enctypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ENCTYPE, oldEnctype, enctype, !oldEnctypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEnctype() {
        String oldEnctype = enctype;
        boolean oldEnctypeESet = enctypeESet;
        enctype = ENCTYPE_EDEFAULT;
        enctypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.FORM_TYPE__ENCTYPE, oldEnctype, ENCTYPE_EDEFAULT, oldEnctypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEnctype() {
        return enctypeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__LANG1, oldLang1, lang1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodType getMethod() {
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMethod(MethodType newMethod) {
        MethodType oldMethod = method;
        method = newMethod == null ? METHOD_EDEFAULT : newMethod;
        boolean oldMethodESet = methodESet;
        methodESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__METHOD, oldMethod, method, !oldMethodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMethod() {
        MethodType oldMethod = method;
        boolean oldMethodESet = methodESet;
        method = METHOD_EDEFAULT;
        methodESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.FORM_TYPE__METHOD, oldMethod, METHOD_EDEFAULT, oldMethodESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMethod() {
        return methodESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONCLICK, oldOnclick, onclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnreset() {
        return onreset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnreset(String newOnreset) {
        String oldOnreset = onreset;
        onreset = newOnreset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONRESET, oldOnreset, onreset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnsubmit() {
        return onsubmit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnsubmit(String newOnsubmit) {
        String oldOnsubmit = onsubmit;
        onsubmit = newOnsubmit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__ONSUBMIT, oldOnsubmit, onsubmit));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.FORM_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__STYLE, oldStyle, style));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(Object newTarget) {
        Object oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__TARGET, oldTarget, target));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.FORM_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.FORM_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__H1:
                return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__H2:
                return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__H3:
                return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__H4:
                return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__H5:
                return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__H6:
                return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__UL:
                return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__OL:
                return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__DL:
                return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__P:
                return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__DIV:
                return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__PRE:
                return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__BLOCKQUOTE:
                return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__ADDRESS:
                return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__HR:
                return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__TABLE:
                return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__NOSCRIPT:
                return ((InternalEList<?>)getNoscript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.FORM_TYPE__FIELDSET:
                return ((InternalEList<?>)getFieldset()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XHTML11Package.FORM_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case XHTML11Package.FORM_TYPE__H1:
                return getH1();
            case XHTML11Package.FORM_TYPE__H2:
                return getH2();
            case XHTML11Package.FORM_TYPE__H3:
                return getH3();
            case XHTML11Package.FORM_TYPE__H4:
                return getH4();
            case XHTML11Package.FORM_TYPE__H5:
                return getH5();
            case XHTML11Package.FORM_TYPE__H6:
                return getH6();
            case XHTML11Package.FORM_TYPE__UL:
                return getUl();
            case XHTML11Package.FORM_TYPE__OL:
                return getOl();
            case XHTML11Package.FORM_TYPE__DL:
                return getDl();
            case XHTML11Package.FORM_TYPE__P:
                return getP();
            case XHTML11Package.FORM_TYPE__DIV:
                return getDiv();
            case XHTML11Package.FORM_TYPE__PRE:
                return getPre();
            case XHTML11Package.FORM_TYPE__BLOCKQUOTE:
                return getBlockquote();
            case XHTML11Package.FORM_TYPE__ADDRESS:
                return getAddress();
            case XHTML11Package.FORM_TYPE__HR:
                return getHr();
            case XHTML11Package.FORM_TYPE__TABLE:
                return getTable();
            case XHTML11Package.FORM_TYPE__SCRIPT:
                return getScript();
            case XHTML11Package.FORM_TYPE__NOSCRIPT:
                return getNoscript();
            case XHTML11Package.FORM_TYPE__FIELDSET:
                return getFieldset();
            case XHTML11Package.FORM_TYPE__ACCEPT:
                return getAccept();
            case XHTML11Package.FORM_TYPE__ACCEPT_CHARSET:
                return getAcceptCharset();
            case XHTML11Package.FORM_TYPE__ACTION:
                return getAction();
            case XHTML11Package.FORM_TYPE__CLASS:
                return getClass_();
            case XHTML11Package.FORM_TYPE__ENCTYPE:
                return getEnctype();
            case XHTML11Package.FORM_TYPE__ID:
                return getId();
            case XHTML11Package.FORM_TYPE__LANG:
                return getLang();
            case XHTML11Package.FORM_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.FORM_TYPE__METHOD:
                return getMethod();
            case XHTML11Package.FORM_TYPE__NAME:
                return getName();
            case XHTML11Package.FORM_TYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.FORM_TYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.FORM_TYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.FORM_TYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.FORM_TYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.FORM_TYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.FORM_TYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.FORM_TYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.FORM_TYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.FORM_TYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.FORM_TYPE__ONRESET:
                return getOnreset();
            case XHTML11Package.FORM_TYPE__ONSUBMIT:
                return getOnsubmit();
            case XHTML11Package.FORM_TYPE__SPACE:
                return getSpace();
            case XHTML11Package.FORM_TYPE__STYLE:
                return getStyle();
            case XHTML11Package.FORM_TYPE__TARGET:
                return getTarget();
            case XHTML11Package.FORM_TYPE__TITLE:
                return getTitle();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XHTML11Package.FORM_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case XHTML11Package.FORM_TYPE__H1:
                getH1().clear();
                getH1().addAll((Collection<? extends H1Type>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__H2:
                getH2().clear();
                getH2().addAll((Collection<? extends H2Type>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__H3:
                getH3().clear();
                getH3().addAll((Collection<? extends H3Type>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__H4:
                getH4().clear();
                getH4().addAll((Collection<? extends H4Type>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__H5:
                getH5().clear();
                getH5().addAll((Collection<? extends H5Type>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__H6:
                getH6().clear();
                getH6().addAll((Collection<? extends H6Type>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__UL:
                getUl().clear();
                getUl().addAll((Collection<? extends UlType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__OL:
                getOl().clear();
                getOl().addAll((Collection<? extends OlType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__DL:
                getDl().clear();
                getDl().addAll((Collection<? extends DlType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__P:
                getP().clear();
                getP().addAll((Collection<? extends PType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__DIV:
                getDiv().clear();
                getDiv().addAll((Collection<? extends DivType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__PRE:
                getPre().clear();
                getPre().addAll((Collection<? extends PreType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ADDRESS:
                getAddress().clear();
                getAddress().addAll((Collection<? extends AddressType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__HR:
                getHr().clear();
                getHr().addAll((Collection<? extends HrType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__TABLE:
                getTable().clear();
                getTable().addAll((Collection<? extends TableType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__NOSCRIPT:
                getNoscript().clear();
                getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__FIELDSET:
                getFieldset().clear();
                getFieldset().addAll((Collection<? extends FieldsetType>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ACCEPT:
                setAccept((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ACCEPT_CHARSET:
                setAcceptCharset((List<String>)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ACTION:
                setAction((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ENCTYPE:
                setEnctype((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__METHOD:
                setMethod((MethodType)newValue);
                return;
            case XHTML11Package.FORM_TYPE__NAME:
                setName((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONRESET:
                setOnreset((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__ONSUBMIT:
                setOnsubmit((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.FORM_TYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.FORM_TYPE__TARGET:
                setTarget(newValue);
                return;
            case XHTML11Package.FORM_TYPE__TITLE:
                setTitle((String)newValue);
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
            case XHTML11Package.FORM_TYPE__GROUP:
                getGroup().clear();
                return;
            case XHTML11Package.FORM_TYPE__H1:
                getH1().clear();
                return;
            case XHTML11Package.FORM_TYPE__H2:
                getH2().clear();
                return;
            case XHTML11Package.FORM_TYPE__H3:
                getH3().clear();
                return;
            case XHTML11Package.FORM_TYPE__H4:
                getH4().clear();
                return;
            case XHTML11Package.FORM_TYPE__H5:
                getH5().clear();
                return;
            case XHTML11Package.FORM_TYPE__H6:
                getH6().clear();
                return;
            case XHTML11Package.FORM_TYPE__UL:
                getUl().clear();
                return;
            case XHTML11Package.FORM_TYPE__OL:
                getOl().clear();
                return;
            case XHTML11Package.FORM_TYPE__DL:
                getDl().clear();
                return;
            case XHTML11Package.FORM_TYPE__P:
                getP().clear();
                return;
            case XHTML11Package.FORM_TYPE__DIV:
                getDiv().clear();
                return;
            case XHTML11Package.FORM_TYPE__PRE:
                getPre().clear();
                return;
            case XHTML11Package.FORM_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                return;
            case XHTML11Package.FORM_TYPE__ADDRESS:
                getAddress().clear();
                return;
            case XHTML11Package.FORM_TYPE__HR:
                getHr().clear();
                return;
            case XHTML11Package.FORM_TYPE__TABLE:
                getTable().clear();
                return;
            case XHTML11Package.FORM_TYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.FORM_TYPE__NOSCRIPT:
                getNoscript().clear();
                return;
            case XHTML11Package.FORM_TYPE__FIELDSET:
                getFieldset().clear();
                return;
            case XHTML11Package.FORM_TYPE__ACCEPT:
                setAccept(ACCEPT_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ACCEPT_CHARSET:
                setAcceptCharset(ACCEPT_CHARSET_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ACTION:
                setAction(ACTION_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ENCTYPE:
                unsetEnctype();
                return;
            case XHTML11Package.FORM_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__METHOD:
                unsetMethod();
                return;
            case XHTML11Package.FORM_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONRESET:
                setOnreset(ONRESET_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__ONSUBMIT:
                setOnsubmit(ONSUBMIT_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.FORM_TYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__TARGET:
                setTarget(TARGET_EDEFAULT);
                return;
            case XHTML11Package.FORM_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
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
            case XHTML11Package.FORM_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XHTML11Package.FORM_TYPE__H1:
                return !getH1().isEmpty();
            case XHTML11Package.FORM_TYPE__H2:
                return !getH2().isEmpty();
            case XHTML11Package.FORM_TYPE__H3:
                return !getH3().isEmpty();
            case XHTML11Package.FORM_TYPE__H4:
                return !getH4().isEmpty();
            case XHTML11Package.FORM_TYPE__H5:
                return !getH5().isEmpty();
            case XHTML11Package.FORM_TYPE__H6:
                return !getH6().isEmpty();
            case XHTML11Package.FORM_TYPE__UL:
                return !getUl().isEmpty();
            case XHTML11Package.FORM_TYPE__OL:
                return !getOl().isEmpty();
            case XHTML11Package.FORM_TYPE__DL:
                return !getDl().isEmpty();
            case XHTML11Package.FORM_TYPE__P:
                return !getP().isEmpty();
            case XHTML11Package.FORM_TYPE__DIV:
                return !getDiv().isEmpty();
            case XHTML11Package.FORM_TYPE__PRE:
                return !getPre().isEmpty();
            case XHTML11Package.FORM_TYPE__BLOCKQUOTE:
                return !getBlockquote().isEmpty();
            case XHTML11Package.FORM_TYPE__ADDRESS:
                return !getAddress().isEmpty();
            case XHTML11Package.FORM_TYPE__HR:
                return !getHr().isEmpty();
            case XHTML11Package.FORM_TYPE__TABLE:
                return !getTable().isEmpty();
            case XHTML11Package.FORM_TYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.FORM_TYPE__NOSCRIPT:
                return !getNoscript().isEmpty();
            case XHTML11Package.FORM_TYPE__FIELDSET:
                return !getFieldset().isEmpty();
            case XHTML11Package.FORM_TYPE__ACCEPT:
                return ACCEPT_EDEFAULT == null ? accept != null : !ACCEPT_EDEFAULT.equals(accept);
            case XHTML11Package.FORM_TYPE__ACCEPT_CHARSET:
                return ACCEPT_CHARSET_EDEFAULT == null ? acceptCharset != null : !ACCEPT_CHARSET_EDEFAULT.equals(acceptCharset);
            case XHTML11Package.FORM_TYPE__ACTION:
                return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
            case XHTML11Package.FORM_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.FORM_TYPE__ENCTYPE:
                return isSetEnctype();
            case XHTML11Package.FORM_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.FORM_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.FORM_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.FORM_TYPE__METHOD:
                return isSetMethod();
            case XHTML11Package.FORM_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XHTML11Package.FORM_TYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.FORM_TYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.FORM_TYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.FORM_TYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.FORM_TYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.FORM_TYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.FORM_TYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.FORM_TYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.FORM_TYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.FORM_TYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.FORM_TYPE__ONRESET:
                return ONRESET_EDEFAULT == null ? onreset != null : !ONRESET_EDEFAULT.equals(onreset);
            case XHTML11Package.FORM_TYPE__ONSUBMIT:
                return ONSUBMIT_EDEFAULT == null ? onsubmit != null : !ONSUBMIT_EDEFAULT.equals(onsubmit);
            case XHTML11Package.FORM_TYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.FORM_TYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.FORM_TYPE__TARGET:
                return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
            case XHTML11Package.FORM_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
        result.append(" (group: ");
        result.append(group);
        result.append(", accept: ");
        result.append(accept);
        result.append(", acceptCharset: ");
        result.append(acceptCharset);
        result.append(", action: ");
        result.append(action);
        result.append(", class: ");
        result.append(class_);
        result.append(", enctype: ");
        if (enctypeESet) result.append(enctype); else result.append("<unset>");
        result.append(", id: ");
        result.append(id);
        result.append(", lang: ");
        result.append(lang);
        result.append(", lang1: ");
        result.append(lang1);
        result.append(", method: ");
        if (methodESet) result.append(method); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", onclick: ");
        result.append(onclick);
        result.append(", ondblclick: ");
        result.append(ondblclick);
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
        result.append(", onreset: ");
        result.append(onreset);
        result.append(", onsubmit: ");
        result.append(onsubmit);
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(", style: ");
        result.append(style);
        result.append(", target: ");
        result.append(target);
        result.append(", title: ");
        result.append(title);
        result.append(')');
        return result.toString();
    }

} //FormTypeImpl
