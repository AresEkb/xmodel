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

import org.w3._1999.xhtml.AType;
import org.w3._1999.xhtml.AbbrType;
import org.w3._1999.xhtml.AcronymType;
import org.w3._1999.xhtml.BrType;
import org.w3._1999.xhtml.ButtonType;
import org.w3._1999.xhtml.CiteType;
import org.w3._1999.xhtml.CodeType;
import org.w3._1999.xhtml.DfnType;
import org.w3._1999.xhtml.EmType;
import org.w3._1999.xhtml.ImgType;
import org.w3._1999.xhtml.InlPresType;
import org.w3._1999.xhtml.InputType;
import org.w3._1999.xhtml.KbdType;
import org.w3._1999.xhtml.LabelType;
import org.w3._1999.xhtml.NoscriptType;
import org.w3._1999.xhtml.ObjectType;
import org.w3._1999.xhtml.QType;
import org.w3._1999.xhtml.SampType;
import org.w3._1999.xhtml.ScriptType;
import org.w3._1999.xhtml.SelectType;
import org.w3._1999.xhtml.SpanType;
import org.w3._1999.xhtml.StrongType;
import org.w3._1999.xhtml.TextareaType;
import org.w3._1999.xhtml.VarType;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getCite1 <em>Cite1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.QTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QTypeImpl extends MinimalEObjectImpl.Container implements QType {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The default value of the '{@link #getCite1() <em>Cite1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCite1()
     * @generated
     * @ordered
     */
    protected static final String CITE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCite1() <em>Cite1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCite1()
     * @generated
     * @ordered
     */
    protected String cite1 = CITE1_EDEFAULT;

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
    protected QTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getQType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, XHTML11Package.QTYPE__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlInlineMix() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTML11Package.eINSTANCE.getQType_XhtmlInlineMix());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BrType> getBr() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Br());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpanType> getSpan() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Span());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EmType> getEm() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Em());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StrongType> getStrong() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Strong());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DfnType> getDfn() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Dfn());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CodeType> getCode() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Code());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SampType> getSamp() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Samp());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KbdType> getKbd() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Kbd());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VarType> getVar() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Var());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CiteType> getCite() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Cite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbbrType> getAbbr() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Abbr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AcronymType> getAcronym() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Acronym());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QType> getQ() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Q());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getTt() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Tt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getI() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_I());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getB() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_B());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getBig() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Big());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSmall() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Small());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSub() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Sub());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSup() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Sup());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AType> getA() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_A());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ImgType> getImg() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Img());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Object());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputType> getInput() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Input());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SelectType> getSelect() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Select());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TextareaType> getTextarea() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Textarea());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Label());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ButtonType> getButton() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Button());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoscriptType> getNoscript() {
        return getXhtmlInlineMix().list(XHTML11Package.eINSTANCE.getQType_Noscript());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCite1() {
        return cite1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCite1(String newCite1) {
        String oldCite1 = cite1;
        cite1 = newCite1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__CITE1, oldCite1, cite1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__CLASS, oldClass, class_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__LANG1, oldLang1, lang1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONCLICK, oldOnclick, onclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONDBLCLICK, oldOndblclick, ondblclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONKEYUP, oldOnkeyup, onkeyup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.QTYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__STYLE, oldStyle, style));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.QTYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.QTYPE__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__XHTML_INLINE_MIX:
                return ((InternalEList<?>)getXhtmlInlineMix()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__BR:
                return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SPAN:
                return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__EM:
                return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__STRONG:
                return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__DFN:
                return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__CODE:
                return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SAMP:
                return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__KBD:
                return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__VAR:
                return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__CITE:
                return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__ABBR:
                return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__ACRONYM:
                return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__Q:
                return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__TT:
                return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__I:
                return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__B:
                return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__BIG:
                return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SMALL:
                return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SUB:
                return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SUP:
                return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__A:
                return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__IMG:
                return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__OBJECT:
                return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SELECT:
                return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__TEXTAREA:
                return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__LABEL:
                return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__BUTTON:
                return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.QTYPE__NOSCRIPT:
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
            case XHTML11Package.QTYPE__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case XHTML11Package.QTYPE__XHTML_INLINE_MIX:
                if (coreType) return getXhtmlInlineMix();
                return ((FeatureMap.Internal)getXhtmlInlineMix()).getWrapper();
            case XHTML11Package.QTYPE__BR:
                return getBr();
            case XHTML11Package.QTYPE__SPAN:
                return getSpan();
            case XHTML11Package.QTYPE__EM:
                return getEm();
            case XHTML11Package.QTYPE__STRONG:
                return getStrong();
            case XHTML11Package.QTYPE__DFN:
                return getDfn();
            case XHTML11Package.QTYPE__CODE:
                return getCode();
            case XHTML11Package.QTYPE__SAMP:
                return getSamp();
            case XHTML11Package.QTYPE__KBD:
                return getKbd();
            case XHTML11Package.QTYPE__VAR:
                return getVar();
            case XHTML11Package.QTYPE__CITE:
                return getCite();
            case XHTML11Package.QTYPE__ABBR:
                return getAbbr();
            case XHTML11Package.QTYPE__ACRONYM:
                return getAcronym();
            case XHTML11Package.QTYPE__Q:
                return getQ();
            case XHTML11Package.QTYPE__TT:
                return getTt();
            case XHTML11Package.QTYPE__I:
                return getI();
            case XHTML11Package.QTYPE__B:
                return getB();
            case XHTML11Package.QTYPE__BIG:
                return getBig();
            case XHTML11Package.QTYPE__SMALL:
                return getSmall();
            case XHTML11Package.QTYPE__SUB:
                return getSub();
            case XHTML11Package.QTYPE__SUP:
                return getSup();
            case XHTML11Package.QTYPE__A:
                return getA();
            case XHTML11Package.QTYPE__IMG:
                return getImg();
            case XHTML11Package.QTYPE__OBJECT:
                return getObject();
            case XHTML11Package.QTYPE__INPUT:
                return getInput();
            case XHTML11Package.QTYPE__SELECT:
                return getSelect();
            case XHTML11Package.QTYPE__TEXTAREA:
                return getTextarea();
            case XHTML11Package.QTYPE__LABEL:
                return getLabel();
            case XHTML11Package.QTYPE__BUTTON:
                return getButton();
            case XHTML11Package.QTYPE__SCRIPT:
                return getScript();
            case XHTML11Package.QTYPE__NOSCRIPT:
                return getNoscript();
            case XHTML11Package.QTYPE__CITE1:
                return getCite1();
            case XHTML11Package.QTYPE__CLASS:
                return getClass_();
            case XHTML11Package.QTYPE__ID:
                return getId();
            case XHTML11Package.QTYPE__LANG:
                return getLang();
            case XHTML11Package.QTYPE__LANG1:
                return getLang1();
            case XHTML11Package.QTYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.QTYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.QTYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.QTYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.QTYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.QTYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.QTYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.QTYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.QTYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.QTYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.QTYPE__SPACE:
                return getSpace();
            case XHTML11Package.QTYPE__STYLE:
                return getStyle();
            case XHTML11Package.QTYPE__TITLE:
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
            case XHTML11Package.QTYPE__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case XHTML11Package.QTYPE__XHTML_INLINE_MIX:
                ((FeatureMap.Internal)getXhtmlInlineMix()).set(newValue);
                return;
            case XHTML11Package.QTYPE__BR:
                getBr().clear();
                getBr().addAll((Collection<? extends BrType>)newValue);
                return;
            case XHTML11Package.QTYPE__SPAN:
                getSpan().clear();
                getSpan().addAll((Collection<? extends SpanType>)newValue);
                return;
            case XHTML11Package.QTYPE__EM:
                getEm().clear();
                getEm().addAll((Collection<? extends EmType>)newValue);
                return;
            case XHTML11Package.QTYPE__STRONG:
                getStrong().clear();
                getStrong().addAll((Collection<? extends StrongType>)newValue);
                return;
            case XHTML11Package.QTYPE__DFN:
                getDfn().clear();
                getDfn().addAll((Collection<? extends DfnType>)newValue);
                return;
            case XHTML11Package.QTYPE__CODE:
                getCode().clear();
                getCode().addAll((Collection<? extends CodeType>)newValue);
                return;
            case XHTML11Package.QTYPE__SAMP:
                getSamp().clear();
                getSamp().addAll((Collection<? extends SampType>)newValue);
                return;
            case XHTML11Package.QTYPE__KBD:
                getKbd().clear();
                getKbd().addAll((Collection<? extends KbdType>)newValue);
                return;
            case XHTML11Package.QTYPE__VAR:
                getVar().clear();
                getVar().addAll((Collection<? extends VarType>)newValue);
                return;
            case XHTML11Package.QTYPE__CITE:
                getCite().clear();
                getCite().addAll((Collection<? extends CiteType>)newValue);
                return;
            case XHTML11Package.QTYPE__ABBR:
                getAbbr().clear();
                getAbbr().addAll((Collection<? extends AbbrType>)newValue);
                return;
            case XHTML11Package.QTYPE__ACRONYM:
                getAcronym().clear();
                getAcronym().addAll((Collection<? extends AcronymType>)newValue);
                return;
            case XHTML11Package.QTYPE__Q:
                getQ().clear();
                getQ().addAll((Collection<? extends QType>)newValue);
                return;
            case XHTML11Package.QTYPE__TT:
                getTt().clear();
                getTt().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__I:
                getI().clear();
                getI().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__B:
                getB().clear();
                getB().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__BIG:
                getBig().clear();
                getBig().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__SMALL:
                getSmall().clear();
                getSmall().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__SUB:
                getSub().clear();
                getSub().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__SUP:
                getSup().clear();
                getSup().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.QTYPE__A:
                getA().clear();
                getA().addAll((Collection<? extends AType>)newValue);
                return;
            case XHTML11Package.QTYPE__IMG:
                getImg().clear();
                getImg().addAll((Collection<? extends ImgType>)newValue);
                return;
            case XHTML11Package.QTYPE__OBJECT:
                getObject().clear();
                getObject().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.QTYPE__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends InputType>)newValue);
                return;
            case XHTML11Package.QTYPE__SELECT:
                getSelect().clear();
                getSelect().addAll((Collection<? extends SelectType>)newValue);
                return;
            case XHTML11Package.QTYPE__TEXTAREA:
                getTextarea().clear();
                getTextarea().addAll((Collection<? extends TextareaType>)newValue);
                return;
            case XHTML11Package.QTYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>)newValue);
                return;
            case XHTML11Package.QTYPE__BUTTON:
                getButton().clear();
                getButton().addAll((Collection<? extends ButtonType>)newValue);
                return;
            case XHTML11Package.QTYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.QTYPE__NOSCRIPT:
                getNoscript().clear();
                getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
                return;
            case XHTML11Package.QTYPE__CITE1:
                setCite1((String)newValue);
                return;
            case XHTML11Package.QTYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.QTYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.QTYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.QTYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.QTYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.QTYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.QTYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.QTYPE__TITLE:
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
            case XHTML11Package.QTYPE__MIXED:
                getMixed().clear();
                return;
            case XHTML11Package.QTYPE__XHTML_INLINE_MIX:
                getXhtmlInlineMix().clear();
                return;
            case XHTML11Package.QTYPE__BR:
                getBr().clear();
                return;
            case XHTML11Package.QTYPE__SPAN:
                getSpan().clear();
                return;
            case XHTML11Package.QTYPE__EM:
                getEm().clear();
                return;
            case XHTML11Package.QTYPE__STRONG:
                getStrong().clear();
                return;
            case XHTML11Package.QTYPE__DFN:
                getDfn().clear();
                return;
            case XHTML11Package.QTYPE__CODE:
                getCode().clear();
                return;
            case XHTML11Package.QTYPE__SAMP:
                getSamp().clear();
                return;
            case XHTML11Package.QTYPE__KBD:
                getKbd().clear();
                return;
            case XHTML11Package.QTYPE__VAR:
                getVar().clear();
                return;
            case XHTML11Package.QTYPE__CITE:
                getCite().clear();
                return;
            case XHTML11Package.QTYPE__ABBR:
                getAbbr().clear();
                return;
            case XHTML11Package.QTYPE__ACRONYM:
                getAcronym().clear();
                return;
            case XHTML11Package.QTYPE__Q:
                getQ().clear();
                return;
            case XHTML11Package.QTYPE__TT:
                getTt().clear();
                return;
            case XHTML11Package.QTYPE__I:
                getI().clear();
                return;
            case XHTML11Package.QTYPE__B:
                getB().clear();
                return;
            case XHTML11Package.QTYPE__BIG:
                getBig().clear();
                return;
            case XHTML11Package.QTYPE__SMALL:
                getSmall().clear();
                return;
            case XHTML11Package.QTYPE__SUB:
                getSub().clear();
                return;
            case XHTML11Package.QTYPE__SUP:
                getSup().clear();
                return;
            case XHTML11Package.QTYPE__A:
                getA().clear();
                return;
            case XHTML11Package.QTYPE__IMG:
                getImg().clear();
                return;
            case XHTML11Package.QTYPE__OBJECT:
                getObject().clear();
                return;
            case XHTML11Package.QTYPE__INPUT:
                getInput().clear();
                return;
            case XHTML11Package.QTYPE__SELECT:
                getSelect().clear();
                return;
            case XHTML11Package.QTYPE__TEXTAREA:
                getTextarea().clear();
                return;
            case XHTML11Package.QTYPE__LABEL:
                getLabel().clear();
                return;
            case XHTML11Package.QTYPE__BUTTON:
                getButton().clear();
                return;
            case XHTML11Package.QTYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.QTYPE__NOSCRIPT:
                getNoscript().clear();
                return;
            case XHTML11Package.QTYPE__CITE1:
                setCite1(CITE1_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.QTYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.QTYPE__TITLE:
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
            case XHTML11Package.QTYPE__MIXED:
                return mixed != null && !mixed.isEmpty();
            case XHTML11Package.QTYPE__XHTML_INLINE_MIX:
                return !getXhtmlInlineMix().isEmpty();
            case XHTML11Package.QTYPE__BR:
                return !getBr().isEmpty();
            case XHTML11Package.QTYPE__SPAN:
                return !getSpan().isEmpty();
            case XHTML11Package.QTYPE__EM:
                return !getEm().isEmpty();
            case XHTML11Package.QTYPE__STRONG:
                return !getStrong().isEmpty();
            case XHTML11Package.QTYPE__DFN:
                return !getDfn().isEmpty();
            case XHTML11Package.QTYPE__CODE:
                return !getCode().isEmpty();
            case XHTML11Package.QTYPE__SAMP:
                return !getSamp().isEmpty();
            case XHTML11Package.QTYPE__KBD:
                return !getKbd().isEmpty();
            case XHTML11Package.QTYPE__VAR:
                return !getVar().isEmpty();
            case XHTML11Package.QTYPE__CITE:
                return !getCite().isEmpty();
            case XHTML11Package.QTYPE__ABBR:
                return !getAbbr().isEmpty();
            case XHTML11Package.QTYPE__ACRONYM:
                return !getAcronym().isEmpty();
            case XHTML11Package.QTYPE__Q:
                return !getQ().isEmpty();
            case XHTML11Package.QTYPE__TT:
                return !getTt().isEmpty();
            case XHTML11Package.QTYPE__I:
                return !getI().isEmpty();
            case XHTML11Package.QTYPE__B:
                return !getB().isEmpty();
            case XHTML11Package.QTYPE__BIG:
                return !getBig().isEmpty();
            case XHTML11Package.QTYPE__SMALL:
                return !getSmall().isEmpty();
            case XHTML11Package.QTYPE__SUB:
                return !getSub().isEmpty();
            case XHTML11Package.QTYPE__SUP:
                return !getSup().isEmpty();
            case XHTML11Package.QTYPE__A:
                return !getA().isEmpty();
            case XHTML11Package.QTYPE__IMG:
                return !getImg().isEmpty();
            case XHTML11Package.QTYPE__OBJECT:
                return !getObject().isEmpty();
            case XHTML11Package.QTYPE__INPUT:
                return !getInput().isEmpty();
            case XHTML11Package.QTYPE__SELECT:
                return !getSelect().isEmpty();
            case XHTML11Package.QTYPE__TEXTAREA:
                return !getTextarea().isEmpty();
            case XHTML11Package.QTYPE__LABEL:
                return !getLabel().isEmpty();
            case XHTML11Package.QTYPE__BUTTON:
                return !getButton().isEmpty();
            case XHTML11Package.QTYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.QTYPE__NOSCRIPT:
                return !getNoscript().isEmpty();
            case XHTML11Package.QTYPE__CITE1:
                return CITE1_EDEFAULT == null ? cite1 != null : !CITE1_EDEFAULT.equals(cite1);
            case XHTML11Package.QTYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.QTYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.QTYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.QTYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.QTYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.QTYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.QTYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.QTYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.QTYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.QTYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.QTYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.QTYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.QTYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.QTYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.QTYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.QTYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.QTYPE__TITLE:
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(", cite1: ");
        result.append(cite1);
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

} //QTypeImpl
