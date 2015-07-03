/**
 */
package org.w3._1999.xhtml.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl;

import org.w3._1999.xhtml.AType;
import org.w3._1999.xhtml.AbbrType;
import org.w3._1999.xhtml.AcronymType;
import org.w3._1999.xhtml.AddressType;
import org.w3._1999.xhtml.BlockquoteType;
import org.w3._1999.xhtml.BrType;
import org.w3._1999.xhtml.ButtonType;
import org.w3._1999.xhtml.CiteType;
import org.w3._1999.xhtml.CodeType;
import org.w3._1999.xhtml.DfnType;
import org.w3._1999.xhtml.DivType;
import org.w3._1999.xhtml.DlType;
import org.w3._1999.xhtml.EmType;
import org.w3._1999.xhtml.FieldsetType;
import org.w3._1999.xhtml.FormType;
import org.w3._1999.xhtml.H1Type;
import org.w3._1999.xhtml.H2Type;
import org.w3._1999.xhtml.H3Type;
import org.w3._1999.xhtml.H4Type;
import org.w3._1999.xhtml.H5Type;
import org.w3._1999.xhtml.H6Type;
import org.w3._1999.xhtml.HrType;
import org.w3._1999.xhtml.ImgType;
import org.w3._1999.xhtml.InlPresType;
import org.w3._1999.xhtml.InputType;
import org.w3._1999.xhtml.KbdType;
import org.w3._1999.xhtml.LabelType;
import org.w3._1999.xhtml.LiType;
import org.w3._1999.xhtml.NoscriptType;
import org.w3._1999.xhtml.ObjectType;
import org.w3._1999.xhtml.OlType;
import org.w3._1999.xhtml.PType;
import org.w3._1999.xhtml.PreType;
import org.w3._1999.xhtml.QType;
import org.w3._1999.xhtml.SampType;
import org.w3._1999.xhtml.ScriptType;
import org.w3._1999.xhtml.SelectType;
import org.w3._1999.xhtml.SpanType;
import org.w3._1999.xhtml.StrongType;
import org.w3._1999.xhtml.TableType;
import org.w3._1999.xhtml.TextareaType;
import org.w3._1999.xhtml.UlType;
import org.w3._1999.xhtml.VarType;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Li Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getFieldset <em>Fieldset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.LiTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiTypeImpl extends XMLTypeDocumentRootImpl implements LiType {
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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final BigInteger VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected BigInteger value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LiTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getLiType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlFlowMix() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTML11Package.eINSTANCE.getLiType_XhtmlFlowMix());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H1Type> getH1() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_H1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H2Type> getH2() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_H2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H3Type> getH3() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_H3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H4Type> getH4() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_H4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H5Type> getH5() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_H5());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H6Type> getH6() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_H6());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UlType> getUl() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Ul());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OlType> getOl() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Ol());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DlType> getDl() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Dl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PType> getP() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_P());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DivType> getDiv() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Div());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PreType> getPre() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Pre());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BlockquoteType> getBlockquote() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Blockquote());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AddressType> getAddress() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Address());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HrType> getHr() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Hr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TableType> getTable() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Table());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormType> getForm() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Form());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FieldsetType> getFieldset() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Fieldset());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BrType> getBr() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Br());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpanType> getSpan() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Span());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EmType> getEm() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Em());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StrongType> getStrong() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Strong());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DfnType> getDfn() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Dfn());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CodeType> getCode() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Code());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SampType> getSamp() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Samp());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KbdType> getKbd() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Kbd());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VarType> getVar() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Var());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CiteType> getCite() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Cite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbbrType> getAbbr() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Abbr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AcronymType> getAcronym() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Acronym());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QType> getQ() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Q());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getTt() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Tt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getI() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_I());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getB() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_B());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getBig() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Big());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSmall() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Small());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSub() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Sub());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSup() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Sup());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AType> getA() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_A());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ImgType> getImg() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Img());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Object());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputType> getInput() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Input());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SelectType> getSelect() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Select());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TextareaType> getTextarea() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Textarea());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Label());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ButtonType> getButton() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Button());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoscriptType> getNoscript() {
        return getXhtmlFlowMix().list(XHTML11Package.eINSTANCE.getLiType_Noscript());
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__CLASS, oldClass, class_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__LANG1, oldLang1, lang1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONCLICK, oldOnclick, onclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.LI_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__STYLE, oldStyle, style));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(BigInteger newValue) {
        BigInteger oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.LI_TYPE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.LI_TYPE__XHTML_FLOW_MIX:
                return ((InternalEList<?>)getXhtmlFlowMix()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__H1:
                return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__H2:
                return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__H3:
                return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__H4:
                return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__H5:
                return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__H6:
                return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__UL:
                return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__OL:
                return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__DL:
                return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__P:
                return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__DIV:
                return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__PRE:
                return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__BLOCKQUOTE:
                return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__ADDRESS:
                return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__HR:
                return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__TABLE:
                return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__FORM:
                return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__FIELDSET:
                return ((InternalEList<?>)getFieldset()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__BR:
                return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SPAN:
                return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__EM:
                return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__STRONG:
                return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__DFN:
                return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__CODE:
                return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SAMP:
                return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__KBD:
                return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__VAR:
                return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__CITE:
                return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__ABBR:
                return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__ACRONYM:
                return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__Q:
                return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__TT:
                return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__I:
                return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__B:
                return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__BIG:
                return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SMALL:
                return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SUB:
                return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SUP:
                return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__A:
                return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__IMG:
                return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__OBJECT:
                return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SELECT:
                return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__TEXTAREA:
                return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__LABEL:
                return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__BUTTON:
                return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.LI_TYPE__NOSCRIPT:
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
            case XHTML11Package.LI_TYPE__XHTML_FLOW_MIX:
                if (coreType) return getXhtmlFlowMix();
                return ((FeatureMap.Internal)getXhtmlFlowMix()).getWrapper();
            case XHTML11Package.LI_TYPE__H1:
                return getH1();
            case XHTML11Package.LI_TYPE__H2:
                return getH2();
            case XHTML11Package.LI_TYPE__H3:
                return getH3();
            case XHTML11Package.LI_TYPE__H4:
                return getH4();
            case XHTML11Package.LI_TYPE__H5:
                return getH5();
            case XHTML11Package.LI_TYPE__H6:
                return getH6();
            case XHTML11Package.LI_TYPE__UL:
                return getUl();
            case XHTML11Package.LI_TYPE__OL:
                return getOl();
            case XHTML11Package.LI_TYPE__DL:
                return getDl();
            case XHTML11Package.LI_TYPE__P:
                return getP();
            case XHTML11Package.LI_TYPE__DIV:
                return getDiv();
            case XHTML11Package.LI_TYPE__PRE:
                return getPre();
            case XHTML11Package.LI_TYPE__BLOCKQUOTE:
                return getBlockquote();
            case XHTML11Package.LI_TYPE__ADDRESS:
                return getAddress();
            case XHTML11Package.LI_TYPE__HR:
                return getHr();
            case XHTML11Package.LI_TYPE__TABLE:
                return getTable();
            case XHTML11Package.LI_TYPE__FORM:
                return getForm();
            case XHTML11Package.LI_TYPE__FIELDSET:
                return getFieldset();
            case XHTML11Package.LI_TYPE__BR:
                return getBr();
            case XHTML11Package.LI_TYPE__SPAN:
                return getSpan();
            case XHTML11Package.LI_TYPE__EM:
                return getEm();
            case XHTML11Package.LI_TYPE__STRONG:
                return getStrong();
            case XHTML11Package.LI_TYPE__DFN:
                return getDfn();
            case XHTML11Package.LI_TYPE__CODE:
                return getCode();
            case XHTML11Package.LI_TYPE__SAMP:
                return getSamp();
            case XHTML11Package.LI_TYPE__KBD:
                return getKbd();
            case XHTML11Package.LI_TYPE__VAR:
                return getVar();
            case XHTML11Package.LI_TYPE__CITE:
                return getCite();
            case XHTML11Package.LI_TYPE__ABBR:
                return getAbbr();
            case XHTML11Package.LI_TYPE__ACRONYM:
                return getAcronym();
            case XHTML11Package.LI_TYPE__Q:
                return getQ();
            case XHTML11Package.LI_TYPE__TT:
                return getTt();
            case XHTML11Package.LI_TYPE__I:
                return getI();
            case XHTML11Package.LI_TYPE__B:
                return getB();
            case XHTML11Package.LI_TYPE__BIG:
                return getBig();
            case XHTML11Package.LI_TYPE__SMALL:
                return getSmall();
            case XHTML11Package.LI_TYPE__SUB:
                return getSub();
            case XHTML11Package.LI_TYPE__SUP:
                return getSup();
            case XHTML11Package.LI_TYPE__A:
                return getA();
            case XHTML11Package.LI_TYPE__IMG:
                return getImg();
            case XHTML11Package.LI_TYPE__OBJECT:
                return getObject();
            case XHTML11Package.LI_TYPE__INPUT:
                return getInput();
            case XHTML11Package.LI_TYPE__SELECT:
                return getSelect();
            case XHTML11Package.LI_TYPE__TEXTAREA:
                return getTextarea();
            case XHTML11Package.LI_TYPE__LABEL:
                return getLabel();
            case XHTML11Package.LI_TYPE__BUTTON:
                return getButton();
            case XHTML11Package.LI_TYPE__SCRIPT:
                return getScript();
            case XHTML11Package.LI_TYPE__NOSCRIPT:
                return getNoscript();
            case XHTML11Package.LI_TYPE__CLASS:
                return getClass_();
            case XHTML11Package.LI_TYPE__ID:
                return getId();
            case XHTML11Package.LI_TYPE__LANG:
                return getLang();
            case XHTML11Package.LI_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.LI_TYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.LI_TYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.LI_TYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.LI_TYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.LI_TYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.LI_TYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.LI_TYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.LI_TYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.LI_TYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.LI_TYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.LI_TYPE__SPACE:
                return getSpace();
            case XHTML11Package.LI_TYPE__STYLE:
                return getStyle();
            case XHTML11Package.LI_TYPE__TITLE:
                return getTitle();
            case XHTML11Package.LI_TYPE__VALUE:
                return getValue();
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
            case XHTML11Package.LI_TYPE__XHTML_FLOW_MIX:
                ((FeatureMap.Internal)getXhtmlFlowMix()).set(newValue);
                return;
            case XHTML11Package.LI_TYPE__H1:
                getH1().clear();
                getH1().addAll((Collection<? extends H1Type>)newValue);
                return;
            case XHTML11Package.LI_TYPE__H2:
                getH2().clear();
                getH2().addAll((Collection<? extends H2Type>)newValue);
                return;
            case XHTML11Package.LI_TYPE__H3:
                getH3().clear();
                getH3().addAll((Collection<? extends H3Type>)newValue);
                return;
            case XHTML11Package.LI_TYPE__H4:
                getH4().clear();
                getH4().addAll((Collection<? extends H4Type>)newValue);
                return;
            case XHTML11Package.LI_TYPE__H5:
                getH5().clear();
                getH5().addAll((Collection<? extends H5Type>)newValue);
                return;
            case XHTML11Package.LI_TYPE__H6:
                getH6().clear();
                getH6().addAll((Collection<? extends H6Type>)newValue);
                return;
            case XHTML11Package.LI_TYPE__UL:
                getUl().clear();
                getUl().addAll((Collection<? extends UlType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__OL:
                getOl().clear();
                getOl().addAll((Collection<? extends OlType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__DL:
                getDl().clear();
                getDl().addAll((Collection<? extends DlType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__P:
                getP().clear();
                getP().addAll((Collection<? extends PType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__DIV:
                getDiv().clear();
                getDiv().addAll((Collection<? extends DivType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__PRE:
                getPre().clear();
                getPre().addAll((Collection<? extends PreType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__ADDRESS:
                getAddress().clear();
                getAddress().addAll((Collection<? extends AddressType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__HR:
                getHr().clear();
                getHr().addAll((Collection<? extends HrType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__TABLE:
                getTable().clear();
                getTable().addAll((Collection<? extends TableType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__FORM:
                getForm().clear();
                getForm().addAll((Collection<? extends FormType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__FIELDSET:
                getFieldset().clear();
                getFieldset().addAll((Collection<? extends FieldsetType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__BR:
                getBr().clear();
                getBr().addAll((Collection<? extends BrType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SPAN:
                getSpan().clear();
                getSpan().addAll((Collection<? extends SpanType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__EM:
                getEm().clear();
                getEm().addAll((Collection<? extends EmType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__STRONG:
                getStrong().clear();
                getStrong().addAll((Collection<? extends StrongType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__DFN:
                getDfn().clear();
                getDfn().addAll((Collection<? extends DfnType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__CODE:
                getCode().clear();
                getCode().addAll((Collection<? extends CodeType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SAMP:
                getSamp().clear();
                getSamp().addAll((Collection<? extends SampType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__KBD:
                getKbd().clear();
                getKbd().addAll((Collection<? extends KbdType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__VAR:
                getVar().clear();
                getVar().addAll((Collection<? extends VarType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__CITE:
                getCite().clear();
                getCite().addAll((Collection<? extends CiteType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__ABBR:
                getAbbr().clear();
                getAbbr().addAll((Collection<? extends AbbrType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__ACRONYM:
                getAcronym().clear();
                getAcronym().addAll((Collection<? extends AcronymType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__Q:
                getQ().clear();
                getQ().addAll((Collection<? extends QType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__TT:
                getTt().clear();
                getTt().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__I:
                getI().clear();
                getI().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__B:
                getB().clear();
                getB().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__BIG:
                getBig().clear();
                getBig().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SMALL:
                getSmall().clear();
                getSmall().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SUB:
                getSub().clear();
                getSub().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SUP:
                getSup().clear();
                getSup().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__A:
                getA().clear();
                getA().addAll((Collection<? extends AType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__IMG:
                getImg().clear();
                getImg().addAll((Collection<? extends ImgType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__OBJECT:
                getObject().clear();
                getObject().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends InputType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SELECT:
                getSelect().clear();
                getSelect().addAll((Collection<? extends SelectType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__TEXTAREA:
                getTextarea().clear();
                getTextarea().addAll((Collection<? extends TextareaType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__BUTTON:
                getButton().clear();
                getButton().addAll((Collection<? extends ButtonType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__NOSCRIPT:
                getNoscript().clear();
                getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
                return;
            case XHTML11Package.LI_TYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.LI_TYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case XHTML11Package.LI_TYPE__VALUE:
                setValue((BigInteger)newValue);
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
            case XHTML11Package.LI_TYPE__XHTML_FLOW_MIX:
                getXhtmlFlowMix().clear();
                return;
            case XHTML11Package.LI_TYPE__H1:
                getH1().clear();
                return;
            case XHTML11Package.LI_TYPE__H2:
                getH2().clear();
                return;
            case XHTML11Package.LI_TYPE__H3:
                getH3().clear();
                return;
            case XHTML11Package.LI_TYPE__H4:
                getH4().clear();
                return;
            case XHTML11Package.LI_TYPE__H5:
                getH5().clear();
                return;
            case XHTML11Package.LI_TYPE__H6:
                getH6().clear();
                return;
            case XHTML11Package.LI_TYPE__UL:
                getUl().clear();
                return;
            case XHTML11Package.LI_TYPE__OL:
                getOl().clear();
                return;
            case XHTML11Package.LI_TYPE__DL:
                getDl().clear();
                return;
            case XHTML11Package.LI_TYPE__P:
                getP().clear();
                return;
            case XHTML11Package.LI_TYPE__DIV:
                getDiv().clear();
                return;
            case XHTML11Package.LI_TYPE__PRE:
                getPre().clear();
                return;
            case XHTML11Package.LI_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                return;
            case XHTML11Package.LI_TYPE__ADDRESS:
                getAddress().clear();
                return;
            case XHTML11Package.LI_TYPE__HR:
                getHr().clear();
                return;
            case XHTML11Package.LI_TYPE__TABLE:
                getTable().clear();
                return;
            case XHTML11Package.LI_TYPE__FORM:
                getForm().clear();
                return;
            case XHTML11Package.LI_TYPE__FIELDSET:
                getFieldset().clear();
                return;
            case XHTML11Package.LI_TYPE__BR:
                getBr().clear();
                return;
            case XHTML11Package.LI_TYPE__SPAN:
                getSpan().clear();
                return;
            case XHTML11Package.LI_TYPE__EM:
                getEm().clear();
                return;
            case XHTML11Package.LI_TYPE__STRONG:
                getStrong().clear();
                return;
            case XHTML11Package.LI_TYPE__DFN:
                getDfn().clear();
                return;
            case XHTML11Package.LI_TYPE__CODE:
                getCode().clear();
                return;
            case XHTML11Package.LI_TYPE__SAMP:
                getSamp().clear();
                return;
            case XHTML11Package.LI_TYPE__KBD:
                getKbd().clear();
                return;
            case XHTML11Package.LI_TYPE__VAR:
                getVar().clear();
                return;
            case XHTML11Package.LI_TYPE__CITE:
                getCite().clear();
                return;
            case XHTML11Package.LI_TYPE__ABBR:
                getAbbr().clear();
                return;
            case XHTML11Package.LI_TYPE__ACRONYM:
                getAcronym().clear();
                return;
            case XHTML11Package.LI_TYPE__Q:
                getQ().clear();
                return;
            case XHTML11Package.LI_TYPE__TT:
                getTt().clear();
                return;
            case XHTML11Package.LI_TYPE__I:
                getI().clear();
                return;
            case XHTML11Package.LI_TYPE__B:
                getB().clear();
                return;
            case XHTML11Package.LI_TYPE__BIG:
                getBig().clear();
                return;
            case XHTML11Package.LI_TYPE__SMALL:
                getSmall().clear();
                return;
            case XHTML11Package.LI_TYPE__SUB:
                getSub().clear();
                return;
            case XHTML11Package.LI_TYPE__SUP:
                getSup().clear();
                return;
            case XHTML11Package.LI_TYPE__A:
                getA().clear();
                return;
            case XHTML11Package.LI_TYPE__IMG:
                getImg().clear();
                return;
            case XHTML11Package.LI_TYPE__OBJECT:
                getObject().clear();
                return;
            case XHTML11Package.LI_TYPE__INPUT:
                getInput().clear();
                return;
            case XHTML11Package.LI_TYPE__SELECT:
                getSelect().clear();
                return;
            case XHTML11Package.LI_TYPE__TEXTAREA:
                getTextarea().clear();
                return;
            case XHTML11Package.LI_TYPE__LABEL:
                getLabel().clear();
                return;
            case XHTML11Package.LI_TYPE__BUTTON:
                getButton().clear();
                return;
            case XHTML11Package.LI_TYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.LI_TYPE__NOSCRIPT:
                getNoscript().clear();
                return;
            case XHTML11Package.LI_TYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.LI_TYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case XHTML11Package.LI_TYPE__VALUE:
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
            case XHTML11Package.LI_TYPE__XHTML_FLOW_MIX:
                return !getXhtmlFlowMix().isEmpty();
            case XHTML11Package.LI_TYPE__H1:
                return !getH1().isEmpty();
            case XHTML11Package.LI_TYPE__H2:
                return !getH2().isEmpty();
            case XHTML11Package.LI_TYPE__H3:
                return !getH3().isEmpty();
            case XHTML11Package.LI_TYPE__H4:
                return !getH4().isEmpty();
            case XHTML11Package.LI_TYPE__H5:
                return !getH5().isEmpty();
            case XHTML11Package.LI_TYPE__H6:
                return !getH6().isEmpty();
            case XHTML11Package.LI_TYPE__UL:
                return !getUl().isEmpty();
            case XHTML11Package.LI_TYPE__OL:
                return !getOl().isEmpty();
            case XHTML11Package.LI_TYPE__DL:
                return !getDl().isEmpty();
            case XHTML11Package.LI_TYPE__P:
                return !getP().isEmpty();
            case XHTML11Package.LI_TYPE__DIV:
                return !getDiv().isEmpty();
            case XHTML11Package.LI_TYPE__PRE:
                return !getPre().isEmpty();
            case XHTML11Package.LI_TYPE__BLOCKQUOTE:
                return !getBlockquote().isEmpty();
            case XHTML11Package.LI_TYPE__ADDRESS:
                return !getAddress().isEmpty();
            case XHTML11Package.LI_TYPE__HR:
                return !getHr().isEmpty();
            case XHTML11Package.LI_TYPE__TABLE:
                return !getTable().isEmpty();
            case XHTML11Package.LI_TYPE__FORM:
                return !getForm().isEmpty();
            case XHTML11Package.LI_TYPE__FIELDSET:
                return !getFieldset().isEmpty();
            case XHTML11Package.LI_TYPE__BR:
                return !getBr().isEmpty();
            case XHTML11Package.LI_TYPE__SPAN:
                return !getSpan().isEmpty();
            case XHTML11Package.LI_TYPE__EM:
                return !getEm().isEmpty();
            case XHTML11Package.LI_TYPE__STRONG:
                return !getStrong().isEmpty();
            case XHTML11Package.LI_TYPE__DFN:
                return !getDfn().isEmpty();
            case XHTML11Package.LI_TYPE__CODE:
                return !getCode().isEmpty();
            case XHTML11Package.LI_TYPE__SAMP:
                return !getSamp().isEmpty();
            case XHTML11Package.LI_TYPE__KBD:
                return !getKbd().isEmpty();
            case XHTML11Package.LI_TYPE__VAR:
                return !getVar().isEmpty();
            case XHTML11Package.LI_TYPE__CITE:
                return !getCite().isEmpty();
            case XHTML11Package.LI_TYPE__ABBR:
                return !getAbbr().isEmpty();
            case XHTML11Package.LI_TYPE__ACRONYM:
                return !getAcronym().isEmpty();
            case XHTML11Package.LI_TYPE__Q:
                return !getQ().isEmpty();
            case XHTML11Package.LI_TYPE__TT:
                return !getTt().isEmpty();
            case XHTML11Package.LI_TYPE__I:
                return !getI().isEmpty();
            case XHTML11Package.LI_TYPE__B:
                return !getB().isEmpty();
            case XHTML11Package.LI_TYPE__BIG:
                return !getBig().isEmpty();
            case XHTML11Package.LI_TYPE__SMALL:
                return !getSmall().isEmpty();
            case XHTML11Package.LI_TYPE__SUB:
                return !getSub().isEmpty();
            case XHTML11Package.LI_TYPE__SUP:
                return !getSup().isEmpty();
            case XHTML11Package.LI_TYPE__A:
                return !getA().isEmpty();
            case XHTML11Package.LI_TYPE__IMG:
                return !getImg().isEmpty();
            case XHTML11Package.LI_TYPE__OBJECT:
                return !getObject().isEmpty();
            case XHTML11Package.LI_TYPE__INPUT:
                return !getInput().isEmpty();
            case XHTML11Package.LI_TYPE__SELECT:
                return !getSelect().isEmpty();
            case XHTML11Package.LI_TYPE__TEXTAREA:
                return !getTextarea().isEmpty();
            case XHTML11Package.LI_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XHTML11Package.LI_TYPE__BUTTON:
                return !getButton().isEmpty();
            case XHTML11Package.LI_TYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.LI_TYPE__NOSCRIPT:
                return !getNoscript().isEmpty();
            case XHTML11Package.LI_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.LI_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.LI_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.LI_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.LI_TYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.LI_TYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.LI_TYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.LI_TYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.LI_TYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.LI_TYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.LI_TYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.LI_TYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.LI_TYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.LI_TYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.LI_TYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.LI_TYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.LI_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case XHTML11Package.LI_TYPE__VALUE:
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
        result.append(" (class: ");
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
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //LiTypeImpl
