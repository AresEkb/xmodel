/**
 */
package org.w3._1999.xhtml.impl;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Noscript Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getXhtmlBlockMix <em>Xhtml Block Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getFieldset <em>Fieldset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.NoscriptTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoscriptTypeImpl extends MinimalEObjectImpl.Container implements NoscriptType {
    /**
     * The cached value of the '{@link #getXhtmlBlockMix() <em>Xhtml Block Mix</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXhtmlBlockMix()
     * @generated
     * @ordered
     */
    protected FeatureMap xhtmlBlockMix;

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
    protected NoscriptTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getNoscriptType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlBlockMix() {
        if (xhtmlBlockMix == null) {
            xhtmlBlockMix = new BasicFeatureMap(this, XHTML11Package.NOSCRIPT_TYPE__XHTML_BLOCK_MIX);
        }
        return xhtmlBlockMix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H1Type> getH1() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_H1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H2Type> getH2() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_H2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H3Type> getH3() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_H3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H4Type> getH4() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_H4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H5Type> getH5() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_H5());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H6Type> getH6() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_H6());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UlType> getUl() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Ul());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OlType> getOl() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Ol());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DlType> getDl() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Dl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PType> getP() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_P());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DivType> getDiv() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Div());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PreType> getPre() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Pre());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BlockquoteType> getBlockquote() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Blockquote());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AddressType> getAddress() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Address());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HrType> getHr() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Hr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TableType> getTable() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Table());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormType> getForm() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Form());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FieldsetType> getFieldset() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Fieldset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoscriptType> getNoscript() {
        return getXhtmlBlockMix().list(XHTML11Package.eINSTANCE.getNoscriptType_Noscript());
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__CLASS, oldClass, class_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__LANG1, oldLang1, lang1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONCLICK, oldOnclick, onclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.NOSCRIPT_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__STYLE, oldStyle, style));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.NOSCRIPT_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.NOSCRIPT_TYPE__XHTML_BLOCK_MIX:
                return ((InternalEList<?>)getXhtmlBlockMix()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__H1:
                return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__H2:
                return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__H3:
                return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__H4:
                return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__H5:
                return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__H6:
                return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__UL:
                return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__OL:
                return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__DL:
                return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__P:
                return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__DIV:
                return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__PRE:
                return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__BLOCKQUOTE:
                return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__ADDRESS:
                return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__HR:
                return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__TABLE:
                return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__FORM:
                return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__FIELDSET:
                return ((InternalEList<?>)getFieldset()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.NOSCRIPT_TYPE__NOSCRIPT:
                return ((InternalEList<?>)getNoscript()).basicRemove(otherEnd, msgs);
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
            case XHTML11Package.NOSCRIPT_TYPE__XHTML_BLOCK_MIX:
                if (coreType) return getXhtmlBlockMix();
                return ((FeatureMap.Internal)getXhtmlBlockMix()).getWrapper();
            case XHTML11Package.NOSCRIPT_TYPE__H1:
                return getH1();
            case XHTML11Package.NOSCRIPT_TYPE__H2:
                return getH2();
            case XHTML11Package.NOSCRIPT_TYPE__H3:
                return getH3();
            case XHTML11Package.NOSCRIPT_TYPE__H4:
                return getH4();
            case XHTML11Package.NOSCRIPT_TYPE__H5:
                return getH5();
            case XHTML11Package.NOSCRIPT_TYPE__H6:
                return getH6();
            case XHTML11Package.NOSCRIPT_TYPE__UL:
                return getUl();
            case XHTML11Package.NOSCRIPT_TYPE__OL:
                return getOl();
            case XHTML11Package.NOSCRIPT_TYPE__DL:
                return getDl();
            case XHTML11Package.NOSCRIPT_TYPE__P:
                return getP();
            case XHTML11Package.NOSCRIPT_TYPE__DIV:
                return getDiv();
            case XHTML11Package.NOSCRIPT_TYPE__PRE:
                return getPre();
            case XHTML11Package.NOSCRIPT_TYPE__BLOCKQUOTE:
                return getBlockquote();
            case XHTML11Package.NOSCRIPT_TYPE__ADDRESS:
                return getAddress();
            case XHTML11Package.NOSCRIPT_TYPE__HR:
                return getHr();
            case XHTML11Package.NOSCRIPT_TYPE__TABLE:
                return getTable();
            case XHTML11Package.NOSCRIPT_TYPE__FORM:
                return getForm();
            case XHTML11Package.NOSCRIPT_TYPE__FIELDSET:
                return getFieldset();
            case XHTML11Package.NOSCRIPT_TYPE__SCRIPT:
                return getScript();
            case XHTML11Package.NOSCRIPT_TYPE__NOSCRIPT:
                return getNoscript();
            case XHTML11Package.NOSCRIPT_TYPE__CLASS:
                return getClass_();
            case XHTML11Package.NOSCRIPT_TYPE__ID:
                return getId();
            case XHTML11Package.NOSCRIPT_TYPE__LANG:
                return getLang();
            case XHTML11Package.NOSCRIPT_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.NOSCRIPT_TYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.NOSCRIPT_TYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.NOSCRIPT_TYPE__SPACE:
                return getSpace();
            case XHTML11Package.NOSCRIPT_TYPE__STYLE:
                return getStyle();
            case XHTML11Package.NOSCRIPT_TYPE__TITLE:
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
            case XHTML11Package.NOSCRIPT_TYPE__XHTML_BLOCK_MIX:
                ((FeatureMap.Internal)getXhtmlBlockMix()).set(newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H1:
                getH1().clear();
                getH1().addAll((Collection<? extends H1Type>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H2:
                getH2().clear();
                getH2().addAll((Collection<? extends H2Type>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H3:
                getH3().clear();
                getH3().addAll((Collection<? extends H3Type>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H4:
                getH4().clear();
                getH4().addAll((Collection<? extends H4Type>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H5:
                getH5().clear();
                getH5().addAll((Collection<? extends H5Type>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H6:
                getH6().clear();
                getH6().addAll((Collection<? extends H6Type>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__UL:
                getUl().clear();
                getUl().addAll((Collection<? extends UlType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__OL:
                getOl().clear();
                getOl().addAll((Collection<? extends OlType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__DL:
                getDl().clear();
                getDl().addAll((Collection<? extends DlType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__P:
                getP().clear();
                getP().addAll((Collection<? extends PType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__DIV:
                getDiv().clear();
                getDiv().addAll((Collection<? extends DivType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__PRE:
                getPre().clear();
                getPre().addAll((Collection<? extends PreType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ADDRESS:
                getAddress().clear();
                getAddress().addAll((Collection<? extends AddressType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__HR:
                getHr().clear();
                getHr().addAll((Collection<? extends HrType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__TABLE:
                getTable().clear();
                getTable().addAll((Collection<? extends TableType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__FORM:
                getForm().clear();
                getForm().addAll((Collection<? extends FormType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__FIELDSET:
                getFieldset().clear();
                getFieldset().addAll((Collection<? extends FieldsetType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__NOSCRIPT:
                getNoscript().clear();
                getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__TITLE:
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
            case XHTML11Package.NOSCRIPT_TYPE__XHTML_BLOCK_MIX:
                getXhtmlBlockMix().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H1:
                getH1().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H2:
                getH2().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H3:
                getH3().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H4:
                getH4().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H5:
                getH5().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__H6:
                getH6().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__UL:
                getUl().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__OL:
                getOl().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__DL:
                getDl().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__P:
                getP().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__DIV:
                getDiv().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__PRE:
                getPre().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ADDRESS:
                getAddress().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__HR:
                getHr().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__TABLE:
                getTable().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__FORM:
                getForm().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__FIELDSET:
                getFieldset().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__NOSCRIPT:
                getNoscript().clear();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.NOSCRIPT_TYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.NOSCRIPT_TYPE__TITLE:
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
            case XHTML11Package.NOSCRIPT_TYPE__XHTML_BLOCK_MIX:
                return xhtmlBlockMix != null && !xhtmlBlockMix.isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__H1:
                return !getH1().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__H2:
                return !getH2().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__H3:
                return !getH3().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__H4:
                return !getH4().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__H5:
                return !getH5().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__H6:
                return !getH6().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__UL:
                return !getUl().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__OL:
                return !getOl().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__DL:
                return !getDl().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__P:
                return !getP().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__DIV:
                return !getDiv().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__PRE:
                return !getPre().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__BLOCKQUOTE:
                return !getBlockquote().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__ADDRESS:
                return !getAddress().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__HR:
                return !getHr().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__TABLE:
                return !getTable().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__FORM:
                return !getForm().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__FIELDSET:
                return !getFieldset().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__NOSCRIPT:
                return !getNoscript().isEmpty();
            case XHTML11Package.NOSCRIPT_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.NOSCRIPT_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.NOSCRIPT_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.NOSCRIPT_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.NOSCRIPT_TYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.NOSCRIPT_TYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.NOSCRIPT_TYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.NOSCRIPT_TYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.NOSCRIPT_TYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.NOSCRIPT_TYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.NOSCRIPT_TYPE__TITLE:
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
        result.append(" (xhtmlBlockMix: ");
        result.append(xhtmlBlockMix);
        result.append(", class: ");
        result.append(class_);
        result.append(", id: ");
        result.append(id);
        result.append(", lang: ");
        result.append(lang);
        result.append(", lang1: ");
        result.append(lang1);
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
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(", style: ");
        result.append(style);
        result.append(", title: ");
        result.append(title);
        result.append(')');
        return result.toString();
    }

} //NoscriptTypeImpl
