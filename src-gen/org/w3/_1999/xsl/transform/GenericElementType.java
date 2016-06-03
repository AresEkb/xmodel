/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.GenericElementType#getDefaultCollation <em>Default Collation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.GenericElementType#getExcludeResultPrefixes <em>Exclude Result Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.GenericElementType#getExtensionElementPrefixes <em>Extension Element Prefixes</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.GenericElementType#getUseWhen <em>Use When</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.GenericElementType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.GenericElementType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType()
 * @model extendedMetaData="name='generic-element-type' kind='mixed'"
 * @generated
 */
public interface GenericElementType extends EObject, XMLTypeDocumentRoot {
	/**
	 * Returns the value of the '<em><b>Default Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Collation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Collation</em>' attribute.
	 * @see #setDefaultCollation(List)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType_DefaultCollation()
	 * @model dataType="org.w3._1999.xsl.transform.UriList" many="false"
	 *        extendedMetaData="kind='attribute' name='default-collation'"
	 * @generated
	 */
	List<String> getDefaultCollation();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.GenericElementType#getDefaultCollation <em>Default Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Collation</em>' attribute.
	 * @see #getDefaultCollation()
	 * @generated
	 */
	void setDefaultCollation(List<String> value);

	/**
	 * Returns the value of the '<em><b>Exclude Result Prefixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Result Prefixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Result Prefixes</em>' attribute.
	 * @see #setExcludeResultPrefixes(Object)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType_ExcludeResultPrefixes()
	 * @model dataType="org.w3._1999.xsl.transform.PrefixListOrAll"
	 *        extendedMetaData="kind='attribute' name='exclude-result-prefixes'"
	 * @generated
	 */
	Object getExcludeResultPrefixes();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.GenericElementType#getExcludeResultPrefixes <em>Exclude Result Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Result Prefixes</em>' attribute.
	 * @see #getExcludeResultPrefixes()
	 * @generated
	 */
	void setExcludeResultPrefixes(Object value);

	/**
	 * Returns the value of the '<em><b>Extension Element Prefixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Element Prefixes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Element Prefixes</em>' attribute.
	 * @see #setExtensionElementPrefixes(List)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType_ExtensionElementPrefixes()
	 * @model dataType="org.w3._1999.xsl.transform.PrefixList" many="false"
	 *        extendedMetaData="kind='attribute' name='extension-element-prefixes'"
	 * @generated
	 */
	List<Object> getExtensionElementPrefixes();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.GenericElementType#getExtensionElementPrefixes <em>Extension Element Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Element Prefixes</em>' attribute.
	 * @see #getExtensionElementPrefixes()
	 * @generated
	 */
	void setExtensionElementPrefixes(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Use When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use When</em>' attribute.
	 * @see #setUseWhen(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType_UseWhen()
	 * @model dataType="org.w3._1999.xsl.transform.Expression"
	 *        extendedMetaData="kind='attribute' name='use-when'"
	 * @generated
	 */
	String getUseWhen();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.GenericElementType#getUseWhen <em>Use When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use When</em>' attribute.
	 * @see #getUseWhen()
	 * @generated
	 */
	void setUseWhen(String value);

	/**
	 * Returns the value of the '<em><b>Xpath Default Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath Default Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath Default Namespace</em>' attribute.
	 * @see #setXpathDefaultNamespace(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType_XpathDefaultNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='xpath-default-namespace'"
	 * @generated
	 */
	String getXpathDefaultNamespace();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.GenericElementType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath Default Namespace</em>' attribute.
	 * @see #getXpathDefaultNamespace()
	 * @generated
	 */
	void setXpathDefaultNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getGenericElementType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // GenericElementType
