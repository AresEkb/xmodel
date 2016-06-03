/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import org.w3._1999.xsl.transform.ElementOnlyVersionedElementType;
import org.w3._1999.xsl.transform.ElementType;
import org.w3._1999.xsl.transform.ForEachGroupType;
import org.w3._1999.xsl.transform.ForEachType;
import org.w3._1999.xsl.transform.FunctionType;
import org.w3._1999.xsl.transform.GenericElementType;
import org.w3._1999.xsl.transform.IfType;
import org.w3._1999.xsl.transform.ImportSchemaType;
import org.w3._1999.xsl.transform.ImportType;
import org.w3._1999.xsl.transform.IncludeType;
import org.w3._1999.xsl.transform.InputTypeAnnotationsType;
import org.w3._1999.xsl.transform.KeyType;
import org.w3._1999.xsl.transform.Level;
import org.w3._1999.xsl.transform.MessageType;
import org.w3._1999.xsl.transform.MethodMember0;
import org.w3._1999.xsl.transform.ModeMember1;
import org.w3._1999.xsl.transform.ModesMember0ItemMember1;
import org.w3._1999.xsl.transform.ModesMember1;
import org.w3._1999.xsl.transform.NamespaceAliasType;
import org.w3._1999.xsl.transform.NamespaceType;
import org.w3._1999.xsl.transform.NametestsItemMember1;
import org.w3._1999.xsl.transform.NextMatchType;
import org.w3._1999.xsl.transform.NumberType;
import org.w3._1999.xsl.transform.OutputCharacterType;
import org.w3._1999.xsl.transform.OutputType;
import org.w3._1999.xsl.transform.ParamType;
import org.w3._1999.xsl.transform.PerformSortType;
import org.w3._1999.xsl.transform.PrefixListOrAllMember1;
import org.w3._1999.xsl.transform.PrefixOrDefaultMember1;
import org.w3._1999.xsl.transform.PreserveSpaceType;
import org.w3._1999.xsl.transform.ProcessingInstructionType;
import org.w3._1999.xsl.transform.ResultDocumentType;
import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.SequenceType;
import org.w3._1999.xsl.transform.SortType;
import org.w3._1999.xsl.transform.StripSpaceType;
import org.w3._1999.xsl.transform.TemplateType;
import org.w3._1999.xsl.transform.TextElementBaseType;
import org.w3._1999.xsl.transform.TextType;
import org.w3._1999.xsl.transform.TransformElementBaseType;
import org.w3._1999.xsl.transform.TransformType;
import org.w3._1999.xsl.transform.ValidationStripOrPreserve;
import org.w3._1999.xsl.transform.ValidationType;
import org.w3._1999.xsl.transform.ValueOfType;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.VersionedElementType;
import org.w3._1999.xsl.transform.WhenType;
import org.w3._1999.xsl.transform.WithParamType;
import org.w3._1999.xsl.transform.XSLT20Factory;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;
import org.w3._1999.xsl.transform.YesOrNoOrOmit;

import org.w3._1999.xsl.transform.util.XSLT20Validator;

import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XSLT20PackageImpl extends EPackageImpl implements XSLT20Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzeStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyImportsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyTemplatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chooseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyOfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalFormatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementOnlyVersionedElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importSchemaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceAliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextMatchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputCharacterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performSortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preserveSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingInstructionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultDocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stripSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformElementBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueOfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputTypeAnnotationsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modesMember0ItemMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modesMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nametestsItemMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prefixListOrAllMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prefixOrDefaultMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationStripOrPreserveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yesOrNoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yesOrNoOrOmitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType avtEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputTypeAnnotationsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modesMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modesMember0ItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modesMember0ItemMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modesMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nametestsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nametestsItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nametestsItemMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nametestsItemMember2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixListOrAllEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixListOrAllMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixOrDefaultEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixOrDefaultMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qNamesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sequenceType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textElementBaseTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textElementBaseTypeBaseBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType validationStripOrPreserveObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType validationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yesOrNoObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yesOrNoOrOmitObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3._1999.xsl.transform.XSLT20Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XSLT20PackageImpl() {
		super(eNS_URI, XSLT20Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XSLT20Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XSLT20Package init() {
		if (isInited) return (XSLT20Package)EPackage.Registry.INSTANCE.getEPackage(XSLT20Package.eNS_URI);

		// Obtain or create and register package
		XSLT20PackageImpl theXSLT20Package = (XSLT20PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XSLT20PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XSLT20PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLSchema11Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXSLT20Package.createPackageContents();

		// Initialize created meta-data
		theXSLT20Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXSLT20Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return XSLT20Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXSLT20Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XSLT20Package.eNS_URI, theXSLT20Package);
		return theXSLT20Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyzeStringType() {
		return analyzeStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzeStringType_MatchingSubstring() {
		return (EReference)analyzeStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzeStringType_NonMatchingSubstring() {
		return (EReference)analyzeStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzeStringType_Fallback() {
		return (EReference)analyzeStringTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzeStringType_Select() {
		return (EAttribute)analyzeStringTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzeStringType_Regex() {
		return (EAttribute)analyzeStringTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzeStringType_Flags() {
		return (EAttribute)analyzeStringTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyImportsType() {
		return applyImportsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyImportsType_WithParam() {
		return (EReference)applyImportsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyTemplatesType() {
		return applyTemplatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyTemplatesType_Group() {
		return (EAttribute)applyTemplatesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyTemplatesType_Sort() {
		return (EReference)applyTemplatesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyTemplatesType_WithParam() {
		return (EReference)applyTemplatesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyTemplatesType_Select() {
		return (EAttribute)applyTemplatesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyTemplatesType_Mode() {
		return (EAttribute)applyTemplatesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSetType() {
		return attributeSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSetType_Group() {
		return (EAttribute)attributeSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSetType_Attribute() {
		return (EReference)attributeSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSetType_Name() {
		return (EAttribute)attributeSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSetType_UseAttributeSets() {
		return (EAttribute)attributeSetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Name() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Namespace() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Select() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Separator() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Type() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Validation() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallTemplateType() {
		return callTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallTemplateType_WithParam() {
		return (EReference)callTemplateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallTemplateType_Name() {
		return (EAttribute)callTemplateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterMapType() {
		return characterMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterMapType_OutputCharacter() {
		return (EReference)characterMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterMapType_Name() {
		return (EAttribute)characterMapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterMapType_UseCharacterMaps() {
		return (EAttribute)characterMapTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChooseType() {
		return chooseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChooseType_When() {
		return (EReference)chooseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChooseType_Otherwise() {
		return (EReference)chooseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentType() {
		return commentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentType_Select() {
		return (EAttribute)commentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyOfType() {
		return copyOfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfType_Select() {
		return (EAttribute)copyOfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfType_CopyNamespaces() {
		return (EAttribute)copyOfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfType_Type() {
		return (EAttribute)copyOfTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfType_Validation() {
		return (EAttribute)copyOfTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyType() {
		return copyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyType_CopyNamespaces() {
		return (EAttribute)copyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyType_InheritNamespaces() {
		return (EAttribute)copyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyType_UseAttributeSets() {
		return (EAttribute)copyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyType_Type() {
		return (EAttribute)copyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyType_Validation() {
		return (EAttribute)copyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalFormatType() {
		return decimalFormatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_Name() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_DecimalSeparator() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_GroupingSeparator() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_Infinity() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_MinusSign() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_NaN() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_Percent() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_PerMille() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_ZeroDigit() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_Digit() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFormatType_PatternSeparator() {
		return (EAttribute)decimalFormatTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnalyzeString() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Instruction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplyImports() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplyTemplates() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Attribute() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AttributeSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Declaration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallTemplate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CharacterMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Choose() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Comment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Copy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CopyOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecimalFormat() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Document() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Element() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fallback() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForEach() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForEachGroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Function() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_If() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Import() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImportSchema() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Include() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Key() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LiteralResultElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MatchingSubstring() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Message() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Namespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NamespaceAlias() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NextMatch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NonMatchingSubstring() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Number() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Otherwise() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Output() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutputCharacter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Param() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PerformSort() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PreserveSpace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProcessingInstruction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResultDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sequence() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sort() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StripSpace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Stylesheet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transform() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Template() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Text() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Variable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_When() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WithParam() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentType() {
		return documentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_Type() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_Validation() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementOnlyVersionedElementType() {
		return elementOnlyVersionedElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Name() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Namespace() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_InheritNamespaces() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_UseAttributeSets() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Type() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Validation() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachGroupType() {
		return forEachGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachGroupType_Sort() {
		return (EReference)forEachGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_SequenceConstructorGroup() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachGroupType_Variable() {
		return (EReference)forEachGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_InstructionGroup() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachGroupType_Instruction() {
		return (EReference)forEachGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_LiteralResultElementGroup() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachGroupType_LiteralResultElement() {
		return (EReference)forEachGroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_Any() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_Any1() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_Select() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_GroupBy() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_GroupAdjacent() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_GroupStartingWith() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_GroupEndingWith() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachGroupType_Collation() {
		return (EAttribute)forEachGroupTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachType() {
		return forEachTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachType_Sort() {
		return (EReference)forEachTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachType_SequenceConstructorGroup() {
		return (EAttribute)forEachTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachType_Variable() {
		return (EReference)forEachTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachType_InstructionGroup() {
		return (EAttribute)forEachTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachType_Instruction() {
		return (EReference)forEachTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachType_LiteralResultElementGroup() {
		return (EAttribute)forEachTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachType_LiteralResultElement() {
		return (EReference)forEachTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachType_Any() {
		return (EAttribute)forEachTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachType_Any1() {
		return (EAttribute)forEachTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachType_Select() {
		return (EAttribute)forEachTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Param() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_SequenceConstructorGroup() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Variable() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_InstructionGroup() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Instruction() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_LiteralResultElementGroup() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_LiteralResultElement() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Any() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Any1() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Name() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Override() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_As() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElementType() {
		return genericElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElementType_DefaultCollation() {
		return (EAttribute)genericElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElementType_ExcludeResultPrefixes() {
		return (EAttribute)genericElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElementType_ExtensionElementPrefixes() {
		return (EAttribute)genericElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElementType_UseWhen() {
		return (EAttribute)genericElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElementType_XpathDefaultNamespace() {
		return (EAttribute)genericElementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElementType_AnyAttribute() {
		return (EAttribute)genericElementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfType() {
		return ifTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIfType_Test() {
		return (EAttribute)ifTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportSchemaType() {
		return importSchemaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportSchemaType_Schema() {
		return (EReference)importSchemaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportSchemaType_Namespace() {
		return (EAttribute)importSchemaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportSchemaType_SchemaLocation() {
		return (EAttribute)importSchemaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportType() {
		return importTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportType_Href() {
		return (EAttribute)importTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Href() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyType() {
		return keyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Name() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Match() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Use() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Collation() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Select() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Terminate() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceAliasType() {
		return namespaceAliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceAliasType_StylesheetPrefix() {
		return (EAttribute)namespaceAliasTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceAliasType_ResultPrefix() {
		return (EAttribute)namespaceAliasTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceType() {
		return namespaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceType_Name() {
		return (EAttribute)namespaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceType_Select() {
		return (EAttribute)namespaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextMatchType() {
		return nextMatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMatchType_Group() {
		return (EAttribute)nextMatchTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextMatchType_WithParam() {
		return (EReference)nextMatchTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextMatchType_Fallback() {
		return (EReference)nextMatchTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberType() {
		return numberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Value() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Select() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Level() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Count() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_From() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Format() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Lang() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_LetterValue() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Ordinal() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_GroupingSeparator() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_GroupingSize() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputCharacterType() {
		return outputCharacterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCharacterType_Character() {
		return (EAttribute)outputCharacterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCharacterType_String() {
		return (EAttribute)outputCharacterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputType() {
		return outputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Name() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Method() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_ByteOrderMark() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_CdataSectionElements() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_DoctypePublic() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_DoctypeSystem() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Encoding() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_EscapeUriAttributes() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_IncludeContentType() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Indent() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_MediaType() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_NormalizationForm() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_OmitXmlDeclaration() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Standalone() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_UndeclarePrefixes() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_UseCharacterMaps() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Version() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Select() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_As() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Required() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Tunnel() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformSortType() {
		return performSortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformSortType_Sort() {
		return (EReference)performSortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformSortType_SequenceConstructorGroup() {
		return (EAttribute)performSortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformSortType_Variable() {
		return (EReference)performSortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformSortType_InstructionGroup() {
		return (EAttribute)performSortTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformSortType_Instruction() {
		return (EReference)performSortTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformSortType_LiteralResultElementGroup() {
		return (EAttribute)performSortTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformSortType_LiteralResultElement() {
		return (EReference)performSortTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformSortType_Any() {
		return (EAttribute)performSortTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformSortType_Any1() {
		return (EAttribute)performSortTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformSortType_Select() {
		return (EAttribute)performSortTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreserveSpaceType() {
		return preserveSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreserveSpaceType_Elements() {
		return (EAttribute)preserveSpaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingInstructionType() {
		return processingInstructionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingInstructionType_Name() {
		return (EAttribute)processingInstructionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingInstructionType_Select() {
		return (EAttribute)processingInstructionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultDocumentType() {
		return resultDocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Format() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Href() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Type() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Validation() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Method() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_ByteOrderMark() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_CdataSectionElements() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_DoctypePublic() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_DoctypeSystem() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Encoding() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_EscapeUriAttributes() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_IncludeContentType() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Indent() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_MediaType() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_NormalizationForm() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_OmitXmlDeclaration() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_Standalone() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_UndeclarePrefixes() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_UseCharacterMaps() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDocumentType_OutputVersion() {
		return (EAttribute)resultDocumentTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceConstructor() {
		return sequenceConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceConstructor_SequenceConstructorGroup() {
		return (EAttribute)sequenceConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceConstructor_Variable() {
		return (EReference)sequenceConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceConstructor_InstructionGroup() {
		return (EAttribute)sequenceConstructorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceConstructor_Instruction() {
		return (EReference)sequenceConstructorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceConstructor_LiteralResultElementGroup() {
		return (EAttribute)sequenceConstructorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceConstructor_LiteralResultElement() {
		return (EReference)sequenceConstructorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceConstructor_Any() {
		return (EAttribute)sequenceConstructorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceConstructor_Any1() {
		return (EAttribute)sequenceConstructorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Group() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceType_Fallback() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Select() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortType() {
		return sortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_Select() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_Lang() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_DataType() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_Order() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_CaseOrder() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_Collation() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortType_Stable() {
		return (EAttribute)sortTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStripSpaceType() {
		return stripSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripSpaceType_Elements() {
		return (EAttribute)stripSpaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateType() {
		return templateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateType_Param() {
		return (EReference)templateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_SequenceConstructorGroup() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateType_Variable() {
		return (EReference)templateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_InstructionGroup() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateType_Instruction() {
		return (EReference)templateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_LiteralResultElementGroup() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateType_LiteralResultElement() {
		return (EReference)templateTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Any() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Any1() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Match() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Priority() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Mode() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Name() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_As() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElementBaseType() {
		return textElementBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElementBaseType_Value() {
		return (EAttribute)textElementBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextType() {
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_DisableOutputEscaping() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformElementBaseType() {
		return transformElementBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformType() {
		return transformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_Import() {
		return (EReference)transformTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Group() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_DeclarationGroup() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_Declaration() {
		return (EReference)transformTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_Variable() {
		return (EReference)transformTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformType_Param() {
		return (EReference)transformTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Any() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Id() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_DefaultValidation() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_InputTypeAnnotations() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueOfType() {
		return valueOfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueOfType_Select() {
		return (EAttribute)valueOfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueOfType_Separator() {
		return (EAttribute)valueOfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueOfType_DisableOutputEscaping() {
		return (EAttribute)valueOfTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Name() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Select() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_As() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedElementType() {
		return versionedElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedElementType_Version() {
		return (EAttribute)versionedElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenType() {
		return whenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhenType_Test() {
		return (EAttribute)whenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithParamType() {
		return withParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithParamType_Name() {
		return (EAttribute)withParamTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithParamType_Select() {
		return (EAttribute)withParamTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithParamType_As() {
		return (EAttribute)withParamTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithParamType_Tunnel() {
		return (EAttribute)withParamTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputTypeAnnotationsType() {
		return inputTypeAnnotationsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodMember0() {
		return methodMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeMember1() {
		return modeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModesMember0ItemMember1() {
		return modesMember0ItemMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModesMember1() {
		return modesMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNametestsItemMember1() {
		return nametestsItemMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrefixListOrAllMember1() {
		return prefixListOrAllMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrefixOrDefaultMember1() {
		return prefixOrDefaultMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidationStripOrPreserve() {
		return validationStripOrPreserveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidationType() {
		return validationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYesOrNo() {
		return yesOrNoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYesOrNoOrOmit() {
		return yesOrNoOrOmitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAvt() {
		return avtEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChar() {
		return charEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpression() {
		return expressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputTypeAnnotationsTypeObject() {
		return inputTypeAnnotationsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLevelObject() {
		return levelObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethod() {
		return methodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodMember0Object() {
		return methodMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodMember1() {
		return methodMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMode() {
		return modeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModeMember1Object() {
		return modeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModes() {
		return modesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModesMember0() {
		return modesMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModesMember0Item() {
		return modesMember0ItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModesMember0ItemMember1Object() {
		return modesMember0ItemMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModesMember1Object() {
		return modesMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNametests() {
		return nametestsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNametestsItem() {
		return nametestsItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNametestsItemMember1Object() {
		return nametestsItemMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNametestsItemMember2() {
		return nametestsItemMember2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPattern() {
		return patternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixes() {
		return prefixesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixList() {
		return prefixListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixListOrAll() {
		return prefixListOrAllEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixListOrAllMember1Object() {
		return prefixListOrAllMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixOrDefault() {
		return prefixOrDefaultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixOrDefaultMember1Object() {
		return prefixOrDefaultMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQName() {
		return qNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQNames() {
		return qNamesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSequenceType1() {
		return sequenceType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextElementBaseTypeBase() {
		return textElementBaseTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextElementBaseTypeBaseBase() {
		return textElementBaseTypeBaseBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUriList() {
		return uriListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValidationStripOrPreserveObject() {
		return validationStripOrPreserveObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValidationTypeObject() {
		return validationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYesOrNoObject() {
		return yesOrNoObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYesOrNoOrOmitObject() {
		return yesOrNoOrOmitObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLT20Factory getXSLT20Factory() {
		return (XSLT20Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		analyzeStringTypeEClass = createEClass(ANALYZE_STRING_TYPE);
		createEReference(analyzeStringTypeEClass, ANALYZE_STRING_TYPE__MATCHING_SUBSTRING);
		createEReference(analyzeStringTypeEClass, ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING);
		createEReference(analyzeStringTypeEClass, ANALYZE_STRING_TYPE__FALLBACK);
		createEAttribute(analyzeStringTypeEClass, ANALYZE_STRING_TYPE__SELECT);
		createEAttribute(analyzeStringTypeEClass, ANALYZE_STRING_TYPE__REGEX);
		createEAttribute(analyzeStringTypeEClass, ANALYZE_STRING_TYPE__FLAGS);

		applyImportsTypeEClass = createEClass(APPLY_IMPORTS_TYPE);
		createEReference(applyImportsTypeEClass, APPLY_IMPORTS_TYPE__WITH_PARAM);

		applyTemplatesTypeEClass = createEClass(APPLY_TEMPLATES_TYPE);
		createEAttribute(applyTemplatesTypeEClass, APPLY_TEMPLATES_TYPE__GROUP);
		createEReference(applyTemplatesTypeEClass, APPLY_TEMPLATES_TYPE__SORT);
		createEReference(applyTemplatesTypeEClass, APPLY_TEMPLATES_TYPE__WITH_PARAM);
		createEAttribute(applyTemplatesTypeEClass, APPLY_TEMPLATES_TYPE__SELECT);
		createEAttribute(applyTemplatesTypeEClass, APPLY_TEMPLATES_TYPE__MODE);

		attributeSetTypeEClass = createEClass(ATTRIBUTE_SET_TYPE);
		createEAttribute(attributeSetTypeEClass, ATTRIBUTE_SET_TYPE__GROUP);
		createEReference(attributeSetTypeEClass, ATTRIBUTE_SET_TYPE__ATTRIBUTE);
		createEAttribute(attributeSetTypeEClass, ATTRIBUTE_SET_TYPE__NAME);
		createEAttribute(attributeSetTypeEClass, ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAMESPACE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__SELECT);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__SEPARATOR);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__VALIDATION);

		callTemplateTypeEClass = createEClass(CALL_TEMPLATE_TYPE);
		createEReference(callTemplateTypeEClass, CALL_TEMPLATE_TYPE__WITH_PARAM);
		createEAttribute(callTemplateTypeEClass, CALL_TEMPLATE_TYPE__NAME);

		characterMapTypeEClass = createEClass(CHARACTER_MAP_TYPE);
		createEReference(characterMapTypeEClass, CHARACTER_MAP_TYPE__OUTPUT_CHARACTER);
		createEAttribute(characterMapTypeEClass, CHARACTER_MAP_TYPE__NAME);
		createEAttribute(characterMapTypeEClass, CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS);

		chooseTypeEClass = createEClass(CHOOSE_TYPE);
		createEReference(chooseTypeEClass, CHOOSE_TYPE__WHEN);
		createEReference(chooseTypeEClass, CHOOSE_TYPE__OTHERWISE);

		commentTypeEClass = createEClass(COMMENT_TYPE);
		createEAttribute(commentTypeEClass, COMMENT_TYPE__SELECT);

		copyOfTypeEClass = createEClass(COPY_OF_TYPE);
		createEAttribute(copyOfTypeEClass, COPY_OF_TYPE__SELECT);
		createEAttribute(copyOfTypeEClass, COPY_OF_TYPE__COPY_NAMESPACES);
		createEAttribute(copyOfTypeEClass, COPY_OF_TYPE__TYPE);
		createEAttribute(copyOfTypeEClass, COPY_OF_TYPE__VALIDATION);

		copyTypeEClass = createEClass(COPY_TYPE);
		createEAttribute(copyTypeEClass, COPY_TYPE__COPY_NAMESPACES);
		createEAttribute(copyTypeEClass, COPY_TYPE__INHERIT_NAMESPACES);
		createEAttribute(copyTypeEClass, COPY_TYPE__USE_ATTRIBUTE_SETS);
		createEAttribute(copyTypeEClass, COPY_TYPE__TYPE);
		createEAttribute(copyTypeEClass, COPY_TYPE__VALIDATION);

		decimalFormatTypeEClass = createEClass(DECIMAL_FORMAT_TYPE);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__NAME);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__INFINITY);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__MINUS_SIGN);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__NA_N);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__PERCENT);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__PER_MILLE);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__ZERO_DIGIT);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__DIGIT);
		createEAttribute(decimalFormatTypeEClass, DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANALYZE_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INSTRUCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLY_IMPORTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLY_TEMPLATES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DECLARATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CALL_TEMPLATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHARACTER_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHOOSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COPY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COPY_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DECIMAL_FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ELEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FALLBACK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOR_EACH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOR_EACH_GROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FUNCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORT_SCHEMA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUDE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MATCHING_SUBSTRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MESSAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE_ALIAS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEXT_MATCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NON_MATCHING_SUBSTRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OTHERWISE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUT_CHARACTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERFORM_SORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRESERVE_SPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROCESSING_INSTRUCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESULT_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SEQUENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRIP_SPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLESHEET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPLATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VARIABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WHEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WITH_PARAM);

		documentTypeEClass = createEClass(DOCUMENT_TYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__TYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__VALIDATION);

		elementOnlyVersionedElementTypeEClass = createEClass(ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAME);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAMESPACE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__INHERIT_NAMESPACES);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__USE_ATTRIBUTE_SETS);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__VALIDATION);

		forEachGroupTypeEClass = createEClass(FOR_EACH_GROUP_TYPE);
		createEReference(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__SORT);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
		createEReference(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__VARIABLE);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP);
		createEReference(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__INSTRUCTION);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
		createEReference(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__ANY);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__ANY1);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__SELECT);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__GROUP_BY);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__GROUP_ADJACENT);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH);
		createEAttribute(forEachGroupTypeEClass, FOR_EACH_GROUP_TYPE__COLLATION);

		forEachTypeEClass = createEClass(FOR_EACH_TYPE);
		createEReference(forEachTypeEClass, FOR_EACH_TYPE__SORT);
		createEAttribute(forEachTypeEClass, FOR_EACH_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
		createEReference(forEachTypeEClass, FOR_EACH_TYPE__VARIABLE);
		createEAttribute(forEachTypeEClass, FOR_EACH_TYPE__INSTRUCTION_GROUP);
		createEReference(forEachTypeEClass, FOR_EACH_TYPE__INSTRUCTION);
		createEAttribute(forEachTypeEClass, FOR_EACH_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
		createEReference(forEachTypeEClass, FOR_EACH_TYPE__LITERAL_RESULT_ELEMENT);
		createEAttribute(forEachTypeEClass, FOR_EACH_TYPE__ANY);
		createEAttribute(forEachTypeEClass, FOR_EACH_TYPE__ANY1);
		createEAttribute(forEachTypeEClass, FOR_EACH_TYPE__SELECT);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__PARAM);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
		createEReference(functionTypeEClass, FUNCTION_TYPE__VARIABLE);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__INSTRUCTION_GROUP);
		createEReference(functionTypeEClass, FUNCTION_TYPE__INSTRUCTION);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
		createEReference(functionTypeEClass, FUNCTION_TYPE__LITERAL_RESULT_ELEMENT);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__ANY);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__ANY1);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__NAME);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__OVERRIDE);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__AS);

		genericElementTypeEClass = createEClass(GENERIC_ELEMENT_TYPE);
		createEAttribute(genericElementTypeEClass, GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION);
		createEAttribute(genericElementTypeEClass, GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES);
		createEAttribute(genericElementTypeEClass, GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES);
		createEAttribute(genericElementTypeEClass, GENERIC_ELEMENT_TYPE__USE_WHEN);
		createEAttribute(genericElementTypeEClass, GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE);
		createEAttribute(genericElementTypeEClass, GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE);

		ifTypeEClass = createEClass(IF_TYPE);
		createEAttribute(ifTypeEClass, IF_TYPE__TEST);

		importSchemaTypeEClass = createEClass(IMPORT_SCHEMA_TYPE);
		createEReference(importSchemaTypeEClass, IMPORT_SCHEMA_TYPE__SCHEMA);
		createEAttribute(importSchemaTypeEClass, IMPORT_SCHEMA_TYPE__NAMESPACE);
		createEAttribute(importSchemaTypeEClass, IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION);

		importTypeEClass = createEClass(IMPORT_TYPE);
		createEAttribute(importTypeEClass, IMPORT_TYPE__HREF);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__HREF);

		keyTypeEClass = createEClass(KEY_TYPE);
		createEAttribute(keyTypeEClass, KEY_TYPE__NAME);
		createEAttribute(keyTypeEClass, KEY_TYPE__MATCH);
		createEAttribute(keyTypeEClass, KEY_TYPE__USE);
		createEAttribute(keyTypeEClass, KEY_TYPE__COLLATION);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__SELECT);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__TERMINATE);

		namespaceAliasTypeEClass = createEClass(NAMESPACE_ALIAS_TYPE);
		createEAttribute(namespaceAliasTypeEClass, NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX);
		createEAttribute(namespaceAliasTypeEClass, NAMESPACE_ALIAS_TYPE__RESULT_PREFIX);

		namespaceTypeEClass = createEClass(NAMESPACE_TYPE);
		createEAttribute(namespaceTypeEClass, NAMESPACE_TYPE__NAME);
		createEAttribute(namespaceTypeEClass, NAMESPACE_TYPE__SELECT);

		nextMatchTypeEClass = createEClass(NEXT_MATCH_TYPE);
		createEAttribute(nextMatchTypeEClass, NEXT_MATCH_TYPE__GROUP);
		createEReference(nextMatchTypeEClass, NEXT_MATCH_TYPE__WITH_PARAM);
		createEReference(nextMatchTypeEClass, NEXT_MATCH_TYPE__FALLBACK);

		numberTypeEClass = createEClass(NUMBER_TYPE);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__VALUE);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__SELECT);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__LEVEL);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__COUNT);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__FROM);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__FORMAT);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__LANG);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__LETTER_VALUE);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__ORDINAL);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__GROUPING_SEPARATOR);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__GROUPING_SIZE);

		outputCharacterTypeEClass = createEClass(OUTPUT_CHARACTER_TYPE);
		createEAttribute(outputCharacterTypeEClass, OUTPUT_CHARACTER_TYPE__CHARACTER);
		createEAttribute(outputCharacterTypeEClass, OUTPUT_CHARACTER_TYPE__STRING);

		outputTypeEClass = createEClass(OUTPUT_TYPE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__NAME);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__METHOD);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__BYTE_ORDER_MARK);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__CDATA_SECTION_ELEMENTS);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__DOCTYPE_PUBLIC);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__DOCTYPE_SYSTEM);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__ENCODING);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__INCLUDE_CONTENT_TYPE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__INDENT);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__MEDIA_TYPE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__NORMALIZATION_FORM);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__OMIT_XML_DECLARATION);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__STANDALONE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__UNDECLARE_PREFIXES);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__USE_CHARACTER_MAPS);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__VERSION);

		paramTypeEClass = createEClass(PARAM_TYPE);
		createEAttribute(paramTypeEClass, PARAM_TYPE__NAME);
		createEAttribute(paramTypeEClass, PARAM_TYPE__SELECT);
		createEAttribute(paramTypeEClass, PARAM_TYPE__AS);
		createEAttribute(paramTypeEClass, PARAM_TYPE__REQUIRED);
		createEAttribute(paramTypeEClass, PARAM_TYPE__TUNNEL);

		performSortTypeEClass = createEClass(PERFORM_SORT_TYPE);
		createEReference(performSortTypeEClass, PERFORM_SORT_TYPE__SORT);
		createEAttribute(performSortTypeEClass, PERFORM_SORT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
		createEReference(performSortTypeEClass, PERFORM_SORT_TYPE__VARIABLE);
		createEAttribute(performSortTypeEClass, PERFORM_SORT_TYPE__INSTRUCTION_GROUP);
		createEReference(performSortTypeEClass, PERFORM_SORT_TYPE__INSTRUCTION);
		createEAttribute(performSortTypeEClass, PERFORM_SORT_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
		createEReference(performSortTypeEClass, PERFORM_SORT_TYPE__LITERAL_RESULT_ELEMENT);
		createEAttribute(performSortTypeEClass, PERFORM_SORT_TYPE__ANY);
		createEAttribute(performSortTypeEClass, PERFORM_SORT_TYPE__ANY1);
		createEAttribute(performSortTypeEClass, PERFORM_SORT_TYPE__SELECT);

		preserveSpaceTypeEClass = createEClass(PRESERVE_SPACE_TYPE);
		createEAttribute(preserveSpaceTypeEClass, PRESERVE_SPACE_TYPE__ELEMENTS);

		processingInstructionTypeEClass = createEClass(PROCESSING_INSTRUCTION_TYPE);
		createEAttribute(processingInstructionTypeEClass, PROCESSING_INSTRUCTION_TYPE__NAME);
		createEAttribute(processingInstructionTypeEClass, PROCESSING_INSTRUCTION_TYPE__SELECT);

		resultDocumentTypeEClass = createEClass(RESULT_DOCUMENT_TYPE);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__FORMAT);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__HREF);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__TYPE);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__VALIDATION);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__METHOD);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__ENCODING);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__INDENT);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__MEDIA_TYPE);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__STANDALONE);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS);
		createEAttribute(resultDocumentTypeEClass, RESULT_DOCUMENT_TYPE__OUTPUT_VERSION);

		sequenceConstructorEClass = createEClass(SEQUENCE_CONSTRUCTOR);
		createEAttribute(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP);
		createEReference(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__VARIABLE);
		createEAttribute(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP);
		createEReference(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__INSTRUCTION);
		createEAttribute(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP);
		createEReference(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT);
		createEAttribute(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__ANY);
		createEAttribute(sequenceConstructorEClass, SEQUENCE_CONSTRUCTOR__ANY1);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__GROUP);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__FALLBACK);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__SELECT);

		sortTypeEClass = createEClass(SORT_TYPE);
		createEAttribute(sortTypeEClass, SORT_TYPE__SELECT);
		createEAttribute(sortTypeEClass, SORT_TYPE__LANG);
		createEAttribute(sortTypeEClass, SORT_TYPE__DATA_TYPE);
		createEAttribute(sortTypeEClass, SORT_TYPE__ORDER);
		createEAttribute(sortTypeEClass, SORT_TYPE__CASE_ORDER);
		createEAttribute(sortTypeEClass, SORT_TYPE__COLLATION);
		createEAttribute(sortTypeEClass, SORT_TYPE__STABLE);

		stripSpaceTypeEClass = createEClass(STRIP_SPACE_TYPE);
		createEAttribute(stripSpaceTypeEClass, STRIP_SPACE_TYPE__ELEMENTS);

		templateTypeEClass = createEClass(TEMPLATE_TYPE);
		createEReference(templateTypeEClass, TEMPLATE_TYPE__PARAM);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
		createEReference(templateTypeEClass, TEMPLATE_TYPE__VARIABLE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__INSTRUCTION_GROUP);
		createEReference(templateTypeEClass, TEMPLATE_TYPE__INSTRUCTION);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
		createEReference(templateTypeEClass, TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__ANY);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__ANY1);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__MATCH);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__PRIORITY);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__MODE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__NAME);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__AS);

		textElementBaseTypeEClass = createEClass(TEXT_ELEMENT_BASE_TYPE);
		createEAttribute(textElementBaseTypeEClass, TEXT_ELEMENT_BASE_TYPE__VALUE);

		textTypeEClass = createEClass(TEXT_TYPE);
		createEAttribute(textTypeEClass, TEXT_TYPE__DISABLE_OUTPUT_ESCAPING);

		transformElementBaseTypeEClass = createEClass(TRANSFORM_ELEMENT_BASE_TYPE);

		transformTypeEClass = createEClass(TRANSFORM_TYPE);
		createEReference(transformTypeEClass, TRANSFORM_TYPE__IMPORT);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__GROUP);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__DECLARATION_GROUP);
		createEReference(transformTypeEClass, TRANSFORM_TYPE__DECLARATION);
		createEReference(transformTypeEClass, TRANSFORM_TYPE__VARIABLE);
		createEReference(transformTypeEClass, TRANSFORM_TYPE__PARAM);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ANY);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ID);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__DEFAULT_VALIDATION);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS);

		valueOfTypeEClass = createEClass(VALUE_OF_TYPE);
		createEAttribute(valueOfTypeEClass, VALUE_OF_TYPE__SELECT);
		createEAttribute(valueOfTypeEClass, VALUE_OF_TYPE__SEPARATOR);
		createEAttribute(valueOfTypeEClass, VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING);

		variableTypeEClass = createEClass(VARIABLE_TYPE);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__NAME);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__SELECT);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__AS);

		versionedElementTypeEClass = createEClass(VERSIONED_ELEMENT_TYPE);
		createEAttribute(versionedElementTypeEClass, VERSIONED_ELEMENT_TYPE__VERSION);

		whenTypeEClass = createEClass(WHEN_TYPE);
		createEAttribute(whenTypeEClass, WHEN_TYPE__TEST);

		withParamTypeEClass = createEClass(WITH_PARAM_TYPE);
		createEAttribute(withParamTypeEClass, WITH_PARAM_TYPE__NAME);
		createEAttribute(withParamTypeEClass, WITH_PARAM_TYPE__SELECT);
		createEAttribute(withParamTypeEClass, WITH_PARAM_TYPE__AS);
		createEAttribute(withParamTypeEClass, WITH_PARAM_TYPE__TUNNEL);

		// Create enums
		inputTypeAnnotationsTypeEEnum = createEEnum(INPUT_TYPE_ANNOTATIONS_TYPE);
		levelEEnum = createEEnum(LEVEL);
		methodMember0EEnum = createEEnum(METHOD_MEMBER0);
		modeMember1EEnum = createEEnum(MODE_MEMBER1);
		modesMember0ItemMember1EEnum = createEEnum(MODES_MEMBER0_ITEM_MEMBER1);
		modesMember1EEnum = createEEnum(MODES_MEMBER1);
		nametestsItemMember1EEnum = createEEnum(NAMETESTS_ITEM_MEMBER1);
		prefixListOrAllMember1EEnum = createEEnum(PREFIX_LIST_OR_ALL_MEMBER1);
		prefixOrDefaultMember1EEnum = createEEnum(PREFIX_OR_DEFAULT_MEMBER1);
		validationStripOrPreserveEEnum = createEEnum(VALIDATION_STRIP_OR_PRESERVE);
		validationTypeEEnum = createEEnum(VALIDATION_TYPE);
		yesOrNoEEnum = createEEnum(YES_OR_NO);
		yesOrNoOrOmitEEnum = createEEnum(YES_OR_NO_OR_OMIT);

		// Create data types
		avtEDataType = createEDataType(AVT);
		charEDataType = createEDataType(CHAR);
		expressionEDataType = createEDataType(EXPRESSION);
		inputTypeAnnotationsTypeObjectEDataType = createEDataType(INPUT_TYPE_ANNOTATIONS_TYPE_OBJECT);
		levelObjectEDataType = createEDataType(LEVEL_OBJECT);
		methodEDataType = createEDataType(METHOD);
		methodMember0ObjectEDataType = createEDataType(METHOD_MEMBER0_OBJECT);
		methodMember1EDataType = createEDataType(METHOD_MEMBER1);
		modeEDataType = createEDataType(MODE);
		modeMember1ObjectEDataType = createEDataType(MODE_MEMBER1_OBJECT);
		modesEDataType = createEDataType(MODES);
		modesMember0EDataType = createEDataType(MODES_MEMBER0);
		modesMember0ItemEDataType = createEDataType(MODES_MEMBER0_ITEM);
		modesMember0ItemMember1ObjectEDataType = createEDataType(MODES_MEMBER0_ITEM_MEMBER1_OBJECT);
		modesMember1ObjectEDataType = createEDataType(MODES_MEMBER1_OBJECT);
		nametestsEDataType = createEDataType(NAMETESTS);
		nametestsItemEDataType = createEDataType(NAMETESTS_ITEM);
		nametestsItemMember1ObjectEDataType = createEDataType(NAMETESTS_ITEM_MEMBER1_OBJECT);
		nametestsItemMember2EDataType = createEDataType(NAMETESTS_ITEM_MEMBER2);
		patternEDataType = createEDataType(PATTERN);
		prefixesEDataType = createEDataType(PREFIXES);
		prefixListEDataType = createEDataType(PREFIX_LIST);
		prefixListOrAllEDataType = createEDataType(PREFIX_LIST_OR_ALL);
		prefixListOrAllMember1ObjectEDataType = createEDataType(PREFIX_LIST_OR_ALL_MEMBER1_OBJECT);
		prefixOrDefaultEDataType = createEDataType(PREFIX_OR_DEFAULT);
		prefixOrDefaultMember1ObjectEDataType = createEDataType(PREFIX_OR_DEFAULT_MEMBER1_OBJECT);
		qNameEDataType = createEDataType(QNAME);
		qNamesEDataType = createEDataType(QNAMES);
		sequenceType1EDataType = createEDataType(SEQUENCE_TYPE1);
		textElementBaseTypeBaseEDataType = createEDataType(TEXT_ELEMENT_BASE_TYPE_BASE);
		textElementBaseTypeBaseBaseEDataType = createEDataType(TEXT_ELEMENT_BASE_TYPE_BASE_BASE);
		uriListEDataType = createEDataType(URI_LIST);
		validationStripOrPreserveObjectEDataType = createEDataType(VALIDATION_STRIP_OR_PRESERVE_OBJECT);
		validationTypeObjectEDataType = createEDataType(VALIDATION_TYPE_OBJECT);
		yesOrNoObjectEDataType = createEDataType(YES_OR_NO_OBJECT);
		yesOrNoOrOmitObjectEDataType = createEDataType(YES_OR_NO_OR_OMIT_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XMLSchema11Package theXMLSchema11Package = (XMLSchema11Package)EPackage.Registry.INSTANCE.getEPackage(XMLSchema11Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analyzeStringTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		applyImportsTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		applyTemplatesTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		attributeSetTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		attributeTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		callTemplateTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		characterMapTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		chooseTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		commentTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		copyOfTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		copyTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		decimalFormatTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		documentTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		elementOnlyVersionedElementTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		elementTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		forEachGroupTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		forEachTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		functionTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		genericElementTypeEClass.getESuperTypes().add(theXMLTypePackage.getXMLTypeDocumentRoot());
		ifTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		importSchemaTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		importTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		includeTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		keyTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		messageTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		namespaceAliasTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		namespaceTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		nextMatchTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		numberTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		outputCharacterTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		outputTypeEClass.getESuperTypes().add(this.getGenericElementType());
		paramTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		performSortTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		preserveSpaceTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		processingInstructionTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		resultDocumentTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		sequenceConstructorEClass.getESuperTypes().add(this.getVersionedElementType());
		sequenceTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		sortTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		stripSpaceTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		templateTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		textElementBaseTypeEClass.getESuperTypes().add(this.getVersionedElementType());
		textTypeEClass.getESuperTypes().add(this.getTextElementBaseType());
		transformElementBaseTypeEClass.getESuperTypes().add(this.getElementOnlyVersionedElementType());
		transformTypeEClass.getESuperTypes().add(this.getTransformElementBaseType());
		valueOfTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		variableTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		versionedElementTypeEClass.getESuperTypes().add(this.getGenericElementType());
		whenTypeEClass.getESuperTypes().add(this.getSequenceConstructor());
		withParamTypeEClass.getESuperTypes().add(this.getSequenceConstructor());

		// Initialize classes, features, and operations; add parameters
		initEClass(analyzeStringTypeEClass, AnalyzeStringType.class, "AnalyzeStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalyzeStringType_MatchingSubstring(), this.getSequenceConstructor(), null, "matchingSubstring", null, 0, 1, AnalyzeStringType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzeStringType_NonMatchingSubstring(), this.getSequenceConstructor(), null, "nonMatchingSubstring", null, 0, 1, AnalyzeStringType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzeStringType_Fallback(), this.getSequenceConstructor(), null, "fallback", null, 0, -1, AnalyzeStringType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzeStringType_Select(), this.getExpression(), "select", null, 1, 1, AnalyzeStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzeStringType_Regex(), this.getAvt(), "regex", null, 1, 1, AnalyzeStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzeStringType_Flags(), this.getAvt(), "flags", "", 0, 1, AnalyzeStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applyImportsTypeEClass, ApplyImportsType.class, "ApplyImportsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplyImportsType_WithParam(), this.getWithParamType(), null, "withParam", null, 0, -1, ApplyImportsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(applyTemplatesTypeEClass, ApplyTemplatesType.class, "ApplyTemplatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplyTemplatesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ApplyTemplatesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getApplyTemplatesType_Sort(), this.getSortType(), null, "sort", null, 0, -1, ApplyTemplatesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getApplyTemplatesType_WithParam(), this.getWithParamType(), null, "withParam", null, 0, -1, ApplyTemplatesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyTemplatesType_Select(), this.getExpression(), "select", "child::node()", 0, 1, ApplyTemplatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyTemplatesType_Mode(), this.getMode(), "mode", null, 0, 1, ApplyTemplatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSetTypeEClass, AttributeSetType.class, "AttributeSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeSetType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AttributeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeSetType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, AttributeSetType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSetType_Name(), this.getQName(), "name", null, 1, 1, AttributeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSetType_UseAttributeSets(), this.getQNames(), "useAttributeSets", "", 0, 1, AttributeSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Name(), this.getAvt(), "name", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Namespace(), this.getAvt(), "namespace", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Select(), this.getExpression(), "select", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Separator(), this.getAvt(), "separator", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Type(), this.getQName(), "type", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Validation(), this.getValidationType(), "validation", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callTemplateTypeEClass, CallTemplateType.class, "CallTemplateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallTemplateType_WithParam(), this.getWithParamType(), null, "withParam", null, 0, -1, CallTemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallTemplateType_Name(), this.getQName(), "name", null, 1, 1, CallTemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterMapTypeEClass, CharacterMapType.class, "CharacterMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacterMapType_OutputCharacter(), this.getOutputCharacterType(), null, "outputCharacter", null, 0, -1, CharacterMapType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterMapType_Name(), this.getQName(), "name", null, 1, 1, CharacterMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterMapType_UseCharacterMaps(), this.getQNames(), "useCharacterMaps", "", 0, 1, CharacterMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chooseTypeEClass, ChooseType.class, "ChooseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChooseType_When(), this.getWhenType(), null, "when", null, 1, -1, ChooseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChooseType_Otherwise(), this.getSequenceConstructor(), null, "otherwise", null, 0, 1, ChooseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(commentTypeEClass, CommentType.class, "CommentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentType_Select(), this.getExpression(), "select", null, 0, 1, CommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyOfTypeEClass, CopyOfType.class, "CopyOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyOfType_Select(), this.getExpression(), "select", null, 1, 1, CopyOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfType_CopyNamespaces(), this.getYesOrNo(), "copyNamespaces", "yes", 0, 1, CopyOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfType_Type(), this.getQName(), "type", null, 0, 1, CopyOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfType_Validation(), this.getValidationType(), "validation", null, 0, 1, CopyOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyTypeEClass, CopyType.class, "CopyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyType_CopyNamespaces(), this.getYesOrNo(), "copyNamespaces", "yes", 0, 1, CopyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyType_InheritNamespaces(), this.getYesOrNo(), "inheritNamespaces", "yes", 0, 1, CopyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyType_UseAttributeSets(), this.getQNames(), "useAttributeSets", "", 0, 1, CopyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyType_Type(), this.getQName(), "type", null, 0, 1, CopyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyType_Validation(), this.getValidationType(), "validation", null, 0, 1, CopyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalFormatTypeEClass, DecimalFormatType.class, "DecimalFormatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalFormatType_Name(), this.getQName(), "name", null, 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_DecimalSeparator(), this.getChar(), "decimalSeparator", ".", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_GroupingSeparator(), this.getChar(), "groupingSeparator", ",", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_Infinity(), theXMLTypePackage.getString(), "infinity", "Infinity", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_MinusSign(), this.getChar(), "minusSign", "-", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_NaN(), theXMLTypePackage.getString(), "naN", "NaN", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_Percent(), this.getChar(), "percent", "%", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_PerMille(), this.getChar(), "perMille", "\u2030", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_ZeroDigit(), this.getChar(), "zeroDigit", "0", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_Digit(), this.getChar(), "digit", "#", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalFormatType_PatternSeparator(), this.getChar(), "patternSeparator", ";", 0, 1, DecimalFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AnalyzeString(), this.getAnalyzeStringType(), null, "analyzeString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplyImports(), this.getApplyImportsType(), null, "applyImports", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplyTemplates(), this.getApplyTemplatesType(), null, "applyTemplates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AttributeSet(), this.getAttributeSetType(), null, "attributeSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Declaration(), this.getGenericElementType(), null, "declaration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CallTemplate(), this.getCallTemplateType(), null, "callTemplate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CharacterMap(), this.getCharacterMapType(), null, "characterMap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Choose(), this.getChooseType(), null, "choose", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Comment(), this.getCommentType(), null, "comment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Copy(), this.getCopyType(), null, "copy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CopyOf(), this.getCopyOfType(), null, "copyOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DecimalFormat(), this.getDecimalFormatType(), null, "decimalFormat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Document(), this.getDocumentType(), null, "document", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Element(), this.getElementType(), null, "element", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fallback(), this.getSequenceConstructor(), null, "fallback", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ForEach(), this.getForEachType(), null, "forEach", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ForEachGroup(), this.getForEachGroupType(), null, "forEachGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Function(), this.getFunctionType(), null, "function", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_If(), this.getIfType(), null, "if", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Import(), this.getImportType(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ImportSchema(), this.getImportSchemaType(), null, "importSchema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Include(), this.getIncludeType(), null, "include", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Key(), this.getKeyType(), null, "key", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MatchingSubstring(), this.getSequenceConstructor(), null, "matchingSubstring", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Message(), this.getMessageType(), null, "message", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Namespace(), this.getNamespaceType(), null, "namespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NamespaceAlias(), this.getNamespaceAliasType(), null, "namespaceAlias", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NextMatch(), this.getNextMatchType(), null, "nextMatch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NonMatchingSubstring(), this.getSequenceConstructor(), null, "nonMatchingSubstring", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Number(), this.getNumberType(), null, "number", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Otherwise(), this.getSequenceConstructor(), null, "otherwise", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Output(), this.getOutputType(), null, "output", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OutputCharacter(), this.getOutputCharacterType(), null, "outputCharacter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Param(), this.getParamType(), null, "param", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PerformSort(), this.getPerformSortType(), null, "performSort", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PreserveSpace(), this.getPreserveSpaceType(), null, "preserveSpace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProcessingInstruction(), this.getProcessingInstructionType(), null, "processingInstruction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ResultDocument(), this.getResultDocumentType(), null, "resultDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sort(), this.getSortType(), null, "sort", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StripSpace(), this.getStripSpaceType(), null, "stripSpace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Stylesheet(), this.getTransformType(), null, "stylesheet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transform(), this.getTransformType(), null, "transform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Template(), this.getTemplateType(), null, "template", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Text(), this.getTextType(), null, "text", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValueOf(), this.getValueOfType(), null, "valueOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Variable(), this.getVariableType(), null, "variable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_When(), this.getWhenType(), null, "when", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WithParam(), this.getWithParamType(), null, "withParam", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentTypeEClass, DocumentType.class, "DocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentType_Type(), this.getQName(), "type", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentType_Validation(), this.getValidationType(), "validation", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementOnlyVersionedElementTypeEClass, ElementOnlyVersionedElementType.class, "ElementOnlyVersionedElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementType_Name(), this.getAvt(), "name", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Namespace(), this.getAvt(), "namespace", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_InheritNamespaces(), this.getYesOrNo(), "inheritNamespaces", "yes", 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_UseAttributeSets(), this.getQNames(), "useAttributeSets", "", 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Type(), this.getQName(), "type", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Validation(), this.getValidationType(), "validation", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachGroupTypeEClass, ForEachGroupType.class, "ForEachGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEachGroupType_Sort(), this.getSortType(), null, "sort", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_SequenceConstructorGroup(), ecorePackage.getEFeatureMapEntry(), "sequenceConstructorGroup", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForEachGroupType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_InstructionGroup(), ecorePackage.getEFeatureMapEntry(), "instructionGroup", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForEachGroupType_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_LiteralResultElementGroup(), ecorePackage.getEFeatureMapEntry(), "literalResultElementGroup", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForEachGroupType_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, ForEachGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_Select(), this.getExpression(), "select", null, 1, 1, ForEachGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_GroupBy(), this.getExpression(), "groupBy", null, 0, 1, ForEachGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_GroupAdjacent(), this.getExpression(), "groupAdjacent", null, 0, 1, ForEachGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_GroupStartingWith(), this.getPattern(), "groupStartingWith", null, 0, 1, ForEachGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_GroupEndingWith(), this.getPattern(), "groupEndingWith", null, 0, 1, ForEachGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachGroupType_Collation(), theXMLTypePackage.getAnyURI(), "collation", null, 0, 1, ForEachGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachTypeEClass, ForEachType.class, "ForEachType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEachType_Sort(), this.getSortType(), null, "sort", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachType_SequenceConstructorGroup(), ecorePackage.getEFeatureMapEntry(), "sequenceConstructorGroup", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForEachType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachType_InstructionGroup(), ecorePackage.getEFeatureMapEntry(), "instructionGroup", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForEachType_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachType_LiteralResultElementGroup(), ecorePackage.getEFeatureMapEntry(), "literalResultElementGroup", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getForEachType_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, ForEachType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForEachType_Select(), this.getExpression(), "select", null, 1, 1, ForEachType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionType_Param(), this.getParamType(), null, "param", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_SequenceConstructorGroup(), ecorePackage.getEFeatureMapEntry(), "sequenceConstructorGroup", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_InstructionGroup(), ecorePackage.getEFeatureMapEntry(), "instructionGroup", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_LiteralResultElementGroup(), ecorePackage.getEFeatureMapEntry(), "literalResultElementGroup", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, FunctionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_Name(), this.getQName(), "name", null, 1, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_Override(), this.getYesOrNo(), "override", "yes", 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_As(), this.getSequenceType1(), "as", "item()*", 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericElementTypeEClass, GenericElementType.class, "GenericElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericElementType_DefaultCollation(), this.getUriList(), "defaultCollation", null, 0, 1, GenericElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElementType_ExcludeResultPrefixes(), this.getPrefixListOrAll(), "excludeResultPrefixes", null, 0, 1, GenericElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElementType_ExtensionElementPrefixes(), this.getPrefixList(), "extensionElementPrefixes", null, 0, 1, GenericElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElementType_UseWhen(), this.getExpression(), "useWhen", null, 0, 1, GenericElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElementType_XpathDefaultNamespace(), theXMLTypePackage.getAnyURI(), "xpathDefaultNamespace", null, 0, 1, GenericElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElementType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GenericElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifTypeEClass, IfType.class, "IfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIfType_Test(), this.getExpression(), "test", null, 1, 1, IfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importSchemaTypeEClass, ImportSchemaType.class, "ImportSchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportSchemaType_Schema(), theXMLSchema11Package.getSchemaType(), null, "schema", null, 0, 1, ImportSchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportSchemaType_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 0, 1, ImportSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportSchemaType_SchemaLocation(), theXMLTypePackage.getAnyURI(), "schemaLocation", null, 0, 1, ImportSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importTypeEClass, ImportType.class, "ImportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, ImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyTypeEClass, KeyType.class, "KeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyType_Name(), this.getQName(), "name", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_Match(), this.getPattern(), "match", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_Use(), this.getExpression(), "use", null, 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_Collation(), theXMLTypePackage.getAnyURI(), "collation", null, 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_Select(), this.getExpression(), "select", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_Terminate(), this.getAvt(), "terminate", "no", 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceAliasTypeEClass, NamespaceAliasType.class, "NamespaceAliasType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceAliasType_StylesheetPrefix(), this.getPrefixOrDefault(), "stylesheetPrefix", null, 1, 1, NamespaceAliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespaceAliasType_ResultPrefix(), this.getPrefixOrDefault(), "resultPrefix", null, 1, 1, NamespaceAliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceTypeEClass, NamespaceType.class, "NamespaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceType_Name(), this.getAvt(), "name", null, 1, 1, NamespaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespaceType_Select(), this.getExpression(), "select", null, 0, 1, NamespaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextMatchTypeEClass, NextMatchType.class, "NextMatchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNextMatchType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, NextMatchType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNextMatchType_WithParam(), this.getWithParamType(), null, "withParam", null, 0, -1, NextMatchType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNextMatchType_Fallback(), this.getSequenceConstructor(), null, "fallback", null, 0, -1, NextMatchType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(numberTypeEClass, NumberType.class, "NumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberType_Value(), this.getExpression(), "value", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Select(), this.getExpression(), "select", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Level(), this.getLevel(), "level", "single", 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Count(), this.getPattern(), "count", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_From(), this.getPattern(), "from", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Format(), this.getAvt(), "format", "1", 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Lang(), this.getAvt(), "lang", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_LetterValue(), this.getAvt(), "letterValue", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Ordinal(), this.getAvt(), "ordinal", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_GroupingSeparator(), this.getAvt(), "groupingSeparator", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_GroupingSize(), this.getAvt(), "groupingSize", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputCharacterTypeEClass, OutputCharacterType.class, "OutputCharacterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputCharacterType_Character(), this.getChar(), "character", null, 1, 1, OutputCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputCharacterType_String(), theXMLTypePackage.getString(), "string", null, 1, 1, OutputCharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputTypeEClass, OutputType.class, "OutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputType_Name(), this.getQName(), "name", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Method(), this.getMethod(), "method", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_ByteOrderMark(), this.getYesOrNo(), "byteOrderMark", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_CdataSectionElements(), this.getQNames(), "cdataSectionElements", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_DoctypePublic(), theXMLTypePackage.getString(), "doctypePublic", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_DoctypeSystem(), theXMLTypePackage.getString(), "doctypeSystem", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Encoding(), theXMLTypePackage.getString(), "encoding", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_EscapeUriAttributes(), this.getYesOrNo(), "escapeUriAttributes", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_IncludeContentType(), this.getYesOrNo(), "includeContentType", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Indent(), this.getYesOrNo(), "indent", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_MediaType(), theXMLTypePackage.getString(), "mediaType", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_NormalizationForm(), theXMLTypePackage.getNMTOKEN(), "normalizationForm", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_OmitXmlDeclaration(), this.getYesOrNo(), "omitXmlDeclaration", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Standalone(), this.getYesOrNoOrOmit(), "standalone", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_UndeclarePrefixes(), this.getYesOrNo(), "undeclarePrefixes", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_UseCharacterMaps(), this.getQNames(), "useCharacterMaps", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Version(), theXMLTypePackage.getNMTOKEN(), "version", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramTypeEClass, ParamType.class, "ParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamType_Name(), this.getQName(), "name", null, 1, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Select(), this.getExpression(), "select", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_As(), this.getSequenceType1(), "as", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Required(), this.getYesOrNo(), "required", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Tunnel(), this.getYesOrNo(), "tunnel", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performSortTypeEClass, PerformSortType.class, "PerformSortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformSortType_Sort(), this.getSortType(), null, "sort", null, 1, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformSortType_SequenceConstructorGroup(), ecorePackage.getEFeatureMapEntry(), "sequenceConstructorGroup", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPerformSortType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformSortType_InstructionGroup(), ecorePackage.getEFeatureMapEntry(), "instructionGroup", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPerformSortType_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformSortType_LiteralResultElementGroup(), ecorePackage.getEFeatureMapEntry(), "literalResultElementGroup", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPerformSortType_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformSortType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformSortType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, PerformSortType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformSortType_Select(), this.getExpression(), "select", null, 0, 1, PerformSortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preserveSpaceTypeEClass, PreserveSpaceType.class, "PreserveSpaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreserveSpaceType_Elements(), this.getNametests(), "elements", null, 1, 1, PreserveSpaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingInstructionTypeEClass, ProcessingInstructionType.class, "ProcessingInstructionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingInstructionType_Name(), this.getAvt(), "name", null, 1, 1, ProcessingInstructionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingInstructionType_Select(), this.getExpression(), "select", null, 0, 1, ProcessingInstructionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultDocumentTypeEClass, ResultDocumentType.class, "ResultDocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultDocumentType_Format(), this.getAvt(), "format", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Href(), this.getAvt(), "href", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Type(), this.getQName(), "type", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Validation(), this.getValidationType(), "validation", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Method(), this.getAvt(), "method", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_ByteOrderMark(), this.getAvt(), "byteOrderMark", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_CdataSectionElements(), this.getAvt(), "cdataSectionElements", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_DoctypePublic(), this.getAvt(), "doctypePublic", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_DoctypeSystem(), this.getAvt(), "doctypeSystem", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Encoding(), this.getAvt(), "encoding", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_EscapeUriAttributes(), this.getAvt(), "escapeUriAttributes", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_IncludeContentType(), this.getAvt(), "includeContentType", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Indent(), this.getAvt(), "indent", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_MediaType(), this.getAvt(), "mediaType", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_NormalizationForm(), this.getAvt(), "normalizationForm", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_OmitXmlDeclaration(), this.getAvt(), "omitXmlDeclaration", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_Standalone(), this.getAvt(), "standalone", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_UndeclarePrefixes(), this.getAvt(), "undeclarePrefixes", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_UseCharacterMaps(), this.getQNames(), "useCharacterMaps", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDocumentType_OutputVersion(), this.getAvt(), "outputVersion", null, 0, 1, ResultDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceConstructorEClass, SequenceConstructor.class, "SequenceConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceConstructor_SequenceConstructorGroup(), ecorePackage.getEFeatureMapEntry(), "sequenceConstructorGroup", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceConstructor_Variable(), this.getVariableType(), null, "variable", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceConstructor_InstructionGroup(), ecorePackage.getEFeatureMapEntry(), "instructionGroup", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceConstructor_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceConstructor_LiteralResultElementGroup(), ecorePackage.getEFeatureMapEntry(), "literalResultElementGroup", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceConstructor_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceConstructor_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceConstructor_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, SequenceConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Fallback(), this.getSequenceConstructor(), null, "fallback", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceType_Select(), this.getExpression(), "select", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortTypeEClass, SortType.class, "SortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortType_Select(), this.getExpression(), "select", null, 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortType_Lang(), this.getAvt(), "lang", null, 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortType_DataType(), this.getAvt(), "dataType", "text", 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortType_Order(), this.getAvt(), "order", "ascending", 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortType_CaseOrder(), this.getAvt(), "caseOrder", null, 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortType_Collation(), this.getAvt(), "collation", null, 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortType_Stable(), this.getYesOrNo(), "stable", null, 0, 1, SortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stripSpaceTypeEClass, StripSpaceType.class, "StripSpaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStripSpaceType_Elements(), this.getNametests(), "elements", null, 1, 1, StripSpaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateTypeEClass, TemplateType.class, "TemplateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateType_Param(), this.getParamType(), null, "param", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_SequenceConstructorGroup(), ecorePackage.getEFeatureMapEntry(), "sequenceConstructorGroup", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_InstructionGroup(), ecorePackage.getEFeatureMapEntry(), "instructionGroup", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateType_Instruction(), this.getVersionedElementType(), null, "instruction", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_LiteralResultElementGroup(), ecorePackage.getEFeatureMapEntry(), "literalResultElementGroup", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateType_LiteralResultElement(), ecorePackage.getEObject(), null, "literalResultElement", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, TemplateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Match(), this.getPattern(), "match", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Priority(), theXMLTypePackage.getDecimal(), "priority", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Mode(), this.getModes(), "mode", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Name(), this.getQName(), "name", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_As(), this.getSequenceType1(), "as", "item()*", 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textElementBaseTypeEClass, TextElementBaseType.class, "TextElementBaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextElementBaseType_Value(), this.getTextElementBaseTypeBaseBase(), "value", null, 0, 1, TextElementBaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextType_DisableOutputEscaping(), this.getYesOrNo(), "disableOutputEscaping", "no", 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformElementBaseTypeEClass, TransformElementBaseType.class, "TransformElementBaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformTypeEClass, TransformType.class, "TransformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformType_Import(), this.getImportType(), null, "import", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_DeclarationGroup(), ecorePackage.getEFeatureMapEntry(), "declarationGroup", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransformType_Declaration(), this.getGenericElementType(), null, "declaration", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransformType_Variable(), this.getVariableType(), null, "variable", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransformType_Param(), this.getParamType(), null, "param", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_DefaultValidation(), this.getValidationStripOrPreserve(), "defaultValidation", "strip", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_InputTypeAnnotations(), this.getInputTypeAnnotationsType(), "inputTypeAnnotations", "unspecified", 0, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueOfTypeEClass, ValueOfType.class, "ValueOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueOfType_Select(), this.getExpression(), "select", null, 0, 1, ValueOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueOfType_Separator(), this.getAvt(), "separator", null, 0, 1, ValueOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueOfType_DisableOutputEscaping(), this.getYesOrNo(), "disableOutputEscaping", "no", 0, 1, ValueOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableType_Name(), this.getQName(), "name", null, 1, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableType_Select(), this.getExpression(), "select", null, 0, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableType_As(), this.getSequenceType1(), "as", null, 0, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedElementTypeEClass, VersionedElementType.class, "VersionedElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedElementType_Version(), theXMLTypePackage.getDecimal(), "version", null, 0, 1, VersionedElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenTypeEClass, WhenType.class, "WhenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenType_Test(), this.getExpression(), "test", null, 1, 1, WhenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(withParamTypeEClass, WithParamType.class, "WithParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWithParamType_Name(), this.getQName(), "name", null, 1, 1, WithParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithParamType_Select(), this.getExpression(), "select", null, 0, 1, WithParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithParamType_As(), this.getSequenceType1(), "as", null, 0, 1, WithParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithParamType_Tunnel(), this.getYesOrNo(), "tunnel", null, 0, 1, WithParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(inputTypeAnnotationsTypeEEnum, InputTypeAnnotationsType.class, "InputTypeAnnotationsType");
		addEEnumLiteral(inputTypeAnnotationsTypeEEnum, InputTypeAnnotationsType.PRESERVE);
		addEEnumLiteral(inputTypeAnnotationsTypeEEnum, InputTypeAnnotationsType.STRIP);
		addEEnumLiteral(inputTypeAnnotationsTypeEEnum, InputTypeAnnotationsType.UNSPECIFIED);

		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.SINGLE);
		addEEnumLiteral(levelEEnum, Level.MULTIPLE);
		addEEnumLiteral(levelEEnum, Level.ANY);

		initEEnum(methodMember0EEnum, MethodMember0.class, "MethodMember0");
		addEEnumLiteral(methodMember0EEnum, MethodMember0.XML);
		addEEnumLiteral(methodMember0EEnum, MethodMember0.XHTML);
		addEEnumLiteral(methodMember0EEnum, MethodMember0.HTML);
		addEEnumLiteral(methodMember0EEnum, MethodMember0.TEXT);

		initEEnum(modeMember1EEnum, ModeMember1.class, "ModeMember1");
		addEEnumLiteral(modeMember1EEnum, ModeMember1.DEFAULT);
		addEEnumLiteral(modeMember1EEnum, ModeMember1.CURRENT);

		initEEnum(modesMember0ItemMember1EEnum, ModesMember0ItemMember1.class, "ModesMember0ItemMember1");
		addEEnumLiteral(modesMember0ItemMember1EEnum, ModesMember0ItemMember1.DEFAULT);

		initEEnum(modesMember1EEnum, ModesMember1.class, "ModesMember1");
		addEEnumLiteral(modesMember1EEnum, ModesMember1.ALL);

		initEEnum(nametestsItemMember1EEnum, NametestsItemMember1.class, "NametestsItemMember1");
		addEEnumLiteral(nametestsItemMember1EEnum, NametestsItemMember1.ANY);

		initEEnum(prefixListOrAllMember1EEnum, PrefixListOrAllMember1.class, "PrefixListOrAllMember1");
		addEEnumLiteral(prefixListOrAllMember1EEnum, PrefixListOrAllMember1.ALL);

		initEEnum(prefixOrDefaultMember1EEnum, PrefixOrDefaultMember1.class, "PrefixOrDefaultMember1");
		addEEnumLiteral(prefixOrDefaultMember1EEnum, PrefixOrDefaultMember1.DEFAULT);

		initEEnum(validationStripOrPreserveEEnum, ValidationStripOrPreserve.class, "ValidationStripOrPreserve");
		addEEnumLiteral(validationStripOrPreserveEEnum, ValidationStripOrPreserve.PRESERVE);
		addEEnumLiteral(validationStripOrPreserveEEnum, ValidationStripOrPreserve.STRIP);

		initEEnum(validationTypeEEnum, ValidationType.class, "ValidationType");
		addEEnumLiteral(validationTypeEEnum, ValidationType.STRICT);
		addEEnumLiteral(validationTypeEEnum, ValidationType.LAX);
		addEEnumLiteral(validationTypeEEnum, ValidationType.PRESERVE);
		addEEnumLiteral(validationTypeEEnum, ValidationType.STRIP);

		initEEnum(yesOrNoEEnum, YesOrNo.class, "YesOrNo");
		addEEnumLiteral(yesOrNoEEnum, YesOrNo.YES);
		addEEnumLiteral(yesOrNoEEnum, YesOrNo.NO);

		initEEnum(yesOrNoOrOmitEEnum, YesOrNoOrOmit.class, "YesOrNoOrOmit");
		addEEnumLiteral(yesOrNoOrOmitEEnum, YesOrNoOrOmit.YES);
		addEEnumLiteral(yesOrNoOrOmitEEnum, YesOrNoOrOmit.NO);
		addEEnumLiteral(yesOrNoOrOmitEEnum, YesOrNoOrOmit.OMIT);

		// Initialize data types
		initEDataType(avtEDataType, String.class, "Avt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charEDataType, String.class, "Char", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(expressionEDataType, String.class, "Expression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputTypeAnnotationsTypeObjectEDataType, InputTypeAnnotationsType.class, "InputTypeAnnotationsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(levelObjectEDataType, Level.class, "LevelObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(methodEDataType, Object.class, "Method", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(methodMember0ObjectEDataType, MethodMember0.class, "MethodMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(methodMember1EDataType, String.class, "MethodMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modeEDataType, Object.class, "Mode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modeMember1ObjectEDataType, ModeMember1.class, "ModeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modesEDataType, Object.class, "Modes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modesMember0EDataType, List.class, "ModesMember0", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modesMember0ItemEDataType, Object.class, "ModesMember0Item", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modesMember0ItemMember1ObjectEDataType, ModesMember0ItemMember1.class, "ModesMember0ItemMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modesMember1ObjectEDataType, ModesMember1.class, "ModesMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nametestsEDataType, List.class, "Nametests", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nametestsItemEDataType, Object.class, "NametestsItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nametestsItemMember1ObjectEDataType, NametestsItemMember1.class, "NametestsItemMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nametestsItemMember2EDataType, String.class, "NametestsItemMember2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(patternEDataType, String.class, "Pattern", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prefixesEDataType, List.class, "Prefixes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prefixListEDataType, List.class, "PrefixList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prefixListOrAllEDataType, Object.class, "PrefixListOrAll", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prefixListOrAllMember1ObjectEDataType, PrefixListOrAllMember1.class, "PrefixListOrAllMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prefixOrDefaultEDataType, Object.class, "PrefixOrDefault", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prefixOrDefaultMember1ObjectEDataType, PrefixOrDefaultMember1.class, "PrefixOrDefaultMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qNameEDataType, String.class, "QName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qNamesEDataType, List.class, "QNames", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sequenceType1EDataType, String.class, "SequenceType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textElementBaseTypeBaseEDataType, String.class, "TextElementBaseTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textElementBaseTypeBaseBaseEDataType, String.class, "TextElementBaseTypeBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriListEDataType, List.class, "UriList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(validationStripOrPreserveObjectEDataType, ValidationStripOrPreserve.class, "ValidationStripOrPreserveObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(validationTypeObjectEDataType, ValidationType.class, "ValidationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yesOrNoObjectEDataType, YesOrNo.class, "YesOrNoObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yesOrNoOrOmitObjectEDataType, YesOrNoOrOmit.class, "YesOrNoOrOmitObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (analyzeStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "analyze-string_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAnalyzeStringType_MatchingSubstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "matching-substring",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnalyzeStringType_NonMatchingSubstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "non-matching-substring",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnalyzeStringType_Fallback(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fallback",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnalyzeStringType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getAnalyzeStringType_Regex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "regex"
		   });	
		addAnnotation
		  (getAnalyzeStringType_Flags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flags"
		   });	
		addAnnotation
		  (applyImportsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "apply-imports_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getApplyImportsType_WithParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "with-param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (applyTemplatesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "apply-templates_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getApplyTemplatesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:8"
		   });	
		addAnnotation
		  (getApplyTemplatesType_Sort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sort",
			 "namespace", "##targetNamespace",
			 "group", "#group:8"
		   });	
		addAnnotation
		  (getApplyTemplatesType_WithParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "with-param",
			 "namespace", "##targetNamespace",
			 "group", "#group:8"
		   });	
		addAnnotation
		  (getApplyTemplatesType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getApplyTemplatesType_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });	
		addAnnotation
		  (attributeSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "attribute-set_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAttributeSetType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:8"
		   });	
		addAnnotation
		  (getAttributeSetType_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "group", "#group:8"
		   });	
		addAnnotation
		  (getAttributeSetType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getAttributeSetType_UseAttributeSets(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-attribute-sets"
		   });	
		addAnnotation
		  (attributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "attribute_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAttributeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getAttributeType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });	
		addAnnotation
		  (getAttributeType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getAttributeType_Separator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "separator"
		   });	
		addAnnotation
		  (getAttributeType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getAttributeType_Validation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "validation"
		   });	
		addAnnotation
		  (avtEDataType, 
		   source, 
		   new String[] {
			 "name", "avt",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (callTemplateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "call-template_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCallTemplateType_WithParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "with-param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCallTemplateType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (charEDataType, 
		   source, 
		   new String[] {
			 "name", "char",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "1"
		   });	
		addAnnotation
		  (characterMapTypeEClass, 
		   source, 
		   new String[] {
			 "name", "character-map_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCharacterMapType_OutputCharacter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "output-character",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCharacterMapType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getCharacterMapType_UseCharacterMaps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-character-maps"
		   });	
		addAnnotation
		  (chooseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "choose_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getChooseType_When(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "when",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChooseType_Otherwise(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otherwise",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (commentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "comment_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCommentType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (copyOfTypeEClass, 
		   source, 
		   new String[] {
			 "name", "copy-of_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCopyOfType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getCopyOfType_CopyNamespaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "copy-namespaces"
		   });	
		addAnnotation
		  (getCopyOfType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getCopyOfType_Validation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "validation"
		   });	
		addAnnotation
		  (copyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "copy_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCopyType_CopyNamespaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "copy-namespaces"
		   });	
		addAnnotation
		  (getCopyType_InheritNamespaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inherit-namespaces"
		   });	
		addAnnotation
		  (getCopyType_UseAttributeSets(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-attribute-sets"
		   });	
		addAnnotation
		  (getCopyType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getCopyType_Validation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "validation"
		   });	
		addAnnotation
		  (decimalFormatTypeEClass, 
		   source, 
		   new String[] {
			 "name", "decimal-format_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDecimalFormatType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getDecimalFormatType_DecimalSeparator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-separator"
		   });	
		addAnnotation
		  (getDecimalFormatType_GroupingSeparator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping-separator"
		   });	
		addAnnotation
		  (getDecimalFormatType_Infinity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "infinity"
		   });	
		addAnnotation
		  (getDecimalFormatType_MinusSign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minus-sign"
		   });	
		addAnnotation
		  (getDecimalFormatType_NaN(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NaN"
		   });	
		addAnnotation
		  (getDecimalFormatType_Percent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "percent"
		   });	
		addAnnotation
		  (getDecimalFormatType_PerMille(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "per-mille"
		   });	
		addAnnotation
		  (getDecimalFormatType_ZeroDigit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "zero-digit"
		   });	
		addAnnotation
		  (getDecimalFormatType_Digit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "digit"
		   });	
		addAnnotation
		  (getDecimalFormatType_PatternSeparator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pattern-separator"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_AnalyzeString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "analyze-string",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ApplyImports(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "apply-imports",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_ApplyTemplates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "apply-templates",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_AttributeSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute-set",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Declaration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "declaration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_CallTemplate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-template",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_CharacterMap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "character-map",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Choose(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "choose",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "comment",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Copy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "copy",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_CopyOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "copy-of",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_DecimalFormat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "decimal-format",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Document(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Element(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "element",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Fallback(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fallback",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_ForEach(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "for-each",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_ForEachGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "for-each-group",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_If(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "if",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ImportSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import-schema",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_MatchingSubstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "matching-substring",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Message(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "message",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "namespace",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_NamespaceAlias(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "namespace-alias",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_NextMatch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "next-match",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_NonMatchingSubstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "non-matching-substring",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Otherwise(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otherwise",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Output(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "output",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_OutputCharacter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "output-character",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_PerformSort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "perform-sort",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_PreserveSpace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preserve-space",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_ProcessingInstruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processing-instruction",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_ResultDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result-document",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Sequence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Sort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_StripSpace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strip-space",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Stylesheet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stylesheet",
			 "namespace", "##targetNamespace",
			 "affiliation", "transform"
		   });	
		addAnnotation
		  (getDocumentRoot_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Template(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "template",
			 "namespace", "##targetNamespace",
			 "affiliation", "declaration"
		   });	
		addAnnotation
		  (getDocumentRoot_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_ValueOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value-of",
			 "namespace", "##targetNamespace",
			 "affiliation", "instruction"
		   });	
		addAnnotation
		  (getDocumentRoot_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_When(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "when",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_WithParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "with-param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getDocumentType_Validation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "validation"
		   });	
		addAnnotation
		  (elementOnlyVersionedElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "element-only-versioned-element-type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (elementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "element_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getElementType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getElementType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });	
		addAnnotation
		  (getElementType_InheritNamespaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inherit-namespaces"
		   });	
		addAnnotation
		  (getElementType_UseAttributeSets(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-attribute-sets"
		   });	
		addAnnotation
		  (getElementType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getElementType_Validation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "validation"
		   });	
		addAnnotation
		  (expressionEDataType, 
		   source, 
		   new String[] {
			 "name", "expression",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", ".+"
		   });	
		addAnnotation
		  (forEachGroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "for-each-group_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getForEachGroupType_Sort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getForEachGroupType_SequenceConstructorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachGroupType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachGroupType_InstructionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "instruction:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachGroupType_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace",
			 "group", "instruction:group"
		   });	
		addAnnotation
		  (getForEachGroupType_LiteralResultElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "literal-result-element:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachGroupType_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace",
			 "group", "literal-result-element:group"
		   });	
		addAnnotation
		  (getForEachGroupType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachGroupType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":16",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachGroupType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getForEachGroupType_GroupBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-by"
		   });	
		addAnnotation
		  (getForEachGroupType_GroupAdjacent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-adjacent"
		   });	
		addAnnotation
		  (getForEachGroupType_GroupStartingWith(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-starting-with"
		   });	
		addAnnotation
		  (getForEachGroupType_GroupEndingWith(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-ending-with"
		   });	
		addAnnotation
		  (getForEachGroupType_Collation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "collation"
		   });	
		addAnnotation
		  (forEachTypeEClass, 
		   source, 
		   new String[] {
			 "name", "for-each_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getForEachType_Sort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getForEachType_SequenceConstructorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachType_InstructionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "instruction:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachType_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace",
			 "group", "instruction:group"
		   });	
		addAnnotation
		  (getForEachType_LiteralResultElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "literal-result-element:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachType_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace",
			 "group", "literal-result-element:group"
		   });	
		addAnnotation
		  (getForEachType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":16",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getForEachType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (functionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "function_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getFunctionType_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFunctionType_SequenceConstructorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getFunctionType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getFunctionType_InstructionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "instruction:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getFunctionType_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace",
			 "group", "instruction:group"
		   });	
		addAnnotation
		  (getFunctionType_LiteralResultElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "literal-result-element:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getFunctionType_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace",
			 "group", "literal-result-element:group"
		   });	
		addAnnotation
		  (getFunctionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getFunctionType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":16",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getFunctionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getFunctionType_Override(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "override"
		   });	
		addAnnotation
		  (getFunctionType_As(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "as"
		   });	
		addAnnotation
		  (genericElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "generic-element-type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getGenericElementType_DefaultCollation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-collation"
		   });	
		addAnnotation
		  (getGenericElementType_ExcludeResultPrefixes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exclude-result-prefixes"
		   });	
		addAnnotation
		  (getGenericElementType_ExtensionElementPrefixes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extension-element-prefixes"
		   });	
		addAnnotation
		  (getGenericElementType_UseWhen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-when"
		   });	
		addAnnotation
		  (getGenericElementType_XpathDefaultNamespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xpath-default-namespace"
		   });	
		addAnnotation
		  (getGenericElementType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "lax"
		   });	
		addAnnotation
		  (ifTypeEClass, 
		   source, 
		   new String[] {
			 "name", "if_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getIfType_Test(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "test"
		   });	
		addAnnotation
		  (importSchemaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "import-schema_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getImportSchemaType_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "http://www.w3.org/2001/XMLSchema"
		   });	
		addAnnotation
		  (getImportSchemaType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });	
		addAnnotation
		  (getImportSchemaType_SchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema-location"
		   });	
		addAnnotation
		  (importTypeEClass, 
		   source, 
		   new String[] {
			 "name", "import_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getImportType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });	
		addAnnotation
		  (includeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "include_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getIncludeType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });	
		addAnnotation
		  (inputTypeAnnotationsTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "input-type-annotations-type"
		   });	
		addAnnotation
		  (inputTypeAnnotationsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "input-type-annotations-type:Object",
			 "baseType", "input-type-annotations-type"
		   });	
		addAnnotation
		  (keyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "key_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getKeyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getKeyType_Match(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "match"
		   });	
		addAnnotation
		  (getKeyType_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });	
		addAnnotation
		  (getKeyType_Collation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "collation"
		   });	
		addAnnotation
		  (levelEEnum, 
		   source, 
		   new String[] {
			 "name", "level"
		   });	
		addAnnotation
		  (levelObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "level:Object",
			 "baseType", "level"
		   });	
		addAnnotation
		  (messageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "message_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getMessageType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getMessageType_Terminate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "terminate"
		   });	
		addAnnotation
		  (methodEDataType, 
		   source, 
		   new String[] {
			 "name", "method",
			 "memberTypes", "method_._member_._0 method_._member_._1"
		   });	
		addAnnotation
		  (methodMember0EEnum, 
		   source, 
		   new String[] {
			 "name", "method_._member_._0"
		   });	
		addAnnotation
		  (methodMember0ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "method_._member_._0:Object",
			 "baseType", "method_._member_._0"
		   });	
		addAnnotation
		  (methodMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "method_._member_._1",
			 "baseType", "QName",
			 "pattern", "\\c*:\\c*"
		   });	
		addAnnotation
		  (modeEDataType, 
		   source, 
		   new String[] {
			 "name", "mode",
			 "memberTypes", "QName mode_._member_._1"
		   });	
		addAnnotation
		  (modeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "mode_._member_._1"
		   });	
		addAnnotation
		  (modeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mode_._member_._1:Object",
			 "baseType", "mode_._member_._1"
		   });	
		addAnnotation
		  (modesEDataType, 
		   source, 
		   new String[] {
			 "name", "modes",
			 "memberTypes", "modes_._member_._0 modes_._member_._1"
		   });	
		addAnnotation
		  (modesMember0EDataType, 
		   source, 
		   new String[] {
			 "name", "modes_._member_._0",
			 "itemType", "modes_._member_._0_._item"
		   });	
		addAnnotation
		  (modesMember0ItemEDataType, 
		   source, 
		   new String[] {
			 "name", "modes_._member_._0_._item",
			 "memberTypes", "QName modes_._member_._0_._item_._member_._1"
		   });	
		addAnnotation
		  (modesMember0ItemMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "modes_._member_._0_._item_._member_._1"
		   });	
		addAnnotation
		  (modesMember0ItemMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "modes_._member_._0_._item_._member_._1:Object",
			 "baseType", "modes_._member_._0_._item_._member_._1"
		   });	
		addAnnotation
		  (modesMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "modes_._member_._1"
		   });	
		addAnnotation
		  (modesMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "modes_._member_._1:Object",
			 "baseType", "modes_._member_._1"
		   });	
		addAnnotation
		  (namespaceAliasTypeEClass, 
		   source, 
		   new String[] {
			 "name", "namespace-alias_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNamespaceAliasType_StylesheetPrefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stylesheet-prefix"
		   });	
		addAnnotation
		  (getNamespaceAliasType_ResultPrefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "result-prefix"
		   });	
		addAnnotation
		  (namespaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "namespace_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNamespaceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getNamespaceType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (nametestsEDataType, 
		   source, 
		   new String[] {
			 "name", "nametests",
			 "itemType", "nametests_._item"
		   });	
		addAnnotation
		  (nametestsItemEDataType, 
		   source, 
		   new String[] {
			 "name", "nametests_._item",
			 "memberTypes", "QName nametests_._item_._member_._1 nametests_._item_._member_._2"
		   });	
		addAnnotation
		  (nametestsItemMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "nametests_._item_._member_._1"
		   });	
		addAnnotation
		  (nametestsItemMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "nametests_._item_._member_._1:Object",
			 "baseType", "nametests_._item_._member_._1"
		   });	
		addAnnotation
		  (nametestsItemMember2EDataType, 
		   source, 
		   new String[] {
			 "name", "nametests_._item_._member_._2",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "\\i\\c*:\\* \\*:\\i\\c*"
		   });	
		addAnnotation
		  (nextMatchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "next-match_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNextMatchType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:8"
		   });	
		addAnnotation
		  (getNextMatchType_WithParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "with-param",
			 "namespace", "##targetNamespace",
			 "group", "#group:8"
		   });	
		addAnnotation
		  (getNextMatchType_Fallback(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fallback",
			 "namespace", "##targetNamespace",
			 "group", "#group:8"
		   });	
		addAnnotation
		  (numberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "number_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNumberType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (getNumberType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getNumberType_Level(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "level"
		   });	
		addAnnotation
		  (getNumberType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });	
		addAnnotation
		  (getNumberType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from"
		   });	
		addAnnotation
		  (getNumberType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format"
		   });	
		addAnnotation
		  (getNumberType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang"
		   });	
		addAnnotation
		  (getNumberType_LetterValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "letter-value"
		   });	
		addAnnotation
		  (getNumberType_Ordinal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ordinal"
		   });	
		addAnnotation
		  (getNumberType_GroupingSeparator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping-separator"
		   });	
		addAnnotation
		  (getNumberType_GroupingSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping-size"
		   });	
		addAnnotation
		  (outputCharacterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "output-character_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getOutputCharacterType_Character(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "character"
		   });	
		addAnnotation
		  (getOutputCharacterType_String(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "string"
		   });	
		addAnnotation
		  (outputTypeEClass, 
		   source, 
		   new String[] {
			 "name", "output_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getOutputType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getOutputType_Method(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method"
		   });	
		addAnnotation
		  (getOutputType_ByteOrderMark(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "byte-order-mark"
		   });	
		addAnnotation
		  (getOutputType_CdataSectionElements(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cdata-section-elements"
		   });	
		addAnnotation
		  (getOutputType_DoctypePublic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "doctype-public"
		   });	
		addAnnotation
		  (getOutputType_DoctypeSystem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "doctype-system"
		   });	
		addAnnotation
		  (getOutputType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoding"
		   });	
		addAnnotation
		  (getOutputType_EscapeUriAttributes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "escape-uri-attributes"
		   });	
		addAnnotation
		  (getOutputType_IncludeContentType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "include-content-type"
		   });	
		addAnnotation
		  (getOutputType_Indent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "indent"
		   });	
		addAnnotation
		  (getOutputType_MediaType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "media-type"
		   });	
		addAnnotation
		  (getOutputType_NormalizationForm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "normalization-form"
		   });	
		addAnnotation
		  (getOutputType_OmitXmlDeclaration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "omit-xml-declaration"
		   });	
		addAnnotation
		  (getOutputType_Standalone(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "standalone"
		   });	
		addAnnotation
		  (getOutputType_UndeclarePrefixes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "undeclare-prefixes"
		   });	
		addAnnotation
		  (getOutputType_UseCharacterMaps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-character-maps"
		   });	
		addAnnotation
		  (getOutputType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (paramTypeEClass, 
		   source, 
		   new String[] {
			 "name", "param_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getParamType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getParamType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getParamType_As(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "as"
		   });	
		addAnnotation
		  (getParamType_Required(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "required"
		   });	
		addAnnotation
		  (getParamType_Tunnel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tunnel"
		   });	
		addAnnotation
		  (patternEDataType, 
		   source, 
		   new String[] {
			 "name", "pattern",
			 "baseType", "expression"
		   });	
		addAnnotation
		  (performSortTypeEClass, 
		   source, 
		   new String[] {
			 "name", "perform-sort_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getPerformSortType_Sort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sort",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPerformSortType_SequenceConstructorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getPerformSortType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getPerformSortType_InstructionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "instruction:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getPerformSortType_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace",
			 "group", "instruction:group"
		   });	
		addAnnotation
		  (getPerformSortType_LiteralResultElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "literal-result-element:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getPerformSortType_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace",
			 "group", "literal-result-element:group"
		   });	
		addAnnotation
		  (getPerformSortType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getPerformSortType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":16",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getPerformSortType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (prefixesEDataType, 
		   source, 
		   new String[] {
			 "name", "prefixes",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#NCName"
		   });	
		addAnnotation
		  (prefixListEDataType, 
		   source, 
		   new String[] {
			 "name", "prefix-list",
			 "itemType", "prefix-or-default"
		   });	
		addAnnotation
		  (prefixListOrAllEDataType, 
		   source, 
		   new String[] {
			 "name", "prefix-list-or-all",
			 "memberTypes", "prefix-list prefix-list-or-all_._member_._1"
		   });	
		addAnnotation
		  (prefixListOrAllMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "prefix-list-or-all_._member_._1"
		   });	
		addAnnotation
		  (prefixListOrAllMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "prefix-list-or-all_._member_._1:Object",
			 "baseType", "prefix-list-or-all_._member_._1"
		   });	
		addAnnotation
		  (prefixOrDefaultEDataType, 
		   source, 
		   new String[] {
			 "name", "prefix-or-default",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#NCName prefix-or-default_._member_._1"
		   });	
		addAnnotation
		  (prefixOrDefaultMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "prefix-or-default_._member_._1"
		   });	
		addAnnotation
		  (prefixOrDefaultMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "prefix-or-default_._member_._1:Object",
			 "baseType", "prefix-or-default_._member_._1"
		   });	
		addAnnotation
		  (preserveSpaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "preserve-space_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getPreserveSpaceType_Elements(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elements"
		   });	
		addAnnotation
		  (processingInstructionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "processing-instruction_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getProcessingInstructionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getProcessingInstructionType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (qNameEDataType, 
		   source, 
		   new String[] {
			 "name", "QName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#Name",
			 "pattern", "([^:]+:)?[^:]+"
		   });	
		addAnnotation
		  (qNamesEDataType, 
		   source, 
		   new String[] {
			 "name", "QNames",
			 "itemType", "QName"
		   });	
		addAnnotation
		  (resultDocumentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "result-document_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getResultDocumentType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format"
		   });	
		addAnnotation
		  (getResultDocumentType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });	
		addAnnotation
		  (getResultDocumentType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getResultDocumentType_Validation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "validation"
		   });	
		addAnnotation
		  (getResultDocumentType_Method(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method"
		   });	
		addAnnotation
		  (getResultDocumentType_ByteOrderMark(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "byte-order-mark"
		   });	
		addAnnotation
		  (getResultDocumentType_CdataSectionElements(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cdata-section-elements"
		   });	
		addAnnotation
		  (getResultDocumentType_DoctypePublic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "doctype-public"
		   });	
		addAnnotation
		  (getResultDocumentType_DoctypeSystem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "doctype-system"
		   });	
		addAnnotation
		  (getResultDocumentType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoding"
		   });	
		addAnnotation
		  (getResultDocumentType_EscapeUriAttributes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "escape-uri-attributes"
		   });	
		addAnnotation
		  (getResultDocumentType_IncludeContentType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "include-content-type"
		   });	
		addAnnotation
		  (getResultDocumentType_Indent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "indent"
		   });	
		addAnnotation
		  (getResultDocumentType_MediaType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "media-type"
		   });	
		addAnnotation
		  (getResultDocumentType_NormalizationForm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "normalization-form"
		   });	
		addAnnotation
		  (getResultDocumentType_OmitXmlDeclaration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "omit-xml-declaration"
		   });	
		addAnnotation
		  (getResultDocumentType_Standalone(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "standalone"
		   });	
		addAnnotation
		  (getResultDocumentType_UndeclarePrefixes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "undeclare-prefixes"
		   });	
		addAnnotation
		  (getResultDocumentType_UseCharacterMaps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-character-maps"
		   });	
		addAnnotation
		  (getResultDocumentType_OutputVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "output-version"
		   });	
		addAnnotation
		  (sequenceConstructorEClass, 
		   source, 
		   new String[] {
			 "name", "sequence-constructor",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSequenceConstructor_SequenceConstructorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SequenceConstructorGroup:8"
		   });	
		addAnnotation
		  (getSequenceConstructor_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:8"
		   });	
		addAnnotation
		  (getSequenceConstructor_InstructionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "instruction:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:8"
		   });	
		addAnnotation
		  (getSequenceConstructor_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace",
			 "group", "instruction:group"
		   });	
		addAnnotation
		  (getSequenceConstructor_LiteralResultElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "literal-result-element:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:8"
		   });	
		addAnnotation
		  (getSequenceConstructor_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace",
			 "group", "literal-result-element:group"
		   });	
		addAnnotation
		  (getSequenceConstructor_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":14",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:8"
		   });	
		addAnnotation
		  (getSequenceConstructor_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":15",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:8"
		   });	
		addAnnotation
		  (sequenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sequence_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSequenceType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:8"
		   });	
		addAnnotation
		  (getSequenceType_Fallback(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fallback",
			 "namespace", "##targetNamespace",
			 "group", "#group:8"
		   });	
		addAnnotation
		  (getSequenceType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (sequenceType1EDataType, 
		   source, 
		   new String[] {
			 "name", "sequence-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", ".+"
		   });	
		addAnnotation
		  (sortTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sort_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSortType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getSortType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang"
		   });	
		addAnnotation
		  (getSortType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-type"
		   });	
		addAnnotation
		  (getSortType_Order(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "order"
		   });	
		addAnnotation
		  (getSortType_CaseOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "case-order"
		   });	
		addAnnotation
		  (getSortType_Collation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "collation"
		   });	
		addAnnotation
		  (getSortType_Stable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stable"
		   });	
		addAnnotation
		  (stripSpaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "strip-space_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getStripSpaceType_Elements(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elements"
		   });	
		addAnnotation
		  (templateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "template_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getTemplateType_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTemplateType_SequenceConstructorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getTemplateType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getTemplateType_InstructionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "instruction:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getTemplateType_Instruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instruction",
			 "namespace", "##targetNamespace",
			 "group", "instruction:group"
		   });	
		addAnnotation
		  (getTemplateType_LiteralResultElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "literal-result-element:group",
			 "namespace", "##targetNamespace",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getTemplateType_LiteralResultElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal-result-element",
			 "namespace", "##targetNamespace",
			 "group", "literal-result-element:group"
		   });	
		addAnnotation
		  (getTemplateType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getTemplateType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":16",
			 "processing", "lax",
			 "group", "#SequenceConstructorGroup:9"
		   });	
		addAnnotation
		  (getTemplateType_Match(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "match"
		   });	
		addAnnotation
		  (getTemplateType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority"
		   });	
		addAnnotation
		  (getTemplateType_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });	
		addAnnotation
		  (getTemplateType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getTemplateType_As(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "as"
		   });	
		addAnnotation
		  (textElementBaseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "text-element-base-type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getTextElementBaseType_Value(), 
		   source, 
		   new String[] {
			 "name", ":8",
			 "kind", "simple"
		   });	
		addAnnotation
		  (textElementBaseTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "text-element-base-type_._base",
			 "baseType", "text-element-base-type_._base_._base"
		   });	
		addAnnotation
		  (textElementBaseTypeBaseBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "text-element-base-type_._base_._base",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (textTypeEClass, 
		   source, 
		   new String[] {
			 "name", "text_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getTextType_DisableOutputEscaping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "disable-output-escaping"
		   });	
		addAnnotation
		  (transformElementBaseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "transform-element-base-type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (transformTypeEClass, 
		   source, 
		   new String[] {
			 "name", "transform_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getTransformType_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTransformType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:9"
		   });	
		addAnnotation
		  (getTransformType_DeclarationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "declaration:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:9"
		   });	
		addAnnotation
		  (getTransformType_Declaration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "declaration",
			 "namespace", "##targetNamespace",
			 "group", "declaration:group"
		   });	
		addAnnotation
		  (getTransformType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable",
			 "namespace", "##targetNamespace",
			 "group", "#group:9"
		   });	
		addAnnotation
		  (getTransformType_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace",
			 "group", "#group:9"
		   });	
		addAnnotation
		  (getTransformType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":14",
			 "processing", "lax",
			 "group", "#group:9"
		   });	
		addAnnotation
		  (getTransformType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getTransformType_DefaultValidation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default-validation"
		   });	
		addAnnotation
		  (getTransformType_InputTypeAnnotations(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "input-type-annotations"
		   });	
		addAnnotation
		  (uriListEDataType, 
		   source, 
		   new String[] {
			 "name", "uri-list",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });	
		addAnnotation
		  (validationStripOrPreserveEEnum, 
		   source, 
		   new String[] {
			 "name", "validation-strip-or-preserve"
		   });	
		addAnnotation
		  (validationStripOrPreserveObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "validation-strip-or-preserve:Object",
			 "baseType", "validation-strip-or-preserve"
		   });	
		addAnnotation
		  (validationTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "validation-type"
		   });	
		addAnnotation
		  (validationTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "validation-type:Object",
			 "baseType", "validation-type"
		   });	
		addAnnotation
		  (valueOfTypeEClass, 
		   source, 
		   new String[] {
			 "name", "value-of_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getValueOfType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getValueOfType_Separator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "separator"
		   });	
		addAnnotation
		  (getValueOfType_DisableOutputEscaping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "disable-output-escaping"
		   });	
		addAnnotation
		  (variableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "variable_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getVariableType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getVariableType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getVariableType_As(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "as"
		   });	
		addAnnotation
		  (versionedElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "versioned-element-type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getVersionedElementType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });	
		addAnnotation
		  (whenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "when_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getWhenType_Test(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "test"
		   });	
		addAnnotation
		  (withParamTypeEClass, 
		   source, 
		   new String[] {
			 "name", "with-param_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getWithParamType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getWithParamType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });	
		addAnnotation
		  (getWithParamType_As(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "as"
		   });	
		addAnnotation
		  (getWithParamType_Tunnel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tunnel"
		   });	
		addAnnotation
		  (yesOrNoEEnum, 
		   source, 
		   new String[] {
			 "name", "yes-or-no"
		   });	
		addAnnotation
		  (yesOrNoObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "yes-or-no:Object",
			 "baseType", "yes-or-no"
		   });	
		addAnnotation
		  (yesOrNoOrOmitEEnum, 
		   source, 
		   new String[] {
			 "name", "yes-or-no-or-omit"
		   });	
		addAnnotation
		  (yesOrNoOrOmitObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "yes-or-no-or-omit:Object",
			 "baseType", "yes-or-no-or-omit"
		   });
	}

} //XSLT20PackageImpl
