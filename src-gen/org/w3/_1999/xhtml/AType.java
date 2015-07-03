/**
 */
package org.w3._1999.xhtml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.AType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getXhtmlInlNoAnchorMix <em>Xhtml Inl No Anchor Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnblur <em>Onblur</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnfocus <em>Onfocus</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getRel <em>Rel</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getRev <em>Rev</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getAType()
 * @model extendedMetaData="name='xhtml.a.type' kind='mixed'"
 * @generated
 */
public interface AType extends EObject {
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Xhtml Inl No Anchor Mix</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xhtml Inl No Anchor Mix</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xhtml Inl No Anchor Mix</em>' attribute list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_XhtmlInlNoAnchorMix()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    FeatureMap getXhtmlInlNoAnchorMix();

    /**
     * Returns the value of the '<em><b>Br</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.BrType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Br</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Br</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Br()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<BrType> getBr();

    /**
     * Returns the value of the '<em><b>Span</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.SpanType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Span</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Span</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Span()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<SpanType> getSpan();

    /**
     * Returns the value of the '<em><b>Em</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.EmType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Em</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Em</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Em()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<EmType> getEm();

    /**
     * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.StrongType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strong</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strong</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Strong()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<StrongType> getStrong();

    /**
     * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.DfnType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dfn</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dfn</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Dfn()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<DfnType> getDfn();

    /**
     * Returns the value of the '<em><b>Code</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.CodeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Code()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<CodeType> getCode();

    /**
     * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.SampType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Samp</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Samp</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Samp()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<SampType> getSamp();

    /**
     * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.KbdType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kbd</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kbd</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Kbd()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<KbdType> getKbd();

    /**
     * Returns the value of the '<em><b>Var</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.VarType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Var()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<VarType> getVar();

    /**
     * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.CiteType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cite</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cite</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Cite()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<CiteType> getCite();

    /**
     * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.AbbrType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abbr</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbr</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Abbr()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<AbbrType> getAbbr();

    /**
     * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.AcronymType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acronym</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Acronym</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Acronym()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<AcronymType> getAcronym();

    /**
     * Returns the value of the '<em><b>Q</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.QType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Q</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Q</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Q()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<QType> getQ();

    /**
     * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tt</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tt</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Tt()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getTt();

    /**
     * Returns the value of the '<em><b>I</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>I</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>I</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_I()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getI();

    /**
     * Returns the value of the '<em><b>B</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>B</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>B</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_B()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getB();

    /**
     * Returns the value of the '<em><b>Big</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Big</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Big</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Big()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getBig();

    /**
     * Returns the value of the '<em><b>Small</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Small</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Small</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Small()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getSmall();

    /**
     * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Sub()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getSub();

    /**
     * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InlPresType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sup</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sup</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Sup()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InlPresType> getSup();

    /**
     * Returns the value of the '<em><b>Img</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.ImgType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Img</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Img</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Img()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<ImgType> getImg();

    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.ObjectType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Object()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<ObjectType> getObject();

    /**
     * Returns the value of the '<em><b>Input</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.InputType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Input()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<InputType> getInput();

    /**
     * Returns the value of the '<em><b>Select</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.SelectType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Select()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='select' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<SelectType> getSelect();

    /**
     * Returns the value of the '<em><b>Textarea</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.TextareaType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Textarea</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Textarea</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Textarea()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='textarea' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<TextareaType> getTextarea();

    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.LabelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Label()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<LabelType> getLabel();

    /**
     * Returns the value of the '<em><b>Button</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.ButtonType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Button</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Button</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Button()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='button' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<ButtonType> getButton();

    /**
     * Returns the value of the '<em><b>Script</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.ScriptType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Script()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<ScriptType> getScript();

    /**
     * Returns the value of the '<em><b>Noscript</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.NoscriptType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Noscript</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Noscript</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Noscript()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='noscript' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
     * @generated
     */
    EList<NoscriptType> getNoscript();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Accesskey()
     * @model dataType="org.w3._1999.xhtml.datatypes.Character"
     *        extendedMetaData="kind='attribute' name='accesskey'"
     * @generated
     */
    String getAccesskey();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getAccesskey <em>Accesskey</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accesskey</em>' attribute.
     * @see #getAccesskey()
     * @generated
     */
    void setAccesskey(String value);

    /**
     * Returns the value of the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Charset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Charset</em>' attribute.
     * @see #setCharset(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Charset()
     * @model dataType="org.w3._1999.xhtml.datatypes.Charset"
     *        extendedMetaData="kind='attribute' name='charset'"
     * @generated
     */
    String getCharset();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getCharset <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charset</em>' attribute.
     * @see #getCharset()
     * @generated
     */
    void setCharset(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

    /**
     * Returns the value of the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Href</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Href</em>' attribute.
     * @see #setHref(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Href()
     * @model dataType="org.w3._1999.xhtml.datatypes.URI"
     *        extendedMetaData="kind='attribute' name='href'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

    /**
     * Returns the value of the '<em><b>Hreflang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hreflang</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hreflang</em>' attribute.
     * @see #setHreflang(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Hreflang()
     * @model dataType="org.w3._1999.xhtml.datatypes.LanguageCode"
     *        extendedMetaData="kind='attribute' name='hreflang'"
     * @generated
     */
    String getHreflang();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getHreflang <em>Hreflang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hreflang</em>' attribute.
     * @see #getHreflang()
     * @generated
     */
    void setHreflang(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getLang <em>Lang</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Lang1()
     * @model dataType="org.w3._1999.xhtml.datatypes.LanguageCode"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getLang1 <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang1</em>' attribute.
     * @see #getLang1()
     * @generated
     */
    void setLang1(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onblur()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onblur'"
     * @generated
     */
    String getOnblur();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnblur <em>Onblur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onblur</em>' attribute.
     * @see #getOnblur()
     * @generated
     */
    void setOnblur(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onclick'"
     * @generated
     */
    String getOnclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnclick <em>Onclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Ondblclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='ondblclick'"
     * @generated
     */
    String getOndblclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOndblclick <em>Ondblclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onfocus()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onfocus'"
     * @generated
     */
    String getOnfocus();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnfocus <em>Onfocus</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onkeydown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeydown'"
     * @generated
     */
    String getOnkeydown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnkeydown <em>Onkeydown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onkeypress()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeypress'"
     * @generated
     */
    String getOnkeypress();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnkeypress <em>Onkeypress</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onkeyup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeyup'"
     * @generated
     */
    String getOnkeyup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnkeyup <em>Onkeyup</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onmousedown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousedown'"
     * @generated
     */
    String getOnmousedown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnmousedown <em>Onmousedown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onmousemove()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousemove'"
     * @generated
     */
    String getOnmousemove();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnmousemove <em>Onmousemove</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onmouseout()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseout'"
     * @generated
     */
    String getOnmouseout();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnmouseout <em>Onmouseout</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onmouseover()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseover'"
     * @generated
     */
    String getOnmouseover();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnmouseover <em>Onmouseover</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Onmouseup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseup'"
     * @generated
     */
    String getOnmouseup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getOnmouseup <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseup</em>' attribute.
     * @see #getOnmouseup()
     * @generated
     */
    void setOnmouseup(String value);

    /**
     * Returns the value of the '<em><b>Rel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rel</em>' attribute.
     * @see #setRel(List)
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Rel()
     * @model dataType="org.w3._1999.xhtml.datatypes.LinkTypes" many="false"
     *        extendedMetaData="kind='attribute' name='rel'"
     * @generated
     */
    List<String> getRel();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getRel <em>Rel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rel</em>' attribute.
     * @see #getRel()
     * @generated
     */
    void setRel(List<String> value);

    /**
     * Returns the value of the '<em><b>Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rev</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rev</em>' attribute.
     * @see #setRev(List)
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Rev()
     * @model dataType="org.w3._1999.xhtml.datatypes.LinkTypes" many="false"
     *        extendedMetaData="kind='attribute' name='rev'"
     * @generated
     */
    List<String> getRev();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getRev <em>Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rev</em>' attribute.
     * @see #getRev()
     * @generated
     */
    void setRev(List<String> value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Space()
     * @model default="preserve" unsettable="true"
     *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    SpaceType getSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getSpace <em>Space</em>}' attribute.
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
     * Unsets the value of the '{@link org.w3._1999.xhtml.AType#getSpace <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpace()
     * @see #getSpace()
     * @see #setSpace(SpaceType)
     * @generated
     */
    void unsetSpace();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.AType#getSpace <em>Space</em>}' attribute is set.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Style()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='style'"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getStyle <em>Style</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Tabindex()
     * @model dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='tabindex'"
     * @generated
     */
    BigInteger getTabindex();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getTabindex <em>Tabindex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tabindex</em>' attribute.
     * @see #getTabindex()
     * @generated
     */
    void setTabindex(BigInteger value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' attribute.
     * @see #setTarget(Object)
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Target()
     * @model dataType="org.w3._1999.xhtml.datatypes.FrameTarget"
     *        extendedMetaData="kind='attribute' name='target'"
     * @generated
     */
    Object getTarget();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getTarget <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' attribute.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Object value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getAType_Type()
     * @model dataType="org.w3._1999.xhtml.datatypes.ContentType"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.AType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // AType
