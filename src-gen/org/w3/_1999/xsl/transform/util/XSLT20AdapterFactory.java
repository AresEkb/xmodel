/**
 */
package org.w3._1999.xsl.transform.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._1999.xsl.transform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Package
 * @generated
 */
public class XSLT20AdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XSLT20Package modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XSLT20AdapterFactory() {
        if (modelPackage == null) {
            modelPackage = XSLT20Package.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XSLT20Switch<Adapter> modelSwitch =
        new XSLT20Switch<Adapter>() {
            @Override
            public Adapter caseAnalyzeStringType(AnalyzeStringType object) {
                return createAnalyzeStringTypeAdapter();
            }
            @Override
            public Adapter caseApplyImportsType(ApplyImportsType object) {
                return createApplyImportsTypeAdapter();
            }
            @Override
            public Adapter caseApplyTemplatesType(ApplyTemplatesType object) {
                return createApplyTemplatesTypeAdapter();
            }
            @Override
            public Adapter caseAttributeSetType(AttributeSetType object) {
                return createAttributeSetTypeAdapter();
            }
            @Override
            public Adapter caseAttributeType(AttributeType object) {
                return createAttributeTypeAdapter();
            }
            @Override
            public Adapter caseCallTemplateType(CallTemplateType object) {
                return createCallTemplateTypeAdapter();
            }
            @Override
            public Adapter caseCharacterMapType(CharacterMapType object) {
                return createCharacterMapTypeAdapter();
            }
            @Override
            public Adapter caseChooseType(ChooseType object) {
                return createChooseTypeAdapter();
            }
            @Override
            public Adapter caseCommentType(CommentType object) {
                return createCommentTypeAdapter();
            }
            @Override
            public Adapter caseCopyOfType(CopyOfType object) {
                return createCopyOfTypeAdapter();
            }
            @Override
            public Adapter caseCopyType(CopyType object) {
                return createCopyTypeAdapter();
            }
            @Override
            public Adapter caseDecimalFormatType(DecimalFormatType object) {
                return createDecimalFormatTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseDocumentType(DocumentType object) {
                return createDocumentTypeAdapter();
            }
            @Override
            public Adapter caseElementOnlyVersionedElementType(ElementOnlyVersionedElementType object) {
                return createElementOnlyVersionedElementTypeAdapter();
            }
            @Override
            public Adapter caseElementType(ElementType object) {
                return createElementTypeAdapter();
            }
            @Override
            public Adapter caseForEachGroupType(ForEachGroupType object) {
                return createForEachGroupTypeAdapter();
            }
            @Override
            public Adapter caseForEachType(ForEachType object) {
                return createForEachTypeAdapter();
            }
            @Override
            public Adapter caseFunctionType(FunctionType object) {
                return createFunctionTypeAdapter();
            }
            @Override
            public Adapter caseGenericElementType(GenericElementType object) {
                return createGenericElementTypeAdapter();
            }
            @Override
            public Adapter caseIfType(IfType object) {
                return createIfTypeAdapter();
            }
            @Override
            public Adapter caseImportSchemaType(ImportSchemaType object) {
                return createImportSchemaTypeAdapter();
            }
            @Override
            public Adapter caseImportType(ImportType object) {
                return createImportTypeAdapter();
            }
            @Override
            public Adapter caseIncludeType(IncludeType object) {
                return createIncludeTypeAdapter();
            }
            @Override
            public Adapter caseKeyType(KeyType object) {
                return createKeyTypeAdapter();
            }
            @Override
            public Adapter caseMessageType(MessageType object) {
                return createMessageTypeAdapter();
            }
            @Override
            public Adapter caseNamespaceAliasType(NamespaceAliasType object) {
                return createNamespaceAliasTypeAdapter();
            }
            @Override
            public Adapter caseNamespaceType(NamespaceType object) {
                return createNamespaceTypeAdapter();
            }
            @Override
            public Adapter caseNextMatchType(NextMatchType object) {
                return createNextMatchTypeAdapter();
            }
            @Override
            public Adapter caseNumberType(NumberType object) {
                return createNumberTypeAdapter();
            }
            @Override
            public Adapter caseOutputCharacterType(OutputCharacterType object) {
                return createOutputCharacterTypeAdapter();
            }
            @Override
            public Adapter caseOutputType(OutputType object) {
                return createOutputTypeAdapter();
            }
            @Override
            public Adapter caseParamType(ParamType object) {
                return createParamTypeAdapter();
            }
            @Override
            public Adapter casePerformSortType(PerformSortType object) {
                return createPerformSortTypeAdapter();
            }
            @Override
            public Adapter casePreserveSpaceType(PreserveSpaceType object) {
                return createPreserveSpaceTypeAdapter();
            }
            @Override
            public Adapter caseProcessingInstructionType(ProcessingInstructionType object) {
                return createProcessingInstructionTypeAdapter();
            }
            @Override
            public Adapter caseResultDocumentType(ResultDocumentType object) {
                return createResultDocumentTypeAdapter();
            }
            @Override
            public Adapter caseSequenceConstructor(SequenceConstructor object) {
                return createSequenceConstructorAdapter();
            }
            @Override
            public Adapter caseSequenceType(SequenceType object) {
                return createSequenceTypeAdapter();
            }
            @Override
            public Adapter caseSortType(SortType object) {
                return createSortTypeAdapter();
            }
            @Override
            public Adapter caseStripSpaceType(StripSpaceType object) {
                return createStripSpaceTypeAdapter();
            }
            @Override
            public Adapter caseTemplateType(TemplateType object) {
                return createTemplateTypeAdapter();
            }
            @Override
            public Adapter caseTextElementBaseType(TextElementBaseType object) {
                return createTextElementBaseTypeAdapter();
            }
            @Override
            public Adapter caseTextType(TextType object) {
                return createTextTypeAdapter();
            }
            @Override
            public Adapter caseTransformElementBaseType(TransformElementBaseType object) {
                return createTransformElementBaseTypeAdapter();
            }
            @Override
            public Adapter caseTransformType(TransformType object) {
                return createTransformTypeAdapter();
            }
            @Override
            public Adapter caseValueOfType(ValueOfType object) {
                return createValueOfTypeAdapter();
            }
            @Override
            public Adapter caseVariableType(VariableType object) {
                return createVariableTypeAdapter();
            }
            @Override
            public Adapter caseVersionedElementType(VersionedElementType object) {
                return createVersionedElementTypeAdapter();
            }
            @Override
            public Adapter caseWhenType(WhenType object) {
                return createWhenTypeAdapter();
            }
            @Override
            public Adapter caseWithParamType(WithParamType object) {
                return createWithParamTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.AnalyzeStringType <em>Analyze String Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType
     * @generated
     */
    public Adapter createAnalyzeStringTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ApplyImportsType <em>Apply Imports Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ApplyImportsType
     * @generated
     */
    public Adapter createApplyImportsTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ApplyTemplatesType <em>Apply Templates Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType
     * @generated
     */
    public Adapter createApplyTemplatesTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.AttributeSetType <em>Attribute Set Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.AttributeSetType
     * @generated
     */
    public Adapter createAttributeSetTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.AttributeType <em>Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.AttributeType
     * @generated
     */
    public Adapter createAttributeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.CallTemplateType <em>Call Template Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.CallTemplateType
     * @generated
     */
    public Adapter createCallTemplateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.CharacterMapType <em>Character Map Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.CharacterMapType
     * @generated
     */
    public Adapter createCharacterMapTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ChooseType <em>Choose Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ChooseType
     * @generated
     */
    public Adapter createChooseTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.CommentType <em>Comment Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.CommentType
     * @generated
     */
    public Adapter createCommentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.CopyOfType <em>Copy Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.CopyOfType
     * @generated
     */
    public Adapter createCopyOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.CopyType <em>Copy Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.CopyType
     * @generated
     */
    public Adapter createCopyTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.DecimalFormatType <em>Decimal Format Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.DecimalFormatType
     * @generated
     */
    public Adapter createDecimalFormatTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.DocumentType <em>Document Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.DocumentType
     * @generated
     */
    public Adapter createDocumentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ElementOnlyVersionedElementType <em>Element Only Versioned Element Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ElementOnlyVersionedElementType
     * @generated
     */
    public Adapter createElementOnlyVersionedElementTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ElementType <em>Element Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ElementType
     * @generated
     */
    public Adapter createElementTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ForEachGroupType <em>For Each Group Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ForEachGroupType
     * @generated
     */
    public Adapter createForEachGroupTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ForEachType <em>For Each Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ForEachType
     * @generated
     */
    public Adapter createForEachTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.FunctionType <em>Function Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.FunctionType
     * @generated
     */
    public Adapter createFunctionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.GenericElementType <em>Generic Element Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.GenericElementType
     * @generated
     */
    public Adapter createGenericElementTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.IfType <em>If Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.IfType
     * @generated
     */
    public Adapter createIfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ImportSchemaType <em>Import Schema Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ImportSchemaType
     * @generated
     */
    public Adapter createImportSchemaTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ImportType
     * @generated
     */
    public Adapter createImportTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.IncludeType <em>Include Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.IncludeType
     * @generated
     */
    public Adapter createIncludeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.KeyType <em>Key Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.KeyType
     * @generated
     */
    public Adapter createKeyTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.MessageType <em>Message Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.MessageType
     * @generated
     */
    public Adapter createMessageTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.NamespaceAliasType <em>Namespace Alias Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.NamespaceAliasType
     * @generated
     */
    public Adapter createNamespaceAliasTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.NamespaceType <em>Namespace Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.NamespaceType
     * @generated
     */
    public Adapter createNamespaceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.NextMatchType <em>Next Match Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.NextMatchType
     * @generated
     */
    public Adapter createNextMatchTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.NumberType <em>Number Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.NumberType
     * @generated
     */
    public Adapter createNumberTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.OutputCharacterType <em>Output Character Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.OutputCharacterType
     * @generated
     */
    public Adapter createOutputCharacterTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.OutputType <em>Output Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.OutputType
     * @generated
     */
    public Adapter createOutputTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ParamType <em>Param Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ParamType
     * @generated
     */
    public Adapter createParamTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.PerformSortType <em>Perform Sort Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.PerformSortType
     * @generated
     */
    public Adapter createPerformSortTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.PreserveSpaceType <em>Preserve Space Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.PreserveSpaceType
     * @generated
     */
    public Adapter createPreserveSpaceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ProcessingInstructionType <em>Processing Instruction Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ProcessingInstructionType
     * @generated
     */
    public Adapter createProcessingInstructionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ResultDocumentType <em>Result Document Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ResultDocumentType
     * @generated
     */
    public Adapter createResultDocumentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.SequenceConstructor <em>Sequence Constructor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.SequenceConstructor
     * @generated
     */
    public Adapter createSequenceConstructorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.SequenceType <em>Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.SequenceType
     * @generated
     */
    public Adapter createSequenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.SortType <em>Sort Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.SortType
     * @generated
     */
    public Adapter createSortTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.StripSpaceType <em>Strip Space Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.StripSpaceType
     * @generated
     */
    public Adapter createStripSpaceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.TemplateType <em>Template Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.TemplateType
     * @generated
     */
    public Adapter createTemplateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.TextElementBaseType <em>Text Element Base Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.TextElementBaseType
     * @generated
     */
    public Adapter createTextElementBaseTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.TextType <em>Text Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.TextType
     * @generated
     */
    public Adapter createTextTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.TransformElementBaseType <em>Transform Element Base Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.TransformElementBaseType
     * @generated
     */
    public Adapter createTransformElementBaseTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.TransformType <em>Transform Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.TransformType
     * @generated
     */
    public Adapter createTransformTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.ValueOfType <em>Value Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.ValueOfType
     * @generated
     */
    public Adapter createValueOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.VariableType <em>Variable Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.VariableType
     * @generated
     */
    public Adapter createVariableTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.VersionedElementType <em>Versioned Element Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.VersionedElementType
     * @generated
     */
    public Adapter createVersionedElementTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.WhenType <em>When Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.WhenType
     * @generated
     */
    public Adapter createWhenTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.w3._1999.xsl.transform.WithParamType <em>With Param Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.w3._1999.xsl.transform.WithParamType
     * @generated
     */
    public Adapter createWithParamTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //XSLT20AdapterFactory
