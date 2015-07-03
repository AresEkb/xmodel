/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.AnalyzeStringType;
import org.w3._1999.xsl.transform.ApplyImportsType;
import org.w3._1999.xsl.transform.ApplyTemplatesType;
import org.w3._1999.xsl.transform.AttributeSetType;
import org.w3._1999.xsl.transform.AttributeType;
import org.w3._1999.xsl.transform.CallTemplateType;
import org.w3._1999.xsl.transform.CharacterMapType;
import org.w3._1999.xsl.transform.ChooseType;
import org.w3._1999.xsl.transform.CommentType;
import org.w3._1999.xsl.transform.CopyOfType;
import org.w3._1999.xsl.transform.CopyType;
import org.w3._1999.xsl.transform.DecimalFormatType;
import org.w3._1999.xsl.transform.DocumentRoot;
import org.w3._1999.xsl.transform.DocumentType;
import org.w3._1999.xsl.transform.ElementType;
import org.w3._1999.xsl.transform.ForEachGroupType;
import org.w3._1999.xsl.transform.ForEachType;
import org.w3._1999.xsl.transform.FunctionType;
import org.w3._1999.xsl.transform.GenericElementType;
import org.w3._1999.xsl.transform.IfType;
import org.w3._1999.xsl.transform.ImportSchemaType;
import org.w3._1999.xsl.transform.ImportType;
import org.w3._1999.xsl.transform.IncludeType;
import org.w3._1999.xsl.transform.KeyType;
import org.w3._1999.xsl.transform.MessageType;
import org.w3._1999.xsl.transform.NamespaceAliasType;
import org.w3._1999.xsl.transform.NamespaceType;
import org.w3._1999.xsl.transform.NextMatchType;
import org.w3._1999.xsl.transform.NumberType;
import org.w3._1999.xsl.transform.OutputCharacterType;
import org.w3._1999.xsl.transform.OutputType;
import org.w3._1999.xsl.transform.ParamType;
import org.w3._1999.xsl.transform.PerformSortType;
import org.w3._1999.xsl.transform.PreserveSpaceType;
import org.w3._1999.xsl.transform.ProcessingInstructionType;
import org.w3._1999.xsl.transform.ResultDocumentType;
import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.SequenceType;
import org.w3._1999.xsl.transform.SortType;
import org.w3._1999.xsl.transform.StripSpaceType;
import org.w3._1999.xsl.transform.TemplateType;
import org.w3._1999.xsl.transform.TextType;
import org.w3._1999.xsl.transform.TransformType;
import org.w3._1999.xsl.transform.ValueOfType;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.VersionedElementType;
import org.w3._1999.xsl.transform.WhenType;
import org.w3._1999.xsl.transform.WithParamType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getAnalyzeString <em>Analyze String</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getApplyImports <em>Apply Imports</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getApplyTemplates <em>Apply Templates</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getAttributeSet <em>Attribute Set</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getCallTemplate <em>Call Template</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getCharacterMap <em>Character Map</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getChoose <em>Choose</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getCopy <em>Copy</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getCopyOf <em>Copy Of</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getDecimalFormat <em>Decimal Format</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getForEachGroup <em>For Each Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getImportSchema <em>Import Schema</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getMatchingSubstring <em>Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getNamespaceAlias <em>Namespace Alias</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getNextMatch <em>Next Match</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getNonMatchingSubstring <em>Non Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getOutputCharacter <em>Output Character</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getPerformSort <em>Perform Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getPreserveSpace <em>Preserve Space</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getProcessingInstruction <em>Processing Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getResultDocument <em>Result Document</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getStripSpace <em>Strip Space</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getStylesheet <em>Stylesheet</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl#getWithParam <em>With Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
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
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, XSLT20Package.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XSLT20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XSLT20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalyzeStringType getAnalyzeString() {
        return (AnalyzeStringType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__ANALYZE_STRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalyzeString(AnalyzeStringType newAnalyzeString, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__ANALYZE_STRING, newAnalyzeString, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnalyzeString(AnalyzeStringType newAnalyzeString) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__ANALYZE_STRING, newAnalyzeString);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VersionedElementType getInstruction() {
        return (VersionedElementType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__INSTRUCTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstruction(VersionedElementType newInstruction, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__INSTRUCTION, newInstruction, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplyImportsType getApplyImports() {
        return (ApplyImportsType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__APPLY_IMPORTS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplyImports(ApplyImportsType newApplyImports, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__APPLY_IMPORTS, newApplyImports, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplyImports(ApplyImportsType newApplyImports) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__APPLY_IMPORTS, newApplyImports);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplyTemplatesType getApplyTemplates() {
        return (ApplyTemplatesType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__APPLY_TEMPLATES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplyTemplates(ApplyTemplatesType newApplyTemplates, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__APPLY_TEMPLATES, newApplyTemplates, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplyTemplates(ApplyTemplatesType newApplyTemplates) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__APPLY_TEMPLATES, newApplyTemplates);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeType getAttribute() {
        return (AttributeType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__ATTRIBUTE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttribute(AttributeType newAttribute, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__ATTRIBUTE, newAttribute, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute(AttributeType newAttribute) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__ATTRIBUTE, newAttribute);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeSetType getAttributeSet() {
        return (AttributeSetType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__ATTRIBUTE_SET, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttributeSet(AttributeSetType newAttributeSet, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__ATTRIBUTE_SET, newAttributeSet, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeSet(AttributeSetType newAttributeSet) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__ATTRIBUTE_SET, newAttributeSet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericElementType getDeclaration() {
        return (GenericElementType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__DECLARATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDeclaration(GenericElementType newDeclaration, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__DECLARATION, newDeclaration, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallTemplateType getCallTemplate() {
        return (CallTemplateType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__CALL_TEMPLATE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallTemplate(CallTemplateType newCallTemplate, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__CALL_TEMPLATE, newCallTemplate, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallTemplate(CallTemplateType newCallTemplate) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__CALL_TEMPLATE, newCallTemplate);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterMapType getCharacterMap() {
        return (CharacterMapType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__CHARACTER_MAP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCharacterMap(CharacterMapType newCharacterMap, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__CHARACTER_MAP, newCharacterMap, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacterMap(CharacterMapType newCharacterMap) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__CHARACTER_MAP, newCharacterMap);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChooseType getChoose() {
        return (ChooseType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__CHOOSE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChoose(ChooseType newChoose, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__CHOOSE, newChoose, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoose(ChooseType newChoose) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__CHOOSE, newChoose);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommentType getComment() {
        return (CommentType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__COMMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComment(CommentType newComment, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__COMMENT, newComment, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComment(CommentType newComment) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__COMMENT, newComment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyType getCopy() {
        return (CopyType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__COPY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCopy(CopyType newCopy, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__COPY, newCopy, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCopy(CopyType newCopy) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__COPY, newCopy);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyOfType getCopyOf() {
        return (CopyOfType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__COPY_OF, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCopyOf(CopyOfType newCopyOf, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__COPY_OF, newCopyOf, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCopyOf(CopyOfType newCopyOf) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__COPY_OF, newCopyOf);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalFormatType getDecimalFormat() {
        return (DecimalFormatType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__DECIMAL_FORMAT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDecimalFormat(DecimalFormatType newDecimalFormat, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__DECIMAL_FORMAT, newDecimalFormat, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDecimalFormat(DecimalFormatType newDecimalFormat) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__DECIMAL_FORMAT, newDecimalFormat);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentType getDocument() {
        return (DocumentType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__DOCUMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocument(DocumentType newDocument, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__DOCUMENT, newDocument, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocument(DocumentType newDocument) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__DOCUMENT, newDocument);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementType getElement() {
        return (ElementType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElement(ElementType newElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__ELEMENT, newElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElement(ElementType newElement) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__ELEMENT, newElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getFallback() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__FALLBACK, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFallback(SequenceConstructor newFallback, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__FALLBACK, newFallback, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFallback(SequenceConstructor newFallback) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__FALLBACK, newFallback);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForEachType getForEach() {
        return (ForEachType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__FOR_EACH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetForEach(ForEachType newForEach, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__FOR_EACH, newForEach, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setForEach(ForEachType newForEach) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__FOR_EACH, newForEach);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForEachGroupType getForEachGroup() {
        return (ForEachGroupType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__FOR_EACH_GROUP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetForEachGroup(ForEachGroupType newForEachGroup, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__FOR_EACH_GROUP, newForEachGroup, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setForEachGroup(ForEachGroupType newForEachGroup) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__FOR_EACH_GROUP, newForEachGroup);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionType getFunction() {
        return (FunctionType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__FUNCTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunction(FunctionType newFunction, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__FUNCTION, newFunction, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFunction(FunctionType newFunction) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__FUNCTION, newFunction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IfType getIf() {
        return (IfType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__IF, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIf(IfType newIf, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__IF, newIf, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIf(IfType newIf) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__IF, newIf);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportType getImport() {
        return (ImportType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__IMPORT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImport(ImportType newImport, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImport(ImportType newImport) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__IMPORT, newImport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportSchemaType getImportSchema() {
        return (ImportSchemaType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__IMPORT_SCHEMA, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImportSchema(ImportSchemaType newImportSchema, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__IMPORT_SCHEMA, newImportSchema, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImportSchema(ImportSchemaType newImportSchema) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__IMPORT_SCHEMA, newImportSchema);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncludeType getInclude() {
        return (IncludeType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__INCLUDE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInclude(IncludeType newInclude, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__INCLUDE, newInclude, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInclude(IncludeType newInclude) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__INCLUDE, newInclude);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeyType getKey() {
        return (KeyType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetKey(KeyType newKey, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__KEY, newKey, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(KeyType newKey) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__KEY, newKey);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getLiteralResultElement() {
        return (EObject)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLiteralResultElement(EObject newLiteralResultElement, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT, newLiteralResultElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getMatchingSubstring() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__MATCHING_SUBSTRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMatchingSubstring(SequenceConstructor newMatchingSubstring, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__MATCHING_SUBSTRING, newMatchingSubstring, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatchingSubstring(SequenceConstructor newMatchingSubstring) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__MATCHING_SUBSTRING, newMatchingSubstring);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageType getMessage() {
        return (MessageType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__MESSAGE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessage(MessageType newMessage, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__MESSAGE, newMessage, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessage(MessageType newMessage) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__MESSAGE, newMessage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespaceType getNamespace() {
        return (NamespaceType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__NAMESPACE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNamespace(NamespaceType newNamespace, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__NAMESPACE, newNamespace, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace(NamespaceType newNamespace) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__NAMESPACE, newNamespace);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespaceAliasType getNamespaceAlias() {
        return (NamespaceAliasType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__NAMESPACE_ALIAS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNamespaceAlias(NamespaceAliasType newNamespaceAlias, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__NAMESPACE_ALIAS, newNamespaceAlias, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespaceAlias(NamespaceAliasType newNamespaceAlias) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__NAMESPACE_ALIAS, newNamespaceAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NextMatchType getNextMatch() {
        return (NextMatchType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__NEXT_MATCH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNextMatch(NextMatchType newNextMatch, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__NEXT_MATCH, newNextMatch, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNextMatch(NextMatchType newNextMatch) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__NEXT_MATCH, newNextMatch);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getNonMatchingSubstring() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNonMatchingSubstring(SequenceConstructor newNonMatchingSubstring, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING, newNonMatchingSubstring, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNonMatchingSubstring(SequenceConstructor newNonMatchingSubstring) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING, newNonMatchingSubstring);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumberType getNumber() {
        return (NumberType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__NUMBER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNumber(NumberType newNumber, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__NUMBER, newNumber, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumber(NumberType newNumber) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__NUMBER, newNumber);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getOtherwise() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__OTHERWISE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOtherwise(SequenceConstructor newOtherwise, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__OTHERWISE, newOtherwise, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOtherwise(SequenceConstructor newOtherwise) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__OTHERWISE, newOtherwise);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputType getOutput() {
        return (OutputType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__OUTPUT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutput(OutputType newOutput, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__OUTPUT, newOutput, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutput(OutputType newOutput) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__OUTPUT, newOutput);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputCharacterType getOutputCharacter() {
        return (OutputCharacterType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__OUTPUT_CHARACTER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputCharacter(OutputCharacterType newOutputCharacter, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__OUTPUT_CHARACTER, newOutputCharacter, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputCharacter(OutputCharacterType newOutputCharacter) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__OUTPUT_CHARACTER, newOutputCharacter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParamType getParam() {
        return (ParamType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__PARAM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParam(ParamType newParam, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__PARAM, newParam, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParam(ParamType newParam) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__PARAM, newParam);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerformSortType getPerformSort() {
        return (PerformSortType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__PERFORM_SORT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPerformSort(PerformSortType newPerformSort, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__PERFORM_SORT, newPerformSort, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPerformSort(PerformSortType newPerformSort) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__PERFORM_SORT, newPerformSort);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PreserveSpaceType getPreserveSpace() {
        return (PreserveSpaceType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__PRESERVE_SPACE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPreserveSpace(PreserveSpaceType newPreserveSpace, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__PRESERVE_SPACE, newPreserveSpace, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreserveSpace(PreserveSpaceType newPreserveSpace) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__PRESERVE_SPACE, newPreserveSpace);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingInstructionType getProcessingInstruction() {
        return (ProcessingInstructionType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__PROCESSING_INSTRUCTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcessingInstruction(ProcessingInstructionType newProcessingInstruction, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__PROCESSING_INSTRUCTION, newProcessingInstruction, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessingInstruction(ProcessingInstructionType newProcessingInstruction) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__PROCESSING_INSTRUCTION, newProcessingInstruction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultDocumentType getResultDocument() {
        return (ResultDocumentType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__RESULT_DOCUMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResultDocument(ResultDocumentType newResultDocument, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__RESULT_DOCUMENT, newResultDocument, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResultDocument(ResultDocumentType newResultDocument) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__RESULT_DOCUMENT, newResultDocument);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceType getSequence() {
        return (SequenceType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__SEQUENCE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSequence(SequenceType newSequence, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence(SequenceType newSequence) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SortType getSort() {
        return (SortType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__SORT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSort(SortType newSort, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__SORT, newSort, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSort(SortType newSort) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__SORT, newSort);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StripSpaceType getStripSpace() {
        return (StripSpaceType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__STRIP_SPACE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStripSpace(StripSpaceType newStripSpace, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__STRIP_SPACE, newStripSpace, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStripSpace(StripSpaceType newStripSpace) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__STRIP_SPACE, newStripSpace);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformType getStylesheet() {
        return (TransformType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__STYLESHEET, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStylesheet(TransformType newStylesheet, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__STYLESHEET, newStylesheet, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStylesheet(TransformType newStylesheet) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__STYLESHEET, newStylesheet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformType getTransform() {
        return (TransformType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__TRANSFORM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransform(TransformType newTransform, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransform(TransformType newTransform) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateType getTemplate() {
        return (TemplateType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__TEMPLATE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplate(TemplateType newTemplate, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(TemplateType newTemplate) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextType getText() {
        return (TextType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__TEXT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetText(TextType newText, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__TEXT, newText, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setText(TextType newText) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__TEXT, newText);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueOfType getValueOf() {
        return (ValueOfType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__VALUE_OF, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueOf(ValueOfType newValueOf, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__VALUE_OF, newValueOf, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueOf(ValueOfType newValueOf) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__VALUE_OF, newValueOf);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableType getVariable() {
        return (VariableType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__VARIABLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVariable(VariableType newVariable, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__VARIABLE, newVariable, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVariable(VariableType newVariable) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__VARIABLE, newVariable);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WhenType getWhen() {
        return (WhenType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__WHEN, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWhen(WhenType newWhen, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__WHEN, newWhen, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWhen(WhenType newWhen) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__WHEN, newWhen);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WithParamType getWithParam() {
        return (WithParamType)getMixed().get(XSLT20Package.Literals.DOCUMENT_ROOT__WITH_PARAM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWithParam(WithParamType newWithParam, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.DOCUMENT_ROOT__WITH_PARAM, newWithParam, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWithParam(WithParamType newWithParam) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.DOCUMENT_ROOT__WITH_PARAM, newWithParam);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XSLT20Package.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case XSLT20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case XSLT20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case XSLT20Package.DOCUMENT_ROOT__ANALYZE_STRING:
                return basicSetAnalyzeString(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__INSTRUCTION:
                return basicSetInstruction(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__APPLY_IMPORTS:
                return basicSetApplyImports(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__APPLY_TEMPLATES:
                return basicSetApplyTemplates(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE:
                return basicSetAttribute(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE_SET:
                return basicSetAttributeSet(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__DECLARATION:
                return basicSetDeclaration(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__CALL_TEMPLATE:
                return basicSetCallTemplate(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__CHARACTER_MAP:
                return basicSetCharacterMap(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__CHOOSE:
                return basicSetChoose(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__COMMENT:
                return basicSetComment(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__COPY:
                return basicSetCopy(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__COPY_OF:
                return basicSetCopyOf(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__DECIMAL_FORMAT:
                return basicSetDecimalFormat(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__DOCUMENT:
                return basicSetDocument(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__ELEMENT:
                return basicSetElement(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__FALLBACK:
                return basicSetFallback(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH:
                return basicSetForEach(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH_GROUP:
                return basicSetForEachGroup(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__FUNCTION:
                return basicSetFunction(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__IF:
                return basicSetIf(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__IMPORT:
                return basicSetImport(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__IMPORT_SCHEMA:
                return basicSetImportSchema(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__INCLUDE:
                return basicSetInclude(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__KEY:
                return basicSetKey(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT:
                return basicSetLiteralResultElement(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__MATCHING_SUBSTRING:
                return basicSetMatchingSubstring(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__MESSAGE:
                return basicSetMessage(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE:
                return basicSetNamespace(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE_ALIAS:
                return basicSetNamespaceAlias(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__NEXT_MATCH:
                return basicSetNextMatch(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING:
                return basicSetNonMatchingSubstring(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__NUMBER:
                return basicSetNumber(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__OTHERWISE:
                return basicSetOtherwise(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT:
                return basicSetOutput(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT_CHARACTER:
                return basicSetOutputCharacter(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__PARAM:
                return basicSetParam(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__PERFORM_SORT:
                return basicSetPerformSort(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__PRESERVE_SPACE:
                return basicSetPreserveSpace(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__PROCESSING_INSTRUCTION:
                return basicSetProcessingInstruction(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__RESULT_DOCUMENT:
                return basicSetResultDocument(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__SEQUENCE:
                return basicSetSequence(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__SORT:
                return basicSetSort(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__STRIP_SPACE:
                return basicSetStripSpace(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__STYLESHEET:
                return basicSetStylesheet(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__TRANSFORM:
                return basicSetTransform(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__TEMPLATE:
                return basicSetTemplate(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__TEXT:
                return basicSetText(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__VALUE_OF:
                return basicSetValueOf(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__VARIABLE:
                return basicSetVariable(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__WHEN:
                return basicSetWhen(null, msgs);
            case XSLT20Package.DOCUMENT_ROOT__WITH_PARAM:
                return basicSetWithParam(null, msgs);
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
            case XSLT20Package.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case XSLT20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case XSLT20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case XSLT20Package.DOCUMENT_ROOT__ANALYZE_STRING:
                return getAnalyzeString();
            case XSLT20Package.DOCUMENT_ROOT__INSTRUCTION:
                return getInstruction();
            case XSLT20Package.DOCUMENT_ROOT__APPLY_IMPORTS:
                return getApplyImports();
            case XSLT20Package.DOCUMENT_ROOT__APPLY_TEMPLATES:
                return getApplyTemplates();
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE:
                return getAttribute();
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE_SET:
                return getAttributeSet();
            case XSLT20Package.DOCUMENT_ROOT__DECLARATION:
                return getDeclaration();
            case XSLT20Package.DOCUMENT_ROOT__CALL_TEMPLATE:
                return getCallTemplate();
            case XSLT20Package.DOCUMENT_ROOT__CHARACTER_MAP:
                return getCharacterMap();
            case XSLT20Package.DOCUMENT_ROOT__CHOOSE:
                return getChoose();
            case XSLT20Package.DOCUMENT_ROOT__COMMENT:
                return getComment();
            case XSLT20Package.DOCUMENT_ROOT__COPY:
                return getCopy();
            case XSLT20Package.DOCUMENT_ROOT__COPY_OF:
                return getCopyOf();
            case XSLT20Package.DOCUMENT_ROOT__DECIMAL_FORMAT:
                return getDecimalFormat();
            case XSLT20Package.DOCUMENT_ROOT__DOCUMENT:
                return getDocument();
            case XSLT20Package.DOCUMENT_ROOT__ELEMENT:
                return getElement();
            case XSLT20Package.DOCUMENT_ROOT__FALLBACK:
                return getFallback();
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH:
                return getForEach();
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH_GROUP:
                return getForEachGroup();
            case XSLT20Package.DOCUMENT_ROOT__FUNCTION:
                return getFunction();
            case XSLT20Package.DOCUMENT_ROOT__IF:
                return getIf();
            case XSLT20Package.DOCUMENT_ROOT__IMPORT:
                return getImport();
            case XSLT20Package.DOCUMENT_ROOT__IMPORT_SCHEMA:
                return getImportSchema();
            case XSLT20Package.DOCUMENT_ROOT__INCLUDE:
                return getInclude();
            case XSLT20Package.DOCUMENT_ROOT__KEY:
                return getKey();
            case XSLT20Package.DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT:
                return getLiteralResultElement();
            case XSLT20Package.DOCUMENT_ROOT__MATCHING_SUBSTRING:
                return getMatchingSubstring();
            case XSLT20Package.DOCUMENT_ROOT__MESSAGE:
                return getMessage();
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE:
                return getNamespace();
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE_ALIAS:
                return getNamespaceAlias();
            case XSLT20Package.DOCUMENT_ROOT__NEXT_MATCH:
                return getNextMatch();
            case XSLT20Package.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING:
                return getNonMatchingSubstring();
            case XSLT20Package.DOCUMENT_ROOT__NUMBER:
                return getNumber();
            case XSLT20Package.DOCUMENT_ROOT__OTHERWISE:
                return getOtherwise();
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT:
                return getOutput();
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT_CHARACTER:
                return getOutputCharacter();
            case XSLT20Package.DOCUMENT_ROOT__PARAM:
                return getParam();
            case XSLT20Package.DOCUMENT_ROOT__PERFORM_SORT:
                return getPerformSort();
            case XSLT20Package.DOCUMENT_ROOT__PRESERVE_SPACE:
                return getPreserveSpace();
            case XSLT20Package.DOCUMENT_ROOT__PROCESSING_INSTRUCTION:
                return getProcessingInstruction();
            case XSLT20Package.DOCUMENT_ROOT__RESULT_DOCUMENT:
                return getResultDocument();
            case XSLT20Package.DOCUMENT_ROOT__SEQUENCE:
                return getSequence();
            case XSLT20Package.DOCUMENT_ROOT__SORT:
                return getSort();
            case XSLT20Package.DOCUMENT_ROOT__STRIP_SPACE:
                return getStripSpace();
            case XSLT20Package.DOCUMENT_ROOT__STYLESHEET:
                return getStylesheet();
            case XSLT20Package.DOCUMENT_ROOT__TRANSFORM:
                return getTransform();
            case XSLT20Package.DOCUMENT_ROOT__TEMPLATE:
                return getTemplate();
            case XSLT20Package.DOCUMENT_ROOT__TEXT:
                return getText();
            case XSLT20Package.DOCUMENT_ROOT__VALUE_OF:
                return getValueOf();
            case XSLT20Package.DOCUMENT_ROOT__VARIABLE:
                return getVariable();
            case XSLT20Package.DOCUMENT_ROOT__WHEN:
                return getWhen();
            case XSLT20Package.DOCUMENT_ROOT__WITH_PARAM:
                return getWithParam();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XSLT20Package.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ANALYZE_STRING:
                setAnalyzeString((AnalyzeStringType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__APPLY_IMPORTS:
                setApplyImports((ApplyImportsType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__APPLY_TEMPLATES:
                setApplyTemplates((ApplyTemplatesType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE:
                setAttribute((AttributeType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE_SET:
                setAttributeSet((AttributeSetType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__CALL_TEMPLATE:
                setCallTemplate((CallTemplateType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__CHARACTER_MAP:
                setCharacterMap((CharacterMapType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__CHOOSE:
                setChoose((ChooseType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__COMMENT:
                setComment((CommentType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__COPY:
                setCopy((CopyType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__COPY_OF:
                setCopyOf((CopyOfType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__DECIMAL_FORMAT:
                setDecimalFormat((DecimalFormatType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__DOCUMENT:
                setDocument((DocumentType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ELEMENT:
                setElement((ElementType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FALLBACK:
                setFallback((SequenceConstructor)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH:
                setForEach((ForEachType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH_GROUP:
                setForEachGroup((ForEachGroupType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FUNCTION:
                setFunction((FunctionType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__IF:
                setIf((IfType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__IMPORT_SCHEMA:
                setImportSchema((ImportSchemaType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__INCLUDE:
                setInclude((IncludeType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__KEY:
                setKey((KeyType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__MATCHING_SUBSTRING:
                setMatchingSubstring((SequenceConstructor)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__MESSAGE:
                setMessage((MessageType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE:
                setNamespace((NamespaceType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE_ALIAS:
                setNamespaceAlias((NamespaceAliasType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NEXT_MATCH:
                setNextMatch((NextMatchType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING:
                setNonMatchingSubstring((SequenceConstructor)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NUMBER:
                setNumber((NumberType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__OTHERWISE:
                setOtherwise((SequenceConstructor)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT:
                setOutput((OutputType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT_CHARACTER:
                setOutputCharacter((OutputCharacterType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PARAM:
                setParam((ParamType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PERFORM_SORT:
                setPerformSort((PerformSortType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PRESERVE_SPACE:
                setPreserveSpace((PreserveSpaceType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PROCESSING_INSTRUCTION:
                setProcessingInstruction((ProcessingInstructionType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__RESULT_DOCUMENT:
                setResultDocument((ResultDocumentType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__SEQUENCE:
                setSequence((SequenceType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__SORT:
                setSort((SortType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__STRIP_SPACE:
                setStripSpace((StripSpaceType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__STYLESHEET:
                setStylesheet((TransformType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__TRANSFORM:
                setTransform((TransformType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__TEMPLATE:
                setTemplate((TemplateType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__TEXT:
                setText((TextType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__VALUE_OF:
                setValueOf((ValueOfType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__VARIABLE:
                setVariable((VariableType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__WHEN:
                setWhen((WhenType)newValue);
                return;
            case XSLT20Package.DOCUMENT_ROOT__WITH_PARAM:
                setWithParam((WithParamType)newValue);
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
            case XSLT20Package.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case XSLT20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case XSLT20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case XSLT20Package.DOCUMENT_ROOT__ANALYZE_STRING:
                setAnalyzeString((AnalyzeStringType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__APPLY_IMPORTS:
                setApplyImports((ApplyImportsType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__APPLY_TEMPLATES:
                setApplyTemplates((ApplyTemplatesType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE:
                setAttribute((AttributeType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE_SET:
                setAttributeSet((AttributeSetType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__CALL_TEMPLATE:
                setCallTemplate((CallTemplateType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__CHARACTER_MAP:
                setCharacterMap((CharacterMapType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__CHOOSE:
                setChoose((ChooseType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__COMMENT:
                setComment((CommentType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__COPY:
                setCopy((CopyType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__COPY_OF:
                setCopyOf((CopyOfType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__DECIMAL_FORMAT:
                setDecimalFormat((DecimalFormatType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__DOCUMENT:
                setDocument((DocumentType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__ELEMENT:
                setElement((ElementType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FALLBACK:
                setFallback((SequenceConstructor)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH:
                setForEach((ForEachType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH_GROUP:
                setForEachGroup((ForEachGroupType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__FUNCTION:
                setFunction((FunctionType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__IF:
                setIf((IfType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__IMPORT_SCHEMA:
                setImportSchema((ImportSchemaType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__INCLUDE:
                setInclude((IncludeType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__KEY:
                setKey((KeyType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__MATCHING_SUBSTRING:
                setMatchingSubstring((SequenceConstructor)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__MESSAGE:
                setMessage((MessageType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE:
                setNamespace((NamespaceType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE_ALIAS:
                setNamespaceAlias((NamespaceAliasType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NEXT_MATCH:
                setNextMatch((NextMatchType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING:
                setNonMatchingSubstring((SequenceConstructor)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__NUMBER:
                setNumber((NumberType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__OTHERWISE:
                setOtherwise((SequenceConstructor)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT:
                setOutput((OutputType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT_CHARACTER:
                setOutputCharacter((OutputCharacterType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PARAM:
                setParam((ParamType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PERFORM_SORT:
                setPerformSort((PerformSortType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PRESERVE_SPACE:
                setPreserveSpace((PreserveSpaceType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__PROCESSING_INSTRUCTION:
                setProcessingInstruction((ProcessingInstructionType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__RESULT_DOCUMENT:
                setResultDocument((ResultDocumentType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__SEQUENCE:
                setSequence((SequenceType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__SORT:
                setSort((SortType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__STRIP_SPACE:
                setStripSpace((StripSpaceType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__STYLESHEET:
                setStylesheet((TransformType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__TRANSFORM:
                setTransform((TransformType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__TEMPLATE:
                setTemplate((TemplateType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__TEXT:
                setText((TextType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__VALUE_OF:
                setValueOf((ValueOfType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__VARIABLE:
                setVariable((VariableType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__WHEN:
                setWhen((WhenType)null);
                return;
            case XSLT20Package.DOCUMENT_ROOT__WITH_PARAM:
                setWithParam((WithParamType)null);
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
            case XSLT20Package.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case XSLT20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case XSLT20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case XSLT20Package.DOCUMENT_ROOT__ANALYZE_STRING:
                return getAnalyzeString() != null;
            case XSLT20Package.DOCUMENT_ROOT__INSTRUCTION:
                return getInstruction() != null;
            case XSLT20Package.DOCUMENT_ROOT__APPLY_IMPORTS:
                return getApplyImports() != null;
            case XSLT20Package.DOCUMENT_ROOT__APPLY_TEMPLATES:
                return getApplyTemplates() != null;
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE:
                return getAttribute() != null;
            case XSLT20Package.DOCUMENT_ROOT__ATTRIBUTE_SET:
                return getAttributeSet() != null;
            case XSLT20Package.DOCUMENT_ROOT__DECLARATION:
                return getDeclaration() != null;
            case XSLT20Package.DOCUMENT_ROOT__CALL_TEMPLATE:
                return getCallTemplate() != null;
            case XSLT20Package.DOCUMENT_ROOT__CHARACTER_MAP:
                return getCharacterMap() != null;
            case XSLT20Package.DOCUMENT_ROOT__CHOOSE:
                return getChoose() != null;
            case XSLT20Package.DOCUMENT_ROOT__COMMENT:
                return getComment() != null;
            case XSLT20Package.DOCUMENT_ROOT__COPY:
                return getCopy() != null;
            case XSLT20Package.DOCUMENT_ROOT__COPY_OF:
                return getCopyOf() != null;
            case XSLT20Package.DOCUMENT_ROOT__DECIMAL_FORMAT:
                return getDecimalFormat() != null;
            case XSLT20Package.DOCUMENT_ROOT__DOCUMENT:
                return getDocument() != null;
            case XSLT20Package.DOCUMENT_ROOT__ELEMENT:
                return getElement() != null;
            case XSLT20Package.DOCUMENT_ROOT__FALLBACK:
                return getFallback() != null;
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH:
                return getForEach() != null;
            case XSLT20Package.DOCUMENT_ROOT__FOR_EACH_GROUP:
                return getForEachGroup() != null;
            case XSLT20Package.DOCUMENT_ROOT__FUNCTION:
                return getFunction() != null;
            case XSLT20Package.DOCUMENT_ROOT__IF:
                return getIf() != null;
            case XSLT20Package.DOCUMENT_ROOT__IMPORT:
                return getImport() != null;
            case XSLT20Package.DOCUMENT_ROOT__IMPORT_SCHEMA:
                return getImportSchema() != null;
            case XSLT20Package.DOCUMENT_ROOT__INCLUDE:
                return getInclude() != null;
            case XSLT20Package.DOCUMENT_ROOT__KEY:
                return getKey() != null;
            case XSLT20Package.DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT:
                return getLiteralResultElement() != null;
            case XSLT20Package.DOCUMENT_ROOT__MATCHING_SUBSTRING:
                return getMatchingSubstring() != null;
            case XSLT20Package.DOCUMENT_ROOT__MESSAGE:
                return getMessage() != null;
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE:
                return getNamespace() != null;
            case XSLT20Package.DOCUMENT_ROOT__NAMESPACE_ALIAS:
                return getNamespaceAlias() != null;
            case XSLT20Package.DOCUMENT_ROOT__NEXT_MATCH:
                return getNextMatch() != null;
            case XSLT20Package.DOCUMENT_ROOT__NON_MATCHING_SUBSTRING:
                return getNonMatchingSubstring() != null;
            case XSLT20Package.DOCUMENT_ROOT__NUMBER:
                return getNumber() != null;
            case XSLT20Package.DOCUMENT_ROOT__OTHERWISE:
                return getOtherwise() != null;
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT:
                return getOutput() != null;
            case XSLT20Package.DOCUMENT_ROOT__OUTPUT_CHARACTER:
                return getOutputCharacter() != null;
            case XSLT20Package.DOCUMENT_ROOT__PARAM:
                return getParam() != null;
            case XSLT20Package.DOCUMENT_ROOT__PERFORM_SORT:
                return getPerformSort() != null;
            case XSLT20Package.DOCUMENT_ROOT__PRESERVE_SPACE:
                return getPreserveSpace() != null;
            case XSLT20Package.DOCUMENT_ROOT__PROCESSING_INSTRUCTION:
                return getProcessingInstruction() != null;
            case XSLT20Package.DOCUMENT_ROOT__RESULT_DOCUMENT:
                return getResultDocument() != null;
            case XSLT20Package.DOCUMENT_ROOT__SEQUENCE:
                return getSequence() != null;
            case XSLT20Package.DOCUMENT_ROOT__SORT:
                return getSort() != null;
            case XSLT20Package.DOCUMENT_ROOT__STRIP_SPACE:
                return getStripSpace() != null;
            case XSLT20Package.DOCUMENT_ROOT__STYLESHEET:
                return getStylesheet() != null;
            case XSLT20Package.DOCUMENT_ROOT__TRANSFORM:
                return getTransform() != null;
            case XSLT20Package.DOCUMENT_ROOT__TEMPLATE:
                return getTemplate() != null;
            case XSLT20Package.DOCUMENT_ROOT__TEXT:
                return getText() != null;
            case XSLT20Package.DOCUMENT_ROOT__VALUE_OF:
                return getValueOf() != null;
            case XSLT20Package.DOCUMENT_ROOT__VARIABLE:
                return getVariable() != null;
            case XSLT20Package.DOCUMENT_ROOT__WHEN:
                return getWhen() != null;
            case XSLT20Package.DOCUMENT_ROOT__WITH_PARAM:
                return getWithParam() != null;
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
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
