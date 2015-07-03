/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getAnalyzeString <em>Analyze String</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getApplyImports <em>Apply Imports</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getApplyTemplates <em>Apply Templates</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getAttributeSet <em>Attribute Set</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getCallTemplate <em>Call Template</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getCharacterMap <em>Character Map</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getChoose <em>Choose</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getComment <em>Comment</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getCopyOf <em>Copy Of</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getDecimalFormat <em>Decimal Format</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getDocument <em>Document</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getForEachGroup <em>For Each Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getFunction <em>Function</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getIf <em>If</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getImportSchema <em>Import Schema</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getInclude <em>Include</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getKey <em>Key</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getMatchingSubstring <em>Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getMessage <em>Message</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getNamespaceAlias <em>Namespace Alias</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getNextMatch <em>Next Match</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getNonMatchingSubstring <em>Non Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getNumber <em>Number</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getOutput <em>Output</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getOutputCharacter <em>Output Character</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getPerformSort <em>Perform Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getPreserveSpace <em>Preserve Space</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getProcessingInstruction <em>Processing Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getResultDocument <em>Result Document</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getStripSpace <em>Strip Space</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getStylesheet <em>Stylesheet</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getWhen <em>When</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DocumentRoot#getWithParam <em>With Param</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Analyze String</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analyze String</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analyze String</em>' containment reference.
     * @see #setAnalyzeString(AnalyzeStringType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_AnalyzeString()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='analyze-string' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    AnalyzeStringType getAnalyzeString();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getAnalyzeString <em>Analyze String</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analyze String</em>' containment reference.
     * @see #getAnalyzeString()
     * @generated
     */
    void setAnalyzeString(AnalyzeStringType value);

    /**
     * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instruction</em>' containment reference.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Instruction()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='instruction' namespace='##targetNamespace'"
     * @generated
     */
    VersionedElementType getInstruction();

    /**
     * Returns the value of the '<em><b>Apply Imports</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Apply Imports</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Apply Imports</em>' containment reference.
     * @see #setApplyImports(ApplyImportsType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ApplyImports()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='apply-imports' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ApplyImportsType getApplyImports();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getApplyImports <em>Apply Imports</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Apply Imports</em>' containment reference.
     * @see #getApplyImports()
     * @generated
     */
    void setApplyImports(ApplyImportsType value);

    /**
     * Returns the value of the '<em><b>Apply Templates</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Apply Templates</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Apply Templates</em>' containment reference.
     * @see #setApplyTemplates(ApplyTemplatesType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ApplyTemplates()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='apply-templates' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ApplyTemplatesType getApplyTemplates();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getApplyTemplates <em>Apply Templates</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Apply Templates</em>' containment reference.
     * @see #getApplyTemplates()
     * @generated
     */
    void setApplyTemplates(ApplyTemplatesType value);

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' containment reference.
     * @see #setAttribute(AttributeType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Attribute()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    AttributeType getAttribute();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getAttribute <em>Attribute</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' containment reference.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(AttributeType value);

    /**
     * Returns the value of the '<em><b>Attribute Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Set</em>' containment reference.
     * @see #setAttributeSet(AttributeSetType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_AttributeSet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='attribute-set' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    AttributeSetType getAttributeSet();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getAttributeSet <em>Attribute Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute Set</em>' containment reference.
     * @see #getAttributeSet()
     * @generated
     */
    void setAttributeSet(AttributeSetType value);

    /**
     * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declaration</em>' containment reference.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Declaration()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='declaration' namespace='##targetNamespace'"
     * @generated
     */
    GenericElementType getDeclaration();

    /**
     * Returns the value of the '<em><b>Call Template</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Template</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Template</em>' containment reference.
     * @see #setCallTemplate(CallTemplateType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_CallTemplate()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='call-template' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    CallTemplateType getCallTemplate();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getCallTemplate <em>Call Template</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call Template</em>' containment reference.
     * @see #getCallTemplate()
     * @generated
     */
    void setCallTemplate(CallTemplateType value);

    /**
     * Returns the value of the '<em><b>Character Map</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Map</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Map</em>' containment reference.
     * @see #setCharacterMap(CharacterMapType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_CharacterMap()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='character-map' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    CharacterMapType getCharacterMap();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getCharacterMap <em>Character Map</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Map</em>' containment reference.
     * @see #getCharacterMap()
     * @generated
     */
    void setCharacterMap(CharacterMapType value);

    /**
     * Returns the value of the '<em><b>Choose</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choose</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choose</em>' containment reference.
     * @see #setChoose(ChooseType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Choose()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choose' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ChooseType getChoose();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getChoose <em>Choose</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choose</em>' containment reference.
     * @see #getChoose()
     * @generated
     */
    void setChoose(ChooseType value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' containment reference.
     * @see #setComment(CommentType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Comment()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    CommentType getComment();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getComment <em>Comment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' containment reference.
     * @see #getComment()
     * @generated
     */
    void setComment(CommentType value);

    /**
     * Returns the value of the '<em><b>Copy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copy</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copy</em>' containment reference.
     * @see #setCopy(CopyType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Copy()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='copy' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    CopyType getCopy();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getCopy <em>Copy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copy</em>' containment reference.
     * @see #getCopy()
     * @generated
     */
    void setCopy(CopyType value);

    /**
     * Returns the value of the '<em><b>Copy Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copy Of</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copy Of</em>' containment reference.
     * @see #setCopyOf(CopyOfType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_CopyOf()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='copy-of' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    CopyOfType getCopyOf();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getCopyOf <em>Copy Of</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copy Of</em>' containment reference.
     * @see #getCopyOf()
     * @generated
     */
    void setCopyOf(CopyOfType value);

    /**
     * Returns the value of the '<em><b>Decimal Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decimal Format</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Decimal Format</em>' containment reference.
     * @see #setDecimalFormat(DecimalFormatType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_DecimalFormat()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='decimal-format' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    DecimalFormatType getDecimalFormat();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getDecimalFormat <em>Decimal Format</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decimal Format</em>' containment reference.
     * @see #getDecimalFormat()
     * @generated
     */
    void setDecimalFormat(DecimalFormatType value);

    /**
     * Returns the value of the '<em><b>Document</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Document</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Document</em>' containment reference.
     * @see #setDocument(DocumentType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Document()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    DocumentType getDocument();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getDocument <em>Document</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Document</em>' containment reference.
     * @see #getDocument()
     * @generated
     */
    void setDocument(DocumentType value);

    /**
     * Returns the value of the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' containment reference.
     * @see #setElement(ElementType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Element()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ElementType getElement();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getElement <em>Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' containment reference.
     * @see #getElement()
     * @generated
     */
    void setElement(ElementType value);

    /**
     * Returns the value of the '<em><b>Fallback</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fallback</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fallback</em>' containment reference.
     * @see #setFallback(SequenceConstructor)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Fallback()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='fallback' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    SequenceConstructor getFallback();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getFallback <em>Fallback</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fallback</em>' containment reference.
     * @see #getFallback()
     * @generated
     */
    void setFallback(SequenceConstructor value);

    /**
     * Returns the value of the '<em><b>For Each</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>For Each</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>For Each</em>' containment reference.
     * @see #setForEach(ForEachType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ForEach()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='for-each' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ForEachType getForEach();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getForEach <em>For Each</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>For Each</em>' containment reference.
     * @see #getForEach()
     * @generated
     */
    void setForEach(ForEachType value);

    /**
     * Returns the value of the '<em><b>For Each Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>For Each Group</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>For Each Group</em>' containment reference.
     * @see #setForEachGroup(ForEachGroupType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ForEachGroup()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='for-each-group' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ForEachGroupType getForEachGroup();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getForEachGroup <em>For Each Group</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>For Each Group</em>' containment reference.
     * @see #getForEachGroup()
     * @generated
     */
    void setForEachGroup(ForEachGroupType value);

    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference.
     * @see #setFunction(FunctionType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Function()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    FunctionType getFunction();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getFunction <em>Function</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' containment reference.
     * @see #getFunction()
     * @generated
     */
    void setFunction(FunctionType value);

    /**
     * Returns the value of the '<em><b>If</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>If</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>If</em>' containment reference.
     * @see #setIf(IfType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_If()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='if' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    IfType getIf();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getIf <em>If</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>If</em>' containment reference.
     * @see #getIf()
     * @generated
     */
    void setIf(IfType value);

    /**
     * Returns the value of the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Import</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Import</em>' containment reference.
     * @see #setImport(ImportType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Import()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
     * @generated
     */
    ImportType getImport();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getImport <em>Import</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import</em>' containment reference.
     * @see #getImport()
     * @generated
     */
    void setImport(ImportType value);

    /**
     * Returns the value of the '<em><b>Import Schema</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Import Schema</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Import Schema</em>' containment reference.
     * @see #setImportSchema(ImportSchemaType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ImportSchema()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import-schema' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    ImportSchemaType getImportSchema();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getImportSchema <em>Import Schema</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import Schema</em>' containment reference.
     * @see #getImportSchema()
     * @generated
     */
    void setImportSchema(ImportSchemaType value);

    /**
     * Returns the value of the '<em><b>Include</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Include</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Include</em>' containment reference.
     * @see #setInclude(IncludeType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Include()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    IncludeType getInclude();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getInclude <em>Include</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Include</em>' containment reference.
     * @see #getInclude()
     * @generated
     */
    void setInclude(IncludeType value);

    /**
     * Returns the value of the '<em><b>Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' containment reference.
     * @see #setKey(KeyType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Key()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    KeyType getKey();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getKey <em>Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' containment reference.
     * @see #getKey()
     * @generated
     */
    void setKey(KeyType value);

    /**
     * Returns the value of the '<em><b>Literal Result Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Literal Result Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Literal Result Element</em>' containment reference.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_LiteralResultElement()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='literal-result-element' namespace='##targetNamespace'"
     * @generated
     */
    EObject getLiteralResultElement();

    /**
     * Returns the value of the '<em><b>Matching Substring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matching Substring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matching Substring</em>' containment reference.
     * @see #setMatchingSubstring(SequenceConstructor)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_MatchingSubstring()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='matching-substring' namespace='##targetNamespace'"
     * @generated
     */
    SequenceConstructor getMatchingSubstring();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getMatchingSubstring <em>Matching Substring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matching Substring</em>' containment reference.
     * @see #getMatchingSubstring()
     * @generated
     */
    void setMatchingSubstring(SequenceConstructor value);

    /**
     * Returns the value of the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' containment reference.
     * @see #setMessage(MessageType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Message()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    MessageType getMessage();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getMessage <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' containment reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(MessageType value);

    /**
     * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' containment reference.
     * @see #setNamespace(NamespaceType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Namespace()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='namespace' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    NamespaceType getNamespace();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getNamespace <em>Namespace</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' containment reference.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(NamespaceType value);

    /**
     * Returns the value of the '<em><b>Namespace Alias</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace Alias</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace Alias</em>' containment reference.
     * @see #setNamespaceAlias(NamespaceAliasType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_NamespaceAlias()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='namespace-alias' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    NamespaceAliasType getNamespaceAlias();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getNamespaceAlias <em>Namespace Alias</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace Alias</em>' containment reference.
     * @see #getNamespaceAlias()
     * @generated
     */
    void setNamespaceAlias(NamespaceAliasType value);

    /**
     * Returns the value of the '<em><b>Next Match</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next Match</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next Match</em>' containment reference.
     * @see #setNextMatch(NextMatchType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_NextMatch()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='next-match' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    NextMatchType getNextMatch();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getNextMatch <em>Next Match</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next Match</em>' containment reference.
     * @see #getNextMatch()
     * @generated
     */
    void setNextMatch(NextMatchType value);

    /**
     * Returns the value of the '<em><b>Non Matching Substring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Non Matching Substring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Non Matching Substring</em>' containment reference.
     * @see #setNonMatchingSubstring(SequenceConstructor)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_NonMatchingSubstring()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='non-matching-substring' namespace='##targetNamespace'"
     * @generated
     */
    SequenceConstructor getNonMatchingSubstring();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getNonMatchingSubstring <em>Non Matching Substring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Non Matching Substring</em>' containment reference.
     * @see #getNonMatchingSubstring()
     * @generated
     */
    void setNonMatchingSubstring(SequenceConstructor value);

    /**
     * Returns the value of the '<em><b>Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number</em>' containment reference.
     * @see #setNumber(NumberType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Number()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    NumberType getNumber();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getNumber <em>Number</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' containment reference.
     * @see #getNumber()
     * @generated
     */
    void setNumber(NumberType value);

    /**
     * Returns the value of the '<em><b>Otherwise</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Otherwise</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Otherwise</em>' containment reference.
     * @see #setOtherwise(SequenceConstructor)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Otherwise()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace'"
     * @generated
     */
    SequenceConstructor getOtherwise();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getOtherwise <em>Otherwise</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Otherwise</em>' containment reference.
     * @see #getOtherwise()
     * @generated
     */
    void setOtherwise(SequenceConstructor value);

    /**
     * Returns the value of the '<em><b>Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' containment reference.
     * @see #setOutput(OutputType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Output()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    OutputType getOutput();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getOutput <em>Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' containment reference.
     * @see #getOutput()
     * @generated
     */
    void setOutput(OutputType value);

    /**
     * Returns the value of the '<em><b>Output Character</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Character</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Character</em>' containment reference.
     * @see #setOutputCharacter(OutputCharacterType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_OutputCharacter()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='output-character' namespace='##targetNamespace'"
     * @generated
     */
    OutputCharacterType getOutputCharacter();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getOutputCharacter <em>Output Character</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Character</em>' containment reference.
     * @see #getOutputCharacter()
     * @generated
     */
    void setOutputCharacter(OutputCharacterType value);

    /**
     * Returns the value of the '<em><b>Param</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Param</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Param</em>' containment reference.
     * @see #setParam(ParamType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Param()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
     * @generated
     */
    ParamType getParam();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getParam <em>Param</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Param</em>' containment reference.
     * @see #getParam()
     * @generated
     */
    void setParam(ParamType value);

    /**
     * Returns the value of the '<em><b>Perform Sort</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Perform Sort</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Perform Sort</em>' containment reference.
     * @see #setPerformSort(PerformSortType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_PerformSort()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='perform-sort' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    PerformSortType getPerformSort();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getPerformSort <em>Perform Sort</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Perform Sort</em>' containment reference.
     * @see #getPerformSort()
     * @generated
     */
    void setPerformSort(PerformSortType value);

    /**
     * Returns the value of the '<em><b>Preserve Space</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preserve Space</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preserve Space</em>' containment reference.
     * @see #setPreserveSpace(PreserveSpaceType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_PreserveSpace()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='preserve-space' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    PreserveSpaceType getPreserveSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getPreserveSpace <em>Preserve Space</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preserve Space</em>' containment reference.
     * @see #getPreserveSpace()
     * @generated
     */
    void setPreserveSpace(PreserveSpaceType value);

    /**
     * Returns the value of the '<em><b>Processing Instruction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processing Instruction</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processing Instruction</em>' containment reference.
     * @see #setProcessingInstruction(ProcessingInstructionType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ProcessingInstruction()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='processing-instruction' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ProcessingInstructionType getProcessingInstruction();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getProcessingInstruction <em>Processing Instruction</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Processing Instruction</em>' containment reference.
     * @see #getProcessingInstruction()
     * @generated
     */
    void setProcessingInstruction(ProcessingInstructionType value);

    /**
     * Returns the value of the '<em><b>Result Document</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Document</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result Document</em>' containment reference.
     * @see #setResultDocument(ResultDocumentType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ResultDocument()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='result-document' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ResultDocumentType getResultDocument();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getResultDocument <em>Result Document</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result Document</em>' containment reference.
     * @see #getResultDocument()
     * @generated
     */
    void setResultDocument(ResultDocumentType value);

    /**
     * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence</em>' containment reference.
     * @see #setSequence(SequenceType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Sequence()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    SequenceType getSequence();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getSequence <em>Sequence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence</em>' containment reference.
     * @see #getSequence()
     * @generated
     */
    void setSequence(SequenceType value);

    /**
     * Returns the value of the '<em><b>Sort</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sort</em>' containment reference.
     * @see #setSort(SortType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Sort()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
     * @generated
     */
    SortType getSort();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getSort <em>Sort</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sort</em>' containment reference.
     * @see #getSort()
     * @generated
     */
    void setSort(SortType value);

    /**
     * Returns the value of the '<em><b>Strip Space</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strip Space</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strip Space</em>' containment reference.
     * @see #setStripSpace(StripSpaceType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_StripSpace()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='strip-space' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    StripSpaceType getStripSpace();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getStripSpace <em>Strip Space</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strip Space</em>' containment reference.
     * @see #getStripSpace()
     * @generated
     */
    void setStripSpace(StripSpaceType value);

    /**
     * Returns the value of the '<em><b>Stylesheet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stylesheet</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stylesheet</em>' containment reference.
     * @see #setStylesheet(TransformType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Stylesheet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='stylesheet' namespace='##targetNamespace' affiliation='transform'"
     * @generated
     */
    TransformType getStylesheet();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getStylesheet <em>Stylesheet</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stylesheet</em>' containment reference.
     * @see #getStylesheet()
     * @generated
     */
    void setStylesheet(TransformType value);

    /**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference.
     * @see #setTransform(TransformType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Transform()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
     * @generated
     */
    TransformType getTransform();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getTransform <em>Transform</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transform</em>' containment reference.
     * @see #getTransform()
     * @generated
     */
    void setTransform(TransformType value);

    /**
     * Returns the value of the '<em><b>Template</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' containment reference.
     * @see #setTemplate(TemplateType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Template()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace' affiliation='declaration'"
     * @generated
     */
    TemplateType getTemplate();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getTemplate <em>Template</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' containment reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(TemplateType value);

    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference.
     * @see #setText(TextType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Text()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    TextType getText();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' containment reference.
     * @see #getText()
     * @generated
     */
    void setText(TextType value);

    /**
     * Returns the value of the '<em><b>Value Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Of</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Of</em>' containment reference.
     * @see #setValueOf(ValueOfType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_ValueOf()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='value-of' namespace='##targetNamespace' affiliation='instruction'"
     * @generated
     */
    ValueOfType getValueOf();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getValueOf <em>Value Of</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Of</em>' containment reference.
     * @see #getValueOf()
     * @generated
     */
    void setValueOf(ValueOfType value);

    /**
     * Returns the value of the '<em><b>Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' containment reference.
     * @see #setVariable(VariableType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_Variable()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
     * @generated
     */
    VariableType getVariable();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getVariable <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' containment reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(VariableType value);

    /**
     * Returns the value of the '<em><b>When</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>When</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>When</em>' containment reference.
     * @see #setWhen(WhenType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_When()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
     * @generated
     */
    WhenType getWhen();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getWhen <em>When</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>When</em>' containment reference.
     * @see #getWhen()
     * @generated
     */
    void setWhen(WhenType value);

    /**
     * Returns the value of the '<em><b>With Param</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>With Param</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>With Param</em>' containment reference.
     * @see #setWithParam(WithParamType)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getDocumentRoot_WithParam()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='with-param' namespace='##targetNamespace'"
     * @generated
     */
    WithParamType getWithParam();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.DocumentRoot#getWithParam <em>With Param</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>With Param</em>' containment reference.
     * @see #getWithParam()
     * @generated
     */
    void setWithParam(WithParamType value);

} // DocumentRoot
