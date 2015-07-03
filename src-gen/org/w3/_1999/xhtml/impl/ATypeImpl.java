/**
 */
package org.w3._1999.xhtml.impl;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getXhtmlInlNoAnchorMix <em>Xhtml Inl No Anchor Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnblur <em>Onblur</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnfocus <em>Onfocus</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getRev <em>Rev</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ATypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATypeImpl extends MinimalEObjectImpl.Container implements AType {
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
     * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
    protected static final String CHARSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharset()
     * @generated
     * @ordered
     */
    protected String charset = CHARSET_EDEFAULT;

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
     * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHref()
     * @generated
     * @ordered
     */
    protected static final String HREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHref()
     * @generated
     * @ordered
     */
    protected String href = HREF_EDEFAULT;

    /**
     * The default value of the '{@link #getHreflang() <em>Hreflang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHreflang()
     * @generated
     * @ordered
     */
    protected static final String HREFLANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHreflang() <em>Hreflang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHreflang()
     * @generated
     * @ordered
     */
    protected String hreflang = HREFLANG_EDEFAULT;

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
     * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRel()
     * @generated
     * @ordered
     */
    protected static final List<String> REL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRel()
     * @generated
     * @ordered
     */
    protected List<String> rel = REL_EDEFAULT;

    /**
     * The default value of the '{@link #getRev() <em>Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRev()
     * @generated
     * @ordered
     */
    protected static final List<String> REV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRev() <em>Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRev()
     * @generated
     * @ordered
     */
    protected List<String> rev = REV_EDEFAULT;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ATypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getAType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, XHTML11Package.ATYPE__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlInlNoAnchorMix() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTML11Package.eINSTANCE.getAType_XhtmlInlNoAnchorMix());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BrType> getBr() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Br());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpanType> getSpan() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Span());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EmType> getEm() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Em());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StrongType> getStrong() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Strong());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DfnType> getDfn() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Dfn());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CodeType> getCode() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Code());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SampType> getSamp() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Samp());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KbdType> getKbd() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Kbd());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VarType> getVar() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Var());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CiteType> getCite() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Cite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbbrType> getAbbr() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Abbr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AcronymType> getAcronym() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Acronym());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QType> getQ() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Q());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getTt() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Tt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getI() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_I());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getB() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_B());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getBig() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Big());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSmall() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Small());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSub() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Sub());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSup() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Sup());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ImgType> getImg() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Img());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Object());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputType> getInput() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Input());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SelectType> getSelect() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Select());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TextareaType> getTextarea() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Textarea());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Label());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ButtonType> getButton() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Button());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoscriptType> getNoscript() {
        return getXhtmlInlNoAnchorMix().list(XHTML11Package.eINSTANCE.getAType_Noscript());
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ACCESSKEY, oldAccesskey, accesskey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCharset() {
        return charset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharset(String newCharset) {
        String oldCharset = charset;
        charset = newCharset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__CHARSET, oldCharset, charset));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__CLASS, oldClass, class_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHref() {
        return href;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHref(String newHref) {
        String oldHref = href;
        href = newHref;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__HREF, oldHref, href));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHreflang() {
        return hreflang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHreflang(String newHreflang) {
        String oldHreflang = hreflang;
        hreflang = newHreflang;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__HREFLANG, oldHreflang, hreflang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__LANG1, oldLang1, lang1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONBLUR, oldOnblur, onblur));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONCLICK, oldOnclick, onclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONDBLCLICK, oldOndblclick, ondblclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONFOCUS, oldOnfocus, onfocus));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONKEYUP, oldOnkeyup, onkeyup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getRel() {
        return rel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRel(List<String> newRel) {
        List<String> oldRel = rel;
        rel = newRel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__REL, oldRel, rel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getRev() {
        return rev;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRev(List<String> newRev) {
        List<String> oldRev = rev;
        rev = newRev;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__REV, oldRev, rev));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.ATYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__STYLE, oldStyle, style));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__TABINDEX, oldTabindex, tabindex));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__TARGET, oldTarget, target));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.ATYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.ATYPE__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__XHTML_INL_NO_ANCHOR_MIX:
                return ((InternalEList<?>)getXhtmlInlNoAnchorMix()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__BR:
                return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SPAN:
                return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__EM:
                return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__STRONG:
                return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__DFN:
                return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__CODE:
                return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SAMP:
                return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__KBD:
                return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__VAR:
                return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__CITE:
                return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__ABBR:
                return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__ACRONYM:
                return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__Q:
                return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__TT:
                return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__I:
                return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__B:
                return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__BIG:
                return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SMALL:
                return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SUB:
                return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SUP:
                return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__IMG:
                return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__OBJECT:
                return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SELECT:
                return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__TEXTAREA:
                return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__LABEL:
                return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__BUTTON:
                return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.ATYPE__NOSCRIPT:
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
            case XHTML11Package.ATYPE__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case XHTML11Package.ATYPE__XHTML_INL_NO_ANCHOR_MIX:
                if (coreType) return getXhtmlInlNoAnchorMix();
                return ((FeatureMap.Internal)getXhtmlInlNoAnchorMix()).getWrapper();
            case XHTML11Package.ATYPE__BR:
                return getBr();
            case XHTML11Package.ATYPE__SPAN:
                return getSpan();
            case XHTML11Package.ATYPE__EM:
                return getEm();
            case XHTML11Package.ATYPE__STRONG:
                return getStrong();
            case XHTML11Package.ATYPE__DFN:
                return getDfn();
            case XHTML11Package.ATYPE__CODE:
                return getCode();
            case XHTML11Package.ATYPE__SAMP:
                return getSamp();
            case XHTML11Package.ATYPE__KBD:
                return getKbd();
            case XHTML11Package.ATYPE__VAR:
                return getVar();
            case XHTML11Package.ATYPE__CITE:
                return getCite();
            case XHTML11Package.ATYPE__ABBR:
                return getAbbr();
            case XHTML11Package.ATYPE__ACRONYM:
                return getAcronym();
            case XHTML11Package.ATYPE__Q:
                return getQ();
            case XHTML11Package.ATYPE__TT:
                return getTt();
            case XHTML11Package.ATYPE__I:
                return getI();
            case XHTML11Package.ATYPE__B:
                return getB();
            case XHTML11Package.ATYPE__BIG:
                return getBig();
            case XHTML11Package.ATYPE__SMALL:
                return getSmall();
            case XHTML11Package.ATYPE__SUB:
                return getSub();
            case XHTML11Package.ATYPE__SUP:
                return getSup();
            case XHTML11Package.ATYPE__IMG:
                return getImg();
            case XHTML11Package.ATYPE__OBJECT:
                return getObject();
            case XHTML11Package.ATYPE__INPUT:
                return getInput();
            case XHTML11Package.ATYPE__SELECT:
                return getSelect();
            case XHTML11Package.ATYPE__TEXTAREA:
                return getTextarea();
            case XHTML11Package.ATYPE__LABEL:
                return getLabel();
            case XHTML11Package.ATYPE__BUTTON:
                return getButton();
            case XHTML11Package.ATYPE__SCRIPT:
                return getScript();
            case XHTML11Package.ATYPE__NOSCRIPT:
                return getNoscript();
            case XHTML11Package.ATYPE__ACCESSKEY:
                return getAccesskey();
            case XHTML11Package.ATYPE__CHARSET:
                return getCharset();
            case XHTML11Package.ATYPE__CLASS:
                return getClass_();
            case XHTML11Package.ATYPE__HREF:
                return getHref();
            case XHTML11Package.ATYPE__HREFLANG:
                return getHreflang();
            case XHTML11Package.ATYPE__ID:
                return getId();
            case XHTML11Package.ATYPE__LANG:
                return getLang();
            case XHTML11Package.ATYPE__LANG1:
                return getLang1();
            case XHTML11Package.ATYPE__ONBLUR:
                return getOnblur();
            case XHTML11Package.ATYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.ATYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.ATYPE__ONFOCUS:
                return getOnfocus();
            case XHTML11Package.ATYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.ATYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.ATYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.ATYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.ATYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.ATYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.ATYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.ATYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.ATYPE__REL:
                return getRel();
            case XHTML11Package.ATYPE__REV:
                return getRev();
            case XHTML11Package.ATYPE__SPACE:
                return getSpace();
            case XHTML11Package.ATYPE__STYLE:
                return getStyle();
            case XHTML11Package.ATYPE__TABINDEX:
                return getTabindex();
            case XHTML11Package.ATYPE__TARGET:
                return getTarget();
            case XHTML11Package.ATYPE__TITLE:
                return getTitle();
            case XHTML11Package.ATYPE__TYPE:
                return getType();
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
            case XHTML11Package.ATYPE__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case XHTML11Package.ATYPE__XHTML_INL_NO_ANCHOR_MIX:
                ((FeatureMap.Internal)getXhtmlInlNoAnchorMix()).set(newValue);
                return;
            case XHTML11Package.ATYPE__BR:
                getBr().clear();
                getBr().addAll((Collection<? extends BrType>)newValue);
                return;
            case XHTML11Package.ATYPE__SPAN:
                getSpan().clear();
                getSpan().addAll((Collection<? extends SpanType>)newValue);
                return;
            case XHTML11Package.ATYPE__EM:
                getEm().clear();
                getEm().addAll((Collection<? extends EmType>)newValue);
                return;
            case XHTML11Package.ATYPE__STRONG:
                getStrong().clear();
                getStrong().addAll((Collection<? extends StrongType>)newValue);
                return;
            case XHTML11Package.ATYPE__DFN:
                getDfn().clear();
                getDfn().addAll((Collection<? extends DfnType>)newValue);
                return;
            case XHTML11Package.ATYPE__CODE:
                getCode().clear();
                getCode().addAll((Collection<? extends CodeType>)newValue);
                return;
            case XHTML11Package.ATYPE__SAMP:
                getSamp().clear();
                getSamp().addAll((Collection<? extends SampType>)newValue);
                return;
            case XHTML11Package.ATYPE__KBD:
                getKbd().clear();
                getKbd().addAll((Collection<? extends KbdType>)newValue);
                return;
            case XHTML11Package.ATYPE__VAR:
                getVar().clear();
                getVar().addAll((Collection<? extends VarType>)newValue);
                return;
            case XHTML11Package.ATYPE__CITE:
                getCite().clear();
                getCite().addAll((Collection<? extends CiteType>)newValue);
                return;
            case XHTML11Package.ATYPE__ABBR:
                getAbbr().clear();
                getAbbr().addAll((Collection<? extends AbbrType>)newValue);
                return;
            case XHTML11Package.ATYPE__ACRONYM:
                getAcronym().clear();
                getAcronym().addAll((Collection<? extends AcronymType>)newValue);
                return;
            case XHTML11Package.ATYPE__Q:
                getQ().clear();
                getQ().addAll((Collection<? extends QType>)newValue);
                return;
            case XHTML11Package.ATYPE__TT:
                getTt().clear();
                getTt().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__I:
                getI().clear();
                getI().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__B:
                getB().clear();
                getB().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__BIG:
                getBig().clear();
                getBig().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__SMALL:
                getSmall().clear();
                getSmall().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__SUB:
                getSub().clear();
                getSub().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__SUP:
                getSup().clear();
                getSup().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.ATYPE__IMG:
                getImg().clear();
                getImg().addAll((Collection<? extends ImgType>)newValue);
                return;
            case XHTML11Package.ATYPE__OBJECT:
                getObject().clear();
                getObject().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.ATYPE__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends InputType>)newValue);
                return;
            case XHTML11Package.ATYPE__SELECT:
                getSelect().clear();
                getSelect().addAll((Collection<? extends SelectType>)newValue);
                return;
            case XHTML11Package.ATYPE__TEXTAREA:
                getTextarea().clear();
                getTextarea().addAll((Collection<? extends TextareaType>)newValue);
                return;
            case XHTML11Package.ATYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>)newValue);
                return;
            case XHTML11Package.ATYPE__BUTTON:
                getButton().clear();
                getButton().addAll((Collection<? extends ButtonType>)newValue);
                return;
            case XHTML11Package.ATYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.ATYPE__NOSCRIPT:
                getNoscript().clear();
                getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
                return;
            case XHTML11Package.ATYPE__ACCESSKEY:
                setAccesskey((String)newValue);
                return;
            case XHTML11Package.ATYPE__CHARSET:
                setCharset((String)newValue);
                return;
            case XHTML11Package.ATYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.ATYPE__HREF:
                setHref((String)newValue);
                return;
            case XHTML11Package.ATYPE__HREFLANG:
                setHreflang((String)newValue);
                return;
            case XHTML11Package.ATYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.ATYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.ATYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONBLUR:
                setOnblur((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONFOCUS:
                setOnfocus((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.ATYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.ATYPE__REL:
                setRel((List<String>)newValue);
                return;
            case XHTML11Package.ATYPE__REV:
                setRev((List<String>)newValue);
                return;
            case XHTML11Package.ATYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.ATYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.ATYPE__TABINDEX:
                setTabindex((BigInteger)newValue);
                return;
            case XHTML11Package.ATYPE__TARGET:
                setTarget(newValue);
                return;
            case XHTML11Package.ATYPE__TITLE:
                setTitle((String)newValue);
                return;
            case XHTML11Package.ATYPE__TYPE:
                setType((String)newValue);
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
            case XHTML11Package.ATYPE__MIXED:
                getMixed().clear();
                return;
            case XHTML11Package.ATYPE__XHTML_INL_NO_ANCHOR_MIX:
                getXhtmlInlNoAnchorMix().clear();
                return;
            case XHTML11Package.ATYPE__BR:
                getBr().clear();
                return;
            case XHTML11Package.ATYPE__SPAN:
                getSpan().clear();
                return;
            case XHTML11Package.ATYPE__EM:
                getEm().clear();
                return;
            case XHTML11Package.ATYPE__STRONG:
                getStrong().clear();
                return;
            case XHTML11Package.ATYPE__DFN:
                getDfn().clear();
                return;
            case XHTML11Package.ATYPE__CODE:
                getCode().clear();
                return;
            case XHTML11Package.ATYPE__SAMP:
                getSamp().clear();
                return;
            case XHTML11Package.ATYPE__KBD:
                getKbd().clear();
                return;
            case XHTML11Package.ATYPE__VAR:
                getVar().clear();
                return;
            case XHTML11Package.ATYPE__CITE:
                getCite().clear();
                return;
            case XHTML11Package.ATYPE__ABBR:
                getAbbr().clear();
                return;
            case XHTML11Package.ATYPE__ACRONYM:
                getAcronym().clear();
                return;
            case XHTML11Package.ATYPE__Q:
                getQ().clear();
                return;
            case XHTML11Package.ATYPE__TT:
                getTt().clear();
                return;
            case XHTML11Package.ATYPE__I:
                getI().clear();
                return;
            case XHTML11Package.ATYPE__B:
                getB().clear();
                return;
            case XHTML11Package.ATYPE__BIG:
                getBig().clear();
                return;
            case XHTML11Package.ATYPE__SMALL:
                getSmall().clear();
                return;
            case XHTML11Package.ATYPE__SUB:
                getSub().clear();
                return;
            case XHTML11Package.ATYPE__SUP:
                getSup().clear();
                return;
            case XHTML11Package.ATYPE__IMG:
                getImg().clear();
                return;
            case XHTML11Package.ATYPE__OBJECT:
                getObject().clear();
                return;
            case XHTML11Package.ATYPE__INPUT:
                getInput().clear();
                return;
            case XHTML11Package.ATYPE__SELECT:
                getSelect().clear();
                return;
            case XHTML11Package.ATYPE__TEXTAREA:
                getTextarea().clear();
                return;
            case XHTML11Package.ATYPE__LABEL:
                getLabel().clear();
                return;
            case XHTML11Package.ATYPE__BUTTON:
                getButton().clear();
                return;
            case XHTML11Package.ATYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.ATYPE__NOSCRIPT:
                getNoscript().clear();
                return;
            case XHTML11Package.ATYPE__ACCESSKEY:
                setAccesskey(ACCESSKEY_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__CHARSET:
                setCharset(CHARSET_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__HREF:
                setHref(HREF_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__HREFLANG:
                setHreflang(HREFLANG_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONBLUR:
                setOnblur(ONBLUR_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONFOCUS:
                setOnfocus(ONFOCUS_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__REL:
                setRel(REL_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__REV:
                setRev(REV_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.ATYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__TABINDEX:
                setTabindex(TABINDEX_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__TARGET:
                setTarget(TARGET_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case XHTML11Package.ATYPE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case XHTML11Package.ATYPE__MIXED:
                return mixed != null && !mixed.isEmpty();
            case XHTML11Package.ATYPE__XHTML_INL_NO_ANCHOR_MIX:
                return !getXhtmlInlNoAnchorMix().isEmpty();
            case XHTML11Package.ATYPE__BR:
                return !getBr().isEmpty();
            case XHTML11Package.ATYPE__SPAN:
                return !getSpan().isEmpty();
            case XHTML11Package.ATYPE__EM:
                return !getEm().isEmpty();
            case XHTML11Package.ATYPE__STRONG:
                return !getStrong().isEmpty();
            case XHTML11Package.ATYPE__DFN:
                return !getDfn().isEmpty();
            case XHTML11Package.ATYPE__CODE:
                return !getCode().isEmpty();
            case XHTML11Package.ATYPE__SAMP:
                return !getSamp().isEmpty();
            case XHTML11Package.ATYPE__KBD:
                return !getKbd().isEmpty();
            case XHTML11Package.ATYPE__VAR:
                return !getVar().isEmpty();
            case XHTML11Package.ATYPE__CITE:
                return !getCite().isEmpty();
            case XHTML11Package.ATYPE__ABBR:
                return !getAbbr().isEmpty();
            case XHTML11Package.ATYPE__ACRONYM:
                return !getAcronym().isEmpty();
            case XHTML11Package.ATYPE__Q:
                return !getQ().isEmpty();
            case XHTML11Package.ATYPE__TT:
                return !getTt().isEmpty();
            case XHTML11Package.ATYPE__I:
                return !getI().isEmpty();
            case XHTML11Package.ATYPE__B:
                return !getB().isEmpty();
            case XHTML11Package.ATYPE__BIG:
                return !getBig().isEmpty();
            case XHTML11Package.ATYPE__SMALL:
                return !getSmall().isEmpty();
            case XHTML11Package.ATYPE__SUB:
                return !getSub().isEmpty();
            case XHTML11Package.ATYPE__SUP:
                return !getSup().isEmpty();
            case XHTML11Package.ATYPE__IMG:
                return !getImg().isEmpty();
            case XHTML11Package.ATYPE__OBJECT:
                return !getObject().isEmpty();
            case XHTML11Package.ATYPE__INPUT:
                return !getInput().isEmpty();
            case XHTML11Package.ATYPE__SELECT:
                return !getSelect().isEmpty();
            case XHTML11Package.ATYPE__TEXTAREA:
                return !getTextarea().isEmpty();
            case XHTML11Package.ATYPE__LABEL:
                return !getLabel().isEmpty();
            case XHTML11Package.ATYPE__BUTTON:
                return !getButton().isEmpty();
            case XHTML11Package.ATYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.ATYPE__NOSCRIPT:
                return !getNoscript().isEmpty();
            case XHTML11Package.ATYPE__ACCESSKEY:
                return ACCESSKEY_EDEFAULT == null ? accesskey != null : !ACCESSKEY_EDEFAULT.equals(accesskey);
            case XHTML11Package.ATYPE__CHARSET:
                return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
            case XHTML11Package.ATYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.ATYPE__HREF:
                return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
            case XHTML11Package.ATYPE__HREFLANG:
                return HREFLANG_EDEFAULT == null ? hreflang != null : !HREFLANG_EDEFAULT.equals(hreflang);
            case XHTML11Package.ATYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.ATYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.ATYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.ATYPE__ONBLUR:
                return ONBLUR_EDEFAULT == null ? onblur != null : !ONBLUR_EDEFAULT.equals(onblur);
            case XHTML11Package.ATYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.ATYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.ATYPE__ONFOCUS:
                return ONFOCUS_EDEFAULT == null ? onfocus != null : !ONFOCUS_EDEFAULT.equals(onfocus);
            case XHTML11Package.ATYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.ATYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.ATYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.ATYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.ATYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.ATYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.ATYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.ATYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.ATYPE__REL:
                return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
            case XHTML11Package.ATYPE__REV:
                return REV_EDEFAULT == null ? rev != null : !REV_EDEFAULT.equals(rev);
            case XHTML11Package.ATYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.ATYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.ATYPE__TABINDEX:
                return TABINDEX_EDEFAULT == null ? tabindex != null : !TABINDEX_EDEFAULT.equals(tabindex);
            case XHTML11Package.ATYPE__TARGET:
                return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
            case XHTML11Package.ATYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case XHTML11Package.ATYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(", accesskey: ");
        result.append(accesskey);
        result.append(", charset: ");
        result.append(charset);
        result.append(", class: ");
        result.append(class_);
        result.append(", href: ");
        result.append(href);
        result.append(", hreflang: ");
        result.append(hreflang);
        result.append(", id: ");
        result.append(id);
        result.append(", lang: ");
        result.append(lang);
        result.append(", lang1: ");
        result.append(lang1);
        result.append(", onblur: ");
        result.append(onblur);
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
        result.append(", rel: ");
        result.append(rel);
        result.append(", rev: ");
        result.append(rev);
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(", style: ");
        result.append(style);
        result.append(", tabindex: ");
        result.append(tabindex);
        result.append(", target: ");
        result.append(target);
        result.append(", title: ");
        result.append(title);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ATypeImpl
