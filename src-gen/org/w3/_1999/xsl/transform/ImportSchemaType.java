/**
 */
package org.w3._1999.xsl.transform;

import org.w3._2001.xml.schema.SchemaType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.ImportSchemaType#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ImportSchemaType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.ImportSchemaType#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getImportSchemaType()
 * @model extendedMetaData="name='import-schema_._type' kind='mixed'"
 * @generated
 */
public interface ImportSchemaType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(SchemaType)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getImportSchemaType_Schema()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='schema' namespace='http://www.w3.org/2001/XMLSchema'"
	 * @generated
	 */
	SchemaType getSchema();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ImportSchemaType#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(SchemaType value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getImportSchemaType_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ImportSchemaType#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getImportSchemaType_SchemaLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='schema-location'"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.ImportSchemaType#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

} // ImportSchemaType
