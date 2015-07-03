/**
 */
package org.w3._1999.xsl.transform;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.CharacterMapType#getOutputCharacter <em>Output Character</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.CharacterMapType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.CharacterMapType#getUseCharacterMaps <em>Use Character Maps</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getCharacterMapType()
 * @model extendedMetaData="name='character-map_._type' kind='mixed'"
 * @generated
 */
public interface CharacterMapType extends ElementOnlyVersionedElementType {
    /**
     * Returns the value of the '<em><b>Output Character</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._1999.xsl.transform.OutputCharacterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Character</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Character</em>' containment reference list.
     * @see org.w3._1999.xsl.transform.XSLT20Package#getCharacterMapType_OutputCharacter()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='output-character' namespace='##targetNamespace'"
     * @generated
     */
    EList<OutputCharacterType> getOutputCharacter();

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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getCharacterMapType_Name()
     * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.CharacterMapType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Use Character Maps</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Character Maps</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Character Maps</em>' attribute.
     * @see #isSetUseCharacterMaps()
     * @see #unsetUseCharacterMaps()
     * @see #setUseCharacterMaps(List)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getCharacterMapType_UseCharacterMaps()
     * @model default="" unsettable="true" dataType="org.w3._1999.xsl.transform.QNames" many="false"
     *        extendedMetaData="kind='attribute' name='use-character-maps'"
     * @generated
     */
    List<String> getUseCharacterMaps();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.CharacterMapType#getUseCharacterMaps <em>Use Character Maps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Character Maps</em>' attribute.
     * @see #isSetUseCharacterMaps()
     * @see #unsetUseCharacterMaps()
     * @see #getUseCharacterMaps()
     * @generated
     */
    void setUseCharacterMaps(List<String> value);

    /**
     * Unsets the value of the '{@link org.w3._1999.xsl.transform.CharacterMapType#getUseCharacterMaps <em>Use Character Maps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUseCharacterMaps()
     * @see #getUseCharacterMaps()
     * @see #setUseCharacterMaps(List)
     * @generated
     */
    void unsetUseCharacterMaps();

    /**
     * Returns whether the value of the '{@link org.w3._1999.xsl.transform.CharacterMapType#getUseCharacterMaps <em>Use Character Maps</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Character Maps</em>' attribute is set.
     * @see #unsetUseCharacterMaps()
     * @see #getUseCharacterMaps()
     * @see #setUseCharacterMaps(List)
     * @generated
     */
    boolean isSetUseCharacterMaps();

} // CharacterMapType
