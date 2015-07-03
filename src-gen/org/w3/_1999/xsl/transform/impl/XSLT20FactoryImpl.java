/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xsl.transform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XSLT20FactoryImpl extends EFactoryImpl implements XSLT20Factory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XSLT20Factory init() {
        try {
            XSLT20Factory theXSLT20Factory = (XSLT20Factory)EPackage.Registry.INSTANCE.getEFactory(XSLT20Package.eNS_URI);
            if (theXSLT20Factory != null) {
                return theXSLT20Factory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XSLT20FactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XSLT20FactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case XSLT20Package.ANALYZE_STRING_TYPE: return createAnalyzeStringType();
            case XSLT20Package.APPLY_IMPORTS_TYPE: return createApplyImportsType();
            case XSLT20Package.APPLY_TEMPLATES_TYPE: return createApplyTemplatesType();
            case XSLT20Package.ATTRIBUTE_SET_TYPE: return createAttributeSetType();
            case XSLT20Package.ATTRIBUTE_TYPE: return createAttributeType();
            case XSLT20Package.CALL_TEMPLATE_TYPE: return createCallTemplateType();
            case XSLT20Package.CHARACTER_MAP_TYPE: return createCharacterMapType();
            case XSLT20Package.CHOOSE_TYPE: return createChooseType();
            case XSLT20Package.COMMENT_TYPE: return createCommentType();
            case XSLT20Package.COPY_OF_TYPE: return createCopyOfType();
            case XSLT20Package.COPY_TYPE: return createCopyType();
            case XSLT20Package.DECIMAL_FORMAT_TYPE: return createDecimalFormatType();
            case XSLT20Package.DOCUMENT_ROOT: return createDocumentRoot();
            case XSLT20Package.DOCUMENT_TYPE: return createDocumentType();
            case XSLT20Package.ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE: return createElementOnlyVersionedElementType();
            case XSLT20Package.ELEMENT_TYPE: return createElementType();
            case XSLT20Package.FOR_EACH_GROUP_TYPE: return createForEachGroupType();
            case XSLT20Package.FOR_EACH_TYPE: return createForEachType();
            case XSLT20Package.FUNCTION_TYPE: return createFunctionType();
            case XSLT20Package.GENERIC_ELEMENT_TYPE: return createGenericElementType();
            case XSLT20Package.IF_TYPE: return createIfType();
            case XSLT20Package.IMPORT_SCHEMA_TYPE: return createImportSchemaType();
            case XSLT20Package.IMPORT_TYPE: return createImportType();
            case XSLT20Package.INCLUDE_TYPE: return createIncludeType();
            case XSLT20Package.KEY_TYPE: return createKeyType();
            case XSLT20Package.MESSAGE_TYPE: return createMessageType();
            case XSLT20Package.NAMESPACE_ALIAS_TYPE: return createNamespaceAliasType();
            case XSLT20Package.NAMESPACE_TYPE: return createNamespaceType();
            case XSLT20Package.NEXT_MATCH_TYPE: return createNextMatchType();
            case XSLT20Package.NUMBER_TYPE: return createNumberType();
            case XSLT20Package.OUTPUT_CHARACTER_TYPE: return createOutputCharacterType();
            case XSLT20Package.OUTPUT_TYPE: return createOutputType();
            case XSLT20Package.PARAM_TYPE: return createParamType();
            case XSLT20Package.PERFORM_SORT_TYPE: return createPerformSortType();
            case XSLT20Package.PRESERVE_SPACE_TYPE: return createPreserveSpaceType();
            case XSLT20Package.PROCESSING_INSTRUCTION_TYPE: return createProcessingInstructionType();
            case XSLT20Package.RESULT_DOCUMENT_TYPE: return createResultDocumentType();
            case XSLT20Package.SEQUENCE_CONSTRUCTOR: return createSequenceConstructor();
            case XSLT20Package.SEQUENCE_TYPE: return createSequenceType();
            case XSLT20Package.SORT_TYPE: return createSortType();
            case XSLT20Package.STRIP_SPACE_TYPE: return createStripSpaceType();
            case XSLT20Package.TEMPLATE_TYPE: return createTemplateType();
            case XSLT20Package.TEXT_ELEMENT_BASE_TYPE: return createTextElementBaseType();
            case XSLT20Package.TEXT_TYPE: return createTextType();
            case XSLT20Package.TRANSFORM_ELEMENT_BASE_TYPE: return createTransformElementBaseType();
            case XSLT20Package.TRANSFORM_TYPE: return createTransformType();
            case XSLT20Package.VALUE_OF_TYPE: return createValueOfType();
            case XSLT20Package.VARIABLE_TYPE: return createVariableType();
            case XSLT20Package.VERSIONED_ELEMENT_TYPE: return createVersionedElementType();
            case XSLT20Package.WHEN_TYPE: return createWhenType();
            case XSLT20Package.WITH_PARAM_TYPE: return createWithParamType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case XSLT20Package.INPUT_TYPE_ANNOTATIONS_TYPE:
                return createInputTypeAnnotationsTypeFromString(eDataType, initialValue);
            case XSLT20Package.LEVEL:
                return createLevelFromString(eDataType, initialValue);
            case XSLT20Package.METHOD_MEMBER0:
                return createMethodMember0FromString(eDataType, initialValue);
            case XSLT20Package.MODE_MEMBER1:
                return createModeMember1FromString(eDataType, initialValue);
            case XSLT20Package.MODES_MEMBER0_ITEM_MEMBER1:
                return createModesMember0ItemMember1FromString(eDataType, initialValue);
            case XSLT20Package.MODES_MEMBER1:
                return createModesMember1FromString(eDataType, initialValue);
            case XSLT20Package.NAMETESTS_ITEM_MEMBER1:
                return createNametestsItemMember1FromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_LIST_OR_ALL_MEMBER1:
                return createPrefixListOrAllMember1FromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_OR_DEFAULT_MEMBER1:
                return createPrefixOrDefaultMember1FromString(eDataType, initialValue);
            case XSLT20Package.VALIDATION_STRIP_OR_PRESERVE:
                return createValidationStripOrPreserveFromString(eDataType, initialValue);
            case XSLT20Package.VALIDATION_TYPE:
                return createValidationTypeFromString(eDataType, initialValue);
            case XSLT20Package.YES_OR_NO:
                return createYesOrNoFromString(eDataType, initialValue);
            case XSLT20Package.YES_OR_NO_OR_OMIT:
                return createYesOrNoOrOmitFromString(eDataType, initialValue);
            case XSLT20Package.AVT:
                return createAvtFromString(eDataType, initialValue);
            case XSLT20Package.CHAR:
                return createCharFromString(eDataType, initialValue);
            case XSLT20Package.EXPRESSION:
                return createExpressionFromString(eDataType, initialValue);
            case XSLT20Package.INPUT_TYPE_ANNOTATIONS_TYPE_OBJECT:
                return createInputTypeAnnotationsTypeObjectFromString(eDataType, initialValue);
            case XSLT20Package.LEVEL_OBJECT:
                return createLevelObjectFromString(eDataType, initialValue);
            case XSLT20Package.METHOD:
                return createMethodFromString(eDataType, initialValue);
            case XSLT20Package.METHOD_MEMBER0_OBJECT:
                return createMethodMember0ObjectFromString(eDataType, initialValue);
            case XSLT20Package.METHOD_MEMBER1:
                return createMethodMember1FromString(eDataType, initialValue);
            case XSLT20Package.MODE:
                return createModeFromString(eDataType, initialValue);
            case XSLT20Package.MODE_MEMBER1_OBJECT:
                return createModeMember1ObjectFromString(eDataType, initialValue);
            case XSLT20Package.MODES:
                return createModesFromString(eDataType, initialValue);
            case XSLT20Package.MODES_MEMBER0:
                return createModesMember0FromString(eDataType, initialValue);
            case XSLT20Package.MODES_MEMBER0_ITEM:
                return createModesMember0ItemFromString(eDataType, initialValue);
            case XSLT20Package.MODES_MEMBER0_ITEM_MEMBER1_OBJECT:
                return createModesMember0ItemMember1ObjectFromString(eDataType, initialValue);
            case XSLT20Package.MODES_MEMBER1_OBJECT:
                return createModesMember1ObjectFromString(eDataType, initialValue);
            case XSLT20Package.NAMETESTS:
                return createNametestsFromString(eDataType, initialValue);
            case XSLT20Package.NAMETESTS_ITEM:
                return createNametestsItemFromString(eDataType, initialValue);
            case XSLT20Package.NAMETESTS_ITEM_MEMBER1_OBJECT:
                return createNametestsItemMember1ObjectFromString(eDataType, initialValue);
            case XSLT20Package.NAMETESTS_ITEM_MEMBER2:
                return createNametestsItemMember2FromString(eDataType, initialValue);
            case XSLT20Package.PATTERN:
                return createPatternFromString(eDataType, initialValue);
            case XSLT20Package.PREFIXES:
                return createPrefixesFromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_LIST:
                return createPrefixListFromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_LIST_OR_ALL:
                return createPrefixListOrAllFromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_LIST_OR_ALL_MEMBER1_OBJECT:
                return createPrefixListOrAllMember1ObjectFromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_OR_DEFAULT:
                return createPrefixOrDefaultFromString(eDataType, initialValue);
            case XSLT20Package.PREFIX_OR_DEFAULT_MEMBER1_OBJECT:
                return createPrefixOrDefaultMember1ObjectFromString(eDataType, initialValue);
            case XSLT20Package.QNAME:
                return createQNameFromString(eDataType, initialValue);
            case XSLT20Package.QNAMES:
                return createQNamesFromString(eDataType, initialValue);
            case XSLT20Package.SEQUENCE_TYPE1:
                return createSequenceType1FromString(eDataType, initialValue);
            case XSLT20Package.TEXT_ELEMENT_BASE_TYPE_BASE:
                return createTextElementBaseTypeBaseFromString(eDataType, initialValue);
            case XSLT20Package.TEXT_ELEMENT_BASE_TYPE_BASE_BASE:
                return createTextElementBaseTypeBaseBaseFromString(eDataType, initialValue);
            case XSLT20Package.URI_LIST:
                return createUriListFromString(eDataType, initialValue);
            case XSLT20Package.VALIDATION_STRIP_OR_PRESERVE_OBJECT:
                return createValidationStripOrPreserveObjectFromString(eDataType, initialValue);
            case XSLT20Package.VALIDATION_TYPE_OBJECT:
                return createValidationTypeObjectFromString(eDataType, initialValue);
            case XSLT20Package.YES_OR_NO_OBJECT:
                return createYesOrNoObjectFromString(eDataType, initialValue);
            case XSLT20Package.YES_OR_NO_OR_OMIT_OBJECT:
                return createYesOrNoOrOmitObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case XSLT20Package.INPUT_TYPE_ANNOTATIONS_TYPE:
                return convertInputTypeAnnotationsTypeToString(eDataType, instanceValue);
            case XSLT20Package.LEVEL:
                return convertLevelToString(eDataType, instanceValue);
            case XSLT20Package.METHOD_MEMBER0:
                return convertMethodMember0ToString(eDataType, instanceValue);
            case XSLT20Package.MODE_MEMBER1:
                return convertModeMember1ToString(eDataType, instanceValue);
            case XSLT20Package.MODES_MEMBER0_ITEM_MEMBER1:
                return convertModesMember0ItemMember1ToString(eDataType, instanceValue);
            case XSLT20Package.MODES_MEMBER1:
                return convertModesMember1ToString(eDataType, instanceValue);
            case XSLT20Package.NAMETESTS_ITEM_MEMBER1:
                return convertNametestsItemMember1ToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_LIST_OR_ALL_MEMBER1:
                return convertPrefixListOrAllMember1ToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_OR_DEFAULT_MEMBER1:
                return convertPrefixOrDefaultMember1ToString(eDataType, instanceValue);
            case XSLT20Package.VALIDATION_STRIP_OR_PRESERVE:
                return convertValidationStripOrPreserveToString(eDataType, instanceValue);
            case XSLT20Package.VALIDATION_TYPE:
                return convertValidationTypeToString(eDataType, instanceValue);
            case XSLT20Package.YES_OR_NO:
                return convertYesOrNoToString(eDataType, instanceValue);
            case XSLT20Package.YES_OR_NO_OR_OMIT:
                return convertYesOrNoOrOmitToString(eDataType, instanceValue);
            case XSLT20Package.AVT:
                return convertAvtToString(eDataType, instanceValue);
            case XSLT20Package.CHAR:
                return convertCharToString(eDataType, instanceValue);
            case XSLT20Package.EXPRESSION:
                return convertExpressionToString(eDataType, instanceValue);
            case XSLT20Package.INPUT_TYPE_ANNOTATIONS_TYPE_OBJECT:
                return convertInputTypeAnnotationsTypeObjectToString(eDataType, instanceValue);
            case XSLT20Package.LEVEL_OBJECT:
                return convertLevelObjectToString(eDataType, instanceValue);
            case XSLT20Package.METHOD:
                return convertMethodToString(eDataType, instanceValue);
            case XSLT20Package.METHOD_MEMBER0_OBJECT:
                return convertMethodMember0ObjectToString(eDataType, instanceValue);
            case XSLT20Package.METHOD_MEMBER1:
                return convertMethodMember1ToString(eDataType, instanceValue);
            case XSLT20Package.MODE:
                return convertModeToString(eDataType, instanceValue);
            case XSLT20Package.MODE_MEMBER1_OBJECT:
                return convertModeMember1ObjectToString(eDataType, instanceValue);
            case XSLT20Package.MODES:
                return convertModesToString(eDataType, instanceValue);
            case XSLT20Package.MODES_MEMBER0:
                return convertModesMember0ToString(eDataType, instanceValue);
            case XSLT20Package.MODES_MEMBER0_ITEM:
                return convertModesMember0ItemToString(eDataType, instanceValue);
            case XSLT20Package.MODES_MEMBER0_ITEM_MEMBER1_OBJECT:
                return convertModesMember0ItemMember1ObjectToString(eDataType, instanceValue);
            case XSLT20Package.MODES_MEMBER1_OBJECT:
                return convertModesMember1ObjectToString(eDataType, instanceValue);
            case XSLT20Package.NAMETESTS:
                return convertNametestsToString(eDataType, instanceValue);
            case XSLT20Package.NAMETESTS_ITEM:
                return convertNametestsItemToString(eDataType, instanceValue);
            case XSLT20Package.NAMETESTS_ITEM_MEMBER1_OBJECT:
                return convertNametestsItemMember1ObjectToString(eDataType, instanceValue);
            case XSLT20Package.NAMETESTS_ITEM_MEMBER2:
                return convertNametestsItemMember2ToString(eDataType, instanceValue);
            case XSLT20Package.PATTERN:
                return convertPatternToString(eDataType, instanceValue);
            case XSLT20Package.PREFIXES:
                return convertPrefixesToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_LIST:
                return convertPrefixListToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_LIST_OR_ALL:
                return convertPrefixListOrAllToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_LIST_OR_ALL_MEMBER1_OBJECT:
                return convertPrefixListOrAllMember1ObjectToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_OR_DEFAULT:
                return convertPrefixOrDefaultToString(eDataType, instanceValue);
            case XSLT20Package.PREFIX_OR_DEFAULT_MEMBER1_OBJECT:
                return convertPrefixOrDefaultMember1ObjectToString(eDataType, instanceValue);
            case XSLT20Package.QNAME:
                return convertQNameToString(eDataType, instanceValue);
            case XSLT20Package.QNAMES:
                return convertQNamesToString(eDataType, instanceValue);
            case XSLT20Package.SEQUENCE_TYPE1:
                return convertSequenceType1ToString(eDataType, instanceValue);
            case XSLT20Package.TEXT_ELEMENT_BASE_TYPE_BASE:
                return convertTextElementBaseTypeBaseToString(eDataType, instanceValue);
            case XSLT20Package.TEXT_ELEMENT_BASE_TYPE_BASE_BASE:
                return convertTextElementBaseTypeBaseBaseToString(eDataType, instanceValue);
            case XSLT20Package.URI_LIST:
                return convertUriListToString(eDataType, instanceValue);
            case XSLT20Package.VALIDATION_STRIP_OR_PRESERVE_OBJECT:
                return convertValidationStripOrPreserveObjectToString(eDataType, instanceValue);
            case XSLT20Package.VALIDATION_TYPE_OBJECT:
                return convertValidationTypeObjectToString(eDataType, instanceValue);
            case XSLT20Package.YES_OR_NO_OBJECT:
                return convertYesOrNoObjectToString(eDataType, instanceValue);
            case XSLT20Package.YES_OR_NO_OR_OMIT_OBJECT:
                return convertYesOrNoOrOmitObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalyzeStringType createAnalyzeStringType() {
        AnalyzeStringTypeImpl analyzeStringType = new AnalyzeStringTypeImpl();
        return analyzeStringType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplyImportsType createApplyImportsType() {
        ApplyImportsTypeImpl applyImportsType = new ApplyImportsTypeImpl();
        return applyImportsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplyTemplatesType createApplyTemplatesType() {
        ApplyTemplatesTypeImpl applyTemplatesType = new ApplyTemplatesTypeImpl();
        return applyTemplatesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeSetType createAttributeSetType() {
        AttributeSetTypeImpl attributeSetType = new AttributeSetTypeImpl();
        return attributeSetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeType createAttributeType() {
        AttributeTypeImpl attributeType = new AttributeTypeImpl();
        return attributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallTemplateType createCallTemplateType() {
        CallTemplateTypeImpl callTemplateType = new CallTemplateTypeImpl();
        return callTemplateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterMapType createCharacterMapType() {
        CharacterMapTypeImpl characterMapType = new CharacterMapTypeImpl();
        return characterMapType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChooseType createChooseType() {
        ChooseTypeImpl chooseType = new ChooseTypeImpl();
        return chooseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommentType createCommentType() {
        CommentTypeImpl commentType = new CommentTypeImpl();
        return commentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyOfType createCopyOfType() {
        CopyOfTypeImpl copyOfType = new CopyOfTypeImpl();
        return copyOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyType createCopyType() {
        CopyTypeImpl copyType = new CopyTypeImpl();
        return copyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalFormatType createDecimalFormatType() {
        DecimalFormatTypeImpl decimalFormatType = new DecimalFormatTypeImpl();
        return decimalFormatType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentType createDocumentType() {
        DocumentTypeImpl documentType = new DocumentTypeImpl();
        return documentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementOnlyVersionedElementType createElementOnlyVersionedElementType() {
        ElementOnlyVersionedElementTypeImpl elementOnlyVersionedElementType = new ElementOnlyVersionedElementTypeImpl();
        return elementOnlyVersionedElementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementType createElementType() {
        ElementTypeImpl elementType = new ElementTypeImpl();
        return elementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForEachGroupType createForEachGroupType() {
        ForEachGroupTypeImpl forEachGroupType = new ForEachGroupTypeImpl();
        return forEachGroupType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForEachType createForEachType() {
        ForEachTypeImpl forEachType = new ForEachTypeImpl();
        return forEachType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionType createFunctionType() {
        FunctionTypeImpl functionType = new FunctionTypeImpl();
        return functionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericElementType createGenericElementType() {
        GenericElementTypeImpl genericElementType = new GenericElementTypeImpl();
        return genericElementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IfType createIfType() {
        IfTypeImpl ifType = new IfTypeImpl();
        return ifType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportSchemaType createImportSchemaType() {
        ImportSchemaTypeImpl importSchemaType = new ImportSchemaTypeImpl();
        return importSchemaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportType createImportType() {
        ImportTypeImpl importType = new ImportTypeImpl();
        return importType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncludeType createIncludeType() {
        IncludeTypeImpl includeType = new IncludeTypeImpl();
        return includeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeyType createKeyType() {
        KeyTypeImpl keyType = new KeyTypeImpl();
        return keyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageType createMessageType() {
        MessageTypeImpl messageType = new MessageTypeImpl();
        return messageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespaceAliasType createNamespaceAliasType() {
        NamespaceAliasTypeImpl namespaceAliasType = new NamespaceAliasTypeImpl();
        return namespaceAliasType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespaceType createNamespaceType() {
        NamespaceTypeImpl namespaceType = new NamespaceTypeImpl();
        return namespaceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NextMatchType createNextMatchType() {
        NextMatchTypeImpl nextMatchType = new NextMatchTypeImpl();
        return nextMatchType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumberType createNumberType() {
        NumberTypeImpl numberType = new NumberTypeImpl();
        return numberType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputCharacterType createOutputCharacterType() {
        OutputCharacterTypeImpl outputCharacterType = new OutputCharacterTypeImpl();
        return outputCharacterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputType createOutputType() {
        OutputTypeImpl outputType = new OutputTypeImpl();
        return outputType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParamType createParamType() {
        ParamTypeImpl paramType = new ParamTypeImpl();
        return paramType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerformSortType createPerformSortType() {
        PerformSortTypeImpl performSortType = new PerformSortTypeImpl();
        return performSortType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PreserveSpaceType createPreserveSpaceType() {
        PreserveSpaceTypeImpl preserveSpaceType = new PreserveSpaceTypeImpl();
        return preserveSpaceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingInstructionType createProcessingInstructionType() {
        ProcessingInstructionTypeImpl processingInstructionType = new ProcessingInstructionTypeImpl();
        return processingInstructionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultDocumentType createResultDocumentType() {
        ResultDocumentTypeImpl resultDocumentType = new ResultDocumentTypeImpl();
        return resultDocumentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor createSequenceConstructor() {
        SequenceConstructorImpl sequenceConstructor = new SequenceConstructorImpl();
        return sequenceConstructor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceType createSequenceType() {
        SequenceTypeImpl sequenceType = new SequenceTypeImpl();
        return sequenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SortType createSortType() {
        SortTypeImpl sortType = new SortTypeImpl();
        return sortType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StripSpaceType createStripSpaceType() {
        StripSpaceTypeImpl stripSpaceType = new StripSpaceTypeImpl();
        return stripSpaceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateType createTemplateType() {
        TemplateTypeImpl templateType = new TemplateTypeImpl();
        return templateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextElementBaseType createTextElementBaseType() {
        TextElementBaseTypeImpl textElementBaseType = new TextElementBaseTypeImpl();
        return textElementBaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextType createTextType() {
        TextTypeImpl textType = new TextTypeImpl();
        return textType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformElementBaseType createTransformElementBaseType() {
        TransformElementBaseTypeImpl transformElementBaseType = new TransformElementBaseTypeImpl();
        return transformElementBaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformType createTransformType() {
        TransformTypeImpl transformType = new TransformTypeImpl();
        return transformType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueOfType createValueOfType() {
        ValueOfTypeImpl valueOfType = new ValueOfTypeImpl();
        return valueOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableType createVariableType() {
        VariableTypeImpl variableType = new VariableTypeImpl();
        return variableType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VersionedElementType createVersionedElementType() {
        VersionedElementTypeImpl versionedElementType = new VersionedElementTypeImpl();
        return versionedElementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WhenType createWhenType() {
        WhenTypeImpl whenType = new WhenTypeImpl();
        return whenType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WithParamType createWithParamType() {
        WithParamTypeImpl withParamType = new WithParamTypeImpl();
        return withParamType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputTypeAnnotationsType createInputTypeAnnotationsTypeFromString(EDataType eDataType, String initialValue) {
        InputTypeAnnotationsType result = InputTypeAnnotationsType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInputTypeAnnotationsTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Level createLevelFromString(EDataType eDataType, String initialValue) {
        Level result = Level.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLevelToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodMember0 createMethodMember0FromString(EDataType eDataType, String initialValue) {
        MethodMember0 result = MethodMember0.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodMember0ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeMember1 createModeMember1FromString(EDataType eDataType, String initialValue) {
        ModeMember1 result = ModeMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModesMember0ItemMember1 createModesMember0ItemMember1FromString(EDataType eDataType, String initialValue) {
        ModesMember0ItemMember1 result = ModesMember0ItemMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesMember0ItemMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModesMember1 createModesMember1FromString(EDataType eDataType, String initialValue) {
        ModesMember1 result = ModesMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NametestsItemMember1 createNametestsItemMember1FromString(EDataType eDataType, String initialValue) {
        NametestsItemMember1 result = NametestsItemMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNametestsItemMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrefixListOrAllMember1 createPrefixListOrAllMember1FromString(EDataType eDataType, String initialValue) {
        PrefixListOrAllMember1 result = PrefixListOrAllMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixListOrAllMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrefixOrDefaultMember1 createPrefixOrDefaultMember1FromString(EDataType eDataType, String initialValue) {
        PrefixOrDefaultMember1 result = PrefixOrDefaultMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixOrDefaultMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationStripOrPreserve createValidationStripOrPreserveFromString(EDataType eDataType, String initialValue) {
        ValidationStripOrPreserve result = ValidationStripOrPreserve.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValidationStripOrPreserveToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationType createValidationTypeFromString(EDataType eDataType, String initialValue) {
        ValidationType result = ValidationType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValidationTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNo createYesOrNoFromString(EDataType eDataType, String initialValue) {
        YesOrNo result = YesOrNo.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesOrNoToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNoOrOmit createYesOrNoOrOmitFromString(EDataType eDataType, String initialValue) {
        YesOrNoOrOmit result = YesOrNoOrOmit.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesOrNoOrOmitToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createAvtFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAvtToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createCharFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCharToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createExpressionFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpressionToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputTypeAnnotationsType createInputTypeAnnotationsTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createInputTypeAnnotationsTypeFromString(XSLT20Package.Literals.INPUT_TYPE_ANNOTATIONS_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInputTypeAnnotationsTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertInputTypeAnnotationsTypeToString(XSLT20Package.Literals.INPUT_TYPE_ANNOTATIONS_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Level createLevelObjectFromString(EDataType eDataType, String initialValue) {
        return createLevelFromString(XSLT20Package.Literals.LEVEL, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLevelObjectToString(EDataType eDataType, Object instanceValue) {
        return convertLevelToString(XSLT20Package.Literals.LEVEL, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createMethodFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createMethodMember0FromString(XSLT20Package.Literals.METHOD_MEMBER0, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createMethodMember1FromString(XSLT20Package.Literals.METHOD_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XSLT20Package.Literals.METHOD_MEMBER0.isInstance(instanceValue)) {
            try {
                String value = convertMethodMember0ToString(XSLT20Package.Literals.METHOD_MEMBER0, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.METHOD_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertMethodMember1ToString(XSLT20Package.Literals.METHOD_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodMember0 createMethodMember0ObjectFromString(EDataType eDataType, String initialValue) {
        return createMethodMember0FromString(XSLT20Package.Literals.METHOD_MEMBER0, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodMember0ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMethodMember0ToString(XSLT20Package.Literals.METHOD_MEMBER0, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createMethodMember1FromString(EDataType eDataType, String initialValue) {
        return createQNameFromString(XSLT20Package.Literals.QNAME, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodMember1ToString(EDataType eDataType, Object instanceValue) {
        return convertQNameToString(XSLT20Package.Literals.QNAME, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createModeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createQNameFromString(XSLT20Package.Literals.QNAME, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createModeMember1FromString(XSLT20Package.Literals.MODE_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XSLT20Package.Literals.QNAME.isInstance(instanceValue)) {
            try {
                String value = convertQNameToString(XSLT20Package.Literals.QNAME, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.MODE_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertModeMember1ToString(XSLT20Package.Literals.MODE_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeMember1 createModeMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createModeMember1FromString(XSLT20Package.Literals.MODE_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertModeMember1ToString(XSLT20Package.Literals.MODE_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createModesFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createModesMember0FromString(XSLT20Package.Literals.MODES_MEMBER0, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createModesMember1FromString(XSLT20Package.Literals.MODES_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XSLT20Package.Literals.MODES_MEMBER0.isInstance(instanceValue)) {
            try {
                String value = convertModesMember0ToString(XSLT20Package.Literals.MODES_MEMBER0, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.MODES_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertModesMember1ToString(XSLT20Package.Literals.MODES_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createModesMember0FromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<Object> result = new ArrayList<Object>();
        for (String item : split(initialValue)) {
            result.add(createModesMember0ItemFromString(XSLT20Package.Literals.MODES_MEMBER0_ITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesMember0ToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertModesMember0ItemToString(XSLT20Package.Literals.MODES_MEMBER0_ITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createModesMember0ItemFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createQNameFromString(XSLT20Package.Literals.QNAME, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createModesMember0ItemMember1FromString(XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesMember0ItemToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XSLT20Package.Literals.QNAME.isInstance(instanceValue)) {
            try {
                String value = convertQNameToString(XSLT20Package.Literals.QNAME, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertModesMember0ItemMember1ToString(XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModesMember0ItemMember1 createModesMember0ItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createModesMember0ItemMember1FromString(XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesMember0ItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertModesMember0ItemMember1ToString(XSLT20Package.Literals.MODES_MEMBER0_ITEM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModesMember1 createModesMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createModesMember1FromString(XSLT20Package.Literals.MODES_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModesMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertModesMember1ToString(XSLT20Package.Literals.MODES_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createNametestsFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<Object> result = new ArrayList<Object>();
        for (String item : split(initialValue)) {
            result.add(createNametestsItemFromString(XSLT20Package.Literals.NAMETESTS_ITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNametestsToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertNametestsItemToString(XSLT20Package.Literals.NAMETESTS_ITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createNametestsItemFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createQNameFromString(XSLT20Package.Literals.QNAME, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createNametestsItemMember1FromString(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createNametestsItemMember2FromString(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER2, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNametestsItemToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XSLT20Package.Literals.QNAME.isInstance(instanceValue)) {
            try {
                String value = convertQNameToString(XSLT20Package.Literals.QNAME, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertNametestsItemMember1ToString(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER2.isInstance(instanceValue)) {
            try {
                String value = convertNametestsItemMember2ToString(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER2, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NametestsItemMember1 createNametestsItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createNametestsItemMember1FromString(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNametestsItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertNametestsItemMember1ToString(XSLT20Package.Literals.NAMETESTS_ITEM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createNametestsItemMember2FromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNametestsItemMember2ToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createPatternFromString(EDataType eDataType, String initialValue) {
        return createExpressionFromString(XSLT20Package.Literals.EXPRESSION, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPatternToString(EDataType eDataType, Object instanceValue) {
        return convertExpressionToString(XSLT20Package.Literals.EXPRESSION, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> createPrefixesFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<String> result = new ArrayList<String>();
        for (String item : split(initialValue)) {
            result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixesToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createPrefixListFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<Object> result = new ArrayList<Object>();
        for (String item : split(initialValue)) {
            result.add(createPrefixOrDefaultFromString(XSLT20Package.Literals.PREFIX_OR_DEFAULT, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixListToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertPrefixOrDefaultToString(XSLT20Package.Literals.PREFIX_OR_DEFAULT, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createPrefixListOrAllFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createPrefixListFromString(XSLT20Package.Literals.PREFIX_LIST, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createPrefixListOrAllMember1FromString(XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixListOrAllToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XSLT20Package.Literals.PREFIX_LIST.isInstance(instanceValue)) {
            try {
                String value = convertPrefixListToString(XSLT20Package.Literals.PREFIX_LIST, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertPrefixListOrAllMember1ToString(XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrefixListOrAllMember1 createPrefixListOrAllMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createPrefixListOrAllMember1FromString(XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixListOrAllMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPrefixListOrAllMember1ToString(XSLT20Package.Literals.PREFIX_LIST_OR_ALL_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createPrefixOrDefaultFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createPrefixOrDefaultMember1FromString(XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixOrDefaultToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.NC_NAME.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertPrefixOrDefaultMember1ToString(XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrefixOrDefaultMember1 createPrefixOrDefaultMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createPrefixOrDefaultMember1FromString(XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPrefixOrDefaultMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPrefixOrDefaultMember1ToString(XSLT20Package.Literals.PREFIX_OR_DEFAULT_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createQNameFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQNameToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> createQNamesFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<String> result = new ArrayList<String>();
        for (String item : split(initialValue)) {
            result.add(createQNameFromString(XSLT20Package.Literals.QNAME, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQNamesToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertQNameToString(XSLT20Package.Literals.QNAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createSequenceType1FromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSequenceType1ToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTextElementBaseTypeBaseFromString(EDataType eDataType, String initialValue) {
        return createTextElementBaseTypeBaseBaseFromString(XSLT20Package.Literals.TEXT_ELEMENT_BASE_TYPE_BASE_BASE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTextElementBaseTypeBaseToString(EDataType eDataType, Object instanceValue) {
        return convertTextElementBaseTypeBaseBaseToString(XSLT20Package.Literals.TEXT_ELEMENT_BASE_TYPE_BASE_BASE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTextElementBaseTypeBaseBaseFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTextElementBaseTypeBaseBaseToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> createUriListFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<String> result = new ArrayList<String>();
        for (String item : split(initialValue)) {
            result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUriListToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationStripOrPreserve createValidationStripOrPreserveObjectFromString(EDataType eDataType, String initialValue) {
        return createValidationStripOrPreserveFromString(XSLT20Package.Literals.VALIDATION_STRIP_OR_PRESERVE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValidationStripOrPreserveObjectToString(EDataType eDataType, Object instanceValue) {
        return convertValidationStripOrPreserveToString(XSLT20Package.Literals.VALIDATION_STRIP_OR_PRESERVE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationType createValidationTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createValidationTypeFromString(XSLT20Package.Literals.VALIDATION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValidationTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertValidationTypeToString(XSLT20Package.Literals.VALIDATION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNo createYesOrNoObjectFromString(EDataType eDataType, String initialValue) {
        return createYesOrNoFromString(XSLT20Package.Literals.YES_OR_NO, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesOrNoObjectToString(EDataType eDataType, Object instanceValue) {
        return convertYesOrNoToString(XSLT20Package.Literals.YES_OR_NO, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNoOrOmit createYesOrNoOrOmitObjectFromString(EDataType eDataType, String initialValue) {
        return createYesOrNoOrOmitFromString(XSLT20Package.Literals.YES_OR_NO_OR_OMIT, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesOrNoOrOmitObjectToString(EDataType eDataType, Object instanceValue) {
        return convertYesOrNoOrOmitToString(XSLT20Package.Literals.YES_OR_NO_OR_OMIT, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XSLT20Package getXSLT20Package() {
        return (XSLT20Package)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static XSLT20Package getPackage() {
        return XSLT20Package.eINSTANCE;
    }

} //XSLT20FactoryImpl
