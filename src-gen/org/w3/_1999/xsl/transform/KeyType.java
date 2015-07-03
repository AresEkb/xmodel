/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.KeyType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.KeyType#getMatch <em>Match</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.KeyType#getUse <em>Use</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.KeyType#getCollation <em>Collation</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getKeyType()
 * @model extendedMetaData="name='key_._type' kind='mixed'"
 * @generated
 */
public interface KeyType extends SequenceConstructor {
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
     * @see org.w3._1999.xsl.transform.XSLT20Package#getKeyType_Name()
     * @model dataType="org.w3._1999.xsl.transform.QName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.KeyType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match</em>' attribute.
     * @see #setMatch(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getKeyType_Match()
     * @model dataType="org.w3._1999.xsl.transform.Pattern" required="true"
     *        extendedMetaData="kind='attribute' name='match'"
     * @generated
     */
    String getMatch();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.KeyType#getMatch <em>Match</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Match</em>' attribute.
     * @see #getMatch()
     * @generated
     */
    void setMatch(String value);

    /**
     * Returns the value of the '<em><b>Use</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use</em>' attribute.
     * @see #setUse(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getKeyType_Use()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='use'"
     * @generated
     */
    String getUse();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.KeyType#getUse <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use</em>' attribute.
     * @see #getUse()
     * @generated
     */
    void setUse(String value);

    /**
     * Returns the value of the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collation</em>' attribute.
     * @see #setCollation(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getKeyType_Collation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='collation'"
     * @generated
     */
    String getCollation();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.KeyType#getCollation <em>Collation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation</em>' attribute.
     * @see #getCollation()
     * @generated
     */
    void setCollation(String value);

} // KeyType
