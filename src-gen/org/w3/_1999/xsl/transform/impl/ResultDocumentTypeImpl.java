/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.ResultDocumentType;
import org.w3._1999.xsl.transform.ValidationType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getByteOrderMark <em>Byte Order Mark</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getCdataSectionElements <em>Cdata Section Elements</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getDoctypePublic <em>Doctype Public</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getDoctypeSystem <em>Doctype System</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getEscapeUriAttributes <em>Escape Uri Attributes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getIncludeContentType <em>Include Content Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getIndent <em>Indent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getNormalizationForm <em>Normalization Form</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getStandalone <em>Standalone</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getUndeclarePrefixes <em>Undeclare Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getUseCharacterMaps <em>Use Character Maps</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ResultDocumentTypeImpl#getOutputVersion <em>Output Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultDocumentTypeImpl extends SequenceConstructorImpl implements ResultDocumentType {
    /**
     * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected static final String FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected String format = FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHref()
     * @generated
     * @ordered
     */
    protected static final String HREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHref()
     * @generated
     * @ordered
     */
    protected String href = HREF_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidation()
     * @generated
     * @ordered
     */
    protected static final ValidationType VALIDATION_EDEFAULT = ValidationType.STRICT;

    /**
     * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidation()
     * @generated
     * @ordered
     */
    protected ValidationType validation = VALIDATION_EDEFAULT;

    /**
     * This is true if the Validation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean validationESet;

    /**
     * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected static final String METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected String method = METHOD_EDEFAULT;

    /**
     * The default value of the '{@link #getByteOrderMark() <em>Byte Order Mark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getByteOrderMark()
     * @generated
     * @ordered
     */
    protected static final String BYTE_ORDER_MARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getByteOrderMark() <em>Byte Order Mark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getByteOrderMark()
     * @generated
     * @ordered
     */
    protected String byteOrderMark = BYTE_ORDER_MARK_EDEFAULT;

    /**
     * The default value of the '{@link #getCdataSectionElements() <em>Cdata Section Elements</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdataSectionElements()
     * @generated
     * @ordered
     */
    protected static final String CDATA_SECTION_ELEMENTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCdataSectionElements() <em>Cdata Section Elements</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdataSectionElements()
     * @generated
     * @ordered
     */
    protected String cdataSectionElements = CDATA_SECTION_ELEMENTS_EDEFAULT;

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
    protected static final String ESCAPE_URI_ATTRIBUTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEscapeUriAttributes() <em>Escape Uri Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEscapeUriAttributes()
     * @generated
     * @ordered
     */
    protected String escapeUriAttributes = ESCAPE_URI_ATTRIBUTES_EDEFAULT;

    /**
     * The default value of the '{@link #getIncludeContentType() <em>Include Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncludeContentType()
     * @generated
     * @ordered
     */
    protected static final String INCLUDE_CONTENT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIncludeContentType() <em>Include Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncludeContentType()
     * @generated
     * @ordered
     */
    protected String includeContentType = INCLUDE_CONTENT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getIndent() <em>Indent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndent()
     * @generated
     * @ordered
     */
    protected static final String INDENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIndent() <em>Indent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndent()
     * @generated
     * @ordered
     */
    protected String indent = INDENT_EDEFAULT;

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
    protected static final String OMIT_XML_DECLARATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmitXmlDeclaration() <em>Omit Xml Declaration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmitXmlDeclaration()
     * @generated
     * @ordered
     */
    protected String omitXmlDeclaration = OMIT_XML_DECLARATION_EDEFAULT;

    /**
     * The default value of the '{@link #getStandalone() <em>Standalone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandalone()
     * @generated
     * @ordered
     */
    protected static final String STANDALONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStandalone() <em>Standalone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandalone()
     * @generated
     * @ordered
     */
    protected String standalone = STANDALONE_EDEFAULT;

    /**
     * The default value of the '{@link #getUndeclarePrefixes() <em>Undeclare Prefixes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUndeclarePrefixes()
     * @generated
     * @ordered
     */
    protected static final String UNDECLARE_PREFIXES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUndeclarePrefixes() <em>Undeclare Prefixes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUndeclarePrefixes()
     * @generated
     * @ordered
     */
    protected String undeclarePrefixes = UNDECLARE_PREFIXES_EDEFAULT;

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
     * The default value of the '{@link #getOutputVersion() <em>Output Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputVersion()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputVersion() <em>Output Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputVersion()
     * @generated
     * @ordered
     */
    protected String outputVersion = OUTPUT_VERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResultDocumentTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.RESULT_DOCUMENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFormat() {
        return format;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormat(String newFormat) {
        String oldFormat = format;
        format = newFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__FORMAT, oldFormat, format));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHref() {
        return href;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHref(String newHref) {
        String oldHref = href;
        href = newHref;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__HREF, oldHref, href));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationType getValidation() {
        return validation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidation(ValidationType newValidation) {
        ValidationType oldValidation = validation;
        validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
        boolean oldValidationESet = validationESet;
        validationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__VALIDATION, oldValidation, validation, !oldValidationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValidation() {
        ValidationType oldValidation = validation;
        boolean oldValidationESet = validationESet;
        validation = VALIDATION_EDEFAULT;
        validationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.RESULT_DOCUMENT_TYPE__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValidation() {
        return validationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMethod() {
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMethod(String newMethod) {
        String oldMethod = method;
        method = newMethod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__METHOD, oldMethod, method));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getByteOrderMark() {
        return byteOrderMark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setByteOrderMark(String newByteOrderMark) {
        String oldByteOrderMark = byteOrderMark;
        byteOrderMark = newByteOrderMark;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK, oldByteOrderMark, byteOrderMark));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCdataSectionElements() {
        return cdataSectionElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCdataSectionElements(String newCdataSectionElements) {
        String oldCdataSectionElements = cdataSectionElements;
        cdataSectionElements = newCdataSectionElements;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS, oldCdataSectionElements, cdataSectionElements));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC, oldDoctypePublic, doctypePublic));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM, oldDoctypeSystem, doctypeSystem));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__ENCODING, oldEncoding, encoding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEscapeUriAttributes() {
        return escapeUriAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEscapeUriAttributes(String newEscapeUriAttributes) {
        String oldEscapeUriAttributes = escapeUriAttributes;
        escapeUriAttributes = newEscapeUriAttributes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES, oldEscapeUriAttributes, escapeUriAttributes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIncludeContentType() {
        return includeContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncludeContentType(String newIncludeContentType) {
        String oldIncludeContentType = includeContentType;
        includeContentType = newIncludeContentType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE, oldIncludeContentType, includeContentType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIndent() {
        return indent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIndent(String newIndent) {
        String oldIndent = indent;
        indent = newIndent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__INDENT, oldIndent, indent));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__MEDIA_TYPE, oldMediaType, mediaType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM, oldNormalizationForm, normalizationForm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOmitXmlDeclaration() {
        return omitXmlDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOmitXmlDeclaration(String newOmitXmlDeclaration) {
        String oldOmitXmlDeclaration = omitXmlDeclaration;
        omitXmlDeclaration = newOmitXmlDeclaration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION, oldOmitXmlDeclaration, omitXmlDeclaration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStandalone() {
        return standalone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStandalone(String newStandalone) {
        String oldStandalone = standalone;
        standalone = newStandalone;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__STANDALONE, oldStandalone, standalone));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUndeclarePrefixes() {
        return undeclarePrefixes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUndeclarePrefixes(String newUndeclarePrefixes) {
        String oldUndeclarePrefixes = undeclarePrefixes;
        undeclarePrefixes = newUndeclarePrefixes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES, oldUndeclarePrefixes, undeclarePrefixes));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS, oldUseCharacterMaps, useCharacterMaps));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOutputVersion() {
        return outputVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputVersion(String newOutputVersion) {
        String oldOutputVersion = outputVersion;
        outputVersion = newOutputVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.RESULT_DOCUMENT_TYPE__OUTPUT_VERSION, oldOutputVersion, outputVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XSLT20Package.RESULT_DOCUMENT_TYPE__FORMAT:
                return getFormat();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__HREF:
                return getHref();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__TYPE:
                return getType();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__VALIDATION:
                return getValidation();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__METHOD:
                return getMethod();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK:
                return getByteOrderMark();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS:
                return getCdataSectionElements();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC:
                return getDoctypePublic();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM:
                return getDoctypeSystem();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ENCODING:
                return getEncoding();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES:
                return getEscapeUriAttributes();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE:
                return getIncludeContentType();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INDENT:
                return getIndent();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__MEDIA_TYPE:
                return getMediaType();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM:
                return getNormalizationForm();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION:
                return getOmitXmlDeclaration();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__STANDALONE:
                return getStandalone();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES:
                return getUndeclarePrefixes();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS:
                return getUseCharacterMaps();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OUTPUT_VERSION:
                return getOutputVersion();
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
            case XSLT20Package.RESULT_DOCUMENT_TYPE__FORMAT:
                setFormat((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__HREF:
                setHref((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__TYPE:
                setType((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__VALIDATION:
                setValidation((ValidationType)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__METHOD:
                setMethod((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK:
                setByteOrderMark((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS:
                setCdataSectionElements((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC:
                setDoctypePublic((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM:
                setDoctypeSystem((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ENCODING:
                setEncoding((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES:
                setEscapeUriAttributes((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE:
                setIncludeContentType((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INDENT:
                setIndent((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__MEDIA_TYPE:
                setMediaType((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM:
                setNormalizationForm((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION:
                setOmitXmlDeclaration((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__STANDALONE:
                setStandalone((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES:
                setUndeclarePrefixes((String)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS:
                setUseCharacterMaps((List<String>)newValue);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OUTPUT_VERSION:
                setOutputVersion((String)newValue);
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
            case XSLT20Package.RESULT_DOCUMENT_TYPE__FORMAT:
                setFormat(FORMAT_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__HREF:
                setHref(HREF_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__VALIDATION:
                unsetValidation();
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__METHOD:
                setMethod(METHOD_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK:
                setByteOrderMark(BYTE_ORDER_MARK_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS:
                setCdataSectionElements(CDATA_SECTION_ELEMENTS_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC:
                setDoctypePublic(DOCTYPE_PUBLIC_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM:
                setDoctypeSystem(DOCTYPE_SYSTEM_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ENCODING:
                setEncoding(ENCODING_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES:
                setEscapeUriAttributes(ESCAPE_URI_ATTRIBUTES_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE:
                setIncludeContentType(INCLUDE_CONTENT_TYPE_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INDENT:
                setIndent(INDENT_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__MEDIA_TYPE:
                setMediaType(MEDIA_TYPE_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM:
                setNormalizationForm(NORMALIZATION_FORM_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION:
                setOmitXmlDeclaration(OMIT_XML_DECLARATION_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__STANDALONE:
                setStandalone(STANDALONE_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES:
                setUndeclarePrefixes(UNDECLARE_PREFIXES_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS:
                setUseCharacterMaps(USE_CHARACTER_MAPS_EDEFAULT);
                return;
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OUTPUT_VERSION:
                setOutputVersion(OUTPUT_VERSION_EDEFAULT);
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
            case XSLT20Package.RESULT_DOCUMENT_TYPE__FORMAT:
                return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__HREF:
                return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__VALIDATION:
                return isSetValidation();
            case XSLT20Package.RESULT_DOCUMENT_TYPE__METHOD:
                return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__BYTE_ORDER_MARK:
                return BYTE_ORDER_MARK_EDEFAULT == null ? byteOrderMark != null : !BYTE_ORDER_MARK_EDEFAULT.equals(byteOrderMark);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__CDATA_SECTION_ELEMENTS:
                return CDATA_SECTION_ELEMENTS_EDEFAULT == null ? cdataSectionElements != null : !CDATA_SECTION_ELEMENTS_EDEFAULT.equals(cdataSectionElements);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_PUBLIC:
                return DOCTYPE_PUBLIC_EDEFAULT == null ? doctypePublic != null : !DOCTYPE_PUBLIC_EDEFAULT.equals(doctypePublic);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__DOCTYPE_SYSTEM:
                return DOCTYPE_SYSTEM_EDEFAULT == null ? doctypeSystem != null : !DOCTYPE_SYSTEM_EDEFAULT.equals(doctypeSystem);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ENCODING:
                return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__ESCAPE_URI_ATTRIBUTES:
                return ESCAPE_URI_ATTRIBUTES_EDEFAULT == null ? escapeUriAttributes != null : !ESCAPE_URI_ATTRIBUTES_EDEFAULT.equals(escapeUriAttributes);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INCLUDE_CONTENT_TYPE:
                return INCLUDE_CONTENT_TYPE_EDEFAULT == null ? includeContentType != null : !INCLUDE_CONTENT_TYPE_EDEFAULT.equals(includeContentType);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__INDENT:
                return INDENT_EDEFAULT == null ? indent != null : !INDENT_EDEFAULT.equals(indent);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__MEDIA_TYPE:
                return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__NORMALIZATION_FORM:
                return NORMALIZATION_FORM_EDEFAULT == null ? normalizationForm != null : !NORMALIZATION_FORM_EDEFAULT.equals(normalizationForm);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OMIT_XML_DECLARATION:
                return OMIT_XML_DECLARATION_EDEFAULT == null ? omitXmlDeclaration != null : !OMIT_XML_DECLARATION_EDEFAULT.equals(omitXmlDeclaration);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__STANDALONE:
                return STANDALONE_EDEFAULT == null ? standalone != null : !STANDALONE_EDEFAULT.equals(standalone);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__UNDECLARE_PREFIXES:
                return UNDECLARE_PREFIXES_EDEFAULT == null ? undeclarePrefixes != null : !UNDECLARE_PREFIXES_EDEFAULT.equals(undeclarePrefixes);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__USE_CHARACTER_MAPS:
                return USE_CHARACTER_MAPS_EDEFAULT == null ? useCharacterMaps != null : !USE_CHARACTER_MAPS_EDEFAULT.equals(useCharacterMaps);
            case XSLT20Package.RESULT_DOCUMENT_TYPE__OUTPUT_VERSION:
                return OUTPUT_VERSION_EDEFAULT == null ? outputVersion != null : !OUTPUT_VERSION_EDEFAULT.equals(outputVersion);
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
        result.append(" (format: ");
        result.append(format);
        result.append(", href: ");
        result.append(href);
        result.append(", type: ");
        result.append(type);
        result.append(", validation: ");
        if (validationESet) result.append(validation); else result.append("<unset>");
        result.append(", method: ");
        result.append(method);
        result.append(", byteOrderMark: ");
        result.append(byteOrderMark);
        result.append(", cdataSectionElements: ");
        result.append(cdataSectionElements);
        result.append(", doctypePublic: ");
        result.append(doctypePublic);
        result.append(", doctypeSystem: ");
        result.append(doctypeSystem);
        result.append(", encoding: ");
        result.append(encoding);
        result.append(", escapeUriAttributes: ");
        result.append(escapeUriAttributes);
        result.append(", includeContentType: ");
        result.append(includeContentType);
        result.append(", indent: ");
        result.append(indent);
        result.append(", mediaType: ");
        result.append(mediaType);
        result.append(", normalizationForm: ");
        result.append(normalizationForm);
        result.append(", omitXmlDeclaration: ");
        result.append(omitXmlDeclaration);
        result.append(", standalone: ");
        result.append(standalone);
        result.append(", undeclarePrefixes: ");
        result.append(undeclarePrefixes);
        result.append(", useCharacterMaps: ");
        result.append(useCharacterMaps);
        result.append(", outputVersion: ");
        result.append(outputVersion);
        result.append(')');
        return result.toString();
    }

} //ResultDocumentTypeImpl
