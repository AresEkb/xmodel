/**
 */
package org.w3._1999.xhtml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3._1999.xhtml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XHTML11FactoryImpl extends EFactoryImpl implements XHTML11Factory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XHTML11Factory init() {
        try {
            XHTML11Factory theXHTML11Factory = (XHTML11Factory)EPackage.Registry.INSTANCE.getEFactory(XHTML11Package.eNS_URI);
            if (theXHTML11Factory != null) {
                return theXHTML11Factory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XHTML11FactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XHTML11FactoryImpl() {
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
            case XHTML11Package.DOCUMENT_ROOT: return createDocumentRoot();
            case XHTML11Package.ABBR_TYPE: return createAbbrType();
            case XHTML11Package.ACRONYM_TYPE: return createAcronymType();
            case XHTML11Package.ADDRESS_TYPE: return createAddressType();
            case XHTML11Package.ATYPE: return createAType();
            case XHTML11Package.BASE_TYPE: return createBaseType();
            case XHTML11Package.BLOCKQUOTE_TYPE: return createBlockquoteType();
            case XHTML11Package.BODY_TYPE: return createBodyType();
            case XHTML11Package.BR_TYPE: return createBrType();
            case XHTML11Package.BUTTON_TYPE: return createButtonType();
            case XHTML11Package.CAPTION_TYPE: return createCaptionType();
            case XHTML11Package.CITE_TYPE: return createCiteType();
            case XHTML11Package.CODE_TYPE: return createCodeType();
            case XHTML11Package.DD_TYPE: return createDdType();
            case XHTML11Package.DFN_TYPE: return createDfnType();
            case XHTML11Package.DIV_TYPE: return createDivType();
            case XHTML11Package.DL_TYPE: return createDlType();
            case XHTML11Package.DT_TYPE: return createDtType();
            case XHTML11Package.EM_TYPE: return createEmType();
            case XHTML11Package.FIELDSET_TYPE: return createFieldsetType();
            case XHTML11Package.FORM_TYPE: return createFormType();
            case XHTML11Package.H1_TYPE: return createH1Type();
            case XHTML11Package.H2_TYPE: return createH2Type();
            case XHTML11Package.H3_TYPE: return createH3Type();
            case XHTML11Package.H4_TYPE: return createH4Type();
            case XHTML11Package.H5_TYPE: return createH5Type();
            case XHTML11Package.H6_TYPE: return createH6Type();
            case XHTML11Package.HEADING_TYPE: return createHeadingType();
            case XHTML11Package.HEAD_TYPE: return createHeadType();
            case XHTML11Package.HR_TYPE: return createHrType();
            case XHTML11Package.HTML_TYPE: return createHtmlType();
            case XHTML11Package.IMG_TYPE: return createImgType();
            case XHTML11Package.INL_PRES_TYPE: return createInlPresType();
            case XHTML11Package.INPUT_TYPE: return createInputType();
            case XHTML11Package.KBD_TYPE: return createKbdType();
            case XHTML11Package.LABEL_TYPE: return createLabelType();
            case XHTML11Package.LEGEND_TYPE: return createLegendType();
            case XHTML11Package.LINK_TYPE: return createLinkType();
            case XHTML11Package.LI_TYPE: return createLiType();
            case XHTML11Package.META_TYPE: return createMetaType();
            case XHTML11Package.NOSCRIPT_TYPE: return createNoscriptType();
            case XHTML11Package.OBJECT_TYPE: return createObjectType();
            case XHTML11Package.OL_TYPE: return createOlType();
            case XHTML11Package.OPTGROUP_TYPE: return createOptgroupType();
            case XHTML11Package.OPTION_TYPE: return createOptionType();
            case XHTML11Package.PARAM_TYPE: return createParamType();
            case XHTML11Package.PARAM_TYPE1: return createParamType1();
            case XHTML11Package.PRE_TYPE: return createPreType();
            case XHTML11Package.PTYPE: return createPType();
            case XHTML11Package.QTYPE: return createQType();
            case XHTML11Package.SAMP_TYPE: return createSampType();
            case XHTML11Package.SCRIPT_TYPE: return createScriptType();
            case XHTML11Package.SELECT_TYPE: return createSelectType();
            case XHTML11Package.SPAN_TYPE: return createSpanType();
            case XHTML11Package.STRONG_TYPE: return createStrongType();
            case XHTML11Package.STYLE_TYPE: return createStyleType();
            case XHTML11Package.TABLE_TYPE: return createTableType();
            case XHTML11Package.TD_TYPE: return createTdType();
            case XHTML11Package.TEXTAREA_TYPE: return createTextareaType();
            case XHTML11Package.TH_TYPE: return createThType();
            case XHTML11Package.TITLE_TYPE: return createTitleType();
            case XHTML11Package.TR_TYPE: return createTrType();
            case XHTML11Package.UL_TYPE: return createUlType();
            case XHTML11Package.VAR_TYPE: return createVarType();
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
            case XHTML11Package.ALIGN_TYPE:
                return createAlignTypeFromString(eDataType, initialValue);
            case XHTML11Package.CHECKED_TYPE:
                return createCheckedTypeFromString(eDataType, initialValue);
            case XHTML11Package.DECLARE_TYPE:
                return createDeclareTypeFromString(eDataType, initialValue);
            case XHTML11Package.DEFER_TYPE:
                return createDeferTypeFromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE:
                return createDisabledTypeFromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE1:
                return createDisabledType1FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE2:
                return createDisabledType2FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE3:
                return createDisabledType3FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE4:
                return createDisabledType4FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE5:
                return createDisabledType5FromString(eDataType, initialValue);
            case XHTML11Package.METHOD_TYPE:
                return createMethodTypeFromString(eDataType, initialValue);
            case XHTML11Package.MULTIPLE_TYPE:
                return createMultipleTypeFromString(eDataType, initialValue);
            case XHTML11Package.READONLY_TYPE:
                return createReadonlyTypeFromString(eDataType, initialValue);
            case XHTML11Package.READONLY_TYPE1:
                return createReadonlyType1FromString(eDataType, initialValue);
            case XHTML11Package.SCOPE_TYPE:
                return createScopeTypeFromString(eDataType, initialValue);
            case XHTML11Package.SELECTED_TYPE:
                return createSelectedTypeFromString(eDataType, initialValue);
            case XHTML11Package.TYPE_TYPE:
                return createTypeTypeFromString(eDataType, initialValue);
            case XHTML11Package.VALIGN_TYPE:
                return createValignTypeFromString(eDataType, initialValue);
            case XHTML11Package.VALUETYPE_TYPE:
                return createValuetypeTypeFromString(eDataType, initialValue);
            case XHTML11Package.VALUETYPE_TYPE1:
                return createValuetypeType1FromString(eDataType, initialValue);
            case XHTML11Package.INPUT_TYPE_CLASS:
                return createInputTypeClassFromString(eDataType, initialValue);
            case XHTML11Package.ALIGN_TYPE_OBJECT:
                return createAlignTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.CHECKED_TYPE_OBJECT:
                return createCheckedTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.DECLARE_TYPE_OBJECT:
                return createDeclareTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.DEFER_TYPE_OBJECT:
                return createDeferTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT:
                return createDisabledTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT1:
                return createDisabledTypeObject1FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT2:
                return createDisabledTypeObject2FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT3:
                return createDisabledTypeObject3FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT4:
                return createDisabledTypeObject4FromString(eDataType, initialValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT5:
                return createDisabledTypeObject5FromString(eDataType, initialValue);
            case XHTML11Package.METHOD_TYPE_OBJECT:
                return createMethodTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.MULTIPLE_TYPE_OBJECT:
                return createMultipleTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.READONLY_TYPE_OBJECT:
                return createReadonlyTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.READONLY_TYPE_OBJECT1:
                return createReadonlyTypeObject1FromString(eDataType, initialValue);
            case XHTML11Package.SCOPE_TYPE_OBJECT:
                return createScopeTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.SELECTED_TYPE_OBJECT:
                return createSelectedTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.TYPE_TYPE_OBJECT:
                return createTypeTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.VALIGN_TYPE_OBJECT:
                return createValignTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.VALUETYPE_TYPE_OBJECT:
                return createValuetypeTypeObjectFromString(eDataType, initialValue);
            case XHTML11Package.VALUETYPE_TYPE_OBJECT1:
                return createValuetypeTypeObject1FromString(eDataType, initialValue);
            case XHTML11Package.INPUT_TYPE_CLASS_OBJECT:
                return createInputTypeClassObjectFromString(eDataType, initialValue);
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
            case XHTML11Package.ALIGN_TYPE:
                return convertAlignTypeToString(eDataType, instanceValue);
            case XHTML11Package.CHECKED_TYPE:
                return convertCheckedTypeToString(eDataType, instanceValue);
            case XHTML11Package.DECLARE_TYPE:
                return convertDeclareTypeToString(eDataType, instanceValue);
            case XHTML11Package.DEFER_TYPE:
                return convertDeferTypeToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE:
                return convertDisabledTypeToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE1:
                return convertDisabledType1ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE2:
                return convertDisabledType2ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE3:
                return convertDisabledType3ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE4:
                return convertDisabledType4ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE5:
                return convertDisabledType5ToString(eDataType, instanceValue);
            case XHTML11Package.METHOD_TYPE:
                return convertMethodTypeToString(eDataType, instanceValue);
            case XHTML11Package.MULTIPLE_TYPE:
                return convertMultipleTypeToString(eDataType, instanceValue);
            case XHTML11Package.READONLY_TYPE:
                return convertReadonlyTypeToString(eDataType, instanceValue);
            case XHTML11Package.READONLY_TYPE1:
                return convertReadonlyType1ToString(eDataType, instanceValue);
            case XHTML11Package.SCOPE_TYPE:
                return convertScopeTypeToString(eDataType, instanceValue);
            case XHTML11Package.SELECTED_TYPE:
                return convertSelectedTypeToString(eDataType, instanceValue);
            case XHTML11Package.TYPE_TYPE:
                return convertTypeTypeToString(eDataType, instanceValue);
            case XHTML11Package.VALIGN_TYPE:
                return convertValignTypeToString(eDataType, instanceValue);
            case XHTML11Package.VALUETYPE_TYPE:
                return convertValuetypeTypeToString(eDataType, instanceValue);
            case XHTML11Package.VALUETYPE_TYPE1:
                return convertValuetypeType1ToString(eDataType, instanceValue);
            case XHTML11Package.INPUT_TYPE_CLASS:
                return convertInputTypeClassToString(eDataType, instanceValue);
            case XHTML11Package.ALIGN_TYPE_OBJECT:
                return convertAlignTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.CHECKED_TYPE_OBJECT:
                return convertCheckedTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.DECLARE_TYPE_OBJECT:
                return convertDeclareTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.DEFER_TYPE_OBJECT:
                return convertDeferTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT:
                return convertDisabledTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT1:
                return convertDisabledTypeObject1ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT2:
                return convertDisabledTypeObject2ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT3:
                return convertDisabledTypeObject3ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT4:
                return convertDisabledTypeObject4ToString(eDataType, instanceValue);
            case XHTML11Package.DISABLED_TYPE_OBJECT5:
                return convertDisabledTypeObject5ToString(eDataType, instanceValue);
            case XHTML11Package.METHOD_TYPE_OBJECT:
                return convertMethodTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.MULTIPLE_TYPE_OBJECT:
                return convertMultipleTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.READONLY_TYPE_OBJECT:
                return convertReadonlyTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.READONLY_TYPE_OBJECT1:
                return convertReadonlyTypeObject1ToString(eDataType, instanceValue);
            case XHTML11Package.SCOPE_TYPE_OBJECT:
                return convertScopeTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.SELECTED_TYPE_OBJECT:
                return convertSelectedTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.TYPE_TYPE_OBJECT:
                return convertTypeTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.VALIGN_TYPE_OBJECT:
                return convertValignTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.VALUETYPE_TYPE_OBJECT:
                return convertValuetypeTypeObjectToString(eDataType, instanceValue);
            case XHTML11Package.VALUETYPE_TYPE_OBJECT1:
                return convertValuetypeTypeObject1ToString(eDataType, instanceValue);
            case XHTML11Package.INPUT_TYPE_CLASS_OBJECT:
                return convertInputTypeClassObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
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
    public AbbrType createAbbrType() {
        AbbrTypeImpl abbrType = new AbbrTypeImpl();
        return abbrType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcronymType createAcronymType() {
        AcronymTypeImpl acronymType = new AcronymTypeImpl();
        return acronymType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressType createAddressType() {
        AddressTypeImpl addressType = new AddressTypeImpl();
        return addressType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AType createAType() {
        ATypeImpl aType = new ATypeImpl();
        return aType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseType createBaseType() {
        BaseTypeImpl baseType = new BaseTypeImpl();
        return baseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockquoteType createBlockquoteType() {
        BlockquoteTypeImpl blockquoteType = new BlockquoteTypeImpl();
        return blockquoteType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BodyType createBodyType() {
        BodyTypeImpl bodyType = new BodyTypeImpl();
        return bodyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BrType createBrType() {
        BrTypeImpl brType = new BrTypeImpl();
        return brType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ButtonType createButtonType() {
        ButtonTypeImpl buttonType = new ButtonTypeImpl();
        return buttonType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CaptionType createCaptionType() {
        CaptionTypeImpl captionType = new CaptionTypeImpl();
        return captionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CiteType createCiteType() {
        CiteTypeImpl citeType = new CiteTypeImpl();
        return citeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeType createCodeType() {
        CodeTypeImpl codeType = new CodeTypeImpl();
        return codeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DdType createDdType() {
        DdTypeImpl ddType = new DdTypeImpl();
        return ddType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DfnType createDfnType() {
        DfnTypeImpl dfnType = new DfnTypeImpl();
        return dfnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DivType createDivType() {
        DivTypeImpl divType = new DivTypeImpl();
        return divType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DlType createDlType() {
        DlTypeImpl dlType = new DlTypeImpl();
        return dlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtType createDtType() {
        DtTypeImpl dtType = new DtTypeImpl();
        return dtType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmType createEmType() {
        EmTypeImpl emType = new EmTypeImpl();
        return emType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FieldsetType createFieldsetType() {
        FieldsetTypeImpl fieldsetType = new FieldsetTypeImpl();
        return fieldsetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormType createFormType() {
        FormTypeImpl formType = new FormTypeImpl();
        return formType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public H1Type createH1Type() {
        H1TypeImpl h1Type = new H1TypeImpl();
        return h1Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public H2Type createH2Type() {
        H2TypeImpl h2Type = new H2TypeImpl();
        return h2Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public H3Type createH3Type() {
        H3TypeImpl h3Type = new H3TypeImpl();
        return h3Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public H4Type createH4Type() {
        H4TypeImpl h4Type = new H4TypeImpl();
        return h4Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public H5Type createH5Type() {
        H5TypeImpl h5Type = new H5TypeImpl();
        return h5Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public H6Type createH6Type() {
        H6TypeImpl h6Type = new H6TypeImpl();
        return h6Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HeadingType createHeadingType() {
        HeadingTypeImpl headingType = new HeadingTypeImpl();
        return headingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HeadType createHeadType() {
        HeadTypeImpl headType = new HeadTypeImpl();
        return headType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HrType createHrType() {
        HrTypeImpl hrType = new HrTypeImpl();
        return hrType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HtmlType createHtmlType() {
        HtmlTypeImpl htmlType = new HtmlTypeImpl();
        return htmlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImgType createImgType() {
        ImgTypeImpl imgType = new ImgTypeImpl();
        return imgType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InlPresType createInlPresType() {
        InlPresTypeImpl inlPresType = new InlPresTypeImpl();
        return inlPresType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputType createInputType() {
        InputTypeImpl inputType = new InputTypeImpl();
        return inputType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KbdType createKbdType() {
        KbdTypeImpl kbdType = new KbdTypeImpl();
        return kbdType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LabelType createLabelType() {
        LabelTypeImpl labelType = new LabelTypeImpl();
        return labelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LegendType createLegendType() {
        LegendTypeImpl legendType = new LegendTypeImpl();
        return legendType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkType createLinkType() {
        LinkTypeImpl linkType = new LinkTypeImpl();
        return linkType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiType createLiType() {
        LiTypeImpl liType = new LiTypeImpl();
        return liType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetaType createMetaType() {
        MetaTypeImpl metaType = new MetaTypeImpl();
        return metaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoscriptType createNoscriptType() {
        NoscriptTypeImpl noscriptType = new NoscriptTypeImpl();
        return noscriptType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectType createObjectType() {
        ObjectTypeImpl objectType = new ObjectTypeImpl();
        return objectType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OlType createOlType() {
        OlTypeImpl olType = new OlTypeImpl();
        return olType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OptgroupType createOptgroupType() {
        OptgroupTypeImpl optgroupType = new OptgroupTypeImpl();
        return optgroupType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OptionType createOptionType() {
        OptionTypeImpl optionType = new OptionTypeImpl();
        return optionType;
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
    public ParamType1 createParamType1() {
        ParamType1Impl paramType1 = new ParamType1Impl();
        return paramType1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PreType createPreType() {
        PreTypeImpl preType = new PreTypeImpl();
        return preType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PType createPType() {
        PTypeImpl pType = new PTypeImpl();
        return pType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QType createQType() {
        QTypeImpl qType = new QTypeImpl();
        return qType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SampType createSampType() {
        SampTypeImpl sampType = new SampTypeImpl();
        return sampType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptType createScriptType() {
        ScriptTypeImpl scriptType = new ScriptTypeImpl();
        return scriptType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectType createSelectType() {
        SelectTypeImpl selectType = new SelectTypeImpl();
        return selectType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpanType createSpanType() {
        SpanTypeImpl spanType = new SpanTypeImpl();
        return spanType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StrongType createStrongType() {
        StrongTypeImpl strongType = new StrongTypeImpl();
        return strongType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StyleType createStyleType() {
        StyleTypeImpl styleType = new StyleTypeImpl();
        return styleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableType createTableType() {
        TableTypeImpl tableType = new TableTypeImpl();
        return tableType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TdType createTdType() {
        TdTypeImpl tdType = new TdTypeImpl();
        return tdType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextareaType createTextareaType() {
        TextareaTypeImpl textareaType = new TextareaTypeImpl();
        return textareaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThType createThType() {
        ThTypeImpl thType = new ThTypeImpl();
        return thType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleType createTitleType() {
        TitleTypeImpl titleType = new TitleTypeImpl();
        return titleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrType createTrType() {
        TrTypeImpl trType = new TrTypeImpl();
        return trType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UlType createUlType() {
        UlTypeImpl ulType = new UlTypeImpl();
        return ulType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VarType createVarType() {
        VarTypeImpl varType = new VarTypeImpl();
        return varType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
        AlignType result = AlignType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CheckedType createCheckedTypeFromString(EDataType eDataType, String initialValue) {
        CheckedType result = CheckedType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCheckedTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeclareType createDeclareTypeFromString(EDataType eDataType, String initialValue) {
        DeclareType result = DeclareType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDeclareTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeferType createDeferTypeFromString(EDataType eDataType, String initialValue) {
        DeferType result = DeferType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDeferTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType createDisabledTypeFromString(EDataType eDataType, String initialValue) {
        DisabledType result = DisabledType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType1 createDisabledType1FromString(EDataType eDataType, String initialValue) {
        DisabledType1 result = DisabledType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType2 createDisabledType2FromString(EDataType eDataType, String initialValue) {
        DisabledType2 result = DisabledType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType3 createDisabledType3FromString(EDataType eDataType, String initialValue) {
        DisabledType3 result = DisabledType3.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledType3ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType4 createDisabledType4FromString(EDataType eDataType, String initialValue) {
        DisabledType4 result = DisabledType4.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledType4ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType5 createDisabledType5FromString(EDataType eDataType, String initialValue) {
        DisabledType5 result = DisabledType5.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledType5ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodType createMethodTypeFromString(EDataType eDataType, String initialValue) {
        MethodType result = MethodType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultipleType createMultipleTypeFromString(EDataType eDataType, String initialValue) {
        MultipleType result = MultipleType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultipleTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadonlyType createReadonlyTypeFromString(EDataType eDataType, String initialValue) {
        ReadonlyType result = ReadonlyType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReadonlyTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadonlyType1 createReadonlyType1FromString(EDataType eDataType, String initialValue) {
        ReadonlyType1 result = ReadonlyType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReadonlyType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
        ScopeType result = ScopeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectedType createSelectedTypeFromString(EDataType eDataType, String initialValue) {
        SelectedType result = SelectedType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSelectedTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
        TypeType result = TypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
        ValignType result = ValignType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuetypeType createValuetypeTypeFromString(EDataType eDataType, String initialValue) {
        ValuetypeType result = ValuetypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValuetypeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuetypeType1 createValuetypeType1FromString(EDataType eDataType, String initialValue) {
        ValuetypeType1 result = ValuetypeType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValuetypeType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputTypeClass createInputTypeClassFromString(EDataType eDataType, String initialValue) {
        InputTypeClass result = InputTypeClass.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInputTypeClassToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createAlignTypeFromString(XHTML11Package.eINSTANCE.getAlignType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAlignTypeToString(XHTML11Package.eINSTANCE.getAlignType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CheckedType createCheckedTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createCheckedTypeFromString(XHTML11Package.eINSTANCE.getCheckedType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCheckedTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCheckedTypeToString(XHTML11Package.eINSTANCE.getCheckedType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeclareType createDeclareTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createDeclareTypeFromString(XHTML11Package.eINSTANCE.getDeclareType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDeclareTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDeclareTypeToString(XHTML11Package.eINSTANCE.getDeclareType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeferType createDeferTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createDeferTypeFromString(XHTML11Package.eINSTANCE.getDeferType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDeferTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDeferTypeToString(XHTML11Package.eINSTANCE.getDeferType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType2 createDisabledTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createDisabledType2FromString(XHTML11Package.eINSTANCE.getDisabledType2(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDisabledType2ToString(XHTML11Package.eINSTANCE.getDisabledType2(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType3 createDisabledTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createDisabledType3FromString(XHTML11Package.eINSTANCE.getDisabledType3(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertDisabledType3ToString(XHTML11Package.eINSTANCE.getDisabledType3(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType createDisabledTypeObject2FromString(EDataType eDataType, String initialValue) {
        return createDisabledTypeFromString(XHTML11Package.eINSTANCE.getDisabledType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertDisabledTypeToString(XHTML11Package.eINSTANCE.getDisabledType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType1 createDisabledTypeObject3FromString(EDataType eDataType, String initialValue) {
        return createDisabledType1FromString(XHTML11Package.eINSTANCE.getDisabledType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeObject3ToString(EDataType eDataType, Object instanceValue) {
        return convertDisabledType1ToString(XHTML11Package.eINSTANCE.getDisabledType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType4 createDisabledTypeObject4FromString(EDataType eDataType, String initialValue) {
        return createDisabledType4FromString(XHTML11Package.eINSTANCE.getDisabledType4(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeObject4ToString(EDataType eDataType, Object instanceValue) {
        return convertDisabledType4ToString(XHTML11Package.eINSTANCE.getDisabledType4(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisabledType5 createDisabledTypeObject5FromString(EDataType eDataType, String initialValue) {
        return createDisabledType5FromString(XHTML11Package.eINSTANCE.getDisabledType5(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDisabledTypeObject5ToString(EDataType eDataType, Object instanceValue) {
        return convertDisabledType5ToString(XHTML11Package.eINSTANCE.getDisabledType5(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodType createMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createMethodTypeFromString(XHTML11Package.eINSTANCE.getMethodType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMethodTypeToString(XHTML11Package.eINSTANCE.getMethodType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultipleType createMultipleTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createMultipleTypeFromString(XHTML11Package.eINSTANCE.getMultipleType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultipleTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMultipleTypeToString(XHTML11Package.eINSTANCE.getMultipleType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadonlyType createReadonlyTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createReadonlyTypeFromString(XHTML11Package.eINSTANCE.getReadonlyType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReadonlyTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertReadonlyTypeToString(XHTML11Package.eINSTANCE.getReadonlyType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadonlyType1 createReadonlyTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createReadonlyType1FromString(XHTML11Package.eINSTANCE.getReadonlyType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReadonlyTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertReadonlyType1ToString(XHTML11Package.eINSTANCE.getReadonlyType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createScopeTypeFromString(XHTML11Package.eINSTANCE.getScopeType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertScopeTypeToString(XHTML11Package.eINSTANCE.getScopeType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectedType createSelectedTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSelectedTypeFromString(XHTML11Package.eINSTANCE.getSelectedType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSelectedTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSelectedTypeToString(XHTML11Package.eINSTANCE.getSelectedType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTypeTypeFromString(XHTML11Package.eINSTANCE.getTypeType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTypeTypeToString(XHTML11Package.eINSTANCE.getTypeType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValignType createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createValignTypeFromString(XHTML11Package.eINSTANCE.getValignType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertValignTypeToString(XHTML11Package.eINSTANCE.getValignType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuetypeType createValuetypeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createValuetypeTypeFromString(XHTML11Package.eINSTANCE.getValuetypeType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValuetypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertValuetypeTypeToString(XHTML11Package.eINSTANCE.getValuetypeType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuetypeType1 createValuetypeTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createValuetypeType1FromString(XHTML11Package.eINSTANCE.getValuetypeType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValuetypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertValuetypeType1ToString(XHTML11Package.eINSTANCE.getValuetypeType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputTypeClass createInputTypeClassObjectFromString(EDataType eDataType, String initialValue) {
        return createInputTypeClassFromString(XHTML11Package.eINSTANCE.getInputTypeClass(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInputTypeClassObjectToString(EDataType eDataType, Object instanceValue) {
        return convertInputTypeClassToString(XHTML11Package.eINSTANCE.getInputTypeClass(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XHTML11Package getXHTML11Package() {
        return (XHTML11Package)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static XHTML11Package getPackage() {
        return XHTML11Package.eINSTANCE;
    }

} //XHTML11FactoryImpl
