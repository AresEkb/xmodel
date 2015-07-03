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

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl;

import org.w3._1999.xhtml.AType;
import org.w3._1999.xhtml.AbbrType;
import org.w3._1999.xhtml.AcronymType;
import org.w3._1999.xhtml.AddressType;
import org.w3._1999.xhtml.AlignType;
import org.w3._1999.xhtml.BlockquoteType;
import org.w3._1999.xhtml.BrType;
import org.w3._1999.xhtml.ButtonType;
import org.w3._1999.xhtml.CiteType;
import org.w3._1999.xhtml.CodeType;
import org.w3._1999.xhtml.DfnType;
import org.w3._1999.xhtml.DivType;
import org.w3._1999.xhtml.DlType;
import org.w3._1999.xhtml.EmType;
import org.w3._1999.xhtml.FormType;
import org.w3._1999.xhtml.H1Type;
import org.w3._1999.xhtml.H2Type;
import org.w3._1999.xhtml.H3Type;
import org.w3._1999.xhtml.H4Type;
import org.w3._1999.xhtml.H5Type;
import org.w3._1999.xhtml.H6Type;
import org.w3._1999.xhtml.ImgType;
import org.w3._1999.xhtml.InlPresType;
import org.w3._1999.xhtml.InputType;
import org.w3._1999.xhtml.KbdType;
import org.w3._1999.xhtml.LabelType;
import org.w3._1999.xhtml.NoscriptType;
import org.w3._1999.xhtml.ObjectType;
import org.w3._1999.xhtml.OlType;
import org.w3._1999.xhtml.PType;
import org.w3._1999.xhtml.PreType;
import org.w3._1999.xhtml.QType;
import org.w3._1999.xhtml.SampType;
import org.w3._1999.xhtml.ScopeType;
import org.w3._1999.xhtml.ScriptType;
import org.w3._1999.xhtml.SelectType;
import org.w3._1999.xhtml.SpanType;
import org.w3._1999.xhtml.StrongType;
import org.w3._1999.xhtml.TextareaType;
import org.w3._1999.xhtml.ThType;
import org.w3._1999.xhtml.UlType;
import org.w3._1999.xhtml.ValignType;
import org.w3._1999.xhtml.VarType;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Th Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getXhtmlFlowNoTableMix <em>Xhtml Flow No Table Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ThTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThTypeImpl extends XMLTypeDocumentRootImpl implements ThType {
    /**
     * The default value of the '{@link #getAbbr1() <em>Abbr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbr1()
     * @generated
     * @ordered
     */
    protected static final String ABBR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbbr1() <em>Abbr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbr1()
     * @generated
     * @ordered
     */
    protected String abbr1 = ABBR1_EDEFAULT;

    /**
     * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlign()
     * @generated
     * @ordered
     */
    protected static final AlignType ALIGN_EDEFAULT = AlignType.LEFT;

    /**
     * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlign()
     * @generated
     * @ordered
     */
    protected AlignType align = ALIGN_EDEFAULT;

    /**
     * This is true if the Align attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alignESet;

    /**
     * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAxis()
     * @generated
     * @ordered
     */
    protected static final String AXIS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAxis()
     * @generated
     * @ordered
     */
    protected String axis = AXIS_EDEFAULT;

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
     * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColspan()
     * @generated
     * @ordered
     */
    protected static final BigInteger COLSPAN_EDEFAULT = new BigInteger("1");

    /**
     * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColspan()
     * @generated
     * @ordered
     */
    protected BigInteger colspan = COLSPAN_EDEFAULT;

    /**
     * This is true if the Colspan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean colspanESet;

    /**
     * The default value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaders()
     * @generated
     * @ordered
     */
    protected static final List<String> HEADERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeaders()
     * @generated
     * @ordered
     */
    protected List<String> headers = HEADERS_EDEFAULT;

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
     * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRowspan()
     * @generated
     * @ordered
     */
    protected static final BigInteger ROWSPAN_EDEFAULT = new BigInteger("1");

    /**
     * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRowspan()
     * @generated
     * @ordered
     */
    protected BigInteger rowspan = ROWSPAN_EDEFAULT;

    /**
     * This is true if the Rowspan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rowspanESet;

    /**
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected static final ScopeType SCOPE_EDEFAULT = ScopeType.ROW;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected ScopeType scope = SCOPE_EDEFAULT;

    /**
     * This is true if the Scope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scopeESet;

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
     * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValign()
     * @generated
     * @ordered
     */
    protected static final ValignType VALIGN_EDEFAULT = ValignType.TOP;

    /**
     * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValign()
     * @generated
     * @ordered
     */
    protected ValignType valign = VALIGN_EDEFAULT;

    /**
     * This is true if the Valign attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valignESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getThType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlFlowNoTableMix() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XHTML11Package.eINSTANCE.getThType_XhtmlFlowNoTableMix());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H1Type> getH1() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_H1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H2Type> getH2() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_H2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H3Type> getH3() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_H3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H4Type> getH4() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_H4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H5Type> getH5() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_H5());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<H6Type> getH6() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_H6());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UlType> getUl() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Ul());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OlType> getOl() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Ol());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DlType> getDl() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Dl());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PType> getP() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_P());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DivType> getDiv() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Div());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PreType> getPre() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Pre());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BlockquoteType> getBlockquote() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Blockquote());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AddressType> getAddress() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Address());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormType> getForm() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Form());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BrType> getBr() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Br());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpanType> getSpan() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Span());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EmType> getEm() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Em());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StrongType> getStrong() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Strong());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DfnType> getDfn() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Dfn());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CodeType> getCode() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Code());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SampType> getSamp() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Samp());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KbdType> getKbd() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Kbd());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VarType> getVar() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Var());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CiteType> getCite() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Cite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbbrType> getAbbr() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Abbr());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AcronymType> getAcronym() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Acronym());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QType> getQ() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Q());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getTt() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Tt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getI() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_I());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getB() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_B());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getBig() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Big());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSmall() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Small());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSub() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Sub());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InlPresType> getSup() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Sup());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AType> getA() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_A());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ImgType> getImg() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Img());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Object());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputType> getInput() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Input());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SelectType> getSelect() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Select());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TextareaType> getTextarea() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Textarea());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Label());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ButtonType> getButton() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Button());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoscriptType> getNoscript() {
        return getXhtmlFlowNoTableMix().list(XHTML11Package.eINSTANCE.getThType_Noscript());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAbbr1() {
        return abbr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbbr1(String newAbbr1) {
        String oldAbbr1 = abbr1;
        abbr1 = newAbbr1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ABBR1, oldAbbr1, abbr1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlignType getAlign() {
        return align;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlign(AlignType newAlign) {
        AlignType oldAlign = align;
        align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
        boolean oldAlignESet = alignESet;
        alignESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAlign() {
        AlignType oldAlign = align;
        boolean oldAlignESet = alignESet;
        align = ALIGN_EDEFAULT;
        alignESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.TH_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAlign() {
        return alignESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAxis() {
        return axis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAxis(String newAxis) {
        String oldAxis = axis;
        axis = newAxis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__AXIS, oldAxis, axis));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__CLASS, oldClass, class_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getColspan() {
        return colspan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColspan(BigInteger newColspan) {
        BigInteger oldColspan = colspan;
        colspan = newColspan;
        boolean oldColspanESet = colspanESet;
        colspanESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__COLSPAN, oldColspan, colspan, !oldColspanESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetColspan() {
        BigInteger oldColspan = colspan;
        boolean oldColspanESet = colspanESet;
        colspan = COLSPAN_EDEFAULT;
        colspanESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.TH_TYPE__COLSPAN, oldColspan, COLSPAN_EDEFAULT, oldColspanESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetColspan() {
        return colspanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getHeaders() {
        return headers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeaders(List<String> newHeaders) {
        List<String> oldHeaders = headers;
        headers = newHeaders;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__HEADERS, oldHeaders, headers));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__LANG1, oldLang1, lang1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONCLICK, oldOnclick, onclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getRowspan() {
        return rowspan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRowspan(BigInteger newRowspan) {
        BigInteger oldRowspan = rowspan;
        rowspan = newRowspan;
        boolean oldRowspanESet = rowspanESet;
        rowspanESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__ROWSPAN, oldRowspan, rowspan, !oldRowspanESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRowspan() {
        BigInteger oldRowspan = rowspan;
        boolean oldRowspanESet = rowspanESet;
        rowspan = ROWSPAN_EDEFAULT;
        rowspanESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.TH_TYPE__ROWSPAN, oldRowspan, ROWSPAN_EDEFAULT, oldRowspanESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRowspan() {
        return rowspanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeType getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScope(ScopeType newScope) {
        ScopeType oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetScope() {
        ScopeType oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.TH_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetScope() {
        return scopeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.TH_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__STYLE, oldStyle, style));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValignType getValign() {
        return valign;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValign(ValignType newValign) {
        ValignType oldValign = valign;
        valign = newValign == null ? VALIGN_EDEFAULT : newValign;
        boolean oldValignESet = valignESet;
        valignESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.TH_TYPE__VALIGN, oldValign, valign, !oldValignESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValign() {
        ValignType oldValign = valign;
        boolean oldValignESet = valignESet;
        valign = VALIGN_EDEFAULT;
        valignESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.TH_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValign() {
        return valignESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.TH_TYPE__XHTML_FLOW_NO_TABLE_MIX:
                return ((InternalEList<?>)getXhtmlFlowNoTableMix()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__H1:
                return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__H2:
                return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__H3:
                return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__H4:
                return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__H5:
                return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__H6:
                return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__UL:
                return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__OL:
                return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__DL:
                return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__P:
                return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__DIV:
                return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__PRE:
                return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__BLOCKQUOTE:
                return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__ADDRESS:
                return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__FORM:
                return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__BR:
                return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SPAN:
                return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__EM:
                return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__STRONG:
                return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__DFN:
                return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__CODE:
                return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SAMP:
                return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__KBD:
                return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__VAR:
                return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__CITE:
                return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__ABBR:
                return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__ACRONYM:
                return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__Q:
                return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__TT:
                return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__I:
                return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__B:
                return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__BIG:
                return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SMALL:
                return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SUB:
                return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SUP:
                return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__A:
                return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__IMG:
                return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__OBJECT:
                return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SELECT:
                return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__TEXTAREA:
                return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__LABEL:
                return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__BUTTON:
                return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.TH_TYPE__NOSCRIPT:
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
            case XHTML11Package.TH_TYPE__XHTML_FLOW_NO_TABLE_MIX:
                if (coreType) return getXhtmlFlowNoTableMix();
                return ((FeatureMap.Internal)getXhtmlFlowNoTableMix()).getWrapper();
            case XHTML11Package.TH_TYPE__H1:
                return getH1();
            case XHTML11Package.TH_TYPE__H2:
                return getH2();
            case XHTML11Package.TH_TYPE__H3:
                return getH3();
            case XHTML11Package.TH_TYPE__H4:
                return getH4();
            case XHTML11Package.TH_TYPE__H5:
                return getH5();
            case XHTML11Package.TH_TYPE__H6:
                return getH6();
            case XHTML11Package.TH_TYPE__UL:
                return getUl();
            case XHTML11Package.TH_TYPE__OL:
                return getOl();
            case XHTML11Package.TH_TYPE__DL:
                return getDl();
            case XHTML11Package.TH_TYPE__P:
                return getP();
            case XHTML11Package.TH_TYPE__DIV:
                return getDiv();
            case XHTML11Package.TH_TYPE__PRE:
                return getPre();
            case XHTML11Package.TH_TYPE__BLOCKQUOTE:
                return getBlockquote();
            case XHTML11Package.TH_TYPE__ADDRESS:
                return getAddress();
            case XHTML11Package.TH_TYPE__FORM:
                return getForm();
            case XHTML11Package.TH_TYPE__BR:
                return getBr();
            case XHTML11Package.TH_TYPE__SPAN:
                return getSpan();
            case XHTML11Package.TH_TYPE__EM:
                return getEm();
            case XHTML11Package.TH_TYPE__STRONG:
                return getStrong();
            case XHTML11Package.TH_TYPE__DFN:
                return getDfn();
            case XHTML11Package.TH_TYPE__CODE:
                return getCode();
            case XHTML11Package.TH_TYPE__SAMP:
                return getSamp();
            case XHTML11Package.TH_TYPE__KBD:
                return getKbd();
            case XHTML11Package.TH_TYPE__VAR:
                return getVar();
            case XHTML11Package.TH_TYPE__CITE:
                return getCite();
            case XHTML11Package.TH_TYPE__ABBR:
                return getAbbr();
            case XHTML11Package.TH_TYPE__ACRONYM:
                return getAcronym();
            case XHTML11Package.TH_TYPE__Q:
                return getQ();
            case XHTML11Package.TH_TYPE__TT:
                return getTt();
            case XHTML11Package.TH_TYPE__I:
                return getI();
            case XHTML11Package.TH_TYPE__B:
                return getB();
            case XHTML11Package.TH_TYPE__BIG:
                return getBig();
            case XHTML11Package.TH_TYPE__SMALL:
                return getSmall();
            case XHTML11Package.TH_TYPE__SUB:
                return getSub();
            case XHTML11Package.TH_TYPE__SUP:
                return getSup();
            case XHTML11Package.TH_TYPE__A:
                return getA();
            case XHTML11Package.TH_TYPE__IMG:
                return getImg();
            case XHTML11Package.TH_TYPE__OBJECT:
                return getObject();
            case XHTML11Package.TH_TYPE__INPUT:
                return getInput();
            case XHTML11Package.TH_TYPE__SELECT:
                return getSelect();
            case XHTML11Package.TH_TYPE__TEXTAREA:
                return getTextarea();
            case XHTML11Package.TH_TYPE__LABEL:
                return getLabel();
            case XHTML11Package.TH_TYPE__BUTTON:
                return getButton();
            case XHTML11Package.TH_TYPE__SCRIPT:
                return getScript();
            case XHTML11Package.TH_TYPE__NOSCRIPT:
                return getNoscript();
            case XHTML11Package.TH_TYPE__ABBR1:
                return getAbbr1();
            case XHTML11Package.TH_TYPE__ALIGN:
                return getAlign();
            case XHTML11Package.TH_TYPE__AXIS:
                return getAxis();
            case XHTML11Package.TH_TYPE__CLASS:
                return getClass_();
            case XHTML11Package.TH_TYPE__COLSPAN:
                return getColspan();
            case XHTML11Package.TH_TYPE__HEADERS:
                return getHeaders();
            case XHTML11Package.TH_TYPE__ID:
                return getId();
            case XHTML11Package.TH_TYPE__LANG:
                return getLang();
            case XHTML11Package.TH_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.TH_TYPE__ONCLICK:
                return getOnclick();
            case XHTML11Package.TH_TYPE__ONDBLCLICK:
                return getOndblclick();
            case XHTML11Package.TH_TYPE__ONKEYDOWN:
                return getOnkeydown();
            case XHTML11Package.TH_TYPE__ONKEYPRESS:
                return getOnkeypress();
            case XHTML11Package.TH_TYPE__ONKEYUP:
                return getOnkeyup();
            case XHTML11Package.TH_TYPE__ONMOUSEDOWN:
                return getOnmousedown();
            case XHTML11Package.TH_TYPE__ONMOUSEMOVE:
                return getOnmousemove();
            case XHTML11Package.TH_TYPE__ONMOUSEOUT:
                return getOnmouseout();
            case XHTML11Package.TH_TYPE__ONMOUSEOVER:
                return getOnmouseover();
            case XHTML11Package.TH_TYPE__ONMOUSEUP:
                return getOnmouseup();
            case XHTML11Package.TH_TYPE__ROWSPAN:
                return getRowspan();
            case XHTML11Package.TH_TYPE__SCOPE:
                return getScope();
            case XHTML11Package.TH_TYPE__SPACE:
                return getSpace();
            case XHTML11Package.TH_TYPE__STYLE:
                return getStyle();
            case XHTML11Package.TH_TYPE__TITLE:
                return getTitle();
            case XHTML11Package.TH_TYPE__VALIGN:
                return getValign();
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
            case XHTML11Package.TH_TYPE__XHTML_FLOW_NO_TABLE_MIX:
                ((FeatureMap.Internal)getXhtmlFlowNoTableMix()).set(newValue);
                return;
            case XHTML11Package.TH_TYPE__H1:
                getH1().clear();
                getH1().addAll((Collection<? extends H1Type>)newValue);
                return;
            case XHTML11Package.TH_TYPE__H2:
                getH2().clear();
                getH2().addAll((Collection<? extends H2Type>)newValue);
                return;
            case XHTML11Package.TH_TYPE__H3:
                getH3().clear();
                getH3().addAll((Collection<? extends H3Type>)newValue);
                return;
            case XHTML11Package.TH_TYPE__H4:
                getH4().clear();
                getH4().addAll((Collection<? extends H4Type>)newValue);
                return;
            case XHTML11Package.TH_TYPE__H5:
                getH5().clear();
                getH5().addAll((Collection<? extends H5Type>)newValue);
                return;
            case XHTML11Package.TH_TYPE__H6:
                getH6().clear();
                getH6().addAll((Collection<? extends H6Type>)newValue);
                return;
            case XHTML11Package.TH_TYPE__UL:
                getUl().clear();
                getUl().addAll((Collection<? extends UlType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__OL:
                getOl().clear();
                getOl().addAll((Collection<? extends OlType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__DL:
                getDl().clear();
                getDl().addAll((Collection<? extends DlType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__P:
                getP().clear();
                getP().addAll((Collection<? extends PType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__DIV:
                getDiv().clear();
                getDiv().addAll((Collection<? extends DivType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__PRE:
                getPre().clear();
                getPre().addAll((Collection<? extends PreType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__ADDRESS:
                getAddress().clear();
                getAddress().addAll((Collection<? extends AddressType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__FORM:
                getForm().clear();
                getForm().addAll((Collection<? extends FormType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__BR:
                getBr().clear();
                getBr().addAll((Collection<? extends BrType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SPAN:
                getSpan().clear();
                getSpan().addAll((Collection<? extends SpanType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__EM:
                getEm().clear();
                getEm().addAll((Collection<? extends EmType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__STRONG:
                getStrong().clear();
                getStrong().addAll((Collection<? extends StrongType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__DFN:
                getDfn().clear();
                getDfn().addAll((Collection<? extends DfnType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__CODE:
                getCode().clear();
                getCode().addAll((Collection<? extends CodeType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SAMP:
                getSamp().clear();
                getSamp().addAll((Collection<? extends SampType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__KBD:
                getKbd().clear();
                getKbd().addAll((Collection<? extends KbdType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__VAR:
                getVar().clear();
                getVar().addAll((Collection<? extends VarType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__CITE:
                getCite().clear();
                getCite().addAll((Collection<? extends CiteType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__ABBR:
                getAbbr().clear();
                getAbbr().addAll((Collection<? extends AbbrType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__ACRONYM:
                getAcronym().clear();
                getAcronym().addAll((Collection<? extends AcronymType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__Q:
                getQ().clear();
                getQ().addAll((Collection<? extends QType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__TT:
                getTt().clear();
                getTt().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__I:
                getI().clear();
                getI().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__B:
                getB().clear();
                getB().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__BIG:
                getBig().clear();
                getBig().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SMALL:
                getSmall().clear();
                getSmall().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SUB:
                getSub().clear();
                getSub().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SUP:
                getSup().clear();
                getSup().addAll((Collection<? extends InlPresType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__A:
                getA().clear();
                getA().addAll((Collection<? extends AType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__IMG:
                getImg().clear();
                getImg().addAll((Collection<? extends ImgType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__OBJECT:
                getObject().clear();
                getObject().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends InputType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SELECT:
                getSelect().clear();
                getSelect().addAll((Collection<? extends SelectType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__TEXTAREA:
                getTextarea().clear();
                getTextarea().addAll((Collection<? extends TextareaType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__BUTTON:
                getButton().clear();
                getButton().addAll((Collection<? extends ButtonType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__NOSCRIPT:
                getNoscript().clear();
                getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
                return;
            case XHTML11Package.TH_TYPE__ABBR1:
                setAbbr1((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ALIGN:
                setAlign((AlignType)newValue);
                return;
            case XHTML11Package.TH_TYPE__AXIS:
                setAxis((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__CLASS:
                setClass((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__COLSPAN:
                setColspan((BigInteger)newValue);
                return;
            case XHTML11Package.TH_TYPE__HEADERS:
                setHeaders((List<String>)newValue);
                return;
            case XHTML11Package.TH_TYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONCLICK:
                setOnclick((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONDBLCLICK:
                setOndblclick((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONKEYDOWN:
                setOnkeydown((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONKEYPRESS:
                setOnkeypress((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONKEYUP:
                setOnkeyup((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEDOWN:
                setOnmousedown((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEMOVE:
                setOnmousemove((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEOUT:
                setOnmouseout((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEOVER:
                setOnmouseover((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEUP:
                setOnmouseup((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__ROWSPAN:
                setRowspan((BigInteger)newValue);
                return;
            case XHTML11Package.TH_TYPE__SCOPE:
                setScope((ScopeType)newValue);
                return;
            case XHTML11Package.TH_TYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
            case XHTML11Package.TH_TYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case XHTML11Package.TH_TYPE__VALIGN:
                setValign((ValignType)newValue);
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
            case XHTML11Package.TH_TYPE__XHTML_FLOW_NO_TABLE_MIX:
                getXhtmlFlowNoTableMix().clear();
                return;
            case XHTML11Package.TH_TYPE__H1:
                getH1().clear();
                return;
            case XHTML11Package.TH_TYPE__H2:
                getH2().clear();
                return;
            case XHTML11Package.TH_TYPE__H3:
                getH3().clear();
                return;
            case XHTML11Package.TH_TYPE__H4:
                getH4().clear();
                return;
            case XHTML11Package.TH_TYPE__H5:
                getH5().clear();
                return;
            case XHTML11Package.TH_TYPE__H6:
                getH6().clear();
                return;
            case XHTML11Package.TH_TYPE__UL:
                getUl().clear();
                return;
            case XHTML11Package.TH_TYPE__OL:
                getOl().clear();
                return;
            case XHTML11Package.TH_TYPE__DL:
                getDl().clear();
                return;
            case XHTML11Package.TH_TYPE__P:
                getP().clear();
                return;
            case XHTML11Package.TH_TYPE__DIV:
                getDiv().clear();
                return;
            case XHTML11Package.TH_TYPE__PRE:
                getPre().clear();
                return;
            case XHTML11Package.TH_TYPE__BLOCKQUOTE:
                getBlockquote().clear();
                return;
            case XHTML11Package.TH_TYPE__ADDRESS:
                getAddress().clear();
                return;
            case XHTML11Package.TH_TYPE__FORM:
                getForm().clear();
                return;
            case XHTML11Package.TH_TYPE__BR:
                getBr().clear();
                return;
            case XHTML11Package.TH_TYPE__SPAN:
                getSpan().clear();
                return;
            case XHTML11Package.TH_TYPE__EM:
                getEm().clear();
                return;
            case XHTML11Package.TH_TYPE__STRONG:
                getStrong().clear();
                return;
            case XHTML11Package.TH_TYPE__DFN:
                getDfn().clear();
                return;
            case XHTML11Package.TH_TYPE__CODE:
                getCode().clear();
                return;
            case XHTML11Package.TH_TYPE__SAMP:
                getSamp().clear();
                return;
            case XHTML11Package.TH_TYPE__KBD:
                getKbd().clear();
                return;
            case XHTML11Package.TH_TYPE__VAR:
                getVar().clear();
                return;
            case XHTML11Package.TH_TYPE__CITE:
                getCite().clear();
                return;
            case XHTML11Package.TH_TYPE__ABBR:
                getAbbr().clear();
                return;
            case XHTML11Package.TH_TYPE__ACRONYM:
                getAcronym().clear();
                return;
            case XHTML11Package.TH_TYPE__Q:
                getQ().clear();
                return;
            case XHTML11Package.TH_TYPE__TT:
                getTt().clear();
                return;
            case XHTML11Package.TH_TYPE__I:
                getI().clear();
                return;
            case XHTML11Package.TH_TYPE__B:
                getB().clear();
                return;
            case XHTML11Package.TH_TYPE__BIG:
                getBig().clear();
                return;
            case XHTML11Package.TH_TYPE__SMALL:
                getSmall().clear();
                return;
            case XHTML11Package.TH_TYPE__SUB:
                getSub().clear();
                return;
            case XHTML11Package.TH_TYPE__SUP:
                getSup().clear();
                return;
            case XHTML11Package.TH_TYPE__A:
                getA().clear();
                return;
            case XHTML11Package.TH_TYPE__IMG:
                getImg().clear();
                return;
            case XHTML11Package.TH_TYPE__OBJECT:
                getObject().clear();
                return;
            case XHTML11Package.TH_TYPE__INPUT:
                getInput().clear();
                return;
            case XHTML11Package.TH_TYPE__SELECT:
                getSelect().clear();
                return;
            case XHTML11Package.TH_TYPE__TEXTAREA:
                getTextarea().clear();
                return;
            case XHTML11Package.TH_TYPE__LABEL:
                getLabel().clear();
                return;
            case XHTML11Package.TH_TYPE__BUTTON:
                getButton().clear();
                return;
            case XHTML11Package.TH_TYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.TH_TYPE__NOSCRIPT:
                getNoscript().clear();
                return;
            case XHTML11Package.TH_TYPE__ABBR1:
                setAbbr1(ABBR1_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ALIGN:
                unsetAlign();
                return;
            case XHTML11Package.TH_TYPE__AXIS:
                setAxis(AXIS_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__CLASS:
                setClass(CLASS_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__COLSPAN:
                unsetColspan();
                return;
            case XHTML11Package.TH_TYPE__HEADERS:
                setHeaders(HEADERS_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONCLICK:
                setOnclick(ONCLICK_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONDBLCLICK:
                setOndblclick(ONDBLCLICK_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONKEYDOWN:
                setOnkeydown(ONKEYDOWN_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONKEYPRESS:
                setOnkeypress(ONKEYPRESS_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONKEYUP:
                setOnkeyup(ONKEYUP_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEDOWN:
                setOnmousedown(ONMOUSEDOWN_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEMOVE:
                setOnmousemove(ONMOUSEMOVE_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEOUT:
                setOnmouseout(ONMOUSEOUT_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEOVER:
                setOnmouseover(ONMOUSEOVER_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ONMOUSEUP:
                setOnmouseup(ONMOUSEUP_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__ROWSPAN:
                unsetRowspan();
                return;
            case XHTML11Package.TH_TYPE__SCOPE:
                unsetScope();
                return;
            case XHTML11Package.TH_TYPE__SPACE:
                unsetSpace();
                return;
            case XHTML11Package.TH_TYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case XHTML11Package.TH_TYPE__VALIGN:
                unsetValign();
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
            case XHTML11Package.TH_TYPE__XHTML_FLOW_NO_TABLE_MIX:
                return !getXhtmlFlowNoTableMix().isEmpty();
            case XHTML11Package.TH_TYPE__H1:
                return !getH1().isEmpty();
            case XHTML11Package.TH_TYPE__H2:
                return !getH2().isEmpty();
            case XHTML11Package.TH_TYPE__H3:
                return !getH3().isEmpty();
            case XHTML11Package.TH_TYPE__H4:
                return !getH4().isEmpty();
            case XHTML11Package.TH_TYPE__H5:
                return !getH5().isEmpty();
            case XHTML11Package.TH_TYPE__H6:
                return !getH6().isEmpty();
            case XHTML11Package.TH_TYPE__UL:
                return !getUl().isEmpty();
            case XHTML11Package.TH_TYPE__OL:
                return !getOl().isEmpty();
            case XHTML11Package.TH_TYPE__DL:
                return !getDl().isEmpty();
            case XHTML11Package.TH_TYPE__P:
                return !getP().isEmpty();
            case XHTML11Package.TH_TYPE__DIV:
                return !getDiv().isEmpty();
            case XHTML11Package.TH_TYPE__PRE:
                return !getPre().isEmpty();
            case XHTML11Package.TH_TYPE__BLOCKQUOTE:
                return !getBlockquote().isEmpty();
            case XHTML11Package.TH_TYPE__ADDRESS:
                return !getAddress().isEmpty();
            case XHTML11Package.TH_TYPE__FORM:
                return !getForm().isEmpty();
            case XHTML11Package.TH_TYPE__BR:
                return !getBr().isEmpty();
            case XHTML11Package.TH_TYPE__SPAN:
                return !getSpan().isEmpty();
            case XHTML11Package.TH_TYPE__EM:
                return !getEm().isEmpty();
            case XHTML11Package.TH_TYPE__STRONG:
                return !getStrong().isEmpty();
            case XHTML11Package.TH_TYPE__DFN:
                return !getDfn().isEmpty();
            case XHTML11Package.TH_TYPE__CODE:
                return !getCode().isEmpty();
            case XHTML11Package.TH_TYPE__SAMP:
                return !getSamp().isEmpty();
            case XHTML11Package.TH_TYPE__KBD:
                return !getKbd().isEmpty();
            case XHTML11Package.TH_TYPE__VAR:
                return !getVar().isEmpty();
            case XHTML11Package.TH_TYPE__CITE:
                return !getCite().isEmpty();
            case XHTML11Package.TH_TYPE__ABBR:
                return !getAbbr().isEmpty();
            case XHTML11Package.TH_TYPE__ACRONYM:
                return !getAcronym().isEmpty();
            case XHTML11Package.TH_TYPE__Q:
                return !getQ().isEmpty();
            case XHTML11Package.TH_TYPE__TT:
                return !getTt().isEmpty();
            case XHTML11Package.TH_TYPE__I:
                return !getI().isEmpty();
            case XHTML11Package.TH_TYPE__B:
                return !getB().isEmpty();
            case XHTML11Package.TH_TYPE__BIG:
                return !getBig().isEmpty();
            case XHTML11Package.TH_TYPE__SMALL:
                return !getSmall().isEmpty();
            case XHTML11Package.TH_TYPE__SUB:
                return !getSub().isEmpty();
            case XHTML11Package.TH_TYPE__SUP:
                return !getSup().isEmpty();
            case XHTML11Package.TH_TYPE__A:
                return !getA().isEmpty();
            case XHTML11Package.TH_TYPE__IMG:
                return !getImg().isEmpty();
            case XHTML11Package.TH_TYPE__OBJECT:
                return !getObject().isEmpty();
            case XHTML11Package.TH_TYPE__INPUT:
                return !getInput().isEmpty();
            case XHTML11Package.TH_TYPE__SELECT:
                return !getSelect().isEmpty();
            case XHTML11Package.TH_TYPE__TEXTAREA:
                return !getTextarea().isEmpty();
            case XHTML11Package.TH_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XHTML11Package.TH_TYPE__BUTTON:
                return !getButton().isEmpty();
            case XHTML11Package.TH_TYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.TH_TYPE__NOSCRIPT:
                return !getNoscript().isEmpty();
            case XHTML11Package.TH_TYPE__ABBR1:
                return ABBR1_EDEFAULT == null ? abbr1 != null : !ABBR1_EDEFAULT.equals(abbr1);
            case XHTML11Package.TH_TYPE__ALIGN:
                return isSetAlign();
            case XHTML11Package.TH_TYPE__AXIS:
                return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
            case XHTML11Package.TH_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
            case XHTML11Package.TH_TYPE__COLSPAN:
                return isSetColspan();
            case XHTML11Package.TH_TYPE__HEADERS:
                return HEADERS_EDEFAULT == null ? headers != null : !HEADERS_EDEFAULT.equals(headers);
            case XHTML11Package.TH_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.TH_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.TH_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.TH_TYPE__ONCLICK:
                return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
            case XHTML11Package.TH_TYPE__ONDBLCLICK:
                return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
            case XHTML11Package.TH_TYPE__ONKEYDOWN:
                return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
            case XHTML11Package.TH_TYPE__ONKEYPRESS:
                return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
            case XHTML11Package.TH_TYPE__ONKEYUP:
                return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
            case XHTML11Package.TH_TYPE__ONMOUSEDOWN:
                return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
            case XHTML11Package.TH_TYPE__ONMOUSEMOVE:
                return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
            case XHTML11Package.TH_TYPE__ONMOUSEOUT:
                return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
            case XHTML11Package.TH_TYPE__ONMOUSEOVER:
                return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
            case XHTML11Package.TH_TYPE__ONMOUSEUP:
                return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
            case XHTML11Package.TH_TYPE__ROWSPAN:
                return isSetRowspan();
            case XHTML11Package.TH_TYPE__SCOPE:
                return isSetScope();
            case XHTML11Package.TH_TYPE__SPACE:
                return isSetSpace();
            case XHTML11Package.TH_TYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XHTML11Package.TH_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case XHTML11Package.TH_TYPE__VALIGN:
                return isSetValign();
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
        result.append(" (abbr1: ");
        result.append(abbr1);
        result.append(", align: ");
        if (alignESet) result.append(align); else result.append("<unset>");
        result.append(", axis: ");
        result.append(axis);
        result.append(", class: ");
        result.append(class_);
        result.append(", colspan: ");
        if (colspanESet) result.append(colspan); else result.append("<unset>");
        result.append(", headers: ");
        result.append(headers);
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
        result.append(", rowspan: ");
        if (rowspanESet) result.append(rowspan); else result.append("<unset>");
        result.append(", scope: ");
        if (scopeESet) result.append(scope); else result.append("<unset>");
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(", style: ");
        result.append(style);
        result.append(", title: ");
        result.append(title);
        result.append(", valign: ");
        if (valignESet) result.append(valign); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ThTypeImpl
