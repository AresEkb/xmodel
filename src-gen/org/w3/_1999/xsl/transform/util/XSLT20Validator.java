/**
 */
package org.w3._1999.xsl.transform.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.w3._1999.xsl.transform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Package
 * @generated
 */
public class XSLT20Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XSLT20Validator INSTANCE = new XSLT20Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3._1999.xsl.transform";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLT20Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XSLT20Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XSLT20Package.ANALYZE_STRING_TYPE:
				return validateAnalyzeStringType((AnalyzeStringType)value, diagnostics, context);
			case XSLT20Package.APPLY_IMPORTS_TYPE:
				return validateApplyImportsType((ApplyImportsType)value, diagnostics, context);
			case XSLT20Package.APPLY_TEMPLATES_TYPE:
				return validateApplyTemplatesType((ApplyTemplatesType)value, diagnostics, context);
			case XSLT20Package.ATTRIBUTE_SET_TYPE:
				return validateAttributeSetType((AttributeSetType)value, diagnostics, context);
			case XSLT20Package.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case XSLT20Package.CALL_TEMPLATE_TYPE:
				return validateCallTemplateType((CallTemplateType)value, diagnostics, context);
			case XSLT20Package.CHARACTER_MAP_TYPE:
				return validateCharacterMapType((CharacterMapType)value, diagnostics, context);
			case XSLT20Package.CHOOSE_TYPE:
				return validateChooseType((ChooseType)value, diagnostics, context);
			case XSLT20Package.COMMENT_TYPE:
				return validateCommentType((CommentType)value, diagnostics, context);
			case XSLT20Package.COPY_OF_TYPE:
				return validateCopyOfType((CopyOfType)value, diagnostics, context);
			case XSLT20Package.COPY_TYPE:
				return validateCopyType((CopyType)value, diagnostics, context);
			case XSLT20Package.DECIMAL_FORMAT_TYPE:
				return validateDecimalFormatType((DecimalFormatType)value, diagnostics, context);
			case XSLT20Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case XSLT20Package.DOCUMENT_TYPE:
				return validateDocumentType((DocumentType)value, diagnostics, context);
			case XSLT20Package.ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE:
				return validateElementOnlyVersionedElementType((ElementOnlyVersionedElementType)value, diagnostics, context);
			case XSLT20Package.ELEMENT_TYPE:
				return validateElementType((ElementType)value, diagnostics, context);
			case XSLT20Package.FOR_EACH_GROUP_TYPE:
				return validateForEachGroupType((ForEachGroupType)value, diagnostics, context);
			case XSLT20Package.FOR_EACH_TYPE:
				return validateForEachType((ForEachType)value, diagnostics, context);
			case XSLT20Package.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case XSLT20Package.GENERIC_ELEMENT_TYPE:
				return validateGenericElementType((GenericElementType)value, diagnostics, context);
			case XSLT20Package.IF_TYPE:
				return validateIfType((IfType)value, diagnostics, context);
			case XSLT20Package.IMPORT_SCHEMA_TYPE:
				return validateImportSchemaType((ImportSchemaType)value, diagnostics, context);
			case XSLT20Package.IMPORT_TYPE:
				return validateImportType((ImportType)value, diagnostics, context);
			case XSLT20Package.INCLUDE_TYPE:
				return validateIncludeType((IncludeType)value, diagnostics, context);
			case XSLT20Package.KEY_TYPE:
				return validateKeyType((KeyType)value, diagnostics, context);
			case XSLT20Package.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case XSLT20Package.NAMESPACE_ALIAS_TYPE:
				return validateNamespaceAliasType((NamespaceAliasType)value, diagnostics, context);
			case XSLT20Package.NAMESPACE_TYPE:
				return validateNamespaceType((NamespaceType)value, diagnostics, context);
			case XSLT20Package.NEXT_MATCH_TYPE:
				return validateNextMatchType((NextMatchType)value, diagnostics, context);
			case XSLT20Package.NUMBER_TYPE:
				return validateNumberType((NumberType)value, diagnostics, context);
			case XSLT20Package.OUTPUT_CHARACTER_TYPE:
				return validateOutputCharacterType((OutputCharacterType)value, diagnostics, context);
			case XSLT20Package.OUTPUT_TYPE:
				return validateOutputType((OutputType)value, diagnostics, context);
			case XSLT20Package.PARAM_TYPE:
				return validateParamType((ParamType)value, diagnostics, context);
			case XSLT20Package.PERFORM_SORT_TYPE:
				return validatePerformSortType((PerformSortType)value, diagnostics, context);
			case XSLT20Package.PRESERVE_SPACE_TYPE:
				return validatePreserveSpaceType((PreserveSpaceType)value, diagnostics, context);
			case XSLT20Package.PROCESSING_INSTRUCTION_TYPE:
				return validateProcessingInstructionType((ProcessingInstructionType)value, diagnostics, context);
			case XSLT20Package.RESULT_DOCUMENT_TYPE:
				return validateResultDocumentType((ResultDocumentType)value, diagnostics, context);
			case XSLT20Package.SEQUENCE_CONSTRUCTOR:
				return validateSequenceConstructor((SequenceConstructor)value, diagnostics, context);
			case XSLT20Package.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case XSLT20Package.SORT_TYPE:
				return validateSortType((SortType)value, diagnostics, context);
			case XSLT20Package.STRIP_SPACE_TYPE:
				return validateStripSpaceType((StripSpaceType)value, diagnostics, context);
			case XSLT20Package.TEMPLATE_TYPE:
				return validateTemplateType((TemplateType)value, diagnostics, context);
			case XSLT20Package.TEXT_ELEMENT_BASE_TYPE:
				return validateTextElementBaseType((TextElementBaseType)value, diagnostics, context);
			case XSLT20Package.TEXT_TYPE:
				return validateTextType((TextType)value, diagnostics, context);
			case XSLT20Package.TRANSFORM_ELEMENT_BASE_TYPE:
				return validateTransformElementBaseType((TransformElementBaseType)value, diagnostics, context);
			case XSLT20Package.TRANSFORM_TYPE:
				return validateTransformType((TransformType)value, diagnostics, context);
			case XSLT20Package.VALUE_OF_TYPE:
				return validateValueOfType((ValueOfType)value, diagnostics, context);
			case XSLT20Package.VARIABLE_TYPE:
				return validateVariableType((VariableType)value, diagnostics, context);
			case XSLT20Package.VERSIONED_ELEMENT_TYPE:
				return validateVersionedElementType((VersionedElementType)value, diagnostics, context);
			case XSLT20Package.WHEN_TYPE:
				return validateWhenType((WhenType)value, diagnostics, context);
			case XSLT20Package.WITH_PARAM_TYPE:
				return validateWithParamType((WithParamType)value, diagnostics, context);
			case XSLT20Package.INPUT_TYPE_ANNOTATIONS_TYPE:
				return validateInputTypeAnnotationsType((InputTypeAnnotationsType)value, diagnostics, context);
			case XSLT20Package.LEVEL:
				return validateLevel((Level)value, diagnostics, context);
			case XSLT20Package.METHOD_MEMBER0:
				return validateMethodMember0((MethodMember0)value, diagnostics, context);
			case XSLT20Package.MODE_MEMBER1:
				return validateModeMember1((ModeMember1)value, diagnostics, context);
			case XSLT20Package.MODES_MEMBER0_ITEM_MEMBER1:
				return validateModesMember0ItemMember1((ModesMember0ItemMember1)value, diagnostics, context);
			case XSLT20Package.MODES_MEMBER1:
				return validateModesMember1((ModesMember1)value, diagnostics, context);
			case XSLT20Package.NAMETESTS_ITEM_MEMBER1:
				return validateNametestsItemMember1((NametestsItemMember1)value, diagnostics, context);
			case XSLT20Package.PREFIX_LIST_OR_ALL_MEMBER1:
				return validatePrefixListOrAllMember1((PrefixListOrAllMember1)value, diagnostics, context);
			case XSLT20Package.PREFIX_OR_DEFAULT_MEMBER1:
				return validatePrefixOrDefaultMember1((PrefixOrDefaultMember1)value, diagnostics, context);
			case XSLT20Package.VALIDATION_STRIP_OR_PRESERVE:
				return validateValidationStripOrPreserve((ValidationStripOrPreserve)value, diagnostics, context);
			case XSLT20Package.VALIDATION_TYPE:
				return validateValidationType((ValidationType)value, diagnostics, context);
			case XSLT20Package.YES_OR_NO:
				return validateYesOrNo((YesOrNo)value, diagnostics, context);
			case XSLT20Package.YES_OR_NO_OR_OMIT:
				return validateYesOrNoOrOmit((YesOrNoOrOmit)value, diagnostics, context);
			case XSLT20Package.AVT:
				return validateAvt((String)value, diagnostics, context);
			case XSLT20Package.CHAR:
				return validateChar((String)value, diagnostics, context);
			case XSLT20Package.EXPRESSION:
				return validateExpression((String)value, diagnostics, context);
			case XSLT20Package.INPUT_TYPE_ANNOTATIONS_TYPE_OBJECT:
				return validateInputTypeAnnotationsTypeObject((InputTypeAnnotationsType)value, diagnostics, context);
			case XSLT20Package.LEVEL_OBJECT:
				return validateLevelObject((Level)value, diagnostics, context);
			case XSLT20Package.METHOD:
				return validateMethod(value, diagnostics, context);
			case XSLT20Package.METHOD_MEMBER0_OBJECT:
				return validateMethodMember0Object((MethodMember0)value, diagnostics, context);
			case XSLT20Package.METHOD_MEMBER1:
				return validateMethodMember1((String)value, diagnostics, context);
			case XSLT20Package.MODE:
				return validateMode(value, diagnostics, context);
			case XSLT20Package.MODE_MEMBER1_OBJECT:
				return validateModeMember1Object((ModeMember1)value, diagnostics, context);
			case XSLT20Package.MODES:
				return validateModes(value, diagnostics, context);
			case XSLT20Package.MODES_MEMBER0:
				return validateModesMember0((List<?>)value, diagnostics, context);
			case XSLT20Package.MODES_MEMBER0_ITEM:
				return validateModesMember0Item(value, diagnostics, context);
			case XSLT20Package.MODES_MEMBER0_ITEM_MEMBER1_OBJECT:
				return validateModesMember0ItemMember1Object((ModesMember0ItemMember1)value, diagnostics, context);
			case XSLT20Package.MODES_MEMBER1_OBJECT:
				return validateModesMember1Object((ModesMember1)value, diagnostics, context);
			case XSLT20Package.NAMETESTS:
				return validateNametests((List<?>)value, diagnostics, context);
			case XSLT20Package.NAMETESTS_ITEM:
				return validateNametestsItem(value, diagnostics, context);
			case XSLT20Package.NAMETESTS_ITEM_MEMBER1_OBJECT:
				return validateNametestsItemMember1Object((NametestsItemMember1)value, diagnostics, context);
			case XSLT20Package.NAMETESTS_ITEM_MEMBER2:
				return validateNametestsItemMember2((String)value, diagnostics, context);
			case XSLT20Package.PATTERN:
				return validatePattern((String)value, diagnostics, context);
			case XSLT20Package.PREFIXES:
				return validatePrefixes((List<?>)value, diagnostics, context);
			case XSLT20Package.PREFIX_LIST:
				return validatePrefixList((List<?>)value, diagnostics, context);
			case XSLT20Package.PREFIX_LIST_OR_ALL:
				return validatePrefixListOrAll(value, diagnostics, context);
			case XSLT20Package.PREFIX_LIST_OR_ALL_MEMBER1_OBJECT:
				return validatePrefixListOrAllMember1Object((PrefixListOrAllMember1)value, diagnostics, context);
			case XSLT20Package.PREFIX_OR_DEFAULT:
				return validatePrefixOrDefault(value, diagnostics, context);
			case XSLT20Package.PREFIX_OR_DEFAULT_MEMBER1_OBJECT:
				return validatePrefixOrDefaultMember1Object((PrefixOrDefaultMember1)value, diagnostics, context);
			case XSLT20Package.QNAME:
				return validateQName((String)value, diagnostics, context);
			case XSLT20Package.QNAMES:
				return validateQNames((List<?>)value, diagnostics, context);
			case XSLT20Package.SEQUENCE_TYPE1:
				return validateSequenceType1((String)value, diagnostics, context);
			case XSLT20Package.TEXT_ELEMENT_BASE_TYPE_BASE:
				return validateTextElementBaseTypeBase((String)value, diagnostics, context);
			case XSLT20Package.TEXT_ELEMENT_BASE_TYPE_BASE_BASE:
				return validateTextElementBaseTypeBaseBase((String)value, diagnostics, context);
			case XSLT20Package.URI_LIST:
				return validateUriList((List<?>)value, diagnostics, context);
			case XSLT20Package.VALIDATION_STRIP_OR_PRESERVE_OBJECT:
				return validateValidationStripOrPreserveObject((ValidationStripOrPreserve)value, diagnostics, context);
			case XSLT20Package.VALIDATION_TYPE_OBJECT:
				return validateValidationTypeObject((ValidationType)value, diagnostics, context);
			case XSLT20Package.YES_OR_NO_OBJECT:
				return validateYesOrNoObject((YesOrNo)value, diagnostics, context);
			case XSLT20Package.YES_OR_NO_OR_OMIT_OBJECT:
				return validateYesOrNoOrOmitObject((YesOrNoOrOmit)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalyzeStringType(AnalyzeStringType analyzeStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analyzeStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyImportsType(ApplyImportsType applyImportsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applyImportsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyTemplatesType(ApplyTemplatesType applyTemplatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applyTemplatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeSetType(AttributeSetType attributeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallTemplateType(CallTemplateType callTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterMapType(CharacterMapType characterMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChooseType(ChooseType chooseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chooseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentType(CommentType commentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyOfType(CopyOfType copyOfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(copyOfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyType(CopyType copyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(copyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalFormatType(DecimalFormatType decimalFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalFormatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementOnlyVersionedElementType(ElementOnlyVersionedElementType elementOnlyVersionedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementOnlyVersionedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementType(ElementType elementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForEachGroupType(ForEachGroupType forEachGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forEachGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForEachType(ForEachType forEachType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forEachType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElementType(GenericElementType genericElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfType(IfType ifType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportSchemaType(ImportSchemaType importSchemaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importSchemaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportType(ImportType importType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeType(IncludeType includeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType(KeyType keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceAliasType(NamespaceAliasType namespaceAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namespaceAliasType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceType(NamespaceType namespaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namespaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextMatchType(NextMatchType nextMatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nextMatchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberType(NumberType numberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputCharacterType(OutputCharacterType outputCharacterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputCharacterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType(OutputType outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformSortType(PerformSortType performSortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performSortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreserveSpaceType(PreserveSpaceType preserveSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preserveSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingInstructionType(ProcessingInstructionType processingInstructionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingInstructionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultDocumentType(ResultDocumentType resultDocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultDocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceConstructor(SequenceConstructor sequenceConstructor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceConstructor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortType(SortType sortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStripSpaceType(StripSpaceType stripSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stripSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateType(TemplateType templateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextElementBaseType(TextElementBaseType textElementBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textElementBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextType(TextType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformElementBaseType(TransformElementBaseType transformElementBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformElementBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformType(TransformType transformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueOfType(ValueOfType valueOfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueOfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType(VariableType variableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionedElementType(VersionedElementType versionedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhenType(WhenType whenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWithParamType(WithParamType withParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(withParamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputTypeAnnotationsType(InputTypeAnnotationsType inputTypeAnnotationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevel(Level level, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodMember0(MethodMember0 methodMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeMember1(ModeMember1 modeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember0ItemMember1(ModesMember0ItemMember1 modesMember0ItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember1(ModesMember1 modesMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametestsItemMember1(NametestsItemMember1 nametestsItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixListOrAllMember1(PrefixListOrAllMember1 prefixListOrAllMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixOrDefaultMember1(PrefixOrDefaultMember1 prefixOrDefaultMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationStripOrPreserve(ValidationStripOrPreserve validationStripOrPreserve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationType(ValidationType validationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYesOrNo(YesOrNo yesOrNo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYesOrNoOrOmit(YesOrNoOrOmit yesOrNoOrOmit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvt(String avt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChar(String char_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateChar_MinLength(char_, diagnostics, context);
		if (result || diagnostics != null) result &= validateChar_MaxLength(char_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChar_MinLength(String char_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = char_.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(XSLT20Package.Literals.CHAR, char_, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChar_MaxLength(String char_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = char_.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XSLT20Package.Literals.CHAR, char_, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(String expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExpression_Pattern(expression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExpression_Pattern
	 */
	public static final  PatternMatcher [][] EXPRESSION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression_Pattern(String expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XSLT20Package.Literals.EXPRESSION, expression, EXPRESSION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputTypeAnnotationsTypeObject(InputTypeAnnotationsType inputTypeAnnotationsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelObject(Level levelObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Object method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMethod_MemberTypes(method, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod_MemberTypes(Object method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XSLT20Package.Literals.METHOD_MEMBER0.isInstance(method)) {
				if (validateMethodMember0((MethodMember0)method, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.METHOD_MEMBER1.isInstance(method)) {
				if (validateMethodMember1((String)method, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XSLT20Package.Literals.METHOD_MEMBER0.isInstance(method)) {
				if (validateMethodMember0((MethodMember0)method, null, context)) return true;
			}
			if (XSLT20Package.Literals.METHOD_MEMBER1.isInstance(method)) {
				if (validateMethodMember1((String)method, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodMember0Object(MethodMember0 methodMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodMember1(String methodMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMethodMember1_Pattern(methodMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMethodMember1_Pattern
	 */
	public static final  PatternMatcher [][] METHOD_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c*:\\c*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([^:]+:)?[^:]+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Method Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodMember1_Pattern(String methodMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XSLT20Package.Literals.METHOD_MEMBER1, methodMember1, METHOD_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Object mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMode_MemberTypes(mode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode_MemberTypes(Object mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XSLT20Package.Literals.QNAME.isInstance(mode)) {
				if (validateQName((String)mode, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.MODE_MEMBER1.isInstance(mode)) {
				if (validateModeMember1((ModeMember1)mode, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XSLT20Package.Literals.QNAME.isInstance(mode)) {
				if (validateQName((String)mode, null, context)) return true;
			}
			if (XSLT20Package.Literals.MODE_MEMBER1.isInstance(mode)) {
				if (validateModeMember1((ModeMember1)mode, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeMember1Object(ModeMember1 modeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModes(Object modes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModes_MemberTypes(modes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModes_MemberTypes(Object modes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XSLT20Package.Literals.MODES_MEMBER0.isInstance(modes)) {
				if (validateModesMember0((List<?>)modes, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.MODES_MEMBER1.isInstance(modes)) {
				if (validateModesMember1((ModesMember1)modes, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XSLT20Package.Literals.MODES_MEMBER0.isInstance(modes)) {
				if (validateModesMember0((List<?>)modes, null, context)) return true;
			}
			if (XSLT20Package.Literals.MODES_MEMBER1.isInstance(modes)) {
				if (validateModesMember1((ModesMember1)modes, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember0(List<?> modesMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModesMember0_ItemType(modesMember0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Modes Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember0_ItemType(List<?> modesMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = modesMember0.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XSLT20Package.Literals.MODES_MEMBER0_ITEM.isInstance(item)) {
				result &= validateModesMember0Item(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XSLT20Package.Literals.MODES_MEMBER0_ITEM, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember0Item(Object modesMember0Item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModesMember0Item_MemberTypes(modesMember0Item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Modes Member0 Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember0Item_MemberTypes(Object modesMember0Item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XSLT20Package.Literals.QNAME.isInstance(modesMember0Item)) {
				if (validateQName((String)modesMember0Item, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1.isInstance(modesMember0Item)) {
				if (validateModesMember0ItemMember1((ModesMember0ItemMember1)modesMember0Item, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XSLT20Package.Literals.QNAME.isInstance(modesMember0Item)) {
				if (validateQName((String)modesMember0Item, null, context)) return true;
			}
			if (XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1.isInstance(modesMember0Item)) {
				if (validateModesMember0ItemMember1((ModesMember0ItemMember1)modesMember0Item, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember0ItemMember1Object(ModesMember0ItemMember1 modesMember0ItemMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModesMember1Object(ModesMember1 modesMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametests(List<?> nametests, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNametests_ItemType(nametests, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Nametests</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametests_ItemType(List<?> nametests, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = nametests.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XSLT20Package.Literals.NAMETESTS_ITEM.isInstance(item)) {
				result &= validateNametestsItem(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XSLT20Package.Literals.NAMETESTS_ITEM, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametestsItem(Object nametestsItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNametestsItem_MemberTypes(nametestsItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Nametests Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametestsItem_MemberTypes(Object nametestsItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XSLT20Package.Literals.QNAME.isInstance(nametestsItem)) {
				if (validateQName((String)nametestsItem, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1.isInstance(nametestsItem)) {
				if (validateNametestsItemMember1((NametestsItemMember1)nametestsItem, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER2.isInstance(nametestsItem)) {
				if (validateNametestsItemMember2((String)nametestsItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XSLT20Package.Literals.QNAME.isInstance(nametestsItem)) {
				if (validateQName((String)nametestsItem, null, context)) return true;
			}
			if (XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1.isInstance(nametestsItem)) {
				if (validateNametestsItemMember1((NametestsItemMember1)nametestsItem, null, context)) return true;
			}
			if (XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER2.isInstance(nametestsItem)) {
				if (validateNametestsItemMember2((String)nametestsItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametestsItemMember1Object(NametestsItemMember1 nametestsItemMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametestsItemMember2(String nametestsItemMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNametestsItemMember2_Pattern(nametestsItemMember2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNametestsItemMember2_Pattern
	 */
	public static final  PatternMatcher [][] NAMETESTS_ITEM_MEMBER2__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*:\\*"),
				XMLTypeUtil.createPatternMatcher("\\*:\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Nametests Item Member2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNametestsItemMember2_Pattern(String nametestsItemMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER2, nametestsItemMember2, NAMETESTS_ITEM_MEMBER2__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePattern(String pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExpression_Pattern(pattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixes(List<?> prefixes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrefixes_ItemType(prefixes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Prefixes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixes_ItemType(List<?> prefixes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = prefixes.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NC_NAME.isInstance(item)) {
				result &= xmlTypeValidator.validateNCName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NC_NAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixList(List<?> prefixList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrefixList_ItemType(prefixList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Prefix List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixList_ItemType(List<?> prefixList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = prefixList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XSLT20Package.Literals.PREFIX_OR_DEFAULT.isInstance(item)) {
				result &= validatePrefixOrDefault(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XSLT20Package.Literals.PREFIX_OR_DEFAULT, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixListOrAll(Object prefixListOrAll, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrefixListOrAll_MemberTypes(prefixListOrAll, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Prefix List Or All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixListOrAll_MemberTypes(Object prefixListOrAll, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XSLT20Package.Literals.PREFIX_LIST.isInstance(prefixListOrAll)) {
				if (validatePrefixList((List<?>)prefixListOrAll, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1.isInstance(prefixListOrAll)) {
				if (validatePrefixListOrAllMember1((PrefixListOrAllMember1)prefixListOrAll, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XSLT20Package.Literals.PREFIX_LIST.isInstance(prefixListOrAll)) {
				if (validatePrefixList((List<?>)prefixListOrAll, null, context)) return true;
			}
			if (XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1.isInstance(prefixListOrAll)) {
				if (validatePrefixListOrAllMember1((PrefixListOrAllMember1)prefixListOrAll, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixListOrAllMember1Object(PrefixListOrAllMember1 prefixListOrAllMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixOrDefault(Object prefixOrDefault, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrefixOrDefault_MemberTypes(prefixOrDefault, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Prefix Or Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixOrDefault_MemberTypes(Object prefixOrDefault, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NC_NAME.isInstance(prefixOrDefault)) {
				if (xmlTypeValidator.validateNCName((String)prefixOrDefault, tempDiagnostics, context)) return true;
			}
			if (XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1.isInstance(prefixOrDefault)) {
				if (validatePrefixOrDefaultMember1((PrefixOrDefaultMember1)prefixOrDefault, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NC_NAME.isInstance(prefixOrDefault)) {
				if (xmlTypeValidator.validateNCName((String)prefixOrDefault, null, context)) return true;
			}
			if (XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1.isInstance(prefixOrDefault)) {
				if (validatePrefixOrDefaultMember1((PrefixOrDefaultMember1)prefixOrDefault, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixOrDefaultMember1Object(PrefixOrDefaultMember1 prefixOrDefaultMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQName(String qName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQName_Pattern(qName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateQName_Pattern
	 */
	public static final  PatternMatcher [][] QNAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([^:]+:)?[^:]+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>QName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQName_Pattern(String qName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XSLT20Package.Literals.QNAME, qName, QNAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNames(List<?> qNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQNames_ItemType(qNames, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>QNames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNames_ItemType(List<?> qNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = qNames.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XSLT20Package.Literals.QNAME.isInstance(item)) {
				result &= validateQName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XSLT20Package.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType1(String sequenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSequenceType1_Pattern(sequenceType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSequenceType1_Pattern
	 */
	public static final  PatternMatcher [][] SEQUENCE_TYPE1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sequence Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType1_Pattern(String sequenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XSLT20Package.Literals.SEQUENCE_TYPE1, sequenceType1, SEQUENCE_TYPE1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextElementBaseTypeBase(String textElementBaseTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextElementBaseTypeBaseBase(String textElementBaseTypeBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriList(List<?> uriList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUriList_ItemType(uriList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Uri List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriList_ItemType(List<?> uriList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = uriList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationStripOrPreserveObject(ValidationStripOrPreserve validationStripOrPreserveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationTypeObject(ValidationType validationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYesOrNoObject(YesOrNo yesOrNoObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYesOrNoOrOmitObject(YesOrNoOrOmit yesOrNoOrOmitObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XSLT20Validator
