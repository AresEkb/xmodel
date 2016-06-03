/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getByteOrderMark <em>Byte Order Mark</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getCdataSectionElements <em>Cdata Section Elements</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getDoctypePublic <em>Doctype Public</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getDoctypeSystem <em>Doctype System</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getIncludeContentType <em>Include Content Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getIndent <em>Indent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getNormalizationForm <em>Normalization Form</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getStandalone <em>Standalone</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getUseCharacterMaps <em>Use Character Maps</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.OutputType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType()
 * @model extendedMetaData="name='output_._type' kind='mixed'"
 * @generated
 */
public interface OutputType extends GenericElementType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_Name()
	 * @model dataType="org.w3._1999.xsl.transform.QName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Object)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_Method()
	 * @model dataType="org.w3._1999.xsl.transform.Method"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

	/**
	 * Returns the value of the '<em><b>Byte Order Mark</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Order Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Order Mark</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetByteOrderMark()
	 * @see #unsetByteOrderMark()
	 * @see #setByteOrderMark(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_ByteOrderMark()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='byte-order-mark'"
	 * @generated
	 */
	YesOrNo getByteOrderMark();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getByteOrderMark <em>Byte Order Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order Mark</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetByteOrderMark()
	 * @see #unsetByteOrderMark()
	 * @see #getByteOrderMark()
	 * @generated
	 */
	void setByteOrderMark(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getByteOrderMark <em>Byte Order Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrderMark()
	 * @see #getByteOrderMark()
	 * @see #setByteOrderMark(YesOrNo)
	 * @generated
	 */
	void unsetByteOrderMark();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getByteOrderMark <em>Byte Order Mark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byte Order Mark</em>' attribute is set.
	 * @see #unsetByteOrderMark()
	 * @see #getByteOrderMark()
	 * @see #setByteOrderMark(YesOrNo)
	 * @generated
	 */
	boolean isSetByteOrderMark();

	/**
	 * Returns the value of the '<em><b>Cdata Section Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdata Section Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdata Section Elements</em>' attribute.
	 * @see #setCdataSectionElements(List)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_CdataSectionElements()
	 * @model dataType="org.w3._1999.xsl.transform.QNames" many="false"
	 *        extendedMetaData="kind='attribute' name='cdata-section-elements'"
	 * @generated
	 */
	List<String> getCdataSectionElements();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getCdataSectionElements <em>Cdata Section Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdata Section Elements</em>' attribute.
	 * @see #getCdataSectionElements()
	 * @generated
	 */
	void setCdataSectionElements(List<String> value);

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_DoctypePublic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='doctype-public'"
	 * @generated
	 */
	String getDoctypePublic();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getDoctypePublic <em>Doctype Public</em>}' attribute.
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_DoctypeSystem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='doctype-system'"
	 * @generated
	 */
	String getDoctypeSystem();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getDoctypeSystem <em>Doctype System</em>}' attribute.
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Escape Uri Attributes</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape Uri Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Uri Attributes</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetEscapeUriAttributes()
	 * @see #unsetEscapeUriAttributes()
	 * @see #setEscapeUriAttributes(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_EscapeUriAttributes()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='escape-uri-attributes'"
	 * @generated
	 */
	YesOrNo getEscapeUriAttributes();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Uri Attributes</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetEscapeUriAttributes()
	 * @see #unsetEscapeUriAttributes()
	 * @see #getEscapeUriAttributes()
	 * @generated
	 */
	void setEscapeUriAttributes(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEscapeUriAttributes()
	 * @see #getEscapeUriAttributes()
	 * @see #setEscapeUriAttributes(YesOrNo)
	 * @generated
	 */
	void unsetEscapeUriAttributes();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getEscapeUriAttributes <em>Escape Uri Attributes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Escape Uri Attributes</em>' attribute is set.
	 * @see #unsetEscapeUriAttributes()
	 * @see #getEscapeUriAttributes()
	 * @see #setEscapeUriAttributes(YesOrNo)
	 * @generated
	 */
	boolean isSetEscapeUriAttributes();

	/**
	 * Returns the value of the '<em><b>Include Content Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Content Type</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetIncludeContentType()
	 * @see #unsetIncludeContentType()
	 * @see #setIncludeContentType(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_IncludeContentType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='include-content-type'"
	 * @generated
	 */
	YesOrNo getIncludeContentType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getIncludeContentType <em>Include Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Content Type</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetIncludeContentType()
	 * @see #unsetIncludeContentType()
	 * @see #getIncludeContentType()
	 * @generated
	 */
	void setIncludeContentType(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getIncludeContentType <em>Include Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeContentType()
	 * @see #getIncludeContentType()
	 * @see #setIncludeContentType(YesOrNo)
	 * @generated
	 */
	void unsetIncludeContentType();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getIncludeContentType <em>Include Content Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include Content Type</em>' attribute is set.
	 * @see #unsetIncludeContentType()
	 * @see #getIncludeContentType()
	 * @see #setIncludeContentType(YesOrNo)
	 * @generated
	 */
	boolean isSetIncludeContentType();

	/**
	 * Returns the value of the '<em><b>Indent</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indent</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetIndent()
	 * @see #unsetIndent()
	 * @see #setIndent(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_Indent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='indent'"
	 * @generated
	 */
	YesOrNo getIndent();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getIndent <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indent</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetIndent()
	 * @see #unsetIndent()
	 * @see #getIndent()
	 * @generated
	 */
	void setIndent(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getIndent <em>Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndent()
	 * @see #getIndent()
	 * @see #setIndent(YesOrNo)
	 * @generated
	 */
	void unsetIndent();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getIndent <em>Indent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indent</em>' attribute is set.
	 * @see #unsetIndent()
	 * @see #getIndent()
	 * @see #setIndent(YesOrNo)
	 * @generated
	 */
	boolean isSetIndent();

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_MediaType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getMediaType <em>Media Type</em>}' attribute.
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_NormalizationForm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='normalization-form'"
	 * @generated
	 */
	String getNormalizationForm();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getNormalizationForm <em>Normalization Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalization Form</em>' attribute.
	 * @see #getNormalizationForm()
	 * @generated
	 */
	void setNormalizationForm(String value);

	/**
	 * Returns the value of the '<em><b>Omit Xml Declaration</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Xml Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Xml Declaration</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetOmitXmlDeclaration()
	 * @see #unsetOmitXmlDeclaration()
	 * @see #setOmitXmlDeclaration(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_OmitXmlDeclaration()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='omit-xml-declaration'"
	 * @generated
	 */
	YesOrNo getOmitXmlDeclaration();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Xml Declaration</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetOmitXmlDeclaration()
	 * @see #unsetOmitXmlDeclaration()
	 * @see #getOmitXmlDeclaration()
	 * @generated
	 */
	void setOmitXmlDeclaration(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOmitXmlDeclaration()
	 * @see #getOmitXmlDeclaration()
	 * @see #setOmitXmlDeclaration(YesOrNo)
	 * @generated
	 */
	void unsetOmitXmlDeclaration();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getOmitXmlDeclaration <em>Omit Xml Declaration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Omit Xml Declaration</em>' attribute is set.
	 * @see #unsetOmitXmlDeclaration()
	 * @see #getOmitXmlDeclaration()
	 * @see #setOmitXmlDeclaration(YesOrNo)
	 * @generated
	 */
	boolean isSetOmitXmlDeclaration();

	/**
	 * Returns the value of the '<em><b>Standalone</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNoOrOmit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standalone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standalone</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
	 * @see #isSetStandalone()
	 * @see #unsetStandalone()
	 * @see #setStandalone(YesOrNoOrOmit)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_Standalone()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='standalone'"
	 * @generated
	 */
	YesOrNoOrOmit getStandalone();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getStandalone <em>Standalone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standalone</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNoOrOmit
	 * @see #isSetStandalone()
	 * @see #unsetStandalone()
	 * @see #getStandalone()
	 * @generated
	 */
	void setStandalone(YesOrNoOrOmit value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getStandalone <em>Standalone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandalone()
	 * @see #getStandalone()
	 * @see #setStandalone(YesOrNoOrOmit)
	 * @generated
	 */
	void unsetStandalone();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getStandalone <em>Standalone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standalone</em>' attribute is set.
	 * @see #unsetStandalone()
	 * @see #getStandalone()
	 * @see #setStandalone(YesOrNoOrOmit)
	 * @generated
	 */
	boolean isSetStandalone();

	/**
	 * Returns the value of the '<em><b>Undeclare Prefixes</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xsl.transform.YesOrNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeclare Prefixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeclare Prefixes</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetUndeclarePrefixes()
	 * @see #unsetUndeclarePrefixes()
	 * @see #setUndeclarePrefixes(YesOrNo)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_UndeclarePrefixes()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='undeclare-prefixes'"
	 * @generated
	 */
	YesOrNo getUndeclarePrefixes();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeclare Prefixes</em>' attribute.
	 * @see org.w3._1999.xsl.transform.YesOrNo
	 * @see #isSetUndeclarePrefixes()
	 * @see #unsetUndeclarePrefixes()
	 * @see #getUndeclarePrefixes()
	 * @generated
	 */
	void setUndeclarePrefixes(YesOrNo value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUndeclarePrefixes()
	 * @see #getUndeclarePrefixes()
	 * @see #setUndeclarePrefixes(YesOrNo)
	 * @generated
	 */
	void unsetUndeclarePrefixes();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.OutputType#getUndeclarePrefixes <em>Undeclare Prefixes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Undeclare Prefixes</em>' attribute is set.
	 * @see #unsetUndeclarePrefixes()
	 * @see #getUndeclarePrefixes()
	 * @see #setUndeclarePrefixes(YesOrNo)
	 * @generated
	 */
	boolean isSetUndeclarePrefixes();

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_UseCharacterMaps()
	 * @model dataType="org.w3._1999.xsl.transform.QNames" many="false"
	 *        extendedMetaData="kind='attribute' name='use-character-maps'"
	 * @generated
	 */
	List<String> getUseCharacterMaps();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getUseCharacterMaps <em>Use Character Maps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Character Maps</em>' attribute.
	 * @see #getUseCharacterMaps()
	 * @generated
	 */
	void setUseCharacterMaps(List<String> value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getOutputType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.OutputType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // OutputType
