/**
 */
package org.w3._1999.xhtml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import org.w3._1999.xhtml.*;

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
 * @see org.w3._1999.xhtml.XHTML11Package
 * @generated
 */
public class XHTML11Switch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XHTML11Package modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XHTML11Switch() {
        if (modelPackage == null) {
            modelPackage = XHTML11Package.eINSTANCE;
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
            case XHTML11Package.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.ABBR_TYPE: {
                AbbrType abbrType = (AbbrType)theEObject;
                T result = caseAbbrType(abbrType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.ACRONYM_TYPE: {
                AcronymType acronymType = (AcronymType)theEObject;
                T result = caseAcronymType(acronymType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.ADDRESS_TYPE: {
                AddressType addressType = (AddressType)theEObject;
                T result = caseAddressType(addressType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.ATYPE: {
                AType aType = (AType)theEObject;
                T result = caseAType(aType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.BASE_TYPE: {
                BaseType baseType = (BaseType)theEObject;
                T result = caseBaseType(baseType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.BLOCKQUOTE_TYPE: {
                BlockquoteType blockquoteType = (BlockquoteType)theEObject;
                T result = caseBlockquoteType(blockquoteType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.BODY_TYPE: {
                BodyType bodyType = (BodyType)theEObject;
                T result = caseBodyType(bodyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.BR_TYPE: {
                BrType brType = (BrType)theEObject;
                T result = caseBrType(brType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.BUTTON_TYPE: {
                ButtonType buttonType = (ButtonType)theEObject;
                T result = caseButtonType(buttonType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.CAPTION_TYPE: {
                CaptionType captionType = (CaptionType)theEObject;
                T result = caseCaptionType(captionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.CITE_TYPE: {
                CiteType citeType = (CiteType)theEObject;
                T result = caseCiteType(citeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.CODE_TYPE: {
                CodeType codeType = (CodeType)theEObject;
                T result = caseCodeType(codeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.DD_TYPE: {
                DdType ddType = (DdType)theEObject;
                T result = caseDdType(ddType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.DFN_TYPE: {
                DfnType dfnType = (DfnType)theEObject;
                T result = caseDfnType(dfnType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.DIV_TYPE: {
                DivType divType = (DivType)theEObject;
                T result = caseDivType(divType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.DL_TYPE: {
                DlType dlType = (DlType)theEObject;
                T result = caseDlType(dlType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.DT_TYPE: {
                DtType dtType = (DtType)theEObject;
                T result = caseDtType(dtType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.EM_TYPE: {
                EmType emType = (EmType)theEObject;
                T result = caseEmType(emType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.FIELDSET_TYPE: {
                FieldsetType fieldsetType = (FieldsetType)theEObject;
                T result = caseFieldsetType(fieldsetType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.FORM_TYPE: {
                FormType formType = (FormType)theEObject;
                T result = caseFormType(formType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.H1_TYPE: {
                H1Type h1Type = (H1Type)theEObject;
                T result = caseH1Type(h1Type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.H2_TYPE: {
                H2Type h2Type = (H2Type)theEObject;
                T result = caseH2Type(h2Type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.H3_TYPE: {
                H3Type h3Type = (H3Type)theEObject;
                T result = caseH3Type(h3Type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.H4_TYPE: {
                H4Type h4Type = (H4Type)theEObject;
                T result = caseH4Type(h4Type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.H5_TYPE: {
                H5Type h5Type = (H5Type)theEObject;
                T result = caseH5Type(h5Type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.H6_TYPE: {
                H6Type h6Type = (H6Type)theEObject;
                T result = caseH6Type(h6Type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.HEADING_TYPE: {
                HeadingType headingType = (HeadingType)theEObject;
                T result = caseHeadingType(headingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.HEAD_TYPE: {
                HeadType headType = (HeadType)theEObject;
                T result = caseHeadType(headType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.HR_TYPE: {
                HrType hrType = (HrType)theEObject;
                T result = caseHrType(hrType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.HTML_TYPE: {
                HtmlType htmlType = (HtmlType)theEObject;
                T result = caseHtmlType(htmlType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.IMG_TYPE: {
                ImgType imgType = (ImgType)theEObject;
                T result = caseImgType(imgType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.INL_PRES_TYPE: {
                InlPresType inlPresType = (InlPresType)theEObject;
                T result = caseInlPresType(inlPresType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.INPUT_TYPE: {
                InputType inputType = (InputType)theEObject;
                T result = caseInputType(inputType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.KBD_TYPE: {
                KbdType kbdType = (KbdType)theEObject;
                T result = caseKbdType(kbdType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.LABEL_TYPE: {
                LabelType labelType = (LabelType)theEObject;
                T result = caseLabelType(labelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.LEGEND_TYPE: {
                LegendType legendType = (LegendType)theEObject;
                T result = caseLegendType(legendType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.LINK_TYPE: {
                LinkType linkType = (LinkType)theEObject;
                T result = caseLinkType(linkType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.LI_TYPE: {
                LiType liType = (LiType)theEObject;
                T result = caseLiType(liType);
                if (result == null) result = caseXMLTypeDocumentRoot(liType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.META_TYPE: {
                MetaType metaType = (MetaType)theEObject;
                T result = caseMetaType(metaType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.NOSCRIPT_TYPE: {
                NoscriptType noscriptType = (NoscriptType)theEObject;
                T result = caseNoscriptType(noscriptType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.OBJECT_TYPE: {
                ObjectType objectType = (ObjectType)theEObject;
                T result = caseObjectType(objectType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.OL_TYPE: {
                OlType olType = (OlType)theEObject;
                T result = caseOlType(olType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.OPTGROUP_TYPE: {
                OptgroupType optgroupType = (OptgroupType)theEObject;
                T result = caseOptgroupType(optgroupType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.OPTION_TYPE: {
                OptionType optionType = (OptionType)theEObject;
                T result = caseOptionType(optionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.PARAM_TYPE: {
                ParamType paramType = (ParamType)theEObject;
                T result = caseParamType(paramType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.PARAM_TYPE1: {
                ParamType1 paramType1 = (ParamType1)theEObject;
                T result = caseParamType1(paramType1);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.PRE_TYPE: {
                PreType preType = (PreType)theEObject;
                T result = casePreType(preType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.PTYPE: {
                PType pType = (PType)theEObject;
                T result = casePType(pType);
                if (result == null) result = caseXMLTypeDocumentRoot(pType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.QTYPE: {
                QType qType = (QType)theEObject;
                T result = caseQType(qType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.SAMP_TYPE: {
                SampType sampType = (SampType)theEObject;
                T result = caseSampType(sampType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.SCRIPT_TYPE: {
                ScriptType scriptType = (ScriptType)theEObject;
                T result = caseScriptType(scriptType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.SELECT_TYPE: {
                SelectType selectType = (SelectType)theEObject;
                T result = caseSelectType(selectType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.SPAN_TYPE: {
                SpanType spanType = (SpanType)theEObject;
                T result = caseSpanType(spanType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.STRONG_TYPE: {
                StrongType strongType = (StrongType)theEObject;
                T result = caseStrongType(strongType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.STYLE_TYPE: {
                StyleType styleType = (StyleType)theEObject;
                T result = caseStyleType(styleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.TABLE_TYPE: {
                TableType tableType = (TableType)theEObject;
                T result = caseTableType(tableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.TD_TYPE: {
                TdType tdType = (TdType)theEObject;
                T result = caseTdType(tdType);
                if (result == null) result = caseXMLTypeDocumentRoot(tdType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.TEXTAREA_TYPE: {
                TextareaType textareaType = (TextareaType)theEObject;
                T result = caseTextareaType(textareaType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.TH_TYPE: {
                ThType thType = (ThType)theEObject;
                T result = caseThType(thType);
                if (result == null) result = caseXMLTypeDocumentRoot(thType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.TITLE_TYPE: {
                TitleType titleType = (TitleType)theEObject;
                T result = caseTitleType(titleType);
                if (result == null) result = caseXMLTypeDocumentRoot(titleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.TR_TYPE: {
                TrType trType = (TrType)theEObject;
                T result = caseTrType(trType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.UL_TYPE: {
                UlType ulType = (UlType)theEObject;
                T result = caseUlType(ulType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case XHTML11Package.VAR_TYPE: {
                VarType varType = (VarType)theEObject;
                T result = caseVarType(varType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Abbr Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abbr Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbbrType(AbbrType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAcronymType(AcronymType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressType(AddressType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>AType</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>AType</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAType(AType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseType(BaseType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlockquoteType(BlockquoteType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBodyType(BodyType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Br Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Br Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBrType(BrType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Button Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Button Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseButtonType(ButtonType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Caption Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Caption Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCaptionType(CaptionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cite Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cite Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCiteType(CiteType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCodeType(CodeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dd Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dd Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDdType(DdType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dfn Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dfn Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDfnType(DfnType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Div Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Div Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDivType(DivType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dl Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dl Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDlType(DlType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dt Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dt Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDtType(DtType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Em Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Em Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmType(EmType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fieldset Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fieldset Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFieldsetType(FieldsetType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Form Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Form Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormType(FormType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>H1 Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>H1 Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseH1Type(H1Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>H2 Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>H2 Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseH2Type(H2Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>H3 Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>H3 Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseH3Type(H3Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>H4 Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>H4 Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseH4Type(H4Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>H5 Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>H5 Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseH5Type(H5Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>H6 Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>H6 Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseH6Type(H6Type object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Heading Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Heading Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeadingType(HeadingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Head Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Head Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeadType(HeadType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hr Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hr Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHrType(HrType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Html Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Html Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHtmlType(HtmlType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Img Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Img Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImgType(ImgType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inl Pres Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inl Pres Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInlPresType(InlPresType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputType(InputType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Kbd Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Kbd Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKbdType(KbdType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabelType(LabelType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Legend Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Legend Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLegendType(LegendType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkType(LinkType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Li Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Li Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiType(LiType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meta Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meta Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetaType(MetaType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Noscript Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Noscript Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNoscriptType(NoscriptType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectType(ObjectType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ol Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ol Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOlType(OlType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Optgroup Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Optgroup Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOptgroupType(OptgroupType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOptionType(OptionType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Param Type1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Param Type1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParamType1(ParamType1 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pre Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pre Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePreType(PreType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PType</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PType</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePType(PType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>QType</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>QType</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQType(QType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Samp Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Samp Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSampType(SampType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptType(ScriptType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Select Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Select Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelectType(SelectType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Span Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Span Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpanType(SpanType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Strong Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Strong Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStrongType(StrongType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyleType(StyleType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableType(TableType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Td Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Td Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTdType(TdType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Textarea Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Textarea Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextareaType(TextareaType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Th Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Th Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThType(ThType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTitleType(TitleType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tr Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tr Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTrType(TrType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ul Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ul Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUlType(UlType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVarType(VarType object) {
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

} //XHTML11Switch
