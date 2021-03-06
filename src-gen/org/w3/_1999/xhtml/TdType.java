/**
 */
package org.w3._1999.xhtml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Td Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.TdType#getXhtmlFlowNoTableMix <em>Xhtml Flow No Table Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getP <em>P</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.TdType#getValign <em>Valign</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getTdType()
 * @model extendedMetaData="name='xhtml.td.type' kind='mixed'"
 * @generated
 */
public interface TdType extends EObject, XMLTypeDocumentRoot {
    /**
     * Returns the value of the '<em><b>Xhtml Flow No Table Mix</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xhtml Flow No Table Mix</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xhtml Flow No Table Mix</em>' attribute list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_XhtmlFlowNoTableMix()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='XhtmlFlowNoTableMix:1'"
     * @generated
     */
    FeatureMap getXhtmlFlowNoTableMix();

    /**
     * Returns the value of the '<em><b>H1</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.H1Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H1</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H1</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_H1()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<H1Type> getH1();

    /**
     * Returns the value of the '<em><b>H2</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.H2Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H2</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H2</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_H2()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<H2Type> getH2();

    /**
     * Returns the value of the '<em><b>H3</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.H3Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H3</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H3</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_H3()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<H3Type> getH3();

    /**
     * Returns the value of the '<em><b>H4</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.H4Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H4</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H4</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_H4()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<H4Type> getH4();

    /**
     * Returns the value of the '<em><b>H5</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.H5Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H5</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H5</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_H5()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<H5Type> getH5();

    /**
     * Returns the value of the '<em><b>H6</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.H6Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>H6</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>H6</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_H6()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<H6Type> getH6();

    /**
     * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.UlType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ul</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ul</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Ul()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<UlType> getUl();

    /**
     * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.OlType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ol</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ol</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Ol()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<OlType> getOl();

    /**
     * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.DlType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dl</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dl</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Dl()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<DlType> getDl();

    /**
     * Returns the value of the '<em><b>P</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.PType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>P</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>P</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_P()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<PType> getP();

    /**
     * Returns the value of the '<em><b>Div</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.DivType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Div</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Div</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Div()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<DivType> getDiv();

    /**
     * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.PreType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pre</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Pre()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<PreType> getPre();

    /**
     * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.BlockquoteType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blockquote</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Blockquote</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Blockquote()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<BlockquoteType> getBlockquote();

    /**
     * Returns the value of the '<em><b>Address</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.AddressType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Address()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<AddressType> getAddress();

    /**
     * Returns the value of the '<em><b>Form</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.FormType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Form</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Form()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<FormType> getForm();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Br()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Span()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Em()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Strong()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Dfn()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Code()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Samp()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Kbd()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Var()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Cite()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Abbr()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Acronym()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Q()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Tt()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_I()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_B()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Big()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Small()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Sub()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Sup()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<InlPresType> getSup();

    /**
     * Returns the value of the '<em><b>A</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.AType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>A</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>A</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_A()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<AType> getA();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Img()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Object()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Input()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Select()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='select' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Textarea()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='textarea' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Label()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Button()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='button' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Script()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Noscript()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='noscript' namespace='##targetNamespace' group='#XhtmlFlowNoTableMix:1'"
     * @generated
     */
    EList<NoscriptType> getNoscript();

    /**
     * Returns the value of the '<em><b>Abbr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abbr1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbr1</em>' attribute.
     * @see #setAbbr1(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Abbr1()
     * @model dataType="org.w3._1999.xhtml.datatypes.Text"
     *        extendedMetaData="kind='attribute' name='abbr'"
     * @generated
     */
    String getAbbr1();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getAbbr1 <em>Abbr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbr1</em>' attribute.
     * @see #getAbbr1()
     * @generated
     */
    void setAbbr1(String value);

    /**
     * Returns the value of the '<em><b>Align</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.AlignType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Align</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Align</em>' attribute.
     * @see org.w3._1999.xhtml.AlignType
     * @see #isSetAlign()
     * @see #unsetAlign()
     * @see #setAlign(AlignType)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Align()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='align'"
     * @generated
     */
    AlignType getAlign();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getAlign <em>Align</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Align</em>' attribute.
     * @see org.w3._1999.xhtml.AlignType
     * @see #isSetAlign()
     * @see #unsetAlign()
     * @see #getAlign()
     * @generated
     */
    void setAlign(AlignType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.TdType#getAlign <em>Align</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAlign()
     * @see #getAlign()
     * @see #setAlign(AlignType)
     * @generated
     */
    void unsetAlign();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.TdType#getAlign <em>Align</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Align</em>' attribute is set.
     * @see #unsetAlign()
     * @see #getAlign()
     * @see #setAlign(AlignType)
     * @generated
     */
    boolean isSetAlign();

    /**
     * Returns the value of the '<em><b>Axis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Axis</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Axis</em>' attribute.
     * @see #setAxis(String)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Axis()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='axis'"
     * @generated
     */
    String getAxis();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getAxis <em>Axis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Axis</em>' attribute.
     * @see #getAxis()
     * @generated
     */
    void setAxis(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

    /**
     * Returns the value of the '<em><b>Colspan</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Colspan</em>' attribute.
     * @see #isSetColspan()
     * @see #unsetColspan()
     * @see #setColspan(BigInteger)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Colspan()
     * @model default="1" unsettable="true" dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='colspan'"
     * @generated
     */
    BigInteger getColspan();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getColspan <em>Colspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Colspan</em>' attribute.
     * @see #isSetColspan()
     * @see #unsetColspan()
     * @see #getColspan()
     * @generated
     */
    void setColspan(BigInteger value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.TdType#getColspan <em>Colspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetColspan()
     * @see #getColspan()
     * @see #setColspan(BigInteger)
     * @generated
     */
    void unsetColspan();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.TdType#getColspan <em>Colspan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Colspan</em>' attribute is set.
     * @see #unsetColspan()
     * @see #getColspan()
     * @see #setColspan(BigInteger)
     * @generated
     */
    boolean isSetColspan();

    /**
     * Returns the value of the '<em><b>Headers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Headers</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Headers</em>' attribute.
     * @see #setHeaders(List)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Headers()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
     *        extendedMetaData="kind='attribute' name='headers'"
     * @generated
     */
    List<String> getHeaders();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getHeaders <em>Headers</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Headers</em>' attribute.
     * @see #getHeaders()
     * @generated
     */
    void setHeaders(List<String> value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getId <em>Id</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getLang <em>Lang</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Lang1()
     * @model dataType="org.w3._1999.xhtml.datatypes.LanguageCode"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getLang1 <em>Lang1</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onclick'"
     * @generated
     */
    String getOnclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnclick <em>Onclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Ondblclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='ondblclick'"
     * @generated
     */
    String getOndblclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOndblclick <em>Ondblclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onkeydown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeydown'"
     * @generated
     */
    String getOnkeydown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnkeydown <em>Onkeydown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onkeypress()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeypress'"
     * @generated
     */
    String getOnkeypress();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnkeypress <em>Onkeypress</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onkeyup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeyup'"
     * @generated
     */
    String getOnkeyup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnkeyup <em>Onkeyup</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onmousedown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousedown'"
     * @generated
     */
    String getOnmousedown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnmousedown <em>Onmousedown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onmousemove()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousemove'"
     * @generated
     */
    String getOnmousemove();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnmousemove <em>Onmousemove</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onmouseout()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseout'"
     * @generated
     */
    String getOnmouseout();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnmouseout <em>Onmouseout</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onmouseover()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseover'"
     * @generated
     */
    String getOnmouseover();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnmouseover <em>Onmouseover</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Onmouseup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseup'"
     * @generated
     */
    String getOnmouseup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getOnmouseup <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseup</em>' attribute.
     * @see #getOnmouseup()
     * @generated
     */
    void setOnmouseup(String value);

    /**
     * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rowspan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rowspan</em>' attribute.
     * @see #isSetRowspan()
     * @see #unsetRowspan()
     * @see #setRowspan(BigInteger)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Rowspan()
     * @model default="1" unsettable="true" dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='rowspan'"
     * @generated
     */
    BigInteger getRowspan();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getRowspan <em>Rowspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rowspan</em>' attribute.
     * @see #isSetRowspan()
     * @see #unsetRowspan()
     * @see #getRowspan()
     * @generated
     */
    void setRowspan(BigInteger value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.TdType#getRowspan <em>Rowspan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRowspan()
     * @see #getRowspan()
     * @see #setRowspan(BigInteger)
     * @generated
     */
    void unsetRowspan();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.TdType#getRowspan <em>Rowspan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rowspan</em>' attribute is set.
     * @see #unsetRowspan()
     * @see #getRowspan()
     * @see #setRowspan(BigInteger)
     * @generated
     */
    boolean isSetRowspan();

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.ScopeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see org.w3._1999.xhtml.ScopeType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(ScopeType)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Scope()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
    ScopeType getScope();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.w3._1999.xhtml.ScopeType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope(ScopeType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.TdType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(ScopeType)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.TdType#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(ScopeType)
     * @generated
     */
    boolean isSetScope();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Space()
     * @model default="preserve" unsettable="true"
     *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    SpaceType getSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getSpace <em>Space</em>}' attribute.
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
     * Unsets the value of the '{@link org.w3._1999.xhtml.TdType#getSpace <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpace()
     * @see #getSpace()
     * @see #setSpace(SpaceType)
     * @generated
     */
    void unsetSpace();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.TdType#getSpace <em>Space</em>}' attribute is set.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Style()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='style'"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getStyle <em>Style</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Valign</b></em>' attribute.
     * The literals are from the enumeration {@link org.w3._1999.xhtml.ValignType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valign</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valign</em>' attribute.
     * @see org.w3._1999.xhtml.ValignType
     * @see #isSetValign()
     * @see #unsetValign()
     * @see #setValign(ValignType)
     * @see org.w3._1999.xhtml.XHTML11Package#getTdType_Valign()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='valign'"
     * @generated
     */
    ValignType getValign();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.TdType#getValign <em>Valign</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valign</em>' attribute.
     * @see org.w3._1999.xhtml.ValignType
     * @see #isSetValign()
     * @see #unsetValign()
     * @see #getValign()
     * @generated
     */
    void setValign(ValignType value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xhtml.TdType#getValign <em>Valign</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValign()
     * @see #getValign()
     * @see #setValign(ValignType)
     * @generated
     */
    void unsetValign();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.TdType#getValign <em>Valign</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Valign</em>' attribute is set.
     * @see #unsetValign()
     * @see #getValign()
     * @see #setValign(ValignType)
     * @generated
     */
    boolean isSetValign();

} // TdType
