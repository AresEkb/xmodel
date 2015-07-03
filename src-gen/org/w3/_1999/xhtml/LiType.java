/**
 */
package org.w3._1999.xhtml;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Li Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.LiType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getP <em>P</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getFieldset <em>Fieldset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.LiType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XHTML11Package#getLiType()
 * @model extendedMetaData="name='xhtml.li.type' kind='mixed'"
 * @generated
 */
public interface LiType extends EObject, XMLTypeDocumentRoot {
    /**
     * Returns the value of the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xhtml Flow Mix</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xhtml Flow Mix</em>' attribute list.
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_XhtmlFlowMix()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='XhtmlFlowMix:1'"
     * @generated
     */
    FeatureMap getXhtmlFlowMix();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_H1()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_H2()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_H3()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_H4()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_H5()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_H6()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Ul()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Ol()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Dl()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_P()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Div()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Pre()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Blockquote()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Address()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
     * @generated
     */
    EList<AddressType> getAddress();

    /**
     * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.HrType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hr</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hr</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Hr()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
     * @generated
     */
    EList<HrType> getHr();

    /**
     * Returns the value of the '<em><b>Table</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.TableType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Table()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
     * @generated
     */
    EList<TableType> getTable();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Form()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
     * @generated
     */
    EList<FormType> getForm();

    /**
     * Returns the value of the '<em><b>Fieldset</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xhtml.FieldsetType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fieldset</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fieldset</em>' containment reference list.
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Fieldset()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='fieldset' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
     * @generated
     */
    EList<FieldsetType> getFieldset();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Br()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Span()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Em()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Strong()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Dfn()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Code()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Samp()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Kbd()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Var()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Cite()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Abbr()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Acronym()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Q()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Tt()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_I()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_B()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Big()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Small()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Sub()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Sup()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_A()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Img()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Object()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Input()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Select()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='select' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Textarea()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='textarea' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Label()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Button()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='button' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Script()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Noscript()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='noscript' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
     * @generated
     */
    EList<NoscriptType> getNoscript();

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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getId <em>Id</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Lang()
     * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
     *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getLang <em>Lang</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Lang1()
     * @model dataType="org.w3._1999.xhtml.datatypes.LanguageCode"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang1();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getLang1 <em>Lang1</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onclick'"
     * @generated
     */
    String getOnclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnclick <em>Onclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Ondblclick()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='ondblclick'"
     * @generated
     */
    String getOndblclick();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOndblclick <em>Ondblclick</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onkeydown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeydown'"
     * @generated
     */
    String getOnkeydown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnkeydown <em>Onkeydown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onkeypress()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeypress'"
     * @generated
     */
    String getOnkeypress();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnkeypress <em>Onkeypress</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onkeyup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onkeyup'"
     * @generated
     */
    String getOnkeyup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnkeyup <em>Onkeyup</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onmousedown()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousedown'"
     * @generated
     */
    String getOnmousedown();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnmousedown <em>Onmousedown</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onmousemove()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmousemove'"
     * @generated
     */
    String getOnmousemove();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnmousemove <em>Onmousemove</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onmouseout()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseout'"
     * @generated
     */
    String getOnmouseout();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnmouseout <em>Onmouseout</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onmouseover()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseover'"
     * @generated
     */
    String getOnmouseover();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnmouseover <em>Onmouseover</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Onmouseup()
     * @model dataType="org.w3._1999.xhtml.datatypes.Script"
     *        extendedMetaData="kind='attribute' name='onmouseup'"
     * @generated
     */
    String getOnmouseup();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getOnmouseup <em>Onmouseup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onmouseup</em>' attribute.
     * @see #getOnmouseup()
     * @generated
     */
    void setOnmouseup(String value);

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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Space()
     * @model default="preserve" unsettable="true"
     *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
     * @generated
     */
    SpaceType getSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getSpace <em>Space</em>}' attribute.
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
     * Unsets the value of the '{@link org.w3._1999.xhtml.LiType#getSpace <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpace()
     * @see #getSpace()
     * @see #setSpace(SpaceType)
     * @generated
     */
    void unsetSpace();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xhtml.LiType#getSpace <em>Space</em>}' attribute is set.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Style()
     * @model dataType="org.w3._1999.xhtml.datatypes.CDATA"
     *        extendedMetaData="kind='attribute' name='style'"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getStyle <em>Style</em>}' attribute.
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
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getTitle <em>Title</em>}' attribute.
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
     * @see #setValue(BigInteger)
     * @see org.w3._1999.xhtml.XHTML11Package#getLiType_Value()
     * @model dataType="org.w3._1999.xhtml.datatypes.Number"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    BigInteger getValue();

    /**
     * Sets the value of the '{@link org.w3._1999.xhtml.LiType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(BigInteger value);

} // LiType
