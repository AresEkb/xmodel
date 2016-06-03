/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getFormat <em>Format</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getValidation <em>Validation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getByteOrderMark <em>Byte Order Mark</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getCdataSectionElements <em>Cdata Section Elements</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getDoctypePublic <em>Doctype Public</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getDoctypeSystem <em>Doctype System</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getIncludeContentType <em>Include Content Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getIndent <em>Indent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getNormalizationForm <em>Normalization Form</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getStandalone <em>Standalone</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getUseCharacterMaps <em>Use Character Maps</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ResultDocumentType#getOutputVersion <em>Output Version</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType()
 * @model extendedMetaData="name='result-document_._type' kind='mixed'"
 * @generated
 */
public interface ResultDocumentType extends SequenceConstructor {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Format()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='format'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Href()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Type()
	 * @model dataType="org.w3._1999.xsl.transform.QName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.ValidationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' attribute.
	 * @see org.w3._1999.xsl.transform.ValidationType
	 * @see #isSetValidation()
	 * @see #unsetValidation()
	 * @see #setValidation(ValidationType)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Validation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='validation'"
	 * @generated
	 */
	ValidationType getValidation();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' attribute.
	 * @see org.w3._1999.xsl.transform.ValidationType
	 * @see #isSetValidation()
	 * @see #unsetValidation()
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(ValidationType value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidation()
	 * @see #getValidation()
	 * @see #setValidation(ValidationType)
	 * @generated
	 */
	void unsetValidation();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getValidation <em>Validation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validation</em>' attribute is set.
	 * @see #unsetValidation()
	 * @see #getValidation()
	 * @see #setValidation(ValidationType)
	 * @generated
	 */
	boolean isSetValidation();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Method()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Byte Order Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Order Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Order Mark</em>' attribute.
	 * @see #setByteOrderMark(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_ByteOrderMark()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='byte-order-mark'"
	 * @generated
	 */
	String getByteOrderMark();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getByteOrderMark <em>Byte Order Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order Mark</em>' attribute.
	 * @see #getByteOrderMark()
	 * @generated
	 */
	void setByteOrderMark(String value);

	/**
	 * Returns the value of the '<em><b>Cdata Section Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdata Section Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdata Section Elements</em>' attribute.
	 * @see #setCdataSectionElements(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_CdataSectionElements()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='cdata-section-elements'"
	 * @generated
	 */
	String getCdataSectionElements();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getCdataSectionElements <em>Cdata Section Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdata Section Elements</em>' attribute.
	 * @see #getCdataSectionElements()
	 * @generated
	 */
	void setCdataSectionElements(String value);

	/**
	 * Returns the value of the '<em><b>Doctype Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doctype Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctype Public</em>' attribute.
	 * @see #setDoctypePublic(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_DoctypePublic()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='doctype-public'"
	 * @generated
	 */
	String getDoctypePublic();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getDoctypePublic <em>Doctype Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctype Public</em>' attribute.
	 * @see #getDoctypePublic()
	 * @generated
	 */
	void setDoctypePublic(String value);

	/**
	 * Returns the value of the '<em><b>Doctype System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doctype System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctype System</em>' attribute.
	 * @see #setDoctypeSystem(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_DoctypeSystem()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='doctype-system'"
	 * @generated
	 */
	String getDoctypeSystem();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getDoctypeSystem <em>Doctype System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctype System</em>' attribute.
	 * @see #getDoctypeSystem()
	 * @generated
	 */
	void setDoctypeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Encoding()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Escape Uri Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape Uri Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Uri Attributes</em>' attribute.
	 * @see #setEscapeUriAttributes(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_EscapeUriAttributes()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='escape-uri-attributes'"
	 * @generated
	 */
	String getEscapeUriAttributes();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Uri Attributes</em>' attribute.
	 * @see #getEscapeUriAttributes()
	 * @generated
	 */
	void setEscapeUriAttributes(String value);

	/**
	 * Returns the value of the '<em><b>Include Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Content Type</em>' attribute.
	 * @see #setIncludeContentType(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_IncludeContentType()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='include-content-type'"
	 * @generated
	 */
	String getIncludeContentType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getIncludeContentType <em>Include Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Content Type</em>' attribute.
	 * @see #getIncludeContentType()
	 * @generated
	 */
	void setIncludeContentType(String value);

	/**
	 * Returns the value of the '<em><b>Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indent</em>' attribute.
	 * @see #setIndent(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Indent()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='indent'"
	 * @generated
	 */
	String getIndent();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getIndent <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indent</em>' attribute.
	 * @see #getIndent()
	 * @generated
	 */
	void setIndent(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_MediaType()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Normalization Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalization Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalization Form</em>' attribute.
	 * @see #setNormalizationForm(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_NormalizationForm()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='normalization-form'"
	 * @generated
	 */
	String getNormalizationForm();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getNormalizationForm <em>Normalization Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalization Form</em>' attribute.
	 * @see #getNormalizationForm()
	 * @generated
	 */
	void setNormalizationForm(String value);

	/**
	 * Returns the value of the '<em><b>Omit Xml Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Xml Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Xml Declaration</em>' attribute.
	 * @see #setOmitXmlDeclaration(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_OmitXmlDeclaration()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='omit-xml-declaration'"
	 * @generated
	 */
	String getOmitXmlDeclaration();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Xml Declaration</em>' attribute.
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 */
	void setOmitXmlDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Standalone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standalone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standalone</em>' attribute.
	 * @see #setStandalone(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_Standalone()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='standalone'"
	 * @generated
	 */
	String getStandalone();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getStandalone <em>Standalone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standalone</em>' attribute.
	 * @see #getStandalone()
	 * @generated
	 */
	void setStandalone(String value);

	/**
	 * Returns the value of the '<em><b>Undeclare Prefixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeclare Prefixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeclare Prefixes</em>' attribute.
	 * @see #setUndeclarePrefixes(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_UndeclarePrefixes()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='undeclare-prefixes'"
	 * @generated
	 */
	String getUndeclarePrefixes();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeclare Prefixes</em>' attribute.
	 * @see #getUndeclarePrefixes()
	 * @generated
	 */
	void setUndeclarePrefixes(String value);

	/**
	 * Returns the value of the '<em><b>Use Character Maps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Character Maps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Character Maps</em>' attribute.
	 * @see #setUseCharacterMaps(List)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_UseCharacterMaps()
	 * @model dataType="org.w3._1999.xsl.transform.QNames" many="false"
	 *        extendedMetaData="kind='attribute' name='use-character-maps'"
	 * @generated
	 */
	List<String> getUseCharacterMaps();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getUseCharacterMaps <em>Use Character Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Character Maps</em>' attribute.
	 * @see #getUseCharacterMaps()
	 * @generated
	 */
	void setUseCharacterMaps(List<String> value);

	/**
	 * Returns the value of the '<em><b>Output Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Version</em>' attribute.
	 * @see #setOutputVersion(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getResultDocumentType_OutputVersion()
	 * @model dataType="org.w3._1999.xsl.transform.Avt"
	 *        extendedMetaData="kind='attribute' name='output-version'"
	 * @generated
	 */
	String getOutputVersion();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ResultDocumentType#getOutputVersion <em>Output Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Version</em>' attribute.
	 * @see #getOutputVersion()
	 * @generated
	 */
	void setOutputVersion(String value);

} // ResultDocumentType
