/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.CommentType#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getCommentType()
 * @model extendedMetaData="name='comment_._type' kind='mixed'"
 * @generated
 */
public interface CommentType extends SequenceConstructor {
    /**
     * Returns the value of the '<em><b>Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select</em>' attribute.
     * @see #setSelect(String)
     * @see org.w3._1999.xsl.transform.XSLT20Package#getCommentType_Select()
     * @model dataType="org.w3._1999.xsl.transform.Expression"
     *        extendedMetaData="kind='attribute' name='select'"
     * @generated
     */
    String getSelect();

    /**
     * Sets the value of the '{@link org.w3._1999.xsl.transform.CommentType#getSelect <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select</em>' attribute.
     * @see #getSelect()
     * @generated
     */
    void setSelect(String value);

} // CommentType
