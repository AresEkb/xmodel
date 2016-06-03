/**
 */
package org.w3._1999.xsl.transform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import org.w3._1999.xsl.transform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Package
 * @generated
 */
public class XSLT20Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XSLT20Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLT20Switch() {
		if (modelPackage == null) {
			modelPackage = XSLT20Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XSLT20Package.ANALYZE_STRING_TYPE: {
				AnalyzeStringType analyzeStringType = (AnalyzeStringType)theEObject;
				T result = caseAnalyzeStringType(analyzeStringType);
				if (result == null) result = caseElementOnlyVersionedElementType(analyzeStringType);
				if (result == null) result = caseVersionedElementType(analyzeStringType);
				if (result == null) result = caseGenericElementType(analyzeStringType);
				if (result == null) result = caseXMLTypeDocumentRoot(analyzeStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.APPLY_IMPORTS_TYPE: {
				ApplyImportsType applyImportsType = (ApplyImportsType)theEObject;
				T result = caseApplyImportsType(applyImportsType);
				if (result == null) result = caseElementOnlyVersionedElementType(applyImportsType);
				if (result == null) result = caseVersionedElementType(applyImportsType);
				if (result == null) result = caseGenericElementType(applyImportsType);
				if (result == null) result = caseXMLTypeDocumentRoot(applyImportsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.APPLY_TEMPLATES_TYPE: {
				ApplyTemplatesType applyTemplatesType = (ApplyTemplatesType)theEObject;
				T result = caseApplyTemplatesType(applyTemplatesType);
				if (result == null) result = caseElementOnlyVersionedElementType(applyTemplatesType);
				if (result == null) result = caseVersionedElementType(applyTemplatesType);
				if (result == null) result = caseGenericElementType(applyTemplatesType);
				if (result == null) result = caseXMLTypeDocumentRoot(applyTemplatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.ATTRIBUTE_SET_TYPE: {
				AttributeSetType attributeSetType = (AttributeSetType)theEObject;
				T result = caseAttributeSetType(attributeSetType);
				if (result == null) result = caseElementOnlyVersionedElementType(attributeSetType);
				if (result == null) result = caseVersionedElementType(attributeSetType);
				if (result == null) result = caseGenericElementType(attributeSetType);
				if (result == null) result = caseXMLTypeDocumentRoot(attributeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = caseSequenceConstructor(attributeType);
				if (result == null) result = caseVersionedElementType(attributeType);
				if (result == null) result = caseGenericElementType(attributeType);
				if (result == null) result = caseXMLTypeDocumentRoot(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.CALL_TEMPLATE_TYPE: {
				CallTemplateType callTemplateType = (CallTemplateType)theEObject;
				T result = caseCallTemplateType(callTemplateType);
				if (result == null) result = caseElementOnlyVersionedElementType(callTemplateType);
				if (result == null) result = caseVersionedElementType(callTemplateType);
				if (result == null) result = caseGenericElementType(callTemplateType);
				if (result == null) result = caseXMLTypeDocumentRoot(callTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.CHARACTER_MAP_TYPE: {
				CharacterMapType characterMapType = (CharacterMapType)theEObject;
				T result = caseCharacterMapType(characterMapType);
				if (result == null) result = caseElementOnlyVersionedElementType(characterMapType);
				if (result == null) result = caseVersionedElementType(characterMapType);
				if (result == null) result = caseGenericElementType(characterMapType);
				if (result == null) result = caseXMLTypeDocumentRoot(characterMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.CHOOSE_TYPE: {
				ChooseType chooseType = (ChooseType)theEObject;
				T result = caseChooseType(chooseType);
				if (result == null) result = caseElementOnlyVersionedElementType(chooseType);
				if (result == null) result = caseVersionedElementType(chooseType);
				if (result == null) result = caseGenericElementType(chooseType);
				if (result == null) result = caseXMLTypeDocumentRoot(chooseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.COMMENT_TYPE: {
				CommentType commentType = (CommentType)theEObject;
				T result = caseCommentType(commentType);
				if (result == null) result = caseSequenceConstructor(commentType);
				if (result == null) result = caseVersionedElementType(commentType);
				if (result == null) result = caseGenericElementType(commentType);
				if (result == null) result = caseXMLTypeDocumentRoot(commentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.COPY_OF_TYPE: {
				CopyOfType copyOfType = (CopyOfType)theEObject;
				T result = caseCopyOfType(copyOfType);
				if (result == null) result = caseVersionedElementType(copyOfType);
				if (result == null) result = caseGenericElementType(copyOfType);
				if (result == null) result = caseXMLTypeDocumentRoot(copyOfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.COPY_TYPE: {
				CopyType copyType = (CopyType)theEObject;
				T result = caseCopyType(copyType);
				if (result == null) result = caseSequenceConstructor(copyType);
				if (result == null) result = caseVersionedElementType(copyType);
				if (result == null) result = caseGenericElementType(copyType);
				if (result == null) result = caseXMLTypeDocumentRoot(copyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.DECIMAL_FORMAT_TYPE: {
				DecimalFormatType decimalFormatType = (DecimalFormatType)theEObject;
				T result = caseDecimalFormatType(decimalFormatType);
				if (result == null) result = caseElementOnlyVersionedElementType(decimalFormatType);
				if (result == null) result = caseVersionedElementType(decimalFormatType);
				if (result == null) result = caseGenericElementType(decimalFormatType);
				if (result == null) result = caseXMLTypeDocumentRoot(decimalFormatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.DOCUMENT_TYPE: {
				DocumentType documentType = (DocumentType)theEObject;
				T result = caseDocumentType(documentType);
				if (result == null) result = caseSequenceConstructor(documentType);
				if (result == null) result = caseVersionedElementType(documentType);
				if (result == null) result = caseGenericElementType(documentType);
				if (result == null) result = caseXMLTypeDocumentRoot(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE: {
				ElementOnlyVersionedElementType elementOnlyVersionedElementType = (ElementOnlyVersionedElementType)theEObject;
				T result = caseElementOnlyVersionedElementType(elementOnlyVersionedElementType);
				if (result == null) result = caseVersionedElementType(elementOnlyVersionedElementType);
				if (result == null) result = caseGenericElementType(elementOnlyVersionedElementType);
				if (result == null) result = caseXMLTypeDocumentRoot(elementOnlyVersionedElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = caseSequenceConstructor(elementType);
				if (result == null) result = caseVersionedElementType(elementType);
				if (result == null) result = caseGenericElementType(elementType);
				if (result == null) result = caseXMLTypeDocumentRoot(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.FOR_EACH_GROUP_TYPE: {
				ForEachGroupType forEachGroupType = (ForEachGroupType)theEObject;
				T result = caseForEachGroupType(forEachGroupType);
				if (result == null) result = caseVersionedElementType(forEachGroupType);
				if (result == null) result = caseGenericElementType(forEachGroupType);
				if (result == null) result = caseXMLTypeDocumentRoot(forEachGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.FOR_EACH_TYPE: {
				ForEachType forEachType = (ForEachType)theEObject;
				T result = caseForEachType(forEachType);
				if (result == null) result = caseVersionedElementType(forEachType);
				if (result == null) result = caseGenericElementType(forEachType);
				if (result == null) result = caseXMLTypeDocumentRoot(forEachType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseVersionedElementType(functionType);
				if (result == null) result = caseGenericElementType(functionType);
				if (result == null) result = caseXMLTypeDocumentRoot(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.GENERIC_ELEMENT_TYPE: {
				GenericElementType genericElementType = (GenericElementType)theEObject;
				T result = caseGenericElementType(genericElementType);
				if (result == null) result = caseXMLTypeDocumentRoot(genericElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.IF_TYPE: {
				IfType ifType = (IfType)theEObject;
				T result = caseIfType(ifType);
				if (result == null) result = caseSequenceConstructor(ifType);
				if (result == null) result = caseVersionedElementType(ifType);
				if (result == null) result = caseGenericElementType(ifType);
				if (result == null) result = caseXMLTypeDocumentRoot(ifType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.IMPORT_SCHEMA_TYPE: {
				ImportSchemaType importSchemaType = (ImportSchemaType)theEObject;
				T result = caseImportSchemaType(importSchemaType);
				if (result == null) result = caseElementOnlyVersionedElementType(importSchemaType);
				if (result == null) result = caseVersionedElementType(importSchemaType);
				if (result == null) result = caseGenericElementType(importSchemaType);
				if (result == null) result = caseXMLTypeDocumentRoot(importSchemaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.IMPORT_TYPE: {
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = caseElementOnlyVersionedElementType(importType);
				if (result == null) result = caseVersionedElementType(importType);
				if (result == null) result = caseGenericElementType(importType);
				if (result == null) result = caseXMLTypeDocumentRoot(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.INCLUDE_TYPE: {
				IncludeType includeType = (IncludeType)theEObject;
				T result = caseIncludeType(includeType);
				if (result == null) result = caseElementOnlyVersionedElementType(includeType);
				if (result == null) result = caseVersionedElementType(includeType);
				if (result == null) result = caseGenericElementType(includeType);
				if (result == null) result = caseXMLTypeDocumentRoot(includeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.KEY_TYPE: {
				KeyType keyType = (KeyType)theEObject;
				T result = caseKeyType(keyType);
				if (result == null) result = caseSequenceConstructor(keyType);
				if (result == null) result = caseVersionedElementType(keyType);
				if (result == null) result = caseGenericElementType(keyType);
				if (result == null) result = caseXMLTypeDocumentRoot(keyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.MESSAGE_TYPE: {
				MessageType messageType = (MessageType)theEObject;
				T result = caseMessageType(messageType);
				if (result == null) result = caseSequenceConstructor(messageType);
				if (result == null) result = caseVersionedElementType(messageType);
				if (result == null) result = caseGenericElementType(messageType);
				if (result == null) result = caseXMLTypeDocumentRoot(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.NAMESPACE_ALIAS_TYPE: {
				NamespaceAliasType namespaceAliasType = (NamespaceAliasType)theEObject;
				T result = caseNamespaceAliasType(namespaceAliasType);
				if (result == null) result = caseElementOnlyVersionedElementType(namespaceAliasType);
				if (result == null) result = caseVersionedElementType(namespaceAliasType);
				if (result == null) result = caseGenericElementType(namespaceAliasType);
				if (result == null) result = caseXMLTypeDocumentRoot(namespaceAliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.NAMESPACE_TYPE: {
				NamespaceType namespaceType = (NamespaceType)theEObject;
				T result = caseNamespaceType(namespaceType);
				if (result == null) result = caseSequenceConstructor(namespaceType);
				if (result == null) result = caseVersionedElementType(namespaceType);
				if (result == null) result = caseGenericElementType(namespaceType);
				if (result == null) result = caseXMLTypeDocumentRoot(namespaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.NEXT_MATCH_TYPE: {
				NextMatchType nextMatchType = (NextMatchType)theEObject;
				T result = caseNextMatchType(nextMatchType);
				if (result == null) result = caseElementOnlyVersionedElementType(nextMatchType);
				if (result == null) result = caseVersionedElementType(nextMatchType);
				if (result == null) result = caseGenericElementType(nextMatchType);
				if (result == null) result = caseXMLTypeDocumentRoot(nextMatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.NUMBER_TYPE: {
				NumberType numberType = (NumberType)theEObject;
				T result = caseNumberType(numberType);
				if (result == null) result = caseVersionedElementType(numberType);
				if (result == null) result = caseGenericElementType(numberType);
				if (result == null) result = caseXMLTypeDocumentRoot(numberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.OUTPUT_CHARACTER_TYPE: {
				OutputCharacterType outputCharacterType = (OutputCharacterType)theEObject;
				T result = caseOutputCharacterType(outputCharacterType);
				if (result == null) result = caseElementOnlyVersionedElementType(outputCharacterType);
				if (result == null) result = caseVersionedElementType(outputCharacterType);
				if (result == null) result = caseGenericElementType(outputCharacterType);
				if (result == null) result = caseXMLTypeDocumentRoot(outputCharacterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.OUTPUT_TYPE: {
				OutputType outputType = (OutputType)theEObject;
				T result = caseOutputType(outputType);
				if (result == null) result = caseGenericElementType(outputType);
				if (result == null) result = caseXMLTypeDocumentRoot(outputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = caseSequenceConstructor(paramType);
				if (result == null) result = caseVersionedElementType(paramType);
				if (result == null) result = caseGenericElementType(paramType);
				if (result == null) result = caseXMLTypeDocumentRoot(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.PERFORM_SORT_TYPE: {
				PerformSortType performSortType = (PerformSortType)theEObject;
				T result = casePerformSortType(performSortType);
				if (result == null) result = caseVersionedElementType(performSortType);
				if (result == null) result = caseGenericElementType(performSortType);
				if (result == null) result = caseXMLTypeDocumentRoot(performSortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.PRESERVE_SPACE_TYPE: {
				PreserveSpaceType preserveSpaceType = (PreserveSpaceType)theEObject;
				T result = casePreserveSpaceType(preserveSpaceType);
				if (result == null) result = caseElementOnlyVersionedElementType(preserveSpaceType);
				if (result == null) result = caseVersionedElementType(preserveSpaceType);
				if (result == null) result = caseGenericElementType(preserveSpaceType);
				if (result == null) result = caseXMLTypeDocumentRoot(preserveSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.PROCESSING_INSTRUCTION_TYPE: {
				ProcessingInstructionType processingInstructionType = (ProcessingInstructionType)theEObject;
				T result = caseProcessingInstructionType(processingInstructionType);
				if (result == null) result = caseSequenceConstructor(processingInstructionType);
				if (result == null) result = caseVersionedElementType(processingInstructionType);
				if (result == null) result = caseGenericElementType(processingInstructionType);
				if (result == null) result = caseXMLTypeDocumentRoot(processingInstructionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.RESULT_DOCUMENT_TYPE: {
				ResultDocumentType resultDocumentType = (ResultDocumentType)theEObject;
				T result = caseResultDocumentType(resultDocumentType);
				if (result == null) result = caseSequenceConstructor(resultDocumentType);
				if (result == null) result = caseVersionedElementType(resultDocumentType);
				if (result == null) result = caseGenericElementType(resultDocumentType);
				if (result == null) result = caseXMLTypeDocumentRoot(resultDocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.SEQUENCE_CONSTRUCTOR: {
				SequenceConstructor sequenceConstructor = (SequenceConstructor)theEObject;
				T result = caseSequenceConstructor(sequenceConstructor);
				if (result == null) result = caseVersionedElementType(sequenceConstructor);
				if (result == null) result = caseGenericElementType(sequenceConstructor);
				if (result == null) result = caseXMLTypeDocumentRoot(sequenceConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseElementOnlyVersionedElementType(sequenceType);
				if (result == null) result = caseVersionedElementType(sequenceType);
				if (result == null) result = caseGenericElementType(sequenceType);
				if (result == null) result = caseXMLTypeDocumentRoot(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.SORT_TYPE: {
				SortType sortType = (SortType)theEObject;
				T result = caseSortType(sortType);
				if (result == null) result = caseSequenceConstructor(sortType);
				if (result == null) result = caseVersionedElementType(sortType);
				if (result == null) result = caseGenericElementType(sortType);
				if (result == null) result = caseXMLTypeDocumentRoot(sortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.STRIP_SPACE_TYPE: {
				StripSpaceType stripSpaceType = (StripSpaceType)theEObject;
				T result = caseStripSpaceType(stripSpaceType);
				if (result == null) result = caseElementOnlyVersionedElementType(stripSpaceType);
				if (result == null) result = caseVersionedElementType(stripSpaceType);
				if (result == null) result = caseGenericElementType(stripSpaceType);
				if (result == null) result = caseXMLTypeDocumentRoot(stripSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.TEMPLATE_TYPE: {
				TemplateType templateType = (TemplateType)theEObject;
				T result = caseTemplateType(templateType);
				if (result == null) result = caseVersionedElementType(templateType);
				if (result == null) result = caseGenericElementType(templateType);
				if (result == null) result = caseXMLTypeDocumentRoot(templateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.TEXT_ELEMENT_BASE_TYPE: {
				TextElementBaseType textElementBaseType = (TextElementBaseType)theEObject;
				T result = caseTextElementBaseType(textElementBaseType);
				if (result == null) result = caseVersionedElementType(textElementBaseType);
				if (result == null) result = caseGenericElementType(textElementBaseType);
				if (result == null) result = caseXMLTypeDocumentRoot(textElementBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.TEXT_TYPE: {
				TextType textType = (TextType)theEObject;
				T result = caseTextType(textType);
				if (result == null) result = caseTextElementBaseType(textType);
				if (result == null) result = caseVersionedElementType(textType);
				if (result == null) result = caseGenericElementType(textType);
				if (result == null) result = caseXMLTypeDocumentRoot(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.TRANSFORM_ELEMENT_BASE_TYPE: {
				TransformElementBaseType transformElementBaseType = (TransformElementBaseType)theEObject;
				T result = caseTransformElementBaseType(transformElementBaseType);
				if (result == null) result = caseElementOnlyVersionedElementType(transformElementBaseType);
				if (result == null) result = caseVersionedElementType(transformElementBaseType);
				if (result == null) result = caseGenericElementType(transformElementBaseType);
				if (result == null) result = caseXMLTypeDocumentRoot(transformElementBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.TRANSFORM_TYPE: {
				TransformType transformType = (TransformType)theEObject;
				T result = caseTransformType(transformType);
				if (result == null) result = caseTransformElementBaseType(transformType);
				if (result == null) result = caseElementOnlyVersionedElementType(transformType);
				if (result == null) result = caseVersionedElementType(transformType);
				if (result == null) result = caseGenericElementType(transformType);
				if (result == null) result = caseXMLTypeDocumentRoot(transformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.VALUE_OF_TYPE: {
				ValueOfType valueOfType = (ValueOfType)theEObject;
				T result = caseValueOfType(valueOfType);
				if (result == null) result = caseSequenceConstructor(valueOfType);
				if (result == null) result = caseVersionedElementType(valueOfType);
				if (result == null) result = caseGenericElementType(valueOfType);
				if (result == null) result = caseXMLTypeDocumentRoot(valueOfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = caseSequenceConstructor(variableType);
				if (result == null) result = caseVersionedElementType(variableType);
				if (result == null) result = caseGenericElementType(variableType);
				if (result == null) result = caseXMLTypeDocumentRoot(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.VERSIONED_ELEMENT_TYPE: {
				VersionedElementType versionedElementType = (VersionedElementType)theEObject;
				T result = caseVersionedElementType(versionedElementType);
				if (result == null) result = caseGenericElementType(versionedElementType);
				if (result == null) result = caseXMLTypeDocumentRoot(versionedElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.WHEN_TYPE: {
				WhenType whenType = (WhenType)theEObject;
				T result = caseWhenType(whenType);
				if (result == null) result = caseSequenceConstructor(whenType);
				if (result == null) result = caseVersionedElementType(whenType);
				if (result == null) result = caseGenericElementType(whenType);
				if (result == null) result = caseXMLTypeDocumentRoot(whenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSLT20Package.WITH_PARAM_TYPE: {
				WithParamType withParamType = (WithParamType)theEObject;
				T result = caseWithParamType(withParamType);
				if (result == null) result = caseSequenceConstructor(withParamType);
				if (result == null) result = caseVersionedElementType(withParamType);
				if (result == null) result = caseGenericElementType(withParamType);
				if (result == null) result = caseXMLTypeDocumentRoot(withParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analyze String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analyze String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyzeStringType(AnalyzeStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Imports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Imports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyImportsType(ApplyImportsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Templates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Templates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyTemplatesType(ApplyTemplatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSetType(AttributeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallTemplateType(CallTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterMapType(CharacterMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choose Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choose Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChooseType(ChooseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentType(CommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Of Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyOfType(CopyOfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyType(CopyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Format Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalFormatType(DecimalFormatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Only Versioned Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Only Versioned Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementOnlyVersionedElementType(ElementOnlyVersionedElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachGroupType(ForEachGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachType(ForEachType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElementType(GenericElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfType(IfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Schema Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportSchemaType(ImportSchemaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeType(IncludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyType(KeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAliasType(NamespaceAliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceType(NamespaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Match Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Match Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextMatchType(NextMatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberType(NumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Character Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputCharacterType(OutputCharacterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType(OutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Sort Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Sort Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformSortType(PerformSortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preserve Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preserve Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreserveSpaceType(PreserveSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Instruction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Instruction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingInstructionType(ProcessingInstructionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultDocumentType(ResultDocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceConstructor(SequenceConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortType(SortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strip Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strip Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStripSpaceType(StripSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateType(TemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElementBaseType(TextElementBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Element Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Element Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformElementBaseType(TransformElementBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformType(TransformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Of Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueOfType(ValueOfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedElementType(VersionedElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenType(WhenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>With Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>With Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithParamType(WithParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTypeDocumentRoot(XMLTypeDocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XSLT20Switch
