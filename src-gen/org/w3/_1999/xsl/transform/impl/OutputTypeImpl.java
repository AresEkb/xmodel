/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.OutputType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;
import org.w3._1999.xsl.transform.YesOrNoOrOmit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getByteOrderMark <em>Byte Order Mark</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getCdataSectionElements <em>Cdata Section Elements</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getDoctypePublic <em>Doctype Public</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getDoctypeSystem <em>Doctype System</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getEscapeUriAttributes <em>Escape Uri Attributes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getIncludeContentType <em>Include Content Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getIndent <em>Indent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getNormalizationForm <em>Normalization Form</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getStandalone <em>Standalone</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getUndeclarePrefixes <em>Undeclare Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getUseCharacterMaps <em>Use Character Maps</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputTypeImpl extends GenericElementTypeImpl implements OutputType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Object METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Object method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteOrderMark() <em>Byte Order Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrderMark()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo BYTE_ORDER_MARK_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getByteOrderMark() <em>Byte Order Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrderMark()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo byteOrderMark = BYTE_ORDER_MARK_EDEFAULT;

	/**
	 * This is true if the Byte Order Mark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean byteOrderMarkESet;

	/**
	 * The default value of the '{@link #getCdataSectionElements() <em>Cdata Section Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdataSectionElements()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CDATA_SECTION_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdataSectionElements() <em>Cdata Section Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdataSectionElements()
	 * @generated
	 * @ordered
	 */
	protected List<String> cdataSectionElements = CDATA_SECTION_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoctypePublic() <em>Doctype Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctypePublic()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCTYPE_PUBLIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoctypePublic() <em>Doctype Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctypePublic()
	 * @generated
	 * @ordered
	 */
	protected String doctypePublic = DOCTYPE_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoctypeSystem() <em>Doctype System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctypeSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCTYPE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoctypeSystem() <em>Doctype System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctypeSystem()
	 * @generated
	 * @ordered
	 */
	protected String doctypeSystem = DOCTYPE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscapeUriAttributes() <em>Escape Uri Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeUriAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo ESCAPE_URI_ATTRIBUTES_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getEscapeUriAttributes() <em>Escape Uri Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeUriAttributes()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo escapeUriAttributes = ESCAPE_URI_ATTRIBUTES_EDEFAULT;

	/**
	 * This is true if the Escape Uri Attributes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean escapeUriAttributesESet;

	/**
	 * The default value of the '{@link #getIncludeContentType() <em>Include Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeContentType()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo INCLUDE_CONTENT_TYPE_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getIncludeContentType() <em>Include Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeContentType()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo includeContentType = INCLUDE_CONTENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Include Content Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeContentTypeESet;

	/**
	 * The default value of the '{@link #getIndent() <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndent()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo INDENT_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getIndent() <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndent()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo indent = INDENT_EDEFAULT;

	/**
	 * This is true if the Indent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indentESet;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalizationForm() <em>Normalization Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizationForm()
	 * @generated
	 * @ordered
	 */
	protected static final String NORMALIZATION_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalizationForm() <em>Normalization Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizationForm()
	 * @generated
	 * @ordered
	 */
	protected String normalizationForm = NORMALIZATION_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOmitXmlDeclaration() <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo OMIT_XML_DECLARATION_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getOmitXmlDeclaration() <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo omitXmlDeclaration = OMIT_XML_DECLARATION_EDEFAULT;

	/**
	 * This is true if the Omit Xml Declaration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean omitXmlDeclarationESet;

	/**
	 * The default value of the '{@link #getStandalone() <em>Standalone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandalone()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNoOrOmit STANDALONE_EDEFAULT = YesOrNoOrOmit.YES;

	/**
	 * The cached value of the '{@link #getStandalone() <em>Standalone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandalone()
	 * @generated
	 * @ordered
	 */
	protected YesOrNoOrOmit standalone = STANDALONE_EDEFAULT;

	/**
	 * This is true if the Standalone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standaloneESet;

	/**
	 * The default value of the '{@link #getUndeclarePrefixes() <em>Undeclare Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndeclarePrefixes()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo UNDECLARE_PREFIXES_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getUndeclarePrefixes() <em>Undeclare Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndeclarePrefixes()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo undeclarePrefixes = UNDECLARE_PREFIXES_EDEFAULT;

	/**
	 * This is true if the Undeclare Prefixes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean undeclarePrefixesESet;

	/**
	 * The default value of the '{@link #getUseCharacterMaps() <em>Use Character Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCharacterMaps()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> USE_CHARACTER_MAPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCharacterMaps() <em>Use Character Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCharacterMaps()
	 * @generated
	 * @ordered
	 */
	protected List<String> useCharacterMaps = USE_CHARACTER_MAPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.OUTPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Object newMethod) {
		Object oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getByteOrderMark() {
		return byteOrderMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteOrderMark(YesOrNo newByteOrderMark) {
		YesOrNo oldByteOrderMark = byteOrderMark;
		byteOrderMark = newByteOrderMark == null ? BYTE_ORDER_MARK_EDEFAULT : newByteOrderMark;
		boolean oldByteOrderMarkESet = byteOrderMarkESet;
		byteOrderMarkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__BYTE_ORDER_MARK, oldByteOrderMark, byteOrderMark, !oldByteOrderMarkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetByteOrderMark() {
		YesOrNo oldByteOrderMark = byteOrderMark;
		boolean oldByteOrderMarkESet = byteOrderMarkESet;
		byteOrderMark = BYTE_ORDER_MARK_EDEFAULT;
		byteOrderMarkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__BYTE_ORDER_MARK, oldByteOrderMark, BYTE_ORDER_MARK_EDEFAULT, oldByteOrderMarkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetByteOrderMark() {
		return byteOrderMarkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getCdataSectionElements() {
		return cdataSectionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdataSectionElements(List<String> newCdataSectionElements) {
		List<String> oldCdataSectionElements = cdataSectionElements;
		cdataSectionElements = newCdataSectionElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__CDATA_SECTION_ELEMENTS, oldCdataSectionElements, cdataSectionElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoctypePublic() {
		return doctypePublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoctypePublic(String newDoctypePublic) {
		String oldDoctypePublic = doctypePublic;
		doctypePublic = newDoctypePublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__DOCTYPE_PUBLIC, oldDoctypePublic, doctypePublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoctypeSystem() {
		return doctypeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoctypeSystem(String newDoctypeSystem) {
		String oldDoctypeSystem = doctypeSystem;
		doctypeSystem = newDoctypeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__DOCTYPE_SYSTEM, oldDoctypeSystem, doctypeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getEscapeUriAttributes() {
		return escapeUriAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapeUriAttributes(YesOrNo newEscapeUriAttributes) {
		YesOrNo oldEscapeUriAttributes = escapeUriAttributes;
		escapeUriAttributes = newEscapeUriAttributes == null ? ESCAPE_URI_ATTRIBUTES_EDEFAULT : newEscapeUriAttributes;
		boolean oldEscapeUriAttributesESet = escapeUriAttributesESet;
		escapeUriAttributesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES, oldEscapeUriAttributes, escapeUriAttributes, !oldEscapeUriAttributesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEscapeUriAttributes() {
		YesOrNo oldEscapeUriAttributes = escapeUriAttributes;
		boolean oldEscapeUriAttributesESet = escapeUriAttributesESet;
		escapeUriAttributes = ESCAPE_URI_ATTRIBUTES_EDEFAULT;
		escapeUriAttributesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES, oldEscapeUriAttributes, ESCAPE_URI_ATTRIBUTES_EDEFAULT, oldEscapeUriAttributesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEscapeUriAttributes() {
		return escapeUriAttributesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getIncludeContentType() {
		return includeContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeContentType(YesOrNo newIncludeContentType) {
		YesOrNo oldIncludeContentType = includeContentType;
		includeContentType = newIncludeContentType == null ? INCLUDE_CONTENT_TYPE_EDEFAULT : newIncludeContentType;
		boolean oldIncludeContentTypeESet = includeContentTypeESet;
		includeContentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__INCLUDE_CONTENT_TYPE, oldIncludeContentType, includeContentType, !oldIncludeContentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeContentType() {
		YesOrNo oldIncludeContentType = includeContentType;
		boolean oldIncludeContentTypeESet = includeContentTypeESet;
		includeContentType = INCLUDE_CONTENT_TYPE_EDEFAULT;
		includeContentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__INCLUDE_CONTENT_TYPE, oldIncludeContentType, INCLUDE_CONTENT_TYPE_EDEFAULT, oldIncludeContentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeContentType() {
		return includeContentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getIndent() {
		return indent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndent(YesOrNo newIndent) {
		YesOrNo oldIndent = indent;
		indent = newIndent == null ? INDENT_EDEFAULT : newIndent;
		boolean oldIndentESet = indentESet;
		indentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__INDENT, oldIndent, indent, !oldIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndent() {
		YesOrNo oldIndent = indent;
		boolean oldIndentESet = indentESet;
		indent = INDENT_EDEFAULT;
		indentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__INDENT, oldIndent, INDENT_EDEFAULT, oldIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndent() {
		return indentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNormalizationForm() {
		return normalizationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizationForm(String newNormalizationForm) {
		String oldNormalizationForm = normalizationForm;
		normalizationForm = newNormalizationForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__NORMALIZATION_FORM, oldNormalizationForm, normalizationForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getOmitXmlDeclaration() {
		return omitXmlDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitXmlDeclaration(YesOrNo newOmitXmlDeclaration) {
		YesOrNo oldOmitXmlDeclaration = omitXmlDeclaration;
		omitXmlDeclaration = newOmitXmlDeclaration == null ? OMIT_XML_DECLARATION_EDEFAULT : newOmitXmlDeclaration;
		boolean oldOmitXmlDeclarationESet = omitXmlDeclarationESet;
		omitXmlDeclarationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__OMIT_XML_DECLARATION, oldOmitXmlDeclaration, omitXmlDeclaration, !oldOmitXmlDeclarationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOmitXmlDeclaration() {
		YesOrNo oldOmitXmlDeclaration = omitXmlDeclaration;
		boolean oldOmitXmlDeclarationESet = omitXmlDeclarationESet;
		omitXmlDeclaration = OMIT_XML_DECLARATION_EDEFAULT;
		omitXmlDeclarationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__OMIT_XML_DECLARATION, oldOmitXmlDeclaration, OMIT_XML_DECLARATION_EDEFAULT, oldOmitXmlDeclarationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOmitXmlDeclaration() {
		return omitXmlDeclarationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNoOrOmit getStandalone() {
		return standalone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandalone(YesOrNoOrOmit newStandalone) {
		YesOrNoOrOmit oldStandalone = standalone;
		standalone = newStandalone == null ? STANDALONE_EDEFAULT : newStandalone;
		boolean oldStandaloneESet = standaloneESet;
		standaloneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__STANDALONE, oldStandalone, standalone, !oldStandaloneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStandalone() {
		YesOrNoOrOmit oldStandalone = standalone;
		boolean oldStandaloneESet = standaloneESet;
		standalone = STANDALONE_EDEFAULT;
		standaloneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__STANDALONE, oldStandalone, STANDALONE_EDEFAULT, oldStandaloneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStandalone() {
		return standaloneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getUndeclarePrefixes() {
		return undeclarePrefixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndeclarePrefixes(YesOrNo newUndeclarePrefixes) {
		YesOrNo oldUndeclarePrefixes = undeclarePrefixes;
		undeclarePrefixes = newUndeclarePrefixes == null ? UNDECLARE_PREFIXES_EDEFAULT : newUndeclarePrefixes;
		boolean oldUndeclarePrefixesESet = undeclarePrefixesESet;
		undeclarePrefixesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__UNDECLARE_PREFIXES, oldUndeclarePrefixes, undeclarePrefixes, !oldUndeclarePrefixesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUndeclarePrefixes() {
		YesOrNo oldUndeclarePrefixes = undeclarePrefixes;
		boolean oldUndeclarePrefixesESet = undeclarePrefixesESet;
		undeclarePrefixes = UNDECLARE_PREFIXES_EDEFAULT;
		undeclarePrefixesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.OUTPUT_TYPE__UNDECLARE_PREFIXES, oldUndeclarePrefixes, UNDECLARE_PREFIXES_EDEFAULT, oldUndeclarePrefixesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUndeclarePrefixes() {
		return undeclarePrefixesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getUseCharacterMaps() {
		return useCharacterMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCharacterMaps(List<String> newUseCharacterMaps) {
		List<String> oldUseCharacterMaps = useCharacterMaps;
		useCharacterMaps = newUseCharacterMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__USE_CHARACTER_MAPS, oldUseCharacterMaps, useCharacterMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.OUTPUT_TYPE__NAME:
				return getName();
			case XSLT20Package.OUTPUT_TYPE__METHOD:
				return getMethod();
			case XSLT20Package.OUTPUT_TYPE__BYTE_ORDER_MARK:
				return getByteOrderMark();
			case XSLT20Package.OUTPUT_TYPE__CDATA_SECTION_ELEMENTS:
				return getCdataSectionElements();
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_PUBLIC:
				return getDoctypePublic();
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_SYSTEM:
				return getDoctypeSystem();
			case XSLT20Package.OUTPUT_TYPE__ENCODING:
				return getEncoding();
			case XSLT20Package.OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES:
				return getEscapeUriAttributes();
			case XSLT20Package.OUTPUT_TYPE__INCLUDE_CONTENT_TYPE:
				return getIncludeContentType();
			case XSLT20Package.OUTPUT_TYPE__INDENT:
				return getIndent();
			case XSLT20Package.OUTPUT_TYPE__MEDIA_TYPE:
				return getMediaType();
			case XSLT20Package.OUTPUT_TYPE__NORMALIZATION_FORM:
				return getNormalizationForm();
			case XSLT20Package.OUTPUT_TYPE__OMIT_XML_DECLARATION:
				return getOmitXmlDeclaration();
			case XSLT20Package.OUTPUT_TYPE__STANDALONE:
				return getStandalone();
			case XSLT20Package.OUTPUT_TYPE__UNDECLARE_PREFIXES:
				return getUndeclarePrefixes();
			case XSLT20Package.OUTPUT_TYPE__USE_CHARACTER_MAPS:
				return getUseCharacterMaps();
			case XSLT20Package.OUTPUT_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XSLT20Package.OUTPUT_TYPE__NAME:
				setName((String)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__METHOD:
				setMethod(newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__BYTE_ORDER_MARK:
				setByteOrderMark((YesOrNo)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__CDATA_SECTION_ELEMENTS:
				setCdataSectionElements((List<String>)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_PUBLIC:
				setDoctypePublic((String)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_SYSTEM:
				setDoctypeSystem((String)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES:
				setEscapeUriAttributes((YesOrNo)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__INCLUDE_CONTENT_TYPE:
				setIncludeContentType((YesOrNo)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__INDENT:
				setIndent((YesOrNo)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__MEDIA_TYPE:
				setMediaType((String)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__NORMALIZATION_FORM:
				setNormalizationForm((String)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__OMIT_XML_DECLARATION:
				setOmitXmlDeclaration((YesOrNo)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__STANDALONE:
				setStandalone((YesOrNoOrOmit)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__UNDECLARE_PREFIXES:
				setUndeclarePrefixes((YesOrNo)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__USE_CHARACTER_MAPS:
				setUseCharacterMaps((List<String>)newValue);
				return;
			case XSLT20Package.OUTPUT_TYPE__VERSION:
				setVersion((String)newValue);
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
			case XSLT20Package.OUTPUT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__BYTE_ORDER_MARK:
				unsetByteOrderMark();
				return;
			case XSLT20Package.OUTPUT_TYPE__CDATA_SECTION_ELEMENTS:
				setCdataSectionElements(CDATA_SECTION_ELEMENTS_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_PUBLIC:
				setDoctypePublic(DOCTYPE_PUBLIC_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_SYSTEM:
				setDoctypeSystem(DOCTYPE_SYSTEM_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES:
				unsetEscapeUriAttributes();
				return;
			case XSLT20Package.OUTPUT_TYPE__INCLUDE_CONTENT_TYPE:
				unsetIncludeContentType();
				return;
			case XSLT20Package.OUTPUT_TYPE__INDENT:
				unsetIndent();
				return;
			case XSLT20Package.OUTPUT_TYPE__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__NORMALIZATION_FORM:
				setNormalizationForm(NORMALIZATION_FORM_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__OMIT_XML_DECLARATION:
				unsetOmitXmlDeclaration();
				return;
			case XSLT20Package.OUTPUT_TYPE__STANDALONE:
				unsetStandalone();
				return;
			case XSLT20Package.OUTPUT_TYPE__UNDECLARE_PREFIXES:
				unsetUndeclarePrefixes();
				return;
			case XSLT20Package.OUTPUT_TYPE__USE_CHARACTER_MAPS:
				setUseCharacterMaps(USE_CHARACTER_MAPS_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case XSLT20Package.OUTPUT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSLT20Package.OUTPUT_TYPE__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case XSLT20Package.OUTPUT_TYPE__BYTE_ORDER_MARK:
				return isSetByteOrderMark();
			case XSLT20Package.OUTPUT_TYPE__CDATA_SECTION_ELEMENTS:
				return CDATA_SECTION_ELEMENTS_EDEFAULT == null ? cdataSectionElements != null : !CDATA_SECTION_ELEMENTS_EDEFAULT.equals(cdataSectionElements);
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_PUBLIC:
				return DOCTYPE_PUBLIC_EDEFAULT == null ? doctypePublic != null : !DOCTYPE_PUBLIC_EDEFAULT.equals(doctypePublic);
			case XSLT20Package.OUTPUT_TYPE__DOCTYPE_SYSTEM:
				return DOCTYPE_SYSTEM_EDEFAULT == null ? doctypeSystem != null : !DOCTYPE_SYSTEM_EDEFAULT.equals(doctypeSystem);
			case XSLT20Package.OUTPUT_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case XSLT20Package.OUTPUT_TYPE__ESCAPE_URI_ATTRIBUTES:
				return isSetEscapeUriAttributes();
			case XSLT20Package.OUTPUT_TYPE__INCLUDE_CONTENT_TYPE:
				return isSetIncludeContentType();
			case XSLT20Package.OUTPUT_TYPE__INDENT:
				return isSetIndent();
			case XSLT20Package.OUTPUT_TYPE__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
			case XSLT20Package.OUTPUT_TYPE__NORMALIZATION_FORM:
				return NORMALIZATION_FORM_EDEFAULT == null ? normalizationForm != null : !NORMALIZATION_FORM_EDEFAULT.equals(normalizationForm);
			case XSLT20Package.OUTPUT_TYPE__OMIT_XML_DECLARATION:
				return isSetOmitXmlDeclaration();
			case XSLT20Package.OUTPUT_TYPE__STANDALONE:
				return isSetStandalone();
			case XSLT20Package.OUTPUT_TYPE__UNDECLARE_PREFIXES:
				return isSetUndeclarePrefixes();
			case XSLT20Package.OUTPUT_TYPE__USE_CHARACTER_MAPS:
				return USE_CHARACTER_MAPS_EDEFAULT == null ? useCharacterMaps != null : !USE_CHARACTER_MAPS_EDEFAULT.equals(useCharacterMaps);
			case XSLT20Package.OUTPUT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", method: ");
		result.append(method);
		result.append(", byteOrderMark: ");
		if (byteOrderMarkESet) result.append(byteOrderMark); else result.append("<unset>");
		result.append(", cdataSectionElements: ");
		result.append(cdataSectionElements);
		result.append(", doctypePublic: ");
		result.append(doctypePublic);
		result.append(", doctypeSystem: ");
		result.append(doctypeSystem);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", escapeUriAttributes: ");
		if (escapeUriAttributesESet) result.append(escapeUriAttributes); else result.append("<unset>");
		result.append(", includeContentType: ");
		if (includeContentTypeESet) result.append(includeContentType); else result.append("<unset>");
		result.append(", indent: ");
		if (indentESet) result.append(indent); else result.append("<unset>");
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(", normalizationForm: ");
		result.append(normalizationForm);
		result.append(", omitXmlDeclaration: ");
		if (omitXmlDeclarationESet) result.append(omitXmlDeclaration); else result.append("<unset>");
		result.append(", standalone: ");
		if (standaloneESet) result.append(standalone); else result.append("<unset>");
		result.append(", undeclarePrefixes: ");
		if (undeclarePrefixesESet) result.append(undeclarePrefixes); else result.append("<unset>");
		result.append(", useCharacterMaps: ");
		result.append(useCharacterMaps);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OutputTypeImpl
