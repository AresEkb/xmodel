/**
 */
package org.w3._1999.xsl.transform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *   
 *     This is a schema for XSLT 2.0 stylesheets.
 *     
 *     It defines all the elements that appear in the XSLT namespace; it also
 *     provides hooks that allow the inclusion of user-defined literal result elements,
 *     extension instructions, and top-level data elements.
 *     
 *     The schema is derived (with kind permission) from a schema for XSLT 1.0 stylesheets
 *     produced by Asir S Vedamuthu of WebMethods Inc.
 *     
 *     This schema is available for use under the conditions of the W3C Software License
 *     published at http://www.w3.org/Consortium/Legal/copyright-software-19980720
 *     
 *     The schema is organized as follows:
 *     
 *     PART A: definitions of complex types and model groups used as the basis 
 *             for element definitions
 *     PART B: definitions of individual XSLT elements
 *     PART C: definitions for literal result elements
 *     PART D: definitions of simple types used in attribute definitions
 *     
 *     This schema does not attempt to define all the constraints that apply to a valid
 *     XSLT 2.0 stylesheet module. It is the intention that all valid stylesheet modules 
 *     should conform to this schema; however, the schema is non-normative and in the event 
 *     of any conflict, the text of the Recommendation takes precedence.
 * 
 *     This schema does not implement the special rules that apply when a stylesheet
 *     has sections that use forwards-compatible-mode. In this mode, setting version="3.0"
 *     allows elements from the XSLT namespace to be used that are not defined in XSLT 2.0.
 * 
 *     Simplified stylesheets (those with a literal result element as the outermost element)
 *     will validate against this schema only if validation starts in lax mode.
 *     
 *     This version is dated 2007-03-16
 *     Authors: Michael H Kay, Saxonica Limited
 *              Jeni Tennison, Jeni Tennison Consulting Ltd.
 *              
 *     2007-03-15: added xsl:document element
 *                 revised xsl:sequence element
 *                 see http://www.w3.org/Bugs/Public/show_bug.cgi?id=4237         
 *     
 *   
 * 
 *     PART A: definitions of complex types and model groups used as the basis 
 *             for element definitions
 *   
 * 
 *     PART B: definitions of individual XSLT elements    
 *     Elements are listed in alphabetical order.    
 *   
 * 
 *     PART C: definition of literal result elements
 *     
 *     There are three ways to define the literal result elements
 *     permissible in a stylesheet.
 *     
 *     (a) do nothing. This allows any element to be used as a literal
 *         result element, provided it is not in the XSLT namespace
 *     
 *     (b) declare all permitted literal result elements as members
 *         of the xsl:literal-result-element substitution group
 *         
 *     (c) redefine the model group xsl:result-elements to accommodate
 *         all permitted literal result elements.
 *         
 *     Literal result elements are allowed to take certain attributes
 *     in the XSLT namespace. These are defined in the attribute group
 *     literal-result-element-attributes, which can be included in the
 *     definition of any literal result element.
 *     
 *   
 * 
 *     PART D: definitions of simple types used in stylesheet attributes 
 *   
 * 
 *     Part 1 version: Id: structures.xsd,v 1.2 2004/01/15 11:34:25 ht Exp 
 *     Part 2 version: Id: datatypes.xsd,v 1.3 2004/01/23 18:11:13 ht Exp 
 *   
 * 
 *    The schema corresponding to this document is normative,
 *    with respect to the syntactic constraints it expresses in the
 *    XML Schema language.  The documentation (within <documentation> elements)
 *    below, is not normative, but rather highlights important aspects of
 *    the W3C Recommendation of which this is a part
 * 
 *    The simpleType element and all of its members are defined
 *       towards the end of this schema document
 * 
 *    simple type for the value of the 'namespace' attr of
 *    'any' and 'anyAttribute'
 * 
 *    Value is
 *               ##any      - - any non-conflicting WFXML/attribute at all
 * 
 *               ##other    - - any non-conflicting WFXML/attribute from
 *                               namespace other than targetNS
 * 
 *               ##local    - - any unqualified non-conflicting WFXML/attribute 
 * 
 *               one or     - - any non-conflicting WFXML/attribute from
 *               more URI        the listed namespaces
 *               references
 *               (space separated)
 * 
 *     ##targetNamespace or ##local may appear in the above list, to
 *         refer to the targetNamespace of the enclosing
 *         schema or an absent targetNamespace respectively
 * 
 *    notations for use within XML Schema schemas
 * 
 *       First the built-in primitive datatypes.  These definitions are for
 *       information only, the real built-in definitions are magic.
 *     
 * 
 *       For each built-in datatype in this schema (both primitive and
 *       derived) can be uniquely addressed via a URI constructed
 *       as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the datatype
 * 
 *       For example, to address the int datatype, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#int
 * 
 *       Additionally, each facet definition element can be uniquely
 *       addressed via a URI constructed as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the facet
 * 
 *       For example, to address the maxInclusive facet, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#maxInclusive
 * 
 *       Additionally, each facet usage in a built-in datatype definition
 *       can be uniquely addressed via a URI constructed as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the datatype, followed
 *            by a period (".") followed by the name of the facet
 * 
 *       For example, to address the usage of the maxInclusive facet in
 *       the definition of int, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#int.maxInclusive
 * 
 *     
 * 
 *       Now the derived primitive types
 *     
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Factory
 * @model kind="package"
 * @generated
 */
public interface XSLT20Package extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "transform";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.w3.org/1999/XSL/Transform";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "xsl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XSLT20Package eINSTANCE = org.w3._1999.xsl.transform.impl.XSLT20PackageImpl.init();

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl <em>Generic Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.GenericElementTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getGenericElementType()
     * @generated
     */
    int GENERIC_ELEMENT_TYPE = 19;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__MIXED = 0;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION = 1;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES = 2;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = 3;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__USE_WHEN = 4;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE = 5;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE = 6;

    /**
     * The number of structural features of the '<em>Generic Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Generic Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_ELEMENT_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.VersionedElementTypeImpl <em>Versioned Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.VersionedElementTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getVersionedElementType()
     * @generated
     */
    int VERSIONED_ELEMENT_TYPE = 48;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__MIXED = GENERIC_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION = GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES = GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__USE_WHEN = GENERIC_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE = GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE = GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE__VERSION = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Versioned Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE_FEATURE_COUNT = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Versioned Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_ELEMENT_TYPE_OPERATION_COUNT = GENERIC_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ElementOnlyVersionedElementTypeImpl <em>Element Only Versioned Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ElementOnlyVersionedElementTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getElementOnlyVersionedElementType()
     * @generated
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE = 14;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The number of structural features of the '<em>Element Only Versioned Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Element Only Versioned Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl <em>Analyze String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAnalyzeStringType()
     * @generated
     */
    int ANALYZE_STRING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Matching Substring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__MATCHING_SUBSTRING = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Non Matching Substring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__FALLBACK = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__SELECT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Regex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__REGEX = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Flags</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE__FLAGS = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Analyze String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Analyze String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZE_STRING_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ApplyImportsTypeImpl <em>Apply Imports Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ApplyImportsTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getApplyImportsType()
     * @generated
     */
    int APPLY_IMPORTS_TYPE = 1;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>With Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE__WITH_PARAM = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Apply Imports Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Apply Imports Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_IMPORTS_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl <em>Apply Templates Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getApplyTemplatesType()
     * @generated
     */
    int APPLY_TEMPLATES_TYPE = 2;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__GROUP = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sort</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__SORT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>With Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__WITH_PARAM = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__SELECT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE__MODE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Apply Templates Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Apply Templates Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLY_TEMPLATES_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl <em>Attribute Set Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAttributeSetType()
     * @generated
     */
    int ATTRIBUTE_SET_TYPE = 3;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__GROUP = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__NAME = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Use Attribute Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Attribute Set Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Attribute Set Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_SET_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl <em>Sequence Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.SequenceConstructorImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSequenceConstructor()
     * @generated
     */
    int SEQUENCE_CONSTRUCTOR = 37;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__VARIABLE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__INSTRUCTION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__ANY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR__ANY1 = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Sequence Constructor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Sequence Constructor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_CONSTRUCTOR_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.AttributeTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAttributeType()
     * @generated
     */
    int ATTRIBUTE_TYPE = 4;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__NAMESPACE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__SEPARATOR = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__VALIDATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.CallTemplateTypeImpl <em>Call Template Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.CallTemplateTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCallTemplateType()
     * @generated
     */
    int CALL_TEMPLATE_TYPE = 5;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>With Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__WITH_PARAM = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE__NAME = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Call Template Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Call Template Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TEMPLATE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl <em>Character Map Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCharacterMapType()
     * @generated
     */
    int CHARACTER_MAP_TYPE = 6;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Output Character</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__OUTPUT_CHARACTER = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__NAME = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Use Character Maps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Character Map Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Character Map Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_MAP_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ChooseTypeImpl <em>Choose Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ChooseTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getChooseType()
     * @generated
     */
    int CHOOSE_TYPE = 7;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>When</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE__OTHERWISE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Choose Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Choose Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOOSE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.CommentTypeImpl <em>Comment Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.CommentTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCommentType()
     * @generated
     */
    int COMMENT_TYPE = 8;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Comment Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Comment Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.CopyOfTypeImpl <em>Copy Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.CopyOfTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCopyOfType()
     * @generated
     */
    int COPY_OF_TYPE = 9;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__SELECT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Copy Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__COPY_NAMESPACES = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__TYPE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE__VALIDATION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Copy Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Copy Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_OF_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl <em>Copy Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.CopyTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCopyType()
     * @generated
     */
    int COPY_TYPE = 10;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Copy Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__COPY_NAMESPACES = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inherit Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__INHERIT_NAMESPACES = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Use Attribute Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__USE_ATTRIBUTE_SETS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE__VALIDATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Copy Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Copy Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPY_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl <em>Decimal Format Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getDecimalFormatType()
     * @generated
     */
    int DECIMAL_FORMAT_TYPE = 11;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__NAME = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Decimal Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Grouping Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Infinity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__INFINITY = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Minus Sign</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__MINUS_SIGN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Na N</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__NA_N = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Percent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__PERCENT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Per Mille</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__PER_MILLE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Zero Digit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__ZERO_DIGIT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Digit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__DIGIT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Pattern Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Decimal Format Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Decimal Format Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FORMAT_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.DocumentRootImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 12;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Analyze String</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ANALYZE_STRING = 3;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INSTRUCTION = 4;

    /**
     * The feature id for the '<em><b>Apply Imports</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__APPLY_IMPORTS = 5;

    /**
     * The feature id for the '<em><b>Apply Templates</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__APPLY_TEMPLATES = 6;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ATTRIBUTE = 7;

    /**
     * The feature id for the '<em><b>Attribute Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ATTRIBUTE_SET = 8;

    /**
     * The feature id for the '<em><b>Declaration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DECLARATION = 9;

    /**
     * The feature id for the '<em><b>Call Template</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALL_TEMPLATE = 10;

    /**
     * The feature id for the '<em><b>Character Map</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHARACTER_MAP = 11;

    /**
     * The feature id for the '<em><b>Choose</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOOSE = 12;

    /**
     * The feature id for the '<em><b>Comment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMMENT = 13;

    /**
     * The feature id for the '<em><b>Copy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COPY = 14;

    /**
     * The feature id for the '<em><b>Copy Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COPY_OF = 15;

    /**
     * The feature id for the '<em><b>Decimal Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DECIMAL_FORMAT = 16;

    /**
     * The feature id for the '<em><b>Document</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENT = 17;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ELEMENT = 18;

    /**
     * The feature id for the '<em><b>Fallback</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FALLBACK = 19;

    /**
     * The feature id for the '<em><b>For Each</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FOR_EACH = 20;

    /**
     * The feature id for the '<em><b>For Each Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FOR_EACH_GROUP = 21;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FUNCTION = 22;

    /**
     * The feature id for the '<em><b>If</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IF = 23;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPORT = 24;

    /**
     * The feature id for the '<em><b>Import Schema</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPORT_SCHEMA = 25;

    /**
     * The feature id for the '<em><b>Include</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INCLUDE = 26;

    /**
     * The feature id for the '<em><b>Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__KEY = 27;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT = 28;

    /**
     * The feature id for the '<em><b>Matching Substring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MATCHING_SUBSTRING = 29;

    /**
     * The feature id for the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE = 30;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NAMESPACE = 31;

    /**
     * The feature id for the '<em><b>Namespace Alias</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NAMESPACE_ALIAS = 32;

    /**
     * The feature id for the '<em><b>Next Match</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NEXT_MATCH = 33;

    /**
     * The feature id for the '<em><b>Non Matching Substring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NON_MATCHING_SUBSTRING = 34;

    /**
     * The feature id for the '<em><b>Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NUMBER = 35;

    /**
     * The feature id for the '<em><b>Otherwise</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OTHERWISE = 36;

    /**
     * The feature id for the '<em><b>Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUT = 37;

    /**
     * The feature id for the '<em><b>Output Character</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUT_CHARACTER = 38;

    /**
     * The feature id for the '<em><b>Param</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAM = 39;

    /**
     * The feature id for the '<em><b>Perform Sort</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PERFORM_SORT = 40;

    /**
     * The feature id for the '<em><b>Preserve Space</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PRESERVE_SPACE = 41;

    /**
     * The feature id for the '<em><b>Processing Instruction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESSING_INSTRUCTION = 42;

    /**
     * The feature id for the '<em><b>Result Document</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESULT_DOCUMENT = 43;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEQUENCE = 44;

    /**
     * The feature id for the '<em><b>Sort</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SORT = 45;

    /**
     * The feature id for the '<em><b>Strip Space</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STRIP_SPACE = 46;

    /**
     * The feature id for the '<em><b>Stylesheet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STYLESHEET = 47;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORM = 48;

    /**
     * The feature id for the '<em><b>Template</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEMPLATE = 49;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEXT = 50;

    /**
     * The feature id for the '<em><b>Value Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VALUE_OF = 51;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VARIABLE = 52;

    /**
     * The feature id for the '<em><b>When</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WHEN = 53;

    /**
     * The feature id for the '<em><b>With Param</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WITH_PARAM = 54;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 55;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.DocumentTypeImpl <em>Document Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.DocumentTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getDocumentType()
     * @generated
     */
    int DOCUMENT_TYPE = 13;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE__VALIDATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Document Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Document Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ElementTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getElementType()
     * @generated
     */
    int ELEMENT_TYPE = 15;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__NAMESPACE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Inherit Namespaces</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__INHERIT_NAMESPACES = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Use Attribute Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__USE_ATTRIBUTE_SETS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__VALIDATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl <em>For Each Group Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getForEachGroupType()
     * @generated
     */
    int FOR_EACH_GROUP_TYPE = 16;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Sort</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__SORT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__VARIABLE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__INSTRUCTION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__ANY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__ANY1 = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__SELECT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Group By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__GROUP_BY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Group Adjacent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__GROUP_ADJACENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Group Starting With</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Group Ending With</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE__COLLATION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>For Each Group Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 15;

    /**
     * The number of operations of the '<em>For Each Group Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_GROUP_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ForEachTypeImpl <em>For Each Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ForEachTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getForEachType()
     * @generated
     */
    int FOR_EACH_TYPE = 17;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Sort</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__SORT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__VARIABLE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__INSTRUCTION_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__INSTRUCTION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__LITERAL_RESULT_ELEMENT_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__LITERAL_RESULT_ELEMENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__ANY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__ANY1 = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE__SELECT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>For Each Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>For Each Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOR_EACH_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl <em>Function Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.FunctionTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getFunctionType()
     * @generated
     */
    int FUNCTION_TYPE = 18;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__PARAM = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__VARIABLE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__INSTRUCTION_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__INSTRUCTION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__LITERAL_RESULT_ELEMENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__ANY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__ANY1 = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__NAME = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__OVERRIDE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE__AS = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Function Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 12;

    /**
     * The number of operations of the '<em>Function Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.IfTypeImpl <em>If Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.IfTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getIfType()
     * @generated
     */
    int IF_TYPE = 20;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE__TEST = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>If Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>If Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl <em>Import Schema Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getImportSchemaType()
     * @generated
     */
    int IMPORT_SCHEMA_TYPE = 21;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__SCHEMA = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Import Schema Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Import Schema Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_SCHEMA_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ImportTypeImpl <em>Import Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ImportTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getImportType()
     * @generated
     */
    int IMPORT_TYPE = 22;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__HREF = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Import Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Import Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.IncludeTypeImpl <em>Include Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.IncludeTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getIncludeType()
     * @generated
     */
    int INCLUDE_TYPE = 23;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__HREF = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Include Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Include Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.KeyTypeImpl <em>Key Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.KeyTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getKeyType()
     * @generated
     */
    int KEY_TYPE = 24;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__MATCH = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Use</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__USE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE__COLLATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Key Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Key Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.MessageTypeImpl <em>Message Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.MessageTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMessageType()
     * @generated
     */
    int MESSAGE_TYPE = 25;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Terminate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE__TERMINATE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Message Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Message Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.NamespaceAliasTypeImpl <em>Namespace Alias Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.NamespaceAliasTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNamespaceAliasType()
     * @generated
     */
    int NAMESPACE_ALIAS_TYPE = 26;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Stylesheet Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Result Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE__RESULT_PREFIX = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Namespace Alias Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Namespace Alias Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_ALIAS_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.NamespaceTypeImpl <em>Namespace Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.NamespaceTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNamespaceType()
     * @generated
     */
    int NAMESPACE_TYPE = 27;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Namespace Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Namespace Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.NextMatchTypeImpl <em>Next Match Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.NextMatchTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNextMatchType()
     * @generated
     */
    int NEXT_MATCH_TYPE = 28;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__GROUP = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>With Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__WITH_PARAM = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE__FALLBACK = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Next Match Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Next Match Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEXT_MATCH_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl <em>Number Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.NumberTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNumberType()
     * @generated
     */
    int NUMBER_TYPE = 29;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__VALUE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__SELECT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__LEVEL = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__FROM = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__FORMAT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__LANG = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Letter Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__LETTER_VALUE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Ordinal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__ORDINAL = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Grouping Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__GROUPING_SEPARATOR = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Grouping Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE__GROUPING_SIZE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Number Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Number Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.OutputCharacterTypeImpl <em>Output Character Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.OutputCharacterTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getOutputCharacterType()
     * @generated
     */
    int OUTPUT_CHARACTER_TYPE = 30;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Character</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__CHARACTER = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE__STRING = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Output Character Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Output Character Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_CHARACTER_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl <em>Output Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.OutputTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getOutputType()
     * @generated
     */
    int OUTPUT_TYPE = 31;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__MIXED = GENERIC_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__DEFAULT_COLLATION = GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__EXCLUDE_RESULT_PREFIXES = GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__EXTENSION_ELEMENT_PREFIXES = GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__USE_WHEN = GENERIC_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__XPATH_DEFAULT_NAMESPACE = GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__ANY_ATTRIBUTE = GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__NAME = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__METHOD = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Byte Order Mark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__BYTE_ORDER_MARK = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Cdata Section Elements</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__CDATA_SECTION_ELEMENTS = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Doctype Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__DOCTYPE_PUBLIC = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Doctype System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__DOCTYPE_SYSTEM = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__ENCODING = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Escape Uri Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Include Content Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__INCLUDE_CONTENT_TYPE = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Indent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__INDENT = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Media Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__MEDIA_TYPE = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Normalization Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__NORMALIZATION_FORM = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Omit Xml Declaration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__OMIT_XML_DECLARATION = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Standalone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__STANDALONE = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Undeclare Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__UNDECLARE_PREFIXES = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Use Character Maps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__USE_CHARACTER_MAPS = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE__VERSION = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Output Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE_FEATURE_COUNT = GENERIC_ELEMENT_TYPE_FEATURE_COUNT + 17;

    /**
     * The number of operations of the '<em>Output Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_TYPE_OPERATION_COUNT = GENERIC_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl <em>Param Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ParamTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getParamType()
     * @generated
     */
    int PARAM_TYPE = 32;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__AS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__REQUIRED = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Tunnel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE__TUNNEL = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Param Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Param Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAM_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.PerformSortTypeImpl <em>Perform Sort Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.PerformSortTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPerformSortType()
     * @generated
     */
    int PERFORM_SORT_TYPE = 33;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Sort</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__SORT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__VARIABLE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__INSTRUCTION_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__INSTRUCTION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__LITERAL_RESULT_ELEMENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__ANY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__ANY1 = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE__SELECT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Perform Sort Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Perform Sort Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORM_SORT_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.PreserveSpaceTypeImpl <em>Preserve Space Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.PreserveSpaceTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPreserveSpaceType()
     * @generated
     */
    int PRESERVE_SPACE_TYPE = 34;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Elements</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE__ELEMENTS = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Preserve Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Preserve Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESERVE_SPACE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ProcessingInstructionTypeImpl <em>Processing Instruction Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ProcessingInstructionTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getProcessingInstructionType()
     * @generated
     */
    int PROCESSING_INSTRUCTION_TYPE = 35;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Processing Instruction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Processing Instruction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESSING_INSTRUCTION_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl <em>Result Document Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getResultDocumentType()
     * @generated
     */
    int RESULT_DOCUMENT_TYPE = 36;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__FORMAT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__HREF = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__VALIDATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__METHOD = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Byte Order Mark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Cdata Section Elements</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Doctype Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Doctype System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__ENCODING = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Escape Uri Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Include Content Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Indent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__INDENT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Media Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__MEDIA_TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Normalization Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Omit Xml Declaration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Standalone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__STANDALONE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Undeclare Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Use Character Maps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Output Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE__OUTPUT_VERSION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 19;

    /**
     * The number of structural features of the '<em>Result Document Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 20;

    /**
     * The number of operations of the '<em>Result Document Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_DOCUMENT_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.SequenceTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSequenceType()
     * @generated
     */
    int SEQUENCE_TYPE = 38;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__GROUP = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__FALLBACK = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE__SELECT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Sequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.SortTypeImpl <em>Sort Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.SortTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSortType()
     * @generated
     */
    int SORT_TYPE = 39;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__LANG = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__DATA_TYPE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__ORDER = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Case Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__CASE_ORDER = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__COLLATION = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Stable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE__STABLE = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Sort Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Sort Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SORT_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.StripSpaceTypeImpl <em>Strip Space Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.StripSpaceTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getStripSpaceType()
     * @generated
     */
    int STRIP_SPACE_TYPE = 40;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Elements</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE__ELEMENTS = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Strip Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Strip Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRIP_SPACE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl <em>Template Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.TemplateTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTemplateType()
     * @generated
     */
    int TEMPLATE_TYPE = 41;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__PARAM = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__VARIABLE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__INSTRUCTION_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__INSTRUCTION = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__ANY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__ANY1 = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__MATCH = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__PRIORITY = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__MODE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__NAME = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE__AS = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Template Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 14;

    /**
     * The number of operations of the '<em>Template Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.TextElementBaseTypeImpl <em>Text Element Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.TextElementBaseTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextElementBaseType()
     * @generated
     */
    int TEXT_ELEMENT_BASE_TYPE = 42;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__MIXED = VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__DEFAULT_COLLATION = VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__EXCLUDE_RESULT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__EXTENSION_ELEMENT_PREFIXES = VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__USE_WHEN = VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__XPATH_DEFAULT_NAMESPACE = VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__ANY_ATTRIBUTE = VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__VERSION = VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE__VALUE = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Text Element Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE_FEATURE_COUNT = VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Text Element Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ELEMENT_BASE_TYPE_OPERATION_COUNT = VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.TextTypeImpl <em>Text Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.TextTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextType()
     * @generated
     */
    int TEXT_TYPE = 43;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__MIXED = TEXT_ELEMENT_BASE_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__DEFAULT_COLLATION = TEXT_ELEMENT_BASE_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__EXCLUDE_RESULT_PREFIXES = TEXT_ELEMENT_BASE_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__EXTENSION_ELEMENT_PREFIXES = TEXT_ELEMENT_BASE_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__USE_WHEN = TEXT_ELEMENT_BASE_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__XPATH_DEFAULT_NAMESPACE = TEXT_ELEMENT_BASE_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__ANY_ATTRIBUTE = TEXT_ELEMENT_BASE_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__VERSION = TEXT_ELEMENT_BASE_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__VALUE = TEXT_ELEMENT_BASE_TYPE__VALUE;

    /**
     * The feature id for the '<em><b>Disable Output Escaping</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE__DISABLE_OUTPUT_ESCAPING = TEXT_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Text Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE_FEATURE_COUNT = TEXT_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Text Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_TYPE_OPERATION_COUNT = TEXT_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.TransformElementBaseTypeImpl <em>Transform Element Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.TransformElementBaseTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTransformElementBaseType()
     * @generated
     */
    int TRANSFORM_ELEMENT_BASE_TYPE = 44;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__MIXED = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__DEFAULT_COLLATION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__EXCLUDE_RESULT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__EXTENSION_ELEMENT_PREFIXES = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__USE_WHEN = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__XPATH_DEFAULT_NAMESPACE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__ANY_ATTRIBUTE = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE__VERSION = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE__VERSION;

    /**
     * The number of structural features of the '<em>Transform Element Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Transform Element Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_ELEMENT_BASE_TYPE_OPERATION_COUNT = ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl <em>Transform Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.TransformTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTransformType()
     * @generated
     */
    int TRANSFORM_TYPE = 45;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__MIXED = TRANSFORM_ELEMENT_BASE_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__DEFAULT_COLLATION = TRANSFORM_ELEMENT_BASE_TYPE__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__EXCLUDE_RESULT_PREFIXES = TRANSFORM_ELEMENT_BASE_TYPE__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__EXTENSION_ELEMENT_PREFIXES = TRANSFORM_ELEMENT_BASE_TYPE__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__USE_WHEN = TRANSFORM_ELEMENT_BASE_TYPE__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__XPATH_DEFAULT_NAMESPACE = TRANSFORM_ELEMENT_BASE_TYPE__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__ANY_ATTRIBUTE = TRANSFORM_ELEMENT_BASE_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__VERSION = TRANSFORM_ELEMENT_BASE_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__IMPORT = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__GROUP = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Declaration Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__DECLARATION_GROUP = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__DECLARATION = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__VARIABLE = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Param</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__PARAM = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__ANY = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__ID = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Default Validation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__DEFAULT_VALIDATION = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Input Type Annotations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Transform Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE_FEATURE_COUNT = TRANSFORM_ELEMENT_BASE_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Transform Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_TYPE_OPERATION_COUNT = TRANSFORM_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.ValueOfTypeImpl <em>Value Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.ValueOfTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValueOfType()
     * @generated
     */
    int VALUE_OF_TYPE = 46;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__SEPARATOR = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Disable Output Escaping</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Value Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Value Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_OF_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.VariableTypeImpl <em>Variable Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.VariableTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getVariableType()
     * @generated
     */
    int VARIABLE_TYPE = 47;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE__AS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Variable Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Variable Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.WhenTypeImpl <em>When Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.WhenTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getWhenType()
     * @generated
     */
    int WHEN_TYPE = 49;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE__TEST = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>When Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>When Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHEN_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.impl.WithParamTypeImpl <em>With Param Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.impl.WithParamTypeImpl
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getWithParamType()
     * @generated
     */
    int WITH_PARAM_TYPE = 50;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__MIXED = SEQUENCE_CONSTRUCTOR__MIXED;

    /**
     * The feature id for the '<em><b>Default Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__DEFAULT_COLLATION = SEQUENCE_CONSTRUCTOR__DEFAULT_COLLATION;

    /**
     * The feature id for the '<em><b>Exclude Result Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__EXCLUDE_RESULT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXCLUDE_RESULT_PREFIXES;

    /**
     * The feature id for the '<em><b>Extension Element Prefixes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__EXTENSION_ELEMENT_PREFIXES = SEQUENCE_CONSTRUCTOR__EXTENSION_ELEMENT_PREFIXES;

    /**
     * The feature id for the '<em><b>Use When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__USE_WHEN = SEQUENCE_CONSTRUCTOR__USE_WHEN;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__XPATH_DEFAULT_NAMESPACE = SEQUENCE_CONSTRUCTOR__XPATH_DEFAULT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__ANY_ATTRIBUTE = SEQUENCE_CONSTRUCTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__VERSION = SEQUENCE_CONSTRUCTOR__VERSION;

    /**
     * The feature id for the '<em><b>Sequence Constructor Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP;

    /**
     * The feature id for the '<em><b>Variable</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__VARIABLE = SEQUENCE_CONSTRUCTOR__VARIABLE;

    /**
     * The feature id for the '<em><b>Instruction Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__INSTRUCTION_GROUP = SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP;

    /**
     * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__INSTRUCTION = SEQUENCE_CONSTRUCTOR__INSTRUCTION;

    /**
     * The feature id for the '<em><b>Literal Result Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__LITERAL_RESULT_ELEMENT_GROUP = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Literal Result Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__LITERAL_RESULT_ELEMENT = SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__ANY = SEQUENCE_CONSTRUCTOR__ANY;

    /**
     * The feature id for the '<em><b>Any1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__ANY1 = SEQUENCE_CONSTRUCTOR__ANY1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__NAME = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__SELECT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>As</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__AS = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Tunnel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE__TUNNEL = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>With Param Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE_FEATURE_COUNT = SEQUENCE_CONSTRUCTOR_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>With Param Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WITH_PARAM_TYPE_OPERATION_COUNT = SEQUENCE_CONSTRUCTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.InputTypeAnnotationsType <em>Input Type Annotations Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getInputTypeAnnotationsType()
     * @generated
     */
    int INPUT_TYPE_ANNOTATIONS_TYPE = 51;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.Level <em>Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.Level
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getLevel()
     * @generated
     */
    int LEVEL = 52;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.MethodMember0 <em>Method Member0</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.MethodMember0
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethodMember0()
     * @generated
     */
    int METHOD_MEMBER0 = 53;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.ModeMember1 <em>Mode Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ModeMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModeMember1()
     * @generated
     */
    int MODE_MEMBER1 = 54;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.ModesMember0ItemMember1 <em>Modes Member0 Item Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ModesMember0ItemMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0ItemMember1()
     * @generated
     */
    int MODES_MEMBER0_ITEM_MEMBER1 = 55;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.ModesMember1 <em>Modes Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ModesMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember1()
     * @generated
     */
    int MODES_MEMBER1 = 56;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.NametestsItemMember1 <em>Nametests Item Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.NametestsItemMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItemMember1()
     * @generated
     */
    int NAMETESTS_ITEM_MEMBER1 = 57;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.PrefixListOrAllMember1 <em>Prefix List Or All Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.PrefixListOrAllMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixListOrAllMember1()
     * @generated
     */
    int PREFIX_LIST_OR_ALL_MEMBER1 = 58;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.PrefixOrDefaultMember1 <em>Prefix Or Default Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.PrefixOrDefaultMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixOrDefaultMember1()
     * @generated
     */
    int PREFIX_OR_DEFAULT_MEMBER1 = 59;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.ValidationStripOrPreserve <em>Validation Strip Or Preserve</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationStripOrPreserve()
     * @generated
     */
    int VALIDATION_STRIP_OR_PRESERVE = 60;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.ValidationType <em>Validation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ValidationType
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationType()
     * @generated
     */
    int VALIDATION_TYPE = 61;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.YesOrNo <em>Yes Or No</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNo()
     * @generated
     */
    int YES_OR_NO = 62;

    /**
     * The meta object id for the '{@link org.w3._1999.xsl.transform.YesOrNoOrOmit <em>Yes Or No Or Omit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNoOrOmit()
     * @generated
     */
    int YES_OR_NO_OR_OMIT = 63;

    /**
     * The meta object id for the '<em>Avt</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAvt()
     * @generated
     */
    int AVT = 64;

    /**
     * The meta object id for the '<em>Char</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getChar()
     * @generated
     */
    int CHAR = 65;

    /**
     * The meta object id for the '<em>Expression</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 66;

    /**
     * The meta object id for the '<em>Input Type Annotations Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getInputTypeAnnotationsTypeObject()
     * @generated
     */
    int INPUT_TYPE_ANNOTATIONS_TYPE_OBJECT = 67;

    /**
     * The meta object id for the '<em>Level Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.Level
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getLevelObject()
     * @generated
     */
    int LEVEL_OBJECT = 68;

    /**
     * The meta object id for the '<em>Method</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethod()
     * @generated
     */
    int METHOD = 69;

    /**
     * The meta object id for the '<em>Method Member0 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.MethodMember0
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethodMember0Object()
     * @generated
     */
    int METHOD_MEMBER0_OBJECT = 70;

    /**
     * The meta object id for the '<em>Method Member1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethodMember1()
     * @generated
     */
    int METHOD_MEMBER1 = 71;

    /**
     * The meta object id for the '<em>Mode</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMode()
     * @generated
     */
    int MODE = 72;

    /**
     * The meta object id for the '<em>Mode Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ModeMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModeMember1Object()
     * @generated
     */
    int MODE_MEMBER1_OBJECT = 73;

    /**
     * The meta object id for the '<em>Modes</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModes()
     * @generated
     */
    int MODES = 74;

    /**
     * The meta object id for the '<em>Modes Member0</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0()
     * @generated
     */
    int MODES_MEMBER0 = 75;

    /**
     * The meta object id for the '<em>Modes Member0 Item</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0Item()
     * @generated
     */
    int MODES_MEMBER0_ITEM = 76;

    /**
     * The meta object id for the '<em>Modes Member0 Item Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ModesMember0ItemMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0ItemMember1Object()
     * @generated
     */
    int MODES_MEMBER0_ITEM_MEMBER1_OBJECT = 77;

    /**
     * The meta object id for the '<em>Modes Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ModesMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember1Object()
     * @generated
     */
    int MODES_MEMBER1_OBJECT = 78;

    /**
     * The meta object id for the '<em>Nametests</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametests()
     * @generated
     */
    int NAMETESTS = 79;

    /**
     * The meta object id for the '<em>Nametests Item</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItem()
     * @generated
     */
    int NAMETESTS_ITEM = 80;

    /**
     * The meta object id for the '<em>Nametests Item Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.NametestsItemMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItemMember1Object()
     * @generated
     */
    int NAMETESTS_ITEM_MEMBER1_OBJECT = 81;

    /**
     * The meta object id for the '<em>Nametests Item Member2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItemMember2()
     * @generated
     */
    int NAMETESTS_ITEM_MEMBER2 = 82;

    /**
     * The meta object id for the '<em>Pattern</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 83;

    /**
     * The meta object id for the '<em>Prefixes</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixes()
     * @generated
     */
    int PREFIXES = 84;

    /**
     * The meta object id for the '<em>Prefix List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixList()
     * @generated
     */
    int PREFIX_LIST = 85;

    /**
     * The meta object id for the '<em>Prefix List Or All</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixListOrAll()
     * @generated
     */
    int PREFIX_LIST_OR_ALL = 86;

    /**
     * The meta object id for the '<em>Prefix List Or All Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.PrefixListOrAllMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixListOrAllMember1Object()
     * @generated
     */
    int PREFIX_LIST_OR_ALL_MEMBER1_OBJECT = 87;

    /**
     * The meta object id for the '<em>Prefix Or Default</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixOrDefault()
     * @generated
     */
    int PREFIX_OR_DEFAULT = 88;

    /**
     * The meta object id for the '<em>Prefix Or Default Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.PrefixOrDefaultMember1
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixOrDefaultMember1Object()
     * @generated
     */
    int PREFIX_OR_DEFAULT_MEMBER1_OBJECT = 89;

    /**
     * The meta object id for the '<em>QName</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getQName()
     * @generated
     */
    int QNAME = 90;

    /**
     * The meta object id for the '<em>QNames</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getQNames()
     * @generated
     */
    int QNAMES = 91;

    /**
     * The meta object id for the '<em>Sequence Type1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSequenceType1()
     * @generated
     */
    int SEQUENCE_TYPE1 = 92;

    /**
     * The meta object id for the '<em>Text Element Base Type Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextElementBaseTypeBase()
     * @generated
     */
    int TEXT_ELEMENT_BASE_TYPE_BASE = 93;

    /**
     * The meta object id for the '<em>Text Element Base Type Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextElementBaseTypeBaseBase()
     * @generated
     */
    int TEXT_ELEMENT_BASE_TYPE_BASE_BASE = 94;

    /**
     * The meta object id for the '<em>Uri List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getUriList()
     * @generated
     */
    int URI_LIST = 95;

    /**
     * The meta object id for the '<em>Validation Strip Or Preserve Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationStripOrPreserveObject()
     * @generated
     */
    int VALIDATION_STRIP_OR_PRESERVE_OBJECT = 96;

    /**
     * The meta object id for the '<em>Validation Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.ValidationType
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationTypeObject()
     * @generated
     */
    int VALIDATION_TYPE_OBJECT = 97;

    /**
     * The meta object id for the '<em>Yes Or No Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNoObject()
     * @generated
     */
    int YES_OR_NO_OBJECT = 98;

    /**
     * The meta object id for the '<em>Yes Or No Or Omit Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
     * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNoOrOmitObject()
     * @generated
     */
    int YES_OR_NO_OR_OMIT_OBJECT = 99;


    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.AnalyzeStringType <em>Analyze String Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analyze String Type</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType
     * @generated
     */
    EClass getAnalyzeStringType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getMatchingSubstring <em>Matching Substring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Matching Substring</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType#getMatchingSubstring()
     * @see #getAnalyzeStringType()
     * @generated
     */
    EReference getAnalyzeStringType_MatchingSubstring();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getNonMatchingSubstring <em>Non Matching Substring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Non Matching Substring</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType#getNonMatchingSubstring()
     * @see #getAnalyzeStringType()
     * @generated
     */
    EReference getAnalyzeStringType_NonMatchingSubstring();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFallback <em>Fallback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fallback</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType#getFallback()
     * @see #getAnalyzeStringType()
     * @generated
     */
    EReference getAnalyzeStringType_Fallback();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType#getSelect()
     * @see #getAnalyzeStringType()
     * @generated
     */
    EAttribute getAnalyzeStringType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getRegex <em>Regex</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Regex</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType#getRegex()
     * @see #getAnalyzeStringType()
     * @generated
     */
    EAttribute getAnalyzeStringType_Regex();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AnalyzeStringType#getFlags <em>Flags</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flags</em>'.
     * @see org.w3._1999.xsl.transform.AnalyzeStringType#getFlags()
     * @see #getAnalyzeStringType()
     * @generated
     */
    EAttribute getAnalyzeStringType_Flags();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ApplyImportsType <em>Apply Imports Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Apply Imports Type</em>'.
     * @see org.w3._1999.xsl.transform.ApplyImportsType
     * @generated
     */
    EClass getApplyImportsType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ApplyImportsType#getWithParam <em>With Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>With Param</em>'.
     * @see org.w3._1999.xsl.transform.ApplyImportsType#getWithParam()
     * @see #getApplyImportsType()
     * @generated
     */
    EReference getApplyImportsType_WithParam();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ApplyTemplatesType <em>Apply Templates Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Apply Templates Type</em>'.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType
     * @generated
     */
    EClass getApplyTemplatesType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType#getGroup()
     * @see #getApplyTemplatesType()
     * @generated
     */
    EAttribute getApplyTemplatesType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSort <em>Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sort</em>'.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType#getSort()
     * @see #getApplyTemplatesType()
     * @generated
     */
    EReference getApplyTemplatesType_Sort();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getWithParam <em>With Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>With Param</em>'.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType#getWithParam()
     * @see #getApplyTemplatesType()
     * @generated
     */
    EReference getApplyTemplatesType_WithParam();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType#getSelect()
     * @see #getApplyTemplatesType()
     * @generated
     */
    EAttribute getApplyTemplatesType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ApplyTemplatesType#getMode <em>Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mode</em>'.
     * @see org.w3._1999.xsl.transform.ApplyTemplatesType#getMode()
     * @see #getApplyTemplatesType()
     * @generated
     */
    EAttribute getApplyTemplatesType_Mode();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.AttributeSetType <em>Attribute Set Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Set Type</em>'.
     * @see org.w3._1999.xsl.transform.AttributeSetType
     * @generated
     */
    EClass getAttributeSetType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.AttributeSetType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._1999.xsl.transform.AttributeSetType#getGroup()
     * @see #getAttributeSetType()
     * @generated
     */
    EAttribute getAttributeSetType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.AttributeSetType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._1999.xsl.transform.AttributeSetType#getAttribute()
     * @see #getAttributeSetType()
     * @generated
     */
    EReference getAttributeSetType_Attribute();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeSetType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.AttributeSetType#getName()
     * @see #getAttributeSetType()
     * @generated
     */
    EAttribute getAttributeSetType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeSetType#getUseAttributeSets <em>Use Attribute Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Attribute Sets</em>'.
     * @see org.w3._1999.xsl.transform.AttributeSetType#getUseAttributeSets()
     * @see #getAttributeSetType()
     * @generated
     */
    EAttribute getAttributeSetType_UseAttributeSets();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.AttributeType <em>Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Type</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType
     * @generated
     */
    EClass getAttributeType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType#getName()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType#getNamespace()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType#getSelect()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeType#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType#getSeparator()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType#getType()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.AttributeType#getValidation <em>Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation</em>'.
     * @see org.w3._1999.xsl.transform.AttributeType#getValidation()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Validation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.CallTemplateType <em>Call Template Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Template Type</em>'.
     * @see org.w3._1999.xsl.transform.CallTemplateType
     * @generated
     */
    EClass getCallTemplateType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.CallTemplateType#getWithParam <em>With Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>With Param</em>'.
     * @see org.w3._1999.xsl.transform.CallTemplateType#getWithParam()
     * @see #getCallTemplateType()
     * @generated
     */
    EReference getCallTemplateType_WithParam();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CallTemplateType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.CallTemplateType#getName()
     * @see #getCallTemplateType()
     * @generated
     */
    EAttribute getCallTemplateType_Name();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.CharacterMapType <em>Character Map Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character Map Type</em>'.
     * @see org.w3._1999.xsl.transform.CharacterMapType
     * @generated
     */
    EClass getCharacterMapType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.CharacterMapType#getOutputCharacter <em>Output Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Character</em>'.
     * @see org.w3._1999.xsl.transform.CharacterMapType#getOutputCharacter()
     * @see #getCharacterMapType()
     * @generated
     */
    EReference getCharacterMapType_OutputCharacter();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CharacterMapType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.CharacterMapType#getName()
     * @see #getCharacterMapType()
     * @generated
     */
    EAttribute getCharacterMapType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CharacterMapType#getUseCharacterMaps <em>Use Character Maps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Character Maps</em>'.
     * @see org.w3._1999.xsl.transform.CharacterMapType#getUseCharacterMaps()
     * @see #getCharacterMapType()
     * @generated
     */
    EAttribute getCharacterMapType_UseCharacterMaps();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ChooseType <em>Choose Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choose Type</em>'.
     * @see org.w3._1999.xsl.transform.ChooseType
     * @generated
     */
    EClass getChooseType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ChooseType#getWhen <em>When</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>When</em>'.
     * @see org.w3._1999.xsl.transform.ChooseType#getWhen()
     * @see #getChooseType()
     * @generated
     */
    EReference getChooseType_When();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.ChooseType#getOtherwise <em>Otherwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Otherwise</em>'.
     * @see org.w3._1999.xsl.transform.ChooseType#getOtherwise()
     * @see #getChooseType()
     * @generated
     */
    EReference getChooseType_Otherwise();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.CommentType <em>Comment Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment Type</em>'.
     * @see org.w3._1999.xsl.transform.CommentType
     * @generated
     */
    EClass getCommentType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CommentType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.CommentType#getSelect()
     * @see #getCommentType()
     * @generated
     */
    EAttribute getCommentType_Select();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.CopyOfType <em>Copy Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copy Of Type</em>'.
     * @see org.w3._1999.xsl.transform.CopyOfType
     * @generated
     */
    EClass getCopyOfType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyOfType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.CopyOfType#getSelect()
     * @see #getCopyOfType()
     * @generated
     */
    EAttribute getCopyOfType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyOfType#getCopyNamespaces <em>Copy Namespaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Copy Namespaces</em>'.
     * @see org.w3._1999.xsl.transform.CopyOfType#getCopyNamespaces()
     * @see #getCopyOfType()
     * @generated
     */
    EAttribute getCopyOfType_CopyNamespaces();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyOfType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._1999.xsl.transform.CopyOfType#getType()
     * @see #getCopyOfType()
     * @generated
     */
    EAttribute getCopyOfType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyOfType#getValidation <em>Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation</em>'.
     * @see org.w3._1999.xsl.transform.CopyOfType#getValidation()
     * @see #getCopyOfType()
     * @generated
     */
    EAttribute getCopyOfType_Validation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.CopyType <em>Copy Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copy Type</em>'.
     * @see org.w3._1999.xsl.transform.CopyType
     * @generated
     */
    EClass getCopyType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyType#getCopyNamespaces <em>Copy Namespaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Copy Namespaces</em>'.
     * @see org.w3._1999.xsl.transform.CopyType#getCopyNamespaces()
     * @see #getCopyType()
     * @generated
     */
    EAttribute getCopyType_CopyNamespaces();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyType#getInheritNamespaces <em>Inherit Namespaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inherit Namespaces</em>'.
     * @see org.w3._1999.xsl.transform.CopyType#getInheritNamespaces()
     * @see #getCopyType()
     * @generated
     */
    EAttribute getCopyType_InheritNamespaces();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyType#getUseAttributeSets <em>Use Attribute Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Attribute Sets</em>'.
     * @see org.w3._1999.xsl.transform.CopyType#getUseAttributeSets()
     * @see #getCopyType()
     * @generated
     */
    EAttribute getCopyType_UseAttributeSets();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._1999.xsl.transform.CopyType#getType()
     * @see #getCopyType()
     * @generated
     */
    EAttribute getCopyType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.CopyType#getValidation <em>Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation</em>'.
     * @see org.w3._1999.xsl.transform.CopyType#getValidation()
     * @see #getCopyType()
     * @generated
     */
    EAttribute getCopyType_Validation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.DecimalFormatType <em>Decimal Format Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Format Type</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType
     * @generated
     */
    EClass getDecimalFormatType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getName()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDecimalSeparator <em>Decimal Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decimal Separator</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getDecimalSeparator()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_DecimalSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getGroupingSeparator <em>Grouping Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Grouping Separator</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getGroupingSeparator()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_GroupingSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getInfinity <em>Infinity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Infinity</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getInfinity()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_Infinity();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getMinusSign <em>Minus Sign</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minus Sign</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getMinusSign()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_MinusSign();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getNaN <em>Na N</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Na N</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getNaN()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_NaN();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPercent <em>Percent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Percent</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getPercent()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_Percent();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPerMille <em>Per Mille</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Per Mille</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getPerMille()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_PerMille();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getZeroDigit <em>Zero Digit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zero Digit</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getZeroDigit()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_ZeroDigit();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDigit <em>Digit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Digit</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getDigit()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_Digit();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPatternSeparator <em>Pattern Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern Separator</em>'.
     * @see org.w3._1999.xsl.transform.DecimalFormatType#getPatternSeparator()
     * @see #getDecimalFormatType()
     * @generated
     */
    EAttribute getDecimalFormatType_PatternSeparator();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.w3._1999.xsl.transform.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.w3._1999.xsl.transform.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getAnalyzeString <em>Analyze String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Analyze String</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getAnalyzeString()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_AnalyzeString();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getInstruction()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Instruction();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getApplyImports <em>Apply Imports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Apply Imports</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getApplyImports()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ApplyImports();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getApplyTemplates <em>Apply Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Apply Templates</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getApplyTemplates()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ApplyTemplates();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attribute</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getAttribute()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Attribute();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getAttributeSet <em>Attribute Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attribute Set</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getAttributeSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_AttributeSet();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getDeclaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Declaration</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getDeclaration()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Declaration();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getCallTemplate <em>Call Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Template</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getCallTemplate()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallTemplate();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getCharacterMap <em>Character Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Character Map</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getCharacterMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CharacterMap();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getChoose <em>Choose</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choose</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getChoose()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Choose();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Comment</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getComment()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Comment();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getCopy <em>Copy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Copy</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getCopy()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Copy();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getCopyOf <em>Copy Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Copy Of</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getCopyOf()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CopyOf();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getDecimalFormat <em>Decimal Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Decimal Format</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getDecimalFormat()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DecimalFormat();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getDocument <em>Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Document</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getDocument()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Document();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Element();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getFallback <em>Fallback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Fallback</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getFallback()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Fallback();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getForEach <em>For Each</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>For Each</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getForEach()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ForEach();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getForEachGroup <em>For Each Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>For Each Group</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getForEachGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ForEachGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Function</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getFunction()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Function();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getIf <em>If</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>If</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getIf()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_If();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getImport()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Import();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getImportSchema <em>Import Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import Schema</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getImportSchema()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ImportSchema();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Include</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getInclude()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Include();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Key</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getKey()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Key();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getLiteralResultElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LiteralResultElement();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getMatchingSubstring <em>Matching Substring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Matching Substring</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getMatchingSubstring()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MatchingSubstring();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getMessage()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Message();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Namespace</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getNamespace()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Namespace();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getNamespaceAlias <em>Namespace Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Namespace Alias</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getNamespaceAlias()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NamespaceAlias();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getNextMatch <em>Next Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next Match</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getNextMatch()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NextMatch();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getNonMatchingSubstring <em>Non Matching Substring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Non Matching Substring</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getNonMatchingSubstring()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NonMatchingSubstring();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Number</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getNumber()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Number();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getOtherwise <em>Otherwise</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Otherwise</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getOtherwise()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Otherwise();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getOutput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Output();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getOutputCharacter <em>Output Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Character</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getOutputCharacter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OutputCharacter();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getParam <em>Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Param</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getParam()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Param();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getPerformSort <em>Perform Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Perform Sort</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getPerformSort()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PerformSort();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getPreserveSpace <em>Preserve Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Preserve Space</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getPreserveSpace()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PreserveSpace();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getProcessingInstruction <em>Processing Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Processing Instruction</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getProcessingInstruction()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ProcessingInstruction();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getResultDocument <em>Result Document</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Result Document</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getResultDocument()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ResultDocument();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getSequence()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Sequence();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getSort <em>Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sort</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getSort()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Sort();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getStripSpace <em>Strip Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Strip Space</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getStripSpace()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StripSpace();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getStylesheet <em>Stylesheet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Stylesheet</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getStylesheet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Stylesheet();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getTransform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transform</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getTransform()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Transform();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Template</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getTemplate()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Template();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getText()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Text();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getValueOf <em>Value Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Of</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getValueOf()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ValueOf();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getVariable()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Variable();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getWhen <em>When</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>When</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getWhen()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_When();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.DocumentRoot#getWithParam <em>With Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>With Param</em>'.
     * @see org.w3._1999.xsl.transform.DocumentRoot#getWithParam()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WithParam();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.DocumentType <em>Document Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Type</em>'.
     * @see org.w3._1999.xsl.transform.DocumentType
     * @generated
     */
    EClass getDocumentType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DocumentType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._1999.xsl.transform.DocumentType#getType()
     * @see #getDocumentType()
     * @generated
     */
    EAttribute getDocumentType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.DocumentType#getValidation <em>Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation</em>'.
     * @see org.w3._1999.xsl.transform.DocumentType#getValidation()
     * @see #getDocumentType()
     * @generated
     */
    EAttribute getDocumentType_Validation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ElementOnlyVersionedElementType <em>Element Only Versioned Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Only Versioned Element Type</em>'.
     * @see org.w3._1999.xsl.transform.ElementOnlyVersionedElementType
     * @generated
     */
    EClass getElementOnlyVersionedElementType();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ElementType <em>Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Type</em>'.
     * @see org.w3._1999.xsl.transform.ElementType
     * @generated
     */
    EClass getElementType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ElementType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.ElementType#getName()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ElementType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.w3._1999.xsl.transform.ElementType#getNamespace()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ElementType#getInheritNamespaces <em>Inherit Namespaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inherit Namespaces</em>'.
     * @see org.w3._1999.xsl.transform.ElementType#getInheritNamespaces()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_InheritNamespaces();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ElementType#getUseAttributeSets <em>Use Attribute Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Attribute Sets</em>'.
     * @see org.w3._1999.xsl.transform.ElementType#getUseAttributeSets()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_UseAttributeSets();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ElementType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._1999.xsl.transform.ElementType#getType()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ElementType#getValidation <em>Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation</em>'.
     * @see org.w3._1999.xsl.transform.ElementType#getValidation()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Validation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ForEachGroupType <em>For Each Group Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>For Each Group Type</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType
     * @generated
     */
    EClass getForEachGroupType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getSort <em>Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sort</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getSort()
     * @see #getForEachGroupType()
     * @generated
     */
    EReference getForEachGroupType_Sort();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sequence Constructor Group</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getSequenceConstructorGroup()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_SequenceConstructorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getVariable()
     * @see #getForEachGroupType()
     * @generated
     */
    EReference getForEachGroupType_Variable();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getInstructionGroup <em>Instruction Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Instruction Group</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getInstructionGroup()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_InstructionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getInstruction()
     * @see #getForEachGroupType()
     * @generated
     */
    EReference getForEachGroupType_Instruction();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Literal Result Element Group</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getLiteralResultElementGroup()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_LiteralResultElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getLiteralResultElement()
     * @see #getForEachGroupType()
     * @generated
     */
    EReference getForEachGroupType_LiteralResultElement();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getAny()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachGroupType#getAny1 <em>Any1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any1</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getAny1()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_Any1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachGroupType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getSelect()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupBy <em>Group By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group By</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getGroupBy()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_GroupBy();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupAdjacent <em>Group Adjacent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Adjacent</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getGroupAdjacent()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_GroupAdjacent();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupStartingWith <em>Group Starting With</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Starting With</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getGroupStartingWith()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_GroupStartingWith();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachGroupType#getGroupEndingWith <em>Group Ending With</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Ending With</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getGroupEndingWith()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_GroupEndingWith();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachGroupType#getCollation <em>Collation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation</em>'.
     * @see org.w3._1999.xsl.transform.ForEachGroupType#getCollation()
     * @see #getForEachGroupType()
     * @generated
     */
    EAttribute getForEachGroupType_Collation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ForEachType <em>For Each Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>For Each Type</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType
     * @generated
     */
    EClass getForEachType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachType#getSort <em>Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sort</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getSort()
     * @see #getForEachType()
     * @generated
     */
    EReference getForEachType_Sort();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sequence Constructor Group</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getSequenceConstructorGroup()
     * @see #getForEachType()
     * @generated
     */
    EAttribute getForEachType_SequenceConstructorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getVariable()
     * @see #getForEachType()
     * @generated
     */
    EReference getForEachType_Variable();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachType#getInstructionGroup <em>Instruction Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Instruction Group</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getInstructionGroup()
     * @see #getForEachType()
     * @generated
     */
    EAttribute getForEachType_InstructionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachType#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getInstruction()
     * @see #getForEachType()
     * @generated
     */
    EReference getForEachType_Instruction();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Literal Result Element Group</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getLiteralResultElementGroup()
     * @see #getForEachType()
     * @generated
     */
    EAttribute getForEachType_LiteralResultElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.ForEachType#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getLiteralResultElement()
     * @see #getForEachType()
     * @generated
     */
    EReference getForEachType_LiteralResultElement();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getAny()
     * @see #getForEachType()
     * @generated
     */
    EAttribute getForEachType_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.ForEachType#getAny1 <em>Any1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any1</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getAny1()
     * @see #getForEachType()
     * @generated
     */
    EAttribute getForEachType_Any1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ForEachType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.ForEachType#getSelect()
     * @see #getForEachType()
     * @generated
     */
    EAttribute getForEachType_Select();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.FunctionType <em>Function Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Type</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType
     * @generated
     */
    EClass getFunctionType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.FunctionType#getParam <em>Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Param</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getParam()
     * @see #getFunctionType()
     * @generated
     */
    EReference getFunctionType_Param();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.FunctionType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sequence Constructor Group</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getSequenceConstructorGroup()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_SequenceConstructorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.FunctionType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getVariable()
     * @see #getFunctionType()
     * @generated
     */
    EReference getFunctionType_Variable();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.FunctionType#getInstructionGroup <em>Instruction Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Instruction Group</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getInstructionGroup()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_InstructionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.FunctionType#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getInstruction()
     * @see #getFunctionType()
     * @generated
     */
    EReference getFunctionType_Instruction();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.FunctionType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Literal Result Element Group</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getLiteralResultElementGroup()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_LiteralResultElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.FunctionType#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getLiteralResultElement()
     * @see #getFunctionType()
     * @generated
     */
    EReference getFunctionType_LiteralResultElement();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.FunctionType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getAny()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.FunctionType#getAny1 <em>Any1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any1</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getAny1()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_Any1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.FunctionType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getName()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.FunctionType#getOverride <em>Override</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Override</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getOverride()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_Override();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.FunctionType#getAs <em>As</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>As</em>'.
     * @see org.w3._1999.xsl.transform.FunctionType#getAs()
     * @see #getFunctionType()
     * @generated
     */
    EAttribute getFunctionType_As();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.GenericElementType <em>Generic Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic Element Type</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType
     * @generated
     */
    EClass getGenericElementType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.GenericElementType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getMixed()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_Mixed();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.GenericElementType#getDefaultCollation <em>Default Collation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Collation</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getDefaultCollation()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_DefaultCollation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.GenericElementType#getExcludeResultPrefixes <em>Exclude Result Prefixes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exclude Result Prefixes</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getExcludeResultPrefixes()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_ExcludeResultPrefixes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.GenericElementType#getExtensionElementPrefixes <em>Extension Element Prefixes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extension Element Prefixes</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getExtensionElementPrefixes()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_ExtensionElementPrefixes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.GenericElementType#getUseWhen <em>Use When</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use When</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getUseWhen()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_UseWhen();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.GenericElementType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath Default Namespace</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getXpathDefaultNamespace()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_XpathDefaultNamespace();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.GenericElementType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.w3._1999.xsl.transform.GenericElementType#getAnyAttribute()
     * @see #getGenericElementType()
     * @generated
     */
    EAttribute getGenericElementType_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.IfType <em>If Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>If Type</em>'.
     * @see org.w3._1999.xsl.transform.IfType
     * @generated
     */
    EClass getIfType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.IfType#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test</em>'.
     * @see org.w3._1999.xsl.transform.IfType#getTest()
     * @see #getIfType()
     * @generated
     */
    EAttribute getIfType_Test();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ImportSchemaType <em>Import Schema Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Schema Type</em>'.
     * @see org.w3._1999.xsl.transform.ImportSchemaType
     * @generated
     */
    EClass getImportSchemaType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._1999.xsl.transform.ImportSchemaType#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Schema</em>'.
     * @see org.w3._1999.xsl.transform.ImportSchemaType#getSchema()
     * @see #getImportSchemaType()
     * @generated
     */
    EReference getImportSchemaType_Schema();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ImportSchemaType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.w3._1999.xsl.transform.ImportSchemaType#getNamespace()
     * @see #getImportSchemaType()
     * @generated
     */
    EAttribute getImportSchemaType_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ImportSchemaType#getSchemaLocation <em>Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Location</em>'.
     * @see org.w3._1999.xsl.transform.ImportSchemaType#getSchemaLocation()
     * @see #getImportSchemaType()
     * @generated
     */
    EAttribute getImportSchemaType_SchemaLocation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Type</em>'.
     * @see org.w3._1999.xsl.transform.ImportType
     * @generated
     */
    EClass getImportType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ImportType#getHref <em>Href</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Href</em>'.
     * @see org.w3._1999.xsl.transform.ImportType#getHref()
     * @see #getImportType()
     * @generated
     */
    EAttribute getImportType_Href();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.IncludeType <em>Include Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Include Type</em>'.
     * @see org.w3._1999.xsl.transform.IncludeType
     * @generated
     */
    EClass getIncludeType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.IncludeType#getHref <em>Href</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Href</em>'.
     * @see org.w3._1999.xsl.transform.IncludeType#getHref()
     * @see #getIncludeType()
     * @generated
     */
    EAttribute getIncludeType_Href();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.KeyType <em>Key Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Key Type</em>'.
     * @see org.w3._1999.xsl.transform.KeyType
     * @generated
     */
    EClass getKeyType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.KeyType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.KeyType#getName()
     * @see #getKeyType()
     * @generated
     */
    EAttribute getKeyType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.KeyType#getMatch <em>Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Match</em>'.
     * @see org.w3._1999.xsl.transform.KeyType#getMatch()
     * @see #getKeyType()
     * @generated
     */
    EAttribute getKeyType_Match();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.KeyType#getUse <em>Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use</em>'.
     * @see org.w3._1999.xsl.transform.KeyType#getUse()
     * @see #getKeyType()
     * @generated
     */
    EAttribute getKeyType_Use();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.KeyType#getCollation <em>Collation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation</em>'.
     * @see org.w3._1999.xsl.transform.KeyType#getCollation()
     * @see #getKeyType()
     * @generated
     */
    EAttribute getKeyType_Collation();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.MessageType <em>Message Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Type</em>'.
     * @see org.w3._1999.xsl.transform.MessageType
     * @generated
     */
    EClass getMessageType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.MessageType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.MessageType#getSelect()
     * @see #getMessageType()
     * @generated
     */
    EAttribute getMessageType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.MessageType#getTerminate <em>Terminate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Terminate</em>'.
     * @see org.w3._1999.xsl.transform.MessageType#getTerminate()
     * @see #getMessageType()
     * @generated
     */
    EAttribute getMessageType_Terminate();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.NamespaceAliasType <em>Namespace Alias Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace Alias Type</em>'.
     * @see org.w3._1999.xsl.transform.NamespaceAliasType
     * @generated
     */
    EClass getNamespaceAliasType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NamespaceAliasType#getStylesheetPrefix <em>Stylesheet Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stylesheet Prefix</em>'.
     * @see org.w3._1999.xsl.transform.NamespaceAliasType#getStylesheetPrefix()
     * @see #getNamespaceAliasType()
     * @generated
     */
    EAttribute getNamespaceAliasType_StylesheetPrefix();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NamespaceAliasType#getResultPrefix <em>Result Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Result Prefix</em>'.
     * @see org.w3._1999.xsl.transform.NamespaceAliasType#getResultPrefix()
     * @see #getNamespaceAliasType()
     * @generated
     */
    EAttribute getNamespaceAliasType_ResultPrefix();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.NamespaceType <em>Namespace Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace Type</em>'.
     * @see org.w3._1999.xsl.transform.NamespaceType
     * @generated
     */
    EClass getNamespaceType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NamespaceType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.NamespaceType#getName()
     * @see #getNamespaceType()
     * @generated
     */
    EAttribute getNamespaceType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NamespaceType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.NamespaceType#getSelect()
     * @see #getNamespaceType()
     * @generated
     */
    EAttribute getNamespaceType_Select();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.NextMatchType <em>Next Match Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Next Match Type</em>'.
     * @see org.w3._1999.xsl.transform.NextMatchType
     * @generated
     */
    EClass getNextMatchType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.NextMatchType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._1999.xsl.transform.NextMatchType#getGroup()
     * @see #getNextMatchType()
     * @generated
     */
    EAttribute getNextMatchType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.NextMatchType#getWithParam <em>With Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>With Param</em>'.
     * @see org.w3._1999.xsl.transform.NextMatchType#getWithParam()
     * @see #getNextMatchType()
     * @generated
     */
    EReference getNextMatchType_WithParam();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.NextMatchType#getFallback <em>Fallback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fallback</em>'.
     * @see org.w3._1999.xsl.transform.NextMatchType#getFallback()
     * @see #getNextMatchType()
     * @generated
     */
    EReference getNextMatchType_Fallback();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.NumberType <em>Number Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Number Type</em>'.
     * @see org.w3._1999.xsl.transform.NumberType
     * @generated
     */
    EClass getNumberType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getValue()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Value();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getSelect()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getLevel()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Level();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getCount <em>Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Count</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getCount()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Count();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getFrom()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_From();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getFormat <em>Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Format</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getFormat()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Format();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getLang()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Lang();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getLetterValue <em>Letter Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Letter Value</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getLetterValue()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_LetterValue();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getOrdinal <em>Ordinal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ordinal</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getOrdinal()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_Ordinal();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getGroupingSeparator <em>Grouping Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Grouping Separator</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getGroupingSeparator()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_GroupingSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.NumberType#getGroupingSize <em>Grouping Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Grouping Size</em>'.
     * @see org.w3._1999.xsl.transform.NumberType#getGroupingSize()
     * @see #getNumberType()
     * @generated
     */
    EAttribute getNumberType_GroupingSize();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.OutputCharacterType <em>Output Character Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Character Type</em>'.
     * @see org.w3._1999.xsl.transform.OutputCharacterType
     * @generated
     */
    EClass getOutputCharacterType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputCharacterType#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Character</em>'.
     * @see org.w3._1999.xsl.transform.OutputCharacterType#getCharacter()
     * @see #getOutputCharacterType()
     * @generated
     */
    EAttribute getOutputCharacterType_Character();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputCharacterType#getString <em>String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String</em>'.
     * @see org.w3._1999.xsl.transform.OutputCharacterType#getString()
     * @see #getOutputCharacterType()
     * @generated
     */
    EAttribute getOutputCharacterType_String();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.OutputType <em>Output Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Type</em>'.
     * @see org.w3._1999.xsl.transform.OutputType
     * @generated
     */
    EClass getOutputType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getName()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getMethod()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_Method();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getByteOrderMark <em>Byte Order Mark</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Byte Order Mark</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getByteOrderMark()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_ByteOrderMark();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getCdataSectionElements <em>Cdata Section Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdata Section Elements</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getCdataSectionElements()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_CdataSectionElements();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getDoctypePublic <em>Doctype Public</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Doctype Public</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getDoctypePublic()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_DoctypePublic();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getDoctypeSystem <em>Doctype System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Doctype System</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getDoctypeSystem()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_DoctypeSystem();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getEncoding <em>Encoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encoding</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getEncoding()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_Encoding();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escape Uri Attributes</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getEscapeUriAttributes()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_EscapeUriAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getIncludeContentType <em>Include Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include Content Type</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getIncludeContentType()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_IncludeContentType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getIndent <em>Indent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Indent</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getIndent()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_Indent();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getMediaType <em>Media Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Media Type</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getMediaType()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_MediaType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getNormalizationForm <em>Normalization Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Normalization Form</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getNormalizationForm()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_NormalizationForm();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Omit Xml Declaration</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getOmitXmlDeclaration()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_OmitXmlDeclaration();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getStandalone <em>Standalone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standalone</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getStandalone()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_Standalone();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Undeclare Prefixes</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getUndeclarePrefixes()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_UndeclarePrefixes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getUseCharacterMaps <em>Use Character Maps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Character Maps</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getUseCharacterMaps()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_UseCharacterMaps();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.OutputType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.w3._1999.xsl.transform.OutputType#getVersion()
     * @see #getOutputType()
     * @generated
     */
    EAttribute getOutputType_Version();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ParamType <em>Param Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Param Type</em>'.
     * @see org.w3._1999.xsl.transform.ParamType
     * @generated
     */
    EClass getParamType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ParamType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.ParamType#getName()
     * @see #getParamType()
     * @generated
     */
    EAttribute getParamType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ParamType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.ParamType#getSelect()
     * @see #getParamType()
     * @generated
     */
    EAttribute getParamType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ParamType#getAs <em>As</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>As</em>'.
     * @see org.w3._1999.xsl.transform.ParamType#getAs()
     * @see #getParamType()
     * @generated
     */
    EAttribute getParamType_As();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ParamType#getRequired <em>Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Required</em>'.
     * @see org.w3._1999.xsl.transform.ParamType#getRequired()
     * @see #getParamType()
     * @generated
     */
    EAttribute getParamType_Required();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ParamType#getTunnel <em>Tunnel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tunnel</em>'.
     * @see org.w3._1999.xsl.transform.ParamType#getTunnel()
     * @see #getParamType()
     * @generated
     */
    EAttribute getParamType_Tunnel();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.PerformSortType <em>Perform Sort Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Perform Sort Type</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType
     * @generated
     */
    EClass getPerformSortType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.PerformSortType#getSort <em>Sort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sort</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getSort()
     * @see #getPerformSortType()
     * @generated
     */
    EReference getPerformSortType_Sort();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.PerformSortType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sequence Constructor Group</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getSequenceConstructorGroup()
     * @see #getPerformSortType()
     * @generated
     */
    EAttribute getPerformSortType_SequenceConstructorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.PerformSortType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getVariable()
     * @see #getPerformSortType()
     * @generated
     */
    EReference getPerformSortType_Variable();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.PerformSortType#getInstructionGroup <em>Instruction Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Instruction Group</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getInstructionGroup()
     * @see #getPerformSortType()
     * @generated
     */
    EAttribute getPerformSortType_InstructionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.PerformSortType#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getInstruction()
     * @see #getPerformSortType()
     * @generated
     */
    EReference getPerformSortType_Instruction();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.PerformSortType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Literal Result Element Group</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getLiteralResultElementGroup()
     * @see #getPerformSortType()
     * @generated
     */
    EAttribute getPerformSortType_LiteralResultElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.PerformSortType#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getLiteralResultElement()
     * @see #getPerformSortType()
     * @generated
     */
    EReference getPerformSortType_LiteralResultElement();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.PerformSortType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getAny()
     * @see #getPerformSortType()
     * @generated
     */
    EAttribute getPerformSortType_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.PerformSortType#getAny1 <em>Any1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any1</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getAny1()
     * @see #getPerformSortType()
     * @generated
     */
    EAttribute getPerformSortType_Any1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.PerformSortType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.PerformSortType#getSelect()
     * @see #getPerformSortType()
     * @generated
     */
    EAttribute getPerformSortType_Select();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.PreserveSpaceType <em>Preserve Space Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Preserve Space Type</em>'.
     * @see org.w3._1999.xsl.transform.PreserveSpaceType
     * @generated
     */
    EClass getPreserveSpaceType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.PreserveSpaceType#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Elements</em>'.
     * @see org.w3._1999.xsl.transform.PreserveSpaceType#getElements()
     * @see #getPreserveSpaceType()
     * @generated
     */
    EAttribute getPreserveSpaceType_Elements();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ProcessingInstructionType <em>Processing Instruction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Processing Instruction Type</em>'.
     * @see org.w3._1999.xsl.transform.ProcessingInstructionType
     * @generated
     */
    EClass getProcessingInstructionType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ProcessingInstructionType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.ProcessingInstructionType#getName()
     * @see #getProcessingInstructionType()
     * @generated
     */
    EAttribute getProcessingInstructionType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ProcessingInstructionType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.ProcessingInstructionType#getSelect()
     * @see #getProcessingInstructionType()
     * @generated
     */
    EAttribute getProcessingInstructionType_Select();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ResultDocumentType <em>Result Document Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Document Type</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType
     * @generated
     */
    EClass getResultDocumentType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getFormat <em>Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Format</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getFormat()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Format();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getHref <em>Href</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Href</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getHref()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Href();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getType()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getValidation <em>Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getValidation()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Validation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getMethod()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Method();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getByteOrderMark <em>Byte Order Mark</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Byte Order Mark</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getByteOrderMark()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_ByteOrderMark();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getCdataSectionElements <em>Cdata Section Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdata Section Elements</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getCdataSectionElements()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_CdataSectionElements();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getDoctypePublic <em>Doctype Public</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Doctype Public</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getDoctypePublic()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_DoctypePublic();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getDoctypeSystem <em>Doctype System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Doctype System</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getDoctypeSystem()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_DoctypeSystem();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getEncoding <em>Encoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encoding</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getEncoding()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Encoding();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escape Uri Attributes</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getEscapeUriAttributes()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_EscapeUriAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getIncludeContentType <em>Include Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Include Content Type</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getIncludeContentType()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_IncludeContentType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getIndent <em>Indent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Indent</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getIndent()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Indent();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getMediaType <em>Media Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Media Type</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getMediaType()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_MediaType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getNormalizationForm <em>Normalization Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Normalization Form</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getNormalizationForm()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_NormalizationForm();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Omit Xml Declaration</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getOmitXmlDeclaration()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_OmitXmlDeclaration();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getStandalone <em>Standalone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standalone</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getStandalone()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_Standalone();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Undeclare Prefixes</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getUndeclarePrefixes()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_UndeclarePrefixes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getUseCharacterMaps <em>Use Character Maps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Character Maps</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getUseCharacterMaps()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_UseCharacterMaps();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ResultDocumentType#getOutputVersion <em>Output Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Version</em>'.
     * @see org.w3._1999.xsl.transform.ResultDocumentType#getOutputVersion()
     * @see #getResultDocumentType()
     * @generated
     */
    EAttribute getResultDocumentType_OutputVersion();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.SequenceConstructor <em>Sequence Constructor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Constructor</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor
     * @generated
     */
    EClass getSequenceConstructor();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sequence Constructor Group</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getSequenceConstructorGroup()
     * @see #getSequenceConstructor()
     * @generated
     */
    EAttribute getSequenceConstructor_SequenceConstructorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getVariable()
     * @see #getSequenceConstructor()
     * @generated
     */
    EReference getSequenceConstructor_Variable();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getInstructionGroup <em>Instruction Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Instruction Group</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getInstructionGroup()
     * @see #getSequenceConstructor()
     * @generated
     */
    EAttribute getSequenceConstructor_InstructionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getInstruction()
     * @see #getSequenceConstructor()
     * @generated
     */
    EReference getSequenceConstructor_Instruction();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getLiteralResultElementGroup <em>Literal Result Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Literal Result Element Group</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getLiteralResultElementGroup()
     * @see #getSequenceConstructor()
     * @generated
     */
    EAttribute getSequenceConstructor_LiteralResultElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getLiteralResultElement()
     * @see #getSequenceConstructor()
     * @generated
     */
    EReference getSequenceConstructor_LiteralResultElement();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getAny()
     * @see #getSequenceConstructor()
     * @generated
     */
    EAttribute getSequenceConstructor_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.SequenceConstructor#getAny1 <em>Any1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any1</em>'.
     * @see org.w3._1999.xsl.transform.SequenceConstructor#getAny1()
     * @see #getSequenceConstructor()
     * @generated
     */
    EAttribute getSequenceConstructor_Any1();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.SequenceType <em>Sequence Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Type</em>'.
     * @see org.w3._1999.xsl.transform.SequenceType
     * @generated
     */
    EClass getSequenceType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.SequenceType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._1999.xsl.transform.SequenceType#getGroup()
     * @see #getSequenceType()
     * @generated
     */
    EAttribute getSequenceType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.SequenceType#getFallback <em>Fallback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fallback</em>'.
     * @see org.w3._1999.xsl.transform.SequenceType#getFallback()
     * @see #getSequenceType()
     * @generated
     */
    EReference getSequenceType_Fallback();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SequenceType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.SequenceType#getSelect()
     * @see #getSequenceType()
     * @generated
     */
    EAttribute getSequenceType_Select();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.SortType <em>Sort Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sort Type</em>'.
     * @see org.w3._1999.xsl.transform.SortType
     * @generated
     */
    EClass getSortType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getSelect()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getLang()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_Lang();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getDataType()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_DataType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getOrder <em>Order</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Order</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getOrder()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_Order();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getCaseOrder <em>Case Order</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Case Order</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getCaseOrder()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_CaseOrder();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getCollation <em>Collation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getCollation()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_Collation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.SortType#getStable <em>Stable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stable</em>'.
     * @see org.w3._1999.xsl.transform.SortType#getStable()
     * @see #getSortType()
     * @generated
     */
    EAttribute getSortType_Stable();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.StripSpaceType <em>Strip Space Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Strip Space Type</em>'.
     * @see org.w3._1999.xsl.transform.StripSpaceType
     * @generated
     */
    EClass getStripSpaceType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.StripSpaceType#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Elements</em>'.
     * @see org.w3._1999.xsl.transform.StripSpaceType#getElements()
     * @see #getStripSpaceType()
     * @generated
     */
    EAttribute getStripSpaceType_Elements();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.TemplateType <em>Template Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Template Type</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType
     * @generated
     */
    EClass getTemplateType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TemplateType#getParam <em>Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Param</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getParam()
     * @see #getTemplateType()
     * @generated
     */
    EReference getTemplateType_Param();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TemplateType#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sequence Constructor Group</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getSequenceConstructorGroup()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_SequenceConstructorGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TemplateType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getVariable()
     * @see #getTemplateType()
     * @generated
     */
    EReference getTemplateType_Variable();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TemplateType#getInstructionGroup <em>Instruction Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Instruction Group</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getInstructionGroup()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_InstructionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TemplateType#getInstruction <em>Instruction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instruction</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getInstruction()
     * @see #getTemplateType()
     * @generated
     */
    EReference getTemplateType_Instruction();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TemplateType#getLiteralResultElementGroup <em>Literal Result Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Literal Result Element Group</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getLiteralResultElementGroup()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_LiteralResultElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TemplateType#getLiteralResultElement <em>Literal Result Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal Result Element</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getLiteralResultElement()
     * @see #getTemplateType()
     * @generated
     */
    EReference getTemplateType_LiteralResultElement();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TemplateType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getAny()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TemplateType#getAny1 <em>Any1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any1</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getAny1()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_Any1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TemplateType#getMatch <em>Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Match</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getMatch()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_Match();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TemplateType#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getPriority()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_Priority();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TemplateType#getMode <em>Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mode</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getMode()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_Mode();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TemplateType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getName()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TemplateType#getAs <em>As</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>As</em>'.
     * @see org.w3._1999.xsl.transform.TemplateType#getAs()
     * @see #getTemplateType()
     * @generated
     */
    EAttribute getTemplateType_As();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.TextElementBaseType <em>Text Element Base Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Element Base Type</em>'.
     * @see org.w3._1999.xsl.transform.TextElementBaseType
     * @generated
     */
    EClass getTextElementBaseType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TextElementBaseType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.w3._1999.xsl.transform.TextElementBaseType#getValue()
     * @see #getTextElementBaseType()
     * @generated
     */
    EAttribute getTextElementBaseType_Value();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.TextType <em>Text Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Type</em>'.
     * @see org.w3._1999.xsl.transform.TextType
     * @generated
     */
    EClass getTextType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TextType#getDisableOutputEscaping <em>Disable Output Escaping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Output Escaping</em>'.
     * @see org.w3._1999.xsl.transform.TextType#getDisableOutputEscaping()
     * @see #getTextType()
     * @generated
     */
    EAttribute getTextType_DisableOutputEscaping();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.TransformElementBaseType <em>Transform Element Base Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transform Element Base Type</em>'.
     * @see org.w3._1999.xsl.transform.TransformElementBaseType
     * @generated
     */
    EClass getTransformElementBaseType();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.TransformType <em>Transform Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transform Type</em>'.
     * @see org.w3._1999.xsl.transform.TransformType
     * @generated
     */
    EClass getTransformType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TransformType#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Import</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getImport()
     * @see #getTransformType()
     * @generated
     */
    EReference getTransformType_Import();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TransformType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getGroup()
     * @see #getTransformType()
     * @generated
     */
    EAttribute getTransformType_Group();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TransformType#getDeclarationGroup <em>Declaration Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Declaration Group</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getDeclarationGroup()
     * @see #getTransformType()
     * @generated
     */
    EAttribute getTransformType_DeclarationGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TransformType#getDeclaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Declaration</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getDeclaration()
     * @see #getTransformType()
     * @generated
     */
    EReference getTransformType_Declaration();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TransformType#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getVariable()
     * @see #getTransformType()
     * @generated
     */
    EReference getTransformType_Variable();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._1999.xsl.transform.TransformType#getParam <em>Param</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Param</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getParam()
     * @see #getTransformType()
     * @generated
     */
    EReference getTransformType_Param();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._1999.xsl.transform.TransformType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getAny()
     * @see #getTransformType()
     * @generated
     */
    EAttribute getTransformType_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TransformType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getId()
     * @see #getTransformType()
     * @generated
     */
    EAttribute getTransformType_Id();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TransformType#getDefaultValidation <em>Default Validation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Validation</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getDefaultValidation()
     * @see #getTransformType()
     * @generated
     */
    EAttribute getTransformType_DefaultValidation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.TransformType#getInputTypeAnnotations <em>Input Type Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Type Annotations</em>'.
     * @see org.w3._1999.xsl.transform.TransformType#getInputTypeAnnotations()
     * @see #getTransformType()
     * @generated
     */
    EAttribute getTransformType_InputTypeAnnotations();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.ValueOfType <em>Value Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Of Type</em>'.
     * @see org.w3._1999.xsl.transform.ValueOfType
     * @generated
     */
    EClass getValueOfType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ValueOfType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.ValueOfType#getSelect()
     * @see #getValueOfType()
     * @generated
     */
    EAttribute getValueOfType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ValueOfType#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.w3._1999.xsl.transform.ValueOfType#getSeparator()
     * @see #getValueOfType()
     * @generated
     */
    EAttribute getValueOfType_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.ValueOfType#getDisableOutputEscaping <em>Disable Output Escaping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Output Escaping</em>'.
     * @see org.w3._1999.xsl.transform.ValueOfType#getDisableOutputEscaping()
     * @see #getValueOfType()
     * @generated
     */
    EAttribute getValueOfType_DisableOutputEscaping();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.VariableType <em>Variable Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Type</em>'.
     * @see org.w3._1999.xsl.transform.VariableType
     * @generated
     */
    EClass getVariableType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.VariableType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.VariableType#getName()
     * @see #getVariableType()
     * @generated
     */
    EAttribute getVariableType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.VariableType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.VariableType#getSelect()
     * @see #getVariableType()
     * @generated
     */
    EAttribute getVariableType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.VariableType#getAs <em>As</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>As</em>'.
     * @see org.w3._1999.xsl.transform.VariableType#getAs()
     * @see #getVariableType()
     * @generated
     */
    EAttribute getVariableType_As();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.VersionedElementType <em>Versioned Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Versioned Element Type</em>'.
     * @see org.w3._1999.xsl.transform.VersionedElementType
     * @generated
     */
    EClass getVersionedElementType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.VersionedElementType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.w3._1999.xsl.transform.VersionedElementType#getVersion()
     * @see #getVersionedElementType()
     * @generated
     */
    EAttribute getVersionedElementType_Version();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.WhenType <em>When Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>When Type</em>'.
     * @see org.w3._1999.xsl.transform.WhenType
     * @generated
     */
    EClass getWhenType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.WhenType#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test</em>'.
     * @see org.w3._1999.xsl.transform.WhenType#getTest()
     * @see #getWhenType()
     * @generated
     */
    EAttribute getWhenType_Test();

    /**
     * Returns the meta object for class '{@link org.w3._1999.xsl.transform.WithParamType <em>With Param Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>With Param Type</em>'.
     * @see org.w3._1999.xsl.transform.WithParamType
     * @generated
     */
    EClass getWithParamType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.WithParamType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._1999.xsl.transform.WithParamType#getName()
     * @see #getWithParamType()
     * @generated
     */
    EAttribute getWithParamType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.WithParamType#getSelect <em>Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select</em>'.
     * @see org.w3._1999.xsl.transform.WithParamType#getSelect()
     * @see #getWithParamType()
     * @generated
     */
    EAttribute getWithParamType_Select();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.WithParamType#getAs <em>As</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>As</em>'.
     * @see org.w3._1999.xsl.transform.WithParamType#getAs()
     * @see #getWithParamType()
     * @generated
     */
    EAttribute getWithParamType_As();

    /**
     * Returns the meta object for the attribute '{@link org.w3._1999.xsl.transform.WithParamType#getTunnel <em>Tunnel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tunnel</em>'.
     * @see org.w3._1999.xsl.transform.WithParamType#getTunnel()
     * @see #getWithParamType()
     * @generated
     */
    EAttribute getWithParamType_Tunnel();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.InputTypeAnnotationsType <em>Input Type Annotations Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Input Type Annotations Type</em>'.
     * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
     * @generated
     */
    EEnum getInputTypeAnnotationsType();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.Level <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Level</em>'.
     * @see org.w3._1999.xsl.transform.Level
     * @generated
     */
    EEnum getLevel();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.MethodMember0 <em>Method Member0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Method Member0</em>'.
     * @see org.w3._1999.xsl.transform.MethodMember0
     * @generated
     */
    EEnum getMethodMember0();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.ModeMember1 <em>Mode Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Mode Member1</em>'.
     * @see org.w3._1999.xsl.transform.ModeMember1
     * @generated
     */
    EEnum getModeMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.ModesMember0ItemMember1 <em>Modes Member0 Item Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Modes Member0 Item Member1</em>'.
     * @see org.w3._1999.xsl.transform.ModesMember0ItemMember1
     * @generated
     */
    EEnum getModesMember0ItemMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.ModesMember1 <em>Modes Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Modes Member1</em>'.
     * @see org.w3._1999.xsl.transform.ModesMember1
     * @generated
     */
    EEnum getModesMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.NametestsItemMember1 <em>Nametests Item Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Nametests Item Member1</em>'.
     * @see org.w3._1999.xsl.transform.NametestsItemMember1
     * @generated
     */
    EEnum getNametestsItemMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.PrefixListOrAllMember1 <em>Prefix List Or All Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Prefix List Or All Member1</em>'.
     * @see org.w3._1999.xsl.transform.PrefixListOrAllMember1
     * @generated
     */
    EEnum getPrefixListOrAllMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.PrefixOrDefaultMember1 <em>Prefix Or Default Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Prefix Or Default Member1</em>'.
     * @see org.w3._1999.xsl.transform.PrefixOrDefaultMember1
     * @generated
     */
    EEnum getPrefixOrDefaultMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.ValidationStripOrPreserve <em>Validation Strip Or Preserve</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Validation Strip Or Preserve</em>'.
     * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
     * @generated
     */
    EEnum getValidationStripOrPreserve();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.ValidationType <em>Validation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Validation Type</em>'.
     * @see org.w3._1999.xsl.transform.ValidationType
     * @generated
     */
    EEnum getValidationType();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.YesOrNo <em>Yes Or No</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Yes Or No</em>'.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @generated
     */
    EEnum getYesOrNo();

    /**
     * Returns the meta object for enum '{@link org.w3._1999.xsl.transform.YesOrNoOrOmit <em>Yes Or No Or Omit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Yes Or No Or Omit</em>'.
     * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
     * @generated
     */
    EEnum getYesOrNoOrOmit();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Avt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Avt</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='avt' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
     * @generated
     */
    EDataType getAvt();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Char</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Char</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='char' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='1'"
     * @generated
     */
    EDataType getChar();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Expression</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='expression' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='.+'"
     * @generated
     */
    EDataType getExpression();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.InputTypeAnnotationsType <em>Input Type Annotations Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Input Type Annotations Type Object</em>'.
     * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
     * @model instanceClass="org.w3._1999.xsl.transform.InputTypeAnnotationsType"
     *        extendedMetaData="name='input-type-annotations-type:Object' baseType='input-type-annotations-type'"
     * @generated
     */
    EDataType getInputTypeAnnotationsTypeObject();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.Level <em>Level Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Level Object</em>'.
     * @see org.w3._1999.xsl.transform.Level
     * @model instanceClass="org.w3._1999.xsl.transform.Level"
     *        extendedMetaData="name='level:Object' baseType='level'"
     * @generated
     */
    EDataType getLevelObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Method</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='method' memberTypes='method_._member_._0 method_._member_._1'"
     * @generated
     */
    EDataType getMethod();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.MethodMember0 <em>Method Member0 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Method Member0 Object</em>'.
     * @see org.w3._1999.xsl.transform.MethodMember0
     * @model instanceClass="org.w3._1999.xsl.transform.MethodMember0"
     *        extendedMetaData="name='method_._member_._0:Object' baseType='method_._member_._0'"
     * @generated
     */
    EDataType getMethodMember0Object();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Method Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Method Member1</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='method_._member_._1' baseType='QName' pattern='\\c*:\\c*'"
     * @generated
     */
    EDataType getMethodMember1();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Mode</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='mode' memberTypes='QName mode_._member_._1'"
     * @generated
     */
    EDataType getMode();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.ModeMember1 <em>Mode Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Mode Member1 Object</em>'.
     * @see org.w3._1999.xsl.transform.ModeMember1
     * @model instanceClass="org.w3._1999.xsl.transform.ModeMember1"
     *        extendedMetaData="name='mode_._member_._1:Object' baseType='mode_._member_._1'"
     * @generated
     */
    EDataType getModeMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Modes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modes</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='modes' memberTypes='modes_._member_._0 modes_._member_._1'"
     * @generated
     */
    EDataType getModes();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Modes Member0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modes Member0</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='modes_._member_._0' itemType='modes_._member_._0_._item'"
     * @generated
     */
    EDataType getModesMember0();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Modes Member0 Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modes Member0 Item</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='modes_._member_._0_._item' memberTypes='QName modes_._member_._0_._item_._member_._1'"
     * @generated
     */
    EDataType getModesMember0Item();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.ModesMember0ItemMember1 <em>Modes Member0 Item Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modes Member0 Item Member1 Object</em>'.
     * @see org.w3._1999.xsl.transform.ModesMember0ItemMember1
     * @model instanceClass="org.w3._1999.xsl.transform.ModesMember0ItemMember1"
     *        extendedMetaData="name='modes_._member_._0_._item_._member_._1:Object' baseType='modes_._member_._0_._item_._member_._1'"
     * @generated
     */
    EDataType getModesMember0ItemMember1Object();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.ModesMember1 <em>Modes Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modes Member1 Object</em>'.
     * @see org.w3._1999.xsl.transform.ModesMember1
     * @model instanceClass="org.w3._1999.xsl.transform.ModesMember1"
     *        extendedMetaData="name='modes_._member_._1:Object' baseType='modes_._member_._1'"
     * @generated
     */
    EDataType getModesMember1Object();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Nametests</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Nametests</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='nametests' itemType='nametests_._item'"
     * @generated
     */
    EDataType getNametests();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Nametests Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Nametests Item</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='nametests_._item' memberTypes='QName nametests_._item_._member_._1 nametests_._item_._member_._2'"
     * @generated
     */
    EDataType getNametestsItem();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.NametestsItemMember1 <em>Nametests Item Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Nametests Item Member1 Object</em>'.
     * @see org.w3._1999.xsl.transform.NametestsItemMember1
     * @model instanceClass="org.w3._1999.xsl.transform.NametestsItemMember1"
     *        extendedMetaData="name='nametests_._item_._member_._1:Object' baseType='nametests_._item_._member_._1'"
     * @generated
     */
    EDataType getNametestsItemMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Nametests Item Member2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Nametests Item Member2</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='nametests_._item_._member_._2' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\i\\c*:\\* \\*:\\i\\c*'"
     * @generated
     */
    EDataType getNametestsItemMember2();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pattern</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='pattern' baseType='expression'"
     * @generated
     */
    EDataType getPattern();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Prefixes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prefixes</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='prefixes' itemType='http://www.eclipse.org/emf/2003/XMLType#NCName'"
     * @generated
     */
    EDataType getPrefixes();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Prefix List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prefix List</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='prefix-list' itemType='prefix-or-default'"
     * @generated
     */
    EDataType getPrefixList();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Prefix List Or All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prefix List Or All</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='prefix-list-or-all' memberTypes='prefix-list prefix-list-or-all_._member_._1'"
     * @generated
     */
    EDataType getPrefixListOrAll();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.PrefixListOrAllMember1 <em>Prefix List Or All Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prefix List Or All Member1 Object</em>'.
     * @see org.w3._1999.xsl.transform.PrefixListOrAllMember1
     * @model instanceClass="org.w3._1999.xsl.transform.PrefixListOrAllMember1"
     *        extendedMetaData="name='prefix-list-or-all_._member_._1:Object' baseType='prefix-list-or-all_._member_._1'"
     * @generated
     */
    EDataType getPrefixListOrAllMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Prefix Or Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prefix Or Default</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='prefix-or-default' memberTypes='http://www.eclipse.org/emf/2003/XMLType#NCName prefix-or-default_._member_._1'"
     * @generated
     */
    EDataType getPrefixOrDefault();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.PrefixOrDefaultMember1 <em>Prefix Or Default Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Prefix Or Default Member1 Object</em>'.
     * @see org.w3._1999.xsl.transform.PrefixOrDefaultMember1
     * @model instanceClass="org.w3._1999.xsl.transform.PrefixOrDefaultMember1"
     *        extendedMetaData="name='prefix-or-default_._member_._1:Object' baseType='prefix-or-default_._member_._1'"
     * @generated
     */
    EDataType getPrefixOrDefaultMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>QName</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>QName</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='QName' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='([^:]+:)?[^:]+'"
     * @generated
     */
    EDataType getQName();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>QNames</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>QNames</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='QNames' itemType='QName'"
     * @generated
     */
    EDataType getQNames();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Sequence Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Sequence Type1</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='sequence-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='.+'"
     * @generated
     */
    EDataType getSequenceType1();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Text Element Base Type Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Text Element Base Type Base</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='text-element-base-type_._base' baseType='text-element-base-type_._base_._base'"
     * @generated
     */
    EDataType getTextElementBaseTypeBase();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Text Element Base Type Base Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Text Element Base Type Base Base</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='text-element-base-type_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
     * @generated
     */
    EDataType getTextElementBaseTypeBaseBase();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Uri List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Uri List</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='uri-list' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
     * @generated
     */
    EDataType getUriList();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.ValidationStripOrPreserve <em>Validation Strip Or Preserve Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Validation Strip Or Preserve Object</em>'.
     * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
     * @model instanceClass="org.w3._1999.xsl.transform.ValidationStripOrPreserve"
     *        extendedMetaData="name='validation-strip-or-preserve:Object' baseType='validation-strip-or-preserve'"
     * @generated
     */
    EDataType getValidationStripOrPreserveObject();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.ValidationType <em>Validation Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Validation Type Object</em>'.
     * @see org.w3._1999.xsl.transform.ValidationType
     * @model instanceClass="org.w3._1999.xsl.transform.ValidationType"
     *        extendedMetaData="name='validation-type:Object' baseType='validation-type'"
     * @generated
     */
    EDataType getValidationTypeObject();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.YesOrNo <em>Yes Or No Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Yes Or No Object</em>'.
     * @see org.w3._1999.xsl.transform.YesOrNo
     * @model instanceClass="org.w3._1999.xsl.transform.YesOrNo"
     *        extendedMetaData="name='yes-or-no:Object' baseType='yes-or-no'"
     * @generated
     */
    EDataType getYesOrNoObject();

    /**
     * Returns the meta object for data type '{@link org.w3._1999.xsl.transform.YesOrNoOrOmit <em>Yes Or No Or Omit Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Yes Or No Or Omit Object</em>'.
     * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
     * @model instanceClass="org.w3._1999.xsl.transform.YesOrNoOrOmit"
     *        extendedMetaData="name='yes-or-no-or-omit:Object' baseType='yes-or-no-or-omit'"
     * @generated
     */
    EDataType getYesOrNoOrOmitObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    XSLT20Factory getXSLT20Factory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl <em>Analyze String Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAnalyzeStringType()
         * @generated
         */
        EClass ANALYZE_STRING_TYPE = eINSTANCE.getAnalyzeStringType();

        /**
         * The meta object literal for the '<em><b>Matching Substring</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYZE_STRING_TYPE__MATCHING_SUBSTRING = eINSTANCE.getAnalyzeStringType_MatchingSubstring();

        /**
         * The meta object literal for the '<em><b>Non Matching Substring</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING = eINSTANCE.getAnalyzeStringType_NonMatchingSubstring();

        /**
         * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYZE_STRING_TYPE__FALLBACK = eINSTANCE.getAnalyzeStringType_Fallback();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZE_STRING_TYPE__SELECT = eINSTANCE.getAnalyzeStringType_Select();

        /**
         * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZE_STRING_TYPE__REGEX = eINSTANCE.getAnalyzeStringType_Regex();

        /**
         * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZE_STRING_TYPE__FLAGS = eINSTANCE.getAnalyzeStringType_Flags();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ApplyImportsTypeImpl <em>Apply Imports Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ApplyImportsTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getApplyImportsType()
         * @generated
         */
        EClass APPLY_IMPORTS_TYPE = eINSTANCE.getApplyImportsType();

        /**
         * The meta object literal for the '<em><b>With Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLY_IMPORTS_TYPE__WITH_PARAM = eINSTANCE.getApplyImportsType_WithParam();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl <em>Apply Templates Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getApplyTemplatesType()
         * @generated
         */
        EClass APPLY_TEMPLATES_TYPE = eINSTANCE.getApplyTemplatesType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLY_TEMPLATES_TYPE__GROUP = eINSTANCE.getApplyTemplatesType_Group();

        /**
         * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLY_TEMPLATES_TYPE__SORT = eINSTANCE.getApplyTemplatesType_Sort();

        /**
         * The meta object literal for the '<em><b>With Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLY_TEMPLATES_TYPE__WITH_PARAM = eINSTANCE.getApplyTemplatesType_WithParam();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLY_TEMPLATES_TYPE__SELECT = eINSTANCE.getApplyTemplatesType_Select();

        /**
         * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLY_TEMPLATES_TYPE__MODE = eINSTANCE.getApplyTemplatesType_Mode();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl <em>Attribute Set Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAttributeSetType()
         * @generated
         */
        EClass ATTRIBUTE_SET_TYPE = eINSTANCE.getAttributeSetType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_SET_TYPE__GROUP = eINSTANCE.getAttributeSetType_Group();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_SET_TYPE__ATTRIBUTE = eINSTANCE.getAttributeSetType_Attribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_SET_TYPE__NAME = eINSTANCE.getAttributeSetType_Name();

        /**
         * The meta object literal for the '<em><b>Use Attribute Sets</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS = eINSTANCE.getAttributeSetType_UseAttributeSets();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.AttributeTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAttributeType()
         * @generated
         */
        EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__NAMESPACE = eINSTANCE.getAttributeType_Namespace();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__SELECT = eINSTANCE.getAttributeType_Select();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__SEPARATOR = eINSTANCE.getAttributeType_Separator();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__TYPE = eINSTANCE.getAttributeType_Type();

        /**
         * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__VALIDATION = eINSTANCE.getAttributeType_Validation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.CallTemplateTypeImpl <em>Call Template Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.CallTemplateTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCallTemplateType()
         * @generated
         */
        EClass CALL_TEMPLATE_TYPE = eINSTANCE.getCallTemplateType();

        /**
         * The meta object literal for the '<em><b>With Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CALL_TEMPLATE_TYPE__WITH_PARAM = eINSTANCE.getCallTemplateType_WithParam();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CALL_TEMPLATE_TYPE__NAME = eINSTANCE.getCallTemplateType_Name();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl <em>Character Map Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCharacterMapType()
         * @generated
         */
        EClass CHARACTER_MAP_TYPE = eINSTANCE.getCharacterMapType();

        /**
         * The meta object literal for the '<em><b>Output Character</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHARACTER_MAP_TYPE__OUTPUT_CHARACTER = eINSTANCE.getCharacterMapType_OutputCharacter();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHARACTER_MAP_TYPE__NAME = eINSTANCE.getCharacterMapType_Name();

        /**
         * The meta object literal for the '<em><b>Use Character Maps</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS = eINSTANCE.getCharacterMapType_UseCharacterMaps();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ChooseTypeImpl <em>Choose Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ChooseTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getChooseType()
         * @generated
         */
        EClass CHOOSE_TYPE = eINSTANCE.getChooseType();

        /**
         * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHOOSE_TYPE__WHEN = eINSTANCE.getChooseType_When();

        /**
         * The meta object literal for the '<em><b>Otherwise</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHOOSE_TYPE__OTHERWISE = eINSTANCE.getChooseType_Otherwise();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.CommentTypeImpl <em>Comment Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.CommentTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCommentType()
         * @generated
         */
        EClass COMMENT_TYPE = eINSTANCE.getCommentType();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMENT_TYPE__SELECT = eINSTANCE.getCommentType_Select();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.CopyOfTypeImpl <em>Copy Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.CopyOfTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCopyOfType()
         * @generated
         */
        EClass COPY_OF_TYPE = eINSTANCE.getCopyOfType();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_OF_TYPE__SELECT = eINSTANCE.getCopyOfType_Select();

        /**
         * The meta object literal for the '<em><b>Copy Namespaces</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_OF_TYPE__COPY_NAMESPACES = eINSTANCE.getCopyOfType_CopyNamespaces();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_OF_TYPE__TYPE = eINSTANCE.getCopyOfType_Type();

        /**
         * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_OF_TYPE__VALIDATION = eINSTANCE.getCopyOfType_Validation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl <em>Copy Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.CopyTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getCopyType()
         * @generated
         */
        EClass COPY_TYPE = eINSTANCE.getCopyType();

        /**
         * The meta object literal for the '<em><b>Copy Namespaces</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_TYPE__COPY_NAMESPACES = eINSTANCE.getCopyType_CopyNamespaces();

        /**
         * The meta object literal for the '<em><b>Inherit Namespaces</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_TYPE__INHERIT_NAMESPACES = eINSTANCE.getCopyType_InheritNamespaces();

        /**
         * The meta object literal for the '<em><b>Use Attribute Sets</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_TYPE__USE_ATTRIBUTE_SETS = eINSTANCE.getCopyType_UseAttributeSets();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_TYPE__TYPE = eINSTANCE.getCopyType_Type();

        /**
         * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COPY_TYPE__VALIDATION = eINSTANCE.getCopyType_Validation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl <em>Decimal Format Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getDecimalFormatType()
         * @generated
         */
        EClass DECIMAL_FORMAT_TYPE = eINSTANCE.getDecimalFormatType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__NAME = eINSTANCE.getDecimalFormatType_Name();

        /**
         * The meta object literal for the '<em><b>Decimal Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR = eINSTANCE.getDecimalFormatType_DecimalSeparator();

        /**
         * The meta object literal for the '<em><b>Grouping Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR = eINSTANCE.getDecimalFormatType_GroupingSeparator();

        /**
         * The meta object literal for the '<em><b>Infinity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__INFINITY = eINSTANCE.getDecimalFormatType_Infinity();

        /**
         * The meta object literal for the '<em><b>Minus Sign</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__MINUS_SIGN = eINSTANCE.getDecimalFormatType_MinusSign();

        /**
         * The meta object literal for the '<em><b>Na N</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__NA_N = eINSTANCE.getDecimalFormatType_NaN();

        /**
         * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__PERCENT = eINSTANCE.getDecimalFormatType_Percent();

        /**
         * The meta object literal for the '<em><b>Per Mille</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__PER_MILLE = eINSTANCE.getDecimalFormatType_PerMille();

        /**
         * The meta object literal for the '<em><b>Zero Digit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__ZERO_DIGIT = eINSTANCE.getDecimalFormatType_ZeroDigit();

        /**
         * The meta object literal for the '<em><b>Digit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__DIGIT = eINSTANCE.getDecimalFormatType_Digit();

        /**
         * The meta object literal for the '<em><b>Pattern Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR = eINSTANCE.getDecimalFormatType_PatternSeparator();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.DocumentRootImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Analyze String</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ANALYZE_STRING = eINSTANCE.getDocumentRoot_AnalyzeString();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INSTRUCTION = eINSTANCE.getDocumentRoot_Instruction();

        /**
         * The meta object literal for the '<em><b>Apply Imports</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__APPLY_IMPORTS = eINSTANCE.getDocumentRoot_ApplyImports();

        /**
         * The meta object literal for the '<em><b>Apply Templates</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__APPLY_TEMPLATES = eINSTANCE.getDocumentRoot_ApplyTemplates();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ATTRIBUTE = eINSTANCE.getDocumentRoot_Attribute();

        /**
         * The meta object literal for the '<em><b>Attribute Set</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ATTRIBUTE_SET = eINSTANCE.getDocumentRoot_AttributeSet();

        /**
         * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DECLARATION = eINSTANCE.getDocumentRoot_Declaration();

        /**
         * The meta object literal for the '<em><b>Call Template</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CALL_TEMPLATE = eINSTANCE.getDocumentRoot_CallTemplate();

        /**
         * The meta object literal for the '<em><b>Character Map</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CHARACTER_MAP = eINSTANCE.getDocumentRoot_CharacterMap();

        /**
         * The meta object literal for the '<em><b>Choose</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CHOOSE = eINSTANCE.getDocumentRoot_Choose();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COMMENT = eINSTANCE.getDocumentRoot_Comment();

        /**
         * The meta object literal for the '<em><b>Copy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COPY = eINSTANCE.getDocumentRoot_Copy();

        /**
         * The meta object literal for the '<em><b>Copy Of</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COPY_OF = eINSTANCE.getDocumentRoot_CopyOf();

        /**
         * The meta object literal for the '<em><b>Decimal Format</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DECIMAL_FORMAT = eINSTANCE.getDocumentRoot_DecimalFormat();

        /**
         * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DOCUMENT = eINSTANCE.getDocumentRoot_Document();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ELEMENT = eINSTANCE.getDocumentRoot_Element();

        /**
         * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FALLBACK = eINSTANCE.getDocumentRoot_Fallback();

        /**
         * The meta object literal for the '<em><b>For Each</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FOR_EACH = eINSTANCE.getDocumentRoot_ForEach();

        /**
         * The meta object literal for the '<em><b>For Each Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FOR_EACH_GROUP = eINSTANCE.getDocumentRoot_ForEachGroup();

        /**
         * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FUNCTION = eINSTANCE.getDocumentRoot_Function();

        /**
         * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IF = eINSTANCE.getDocumentRoot_If();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

        /**
         * The meta object literal for the '<em><b>Import Schema</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IMPORT_SCHEMA = eINSTANCE.getDocumentRoot_ImportSchema();

        /**
         * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INCLUDE = eINSTANCE.getDocumentRoot_Include();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__KEY = eINSTANCE.getDocumentRoot_Key();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LITERAL_RESULT_ELEMENT = eINSTANCE.getDocumentRoot_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Matching Substring</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MATCHING_SUBSTRING = eINSTANCE.getDocumentRoot_MatchingSubstring();

        /**
         * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MESSAGE = eINSTANCE.getDocumentRoot_Message();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NAMESPACE = eINSTANCE.getDocumentRoot_Namespace();

        /**
         * The meta object literal for the '<em><b>Namespace Alias</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NAMESPACE_ALIAS = eINSTANCE.getDocumentRoot_NamespaceAlias();

        /**
         * The meta object literal for the '<em><b>Next Match</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NEXT_MATCH = eINSTANCE.getDocumentRoot_NextMatch();

        /**
         * The meta object literal for the '<em><b>Non Matching Substring</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NON_MATCHING_SUBSTRING = eINSTANCE.getDocumentRoot_NonMatchingSubstring();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NUMBER = eINSTANCE.getDocumentRoot_Number();

        /**
         * The meta object literal for the '<em><b>Otherwise</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OTHERWISE = eINSTANCE.getDocumentRoot_Otherwise();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OUTPUT = eINSTANCE.getDocumentRoot_Output();

        /**
         * The meta object literal for the '<em><b>Output Character</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OUTPUT_CHARACTER = eINSTANCE.getDocumentRoot_OutputCharacter();

        /**
         * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PARAM = eINSTANCE.getDocumentRoot_Param();

        /**
         * The meta object literal for the '<em><b>Perform Sort</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PERFORM_SORT = eINSTANCE.getDocumentRoot_PerformSort();

        /**
         * The meta object literal for the '<em><b>Preserve Space</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PRESERVE_SPACE = eINSTANCE.getDocumentRoot_PreserveSpace();

        /**
         * The meta object literal for the '<em><b>Processing Instruction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESSING_INSTRUCTION = eINSTANCE.getDocumentRoot_ProcessingInstruction();

        /**
         * The meta object literal for the '<em><b>Result Document</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RESULT_DOCUMENT = eINSTANCE.getDocumentRoot_ResultDocument();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SEQUENCE = eINSTANCE.getDocumentRoot_Sequence();

        /**
         * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SORT = eINSTANCE.getDocumentRoot_Sort();

        /**
         * The meta object literal for the '<em><b>Strip Space</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__STRIP_SPACE = eINSTANCE.getDocumentRoot_StripSpace();

        /**
         * The meta object literal for the '<em><b>Stylesheet</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__STYLESHEET = eINSTANCE.getDocumentRoot_Stylesheet();

        /**
         * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TRANSFORM = eINSTANCE.getDocumentRoot_Transform();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TEMPLATE = eINSTANCE.getDocumentRoot_Template();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TEXT = eINSTANCE.getDocumentRoot_Text();

        /**
         * The meta object literal for the '<em><b>Value Of</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__VALUE_OF = eINSTANCE.getDocumentRoot_ValueOf();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__VARIABLE = eINSTANCE.getDocumentRoot_Variable();

        /**
         * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__WHEN = eINSTANCE.getDocumentRoot_When();

        /**
         * The meta object literal for the '<em><b>With Param</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__WITH_PARAM = eINSTANCE.getDocumentRoot_WithParam();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.DocumentTypeImpl <em>Document Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.DocumentTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getDocumentType()
         * @generated
         */
        EClass DOCUMENT_TYPE = eINSTANCE.getDocumentType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_TYPE__TYPE = eINSTANCE.getDocumentType_Type();

        /**
         * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_TYPE__VALIDATION = eINSTANCE.getDocumentType_Validation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ElementOnlyVersionedElementTypeImpl <em>Element Only Versioned Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ElementOnlyVersionedElementTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getElementOnlyVersionedElementType()
         * @generated
         */
        EClass ELEMENT_ONLY_VERSIONED_ELEMENT_TYPE = eINSTANCE.getElementOnlyVersionedElementType();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ElementTypeImpl <em>Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ElementTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getElementType()
         * @generated
         */
        EClass ELEMENT_TYPE = eINSTANCE.getElementType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__NAMESPACE = eINSTANCE.getElementType_Namespace();

        /**
         * The meta object literal for the '<em><b>Inherit Namespaces</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__INHERIT_NAMESPACES = eINSTANCE.getElementType_InheritNamespaces();

        /**
         * The meta object literal for the '<em><b>Use Attribute Sets</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__USE_ATTRIBUTE_SETS = eINSTANCE.getElementType_UseAttributeSets();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__TYPE = eINSTANCE.getElementType_Type();

        /**
         * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__VALIDATION = eINSTANCE.getElementType_Validation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl <em>For Each Group Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getForEachGroupType()
         * @generated
         */
        EClass FOR_EACH_GROUP_TYPE = eINSTANCE.getForEachGroupType();

        /**
         * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_GROUP_TYPE__SORT = eINSTANCE.getForEachGroupType_Sort();

        /**
         * The meta object literal for the '<em><b>Sequence Constructor Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = eINSTANCE.getForEachGroupType_SequenceConstructorGroup();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_GROUP_TYPE__VARIABLE = eINSTANCE.getForEachGroupType_Variable();

        /**
         * The meta object literal for the '<em><b>Instruction Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP = eINSTANCE.getForEachGroupType_InstructionGroup();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_GROUP_TYPE__INSTRUCTION = eINSTANCE.getForEachGroupType_Instruction();

        /**
         * The meta object literal for the '<em><b>Literal Result Element Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP = eINSTANCE.getForEachGroupType_LiteralResultElementGroup();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT = eINSTANCE.getForEachGroupType_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__ANY = eINSTANCE.getForEachGroupType_Any();

        /**
         * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__ANY1 = eINSTANCE.getForEachGroupType_Any1();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__SELECT = eINSTANCE.getForEachGroupType_Select();

        /**
         * The meta object literal for the '<em><b>Group By</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__GROUP_BY = eINSTANCE.getForEachGroupType_GroupBy();

        /**
         * The meta object literal for the '<em><b>Group Adjacent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__GROUP_ADJACENT = eINSTANCE.getForEachGroupType_GroupAdjacent();

        /**
         * The meta object literal for the '<em><b>Group Starting With</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH = eINSTANCE.getForEachGroupType_GroupStartingWith();

        /**
         * The meta object literal for the '<em><b>Group Ending With</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH = eINSTANCE.getForEachGroupType_GroupEndingWith();

        /**
         * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_GROUP_TYPE__COLLATION = eINSTANCE.getForEachGroupType_Collation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ForEachTypeImpl <em>For Each Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ForEachTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getForEachType()
         * @generated
         */
        EClass FOR_EACH_TYPE = eINSTANCE.getForEachType();

        /**
         * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_TYPE__SORT = eINSTANCE.getForEachType_Sort();

        /**
         * The meta object literal for the '<em><b>Sequence Constructor Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = eINSTANCE.getForEachType_SequenceConstructorGroup();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_TYPE__VARIABLE = eINSTANCE.getForEachType_Variable();

        /**
         * The meta object literal for the '<em><b>Instruction Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_TYPE__INSTRUCTION_GROUP = eINSTANCE.getForEachType_InstructionGroup();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_TYPE__INSTRUCTION = eINSTANCE.getForEachType_Instruction();

        /**
         * The meta object literal for the '<em><b>Literal Result Element Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_TYPE__LITERAL_RESULT_ELEMENT_GROUP = eINSTANCE.getForEachType_LiteralResultElementGroup();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOR_EACH_TYPE__LITERAL_RESULT_ELEMENT = eINSTANCE.getForEachType_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_TYPE__ANY = eINSTANCE.getForEachType_Any();

        /**
         * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_TYPE__ANY1 = eINSTANCE.getForEachType_Any1();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOR_EACH_TYPE__SELECT = eINSTANCE.getForEachType_Select();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl <em>Function Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.FunctionTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getFunctionType()
         * @generated
         */
        EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

        /**
         * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_TYPE__PARAM = eINSTANCE.getFunctionType_Param();

        /**
         * The meta object literal for the '<em><b>Sequence Constructor Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = eINSTANCE.getFunctionType_SequenceConstructorGroup();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_TYPE__VARIABLE = eINSTANCE.getFunctionType_Variable();

        /**
         * The meta object literal for the '<em><b>Instruction Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__INSTRUCTION_GROUP = eINSTANCE.getFunctionType_InstructionGroup();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_TYPE__INSTRUCTION = eINSTANCE.getFunctionType_Instruction();

        /**
         * The meta object literal for the '<em><b>Literal Result Element Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP = eINSTANCE.getFunctionType_LiteralResultElementGroup();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_TYPE__LITERAL_RESULT_ELEMENT = eINSTANCE.getFunctionType_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__ANY = eINSTANCE.getFunctionType_Any();

        /**
         * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__ANY1 = eINSTANCE.getFunctionType_Any1();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__NAME = eINSTANCE.getFunctionType_Name();

        /**
         * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__OVERRIDE = eINSTANCE.getFunctionType_Override();

        /**
         * The meta object literal for the '<em><b>As</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_TYPE__AS = eINSTANCE.getFunctionType_As();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.GenericElementTypeImpl <em>Generic Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.GenericElementTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getGenericElementType()
         * @generated
         */
        EClass GENERIC_ELEMENT_TYPE = eINSTANCE.getGenericElementType();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__MIXED = eINSTANCE.getGenericElementType_Mixed();

        /**
         * The meta object literal for the '<em><b>Default Collation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__DEFAULT_COLLATION = eINSTANCE.getGenericElementType_DefaultCollation();

        /**
         * The meta object literal for the '<em><b>Exclude Result Prefixes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__EXCLUDE_RESULT_PREFIXES = eINSTANCE.getGenericElementType_ExcludeResultPrefixes();

        /**
         * The meta object literal for the '<em><b>Extension Element Prefixes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__EXTENSION_ELEMENT_PREFIXES = eINSTANCE.getGenericElementType_ExtensionElementPrefixes();

        /**
         * The meta object literal for the '<em><b>Use When</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__USE_WHEN = eINSTANCE.getGenericElementType_UseWhen();

        /**
         * The meta object literal for the '<em><b>Xpath Default Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__XPATH_DEFAULT_NAMESPACE = eINSTANCE.getGenericElementType_XpathDefaultNamespace();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_ELEMENT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getGenericElementType_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.IfTypeImpl <em>If Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.IfTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getIfType()
         * @generated
         */
        EClass IF_TYPE = eINSTANCE.getIfType();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IF_TYPE__TEST = eINSTANCE.getIfType_Test();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl <em>Import Schema Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ImportSchemaTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getImportSchemaType()
         * @generated
         */
        EClass IMPORT_SCHEMA_TYPE = eINSTANCE.getImportSchemaType();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORT_SCHEMA_TYPE__SCHEMA = eINSTANCE.getImportSchemaType_Schema();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_SCHEMA_TYPE__NAMESPACE = eINSTANCE.getImportSchemaType_Namespace();

        /**
         * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_SCHEMA_TYPE__SCHEMA_LOCATION = eINSTANCE.getImportSchemaType_SchemaLocation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ImportTypeImpl <em>Import Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ImportTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getImportType()
         * @generated
         */
        EClass IMPORT_TYPE = eINSTANCE.getImportType();

        /**
         * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_TYPE__HREF = eINSTANCE.getImportType_Href();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.IncludeTypeImpl <em>Include Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.IncludeTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getIncludeType()
         * @generated
         */
        EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

        /**
         * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCLUDE_TYPE__HREF = eINSTANCE.getIncludeType_Href();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.KeyTypeImpl <em>Key Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.KeyTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getKeyType()
         * @generated
         */
        EClass KEY_TYPE = eINSTANCE.getKeyType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEY_TYPE__NAME = eINSTANCE.getKeyType_Name();

        /**
         * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEY_TYPE__MATCH = eINSTANCE.getKeyType_Match();

        /**
         * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEY_TYPE__USE = eINSTANCE.getKeyType_Use();

        /**
         * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEY_TYPE__COLLATION = eINSTANCE.getKeyType_Collation();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.MessageTypeImpl <em>Message Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.MessageTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMessageType()
         * @generated
         */
        EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MESSAGE_TYPE__SELECT = eINSTANCE.getMessageType_Select();

        /**
         * The meta object literal for the '<em><b>Terminate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MESSAGE_TYPE__TERMINATE = eINSTANCE.getMessageType_Terminate();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.NamespaceAliasTypeImpl <em>Namespace Alias Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.NamespaceAliasTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNamespaceAliasType()
         * @generated
         */
        EClass NAMESPACE_ALIAS_TYPE = eINSTANCE.getNamespaceAliasType();

        /**
         * The meta object literal for the '<em><b>Stylesheet Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMESPACE_ALIAS_TYPE__STYLESHEET_PREFIX = eINSTANCE.getNamespaceAliasType_StylesheetPrefix();

        /**
         * The meta object literal for the '<em><b>Result Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMESPACE_ALIAS_TYPE__RESULT_PREFIX = eINSTANCE.getNamespaceAliasType_ResultPrefix();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.NamespaceTypeImpl <em>Namespace Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.NamespaceTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNamespaceType()
         * @generated
         */
        EClass NAMESPACE_TYPE = eINSTANCE.getNamespaceType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMESPACE_TYPE__NAME = eINSTANCE.getNamespaceType_Name();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMESPACE_TYPE__SELECT = eINSTANCE.getNamespaceType_Select();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.NextMatchTypeImpl <em>Next Match Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.NextMatchTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNextMatchType()
         * @generated
         */
        EClass NEXT_MATCH_TYPE = eINSTANCE.getNextMatchType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NEXT_MATCH_TYPE__GROUP = eINSTANCE.getNextMatchType_Group();

        /**
         * The meta object literal for the '<em><b>With Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NEXT_MATCH_TYPE__WITH_PARAM = eINSTANCE.getNextMatchType_WithParam();

        /**
         * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NEXT_MATCH_TYPE__FALLBACK = eINSTANCE.getNextMatchType_Fallback();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl <em>Number Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.NumberTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNumberType()
         * @generated
         */
        EClass NUMBER_TYPE = eINSTANCE.getNumberType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__VALUE = eINSTANCE.getNumberType_Value();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__SELECT = eINSTANCE.getNumberType_Select();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__LEVEL = eINSTANCE.getNumberType_Level();

        /**
         * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__COUNT = eINSTANCE.getNumberType_Count();

        /**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__FROM = eINSTANCE.getNumberType_From();

        /**
         * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__FORMAT = eINSTANCE.getNumberType_Format();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__LANG = eINSTANCE.getNumberType_Lang();

        /**
         * The meta object literal for the '<em><b>Letter Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__LETTER_VALUE = eINSTANCE.getNumberType_LetterValue();

        /**
         * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__ORDINAL = eINSTANCE.getNumberType_Ordinal();

        /**
         * The meta object literal for the '<em><b>Grouping Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__GROUPING_SEPARATOR = eINSTANCE.getNumberType_GroupingSeparator();

        /**
         * The meta object literal for the '<em><b>Grouping Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMBER_TYPE__GROUPING_SIZE = eINSTANCE.getNumberType_GroupingSize();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.OutputCharacterTypeImpl <em>Output Character Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.OutputCharacterTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getOutputCharacterType()
         * @generated
         */
        EClass OUTPUT_CHARACTER_TYPE = eINSTANCE.getOutputCharacterType();

        /**
         * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_CHARACTER_TYPE__CHARACTER = eINSTANCE.getOutputCharacterType_Character();

        /**
         * The meta object literal for the '<em><b>String</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_CHARACTER_TYPE__STRING = eINSTANCE.getOutputCharacterType_String();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl <em>Output Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.OutputTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getOutputType()
         * @generated
         */
        EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__NAME = eINSTANCE.getOutputType_Name();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__METHOD = eINSTANCE.getOutputType_Method();

        /**
         * The meta object literal for the '<em><b>Byte Order Mark</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__BYTE_ORDER_MARK = eINSTANCE.getOutputType_ByteOrderMark();

        /**
         * The meta object literal for the '<em><b>Cdata Section Elements</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__CDATA_SECTION_ELEMENTS = eINSTANCE.getOutputType_CdataSectionElements();

        /**
         * The meta object literal for the '<em><b>Doctype Public</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__DOCTYPE_PUBLIC = eINSTANCE.getOutputType_DoctypePublic();

        /**
         * The meta object literal for the '<em><b>Doctype System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__DOCTYPE_SYSTEM = eINSTANCE.getOutputType_DoctypeSystem();

        /**
         * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__ENCODING = eINSTANCE.getOutputType_Encoding();

        /**
         * The meta object literal for the '<em><b>Escape Uri Attributes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES = eINSTANCE.getOutputType_EscapeUriAttributes();

        /**
         * The meta object literal for the '<em><b>Include Content Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__INCLUDE_CONTENT_TYPE = eINSTANCE.getOutputType_IncludeContentType();

        /**
         * The meta object literal for the '<em><b>Indent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__INDENT = eINSTANCE.getOutputType_Indent();

        /**
         * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__MEDIA_TYPE = eINSTANCE.getOutputType_MediaType();

        /**
         * The meta object literal for the '<em><b>Normalization Form</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__NORMALIZATION_FORM = eINSTANCE.getOutputType_NormalizationForm();

        /**
         * The meta object literal for the '<em><b>Omit Xml Declaration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__OMIT_XML_DECLARATION = eINSTANCE.getOutputType_OmitXmlDeclaration();

        /**
         * The meta object literal for the '<em><b>Standalone</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__STANDALONE = eINSTANCE.getOutputType_Standalone();

        /**
         * The meta object literal for the '<em><b>Undeclare Prefixes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__UNDECLARE_PREFIXES = eINSTANCE.getOutputType_UndeclarePrefixes();

        /**
         * The meta object literal for the '<em><b>Use Character Maps</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__USE_CHARACTER_MAPS = eINSTANCE.getOutputType_UseCharacterMaps();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_TYPE__VERSION = eINSTANCE.getOutputType_Version();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl <em>Param Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ParamTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getParamType()
         * @generated
         */
        EClass PARAM_TYPE = eINSTANCE.getParamType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAM_TYPE__NAME = eINSTANCE.getParamType_Name();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAM_TYPE__SELECT = eINSTANCE.getParamType_Select();

        /**
         * The meta object literal for the '<em><b>As</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAM_TYPE__AS = eINSTANCE.getParamType_As();

        /**
         * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAM_TYPE__REQUIRED = eINSTANCE.getParamType_Required();

        /**
         * The meta object literal for the '<em><b>Tunnel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAM_TYPE__TUNNEL = eINSTANCE.getParamType_Tunnel();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.PerformSortTypeImpl <em>Perform Sort Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.PerformSortTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPerformSortType()
         * @generated
         */
        EClass PERFORM_SORT_TYPE = eINSTANCE.getPerformSortType();

        /**
         * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORM_SORT_TYPE__SORT = eINSTANCE.getPerformSortType_Sort();

        /**
         * The meta object literal for the '<em><b>Sequence Constructor Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERFORM_SORT_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = eINSTANCE.getPerformSortType_SequenceConstructorGroup();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORM_SORT_TYPE__VARIABLE = eINSTANCE.getPerformSortType_Variable();

        /**
         * The meta object literal for the '<em><b>Instruction Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERFORM_SORT_TYPE__INSTRUCTION_GROUP = eINSTANCE.getPerformSortType_InstructionGroup();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORM_SORT_TYPE__INSTRUCTION = eINSTANCE.getPerformSortType_Instruction();

        /**
         * The meta object literal for the '<em><b>Literal Result Element Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERFORM_SORT_TYPE__LITERAL_RESULT_ELEMENT_GROUP = eINSTANCE.getPerformSortType_LiteralResultElementGroup();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERFORM_SORT_TYPE__LITERAL_RESULT_ELEMENT = eINSTANCE.getPerformSortType_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERFORM_SORT_TYPE__ANY = eINSTANCE.getPerformSortType_Any();

        /**
         * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERFORM_SORT_TYPE__ANY1 = eINSTANCE.getPerformSortType_Any1();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERFORM_SORT_TYPE__SELECT = eINSTANCE.getPerformSortType_Select();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.PreserveSpaceTypeImpl <em>Preserve Space Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.PreserveSpaceTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPreserveSpaceType()
         * @generated
         */
        EClass PRESERVE_SPACE_TYPE = eINSTANCE.getPreserveSpaceType();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESERVE_SPACE_TYPE__ELEMENTS = eINSTANCE.getPreserveSpaceType_Elements();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ProcessingInstructionTypeImpl <em>Processing Instruction Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ProcessingInstructionTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getProcessingInstructionType()
         * @generated
         */
        EClass PROCESSING_INSTRUCTION_TYPE = eINSTANCE.getProcessingInstructionType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSING_INSTRUCTION_TYPE__NAME = eINSTANCE.getProcessingInstructionType_Name();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESSING_INSTRUCTION_TYPE__SELECT = eINSTANCE.getProcessingInstructionType_Select();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl <em>Result Document Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getResultDocumentType()
         * @generated
         */
        EClass RESULT_DOCUMENT_TYPE = eINSTANCE.getResultDocumentType();

        /**
         * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__FORMAT = eINSTANCE.getResultDocumentType_Format();

        /**
         * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__HREF = eINSTANCE.getResultDocumentType_Href();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__TYPE = eINSTANCE.getResultDocumentType_Type();

        /**
         * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__VALIDATION = eINSTANCE.getResultDocumentType_Validation();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__METHOD = eINSTANCE.getResultDocumentType_Method();

        /**
         * The meta object literal for the '<em><b>Byte Order Mark</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK = eINSTANCE.getResultDocumentType_ByteOrderMark();

        /**
         * The meta object literal for the '<em><b>Cdata Section Elements</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS = eINSTANCE.getResultDocumentType_CdataSectionElements();

        /**
         * The meta object literal for the '<em><b>Doctype Public</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC = eINSTANCE.getResultDocumentType_DoctypePublic();

        /**
         * The meta object literal for the '<em><b>Doctype System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM = eINSTANCE.getResultDocumentType_DoctypeSystem();

        /**
         * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__ENCODING = eINSTANCE.getResultDocumentType_Encoding();

        /**
         * The meta object literal for the '<em><b>Escape Uri Attributes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES = eINSTANCE.getResultDocumentType_EscapeUriAttributes();

        /**
         * The meta object literal for the '<em><b>Include Content Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE = eINSTANCE.getResultDocumentType_IncludeContentType();

        /**
         * The meta object literal for the '<em><b>Indent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__INDENT = eINSTANCE.getResultDocumentType_Indent();

        /**
         * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__MEDIA_TYPE = eINSTANCE.getResultDocumentType_MediaType();

        /**
         * The meta object literal for the '<em><b>Normalization Form</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM = eINSTANCE.getResultDocumentType_NormalizationForm();

        /**
         * The meta object literal for the '<em><b>Omit Xml Declaration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION = eINSTANCE.getResultDocumentType_OmitXmlDeclaration();

        /**
         * The meta object literal for the '<em><b>Standalone</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__STANDALONE = eINSTANCE.getResultDocumentType_Standalone();

        /**
         * The meta object literal for the '<em><b>Undeclare Prefixes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES = eINSTANCE.getResultDocumentType_UndeclarePrefixes();

        /**
         * The meta object literal for the '<em><b>Use Character Maps</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS = eINSTANCE.getResultDocumentType_UseCharacterMaps();

        /**
         * The meta object literal for the '<em><b>Output Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_DOCUMENT_TYPE__OUTPUT_VERSION = eINSTANCE.getResultDocumentType_OutputVersion();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.SequenceConstructorImpl <em>Sequence Constructor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.SequenceConstructorImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSequenceConstructor()
         * @generated
         */
        EClass SEQUENCE_CONSTRUCTOR = eINSTANCE.getSequenceConstructor();

        /**
         * The meta object literal for the '<em><b>Sequence Constructor Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_CONSTRUCTOR__SEQUENCE_CONSTRUCTOR_GROUP = eINSTANCE.getSequenceConstructor_SequenceConstructorGroup();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEQUENCE_CONSTRUCTOR__VARIABLE = eINSTANCE.getSequenceConstructor_Variable();

        /**
         * The meta object literal for the '<em><b>Instruction Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_CONSTRUCTOR__INSTRUCTION_GROUP = eINSTANCE.getSequenceConstructor_InstructionGroup();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEQUENCE_CONSTRUCTOR__INSTRUCTION = eINSTANCE.getSequenceConstructor_Instruction();

        /**
         * The meta object literal for the '<em><b>Literal Result Element Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT_GROUP = eINSTANCE.getSequenceConstructor_LiteralResultElementGroup();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEQUENCE_CONSTRUCTOR__LITERAL_RESULT_ELEMENT = eINSTANCE.getSequenceConstructor_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_CONSTRUCTOR__ANY = eINSTANCE.getSequenceConstructor_Any();

        /**
         * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_CONSTRUCTOR__ANY1 = eINSTANCE.getSequenceConstructor_Any1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.SequenceTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSequenceType()
         * @generated
         */
        EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_TYPE__GROUP = eINSTANCE.getSequenceType_Group();

        /**
         * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEQUENCE_TYPE__FALLBACK = eINSTANCE.getSequenceType_Fallback();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_TYPE__SELECT = eINSTANCE.getSequenceType_Select();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.SortTypeImpl <em>Sort Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.SortTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSortType()
         * @generated
         */
        EClass SORT_TYPE = eINSTANCE.getSortType();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__SELECT = eINSTANCE.getSortType_Select();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__LANG = eINSTANCE.getSortType_Lang();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__DATA_TYPE = eINSTANCE.getSortType_DataType();

        /**
         * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__ORDER = eINSTANCE.getSortType_Order();

        /**
         * The meta object literal for the '<em><b>Case Order</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__CASE_ORDER = eINSTANCE.getSortType_CaseOrder();

        /**
         * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__COLLATION = eINSTANCE.getSortType_Collation();

        /**
         * The meta object literal for the '<em><b>Stable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SORT_TYPE__STABLE = eINSTANCE.getSortType_Stable();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.StripSpaceTypeImpl <em>Strip Space Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.StripSpaceTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getStripSpaceType()
         * @generated
         */
        EClass STRIP_SPACE_TYPE = eINSTANCE.getStripSpaceType();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRIP_SPACE_TYPE__ELEMENTS = eINSTANCE.getStripSpaceType_Elements();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl <em>Template Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.TemplateTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTemplateType()
         * @generated
         */
        EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

        /**
         * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATE_TYPE__PARAM = eINSTANCE.getTemplateType_Param();

        /**
         * The meta object literal for the '<em><b>Sequence Constructor Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP = eINSTANCE.getTemplateType_SequenceConstructorGroup();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATE_TYPE__VARIABLE = eINSTANCE.getTemplateType_Variable();

        /**
         * The meta object literal for the '<em><b>Instruction Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__INSTRUCTION_GROUP = eINSTANCE.getTemplateType_InstructionGroup();

        /**
         * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATE_TYPE__INSTRUCTION = eINSTANCE.getTemplateType_Instruction();

        /**
         * The meta object literal for the '<em><b>Literal Result Element Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP = eINSTANCE.getTemplateType_LiteralResultElementGroup();

        /**
         * The meta object literal for the '<em><b>Literal Result Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT = eINSTANCE.getTemplateType_LiteralResultElement();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__ANY = eINSTANCE.getTemplateType_Any();

        /**
         * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__ANY1 = eINSTANCE.getTemplateType_Any1();

        /**
         * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__MATCH = eINSTANCE.getTemplateType_Match();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__PRIORITY = eINSTANCE.getTemplateType_Priority();

        /**
         * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__MODE = eINSTANCE.getTemplateType_Mode();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__NAME = eINSTANCE.getTemplateType_Name();

        /**
         * The meta object literal for the '<em><b>As</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEMPLATE_TYPE__AS = eINSTANCE.getTemplateType_As();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.TextElementBaseTypeImpl <em>Text Element Base Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.TextElementBaseTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextElementBaseType()
         * @generated
         */
        EClass TEXT_ELEMENT_BASE_TYPE = eINSTANCE.getTextElementBaseType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_ELEMENT_BASE_TYPE__VALUE = eINSTANCE.getTextElementBaseType_Value();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.TextTypeImpl <em>Text Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.TextTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextType()
         * @generated
         */
        EClass TEXT_TYPE = eINSTANCE.getTextType();

        /**
         * The meta object literal for the '<em><b>Disable Output Escaping</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_TYPE__DISABLE_OUTPUT_ESCAPING = eINSTANCE.getTextType_DisableOutputEscaping();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.TransformElementBaseTypeImpl <em>Transform Element Base Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.TransformElementBaseTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTransformElementBaseType()
         * @generated
         */
        EClass TRANSFORM_ELEMENT_BASE_TYPE = eINSTANCE.getTransformElementBaseType();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.TransformTypeImpl <em>Transform Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.TransformTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTransformType()
         * @generated
         */
        EClass TRANSFORM_TYPE = eINSTANCE.getTransformType();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_TYPE__IMPORT = eINSTANCE.getTransformType_Import();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_TYPE__GROUP = eINSTANCE.getTransformType_Group();

        /**
         * The meta object literal for the '<em><b>Declaration Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_TYPE__DECLARATION_GROUP = eINSTANCE.getTransformType_DeclarationGroup();

        /**
         * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_TYPE__DECLARATION = eINSTANCE.getTransformType_Declaration();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_TYPE__VARIABLE = eINSTANCE.getTransformType_Variable();

        /**
         * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSFORM_TYPE__PARAM = eINSTANCE.getTransformType_Param();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_TYPE__ANY = eINSTANCE.getTransformType_Any();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_TYPE__ID = eINSTANCE.getTransformType_Id();

        /**
         * The meta object literal for the '<em><b>Default Validation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_TYPE__DEFAULT_VALIDATION = eINSTANCE.getTransformType_DefaultValidation();

        /**
         * The meta object literal for the '<em><b>Input Type Annotations</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSFORM_TYPE__INPUT_TYPE_ANNOTATIONS = eINSTANCE.getTransformType_InputTypeAnnotations();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.ValueOfTypeImpl <em>Value Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.ValueOfTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValueOfType()
         * @generated
         */
        EClass VALUE_OF_TYPE = eINSTANCE.getValueOfType();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_OF_TYPE__SELECT = eINSTANCE.getValueOfType_Select();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_OF_TYPE__SEPARATOR = eINSTANCE.getValueOfType_Separator();

        /**
         * The meta object literal for the '<em><b>Disable Output Escaping</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING = eINSTANCE.getValueOfType_DisableOutputEscaping();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.VariableTypeImpl <em>Variable Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.VariableTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getVariableType()
         * @generated
         */
        EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_TYPE__NAME = eINSTANCE.getVariableType_Name();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_TYPE__SELECT = eINSTANCE.getVariableType_Select();

        /**
         * The meta object literal for the '<em><b>As</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_TYPE__AS = eINSTANCE.getVariableType_As();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.VersionedElementTypeImpl <em>Versioned Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.VersionedElementTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getVersionedElementType()
         * @generated
         */
        EClass VERSIONED_ELEMENT_TYPE = eINSTANCE.getVersionedElementType();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VERSIONED_ELEMENT_TYPE__VERSION = eINSTANCE.getVersionedElementType_Version();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.WhenTypeImpl <em>When Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.WhenTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getWhenType()
         * @generated
         */
        EClass WHEN_TYPE = eINSTANCE.getWhenType();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WHEN_TYPE__TEST = eINSTANCE.getWhenType_Test();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.impl.WithParamTypeImpl <em>With Param Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.impl.WithParamTypeImpl
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getWithParamType()
         * @generated
         */
        EClass WITH_PARAM_TYPE = eINSTANCE.getWithParamType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WITH_PARAM_TYPE__NAME = eINSTANCE.getWithParamType_Name();

        /**
         * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WITH_PARAM_TYPE__SELECT = eINSTANCE.getWithParamType_Select();

        /**
         * The meta object literal for the '<em><b>As</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WITH_PARAM_TYPE__AS = eINSTANCE.getWithParamType_As();

        /**
         * The meta object literal for the '<em><b>Tunnel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WITH_PARAM_TYPE__TUNNEL = eINSTANCE.getWithParamType_Tunnel();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.InputTypeAnnotationsType <em>Input Type Annotations Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getInputTypeAnnotationsType()
         * @generated
         */
        EEnum INPUT_TYPE_ANNOTATIONS_TYPE = eINSTANCE.getInputTypeAnnotationsType();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.Level <em>Level</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.Level
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getLevel()
         * @generated
         */
        EEnum LEVEL = eINSTANCE.getLevel();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.MethodMember0 <em>Method Member0</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.MethodMember0
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethodMember0()
         * @generated
         */
        EEnum METHOD_MEMBER0 = eINSTANCE.getMethodMember0();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.ModeMember1 <em>Mode Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ModeMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModeMember1()
         * @generated
         */
        EEnum MODE_MEMBER1 = eINSTANCE.getModeMember1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.ModesMember0ItemMember1 <em>Modes Member0 Item Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ModesMember0ItemMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0ItemMember1()
         * @generated
         */
        EEnum MODES_MEMBER0_ITEM_MEMBER1 = eINSTANCE.getModesMember0ItemMember1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.ModesMember1 <em>Modes Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ModesMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember1()
         * @generated
         */
        EEnum MODES_MEMBER1 = eINSTANCE.getModesMember1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.NametestsItemMember1 <em>Nametests Item Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.NametestsItemMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItemMember1()
         * @generated
         */
        EEnum NAMETESTS_ITEM_MEMBER1 = eINSTANCE.getNametestsItemMember1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.PrefixListOrAllMember1 <em>Prefix List Or All Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.PrefixListOrAllMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixListOrAllMember1()
         * @generated
         */
        EEnum PREFIX_LIST_OR_ALL_MEMBER1 = eINSTANCE.getPrefixListOrAllMember1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.PrefixOrDefaultMember1 <em>Prefix Or Default Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.PrefixOrDefaultMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixOrDefaultMember1()
         * @generated
         */
        EEnum PREFIX_OR_DEFAULT_MEMBER1 = eINSTANCE.getPrefixOrDefaultMember1();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.ValidationStripOrPreserve <em>Validation Strip Or Preserve</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationStripOrPreserve()
         * @generated
         */
        EEnum VALIDATION_STRIP_OR_PRESERVE = eINSTANCE.getValidationStripOrPreserve();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.ValidationType <em>Validation Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ValidationType
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationType()
         * @generated
         */
        EEnum VALIDATION_TYPE = eINSTANCE.getValidationType();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.YesOrNo <em>Yes Or No</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.YesOrNo
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNo()
         * @generated
         */
        EEnum YES_OR_NO = eINSTANCE.getYesOrNo();

        /**
         * The meta object literal for the '{@link org.w3._1999.xsl.transform.YesOrNoOrOmit <em>Yes Or No Or Omit</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNoOrOmit()
         * @generated
         */
        EEnum YES_OR_NO_OR_OMIT = eINSTANCE.getYesOrNoOrOmit();

        /**
         * The meta object literal for the '<em>Avt</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getAvt()
         * @generated
         */
        EDataType AVT = eINSTANCE.getAvt();

        /**
         * The meta object literal for the '<em>Char</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getChar()
         * @generated
         */
        EDataType CHAR = eINSTANCE.getChar();

        /**
         * The meta object literal for the '<em>Expression</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getExpression()
         * @generated
         */
        EDataType EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '<em>Input Type Annotations Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.InputTypeAnnotationsType
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getInputTypeAnnotationsTypeObject()
         * @generated
         */
        EDataType INPUT_TYPE_ANNOTATIONS_TYPE_OBJECT = eINSTANCE.getInputTypeAnnotationsTypeObject();

        /**
         * The meta object literal for the '<em>Level Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.Level
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getLevelObject()
         * @generated
         */
        EDataType LEVEL_OBJECT = eINSTANCE.getLevelObject();

        /**
         * The meta object literal for the '<em>Method</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethod()
         * @generated
         */
        EDataType METHOD = eINSTANCE.getMethod();

        /**
         * The meta object literal for the '<em>Method Member0 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.MethodMember0
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethodMember0Object()
         * @generated
         */
        EDataType METHOD_MEMBER0_OBJECT = eINSTANCE.getMethodMember0Object();

        /**
         * The meta object literal for the '<em>Method Member1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMethodMember1()
         * @generated
         */
        EDataType METHOD_MEMBER1 = eINSTANCE.getMethodMember1();

        /**
         * The meta object literal for the '<em>Mode</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getMode()
         * @generated
         */
        EDataType MODE = eINSTANCE.getMode();

        /**
         * The meta object literal for the '<em>Mode Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ModeMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModeMember1Object()
         * @generated
         */
        EDataType MODE_MEMBER1_OBJECT = eINSTANCE.getModeMember1Object();

        /**
         * The meta object literal for the '<em>Modes</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModes()
         * @generated
         */
        EDataType MODES = eINSTANCE.getModes();

        /**
         * The meta object literal for the '<em>Modes Member0</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0()
         * @generated
         */
        EDataType MODES_MEMBER0 = eINSTANCE.getModesMember0();

        /**
         * The meta object literal for the '<em>Modes Member0 Item</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0Item()
         * @generated
         */
        EDataType MODES_MEMBER0_ITEM = eINSTANCE.getModesMember0Item();

        /**
         * The meta object literal for the '<em>Modes Member0 Item Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ModesMember0ItemMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember0ItemMember1Object()
         * @generated
         */
        EDataType MODES_MEMBER0_ITEM_MEMBER1_OBJECT = eINSTANCE.getModesMember0ItemMember1Object();

        /**
         * The meta object literal for the '<em>Modes Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ModesMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getModesMember1Object()
         * @generated
         */
        EDataType MODES_MEMBER1_OBJECT = eINSTANCE.getModesMember1Object();

        /**
         * The meta object literal for the '<em>Nametests</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametests()
         * @generated
         */
        EDataType NAMETESTS = eINSTANCE.getNametests();

        /**
         * The meta object literal for the '<em>Nametests Item</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItem()
         * @generated
         */
        EDataType NAMETESTS_ITEM = eINSTANCE.getNametestsItem();

        /**
         * The meta object literal for the '<em>Nametests Item Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.NametestsItemMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItemMember1Object()
         * @generated
         */
        EDataType NAMETESTS_ITEM_MEMBER1_OBJECT = eINSTANCE.getNametestsItemMember1Object();

        /**
         * The meta object literal for the '<em>Nametests Item Member2</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getNametestsItemMember2()
         * @generated
         */
        EDataType NAMETESTS_ITEM_MEMBER2 = eINSTANCE.getNametestsItemMember2();

        /**
         * The meta object literal for the '<em>Pattern</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPattern()
         * @generated
         */
        EDataType PATTERN = eINSTANCE.getPattern();

        /**
         * The meta object literal for the '<em>Prefixes</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixes()
         * @generated
         */
        EDataType PREFIXES = eINSTANCE.getPrefixes();

        /**
         * The meta object literal for the '<em>Prefix List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixList()
         * @generated
         */
        EDataType PREFIX_LIST = eINSTANCE.getPrefixList();

        /**
         * The meta object literal for the '<em>Prefix List Or All</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixListOrAll()
         * @generated
         */
        EDataType PREFIX_LIST_OR_ALL = eINSTANCE.getPrefixListOrAll();

        /**
         * The meta object literal for the '<em>Prefix List Or All Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.PrefixListOrAllMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixListOrAllMember1Object()
         * @generated
         */
        EDataType PREFIX_LIST_OR_ALL_MEMBER1_OBJECT = eINSTANCE.getPrefixListOrAllMember1Object();

        /**
         * The meta object literal for the '<em>Prefix Or Default</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixOrDefault()
         * @generated
         */
        EDataType PREFIX_OR_DEFAULT = eINSTANCE.getPrefixOrDefault();

        /**
         * The meta object literal for the '<em>Prefix Or Default Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.PrefixOrDefaultMember1
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getPrefixOrDefaultMember1Object()
         * @generated
         */
        EDataType PREFIX_OR_DEFAULT_MEMBER1_OBJECT = eINSTANCE.getPrefixOrDefaultMember1Object();

        /**
         * The meta object literal for the '<em>QName</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getQName()
         * @generated
         */
        EDataType QNAME = eINSTANCE.getQName();

        /**
         * The meta object literal for the '<em>QNames</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getQNames()
         * @generated
         */
        EDataType QNAMES = eINSTANCE.getQNames();

        /**
         * The meta object literal for the '<em>Sequence Type1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getSequenceType1()
         * @generated
         */
        EDataType SEQUENCE_TYPE1 = eINSTANCE.getSequenceType1();

        /**
         * The meta object literal for the '<em>Text Element Base Type Base</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextElementBaseTypeBase()
         * @generated
         */
        EDataType TEXT_ELEMENT_BASE_TYPE_BASE = eINSTANCE.getTextElementBaseTypeBase();

        /**
         * The meta object literal for the '<em>Text Element Base Type Base Base</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getTextElementBaseTypeBaseBase()
         * @generated
         */
        EDataType TEXT_ELEMENT_BASE_TYPE_BASE_BASE = eINSTANCE.getTextElementBaseTypeBaseBase();

        /**
         * The meta object literal for the '<em>Uri List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getUriList()
         * @generated
         */
        EDataType URI_LIST = eINSTANCE.getUriList();

        /**
         * The meta object literal for the '<em>Validation Strip Or Preserve Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ValidationStripOrPreserve
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationStripOrPreserveObject()
         * @generated
         */
        EDataType VALIDATION_STRIP_OR_PRESERVE_OBJECT = eINSTANCE.getValidationStripOrPreserveObject();

        /**
         * The meta object literal for the '<em>Validation Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.ValidationType
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getValidationTypeObject()
         * @generated
         */
        EDataType VALIDATION_TYPE_OBJECT = eINSTANCE.getValidationTypeObject();

        /**
         * The meta object literal for the '<em>Yes Or No Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.YesOrNo
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNoObject()
         * @generated
         */
        EDataType YES_OR_NO_OBJECT = eINSTANCE.getYesOrNoObject();

        /**
         * The meta object literal for the '<em>Yes Or No Or Omit Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
         * @see org.w3._1999.xsl.transform.impl.XSLT20PackageImpl#getYesOrNoOrOmitObject()
         * @generated
         */
        EDataType YES_OR_NO_OR_OMIT_OBJECT = eINSTANCE.getYesOrNoOrOmitObject();

    }

} //XSLT20Package
