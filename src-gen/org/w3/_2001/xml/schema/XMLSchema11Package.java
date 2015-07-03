/**
 */
package org.w3._2001.xml.schema;

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
 *     Part 1 version: structures.xsd (rec-20120405)
 *     Part 2 version: datatypes.xsd (rec-20120405)
 *   
 * 
 *    The schema corresponding to this document is normative,
 *    with respect to the syntactic constraints it expresses in the
 *    XML Schema Definition Language.  The documentation (within 'documentation' elements)
 *    below, is not normative, but rather highlights important aspects of
 *    the W3C Recommendation of which this is a part.
 * 
 *       See below (at the bottom of this document) for information about
 *       the revision and namespace-versioning policy governing this
 *       schema document.
 * 
 *     
 * 
 *    The simpleType element and all of its members are defined
 *    towards the end of this schema document.
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
 *    notations for use within  schema documents
 * 
 *       In keeping with the XML Schema WG's standard versioning policy, 
 *       the material in this schema document will persist at the URI
 *       http://www.w3.org/2012/04/XMLSchema.xsd.
 * 
 *       At the date of issue it can also be found at the URI
 *       http://www.w3.org/2009/XMLSchema/XMLSchema.xsd.
 * 
 *       The schema document at that URI may however change in the future, 
 *       in order to remain compatible with the latest version of XSD 
 *       and its namespace.  In other words, if XSD or the XML Schema 
 *       namespace change, the version of this document at 
 *       http://www.w3.org/2009/XMLSchema/XMLSchema.xsd will change accordingly; 
 *       the version at http://www.w3.org/2012/04/XMLSchema.xsd will not change.
 * 
 *       Previous dated (and unchanging) versions of this schema document 
 *       include:
 * 
 *        http://www.w3.org/2012/01/XMLSchema.xsd
 *           (XSD 1.1 Proposed Recommendation)
 * 
 *         http://www.w3.org/2011/07/XMLSchema.xsd
 *           (XSD 1.1 Candidate Recommendation)
 * 
 *         http://www.w3.org/2009/04/XMLSchema.xsd
 *           (XSD 1.1 Candidate Recommendation)
 * 
 *         http://www.w3.org/2004/10/XMLSchema.xsd
 *           (XSD 1.0 Recommendation, Second Edition)
 * 
 *         http://www.w3.org/2001/05/XMLSchema.xsd
 *           (XSD 1.0 Recommendation, First Edition)
 * 
 * 
 *     
 * 
 *       In keeping with the XML Schema WG's standard versioning policy, 
 *       this schema document will persist at the URI
 *       http://www.w3.org/2012/04/datatypes.xsd.
 * 
 *       At the date of issue it can also be found at the URI
 *       http://www.w3.org/2009/XMLSchema/datatypes.xsd.
 * 
 *       The schema document at that URI may however change in the future, 
 *       in order to remain compatible with the latest version of XSD 
 *       and its namespace.  In other words, if XSD or the XML Schema 
 *       namespace change, the version of this document at 
 *       http://www.w3.org/2009/XMLSchema/datatypes.xsd will change accordingly; 
 *       the version at http://www.w3.org/2012/04/datatypes.xsd will not change.
 * 
 *       Previous dated (and unchanging) versions of this schema document 
 *       include:
 * 
 *         http://www.w3.org/2012/01/datatypes.xsd
 *           (XSD 1.1 Proposed Recommendation)
 * 
 *         http://www.w3.org/2011/07/datatypes.xsd
 *           (XSD 1.1 Candidate Recommendation)
 * 
 *         http://www.w3.org/2009/04/datatypes.xsd
 *           (XSD 1.1 Candidate Recommendation)
 * 
 *         http://www.w3.org/2004/10/datatypes.xsd
 *           (XSD 1.0 Recommendation, Second Edition)
 * 
 *         http://www.w3.org/2001/05/datatypes.xsd
 *           (XSD 1.0 Recommendation, First Edition)
 * 
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
 * @see org.w3._2001.xml.schema.XMLSchema11Factory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='EN'"
 * @generated
 */
public interface XMLSchema11Package extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "schema";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.w3.org/2001/XMLSchema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "xs";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XMLSchema11Package eINSTANCE = org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl.init();

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.OpenAttrsImpl <em>Open Attrs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.OpenAttrsImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getOpenAttrs()
     * @generated
     */
    int OPEN_ATTRS = 39;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_ATTRS__MIXED = 0;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_ATTRS__ANY_ATTRIBUTE = 1;

    /**
     * The number of structural features of the '<em>Open Attrs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_ATTRS_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Open Attrs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_ATTRS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AnnotatedImpl <em>Annotated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AnnotatedImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnnotated()
     * @generated
     */
    int ANNOTATED = 2;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED__MIXED = OPEN_ATTRS__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED__ID = OPEN_ATTRS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Annotated</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Annotated</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATED_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.GroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getGroup()
     * @generated
     */
    int GROUP = 23;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__PARTICLE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ELEMENT = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__GROUP = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ALL = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__CHOICE = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__SEQUENCE = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ANY = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__MAX_OCCURS = ANNOTATED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__MIN_OCCURS = ANNOTATED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__NAME = ANNOTATED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__REF = ANNOTATED_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ExplicitGroupImpl <em>Explicit Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ExplicitGroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getExplicitGroup()
     * @generated
     */
    int EXPLICIT_GROUP = 18;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__MIXED = GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__ANY_ATTRIBUTE = GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__ANNOTATION = GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__ID = GROUP__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__PARTICLE = GROUP__PARTICLE;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__ELEMENT = GROUP__ELEMENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__GROUP = GROUP__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__ALL = GROUP__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__CHOICE = GROUP__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__SEQUENCE = GROUP__SEQUENCE;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__ANY = GROUP__ANY;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__MAX_OCCURS = GROUP__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__MIN_OCCURS = GROUP__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__NAME = GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP__REF = GROUP__REF;

    /**
     * The number of structural features of the '<em>Explicit Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Explicit Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AllImpl <em>All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AllImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAll()
     * @generated
     */
    int ALL = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__MIXED = EXPLICIT_GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__ANY_ATTRIBUTE = EXPLICIT_GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__ANNOTATION = EXPLICIT_GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__ID = EXPLICIT_GROUP__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__PARTICLE = EXPLICIT_GROUP__PARTICLE;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__ELEMENT = EXPLICIT_GROUP__ELEMENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__GROUP = EXPLICIT_GROUP__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__ALL = EXPLICIT_GROUP__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__CHOICE = EXPLICIT_GROUP__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__SEQUENCE = EXPLICIT_GROUP__SEQUENCE;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__ANY = EXPLICIT_GROUP__ANY;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__MAX_OCCURS = EXPLICIT_GROUP__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__MIN_OCCURS = EXPLICIT_GROUP__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__NAME = EXPLICIT_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL__REF = EXPLICIT_GROUP__REF;

    /**
     * The number of structural features of the '<em>All</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_FEATURE_COUNT = EXPLICIT_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>All</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_OPERATION_COUNT = EXPLICIT_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AltTypeImpl <em>Alt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AltTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAltType()
     * @generated
     */
    int ALT_TYPE = 1;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__COMPLEX_TYPE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__TEST = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__TYPE = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE__XPATH_DEFAULT_NAMESPACE = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Alt Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Alt Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AnnotationTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnnotationType()
     * @generated
     */
    int ANNOTATION_TYPE = 3;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE__MIXED = OPEN_ATTRS__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Appinfo</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE__APPINFO = OPEN_ATTRS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE__DOCUMENTATION = OPEN_ATTRS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Annotation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Annotation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.WildcardImpl <em>Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.WildcardImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getWildcard()
     * @generated
     */
    int WILDCARD = 61;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__NAMESPACE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Not Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__NOT_NAMESPACE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Process Contents</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD__PROCESS_CONTENTS = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Wildcard</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Wildcard</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WILDCARD_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AnyAttributeTypeImpl <em>Any Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AnyAttributeTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnyAttributeType()
     * @generated
     */
    int ANY_ATTRIBUTE_TYPE = 4;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__MIXED = WILDCARD__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__ANY_ATTRIBUTE = WILDCARD__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__ANNOTATION = WILDCARD__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__ID = WILDCARD__ID;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__NAMESPACE = WILDCARD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Not Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__NOT_NAMESPACE = WILDCARD__NOT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Process Contents</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__PROCESS_CONTENTS = WILDCARD__PROCESS_CONTENTS;

    /**
     * The feature id for the '<em><b>Not QName</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE__NOT_QNAME = WILDCARD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Any Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE_FEATURE_COUNT = WILDCARD_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Any Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_ATTRIBUTE_TYPE_OPERATION_COUNT = WILDCARD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AnyTypeImpl <em>Any Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AnyTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnyType()
     * @generated
     */
    int ANY_TYPE = 5;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__MIXED = WILDCARD__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__ANY_ATTRIBUTE = WILDCARD__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__ANNOTATION = WILDCARD__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__ID = WILDCARD__ID;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__NAMESPACE = WILDCARD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Not Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__NOT_NAMESPACE = WILDCARD__NOT_NAMESPACE;

    /**
     * The feature id for the '<em><b>Process Contents</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__PROCESS_CONTENTS = WILDCARD__PROCESS_CONTENTS;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__MAX_OCCURS = WILDCARD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__MIN_OCCURS = WILDCARD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Not QName</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE__NOT_QNAME = WILDCARD_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Any Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE_FEATURE_COUNT = WILDCARD_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Any Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_TYPE_OPERATION_COUNT = WILDCARD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AppinfoTypeImpl <em>Appinfo Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AppinfoTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAppinfoType()
     * @generated
     */
    int APPINFO_TYPE = 6;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE__MIXED = 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE__GROUP = 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE__ANY = 2;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE__SOURCE = 3;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE__ANY_ATTRIBUTE = 4;

    /**
     * The number of structural features of the '<em>Appinfo Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Appinfo Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPINFO_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AssertionImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAssertion()
     * @generated
     */
    int ASSERTION = 7;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__TEST = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__XPATH_DEFAULT_NAMESPACE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AttributeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 8;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REF = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Use</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__USE = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DEFAULT = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__FIXED = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__FORM = ANNOTATED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TARGET_NAMESPACE = ANNOTATED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Inheritable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__INHERITABLE = ANNOTATED_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AttributeGroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAttributeGroup()
     * @generated
     */
    int ATTRIBUTE_GROUP = 9;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__GROUP = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__NAME = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP__REF = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Attribute Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Attribute Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.AttributeGroupRefImpl <em>Attribute Group Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.AttributeGroupRefImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAttributeGroupRef()
     * @generated
     */
    int ATTRIBUTE_GROUP_REF = 10;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__MIXED = ATTRIBUTE_GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__ANY_ATTRIBUTE = ATTRIBUTE_GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__ANNOTATION = ATTRIBUTE_GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__ID = ATTRIBUTE_GROUP__ID;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__GROUP = ATTRIBUTE_GROUP__GROUP;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__ATTRIBUTE = ATTRIBUTE_GROUP__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__ATTRIBUTE_GROUP = ATTRIBUTE_GROUP__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__ANY_ATTRIBUTE1 = ATTRIBUTE_GROUP__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__NAME = ATTRIBUTE_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF__REF = ATTRIBUTE_GROUP__REF;

    /**
     * The number of structural features of the '<em>Attribute Group Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF_FEATURE_COUNT = ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Attribute Group Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_GROUP_REF_OPERATION_COUNT = ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ComplexContentTypeImpl <em>Complex Content Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ComplexContentTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getComplexContentType()
     * @generated
     */
    int COMPLEX_CONTENT_TYPE = 11;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__RESTRICTION = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__EXTENSION = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mixed1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE__MIXED1 = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Complex Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Complex Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_CONTENT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl <em>Restriction Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.RestrictionTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRestrictionType()
     * @generated
     */
    int RESTRICTION_TYPE = 45;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__OPEN_CONTENT = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__GROUP = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ALL = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__CHOICE = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__SEQUENCE = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__GROUP1 = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Facet Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__FACET_GROUP = ANNOTATED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Facet</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__FACET = ANNOTATED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ANY = ANNOTATED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Group2</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__GROUP2 = ANNOTATED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__ASSERT = ANNOTATED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE__BASE = ANNOTATED_FEATURE_COUNT + 15;

    /**
     * The number of structural features of the '<em>Restriction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 16;

    /**
     * The number of operations of the '<em>Restriction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ComplexRestrictionTypeImpl <em>Complex Restriction Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ComplexRestrictionTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getComplexRestrictionType()
     * @generated
     */
    int COMPLEX_RESTRICTION_TYPE = 12;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__MIXED = RESTRICTION_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ANY_ATTRIBUTE = RESTRICTION_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ANNOTATION = RESTRICTION_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ID = RESTRICTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__OPEN_CONTENT = RESTRICTION_TYPE__OPEN_CONTENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__GROUP = RESTRICTION_TYPE__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ALL = RESTRICTION_TYPE__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__CHOICE = RESTRICTION_TYPE__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__SEQUENCE = RESTRICTION_TYPE__SEQUENCE;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__SIMPLE_TYPE = RESTRICTION_TYPE__SIMPLE_TYPE;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__GROUP1 = RESTRICTION_TYPE__GROUP1;

    /**
     * The feature id for the '<em><b>Facet Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__FACET_GROUP = RESTRICTION_TYPE__FACET_GROUP;

    /**
     * The feature id for the '<em><b>Facet</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__FACET = RESTRICTION_TYPE__FACET;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ANY = RESTRICTION_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Group2</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__GROUP2 = RESTRICTION_TYPE__GROUP2;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ATTRIBUTE = RESTRICTION_TYPE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ATTRIBUTE_GROUP = RESTRICTION_TYPE__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ANY_ATTRIBUTE1 = RESTRICTION_TYPE__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__ASSERT = RESTRICTION_TYPE__ASSERT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE__BASE = RESTRICTION_TYPE__BASE;

    /**
     * The number of structural features of the '<em>Complex Restriction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE_FEATURE_COUNT = RESTRICTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Complex Restriction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_RESTRICTION_TYPE_OPERATION_COUNT = RESTRICTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ComplexTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getComplexType()
     * @generated
     */
    int COMPLEX_TYPE = 13;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__SIMPLE_CONTENT = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__COMPLEX_CONTENT = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__OPEN_CONTENT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__GROUP = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ALL = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__CHOICE = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__SEQUENCE = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__GROUP1 = ANNOTATED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ASSERT = ANNOTATED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__NAME = ANNOTATED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Mixed1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__MIXED1 = ANNOTATED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__ABSTRACT = ANNOTATED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__FINAL = ANNOTATED_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__BLOCK = ANNOTATED_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Default Attributes Apply</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY = ANNOTATED_FEATURE_COUNT + 17;

    /**
     * The number of structural features of the '<em>Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 18;

    /**
     * The number of operations of the '<em>Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl <em>Default Open Content Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDefaultOpenContentType()
     * @generated
     */
    int DEFAULT_OPEN_CONTENT_TYPE = 14;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__ANY = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Applies To Empty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE__MODE = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Default Open Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Default Open Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPEN_CONTENT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.DocumentationTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDocumentationType()
     * @generated
     */
    int DOCUMENTATION_TYPE = 15;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__MIXED = 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__GROUP = 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__ANY = 2;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__SOURCE = 3;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__LANG = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>Documentation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Documentation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.DocumentRootImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 16;

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
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ALL = 3;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ANNOTATION = 4;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ANY = 5;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ANY_ATTRIBUTE = 6;

    /**
     * The feature id for the '<em><b>Appinfo</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__APPINFO = 7;

    /**
     * The feature id for the '<em><b>Assertion</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ASSERTION = 8;

    /**
     * The feature id for the '<em><b>Facet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FACET = 9;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ATTRIBUTE = 10;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ATTRIBUTE_GROUP = 11;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOICE = 12;

    /**
     * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPLEX_CONTENT = 13;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPLEX_TYPE = 14;

    /**
     * The feature id for the '<em><b>Default Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT = 15;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENTATION = 16;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ELEMENT = 17;

    /**
     * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ENUMERATION = 18;

    /**
     * The feature id for the '<em><b>Explicit Timezone</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXPLICIT_TIMEZONE = 19;

    /**
     * The feature id for the '<em><b>Field</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FIELD = 20;

    /**
     * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FRACTION_DIGITS = 21;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GROUP = 22;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPORT = 23;

    /**
     * The feature id for the '<em><b>Include</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INCLUDE = 24;

    /**
     * The feature id for the '<em><b>Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__KEY = 25;

    /**
     * The feature id for the '<em><b>Keyref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__KEYREF = 26;

    /**
     * The feature id for the '<em><b>Length</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LENGTH = 27;

    /**
     * The feature id for the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LIST = 28;

    /**
     * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAX_EXCLUSIVE = 29;

    /**
     * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAX_INCLUSIVE = 30;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAX_LENGTH = 31;

    /**
     * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIN_EXCLUSIVE = 32;

    /**
     * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIN_INCLUSIVE = 33;

    /**
     * The feature id for the '<em><b>Min Length</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIN_LENGTH = 34;

    /**
     * The feature id for the '<em><b>Notation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NOTATION = 35;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPEN_CONTENT = 36;

    /**
     * The feature id for the '<em><b>Override</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OVERRIDE = 37;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PATTERN = 38;

    /**
     * The feature id for the '<em><b>Redefine</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__REDEFINE = 39;

    /**
     * The feature id for the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESTRICTION = 40;

    /**
     * The feature id for the '<em><b>Schema</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCHEMA = 41;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SELECTOR = 42;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEQUENCE = 43;

    /**
     * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SIMPLE_CONTENT = 44;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SIMPLE_TYPE = 45;

    /**
     * The feature id for the '<em><b>Total Digits</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TOTAL_DIGITS = 46;

    /**
     * The feature id for the '<em><b>Union</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__UNION = 47;

    /**
     * The feature id for the '<em><b>Unique</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__UNIQUE = 48;

    /**
     * The feature id for the '<em><b>White Space</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WHITE_SPACE = 49;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 50;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ElementImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 17;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__COMPLEX_TYPE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ALTERNATIVE = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__IDENTITY_CONSTRAINT = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Unique</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__UNIQUE = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Key</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__KEY = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__KEYREF = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__NAME = ANNOTATED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__REF = ANNOTATED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__TYPE = ANNOTATED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__MIN_OCCURS = ANNOTATED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__MAX_OCCURS = ANNOTATED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__SUBSTITUTION_GROUP = ANNOTATED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__DEFAULT = ANNOTATED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__FIXED = ANNOTATED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Nillable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__NILLABLE = ANNOTATED_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ABSTRACT = ANNOTATED_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__FINAL = ANNOTATED_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__BLOCK = ANNOTATED_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__FORM = ANNOTATED_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__TARGET_NAMESPACE = ANNOTATED_FEATURE_COUNT + 20;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 21;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.FacetImpl <em>Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.FacetImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFacet()
     * @generated
     */
    int FACET = 21;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET__VALUE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET__FIXED = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACET_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ExplicitTimezoneTypeImpl <em>Explicit Timezone Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ExplicitTimezoneTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getExplicitTimezoneType()
     * @generated
     */
    int EXPLICIT_TIMEZONE_TYPE = 19;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE__MIXED = FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE__ANNOTATION = FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE__ID = FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE__VALUE = FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE__FIXED = FACET__FIXED;

    /**
     * The number of structural features of the '<em>Explicit Timezone Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Explicit Timezone Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_TIMEZONE_TYPE_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ExtensionTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getExtensionType()
     * @generated
     */
    int EXTENSION_TYPE = 20;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__OPEN_CONTENT = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__GROUP = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ALL = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__CHOICE = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__SEQUENCE = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__GROUP1 = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ATTRIBUTE = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ATTRIBUTE_GROUP = ANNOTATED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ANY_ATTRIBUTE1 = ANNOTATED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__ASSERT = ANNOTATED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE__BASE = ANNOTATED_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Extension Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Extension Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.FieldTypeImpl <em>Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.FieldTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFieldType()
     * @generated
     */
    int FIELD_TYPE = 22;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE__XPATH = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE__XPATH_DEFAULT_NAMESPACE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Field Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Field Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.RealGroupImpl <em>Real Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.RealGroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRealGroup()
     * @generated
     */
    int REAL_GROUP = 43;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__MIXED = GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ANY_ATTRIBUTE = GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ANNOTATION = GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ID = GROUP__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__PARTICLE = GROUP__PARTICLE;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ELEMENT = GROUP__ELEMENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__GROUP = GROUP__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ALL = GROUP__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__CHOICE = GROUP__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__SEQUENCE = GROUP__SEQUENCE;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ANY = GROUP__ANY;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__MAX_OCCURS = GROUP__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__MIN_OCCURS = GROUP__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__NAME = GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__REF = GROUP__REF;

    /**
     * The feature id for the '<em><b>All1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__ALL1 = GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Choice1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__CHOICE1 = GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sequence1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP__SEQUENCE1 = GROUP_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Real Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Real Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.GroupRefImpl <em>Group Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.GroupRefImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getGroupRef()
     * @generated
     */
    int GROUP_REF = 24;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__MIXED = REAL_GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ANY_ATTRIBUTE = REAL_GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ANNOTATION = REAL_GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ID = REAL_GROUP__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__PARTICLE = REAL_GROUP__PARTICLE;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ELEMENT = REAL_GROUP__ELEMENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__GROUP = REAL_GROUP__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ALL = REAL_GROUP__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__CHOICE = REAL_GROUP__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__SEQUENCE = REAL_GROUP__SEQUENCE;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ANY = REAL_GROUP__ANY;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__MAX_OCCURS = REAL_GROUP__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__MIN_OCCURS = REAL_GROUP__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__NAME = REAL_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__REF = REAL_GROUP__REF;

    /**
     * The feature id for the '<em><b>All1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__ALL1 = REAL_GROUP__ALL1;

    /**
     * The feature id for the '<em><b>Choice1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__CHOICE1 = REAL_GROUP__CHOICE1;

    /**
     * The feature id for the '<em><b>Sequence1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF__SEQUENCE1 = REAL_GROUP__SEQUENCE1;

    /**
     * The number of structural features of the '<em>Group Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF_FEATURE_COUNT = REAL_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Group Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_REF_OPERATION_COUNT = REAL_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ImportTypeImpl <em>Import Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ImportTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getImportType()
     * @generated
     */
    int IMPORT_TYPE = 25;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__NAMESPACE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE__SCHEMA_LOCATION = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Import Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Import Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.IncludeTypeImpl <em>Include Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.IncludeTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getIncludeType()
     * @generated
     */
    int INCLUDE_TYPE = 26;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE__SCHEMA_LOCATION = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Include Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Include Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUDE_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.IntFacetImpl <em>Int Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.IntFacetImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getIntFacet()
     * @generated
     */
    int INT_FACET = 27;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET__MIXED = FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET__ANNOTATION = FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET__ID = FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET__VALUE = FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET__FIXED = FACET__FIXED;

    /**
     * The number of structural features of the '<em>Int Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Int Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FACET_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.KeybaseImpl <em>Keybase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.KeybaseImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getKeybase()
     * @generated
     */
    int KEYBASE = 28;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__SELECTOR = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Field</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__FIELD = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__NAME = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE__REF = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Keybase</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Keybase</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYBASE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.KeyrefTypeImpl <em>Keyref Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.KeyrefTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getKeyrefType()
     * @generated
     */
    int KEYREF_TYPE = 29;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__MIXED = KEYBASE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__ANY_ATTRIBUTE = KEYBASE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__ANNOTATION = KEYBASE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__ID = KEYBASE__ID;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__SELECTOR = KEYBASE__SELECTOR;

    /**
     * The feature id for the '<em><b>Field</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__FIELD = KEYBASE__FIELD;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__NAME = KEYBASE__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__REF = KEYBASE__REF;

    /**
     * The feature id for the '<em><b>Refer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE__REFER = KEYBASE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Keyref Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE_FEATURE_COUNT = KEYBASE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Keyref Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYREF_TYPE_OPERATION_COUNT = KEYBASE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.ListTypeImpl <em>List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.ListTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getListType()
     * @generated
     */
    int LIST_TYPE = 30;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Item Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE__ITEM_TYPE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>List Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>List Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.LocalComplexTypeImpl <em>Local Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.LocalComplexTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getLocalComplexType()
     * @generated
     */
    int LOCAL_COMPLEX_TYPE = 31;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__MIXED = COMPLEX_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ANY_ATTRIBUTE = COMPLEX_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ANNOTATION = COMPLEX_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ID = COMPLEX_TYPE__ID;

    /**
     * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__SIMPLE_CONTENT = COMPLEX_TYPE__SIMPLE_CONTENT;

    /**
     * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__COMPLEX_CONTENT = COMPLEX_TYPE__COMPLEX_CONTENT;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__OPEN_CONTENT = COMPLEX_TYPE__OPEN_CONTENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__GROUP = COMPLEX_TYPE__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ALL = COMPLEX_TYPE__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__CHOICE = COMPLEX_TYPE__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__SEQUENCE = COMPLEX_TYPE__SEQUENCE;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__GROUP1 = COMPLEX_TYPE__GROUP1;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ATTRIBUTE = COMPLEX_TYPE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ATTRIBUTE_GROUP = COMPLEX_TYPE__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ANY_ATTRIBUTE1 = COMPLEX_TYPE__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ASSERT = COMPLEX_TYPE__ASSERT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__NAME = COMPLEX_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Mixed1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__MIXED1 = COMPLEX_TYPE__MIXED1;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__ABSTRACT = COMPLEX_TYPE__ABSTRACT;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__FINAL = COMPLEX_TYPE__FINAL;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__BLOCK = COMPLEX_TYPE__BLOCK;

    /**
     * The feature id for the '<em><b>Default Attributes Apply</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY = COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY;

    /**
     * The number of structural features of the '<em>Local Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Local Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_COMPLEX_TYPE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.LocalElementImpl <em>Local Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.LocalElementImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getLocalElement()
     * @generated
     */
    int LOCAL_ELEMENT = 32;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__MIXED = ELEMENT__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__ANY_ATTRIBUTE = ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__ANNOTATION = ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__SIMPLE_TYPE = ELEMENT__SIMPLE_TYPE;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__COMPLEX_TYPE = ELEMENT__COMPLEX_TYPE;

    /**
     * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__ALTERNATIVE = ELEMENT__ALTERNATIVE;

    /**
     * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__IDENTITY_CONSTRAINT = ELEMENT__IDENTITY_CONSTRAINT;

    /**
     * The feature id for the '<em><b>Unique</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__UNIQUE = ELEMENT__UNIQUE;

    /**
     * The feature id for the '<em><b>Key</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__KEY = ELEMENT__KEY;

    /**
     * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__KEYREF = ELEMENT__KEYREF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__NAME = ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__REF = ELEMENT__REF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__TYPE = ELEMENT__TYPE;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__MIN_OCCURS = ELEMENT__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__MAX_OCCURS = ELEMENT__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__SUBSTITUTION_GROUP = ELEMENT__SUBSTITUTION_GROUP;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__DEFAULT = ELEMENT__DEFAULT;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__FIXED = ELEMENT__FIXED;

    /**
     * The feature id for the '<em><b>Nillable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__NILLABLE = ELEMENT__NILLABLE;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__ABSTRACT = ELEMENT__ABSTRACT;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__FINAL = ELEMENT__FINAL;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__BLOCK = ELEMENT__BLOCK;

    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__FORM = ELEMENT__FORM;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT__TARGET_NAMESPACE = ELEMENT__TARGET_NAMESPACE;

    /**
     * The number of structural features of the '<em>Local Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Local Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SimpleTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleType()
     * @generated
     */
    int SIMPLE_TYPE = 53;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__RESTRICTION = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__LIST = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Union</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__UNION = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__FINAL = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE__NAME = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Simple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Simple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.LocalSimpleTypeImpl <em>Local Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.LocalSimpleTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getLocalSimpleType()
     * @generated
     */
    int LOCAL_SIMPLE_TYPE = 33;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__MIXED = SIMPLE_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__ANY_ATTRIBUTE = SIMPLE_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__ANNOTATION = SIMPLE_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__ID = SIMPLE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__RESTRICTION = SIMPLE_TYPE__RESTRICTION;

    /**
     * The feature id for the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__LIST = SIMPLE_TYPE__LIST;

    /**
     * The feature id for the '<em><b>Union</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__UNION = SIMPLE_TYPE__UNION;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__FINAL = SIMPLE_TYPE__FINAL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE__NAME = SIMPLE_TYPE__NAME;

    /**
     * The number of structural features of the '<em>Local Simple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Local Simple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIMPLE_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.NamedAttributeGroupImpl <em>Named Attribute Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.NamedAttributeGroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNamedAttributeGroup()
     * @generated
     */
    int NAMED_ATTRIBUTE_GROUP = 34;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__MIXED = ATTRIBUTE_GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__ANY_ATTRIBUTE = ATTRIBUTE_GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__ANNOTATION = ATTRIBUTE_GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__ID = ATTRIBUTE_GROUP__ID;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__GROUP = ATTRIBUTE_GROUP__GROUP;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__ATTRIBUTE = ATTRIBUTE_GROUP__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = ATTRIBUTE_GROUP__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__ANY_ATTRIBUTE1 = ATTRIBUTE_GROUP__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__NAME = ATTRIBUTE_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP__REF = ATTRIBUTE_GROUP__REF;

    /**
     * The number of structural features of the '<em>Named Attribute Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP_FEATURE_COUNT = ATTRIBUTE_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Named Attribute Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ATTRIBUTE_GROUP_OPERATION_COUNT = ATTRIBUTE_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.NamedGroupImpl <em>Named Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.NamedGroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNamedGroup()
     * @generated
     */
    int NAMED_GROUP = 35;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__MIXED = REAL_GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ANY_ATTRIBUTE = REAL_GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ANNOTATION = REAL_GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ID = REAL_GROUP__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__PARTICLE = REAL_GROUP__PARTICLE;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ELEMENT = REAL_GROUP__ELEMENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__GROUP = REAL_GROUP__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ALL = REAL_GROUP__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__CHOICE = REAL_GROUP__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__SEQUENCE = REAL_GROUP__SEQUENCE;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ANY = REAL_GROUP__ANY;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__MAX_OCCURS = REAL_GROUP__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__MIN_OCCURS = REAL_GROUP__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__NAME = REAL_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__REF = REAL_GROUP__REF;

    /**
     * The feature id for the '<em><b>All1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__ALL1 = REAL_GROUP__ALL1;

    /**
     * The feature id for the '<em><b>Choice1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__CHOICE1 = REAL_GROUP__CHOICE1;

    /**
     * The feature id for the '<em><b>Sequence1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP__SEQUENCE1 = REAL_GROUP__SEQUENCE1;

    /**
     * The number of structural features of the '<em>Named Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP_FEATURE_COUNT = REAL_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Named Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_GROUP_OPERATION_COUNT = REAL_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.NoFixedFacetImpl <em>No Fixed Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.NoFixedFacetImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNoFixedFacet()
     * @generated
     */
    int NO_FIXED_FACET = 36;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET__MIXED = FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET__ANNOTATION = FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET__ID = FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET__VALUE = FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET__FIXED = FACET__FIXED;

    /**
     * The number of structural features of the '<em>No Fixed Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>No Fixed Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NO_FIXED_FACET_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.NotationTypeImpl <em>Notation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.NotationTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNotationType()
     * @generated
     */
    int NOTATION_TYPE = 37;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__NAME = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Public</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__PUBLIC = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE__SYSTEM = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Notation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Notation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTATION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.NumFacetImpl <em>Num Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.NumFacetImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNumFacet()
     * @generated
     */
    int NUM_FACET = 38;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET__MIXED = FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET__ANNOTATION = FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET__ID = FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET__VALUE = FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET__FIXED = FACET__FIXED;

    /**
     * The number of structural features of the '<em>Num Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Num Facet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUM_FACET_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.OpenContentTypeImpl <em>Open Content Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.OpenContentTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getOpenContentType()
     * @generated
     */
    int OPEN_CONTENT_TYPE = 40;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE__ANY = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE__MODE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Open Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Open Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPEN_CONTENT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl <em>Override Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.OverrideTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getOverrideType()
     * @generated
     */
    int OVERRIDE_TYPE = 41;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__MIXED = OPEN_ATTRS__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Top</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__SCHEMA_TOP = OPEN_ATTRS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__SIMPLE_TYPE = OPEN_ATTRS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__COMPLEX_TYPE = OPEN_ATTRS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__ATTRIBUTE_GROUP = OPEN_ATTRS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__ELEMENT = OPEN_ATTRS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__ATTRIBUTE = OPEN_ATTRS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Notation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__NOTATION = OPEN_ATTRS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__SCHEMA_LOCATION = OPEN_ATTRS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Override Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Override Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OVERRIDE_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.PatternTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getPatternType()
     * @generated
     */
    int PATTERN_TYPE = 42;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE__MIXED = NO_FIXED_FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE__ANY_ATTRIBUTE = NO_FIXED_FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE__ANNOTATION = NO_FIXED_FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE__ID = NO_FIXED_FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE__VALUE = NO_FIXED_FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE__FIXED = NO_FIXED_FACET__FIXED;

    /**
     * The number of structural features of the '<em>Pattern Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE_FEATURE_COUNT = NO_FIXED_FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Pattern Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_TYPE_OPERATION_COUNT = NO_FIXED_FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.RedefineTypeImpl <em>Redefine Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.RedefineTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRedefineType()
     * @generated
     */
    int REDEFINE_TYPE = 44;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__MIXED = OPEN_ATTRS__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__SIMPLE_TYPE = OPEN_ATTRS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__COMPLEX_TYPE = OPEN_ATTRS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Group1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__GROUP1 = OPEN_ATTRS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__ATTRIBUTE_GROUP = OPEN_ATTRS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__SCHEMA_LOCATION = OPEN_ATTRS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Redefine Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Redefine Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REDEFINE_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl <em>Restriction Type1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.RestrictionType1Impl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRestrictionType1()
     * @generated
     */
    int RESTRICTION_TYPE1 = 46;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__GROUP = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Facet Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__FACET_GROUP = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Facet</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__FACET = ANNOTATED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__ANY = ANNOTATED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1__BASE = ANNOTATED_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Restriction Type1</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Restriction Type1</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_TYPE1_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SchemaTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSchemaType()
     * @generated
     */
    int SCHEMA_TYPE = 47;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__MIXED = OPEN_ATTRS__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ANY_ATTRIBUTE = OPEN_ATTRS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Composition</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__COMPOSITION = OPEN_ATTRS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Include</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__INCLUDE = OPEN_ATTRS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__IMPORT = OPEN_ATTRS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Redefine</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__REDEFINE = OPEN_ATTRS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Override</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__OVERRIDE = OPEN_ATTRS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ANNOTATION = OPEN_ATTRS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Default Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__DEFAULT_OPEN_CONTENT = OPEN_ATTRS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ANNOTATION1 = OPEN_ATTRS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__GROUP = OPEN_ATTRS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__SIMPLE_TYPE = OPEN_ATTRS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__COMPLEX_TYPE = OPEN_ATTRS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Group1</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__GROUP1 = OPEN_ATTRS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ATTRIBUTE_GROUP = OPEN_ATTRS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ELEMENT = OPEN_ATTRS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ATTRIBUTE = OPEN_ATTRS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Notation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__NOTATION = OPEN_ATTRS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Annotation2</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ANNOTATION2 = OPEN_ATTRS_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__TARGET_NAMESPACE = OPEN_ATTRS_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__VERSION = OPEN_ATTRS_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Final Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__FINAL_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Block Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__BLOCK_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Attribute Form Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Element Form Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ELEMENT_FORM_DEFAULT = OPEN_ATTRS_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Default Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__DEFAULT_ATTRIBUTES = OPEN_ATTRS_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE = OPEN_ATTRS_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__ID = OPEN_ATTRS_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE__LANG = OPEN_ATTRS_FEATURE_COUNT + 26;

    /**
     * The number of structural features of the '<em>Schema Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE_FEATURE_COUNT = OPEN_ATTRS_FEATURE_COUNT + 27;

    /**
     * The number of operations of the '<em>Schema Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TYPE_OPERATION_COUNT = OPEN_ATTRS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SelectorTypeImpl <em>Selector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SelectorTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSelectorType()
     * @generated
     */
    int SELECTOR_TYPE = 48;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE__XPATH = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE__XPATH_DEFAULT_NAMESPACE = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Selector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELECTOR_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SimpleContentTypeImpl <em>Simple Content Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SimpleContentTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleContentType()
     * @generated
     */
    int SIMPLE_CONTENT_TYPE = 49;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE__RESTRICTION = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE__EXTENSION = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Simple Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Simple Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_CONTENT_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SimpleExplicitGroupImpl <em>Simple Explicit Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SimpleExplicitGroupImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleExplicitGroup()
     * @generated
     */
    int SIMPLE_EXPLICIT_GROUP = 50;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__MIXED = EXPLICIT_GROUP__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__ANY_ATTRIBUTE = EXPLICIT_GROUP__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__ANNOTATION = EXPLICIT_GROUP__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__ID = EXPLICIT_GROUP__ID;

    /**
     * The feature id for the '<em><b>Particle</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__PARTICLE = EXPLICIT_GROUP__PARTICLE;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__ELEMENT = EXPLICIT_GROUP__ELEMENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__GROUP = EXPLICIT_GROUP__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__ALL = EXPLICIT_GROUP__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__CHOICE = EXPLICIT_GROUP__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__SEQUENCE = EXPLICIT_GROUP__SEQUENCE;

    /**
     * The feature id for the '<em><b>Any</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__ANY = EXPLICIT_GROUP__ANY;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__MAX_OCCURS = EXPLICIT_GROUP__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__MIN_OCCURS = EXPLICIT_GROUP__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__NAME = EXPLICIT_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP__REF = EXPLICIT_GROUP__REF;

    /**
     * The number of structural features of the '<em>Simple Explicit Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP_FEATURE_COUNT = EXPLICIT_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Simple Explicit Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXPLICIT_GROUP_OPERATION_COUNT = EXPLICIT_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SimpleExtensionTypeImpl <em>Simple Extension Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SimpleExtensionTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleExtensionType()
     * @generated
     */
    int SIMPLE_EXTENSION_TYPE = 51;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__MIXED = EXTENSION_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ANY_ATTRIBUTE = EXTENSION_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ANNOTATION = EXTENSION_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ID = EXTENSION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__OPEN_CONTENT = EXTENSION_TYPE__OPEN_CONTENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__GROUP = EXTENSION_TYPE__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ALL = EXTENSION_TYPE__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__CHOICE = EXTENSION_TYPE__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__SEQUENCE = EXTENSION_TYPE__SEQUENCE;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__GROUP1 = EXTENSION_TYPE__GROUP1;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ATTRIBUTE = EXTENSION_TYPE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ATTRIBUTE_GROUP = EXTENSION_TYPE__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ANY_ATTRIBUTE1 = EXTENSION_TYPE__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__ASSERT = EXTENSION_TYPE__ASSERT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE__BASE = EXTENSION_TYPE__BASE;

    /**
     * The number of structural features of the '<em>Simple Extension Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE_FEATURE_COUNT = EXTENSION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Simple Extension Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_EXTENSION_TYPE_OPERATION_COUNT = EXTENSION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.SimpleRestrictionTypeImpl <em>Simple Restriction Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.SimpleRestrictionTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleRestrictionType()
     * @generated
     */
    int SIMPLE_RESTRICTION_TYPE = 52;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__MIXED = RESTRICTION_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ANY_ATTRIBUTE = RESTRICTION_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ANNOTATION = RESTRICTION_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ID = RESTRICTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__OPEN_CONTENT = RESTRICTION_TYPE__OPEN_CONTENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__GROUP = RESTRICTION_TYPE__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ALL = RESTRICTION_TYPE__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__CHOICE = RESTRICTION_TYPE__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__SEQUENCE = RESTRICTION_TYPE__SEQUENCE;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__SIMPLE_TYPE = RESTRICTION_TYPE__SIMPLE_TYPE;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__GROUP1 = RESTRICTION_TYPE__GROUP1;

    /**
     * The feature id for the '<em><b>Facet Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__FACET_GROUP = RESTRICTION_TYPE__FACET_GROUP;

    /**
     * The feature id for the '<em><b>Facet</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__FACET = RESTRICTION_TYPE__FACET;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ANY = RESTRICTION_TYPE__ANY;

    /**
     * The feature id for the '<em><b>Group2</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__GROUP2 = RESTRICTION_TYPE__GROUP2;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ATTRIBUTE = RESTRICTION_TYPE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ATTRIBUTE_GROUP = RESTRICTION_TYPE__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ANY_ATTRIBUTE1 = RESTRICTION_TYPE__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__ASSERT = RESTRICTION_TYPE__ASSERT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE__BASE = RESTRICTION_TYPE__BASE;

    /**
     * The number of structural features of the '<em>Simple Restriction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE_FEATURE_COUNT = RESTRICTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Simple Restriction Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_RESTRICTION_TYPE_OPERATION_COUNT = RESTRICTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.TopLevelAttributeImpl <em>Top Level Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.TopLevelAttributeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelAttribute()
     * @generated
     */
    int TOP_LEVEL_ATTRIBUTE = 54;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__MIXED = ATTRIBUTE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__ANY_ATTRIBUTE = ATTRIBUTE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__ANNOTATION = ATTRIBUTE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__ID = ATTRIBUTE__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__SIMPLE_TYPE = ATTRIBUTE__SIMPLE_TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__REF = ATTRIBUTE__REF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

    /**
     * The feature id for the '<em><b>Use</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__USE = ATTRIBUTE__USE;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__DEFAULT = ATTRIBUTE__DEFAULT;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__FIXED = ATTRIBUTE__FIXED;

    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__FORM = ATTRIBUTE__FORM;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__TARGET_NAMESPACE = ATTRIBUTE__TARGET_NAMESPACE;

    /**
     * The feature id for the '<em><b>Inheritable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE__INHERITABLE = ATTRIBUTE__INHERITABLE;

    /**
     * The number of structural features of the '<em>Top Level Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Top Level Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.TopLevelComplexTypeImpl <em>Top Level Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.TopLevelComplexTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelComplexType()
     * @generated
     */
    int TOP_LEVEL_COMPLEX_TYPE = 55;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__MIXED = COMPLEX_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ANY_ATTRIBUTE = COMPLEX_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ANNOTATION = COMPLEX_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ID = COMPLEX_TYPE__ID;

    /**
     * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__SIMPLE_CONTENT = COMPLEX_TYPE__SIMPLE_CONTENT;

    /**
     * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__COMPLEX_CONTENT = COMPLEX_TYPE__COMPLEX_CONTENT;

    /**
     * The feature id for the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__OPEN_CONTENT = COMPLEX_TYPE__OPEN_CONTENT;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__GROUP = COMPLEX_TYPE__GROUP;

    /**
     * The feature id for the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ALL = COMPLEX_TYPE__ALL;

    /**
     * The feature id for the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__CHOICE = COMPLEX_TYPE__CHOICE;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__SEQUENCE = COMPLEX_TYPE__SEQUENCE;

    /**
     * The feature id for the '<em><b>Group1</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__GROUP1 = COMPLEX_TYPE__GROUP1;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ATTRIBUTE = COMPLEX_TYPE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ATTRIBUTE_GROUP = COMPLEX_TYPE__ATTRIBUTE_GROUP;

    /**
     * The feature id for the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ANY_ATTRIBUTE1 = COMPLEX_TYPE__ANY_ATTRIBUTE1;

    /**
     * The feature id for the '<em><b>Assert</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ASSERT = COMPLEX_TYPE__ASSERT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__NAME = COMPLEX_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Mixed1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__MIXED1 = COMPLEX_TYPE__MIXED1;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__ABSTRACT = COMPLEX_TYPE__ABSTRACT;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__FINAL = COMPLEX_TYPE__FINAL;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__BLOCK = COMPLEX_TYPE__BLOCK;

    /**
     * The feature id for the '<em><b>Default Attributes Apply</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY = COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY;

    /**
     * The number of structural features of the '<em>Top Level Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Top Level Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_COMPLEX_TYPE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.TopLevelElementImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelElement()
     * @generated
     */
    int TOP_LEVEL_ELEMENT = 56;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__MIXED = ELEMENT__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__ANY_ATTRIBUTE = ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__ANNOTATION = ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__SIMPLE_TYPE = ELEMENT__SIMPLE_TYPE;

    /**
     * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__COMPLEX_TYPE = ELEMENT__COMPLEX_TYPE;

    /**
     * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__ALTERNATIVE = ELEMENT__ALTERNATIVE;

    /**
     * The feature id for the '<em><b>Identity Constraint</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__IDENTITY_CONSTRAINT = ELEMENT__IDENTITY_CONSTRAINT;

    /**
     * The feature id for the '<em><b>Unique</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__UNIQUE = ELEMENT__UNIQUE;

    /**
     * The feature id for the '<em><b>Key</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__KEY = ELEMENT__KEY;

    /**
     * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__KEYREF = ELEMENT__KEYREF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__NAME = ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__REF = ELEMENT__REF;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__TYPE = ELEMENT__TYPE;

    /**
     * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__MIN_OCCURS = ELEMENT__MIN_OCCURS;

    /**
     * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__MAX_OCCURS = ELEMENT__MAX_OCCURS;

    /**
     * The feature id for the '<em><b>Substitution Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__SUBSTITUTION_GROUP = ELEMENT__SUBSTITUTION_GROUP;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__DEFAULT = ELEMENT__DEFAULT;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__FIXED = ELEMENT__FIXED;

    /**
     * The feature id for the '<em><b>Nillable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__NILLABLE = ELEMENT__NILLABLE;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__ABSTRACT = ELEMENT__ABSTRACT;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__FINAL = ELEMENT__FINAL;

    /**
     * The feature id for the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__BLOCK = ELEMENT__BLOCK;

    /**
     * The feature id for the '<em><b>Form</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__FORM = ELEMENT__FORM;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT__TARGET_NAMESPACE = ELEMENT__TARGET_NAMESPACE;

    /**
     * The number of structural features of the '<em>Top Level Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Top Level Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.TopLevelSimpleTypeImpl <em>Top Level Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.TopLevelSimpleTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelSimpleType()
     * @generated
     */
    int TOP_LEVEL_SIMPLE_TYPE = 57;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__MIXED = SIMPLE_TYPE__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__ANY_ATTRIBUTE = SIMPLE_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__ANNOTATION = SIMPLE_TYPE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__ID = SIMPLE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__RESTRICTION = SIMPLE_TYPE__RESTRICTION;

    /**
     * The feature id for the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__LIST = SIMPLE_TYPE__LIST;

    /**
     * The feature id for the '<em><b>Union</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__UNION = SIMPLE_TYPE__UNION;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__FINAL = SIMPLE_TYPE__FINAL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE__NAME = SIMPLE_TYPE__NAME;

    /**
     * The number of structural features of the '<em>Top Level Simple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Top Level Simple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOP_LEVEL_SIMPLE_TYPE_OPERATION_COUNT = SIMPLE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.TotalDigitsTypeImpl <em>Total Digits Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.TotalDigitsTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTotalDigitsType()
     * @generated
     */
    int TOTAL_DIGITS_TYPE = 58;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE__MIXED = NUM_FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE__ANY_ATTRIBUTE = NUM_FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE__ANNOTATION = NUM_FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE__ID = NUM_FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE__VALUE = NUM_FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE__FIXED = NUM_FACET__FIXED;

    /**
     * The number of structural features of the '<em>Total Digits Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE_FEATURE_COUNT = NUM_FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Total Digits Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TOTAL_DIGITS_TYPE_OPERATION_COUNT = NUM_FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.UnionTypeImpl <em>Union Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.UnionTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getUnionType()
     * @generated
     */
    int UNION_TYPE = 59;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__MIXED = ANNOTATED__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__ANY_ATTRIBUTE = ANNOTATED__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__ANNOTATION = ANNOTATED__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__ID = ANNOTATED__ID;

    /**
     * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__SIMPLE_TYPE = ANNOTATED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Member Types</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE__MEMBER_TYPES = ANNOTATED_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Union Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Union Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNION_TYPE_OPERATION_COUNT = ANNOTATED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.impl.WhiteSpaceTypeImpl <em>White Space Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.impl.WhiteSpaceTypeImpl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getWhiteSpaceType()
     * @generated
     */
    int WHITE_SPACE_TYPE = 60;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE__MIXED = FACET__MIXED;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE__ANY_ATTRIBUTE = FACET__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE__ANNOTATION = FACET__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE__ID = FACET__ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE__VALUE = FACET__VALUE;

    /**
     * The feature id for the '<em><b>Fixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE__FIXED = FACET__FIXED;

    /**
     * The number of structural features of the '<em>White Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE_FEATURE_COUNT = FACET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>White Space Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHITE_SPACE_TYPE_OPERATION_COUNT = FACET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.AllNNIMember1 <em>All NNI Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.AllNNIMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAllNNIMember1()
     * @generated
     */
    int ALL_NNI_MEMBER1 = 62;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.BasicNamespaceListItemMember1 <em>Basic Namespace List Item Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.BasicNamespaceListItemMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceListItemMember1()
     * @generated
     */
    int BASIC_NAMESPACE_LIST_ITEM_MEMBER1 = 63;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.BlockSetMember0 <em>Block Set Member0</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.BlockSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember0()
     * @generated
     */
    int BLOCK_SET_MEMBER0 = 64;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.BlockSetMember1Item <em>Block Set Member1 Item</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.BlockSetMember1Item
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember1Item()
     * @generated
     */
    int BLOCK_SET_MEMBER1_ITEM = 65;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.DerivationControl <em>Derivation Control</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.DerivationControl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationControl()
     * @generated
     */
    int DERIVATION_CONTROL = 66;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.DerivationSetMember0 <em>Derivation Set Member0</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.DerivationSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSetMember0()
     * @generated
     */
    int DERIVATION_SET_MEMBER0 = 67;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.FormChoice <em>Form Choice</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.FormChoice
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFormChoice()
     * @generated
     */
    int FORM_CHOICE = 68;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.FullDerivationSetMember0 <em>Full Derivation Set Member0</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.FullDerivationSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSetMember0()
     * @generated
     */
    int FULL_DERIVATION_SET_MEMBER0 = 69;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.ModeType <em>Mode Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ModeType
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeType()
     * @generated
     */
    int MODE_TYPE = 70;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.ModeType1 <em>Mode Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ModeType1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeType1()
     * @generated
     */
    int MODE_TYPE1 = 71;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.ProcessContentsType <em>Process Contents Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ProcessContentsType
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getProcessContentsType()
     * @generated
     */
    int PROCESS_CONTENTS_TYPE = 72;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.QnameListAItemMember1 <em>Qname List AItem Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.QnameListAItemMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListAItemMember1()
     * @generated
     */
    int QNAME_LIST_AITEM_MEMBER1 = 73;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.QnameListItemMember1 <em>Qname List Item Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.QnameListItemMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListItemMember1()
     * @generated
     */
    int QNAME_LIST_ITEM_MEMBER1 = 74;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.ReducedDerivationControl <em>Reduced Derivation Control</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ReducedDerivationControl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getReducedDerivationControl()
     * @generated
     */
    int REDUCED_DERIVATION_CONTROL = 75;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember0()
     * @generated
     */
    int SIMPLE_DERIVATION_SET_MEMBER0 = 76;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember1Item
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember1Item()
     * @generated
     */
    int SIMPLE_DERIVATION_SET_MEMBER1_ITEM = 77;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.SpecialNamespaceList <em>Special Namespace List</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.SpecialNamespaceList
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSpecialNamespaceList()
     * @generated
     */
    int SPECIAL_NAMESPACE_LIST = 78;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.TypeDerivationControl <em>Type Derivation Control</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.TypeDerivationControl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTypeDerivationControl()
     * @generated
     */
    int TYPE_DERIVATION_CONTROL = 79;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.UseType <em>Use Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.UseType
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getUseType()
     * @generated
     */
    int USE_TYPE = 80;

    /**
     * The meta object id for the '{@link org.w3._2001.xml.schema.XpathDefaultNamespaceMember1 <em>Xpath Default Namespace Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.XpathDefaultNamespaceMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathDefaultNamespaceMember1()
     * @generated
     */
    int XPATH_DEFAULT_NAMESPACE_MEMBER1 = 81;

    /**
     * The meta object id for the '<em>All NNI</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAllNNI()
     * @generated
     */
    int ALL_NNI = 82;

    /**
     * The meta object id for the '<em>All NNI Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.AllNNIMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAllNNIMember1Object()
     * @generated
     */
    int ALL_NNI_MEMBER1_OBJECT = 83;

    /**
     * The meta object id for the '<em>Basic Namespace List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceList()
     * @generated
     */
    int BASIC_NAMESPACE_LIST = 84;

    /**
     * The meta object id for the '<em>Basic Namespace List Item</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceListItem()
     * @generated
     */
    int BASIC_NAMESPACE_LIST_ITEM = 85;

    /**
     * The meta object id for the '<em>Basic Namespace List Item Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.BasicNamespaceListItemMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceListItemMember1Object()
     * @generated
     */
    int BASIC_NAMESPACE_LIST_ITEM_MEMBER1_OBJECT = 86;

    /**
     * The meta object id for the '<em>Block Set</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSet()
     * @generated
     */
    int BLOCK_SET = 87;

    /**
     * The meta object id for the '<em>Block Set Member0 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.BlockSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember0Object()
     * @generated
     */
    int BLOCK_SET_MEMBER0_OBJECT = 88;

    /**
     * The meta object id for the '<em>Block Set Member1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember1()
     * @generated
     */
    int BLOCK_SET_MEMBER1 = 89;

    /**
     * The meta object id for the '<em>Block Set Member1 Item Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.BlockSetMember1Item
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember1ItemObject()
     * @generated
     */
    int BLOCK_SET_MEMBER1_ITEM_OBJECT = 90;

    /**
     * The meta object id for the '<em>Derivation Control Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.DerivationControl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationControlObject()
     * @generated
     */
    int DERIVATION_CONTROL_OBJECT = 91;

    /**
     * The meta object id for the '<em>Derivation Set</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSet()
     * @generated
     */
    int DERIVATION_SET = 92;

    /**
     * The meta object id for the '<em>Derivation Set Member0 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.DerivationSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSetMember0Object()
     * @generated
     */
    int DERIVATION_SET_MEMBER0_OBJECT = 93;

    /**
     * The meta object id for the '<em>Derivation Set Member1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSetMember1()
     * @generated
     */
    int DERIVATION_SET_MEMBER1 = 94;

    /**
     * The meta object id for the '<em>Form Choice Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.FormChoice
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFormChoiceObject()
     * @generated
     */
    int FORM_CHOICE_OBJECT = 95;

    /**
     * The meta object id for the '<em>Full Derivation Set</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSet()
     * @generated
     */
    int FULL_DERIVATION_SET = 96;

    /**
     * The meta object id for the '<em>Full Derivation Set Member0 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.FullDerivationSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSetMember0Object()
     * @generated
     */
    int FULL_DERIVATION_SET_MEMBER0_OBJECT = 97;

    /**
     * The meta object id for the '<em>Full Derivation Set Member1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSetMember1()
     * @generated
     */
    int FULL_DERIVATION_SET_MEMBER1 = 98;

    /**
     * The meta object id for the '<em>Member Types Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getMemberTypesType()
     * @generated
     */
    int MEMBER_TYPES_TYPE = 99;

    /**
     * The meta object id for the '<em>Mode Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ModeType
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeTypeObject()
     * @generated
     */
    int MODE_TYPE_OBJECT = 100;

    /**
     * The meta object id for the '<em>Mode Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ModeType1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeTypeObject1()
     * @generated
     */
    int MODE_TYPE_OBJECT1 = 101;

    /**
     * The meta object id for the '<em>Namespace List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNamespaceList()
     * @generated
     */
    int NAMESPACE_LIST = 102;

    /**
     * The meta object id for the '<em>Not Namespace Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNotNamespaceType()
     * @generated
     */
    int NOT_NAMESPACE_TYPE = 103;

    /**
     * The meta object id for the '<em>Process Contents Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ProcessContentsType
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getProcessContentsTypeObject()
     * @generated
     */
    int PROCESS_CONTENTS_TYPE_OBJECT = 104;

    /**
     * The meta object id for the '<em>Public</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getPublic()
     * @generated
     */
    int PUBLIC = 105;

    /**
     * The meta object id for the '<em>Qname List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameList()
     * @generated
     */
    int QNAME_LIST = 106;

    /**
     * The meta object id for the '<em>Qname List A</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListA()
     * @generated
     */
    int QNAME_LIST_A = 107;

    /**
     * The meta object id for the '<em>Qname List AItem</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListAItem()
     * @generated
     */
    int QNAME_LIST_AITEM = 108;

    /**
     * The meta object id for the '<em>Qname List AItem Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.QnameListAItemMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListAItemMember1Object()
     * @generated
     */
    int QNAME_LIST_AITEM_MEMBER1_OBJECT = 109;

    /**
     * The meta object id for the '<em>Qname List Item</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListItem()
     * @generated
     */
    int QNAME_LIST_ITEM = 110;

    /**
     * The meta object id for the '<em>Qname List Item Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.QnameListItemMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListItemMember1Object()
     * @generated
     */
    int QNAME_LIST_ITEM_MEMBER1_OBJECT = 111;

    /**
     * The meta object id for the '<em>Reduced Derivation Control Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.ReducedDerivationControl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getReducedDerivationControlObject()
     * @generated
     */
    int REDUCED_DERIVATION_CONTROL_OBJECT = 112;

    /**
     * The meta object id for the '<em>Simple Derivation Set</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSet()
     * @generated
     */
    int SIMPLE_DERIVATION_SET = 113;

    /**
     * The meta object id for the '<em>Simple Derivation Set Member0 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember0
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember0Object()
     * @generated
     */
    int SIMPLE_DERIVATION_SET_MEMBER0_OBJECT = 114;

    /**
     * The meta object id for the '<em>Simple Derivation Set Member1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember1()
     * @generated
     */
    int SIMPLE_DERIVATION_SET_MEMBER1 = 115;

    /**
     * The meta object id for the '<em>Simple Derivation Set Member1 Item Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember1Item
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember1ItemObject()
     * @generated
     */
    int SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT = 116;

    /**
     * The meta object id for the '<em>Special Namespace List Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.SpecialNamespaceList
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSpecialNamespaceListObject()
     * @generated
     */
    int SPECIAL_NAMESPACE_LIST_OBJECT = 117;

    /**
     * The meta object id for the '<em>Substitution Group Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSubstitutionGroupType()
     * @generated
     */
    int SUBSTITUTION_GROUP_TYPE = 118;

    /**
     * The meta object id for the '<em>Type Derivation Control Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.TypeDerivationControl
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTypeDerivationControlObject()
     * @generated
     */
    int TYPE_DERIVATION_CONTROL_OBJECT = 119;

    /**
     * The meta object id for the '<em>Use Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.UseType
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getUseTypeObject()
     * @generated
     */
    int USE_TYPE_OBJECT = 120;

    /**
     * The meta object id for the '<em>Xpath Default Namespace</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathDefaultNamespace()
     * @generated
     */
    int XPATH_DEFAULT_NAMESPACE = 121;

    /**
     * The meta object id for the '<em>Xpath Default Namespace Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3._2001.xml.schema.XpathDefaultNamespaceMember1
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathDefaultNamespaceMember1Object()
     * @generated
     */
    int XPATH_DEFAULT_NAMESPACE_MEMBER1_OBJECT = 122;

    /**
     * The meta object id for the '<em>Xpath Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathType()
     * @generated
     */
    int XPATH_TYPE = 123;

    /**
     * The meta object id for the '<em>Xpath Type1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathType1()
     * @generated
     */
    int XPATH_TYPE1 = 124;


    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.All <em>All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>All</em>'.
     * @see org.w3._2001.xml.schema.All
     * @generated
     */
    EClass getAll();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AltType <em>Alt Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Alt Type</em>'.
     * @see org.w3._2001.xml.schema.AltType
     * @generated
     */
    EClass getAltType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.AltType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.AltType#getSimpleType()
     * @see #getAltType()
     * @generated
     */
    EReference getAltType_SimpleType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.AltType#getComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.AltType#getComplexType()
     * @see #getAltType()
     * @generated
     */
    EReference getAltType_ComplexType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AltType#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test</em>'.
     * @see org.w3._2001.xml.schema.AltType#getTest()
     * @see #getAltType()
     * @generated
     */
    EAttribute getAltType_Test();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AltType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._2001.xml.schema.AltType#getType()
     * @see #getAltType()
     * @generated
     */
    EAttribute getAltType_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AltType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath Default Namespace</em>'.
     * @see org.w3._2001.xml.schema.AltType#getXpathDefaultNamespace()
     * @see #getAltType()
     * @generated
     */
    EAttribute getAltType_XpathDefaultNamespace();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Annotated <em>Annotated</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotated</em>'.
     * @see org.w3._2001.xml.schema.Annotated
     * @generated
     */
    EClass getAnnotated();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.Annotated#getAnnotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Annotation</em>'.
     * @see org.w3._2001.xml.schema.Annotated#getAnnotation()
     * @see #getAnnotated()
     * @generated
     */
    EReference getAnnotated_Annotation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Annotated#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.w3._2001.xml.schema.Annotated#getId()
     * @see #getAnnotated()
     * @generated
     */
    EAttribute getAnnotated_Id();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AnnotationType <em>Annotation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation Type</em>'.
     * @see org.w3._2001.xml.schema.AnnotationType
     * @generated
     */
    EClass getAnnotationType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.AnnotationType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.AnnotationType#getGroup()
     * @see #getAnnotationType()
     * @generated
     */
    EAttribute getAnnotationType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.AnnotationType#getAppinfo <em>Appinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Appinfo</em>'.
     * @see org.w3._2001.xml.schema.AnnotationType#getAppinfo()
     * @see #getAnnotationType()
     * @generated
     */
    EReference getAnnotationType_Appinfo();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.AnnotationType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.w3._2001.xml.schema.AnnotationType#getDocumentation()
     * @see #getAnnotationType()
     * @generated
     */
    EReference getAnnotationType_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AnnotationType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.w3._2001.xml.schema.AnnotationType#getId()
     * @see #getAnnotationType()
     * @generated
     */
    EAttribute getAnnotationType_Id();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AnyAttributeType <em>Any Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Attribute Type</em>'.
     * @see org.w3._2001.xml.schema.AnyAttributeType
     * @generated
     */
    EClass getAnyAttributeType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AnyAttributeType#getNotQName <em>Not QName</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Not QName</em>'.
     * @see org.w3._2001.xml.schema.AnyAttributeType#getNotQName()
     * @see #getAnyAttributeType()
     * @generated
     */
    EAttribute getAnyAttributeType_NotQName();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AnyType <em>Any Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Type</em>'.
     * @see org.w3._2001.xml.schema.AnyType
     * @generated
     */
    EClass getAnyType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AnyType#getMaxOccurs <em>Max Occurs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Occurs</em>'.
     * @see org.w3._2001.xml.schema.AnyType#getMaxOccurs()
     * @see #getAnyType()
     * @generated
     */
    EAttribute getAnyType_MaxOccurs();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AnyType#getMinOccurs <em>Min Occurs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Occurs</em>'.
     * @see org.w3._2001.xml.schema.AnyType#getMinOccurs()
     * @see #getAnyType()
     * @generated
     */
    EAttribute getAnyType_MinOccurs();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AnyType#getNotQName <em>Not QName</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Not QName</em>'.
     * @see org.w3._2001.xml.schema.AnyType#getNotQName()
     * @see #getAnyType()
     * @generated
     */
    EAttribute getAnyType_NotQName();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AppinfoType <em>Appinfo Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Appinfo Type</em>'.
     * @see org.w3._2001.xml.schema.AppinfoType
     * @generated
     */
    EClass getAppinfoType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.AppinfoType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.w3._2001.xml.schema.AppinfoType#getMixed()
     * @see #getAppinfoType()
     * @generated
     */
    EAttribute getAppinfoType_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.AppinfoType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.AppinfoType#getGroup()
     * @see #getAppinfoType()
     * @generated
     */
    EAttribute getAppinfoType_Group();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.AppinfoType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.AppinfoType#getAny()
     * @see #getAppinfoType()
     * @generated
     */
    EAttribute getAppinfoType_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AppinfoType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.w3._2001.xml.schema.AppinfoType#getSource()
     * @see #getAppinfoType()
     * @generated
     */
    EAttribute getAppinfoType_Source();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.AppinfoType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.w3._2001.xml.schema.AppinfoType#getAnyAttribute()
     * @see #getAppinfoType()
     * @generated
     */
    EAttribute getAppinfoType_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Assertion <em>Assertion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assertion</em>'.
     * @see org.w3._2001.xml.schema.Assertion
     * @generated
     */
    EClass getAssertion();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Assertion#getTest <em>Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test</em>'.
     * @see org.w3._2001.xml.schema.Assertion#getTest()
     * @see #getAssertion()
     * @generated
     */
    EAttribute getAssertion_Test();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Assertion#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath Default Namespace</em>'.
     * @see org.w3._2001.xml.schema.Assertion#getXpathDefaultNamespace()
     * @see #getAssertion()
     * @generated
     */
    EAttribute getAssertion_XpathDefaultNamespace();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.Attribute#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getSimpleType()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_SimpleType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getName()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getRef()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Ref();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getType()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getUse <em>Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getUse()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Use();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getDefault()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Default();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getFixed <em>Fixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getFixed()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Fixed();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getForm <em>Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Form</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getForm()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Form();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.w3._2001.xml.schema.Attribute#getTargetNamespace()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_TargetNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Attribute#isInheritable <em>Inheritable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inheritable</em>'.
     * @see org.w3._2001.xml.schema.Attribute#isInheritable()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Inheritable();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup
     * @generated
     */
    EClass getAttributeGroup();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.AttributeGroup#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup#getGroup()
     * @see #getAttributeGroup()
     * @generated
     */
    EAttribute getAttributeGroup_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.AttributeGroup#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup#getAttribute()
     * @see #getAttributeGroup()
     * @generated
     */
    EReference getAttributeGroup_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.AttributeGroup#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup#getAttributeGroup()
     * @see #getAttributeGroup()
     * @generated
     */
    EReference getAttributeGroup_AttributeGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.AttributeGroup#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup#getAnyAttribute1()
     * @see #getAttributeGroup()
     * @generated
     */
    EReference getAttributeGroup_AnyAttribute1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AttributeGroup#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup#getName()
     * @see #getAttributeGroup()
     * @generated
     */
    EAttribute getAttributeGroup_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.AttributeGroup#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroup#getRef()
     * @see #getAttributeGroup()
     * @generated
     */
    EAttribute getAttributeGroup_Ref();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.AttributeGroupRef <em>Attribute Group Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Group Ref</em>'.
     * @see org.w3._2001.xml.schema.AttributeGroupRef
     * @generated
     */
    EClass getAttributeGroupRef();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ComplexContentType <em>Complex Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Content Type</em>'.
     * @see org.w3._2001.xml.schema.ComplexContentType
     * @generated
     */
    EClass getComplexContentType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexContentType#getRestriction <em>Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Restriction</em>'.
     * @see org.w3._2001.xml.schema.ComplexContentType#getRestriction()
     * @see #getComplexContentType()
     * @generated
     */
    EReference getComplexContentType_Restriction();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexContentType#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extension</em>'.
     * @see org.w3._2001.xml.schema.ComplexContentType#getExtension()
     * @see #getComplexContentType()
     * @generated
     */
    EReference getComplexContentType_Extension();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexContentType#isMixed1 <em>Mixed1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mixed1</em>'.
     * @see org.w3._2001.xml.schema.ComplexContentType#isMixed1()
     * @see #getComplexContentType()
     * @generated
     */
    EAttribute getComplexContentType_Mixed1();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ComplexRestrictionType <em>Complex Restriction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Restriction Type</em>'.
     * @see org.w3._2001.xml.schema.ComplexRestrictionType
     * @generated
     */
    EClass getComplexRestrictionType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.ComplexType
     * @generated
     */
    EClass getComplexType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getSimpleContent <em>Simple Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Content</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getSimpleContent()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_SimpleContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getComplexContent <em>Complex Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Content</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getComplexContent()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_ComplexContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getOpenContent <em>Open Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Open Content</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getOpenContent()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_OpenContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getGroup()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_Group();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>All</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getAll()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_All();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getChoice <em>Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choice</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getChoice()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_Choice();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getSequence()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_Sequence();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.ComplexType#getGroup1 <em>Group1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group1</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getGroup1()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_Group1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.ComplexType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getAttribute()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.ComplexType#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getAttributeGroup()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_AttributeGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ComplexType#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getAnyAttribute1()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_AnyAttribute1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.ComplexType#getAssert <em>Assert</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assert</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getAssert()
     * @see #getComplexType()
     * @generated
     */
    EReference getComplexType_Assert();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getName()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexType#isMixed1 <em>Mixed1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mixed1</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#isMixed1()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_Mixed1();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexType#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#isAbstract()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_Abstract();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexType#getFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getFinal()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_Final();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexType#getBlock <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#getBlock()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_Block();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ComplexType#isDefaultAttributesApply <em>Default Attributes Apply</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Attributes Apply</em>'.
     * @see org.w3._2001.xml.schema.ComplexType#isDefaultAttributesApply()
     * @see #getComplexType()
     * @generated
     */
    EAttribute getComplexType_DefaultAttributesApply();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.DefaultOpenContentType <em>Default Open Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Default Open Content Type</em>'.
     * @see org.w3._2001.xml.schema.DefaultOpenContentType
     * @generated
     */
    EClass getDefaultOpenContentType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DefaultOpenContentType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.DefaultOpenContentType#getAny()
     * @see #getDefaultOpenContentType()
     * @generated
     */
    EReference getDefaultOpenContentType_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.DefaultOpenContentType#isAppliesToEmpty <em>Applies To Empty</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Applies To Empty</em>'.
     * @see org.w3._2001.xml.schema.DefaultOpenContentType#isAppliesToEmpty()
     * @see #getDefaultOpenContentType()
     * @generated
     */
    EAttribute getDefaultOpenContentType_AppliesToEmpty();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.DefaultOpenContentType#getMode <em>Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mode</em>'.
     * @see org.w3._2001.xml.schema.DefaultOpenContentType#getMode()
     * @see #getDefaultOpenContentType()
     * @generated
     */
    EAttribute getDefaultOpenContentType_Mode();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.DocumentationType <em>Documentation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation Type</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType
     * @generated
     */
    EClass getDocumentationType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.DocumentationType#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType#getMixed()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.DocumentationType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType#getGroup()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_Group();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.DocumentationType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType#getAny()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.DocumentationType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType#getSource()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_Source();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.DocumentationType#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType#getLang()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_Lang();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.DocumentationType#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.w3._2001.xml.schema.DocumentationType#getAnyAttribute()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.w3._2001.xml.schema.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.w3._2001.xml.schema.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>All</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAll()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_All();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAnnotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Annotation</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAnnotation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Annotation();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAny()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Any();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any Attribute</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAnyAttribute()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_AnyAttribute();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAppinfo <em>Appinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Appinfo</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAppinfo()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Appinfo();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAssertion <em>Assertion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Assertion</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAssertion()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Assertion();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getFacet <em>Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Facet</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getFacet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Facet();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAttribute()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Attribute();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getAttributeGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_AttributeGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getChoice <em>Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choice</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getChoice()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Choice();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getComplexContent <em>Complex Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Content</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getComplexContent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ComplexContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getComplexType()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ComplexType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getDefaultOpenContent <em>Default Open Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Open Content</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getDefaultOpenContent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DefaultOpenContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getDocumentation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Element();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Enumeration</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getEnumeration()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Enumeration();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getExplicitTimezone <em>Explicit Timezone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Explicit Timezone</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getExplicitTimezone()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ExplicitTimezone();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Field</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getField()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Field();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getFractionDigits <em>Fraction Digits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Fraction Digits</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getFractionDigits()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FractionDigits();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Group();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getImport()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Import();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Include</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getInclude()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Include();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Key</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getKey()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Key();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getKeyref <em>Keyref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Keyref</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getKeyref()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Keyref();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Length</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getLength()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Length();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getList <em>List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>List</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getList()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_List();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getMaxExclusive <em>Max Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Max Exclusive</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMaxExclusive()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MaxExclusive();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getMaxInclusive <em>Max Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Max Inclusive</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMaxInclusive()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MaxInclusive();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Max Length</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMaxLength()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MaxLength();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getMinExclusive <em>Min Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Min Exclusive</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMinExclusive()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MinExclusive();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getMinInclusive <em>Min Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Min Inclusive</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMinInclusive()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MinInclusive();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getMinLength <em>Min Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Min Length</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getMinLength()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MinLength();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getNotation <em>Notation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Notation</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getNotation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Notation();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getOpenContent <em>Open Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Open Content</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getOpenContent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OpenContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getOverride <em>Override</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Override</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getOverride()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Override();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Pattern</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getPattern()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Pattern();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getRedefine <em>Redefine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Redefine</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getRedefine()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Redefine();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getRestriction <em>Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Restriction</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getRestriction()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Restriction();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Schema</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getSchema()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Schema();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Selector</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getSelector()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Selector();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getSequence()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Sequence();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getSimpleContent <em>Simple Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Content</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getSimpleContent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SimpleContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getSimpleType()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SimpleType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getTotalDigits <em>Total Digits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Total Digits</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getTotalDigits()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TotalDigits();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getUnion <em>Union</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Union</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getUnion()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Union();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getUnique <em>Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Unique</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getUnique()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Unique();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.DocumentRoot#getWhiteSpace <em>White Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>White Space</em>'.
     * @see org.w3._2001.xml.schema.DocumentRoot#getWhiteSpace()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WhiteSpace();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.w3._2001.xml.schema.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.Element#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.Element#getSimpleType()
     * @see #getElement()
     * @generated
     */
    EReference getElement_SimpleType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.Element#getComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.Element#getComplexType()
     * @see #getElement()
     * @generated
     */
    EReference getElement_ComplexType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Element#getAlternative <em>Alternative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Alternative</em>'.
     * @see org.w3._2001.xml.schema.Element#getAlternative()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Alternative();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.Element#getIdentityConstraint <em>Identity Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Identity Constraint</em>'.
     * @see org.w3._2001.xml.schema.Element#getIdentityConstraint()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_IdentityConstraint();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Element#getUnique <em>Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Unique</em>'.
     * @see org.w3._2001.xml.schema.Element#getUnique()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Unique();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Element#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Key</em>'.
     * @see org.w3._2001.xml.schema.Element#getKey()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Key();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Element#getKeyref <em>Keyref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Keyref</em>'.
     * @see org.w3._2001.xml.schema.Element#getKeyref()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Keyref();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.Element#getName()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see org.w3._2001.xml.schema.Element#getRef()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Ref();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.w3._2001.xml.schema.Element#getType()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Type();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getMinOccurs <em>Min Occurs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Occurs</em>'.
     * @see org.w3._2001.xml.schema.Element#getMinOccurs()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_MinOccurs();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getMaxOccurs <em>Max Occurs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Occurs</em>'.
     * @see org.w3._2001.xml.schema.Element#getMaxOccurs()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_MaxOccurs();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getSubstitutionGroup <em>Substitution Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Substitution Group</em>'.
     * @see org.w3._2001.xml.schema.Element#getSubstitutionGroup()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_SubstitutionGroup();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.w3._2001.xml.schema.Element#getDefault()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Default();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getFixed <em>Fixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed</em>'.
     * @see org.w3._2001.xml.schema.Element#getFixed()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Fixed();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#isNillable <em>Nillable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nillable</em>'.
     * @see org.w3._2001.xml.schema.Element#isNillable()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Nillable();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see org.w3._2001.xml.schema.Element#isAbstract()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Abstract();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see org.w3._2001.xml.schema.Element#getFinal()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Final();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getBlock <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block</em>'.
     * @see org.w3._2001.xml.schema.Element#getBlock()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Block();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getForm <em>Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Form</em>'.
     * @see org.w3._2001.xml.schema.Element#getForm()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Form();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Element#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.w3._2001.xml.schema.Element#getTargetNamespace()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_TargetNamespace();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ExplicitGroup <em>Explicit Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Explicit Group</em>'.
     * @see org.w3._2001.xml.schema.ExplicitGroup
     * @generated
     */
    EClass getExplicitGroup();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ExplicitTimezoneType <em>Explicit Timezone Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Explicit Timezone Type</em>'.
     * @see org.w3._2001.xml.schema.ExplicitTimezoneType
     * @generated
     */
    EClass getExplicitTimezoneType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ExtensionType <em>Extension Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extension Type</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType
     * @generated
     */
    EClass getExtensionType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ExtensionType#getOpenContent <em>Open Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Open Content</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getOpenContent()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_OpenContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ExtensionType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getGroup()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_Group();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ExtensionType#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>All</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getAll()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_All();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ExtensionType#getChoice <em>Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choice</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getChoice()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_Choice();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ExtensionType#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getSequence()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_Sequence();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.ExtensionType#getGroup1 <em>Group1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group1</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getGroup1()
     * @see #getExtensionType()
     * @generated
     */
    EAttribute getExtensionType_Group1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.ExtensionType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getAttribute()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.ExtensionType#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getAttributeGroup()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_AttributeGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ExtensionType#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getAnyAttribute1()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_AnyAttribute1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.ExtensionType#getAssert <em>Assert</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assert</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getAssert()
     * @see #getExtensionType()
     * @generated
     */
    EReference getExtensionType_Assert();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ExtensionType#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base</em>'.
     * @see org.w3._2001.xml.schema.ExtensionType#getBase()
     * @see #getExtensionType()
     * @generated
     */
    EAttribute getExtensionType_Base();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Facet <em>Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Facet</em>'.
     * @see org.w3._2001.xml.schema.Facet
     * @generated
     */
    EClass getFacet();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Facet#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.w3._2001.xml.schema.Facet#getValue()
     * @see #getFacet()
     * @generated
     */
    EAttribute getFacet_Value();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Facet#isFixed <em>Fixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed</em>'.
     * @see org.w3._2001.xml.schema.Facet#isFixed()
     * @see #getFacet()
     * @generated
     */
    EAttribute getFacet_Fixed();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.FieldType <em>Field Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Field Type</em>'.
     * @see org.w3._2001.xml.schema.FieldType
     * @generated
     */
    EClass getFieldType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.FieldType#getXpath <em>Xpath</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath</em>'.
     * @see org.w3._2001.xml.schema.FieldType#getXpath()
     * @see #getFieldType()
     * @generated
     */
    EAttribute getFieldType_Xpath();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.FieldType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath Default Namespace</em>'.
     * @see org.w3._2001.xml.schema.FieldType#getXpathDefaultNamespace()
     * @see #getFieldType()
     * @generated
     */
    EAttribute getFieldType_XpathDefaultNamespace();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.Group
     * @generated
     */
    EClass getGroup();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.Group#getParticle <em>Particle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Particle</em>'.
     * @see org.w3._2001.xml.schema.Group#getParticle()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_Particle();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Group#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element</em>'.
     * @see org.w3._2001.xml.schema.Group#getElement()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Element();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Group#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.Group#getGroup()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Group#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>All</em>'.
     * @see org.w3._2001.xml.schema.Group#getAll()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_All();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Group#getChoice <em>Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Choice</em>'.
     * @see org.w3._2001.xml.schema.Group#getChoice()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Choice();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Group#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sequence</em>'.
     * @see org.w3._2001.xml.schema.Group#getSequence()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Sequence();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Group#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.Group#getAny()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Group#getMaxOccurs <em>Max Occurs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Occurs</em>'.
     * @see org.w3._2001.xml.schema.Group#getMaxOccurs()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_MaxOccurs();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Group#getMinOccurs <em>Min Occurs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Occurs</em>'.
     * @see org.w3._2001.xml.schema.Group#getMinOccurs()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_MinOccurs();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Group#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.Group#getName()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Group#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see org.w3._2001.xml.schema.Group#getRef()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_Ref();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.GroupRef <em>Group Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group Ref</em>'.
     * @see org.w3._2001.xml.schema.GroupRef
     * @generated
     */
    EClass getGroupRef();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import Type</em>'.
     * @see org.w3._2001.xml.schema.ImportType
     * @generated
     */
    EClass getImportType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ImportType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.w3._2001.xml.schema.ImportType#getNamespace()
     * @see #getImportType()
     * @generated
     */
    EAttribute getImportType_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ImportType#getSchemaLocation <em>Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Location</em>'.
     * @see org.w3._2001.xml.schema.ImportType#getSchemaLocation()
     * @see #getImportType()
     * @generated
     */
    EAttribute getImportType_SchemaLocation();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.IncludeType <em>Include Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Include Type</em>'.
     * @see org.w3._2001.xml.schema.IncludeType
     * @generated
     */
    EClass getIncludeType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.IncludeType#getSchemaLocation <em>Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Location</em>'.
     * @see org.w3._2001.xml.schema.IncludeType#getSchemaLocation()
     * @see #getIncludeType()
     * @generated
     */
    EAttribute getIncludeType_SchemaLocation();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.IntFacet <em>Int Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int Facet</em>'.
     * @see org.w3._2001.xml.schema.IntFacet
     * @generated
     */
    EClass getIntFacet();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Keybase <em>Keybase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Keybase</em>'.
     * @see org.w3._2001.xml.schema.Keybase
     * @generated
     */
    EClass getKeybase();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.Keybase#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Selector</em>'.
     * @see org.w3._2001.xml.schema.Keybase#getSelector()
     * @see #getKeybase()
     * @generated
     */
    EReference getKeybase_Selector();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.Keybase#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Field</em>'.
     * @see org.w3._2001.xml.schema.Keybase#getField()
     * @see #getKeybase()
     * @generated
     */
    EReference getKeybase_Field();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Keybase#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.Keybase#getName()
     * @see #getKeybase()
     * @generated
     */
    EAttribute getKeybase_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Keybase#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see org.w3._2001.xml.schema.Keybase#getRef()
     * @see #getKeybase()
     * @generated
     */
    EAttribute getKeybase_Ref();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.KeyrefType <em>Keyref Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Keyref Type</em>'.
     * @see org.w3._2001.xml.schema.KeyrefType
     * @generated
     */
    EClass getKeyrefType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.KeyrefType#getRefer <em>Refer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Refer</em>'.
     * @see org.w3._2001.xml.schema.KeyrefType#getRefer()
     * @see #getKeyrefType()
     * @generated
     */
    EAttribute getKeyrefType_Refer();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.ListType <em>List Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>List Type</em>'.
     * @see org.w3._2001.xml.schema.ListType
     * @generated
     */
    EClass getListType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.ListType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.ListType#getSimpleType()
     * @see #getListType()
     * @generated
     */
    EReference getListType_SimpleType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.ListType#getItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Type</em>'.
     * @see org.w3._2001.xml.schema.ListType#getItemType()
     * @see #getListType()
     * @generated
     */
    EAttribute getListType_ItemType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.LocalComplexType <em>Local Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Complex Type</em>'.
     * @see org.w3._2001.xml.schema.LocalComplexType
     * @generated
     */
    EClass getLocalComplexType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.LocalElement <em>Local Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Element</em>'.
     * @see org.w3._2001.xml.schema.LocalElement
     * @generated
     */
    EClass getLocalElement();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.LocalSimpleType <em>Local Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Simple Type</em>'.
     * @see org.w3._2001.xml.schema.LocalSimpleType
     * @generated
     */
    EClass getLocalSimpleType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.NamedAttributeGroup <em>Named Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.NamedAttributeGroup
     * @generated
     */
    EClass getNamedAttributeGroup();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.NamedGroup <em>Named Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Group</em>'.
     * @see org.w3._2001.xml.schema.NamedGroup
     * @generated
     */
    EClass getNamedGroup();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.NoFixedFacet <em>No Fixed Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>No Fixed Facet</em>'.
     * @see org.w3._2001.xml.schema.NoFixedFacet
     * @generated
     */
    EClass getNoFixedFacet();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.NotationType <em>Notation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Notation Type</em>'.
     * @see org.w3._2001.xml.schema.NotationType
     * @generated
     */
    EClass getNotationType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.NotationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.NotationType#getName()
     * @see #getNotationType()
     * @generated
     */
    EAttribute getNotationType_Name();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.NotationType#getPublic <em>Public</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Public</em>'.
     * @see org.w3._2001.xml.schema.NotationType#getPublic()
     * @see #getNotationType()
     * @generated
     */
    EAttribute getNotationType_Public();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.NotationType#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System</em>'.
     * @see org.w3._2001.xml.schema.NotationType#getSystem()
     * @see #getNotationType()
     * @generated
     */
    EAttribute getNotationType_System();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.NumFacet <em>Num Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Num Facet</em>'.
     * @see org.w3._2001.xml.schema.NumFacet
     * @generated
     */
    EClass getNumFacet();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.OpenAttrs <em>Open Attrs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Open Attrs</em>'.
     * @see org.w3._2001.xml.schema.OpenAttrs
     * @generated
     */
    EClass getOpenAttrs();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.OpenAttrs#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.w3._2001.xml.schema.OpenAttrs#getMixed()
     * @see #getOpenAttrs()
     * @generated
     */
    EAttribute getOpenAttrs_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.OpenAttrs#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.w3._2001.xml.schema.OpenAttrs#getAnyAttribute()
     * @see #getOpenAttrs()
     * @generated
     */
    EAttribute getOpenAttrs_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.OpenContentType <em>Open Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Open Content Type</em>'.
     * @see org.w3._2001.xml.schema.OpenContentType
     * @generated
     */
    EClass getOpenContentType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.OpenContentType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.OpenContentType#getAny()
     * @see #getOpenContentType()
     * @generated
     */
    EReference getOpenContentType_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.OpenContentType#getMode <em>Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mode</em>'.
     * @see org.w3._2001.xml.schema.OpenContentType#getMode()
     * @see #getOpenContentType()
     * @generated
     */
    EAttribute getOpenContentType_Mode();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.OverrideType <em>Override Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Override Type</em>'.
     * @see org.w3._2001.xml.schema.OverrideType
     * @generated
     */
    EClass getOverrideType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.OverrideType#getAnnotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Annotation</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getAnnotation()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_Annotation();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.OverrideType#getSchemaTop <em>Schema Top</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Schema Top</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getSchemaTop()
     * @see #getOverrideType()
     * @generated
     */
    EAttribute getOverrideType_SchemaTop();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getSimpleType()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_SimpleType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getComplexType()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_ComplexType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getGroup()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getAttributeGroup()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_AttributeGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getElement()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_Element();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getAttribute()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.OverrideType#getNotation <em>Notation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Notation</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getNotation()
     * @see #getOverrideType()
     * @generated
     */
    EReference getOverrideType_Notation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.OverrideType#getSchemaLocation <em>Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Location</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getSchemaLocation()
     * @see #getOverrideType()
     * @generated
     */
    EAttribute getOverrideType_SchemaLocation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.OverrideType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.w3._2001.xml.schema.OverrideType#getId()
     * @see #getOverrideType()
     * @generated
     */
    EAttribute getOverrideType_Id();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.PatternType <em>Pattern Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern Type</em>'.
     * @see org.w3._2001.xml.schema.PatternType
     * @generated
     */
    EClass getPatternType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.RealGroup <em>Real Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Real Group</em>'.
     * @see org.w3._2001.xml.schema.RealGroup
     * @generated
     */
    EClass getRealGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RealGroup#getAll1 <em>All1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>All1</em>'.
     * @see org.w3._2001.xml.schema.RealGroup#getAll1()
     * @see #getRealGroup()
     * @generated
     */
    EReference getRealGroup_All1();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RealGroup#getChoice1 <em>Choice1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choice1</em>'.
     * @see org.w3._2001.xml.schema.RealGroup#getChoice1()
     * @see #getRealGroup()
     * @generated
     */
    EReference getRealGroup_Choice1();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RealGroup#getSequence1 <em>Sequence1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence1</em>'.
     * @see org.w3._2001.xml.schema.RealGroup#getSequence1()
     * @see #getRealGroup()
     * @generated
     */
    EReference getRealGroup_Sequence1();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.RedefineType <em>Redefine Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Redefine Type</em>'.
     * @see org.w3._2001.xml.schema.RedefineType
     * @generated
     */
    EClass getRedefineType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RedefineType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getGroup()
     * @see #getRedefineType()
     * @generated
     */
    EAttribute getRedefineType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RedefineType#getAnnotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotation</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getAnnotation()
     * @see #getRedefineType()
     * @generated
     */
    EReference getRedefineType_Annotation();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RedefineType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getSimpleType()
     * @see #getRedefineType()
     * @generated
     */
    EReference getRedefineType_SimpleType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RedefineType#getComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getComplexType()
     * @see #getRedefineType()
     * @generated
     */
    EReference getRedefineType_ComplexType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RedefineType#getGroup1 <em>Group1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group1</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getGroup1()
     * @see #getRedefineType()
     * @generated
     */
    EReference getRedefineType_Group1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RedefineType#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getAttributeGroup()
     * @see #getRedefineType()
     * @generated
     */
    EReference getRedefineType_AttributeGroup();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.RedefineType#getSchemaLocation <em>Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Location</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getSchemaLocation()
     * @see #getRedefineType()
     * @generated
     */
    EAttribute getRedefineType_SchemaLocation();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.RedefineType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.w3._2001.xml.schema.RedefineType#getId()
     * @see #getRedefineType()
     * @generated
     */
    EAttribute getRedefineType_Id();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.RestrictionType <em>Restriction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Type</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType
     * @generated
     */
    EClass getRestrictionType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getOpenContent <em>Open Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Open Content</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getOpenContent()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_OpenContent();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getGroup()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_Group();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getAll <em>All</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>All</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getAll()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_All();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getChoice <em>Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choice</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getChoice()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_Choice();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getSequence()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_Sequence();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getSimpleType()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_SimpleType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType#getGroup1 <em>Group1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group1</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getGroup1()
     * @see #getRestrictionType()
     * @generated
     */
    EAttribute getRestrictionType_Group1();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType#getFacetGroup <em>Facet Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Facet Group</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getFacetGroup()
     * @see #getRestrictionType()
     * @generated
     */
    EAttribute getRestrictionType_FacetGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RestrictionType#getFacet <em>Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Facet</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getFacet()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_Facet();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getAny()
     * @see #getRestrictionType()
     * @generated
     */
    EAttribute getRestrictionType_Any();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType#getGroup2 <em>Group2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group2</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getGroup2()
     * @see #getRestrictionType()
     * @generated
     */
    EAttribute getRestrictionType_Group2();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RestrictionType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getAttribute()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RestrictionType#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getAttributeGroup()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_AttributeGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType#getAnyAttribute1 <em>Any Attribute1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Any Attribute1</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getAnyAttribute1()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_AnyAttribute1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RestrictionType#getAssert <em>Assert</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assert</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getAssert()
     * @see #getRestrictionType()
     * @generated
     */
    EReference getRestrictionType_Assert();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.RestrictionType#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType#getBase()
     * @see #getRestrictionType()
     * @generated
     */
    EAttribute getRestrictionType_Base();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.RestrictionType1 <em>Restriction Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction Type1</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1
     * @generated
     */
    EClass getRestrictionType1();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.RestrictionType1#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1#getSimpleType()
     * @see #getRestrictionType1()
     * @generated
     */
    EReference getRestrictionType1_SimpleType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType1#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1#getGroup()
     * @see #getRestrictionType1()
     * @generated
     */
    EAttribute getRestrictionType1_Group();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType1#getFacetGroup <em>Facet Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Facet Group</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1#getFacetGroup()
     * @see #getRestrictionType1()
     * @generated
     */
    EAttribute getRestrictionType1_FacetGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.RestrictionType1#getFacet <em>Facet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Facet</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1#getFacet()
     * @see #getRestrictionType1()
     * @generated
     */
    EReference getRestrictionType1_Facet();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.RestrictionType1#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1#getAny()
     * @see #getRestrictionType1()
     * @generated
     */
    EAttribute getRestrictionType1_Any();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.RestrictionType1#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base</em>'.
     * @see org.w3._2001.xml.schema.RestrictionType1#getBase()
     * @see #getRestrictionType1()
     * @generated
     */
    EAttribute getRestrictionType1_Base();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SchemaType <em>Schema Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema Type</em>'.
     * @see org.w3._2001.xml.schema.SchemaType
     * @generated
     */
    EClass getSchemaType();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.SchemaType#getComposition <em>Composition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Composition</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getComposition()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_Composition();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getInclude <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Include</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getInclude()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Include();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Import</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getImport()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Import();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getRedefine <em>Redefine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Redefine</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getRedefine()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Redefine();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getOverride <em>Override</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Override</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getOverride()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Override();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getAnnotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotation</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getAnnotation()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Annotation();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.SchemaType#getDefaultOpenContent <em>Default Open Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Open Content</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getDefaultOpenContent()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_DefaultOpenContent();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getAnnotation1 <em>Annotation1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotation1</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getAnnotation1()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Annotation1();

    /**
     * Returns the meta object for the attribute list '{@link org.w3._2001.xml.schema.SchemaType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getGroup()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getSimpleType()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_SimpleType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Complex Type</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getComplexType()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_ComplexType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getGroup1 <em>Group1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group1</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getGroup1()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Group1();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getAttributeGroup <em>Attribute Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getAttributeGroup()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_AttributeGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getElement()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Element();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getAttribute()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getNotation <em>Notation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Notation</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getNotation()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Notation();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.SchemaType#getAnnotation2 <em>Annotation2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotation2</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getAnnotation2()
     * @see #getSchemaType()
     * @generated
     */
    EReference getSchemaType_Annotation2();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getTargetNamespace()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_TargetNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getVersion()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_Version();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getFinalDefault <em>Final Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final Default</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getFinalDefault()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_FinalDefault();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getBlockDefault <em>Block Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block Default</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getBlockDefault()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_BlockDefault();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getAttributeFormDefault <em>Attribute Form Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute Form Default</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getAttributeFormDefault()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_AttributeFormDefault();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getElementFormDefault <em>Element Form Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Form Default</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getElementFormDefault()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_ElementFormDefault();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getDefaultAttributes <em>Default Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Attributes</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getDefaultAttributes()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_DefaultAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath Default Namespace</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getXpathDefaultNamespace()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_XpathDefaultNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getId()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_Id();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SchemaType#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see org.w3._2001.xml.schema.SchemaType#getLang()
     * @see #getSchemaType()
     * @generated
     */
    EAttribute getSchemaType_Lang();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SelectorType <em>Selector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Selector Type</em>'.
     * @see org.w3._2001.xml.schema.SelectorType
     * @generated
     */
    EClass getSelectorType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SelectorType#getXpath <em>Xpath</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath</em>'.
     * @see org.w3._2001.xml.schema.SelectorType#getXpath()
     * @see #getSelectorType()
     * @generated
     */
    EAttribute getSelectorType_Xpath();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SelectorType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpath Default Namespace</em>'.
     * @see org.w3._2001.xml.schema.SelectorType#getXpathDefaultNamespace()
     * @see #getSelectorType()
     * @generated
     */
    EAttribute getSelectorType_XpathDefaultNamespace();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SimpleContentType <em>Simple Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Content Type</em>'.
     * @see org.w3._2001.xml.schema.SimpleContentType
     * @generated
     */
    EClass getSimpleContentType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.SimpleContentType#getRestriction <em>Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Restriction</em>'.
     * @see org.w3._2001.xml.schema.SimpleContentType#getRestriction()
     * @see #getSimpleContentType()
     * @generated
     */
    EReference getSimpleContentType_Restriction();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.SimpleContentType#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extension</em>'.
     * @see org.w3._2001.xml.schema.SimpleContentType#getExtension()
     * @see #getSimpleContentType()
     * @generated
     */
    EReference getSimpleContentType_Extension();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SimpleExplicitGroup <em>Simple Explicit Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Explicit Group</em>'.
     * @see org.w3._2001.xml.schema.SimpleExplicitGroup
     * @generated
     */
    EClass getSimpleExplicitGroup();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SimpleExtensionType <em>Simple Extension Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Extension Type</em>'.
     * @see org.w3._2001.xml.schema.SimpleExtensionType
     * @generated
     */
    EClass getSimpleExtensionType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SimpleRestrictionType <em>Simple Restriction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Restriction Type</em>'.
     * @see org.w3._2001.xml.schema.SimpleRestrictionType
     * @generated
     */
    EClass getSimpleRestrictionType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.SimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.SimpleType
     * @generated
     */
    EClass getSimpleType();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.SimpleType#getRestriction <em>Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Restriction</em>'.
     * @see org.w3._2001.xml.schema.SimpleType#getRestriction()
     * @see #getSimpleType()
     * @generated
     */
    EReference getSimpleType_Restriction();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.SimpleType#getList <em>List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>List</em>'.
     * @see org.w3._2001.xml.schema.SimpleType#getList()
     * @see #getSimpleType()
     * @generated
     */
    EReference getSimpleType_List();

    /**
     * Returns the meta object for the containment reference '{@link org.w3._2001.xml.schema.SimpleType#getUnion <em>Union</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Union</em>'.
     * @see org.w3._2001.xml.schema.SimpleType#getUnion()
     * @see #getSimpleType()
     * @generated
     */
    EReference getSimpleType_Union();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SimpleType#getFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see org.w3._2001.xml.schema.SimpleType#getFinal()
     * @see #getSimpleType()
     * @generated
     */
    EAttribute getSimpleType_Final();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.SimpleType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.w3._2001.xml.schema.SimpleType#getName()
     * @see #getSimpleType()
     * @generated
     */
    EAttribute getSimpleType_Name();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.TopLevelAttribute <em>Top Level Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Top Level Attribute</em>'.
     * @see org.w3._2001.xml.schema.TopLevelAttribute
     * @generated
     */
    EClass getTopLevelAttribute();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.TopLevelComplexType <em>Top Level Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Top Level Complex Type</em>'.
     * @see org.w3._2001.xml.schema.TopLevelComplexType
     * @generated
     */
    EClass getTopLevelComplexType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.TopLevelElement <em>Top Level Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Top Level Element</em>'.
     * @see org.w3._2001.xml.schema.TopLevelElement
     * @generated
     */
    EClass getTopLevelElement();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.TopLevelSimpleType <em>Top Level Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Top Level Simple Type</em>'.
     * @see org.w3._2001.xml.schema.TopLevelSimpleType
     * @generated
     */
    EClass getTopLevelSimpleType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.TotalDigitsType <em>Total Digits Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Total Digits Type</em>'.
     * @see org.w3._2001.xml.schema.TotalDigitsType
     * @generated
     */
    EClass getTotalDigitsType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.UnionType <em>Union Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Union Type</em>'.
     * @see org.w3._2001.xml.schema.UnionType
     * @generated
     */
    EClass getUnionType();

    /**
     * Returns the meta object for the containment reference list '{@link org.w3._2001.xml.schema.UnionType#getSimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Simple Type</em>'.
     * @see org.w3._2001.xml.schema.UnionType#getSimpleType()
     * @see #getUnionType()
     * @generated
     */
    EReference getUnionType_SimpleType();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.UnionType#getMemberTypes <em>Member Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Member Types</em>'.
     * @see org.w3._2001.xml.schema.UnionType#getMemberTypes()
     * @see #getUnionType()
     * @generated
     */
    EAttribute getUnionType_MemberTypes();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.WhiteSpaceType <em>White Space Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>White Space Type</em>'.
     * @see org.w3._2001.xml.schema.WhiteSpaceType
     * @generated
     */
    EClass getWhiteSpaceType();

    /**
     * Returns the meta object for class '{@link org.w3._2001.xml.schema.Wildcard <em>Wildcard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wildcard</em>'.
     * @see org.w3._2001.xml.schema.Wildcard
     * @generated
     */
    EClass getWildcard();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Wildcard#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.w3._2001.xml.schema.Wildcard#getNamespace()
     * @see #getWildcard()
     * @generated
     */
    EAttribute getWildcard_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Wildcard#getNotNamespace <em>Not Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Not Namespace</em>'.
     * @see org.w3._2001.xml.schema.Wildcard#getNotNamespace()
     * @see #getWildcard()
     * @generated
     */
    EAttribute getWildcard_NotNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.w3._2001.xml.schema.Wildcard#getProcessContents <em>Process Contents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Contents</em>'.
     * @see org.w3._2001.xml.schema.Wildcard#getProcessContents()
     * @see #getWildcard()
     * @generated
     */
    EAttribute getWildcard_ProcessContents();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.AllNNIMember1 <em>All NNI Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>All NNI Member1</em>'.
     * @see org.w3._2001.xml.schema.AllNNIMember1
     * @generated
     */
    EEnum getAllNNIMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.BasicNamespaceListItemMember1 <em>Basic Namespace List Item Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Basic Namespace List Item Member1</em>'.
     * @see org.w3._2001.xml.schema.BasicNamespaceListItemMember1
     * @generated
     */
    EEnum getBasicNamespaceListItemMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.BlockSetMember0 <em>Block Set Member0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Block Set Member0</em>'.
     * @see org.w3._2001.xml.schema.BlockSetMember0
     * @generated
     */
    EEnum getBlockSetMember0();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.BlockSetMember1Item <em>Block Set Member1 Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Block Set Member1 Item</em>'.
     * @see org.w3._2001.xml.schema.BlockSetMember1Item
     * @generated
     */
    EEnum getBlockSetMember1Item();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.DerivationControl <em>Derivation Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Derivation Control</em>'.
     * @see org.w3._2001.xml.schema.DerivationControl
     * @generated
     */
    EEnum getDerivationControl();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.DerivationSetMember0 <em>Derivation Set Member0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Derivation Set Member0</em>'.
     * @see org.w3._2001.xml.schema.DerivationSetMember0
     * @generated
     */
    EEnum getDerivationSetMember0();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.FormChoice <em>Form Choice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Form Choice</em>'.
     * @see org.w3._2001.xml.schema.FormChoice
     * @generated
     */
    EEnum getFormChoice();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.FullDerivationSetMember0 <em>Full Derivation Set Member0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Full Derivation Set Member0</em>'.
     * @see org.w3._2001.xml.schema.FullDerivationSetMember0
     * @generated
     */
    EEnum getFullDerivationSetMember0();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.ModeType <em>Mode Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Mode Type</em>'.
     * @see org.w3._2001.xml.schema.ModeType
     * @generated
     */
    EEnum getModeType();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.ModeType1 <em>Mode Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Mode Type1</em>'.
     * @see org.w3._2001.xml.schema.ModeType1
     * @generated
     */
    EEnum getModeType1();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.ProcessContentsType <em>Process Contents Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Process Contents Type</em>'.
     * @see org.w3._2001.xml.schema.ProcessContentsType
     * @generated
     */
    EEnum getProcessContentsType();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.QnameListAItemMember1 <em>Qname List AItem Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Qname List AItem Member1</em>'.
     * @see org.w3._2001.xml.schema.QnameListAItemMember1
     * @generated
     */
    EEnum getQnameListAItemMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.QnameListItemMember1 <em>Qname List Item Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Qname List Item Member1</em>'.
     * @see org.w3._2001.xml.schema.QnameListItemMember1
     * @generated
     */
    EEnum getQnameListItemMember1();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.ReducedDerivationControl <em>Reduced Derivation Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Reduced Derivation Control</em>'.
     * @see org.w3._2001.xml.schema.ReducedDerivationControl
     * @generated
     */
    EEnum getReducedDerivationControl();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Simple Derivation Set Member0</em>'.
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember0
     * @generated
     */
    EEnum getSimpleDerivationSetMember0();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Simple Derivation Set Member1 Item</em>'.
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember1Item
     * @generated
     */
    EEnum getSimpleDerivationSetMember1Item();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.SpecialNamespaceList <em>Special Namespace List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Special Namespace List</em>'.
     * @see org.w3._2001.xml.schema.SpecialNamespaceList
     * @generated
     */
    EEnum getSpecialNamespaceList();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.TypeDerivationControl <em>Type Derivation Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type Derivation Control</em>'.
     * @see org.w3._2001.xml.schema.TypeDerivationControl
     * @generated
     */
    EEnum getTypeDerivationControl();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.UseType <em>Use Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Use Type</em>'.
     * @see org.w3._2001.xml.schema.UseType
     * @generated
     */
    EEnum getUseType();

    /**
     * Returns the meta object for enum '{@link org.w3._2001.xml.schema.XpathDefaultNamespaceMember1 <em>Xpath Default Namespace Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Xpath Default Namespace Member1</em>'.
     * @see org.w3._2001.xml.schema.XpathDefaultNamespaceMember1
     * @generated
     */
    EEnum getXpathDefaultNamespaceMember1();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>All NNI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>All NNI</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='allNNI' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger allNNI_._member_._1'"
     * @generated
     */
    EDataType getAllNNI();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.AllNNIMember1 <em>All NNI Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>All NNI Member1 Object</em>'.
     * @see org.w3._2001.xml.schema.AllNNIMember1
     * @model instanceClass="org.w3._2001.xml.schema.AllNNIMember1"
     *        extendedMetaData="name='allNNI_._member_._1:Object' baseType='allNNI_._member_._1'"
     * @generated
     */
    EDataType getAllNNIMember1Object();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Basic Namespace List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Basic Namespace List</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='basicNamespaceList' itemType='basicNamespaceList_._item'"
     * @generated
     */
    EDataType getBasicNamespaceList();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Basic Namespace List Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Basic Namespace List Item</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='basicNamespaceList_._item' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI basicNamespaceList_._item_._member_._1'"
     * @generated
     */
    EDataType getBasicNamespaceListItem();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.BasicNamespaceListItemMember1 <em>Basic Namespace List Item Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Basic Namespace List Item Member1 Object</em>'.
     * @see org.w3._2001.xml.schema.BasicNamespaceListItemMember1
     * @model instanceClass="org.w3._2001.xml.schema.BasicNamespaceListItemMember1"
     *        extendedMetaData="name='basicNamespaceList_._item_._member_._1:Object' baseType='basicNamespaceList_._item_._member_._1'"
     * @generated
     */
    EDataType getBasicNamespaceListItemMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Block Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Block Set</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='blockSet' memberTypes='blockSet_._member_._0 blockSet_._member_._1'"
     * @generated
     */
    EDataType getBlockSet();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.BlockSetMember0 <em>Block Set Member0 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Block Set Member0 Object</em>'.
     * @see org.w3._2001.xml.schema.BlockSetMember0
     * @model instanceClass="org.w3._2001.xml.schema.BlockSetMember0"
     *        extendedMetaData="name='blockSet_._member_._0:Object' baseType='blockSet_._member_._0'"
     * @generated
     */
    EDataType getBlockSetMember0Object();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Block Set Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Block Set Member1</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='blockSet_._member_._1' itemType='blockSet_._member_._1_._item'"
     * @generated
     */
    EDataType getBlockSetMember1();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.BlockSetMember1Item <em>Block Set Member1 Item Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Block Set Member1 Item Object</em>'.
     * @see org.w3._2001.xml.schema.BlockSetMember1Item
     * @model instanceClass="org.w3._2001.xml.schema.BlockSetMember1Item"
     *        extendedMetaData="name='blockSet_._member_._1_._item:Object' baseType='blockSet_._member_._1_._item'"
     * @generated
     */
    EDataType getBlockSetMember1ItemObject();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.DerivationControl <em>Derivation Control Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Derivation Control Object</em>'.
     * @see org.w3._2001.xml.schema.DerivationControl
     * @model instanceClass="org.w3._2001.xml.schema.DerivationControl"
     *        extendedMetaData="name='derivationControl:Object' baseType='derivationControl'"
     * @generated
     */
    EDataType getDerivationControlObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Derivation Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Derivation Set</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='derivationSet' memberTypes='derivationSet_._member_._0 derivationSet_._member_._1'"
     * @generated
     */
    EDataType getDerivationSet();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.DerivationSetMember0 <em>Derivation Set Member0 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Derivation Set Member0 Object</em>'.
     * @see org.w3._2001.xml.schema.DerivationSetMember0
     * @model instanceClass="org.w3._2001.xml.schema.DerivationSetMember0"
     *        extendedMetaData="name='derivationSet_._member_._0:Object' baseType='derivationSet_._member_._0'"
     * @generated
     */
    EDataType getDerivationSetMember0Object();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Derivation Set Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Derivation Set Member1</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='derivationSet_._member_._1' itemType='reducedDerivationControl'"
     * @generated
     */
    EDataType getDerivationSetMember1();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.FormChoice <em>Form Choice Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Form Choice Object</em>'.
     * @see org.w3._2001.xml.schema.FormChoice
     * @model instanceClass="org.w3._2001.xml.schema.FormChoice"
     *        extendedMetaData="name='formChoice:Object' baseType='formChoice'"
     * @generated
     */
    EDataType getFormChoiceObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Full Derivation Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Full Derivation Set</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='fullDerivationSet' memberTypes='fullDerivationSet_._member_._0 fullDerivationSet_._member_._1'"
     * @generated
     */
    EDataType getFullDerivationSet();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.FullDerivationSetMember0 <em>Full Derivation Set Member0 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Full Derivation Set Member0 Object</em>'.
     * @see org.w3._2001.xml.schema.FullDerivationSetMember0
     * @model instanceClass="org.w3._2001.xml.schema.FullDerivationSetMember0"
     *        extendedMetaData="name='fullDerivationSet_._member_._0:Object' baseType='fullDerivationSet_._member_._0'"
     * @generated
     */
    EDataType getFullDerivationSetMember0Object();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Full Derivation Set Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Full Derivation Set Member1</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='fullDerivationSet_._member_._1' itemType='typeDerivationControl'"
     * @generated
     */
    EDataType getFullDerivationSetMember1();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Member Types Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Member Types Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='memberTypes_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
     * @generated
     */
    EDataType getMemberTypesType();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.ModeType <em>Mode Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Mode Type Object</em>'.
     * @see org.w3._2001.xml.schema.ModeType
     * @model instanceClass="org.w3._2001.xml.schema.ModeType"
     *        extendedMetaData="name='mode_._1_._type:Object' baseType='mode_._1_._type'"
     * @generated
     */
    EDataType getModeTypeObject();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.ModeType1 <em>Mode Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Mode Type Object1</em>'.
     * @see org.w3._2001.xml.schema.ModeType1
     * @model instanceClass="org.w3._2001.xml.schema.ModeType1"
     *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
     * @generated
     */
    EDataType getModeTypeObject1();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Namespace List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Namespace List</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='namespaceList' memberTypes='specialNamespaceList basicNamespaceList'"
     * @generated
     */
    EDataType getNamespaceList();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Not Namespace Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Not Namespace Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='notNamespace_._type' baseType='basicNamespaceList' minLength='1'"
     * @generated
     */
    EDataType getNotNamespaceType();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.ProcessContentsType <em>Process Contents Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Process Contents Type Object</em>'.
     * @see org.w3._2001.xml.schema.ProcessContentsType
     * @model instanceClass="org.w3._2001.xml.schema.ProcessContentsType"
     *        extendedMetaData="name='processContents_._type:Object' baseType='processContents_._type'"
     * @generated
     */
    EDataType getProcessContentsTypeObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Public</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Public</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='public' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
     * @generated
     */
    EDataType getPublic();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Qname List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Qname List</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='qnameList' itemType='qnameList_._item'"
     * @generated
     */
    EDataType getQnameList();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Qname List A</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Qname List A</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='qnameListA' itemType='qnameListA_._item'"
     * @generated
     */
    EDataType getQnameListA();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Qname List AItem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Qname List AItem</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='qnameListA_._item' memberTypes='http://www.eclipse.org/emf/2003/XMLType#QName qnameListA_._item_._member_._1'"
     * @generated
     */
    EDataType getQnameListAItem();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.QnameListAItemMember1 <em>Qname List AItem Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Qname List AItem Member1 Object</em>'.
     * @see org.w3._2001.xml.schema.QnameListAItemMember1
     * @model instanceClass="org.w3._2001.xml.schema.QnameListAItemMember1"
     *        extendedMetaData="name='qnameListA_._item_._member_._1:Object' baseType='qnameListA_._item_._member_._1'"
     * @generated
     */
    EDataType getQnameListAItemMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Qname List Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Qname List Item</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='qnameList_._item' memberTypes='http://www.eclipse.org/emf/2003/XMLType#QName qnameList_._item_._member_._1'"
     * @generated
     */
    EDataType getQnameListItem();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.QnameListItemMember1 <em>Qname List Item Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Qname List Item Member1 Object</em>'.
     * @see org.w3._2001.xml.schema.QnameListItemMember1
     * @model instanceClass="org.w3._2001.xml.schema.QnameListItemMember1"
     *        extendedMetaData="name='qnameList_._item_._member_._1:Object' baseType='qnameList_._item_._member_._1'"
     * @generated
     */
    EDataType getQnameListItemMember1Object();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.ReducedDerivationControl <em>Reduced Derivation Control Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Reduced Derivation Control Object</em>'.
     * @see org.w3._2001.xml.schema.ReducedDerivationControl
     * @model instanceClass="org.w3._2001.xml.schema.ReducedDerivationControl"
     *        extendedMetaData="name='reducedDerivationControl:Object' baseType='reducedDerivationControl'"
     * @generated
     */
    EDataType getReducedDerivationControlObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Simple Derivation Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Simple Derivation Set</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='simpleDerivationSet' memberTypes='simpleDerivationSet_._member_._0 simpleDerivationSet_._member_._1'"
     * @generated
     */
    EDataType getSimpleDerivationSet();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Simple Derivation Set Member0 Object</em>'.
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember0
     * @model instanceClass="org.w3._2001.xml.schema.SimpleDerivationSetMember0"
     *        extendedMetaData="name='simpleDerivationSet_._member_._0:Object' baseType='simpleDerivationSet_._member_._0'"
     * @generated
     */
    EDataType getSimpleDerivationSetMember0Object();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Simple Derivation Set Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Simple Derivation Set Member1</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='simpleDerivationSet_._member_._1' itemType='simpleDerivationSet_._member_._1_._item'"
     * @generated
     */
    EDataType getSimpleDerivationSetMember1();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Simple Derivation Set Member1 Item Object</em>'.
     * @see org.w3._2001.xml.schema.SimpleDerivationSetMember1Item
     * @model instanceClass="org.w3._2001.xml.schema.SimpleDerivationSetMember1Item"
     *        extendedMetaData="name='simpleDerivationSet_._member_._1_._item:Object' baseType='simpleDerivationSet_._member_._1_._item'"
     * @generated
     */
    EDataType getSimpleDerivationSetMember1ItemObject();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.SpecialNamespaceList <em>Special Namespace List Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Special Namespace List Object</em>'.
     * @see org.w3._2001.xml.schema.SpecialNamespaceList
     * @model instanceClass="org.w3._2001.xml.schema.SpecialNamespaceList"
     *        extendedMetaData="name='specialNamespaceList:Object' baseType='specialNamespaceList'"
     * @generated
     */
    EDataType getSpecialNamespaceListObject();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Substitution Group Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Substitution Group Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='substitutionGroup_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
     * @generated
     */
    EDataType getSubstitutionGroupType();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.TypeDerivationControl <em>Type Derivation Control Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Type Derivation Control Object</em>'.
     * @see org.w3._2001.xml.schema.TypeDerivationControl
     * @model instanceClass="org.w3._2001.xml.schema.TypeDerivationControl"
     *        extendedMetaData="name='typeDerivationControl:Object' baseType='typeDerivationControl'"
     * @generated
     */
    EDataType getTypeDerivationControlObject();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.UseType <em>Use Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Use Type Object</em>'.
     * @see org.w3._2001.xml.schema.UseType
     * @model instanceClass="org.w3._2001.xml.schema.UseType"
     *        extendedMetaData="name='use_._type:Object' baseType='use_._type'"
     * @generated
     */
    EDataType getUseTypeObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Xpath Default Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Xpath Default Namespace</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='xpathDefaultNamespace' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI xpathDefaultNamespace_._member_._1'"
     * @generated
     */
    EDataType getXpathDefaultNamespace();

    /**
     * Returns the meta object for data type '{@link org.w3._2001.xml.schema.XpathDefaultNamespaceMember1 <em>Xpath Default Namespace Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Xpath Default Namespace Member1 Object</em>'.
     * @see org.w3._2001.xml.schema.XpathDefaultNamespaceMember1
     * @model instanceClass="org.w3._2001.xml.schema.XpathDefaultNamespaceMember1"
     *        extendedMetaData="name='xpathDefaultNamespace_._member_._1:Object' baseType='xpathDefaultNamespace_._member_._1'"
     * @generated
     */
    EDataType getXpathDefaultNamespaceMember1Object();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Xpath Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Xpath Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='xpath_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
     * @generated
     */
    EDataType getXpathType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Xpath Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Xpath Type1</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='xpath_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token'"
     * @generated
     */
    EDataType getXpathType1();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    XMLSchema11Factory getXMLSchema11Factory();

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
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AllImpl <em>All</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AllImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAll()
         * @generated
         */
        EClass ALL = eINSTANCE.getAll();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AltTypeImpl <em>Alt Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AltTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAltType()
         * @generated
         */
        EClass ALT_TYPE = eINSTANCE.getAltType();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ALT_TYPE__SIMPLE_TYPE = eINSTANCE.getAltType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ALT_TYPE__COMPLEX_TYPE = eINSTANCE.getAltType_ComplexType();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALT_TYPE__TEST = eINSTANCE.getAltType_Test();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALT_TYPE__TYPE = eINSTANCE.getAltType_Type();

        /**
         * The meta object literal for the '<em><b>Xpath Default Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALT_TYPE__XPATH_DEFAULT_NAMESPACE = eINSTANCE.getAltType_XpathDefaultNamespace();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AnnotatedImpl <em>Annotated</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AnnotatedImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnnotated()
         * @generated
         */
        EClass ANNOTATED = eINSTANCE.getAnnotated();

        /**
         * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANNOTATED__ANNOTATION = eINSTANCE.getAnnotated_Annotation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANNOTATED__ID = eINSTANCE.getAnnotated_Id();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AnnotationTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnnotationType()
         * @generated
         */
        EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANNOTATION_TYPE__GROUP = eINSTANCE.getAnnotationType_Group();

        /**
         * The meta object literal for the '<em><b>Appinfo</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANNOTATION_TYPE__APPINFO = eINSTANCE.getAnnotationType_Appinfo();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANNOTATION_TYPE__DOCUMENTATION = eINSTANCE.getAnnotationType_Documentation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANNOTATION_TYPE__ID = eINSTANCE.getAnnotationType_Id();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AnyAttributeTypeImpl <em>Any Attribute Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AnyAttributeTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnyAttributeType()
         * @generated
         */
        EClass ANY_ATTRIBUTE_TYPE = eINSTANCE.getAnyAttributeType();

        /**
         * The meta object literal for the '<em><b>Not QName</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_ATTRIBUTE_TYPE__NOT_QNAME = eINSTANCE.getAnyAttributeType_NotQName();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AnyTypeImpl <em>Any Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AnyTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAnyType()
         * @generated
         */
        EClass ANY_TYPE = eINSTANCE.getAnyType();

        /**
         * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_TYPE__MAX_OCCURS = eINSTANCE.getAnyType_MaxOccurs();

        /**
         * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_TYPE__MIN_OCCURS = eINSTANCE.getAnyType_MinOccurs();

        /**
         * The meta object literal for the '<em><b>Not QName</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_TYPE__NOT_QNAME = eINSTANCE.getAnyType_NotQName();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AppinfoTypeImpl <em>Appinfo Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AppinfoTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAppinfoType()
         * @generated
         */
        EClass APPINFO_TYPE = eINSTANCE.getAppinfoType();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPINFO_TYPE__MIXED = eINSTANCE.getAppinfoType_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPINFO_TYPE__GROUP = eINSTANCE.getAppinfoType_Group();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPINFO_TYPE__ANY = eINSTANCE.getAppinfoType_Any();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPINFO_TYPE__SOURCE = eINSTANCE.getAppinfoType_Source();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPINFO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAppinfoType_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AssertionImpl <em>Assertion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AssertionImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAssertion()
         * @generated
         */
        EClass ASSERTION = eINSTANCE.getAssertion();

        /**
         * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSERTION__TEST = eINSTANCE.getAssertion_Test();

        /**
         * The meta object literal for the '<em><b>Xpath Default Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSERTION__XPATH_DEFAULT_NAMESPACE = eINSTANCE.getAssertion_XpathDefaultNamespace();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AttributeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__SIMPLE_TYPE = eINSTANCE.getAttribute_SimpleType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__REF = eINSTANCE.getAttribute_Ref();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__USE = eINSTANCE.getAttribute_Use();

        /**
         * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

        /**
         * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__FIXED = eINSTANCE.getAttribute_Fixed();

        /**
         * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__FORM = eINSTANCE.getAttribute_Form();

        /**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__TARGET_NAMESPACE = eINSTANCE.getAttribute_TargetNamespace();

        /**
         * The meta object literal for the '<em><b>Inheritable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__INHERITABLE = eINSTANCE.getAttribute_Inheritable();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AttributeGroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAttributeGroup()
         * @generated
         */
        EClass ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroup();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_GROUP__GROUP = eINSTANCE.getAttributeGroup_Group();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_GROUP__ATTRIBUTE = eINSTANCE.getAttributeGroup_Attribute();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroup_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_GROUP__ANY_ATTRIBUTE1 = eINSTANCE.getAttributeGroup_AnyAttribute1();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_GROUP__NAME = eINSTANCE.getAttributeGroup_Name();

        /**
         * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_GROUP__REF = eINSTANCE.getAttributeGroup_Ref();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.AttributeGroupRefImpl <em>Attribute Group Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.AttributeGroupRefImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAttributeGroupRef()
         * @generated
         */
        EClass ATTRIBUTE_GROUP_REF = eINSTANCE.getAttributeGroupRef();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ComplexContentTypeImpl <em>Complex Content Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ComplexContentTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getComplexContentType()
         * @generated
         */
        EClass COMPLEX_CONTENT_TYPE = eINSTANCE.getComplexContentType();

        /**
         * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_CONTENT_TYPE__RESTRICTION = eINSTANCE.getComplexContentType_Restriction();

        /**
         * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_CONTENT_TYPE__EXTENSION = eINSTANCE.getComplexContentType_Extension();

        /**
         * The meta object literal for the '<em><b>Mixed1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_CONTENT_TYPE__MIXED1 = eINSTANCE.getComplexContentType_Mixed1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ComplexRestrictionTypeImpl <em>Complex Restriction Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ComplexRestrictionTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getComplexRestrictionType()
         * @generated
         */
        EClass COMPLEX_RESTRICTION_TYPE = eINSTANCE.getComplexRestrictionType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ComplexTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getComplexType()
         * @generated
         */
        EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

        /**
         * The meta object literal for the '<em><b>Simple Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__SIMPLE_CONTENT = eINSTANCE.getComplexType_SimpleContent();

        /**
         * The meta object literal for the '<em><b>Complex Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__COMPLEX_CONTENT = eINSTANCE.getComplexType_ComplexContent();

        /**
         * The meta object literal for the '<em><b>Open Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__OPEN_CONTENT = eINSTANCE.getComplexType_OpenContent();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__GROUP = eINSTANCE.getComplexType_Group();

        /**
         * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__ALL = eINSTANCE.getComplexType_All();

        /**
         * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__CHOICE = eINSTANCE.getComplexType_Choice();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__SEQUENCE = eINSTANCE.getComplexType_Sequence();

        /**
         * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__GROUP1 = eINSTANCE.getComplexType_Group1();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__ATTRIBUTE = eINSTANCE.getComplexType_Attribute();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getComplexType_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__ANY_ATTRIBUTE1 = eINSTANCE.getComplexType_AnyAttribute1();

        /**
         * The meta object literal for the '<em><b>Assert</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE__ASSERT = eINSTANCE.getComplexType_Assert();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__NAME = eINSTANCE.getComplexType_Name();

        /**
         * The meta object literal for the '<em><b>Mixed1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__MIXED1 = eINSTANCE.getComplexType_Mixed1();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__ABSTRACT = eINSTANCE.getComplexType_Abstract();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__FINAL = eINSTANCE.getComplexType_Final();

        /**
         * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__BLOCK = eINSTANCE.getComplexType_Block();

        /**
         * The meta object literal for the '<em><b>Default Attributes Apply</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY = eINSTANCE.getComplexType_DefaultAttributesApply();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl <em>Default Open Content Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDefaultOpenContentType()
         * @generated
         */
        EClass DEFAULT_OPEN_CONTENT_TYPE = eINSTANCE.getDefaultOpenContentType();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEFAULT_OPEN_CONTENT_TYPE__ANY = eINSTANCE.getDefaultOpenContentType_Any();

        /**
         * The meta object literal for the '<em><b>Applies To Empty</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY = eINSTANCE.getDefaultOpenContentType_AppliesToEmpty();

        /**
         * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_OPEN_CONTENT_TYPE__MODE = eINSTANCE.getDefaultOpenContentType_Mode();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.DocumentationTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDocumentationType()
         * @generated
         */
        EClass DOCUMENTATION_TYPE = eINSTANCE.getDocumentationType();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__MIXED = eINSTANCE.getDocumentationType_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__GROUP = eINSTANCE.getDocumentationType_Group();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__ANY = eINSTANCE.getDocumentationType_Any();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__SOURCE = eINSTANCE.getDocumentationType_Source();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__LANG = eINSTANCE.getDocumentationType_Lang();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDocumentationType_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.DocumentRootImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ALL = eINSTANCE.getDocumentRoot_All();

        /**
         * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ANNOTATION = eINSTANCE.getDocumentRoot_Annotation();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ANY = eINSTANCE.getDocumentRoot_Any();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ANY_ATTRIBUTE = eINSTANCE.getDocumentRoot_AnyAttribute();

        /**
         * The meta object literal for the '<em><b>Appinfo</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__APPINFO = eINSTANCE.getDocumentRoot_Appinfo();

        /**
         * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ASSERTION = eINSTANCE.getDocumentRoot_Assertion();

        /**
         * The meta object literal for the '<em><b>Facet</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FACET = eINSTANCE.getDocumentRoot_Facet();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ATTRIBUTE = eINSTANCE.getDocumentRoot_Attribute();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ATTRIBUTE_GROUP = eINSTANCE.getDocumentRoot_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CHOICE = eINSTANCE.getDocumentRoot_Choice();

        /**
         * The meta object literal for the '<em><b>Complex Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COMPLEX_CONTENT = eINSTANCE.getDocumentRoot_ComplexContent();

        /**
         * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COMPLEX_TYPE = eINSTANCE.getDocumentRoot_ComplexType();

        /**
         * The meta object literal for the '<em><b>Default Open Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT = eINSTANCE.getDocumentRoot_DefaultOpenContent();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ELEMENT = eINSTANCE.getDocumentRoot_Element();

        /**
         * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ENUMERATION = eINSTANCE.getDocumentRoot_Enumeration();

        /**
         * The meta object literal for the '<em><b>Explicit Timezone</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EXPLICIT_TIMEZONE = eINSTANCE.getDocumentRoot_ExplicitTimezone();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FIELD = eINSTANCE.getDocumentRoot_Field();

        /**
         * The meta object literal for the '<em><b>Fraction Digits</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FRACTION_DIGITS = eINSTANCE.getDocumentRoot_FractionDigits();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__GROUP = eINSTANCE.getDocumentRoot_Group();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

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
         * The meta object literal for the '<em><b>Keyref</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__KEYREF = eINSTANCE.getDocumentRoot_Keyref();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LENGTH = eINSTANCE.getDocumentRoot_Length();

        /**
         * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LIST = eINSTANCE.getDocumentRoot_List();

        /**
         * The meta object literal for the '<em><b>Max Exclusive</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAX_EXCLUSIVE = eINSTANCE.getDocumentRoot_MaxExclusive();

        /**
         * The meta object literal for the '<em><b>Max Inclusive</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAX_INCLUSIVE = eINSTANCE.getDocumentRoot_MaxInclusive();

        /**
         * The meta object literal for the '<em><b>Max Length</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MAX_LENGTH = eINSTANCE.getDocumentRoot_MaxLength();

        /**
         * The meta object literal for the '<em><b>Min Exclusive</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MIN_EXCLUSIVE = eINSTANCE.getDocumentRoot_MinExclusive();

        /**
         * The meta object literal for the '<em><b>Min Inclusive</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MIN_INCLUSIVE = eINSTANCE.getDocumentRoot_MinInclusive();

        /**
         * The meta object literal for the '<em><b>Min Length</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MIN_LENGTH = eINSTANCE.getDocumentRoot_MinLength();

        /**
         * The meta object literal for the '<em><b>Notation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NOTATION = eINSTANCE.getDocumentRoot_Notation();

        /**
         * The meta object literal for the '<em><b>Open Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OPEN_CONTENT = eINSTANCE.getDocumentRoot_OpenContent();

        /**
         * The meta object literal for the '<em><b>Override</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__OVERRIDE = eINSTANCE.getDocumentRoot_Override();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PATTERN = eINSTANCE.getDocumentRoot_Pattern();

        /**
         * The meta object literal for the '<em><b>Redefine</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__REDEFINE = eINSTANCE.getDocumentRoot_Redefine();

        /**
         * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__RESTRICTION = eINSTANCE.getDocumentRoot_Restriction();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SCHEMA = eINSTANCE.getDocumentRoot_Schema();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SELECTOR = eINSTANCE.getDocumentRoot_Selector();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SEQUENCE = eINSTANCE.getDocumentRoot_Sequence();

        /**
         * The meta object literal for the '<em><b>Simple Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SIMPLE_CONTENT = eINSTANCE.getDocumentRoot_SimpleContent();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SIMPLE_TYPE = eINSTANCE.getDocumentRoot_SimpleType();

        /**
         * The meta object literal for the '<em><b>Total Digits</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TOTAL_DIGITS = eINSTANCE.getDocumentRoot_TotalDigits();

        /**
         * The meta object literal for the '<em><b>Union</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__UNION = eINSTANCE.getDocumentRoot_Union();

        /**
         * The meta object literal for the '<em><b>Unique</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__UNIQUE = eINSTANCE.getDocumentRoot_Unique();

        /**
         * The meta object literal for the '<em><b>White Space</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__WHITE_SPACE = eINSTANCE.getDocumentRoot_WhiteSpace();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ElementImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__SIMPLE_TYPE = eINSTANCE.getElement_SimpleType();

        /**
         * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__COMPLEX_TYPE = eINSTANCE.getElement_ComplexType();

        /**
         * The meta object literal for the '<em><b>Alternative</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__ALTERNATIVE = eINSTANCE.getElement_Alternative();

        /**
         * The meta object literal for the '<em><b>Identity Constraint</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__IDENTITY_CONSTRAINT = eINSTANCE.getElement_IdentityConstraint();

        /**
         * The meta object literal for the '<em><b>Unique</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__UNIQUE = eINSTANCE.getElement_Unique();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__KEY = eINSTANCE.getElement_Key();

        /**
         * The meta object literal for the '<em><b>Keyref</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__KEYREF = eINSTANCE.getElement_Keyref();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

        /**
         * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__REF = eINSTANCE.getElement_Ref();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

        /**
         * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__MIN_OCCURS = eINSTANCE.getElement_MinOccurs();

        /**
         * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__MAX_OCCURS = eINSTANCE.getElement_MaxOccurs();

        /**
         * The meta object literal for the '<em><b>Substitution Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__SUBSTITUTION_GROUP = eINSTANCE.getElement_SubstitutionGroup();

        /**
         * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__DEFAULT = eINSTANCE.getElement_Default();

        /**
         * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__FIXED = eINSTANCE.getElement_Fixed();

        /**
         * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__NILLABLE = eINSTANCE.getElement_Nillable();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__ABSTRACT = eINSTANCE.getElement_Abstract();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__FINAL = eINSTANCE.getElement_Final();

        /**
         * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__BLOCK = eINSTANCE.getElement_Block();

        /**
         * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__FORM = eINSTANCE.getElement_Form();

        /**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__TARGET_NAMESPACE = eINSTANCE.getElement_TargetNamespace();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ExplicitGroupImpl <em>Explicit Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ExplicitGroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getExplicitGroup()
         * @generated
         */
        EClass EXPLICIT_GROUP = eINSTANCE.getExplicitGroup();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ExplicitTimezoneTypeImpl <em>Explicit Timezone Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ExplicitTimezoneTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getExplicitTimezoneType()
         * @generated
         */
        EClass EXPLICIT_TIMEZONE_TYPE = eINSTANCE.getExplicitTimezoneType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ExtensionTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getExtensionType()
         * @generated
         */
        EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

        /**
         * The meta object literal for the '<em><b>Open Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__OPEN_CONTENT = eINSTANCE.getExtensionType_OpenContent();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__GROUP = eINSTANCE.getExtensionType_Group();

        /**
         * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__ALL = eINSTANCE.getExtensionType_All();

        /**
         * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__CHOICE = eINSTANCE.getExtensionType_Choice();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__SEQUENCE = eINSTANCE.getExtensionType_Sequence();

        /**
         * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENSION_TYPE__GROUP1 = eINSTANCE.getExtensionType_Group1();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__ATTRIBUTE = eINSTANCE.getExtensionType_Attribute();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getExtensionType_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__ANY_ATTRIBUTE1 = eINSTANCE.getExtensionType_AnyAttribute1();

        /**
         * The meta object literal for the '<em><b>Assert</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION_TYPE__ASSERT = eINSTANCE.getExtensionType_Assert();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENSION_TYPE__BASE = eINSTANCE.getExtensionType_Base();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.FacetImpl <em>Facet</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.FacetImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFacet()
         * @generated
         */
        EClass FACET = eINSTANCE.getFacet();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FACET__VALUE = eINSTANCE.getFacet_Value();

        /**
         * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FACET__FIXED = eINSTANCE.getFacet_Fixed();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.FieldTypeImpl <em>Field Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.FieldTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFieldType()
         * @generated
         */
        EClass FIELD_TYPE = eINSTANCE.getFieldType();

        /**
         * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD_TYPE__XPATH = eINSTANCE.getFieldType_Xpath();

        /**
         * The meta object literal for the '<em><b>Xpath Default Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD_TYPE__XPATH_DEFAULT_NAMESPACE = eINSTANCE.getFieldType_XpathDefaultNamespace();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.GroupImpl <em>Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.GroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getGroup()
         * @generated
         */
        EClass GROUP = eINSTANCE.getGroup();

        /**
         * The meta object literal for the '<em><b>Particle</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GROUP__PARTICLE = eINSTANCE.getGroup_Particle();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__ELEMENT = eINSTANCE.getGroup_Element();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__GROUP = eINSTANCE.getGroup_Group();

        /**
         * The meta object literal for the '<em><b>All</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__ALL = eINSTANCE.getGroup_All();

        /**
         * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__CHOICE = eINSTANCE.getGroup_Choice();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__SEQUENCE = eINSTANCE.getGroup_Sequence();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__ANY = eINSTANCE.getGroup_Any();

        /**
         * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GROUP__MAX_OCCURS = eINSTANCE.getGroup_MaxOccurs();

        /**
         * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GROUP__MIN_OCCURS = eINSTANCE.getGroup_MinOccurs();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

        /**
         * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GROUP__REF = eINSTANCE.getGroup_Ref();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.GroupRefImpl <em>Group Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.GroupRefImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getGroupRef()
         * @generated
         */
        EClass GROUP_REF = eINSTANCE.getGroupRef();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ImportTypeImpl <em>Import Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ImportTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getImportType()
         * @generated
         */
        EClass IMPORT_TYPE = eINSTANCE.getImportType();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_TYPE__NAMESPACE = eINSTANCE.getImportType_Namespace();

        /**
         * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMPORT_TYPE__SCHEMA_LOCATION = eINSTANCE.getImportType_SchemaLocation();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.IncludeTypeImpl <em>Include Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.IncludeTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getIncludeType()
         * @generated
         */
        EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

        /**
         * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCLUDE_TYPE__SCHEMA_LOCATION = eINSTANCE.getIncludeType_SchemaLocation();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.IntFacetImpl <em>Int Facet</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.IntFacetImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getIntFacet()
         * @generated
         */
        EClass INT_FACET = eINSTANCE.getIntFacet();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.KeybaseImpl <em>Keybase</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.KeybaseImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getKeybase()
         * @generated
         */
        EClass KEYBASE = eINSTANCE.getKeybase();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEYBASE__SELECTOR = eINSTANCE.getKeybase_Selector();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEYBASE__FIELD = eINSTANCE.getKeybase_Field();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEYBASE__NAME = eINSTANCE.getKeybase_Name();

        /**
         * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEYBASE__REF = eINSTANCE.getKeybase_Ref();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.KeyrefTypeImpl <em>Keyref Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.KeyrefTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getKeyrefType()
         * @generated
         */
        EClass KEYREF_TYPE = eINSTANCE.getKeyrefType();

        /**
         * The meta object literal for the '<em><b>Refer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEYREF_TYPE__REFER = eINSTANCE.getKeyrefType_Refer();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.ListTypeImpl <em>List Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.ListTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getListType()
         * @generated
         */
        EClass LIST_TYPE = eINSTANCE.getListType();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIST_TYPE__SIMPLE_TYPE = eINSTANCE.getListType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_TYPE__ITEM_TYPE = eINSTANCE.getListType_ItemType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.LocalComplexTypeImpl <em>Local Complex Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.LocalComplexTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getLocalComplexType()
         * @generated
         */
        EClass LOCAL_COMPLEX_TYPE = eINSTANCE.getLocalComplexType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.LocalElementImpl <em>Local Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.LocalElementImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getLocalElement()
         * @generated
         */
        EClass LOCAL_ELEMENT = eINSTANCE.getLocalElement();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.LocalSimpleTypeImpl <em>Local Simple Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.LocalSimpleTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getLocalSimpleType()
         * @generated
         */
        EClass LOCAL_SIMPLE_TYPE = eINSTANCE.getLocalSimpleType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.NamedAttributeGroupImpl <em>Named Attribute Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.NamedAttributeGroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNamedAttributeGroup()
         * @generated
         */
        EClass NAMED_ATTRIBUTE_GROUP = eINSTANCE.getNamedAttributeGroup();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.NamedGroupImpl <em>Named Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.NamedGroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNamedGroup()
         * @generated
         */
        EClass NAMED_GROUP = eINSTANCE.getNamedGroup();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.NoFixedFacetImpl <em>No Fixed Facet</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.NoFixedFacetImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNoFixedFacet()
         * @generated
         */
        EClass NO_FIXED_FACET = eINSTANCE.getNoFixedFacet();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.NotationTypeImpl <em>Notation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.NotationTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNotationType()
         * @generated
         */
        EClass NOTATION_TYPE = eINSTANCE.getNotationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTATION_TYPE__NAME = eINSTANCE.getNotationType_Name();

        /**
         * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTATION_TYPE__PUBLIC = eINSTANCE.getNotationType_Public();

        /**
         * The meta object literal for the '<em><b>System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTATION_TYPE__SYSTEM = eINSTANCE.getNotationType_System();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.NumFacetImpl <em>Num Facet</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.NumFacetImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNumFacet()
         * @generated
         */
        EClass NUM_FACET = eINSTANCE.getNumFacet();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.OpenAttrsImpl <em>Open Attrs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.OpenAttrsImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getOpenAttrs()
         * @generated
         */
        EClass OPEN_ATTRS = eINSTANCE.getOpenAttrs();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPEN_ATTRS__MIXED = eINSTANCE.getOpenAttrs_Mixed();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPEN_ATTRS__ANY_ATTRIBUTE = eINSTANCE.getOpenAttrs_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.OpenContentTypeImpl <em>Open Content Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.OpenContentTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getOpenContentType()
         * @generated
         */
        EClass OPEN_CONTENT_TYPE = eINSTANCE.getOpenContentType();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPEN_CONTENT_TYPE__ANY = eINSTANCE.getOpenContentType_Any();

        /**
         * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPEN_CONTENT_TYPE__MODE = eINSTANCE.getOpenContentType_Mode();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl <em>Override Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.OverrideTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getOverrideType()
         * @generated
         */
        EClass OVERRIDE_TYPE = eINSTANCE.getOverrideType();

        /**
         * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__ANNOTATION = eINSTANCE.getOverrideType_Annotation();

        /**
         * The meta object literal for the '<em><b>Schema Top</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OVERRIDE_TYPE__SCHEMA_TOP = eINSTANCE.getOverrideType_SchemaTop();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__SIMPLE_TYPE = eINSTANCE.getOverrideType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__COMPLEX_TYPE = eINSTANCE.getOverrideType_ComplexType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__GROUP = eINSTANCE.getOverrideType_Group();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getOverrideType_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__ELEMENT = eINSTANCE.getOverrideType_Element();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__ATTRIBUTE = eINSTANCE.getOverrideType_Attribute();

        /**
         * The meta object literal for the '<em><b>Notation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OVERRIDE_TYPE__NOTATION = eINSTANCE.getOverrideType_Notation();

        /**
         * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OVERRIDE_TYPE__SCHEMA_LOCATION = eINSTANCE.getOverrideType_SchemaLocation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OVERRIDE_TYPE__ID = eINSTANCE.getOverrideType_Id();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.PatternTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getPatternType()
         * @generated
         */
        EClass PATTERN_TYPE = eINSTANCE.getPatternType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.RealGroupImpl <em>Real Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.RealGroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRealGroup()
         * @generated
         */
        EClass REAL_GROUP = eINSTANCE.getRealGroup();

        /**
         * The meta object literal for the '<em><b>All1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REAL_GROUP__ALL1 = eINSTANCE.getRealGroup_All1();

        /**
         * The meta object literal for the '<em><b>Choice1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REAL_GROUP__CHOICE1 = eINSTANCE.getRealGroup_Choice1();

        /**
         * The meta object literal for the '<em><b>Sequence1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REAL_GROUP__SEQUENCE1 = eINSTANCE.getRealGroup_Sequence1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.RedefineTypeImpl <em>Redefine Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.RedefineTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRedefineType()
         * @generated
         */
        EClass REDEFINE_TYPE = eINSTANCE.getRedefineType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REDEFINE_TYPE__GROUP = eINSTANCE.getRedefineType_Group();

        /**
         * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REDEFINE_TYPE__ANNOTATION = eINSTANCE.getRedefineType_Annotation();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REDEFINE_TYPE__SIMPLE_TYPE = eINSTANCE.getRedefineType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REDEFINE_TYPE__COMPLEX_TYPE = eINSTANCE.getRedefineType_ComplexType();

        /**
         * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REDEFINE_TYPE__GROUP1 = eINSTANCE.getRedefineType_Group1();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REDEFINE_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getRedefineType_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REDEFINE_TYPE__SCHEMA_LOCATION = eINSTANCE.getRedefineType_SchemaLocation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REDEFINE_TYPE__ID = eINSTANCE.getRedefineType_Id();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl <em>Restriction Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.RestrictionTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRestrictionType()
         * @generated
         */
        EClass RESTRICTION_TYPE = eINSTANCE.getRestrictionType();

        /**
         * The meta object literal for the '<em><b>Open Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__OPEN_CONTENT = eINSTANCE.getRestrictionType_OpenContent();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__GROUP = eINSTANCE.getRestrictionType_Group();

        /**
         * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__ALL = eINSTANCE.getRestrictionType_All();

        /**
         * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__CHOICE = eINSTANCE.getRestrictionType_Choice();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__SEQUENCE = eINSTANCE.getRestrictionType_Sequence();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__SIMPLE_TYPE = eINSTANCE.getRestrictionType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE__GROUP1 = eINSTANCE.getRestrictionType_Group1();

        /**
         * The meta object literal for the '<em><b>Facet Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE__FACET_GROUP = eINSTANCE.getRestrictionType_FacetGroup();

        /**
         * The meta object literal for the '<em><b>Facet</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__FACET = eINSTANCE.getRestrictionType_Facet();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE__ANY = eINSTANCE.getRestrictionType_Any();

        /**
         * The meta object literal for the '<em><b>Group2</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE__GROUP2 = eINSTANCE.getRestrictionType_Group2();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__ATTRIBUTE = eINSTANCE.getRestrictionType_Attribute();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getRestrictionType_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Any Attribute1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__ANY_ATTRIBUTE1 = eINSTANCE.getRestrictionType_AnyAttribute1();

        /**
         * The meta object literal for the '<em><b>Assert</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE__ASSERT = eINSTANCE.getRestrictionType_Assert();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE__BASE = eINSTANCE.getRestrictionType_Base();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl <em>Restriction Type1</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.RestrictionType1Impl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getRestrictionType1()
         * @generated
         */
        EClass RESTRICTION_TYPE1 = eINSTANCE.getRestrictionType1();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE1__SIMPLE_TYPE = eINSTANCE.getRestrictionType1_SimpleType();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE1__GROUP = eINSTANCE.getRestrictionType1_Group();

        /**
         * The meta object literal for the '<em><b>Facet Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE1__FACET_GROUP = eINSTANCE.getRestrictionType1_FacetGroup();

        /**
         * The meta object literal for the '<em><b>Facet</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESTRICTION_TYPE1__FACET = eINSTANCE.getRestrictionType1_Facet();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE1__ANY = eINSTANCE.getRestrictionType1_Any();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESTRICTION_TYPE1__BASE = eINSTANCE.getRestrictionType1_Base();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SchemaTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSchemaType()
         * @generated
         */
        EClass SCHEMA_TYPE = eINSTANCE.getSchemaType();

        /**
         * The meta object literal for the '<em><b>Composition</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__COMPOSITION = eINSTANCE.getSchemaType_Composition();

        /**
         * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__INCLUDE = eINSTANCE.getSchemaType_Include();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__IMPORT = eINSTANCE.getSchemaType_Import();

        /**
         * The meta object literal for the '<em><b>Redefine</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__REDEFINE = eINSTANCE.getSchemaType_Redefine();

        /**
         * The meta object literal for the '<em><b>Override</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__OVERRIDE = eINSTANCE.getSchemaType_Override();

        /**
         * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__ANNOTATION = eINSTANCE.getSchemaType_Annotation();

        /**
         * The meta object literal for the '<em><b>Default Open Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__DEFAULT_OPEN_CONTENT = eINSTANCE.getSchemaType_DefaultOpenContent();

        /**
         * The meta object literal for the '<em><b>Annotation1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__ANNOTATION1 = eINSTANCE.getSchemaType_Annotation1();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__GROUP = eINSTANCE.getSchemaType_Group();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__SIMPLE_TYPE = eINSTANCE.getSchemaType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__COMPLEX_TYPE = eINSTANCE.getSchemaType_ComplexType();

        /**
         * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__GROUP1 = eINSTANCE.getSchemaType_Group1();

        /**
         * The meta object literal for the '<em><b>Attribute Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__ATTRIBUTE_GROUP = eINSTANCE.getSchemaType_AttributeGroup();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__ELEMENT = eINSTANCE.getSchemaType_Element();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__ATTRIBUTE = eINSTANCE.getSchemaType_Attribute();

        /**
         * The meta object literal for the '<em><b>Notation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__NOTATION = eINSTANCE.getSchemaType_Notation();

        /**
         * The meta object literal for the '<em><b>Annotation2</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TYPE__ANNOTATION2 = eINSTANCE.getSchemaType_Annotation2();

        /**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__TARGET_NAMESPACE = eINSTANCE.getSchemaType_TargetNamespace();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__VERSION = eINSTANCE.getSchemaType_Version();

        /**
         * The meta object literal for the '<em><b>Final Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__FINAL_DEFAULT = eINSTANCE.getSchemaType_FinalDefault();

        /**
         * The meta object literal for the '<em><b>Block Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__BLOCK_DEFAULT = eINSTANCE.getSchemaType_BlockDefault();

        /**
         * The meta object literal for the '<em><b>Attribute Form Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT = eINSTANCE.getSchemaType_AttributeFormDefault();

        /**
         * The meta object literal for the '<em><b>Element Form Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__ELEMENT_FORM_DEFAULT = eINSTANCE.getSchemaType_ElementFormDefault();

        /**
         * The meta object literal for the '<em><b>Default Attributes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__DEFAULT_ATTRIBUTES = eINSTANCE.getSchemaType_DefaultAttributes();

        /**
         * The meta object literal for the '<em><b>Xpath Default Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE = eINSTANCE.getSchemaType_XpathDefaultNamespace();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__ID = eINSTANCE.getSchemaType_Id();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TYPE__LANG = eINSTANCE.getSchemaType_Lang();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SelectorTypeImpl <em>Selector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SelectorTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSelectorType()
         * @generated
         */
        EClass SELECTOR_TYPE = eINSTANCE.getSelectorType();

        /**
         * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SELECTOR_TYPE__XPATH = eINSTANCE.getSelectorType_Xpath();

        /**
         * The meta object literal for the '<em><b>Xpath Default Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SELECTOR_TYPE__XPATH_DEFAULT_NAMESPACE = eINSTANCE.getSelectorType_XpathDefaultNamespace();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SimpleContentTypeImpl <em>Simple Content Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SimpleContentTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleContentType()
         * @generated
         */
        EClass SIMPLE_CONTENT_TYPE = eINSTANCE.getSimpleContentType();

        /**
         * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_CONTENT_TYPE__RESTRICTION = eINSTANCE.getSimpleContentType_Restriction();

        /**
         * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_CONTENT_TYPE__EXTENSION = eINSTANCE.getSimpleContentType_Extension();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SimpleExplicitGroupImpl <em>Simple Explicit Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SimpleExplicitGroupImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleExplicitGroup()
         * @generated
         */
        EClass SIMPLE_EXPLICIT_GROUP = eINSTANCE.getSimpleExplicitGroup();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SimpleExtensionTypeImpl <em>Simple Extension Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SimpleExtensionTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleExtensionType()
         * @generated
         */
        EClass SIMPLE_EXTENSION_TYPE = eINSTANCE.getSimpleExtensionType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SimpleRestrictionTypeImpl <em>Simple Restriction Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SimpleRestrictionTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleRestrictionType()
         * @generated
         */
        EClass SIMPLE_RESTRICTION_TYPE = eINSTANCE.getSimpleRestrictionType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.SimpleTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleType()
         * @generated
         */
        EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

        /**
         * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_TYPE__RESTRICTION = eINSTANCE.getSimpleType_Restriction();

        /**
         * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_TYPE__LIST = eINSTANCE.getSimpleType_List();

        /**
         * The meta object literal for the '<em><b>Union</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_TYPE__UNION = eINSTANCE.getSimpleType_Union();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_TYPE__FINAL = eINSTANCE.getSimpleType_Final();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_TYPE__NAME = eINSTANCE.getSimpleType_Name();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.TopLevelAttributeImpl <em>Top Level Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.TopLevelAttributeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelAttribute()
         * @generated
         */
        EClass TOP_LEVEL_ATTRIBUTE = eINSTANCE.getTopLevelAttribute();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.TopLevelComplexTypeImpl <em>Top Level Complex Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.TopLevelComplexTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelComplexType()
         * @generated
         */
        EClass TOP_LEVEL_COMPLEX_TYPE = eINSTANCE.getTopLevelComplexType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.TopLevelElementImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelElement()
         * @generated
         */
        EClass TOP_LEVEL_ELEMENT = eINSTANCE.getTopLevelElement();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.TopLevelSimpleTypeImpl <em>Top Level Simple Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.TopLevelSimpleTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTopLevelSimpleType()
         * @generated
         */
        EClass TOP_LEVEL_SIMPLE_TYPE = eINSTANCE.getTopLevelSimpleType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.TotalDigitsTypeImpl <em>Total Digits Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.TotalDigitsTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTotalDigitsType()
         * @generated
         */
        EClass TOTAL_DIGITS_TYPE = eINSTANCE.getTotalDigitsType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.UnionTypeImpl <em>Union Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.UnionTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getUnionType()
         * @generated
         */
        EClass UNION_TYPE = eINSTANCE.getUnionType();

        /**
         * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNION_TYPE__SIMPLE_TYPE = eINSTANCE.getUnionType_SimpleType();

        /**
         * The meta object literal for the '<em><b>Member Types</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNION_TYPE__MEMBER_TYPES = eINSTANCE.getUnionType_MemberTypes();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.WhiteSpaceTypeImpl <em>White Space Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.WhiteSpaceTypeImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getWhiteSpaceType()
         * @generated
         */
        EClass WHITE_SPACE_TYPE = eINSTANCE.getWhiteSpaceType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.impl.WildcardImpl <em>Wildcard</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.impl.WildcardImpl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getWildcard()
         * @generated
         */
        EClass WILDCARD = eINSTANCE.getWildcard();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WILDCARD__NAMESPACE = eINSTANCE.getWildcard_Namespace();

        /**
         * The meta object literal for the '<em><b>Not Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WILDCARD__NOT_NAMESPACE = eINSTANCE.getWildcard_NotNamespace();

        /**
         * The meta object literal for the '<em><b>Process Contents</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WILDCARD__PROCESS_CONTENTS = eINSTANCE.getWildcard_ProcessContents();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.AllNNIMember1 <em>All NNI Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.AllNNIMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAllNNIMember1()
         * @generated
         */
        EEnum ALL_NNI_MEMBER1 = eINSTANCE.getAllNNIMember1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.BasicNamespaceListItemMember1 <em>Basic Namespace List Item Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.BasicNamespaceListItemMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceListItemMember1()
         * @generated
         */
        EEnum BASIC_NAMESPACE_LIST_ITEM_MEMBER1 = eINSTANCE.getBasicNamespaceListItemMember1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.BlockSetMember0 <em>Block Set Member0</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.BlockSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember0()
         * @generated
         */
        EEnum BLOCK_SET_MEMBER0 = eINSTANCE.getBlockSetMember0();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.BlockSetMember1Item <em>Block Set Member1 Item</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.BlockSetMember1Item
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember1Item()
         * @generated
         */
        EEnum BLOCK_SET_MEMBER1_ITEM = eINSTANCE.getBlockSetMember1Item();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.DerivationControl <em>Derivation Control</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.DerivationControl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationControl()
         * @generated
         */
        EEnum DERIVATION_CONTROL = eINSTANCE.getDerivationControl();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.DerivationSetMember0 <em>Derivation Set Member0</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.DerivationSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSetMember0()
         * @generated
         */
        EEnum DERIVATION_SET_MEMBER0 = eINSTANCE.getDerivationSetMember0();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.FormChoice <em>Form Choice</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.FormChoice
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFormChoice()
         * @generated
         */
        EEnum FORM_CHOICE = eINSTANCE.getFormChoice();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.FullDerivationSetMember0 <em>Full Derivation Set Member0</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.FullDerivationSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSetMember0()
         * @generated
         */
        EEnum FULL_DERIVATION_SET_MEMBER0 = eINSTANCE.getFullDerivationSetMember0();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.ModeType <em>Mode Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ModeType
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeType()
         * @generated
         */
        EEnum MODE_TYPE = eINSTANCE.getModeType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.ModeType1 <em>Mode Type1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ModeType1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeType1()
         * @generated
         */
        EEnum MODE_TYPE1 = eINSTANCE.getModeType1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.ProcessContentsType <em>Process Contents Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ProcessContentsType
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getProcessContentsType()
         * @generated
         */
        EEnum PROCESS_CONTENTS_TYPE = eINSTANCE.getProcessContentsType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.QnameListAItemMember1 <em>Qname List AItem Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.QnameListAItemMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListAItemMember1()
         * @generated
         */
        EEnum QNAME_LIST_AITEM_MEMBER1 = eINSTANCE.getQnameListAItemMember1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.QnameListItemMember1 <em>Qname List Item Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.QnameListItemMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListItemMember1()
         * @generated
         */
        EEnum QNAME_LIST_ITEM_MEMBER1 = eINSTANCE.getQnameListItemMember1();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.ReducedDerivationControl <em>Reduced Derivation Control</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ReducedDerivationControl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getReducedDerivationControl()
         * @generated
         */
        EEnum REDUCED_DERIVATION_CONTROL = eINSTANCE.getReducedDerivationControl();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember0 <em>Simple Derivation Set Member0</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.SimpleDerivationSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember0()
         * @generated
         */
        EEnum SIMPLE_DERIVATION_SET_MEMBER0 = eINSTANCE.getSimpleDerivationSetMember0();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.SimpleDerivationSetMember1Item <em>Simple Derivation Set Member1 Item</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.SimpleDerivationSetMember1Item
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember1Item()
         * @generated
         */
        EEnum SIMPLE_DERIVATION_SET_MEMBER1_ITEM = eINSTANCE.getSimpleDerivationSetMember1Item();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.SpecialNamespaceList <em>Special Namespace List</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.SpecialNamespaceList
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSpecialNamespaceList()
         * @generated
         */
        EEnum SPECIAL_NAMESPACE_LIST = eINSTANCE.getSpecialNamespaceList();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.TypeDerivationControl <em>Type Derivation Control</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.TypeDerivationControl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTypeDerivationControl()
         * @generated
         */
        EEnum TYPE_DERIVATION_CONTROL = eINSTANCE.getTypeDerivationControl();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.UseType <em>Use Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.UseType
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getUseType()
         * @generated
         */
        EEnum USE_TYPE = eINSTANCE.getUseType();

        /**
         * The meta object literal for the '{@link org.w3._2001.xml.schema.XpathDefaultNamespaceMember1 <em>Xpath Default Namespace Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.XpathDefaultNamespaceMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathDefaultNamespaceMember1()
         * @generated
         */
        EEnum XPATH_DEFAULT_NAMESPACE_MEMBER1 = eINSTANCE.getXpathDefaultNamespaceMember1();

        /**
         * The meta object literal for the '<em>All NNI</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAllNNI()
         * @generated
         */
        EDataType ALL_NNI = eINSTANCE.getAllNNI();

        /**
         * The meta object literal for the '<em>All NNI Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.AllNNIMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getAllNNIMember1Object()
         * @generated
         */
        EDataType ALL_NNI_MEMBER1_OBJECT = eINSTANCE.getAllNNIMember1Object();

        /**
         * The meta object literal for the '<em>Basic Namespace List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceList()
         * @generated
         */
        EDataType BASIC_NAMESPACE_LIST = eINSTANCE.getBasicNamespaceList();

        /**
         * The meta object literal for the '<em>Basic Namespace List Item</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceListItem()
         * @generated
         */
        EDataType BASIC_NAMESPACE_LIST_ITEM = eINSTANCE.getBasicNamespaceListItem();

        /**
         * The meta object literal for the '<em>Basic Namespace List Item Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.BasicNamespaceListItemMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBasicNamespaceListItemMember1Object()
         * @generated
         */
        EDataType BASIC_NAMESPACE_LIST_ITEM_MEMBER1_OBJECT = eINSTANCE.getBasicNamespaceListItemMember1Object();

        /**
         * The meta object literal for the '<em>Block Set</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSet()
         * @generated
         */
        EDataType BLOCK_SET = eINSTANCE.getBlockSet();

        /**
         * The meta object literal for the '<em>Block Set Member0 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.BlockSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember0Object()
         * @generated
         */
        EDataType BLOCK_SET_MEMBER0_OBJECT = eINSTANCE.getBlockSetMember0Object();

        /**
         * The meta object literal for the '<em>Block Set Member1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember1()
         * @generated
         */
        EDataType BLOCK_SET_MEMBER1 = eINSTANCE.getBlockSetMember1();

        /**
         * The meta object literal for the '<em>Block Set Member1 Item Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.BlockSetMember1Item
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getBlockSetMember1ItemObject()
         * @generated
         */
        EDataType BLOCK_SET_MEMBER1_ITEM_OBJECT = eINSTANCE.getBlockSetMember1ItemObject();

        /**
         * The meta object literal for the '<em>Derivation Control Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.DerivationControl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationControlObject()
         * @generated
         */
        EDataType DERIVATION_CONTROL_OBJECT = eINSTANCE.getDerivationControlObject();

        /**
         * The meta object literal for the '<em>Derivation Set</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSet()
         * @generated
         */
        EDataType DERIVATION_SET = eINSTANCE.getDerivationSet();

        /**
         * The meta object literal for the '<em>Derivation Set Member0 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.DerivationSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSetMember0Object()
         * @generated
         */
        EDataType DERIVATION_SET_MEMBER0_OBJECT = eINSTANCE.getDerivationSetMember0Object();

        /**
         * The meta object literal for the '<em>Derivation Set Member1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getDerivationSetMember1()
         * @generated
         */
        EDataType DERIVATION_SET_MEMBER1 = eINSTANCE.getDerivationSetMember1();

        /**
         * The meta object literal for the '<em>Form Choice Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.FormChoice
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFormChoiceObject()
         * @generated
         */
        EDataType FORM_CHOICE_OBJECT = eINSTANCE.getFormChoiceObject();

        /**
         * The meta object literal for the '<em>Full Derivation Set</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSet()
         * @generated
         */
        EDataType FULL_DERIVATION_SET = eINSTANCE.getFullDerivationSet();

        /**
         * The meta object literal for the '<em>Full Derivation Set Member0 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.FullDerivationSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSetMember0Object()
         * @generated
         */
        EDataType FULL_DERIVATION_SET_MEMBER0_OBJECT = eINSTANCE.getFullDerivationSetMember0Object();

        /**
         * The meta object literal for the '<em>Full Derivation Set Member1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getFullDerivationSetMember1()
         * @generated
         */
        EDataType FULL_DERIVATION_SET_MEMBER1 = eINSTANCE.getFullDerivationSetMember1();

        /**
         * The meta object literal for the '<em>Member Types Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getMemberTypesType()
         * @generated
         */
        EDataType MEMBER_TYPES_TYPE = eINSTANCE.getMemberTypesType();

        /**
         * The meta object literal for the '<em>Mode Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ModeType
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeTypeObject()
         * @generated
         */
        EDataType MODE_TYPE_OBJECT = eINSTANCE.getModeTypeObject();

        /**
         * The meta object literal for the '<em>Mode Type Object1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ModeType1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getModeTypeObject1()
         * @generated
         */
        EDataType MODE_TYPE_OBJECT1 = eINSTANCE.getModeTypeObject1();

        /**
         * The meta object literal for the '<em>Namespace List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNamespaceList()
         * @generated
         */
        EDataType NAMESPACE_LIST = eINSTANCE.getNamespaceList();

        /**
         * The meta object literal for the '<em>Not Namespace Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getNotNamespaceType()
         * @generated
         */
        EDataType NOT_NAMESPACE_TYPE = eINSTANCE.getNotNamespaceType();

        /**
         * The meta object literal for the '<em>Process Contents Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ProcessContentsType
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getProcessContentsTypeObject()
         * @generated
         */
        EDataType PROCESS_CONTENTS_TYPE_OBJECT = eINSTANCE.getProcessContentsTypeObject();

        /**
         * The meta object literal for the '<em>Public</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getPublic()
         * @generated
         */
        EDataType PUBLIC = eINSTANCE.getPublic();

        /**
         * The meta object literal for the '<em>Qname List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameList()
         * @generated
         */
        EDataType QNAME_LIST = eINSTANCE.getQnameList();

        /**
         * The meta object literal for the '<em>Qname List A</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListA()
         * @generated
         */
        EDataType QNAME_LIST_A = eINSTANCE.getQnameListA();

        /**
         * The meta object literal for the '<em>Qname List AItem</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListAItem()
         * @generated
         */
        EDataType QNAME_LIST_AITEM = eINSTANCE.getQnameListAItem();

        /**
         * The meta object literal for the '<em>Qname List AItem Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.QnameListAItemMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListAItemMember1Object()
         * @generated
         */
        EDataType QNAME_LIST_AITEM_MEMBER1_OBJECT = eINSTANCE.getQnameListAItemMember1Object();

        /**
         * The meta object literal for the '<em>Qname List Item</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListItem()
         * @generated
         */
        EDataType QNAME_LIST_ITEM = eINSTANCE.getQnameListItem();

        /**
         * The meta object literal for the '<em>Qname List Item Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.QnameListItemMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getQnameListItemMember1Object()
         * @generated
         */
        EDataType QNAME_LIST_ITEM_MEMBER1_OBJECT = eINSTANCE.getQnameListItemMember1Object();

        /**
         * The meta object literal for the '<em>Reduced Derivation Control Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.ReducedDerivationControl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getReducedDerivationControlObject()
         * @generated
         */
        EDataType REDUCED_DERIVATION_CONTROL_OBJECT = eINSTANCE.getReducedDerivationControlObject();

        /**
         * The meta object literal for the '<em>Simple Derivation Set</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSet()
         * @generated
         */
        EDataType SIMPLE_DERIVATION_SET = eINSTANCE.getSimpleDerivationSet();

        /**
         * The meta object literal for the '<em>Simple Derivation Set Member0 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.SimpleDerivationSetMember0
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember0Object()
         * @generated
         */
        EDataType SIMPLE_DERIVATION_SET_MEMBER0_OBJECT = eINSTANCE.getSimpleDerivationSetMember0Object();

        /**
         * The meta object literal for the '<em>Simple Derivation Set Member1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember1()
         * @generated
         */
        EDataType SIMPLE_DERIVATION_SET_MEMBER1 = eINSTANCE.getSimpleDerivationSetMember1();

        /**
         * The meta object literal for the '<em>Simple Derivation Set Member1 Item Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.SimpleDerivationSetMember1Item
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSimpleDerivationSetMember1ItemObject()
         * @generated
         */
        EDataType SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT = eINSTANCE.getSimpleDerivationSetMember1ItemObject();

        /**
         * The meta object literal for the '<em>Special Namespace List Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.SpecialNamespaceList
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSpecialNamespaceListObject()
         * @generated
         */
        EDataType SPECIAL_NAMESPACE_LIST_OBJECT = eINSTANCE.getSpecialNamespaceListObject();

        /**
         * The meta object literal for the '<em>Substitution Group Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getSubstitutionGroupType()
         * @generated
         */
        EDataType SUBSTITUTION_GROUP_TYPE = eINSTANCE.getSubstitutionGroupType();

        /**
         * The meta object literal for the '<em>Type Derivation Control Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.TypeDerivationControl
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getTypeDerivationControlObject()
         * @generated
         */
        EDataType TYPE_DERIVATION_CONTROL_OBJECT = eINSTANCE.getTypeDerivationControlObject();

        /**
         * The meta object literal for the '<em>Use Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.UseType
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getUseTypeObject()
         * @generated
         */
        EDataType USE_TYPE_OBJECT = eINSTANCE.getUseTypeObject();

        /**
         * The meta object literal for the '<em>Xpath Default Namespace</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathDefaultNamespace()
         * @generated
         */
        EDataType XPATH_DEFAULT_NAMESPACE = eINSTANCE.getXpathDefaultNamespace();

        /**
         * The meta object literal for the '<em>Xpath Default Namespace Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.w3._2001.xml.schema.XpathDefaultNamespaceMember1
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathDefaultNamespaceMember1Object()
         * @generated
         */
        EDataType XPATH_DEFAULT_NAMESPACE_MEMBER1_OBJECT = eINSTANCE.getXpathDefaultNamespaceMember1Object();

        /**
         * The meta object literal for the '<em>Xpath Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathType()
         * @generated
         */
        EDataType XPATH_TYPE = eINSTANCE.getXpathType();

        /**
         * The meta object literal for the '<em>Xpath Type1</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.w3._2001.xml.schema.impl.XMLSchema11PackageImpl#getXpathType1()
         * @generated
         */
        EDataType XPATH_TYPE1 = eINSTANCE.getXpathType1();

    }

} //XMLSchema11Package
