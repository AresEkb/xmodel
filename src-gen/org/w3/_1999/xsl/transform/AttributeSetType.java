/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.AttributeSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AttributeSetType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AttributeSetType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.AttributeSetType#getUseAttributeSets <em>Use Attribute Sets</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getAttributeSetType()
 * @model extendedMetaData="name='attribute-set_._type' kind='mixed'"
 * @generated
 */
public interface AttributeSetType extends ElementOnlyVersionedElementType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAttributeSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:8'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xsl.transform.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAttributeSetType_Attribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<AttributeType> getAttribute();

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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAttributeSetType_Name()
	 * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AttributeSetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Attribute Sets</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Attribute Sets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Attribute Sets</em>' attribute.
	 * @see #isSetUseAttributeSets()
	 * @see #unsetUseAttributeSets()
	 * @see #setUseAttributeSets(List)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getAttributeSetType_UseAttributeSets()
	 * @model default="" unsettable="true" dataType="org.w3._1999.xsl.transform.QNames" many="false"
	 *        extendedMetaData="kind='attribute' name='use-attribute-sets'"
	 * @generated
	 */
	List<String> getUseAttributeSets();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.AttributeSetType#getUseAttributeSets <em>Use Attribute Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Attribute Sets</em>' attribute.
	 * @see #isSetUseAttributeSets()
	 * @see #unsetUseAttributeSets()
	 * @see #getUseAttributeSets()
	 * @generated
	 */
	void setUseAttributeSets(List<String> value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.AttributeSetType#getUseAttributeSets <em>Use Attribute Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseAttributeSets()
	 * @see #getUseAttributeSets()
	 * @see #setUseAttributeSets(List)
	 * @generated
	 */
	void unsetUseAttributeSets();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.AttributeSetType#getUseAttributeSets <em>Use Attribute Sets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Attribute Sets</em>' attribute is set.
	 * @see #unsetUseAttributeSets()
	 * @see #getUseAttributeSets()
	 * @see #setUseAttributeSets(List)
	 * @generated
	 */
	boolean isSetUseAttributeSets();

} // AttributeSetType
