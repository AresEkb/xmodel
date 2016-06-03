/**
 */
package org.w3._1999.xsl.transform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getDecimalSeparator <em>Decimal Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getGroupingSeparator <em>Grouping Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getInfinity <em>Infinity</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getMinusSign <em>Minus Sign</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getNaN <em>Na N</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getPercent <em>Percent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getPerMille <em>Per Mille</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getZeroDigit <em>Zero Digit</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getDigit <em>Digit</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.DecimalFormatType#getPatternSeparator <em>Pattern Separator</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType()
 * @model extendedMetaData="name='decimal-format_._type' kind='mixed'"
 * @generated
 */
public interface DecimalFormatType extends ElementOnlyVersionedElementType {
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
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_Name()
	 * @model dataType="org.w3._1999.xsl.transform.QName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decimal Separator</b></em>' attribute.
	 * The default value is <code>"."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Separator</em>' attribute.
	 * @see #isSetDecimalSeparator()
	 * @see #unsetDecimalSeparator()
	 * @see #setDecimalSeparator(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_DecimalSeparator()
	 * @model default="." unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='decimal-separator'"
	 * @generated
	 */
	String getDecimalSeparator();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDecimalSeparator <em>Decimal Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Separator</em>' attribute.
	 * @see #isSetDecimalSeparator()
	 * @see #unsetDecimalSeparator()
	 * @see #getDecimalSeparator()
	 * @generated
	 */
	void setDecimalSeparator(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDecimalSeparator <em>Decimal Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecimalSeparator()
	 * @see #getDecimalSeparator()
	 * @see #setDecimalSeparator(String)
	 * @generated
	 */
	void unsetDecimalSeparator();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDecimalSeparator <em>Decimal Separator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decimal Separator</em>' attribute is set.
	 * @see #unsetDecimalSeparator()
	 * @see #getDecimalSeparator()
	 * @see #setDecimalSeparator(String)
	 * @generated
	 */
	boolean isSetDecimalSeparator();

	/**
	 * Returns the value of the '<em><b>Grouping Separator</b></em>' attribute.
	 * The default value is <code>","</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Separator</em>' attribute.
	 * @see #isSetGroupingSeparator()
	 * @see #unsetGroupingSeparator()
	 * @see #setGroupingSeparator(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_GroupingSeparator()
	 * @model default="," unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='grouping-separator'"
	 * @generated
	 */
	String getGroupingSeparator();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getGroupingSeparator <em>Grouping Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Separator</em>' attribute.
	 * @see #isSetGroupingSeparator()
	 * @see #unsetGroupingSeparator()
	 * @see #getGroupingSeparator()
	 * @generated
	 */
	void setGroupingSeparator(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getGroupingSeparator <em>Grouping Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupingSeparator()
	 * @see #getGroupingSeparator()
	 * @see #setGroupingSeparator(String)
	 * @generated
	 */
	void unsetGroupingSeparator();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getGroupingSeparator <em>Grouping Separator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouping Separator</em>' attribute is set.
	 * @see #unsetGroupingSeparator()
	 * @see #getGroupingSeparator()
	 * @see #setGroupingSeparator(String)
	 * @generated
	 */
	boolean isSetGroupingSeparator();

	/**
	 * Returns the value of the '<em><b>Infinity</b></em>' attribute.
	 * The default value is <code>"Infinity"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infinity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infinity</em>' attribute.
	 * @see #isSetInfinity()
	 * @see #unsetInfinity()
	 * @see #setInfinity(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_Infinity()
	 * @model default="Infinity" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='infinity'"
	 * @generated
	 */
	String getInfinity();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getInfinity <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinity</em>' attribute.
	 * @see #isSetInfinity()
	 * @see #unsetInfinity()
	 * @see #getInfinity()
	 * @generated
	 */
	void setInfinity(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getInfinity <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInfinity()
	 * @see #getInfinity()
	 * @see #setInfinity(String)
	 * @generated
	 */
	void unsetInfinity();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getInfinity <em>Infinity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Infinity</em>' attribute is set.
	 * @see #unsetInfinity()
	 * @see #getInfinity()
	 * @see #setInfinity(String)
	 * @generated
	 */
	boolean isSetInfinity();

	/**
	 * Returns the value of the '<em><b>Minus Sign</b></em>' attribute.
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minus Sign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minus Sign</em>' attribute.
	 * @see #isSetMinusSign()
	 * @see #unsetMinusSign()
	 * @see #setMinusSign(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_MinusSign()
	 * @model default="-" unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='minus-sign'"
	 * @generated
	 */
	String getMinusSign();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getMinusSign <em>Minus Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minus Sign</em>' attribute.
	 * @see #isSetMinusSign()
	 * @see #unsetMinusSign()
	 * @see #getMinusSign()
	 * @generated
	 */
	void setMinusSign(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getMinusSign <em>Minus Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinusSign()
	 * @see #getMinusSign()
	 * @see #setMinusSign(String)
	 * @generated
	 */
	void unsetMinusSign();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getMinusSign <em>Minus Sign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minus Sign</em>' attribute is set.
	 * @see #unsetMinusSign()
	 * @see #getMinusSign()
	 * @see #setMinusSign(String)
	 * @generated
	 */
	boolean isSetMinusSign();

	/**
	 * Returns the value of the '<em><b>Na N</b></em>' attribute.
	 * The default value is <code>"NaN"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Na N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Na N</em>' attribute.
	 * @see #isSetNaN()
	 * @see #unsetNaN()
	 * @see #setNaN(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_NaN()
	 * @model default="NaN" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NaN'"
	 * @generated
	 */
	String getNaN();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getNaN <em>Na N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Na N</em>' attribute.
	 * @see #isSetNaN()
	 * @see #unsetNaN()
	 * @see #getNaN()
	 * @generated
	 */
	void setNaN(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getNaN <em>Na N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNaN()
	 * @see #getNaN()
	 * @see #setNaN(String)
	 * @generated
	 */
	void unsetNaN();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getNaN <em>Na N</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Na N</em>' attribute is set.
	 * @see #unsetNaN()
	 * @see #getNaN()
	 * @see #setNaN(String)
	 * @generated
	 */
	boolean isSetNaN();

	/**
	 * Returns the value of the '<em><b>Percent</b></em>' attribute.
	 * The default value is <code>"%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent</em>' attribute.
	 * @see #isSetPercent()
	 * @see #unsetPercent()
	 * @see #setPercent(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_Percent()
	 * @model default="%" unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='percent'"
	 * @generated
	 */
	String getPercent();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPercent <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' attribute.
	 * @see #isSetPercent()
	 * @see #unsetPercent()
	 * @see #getPercent()
	 * @generated
	 */
	void setPercent(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPercent <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercent()
	 * @see #getPercent()
	 * @see #setPercent(String)
	 * @generated
	 */
	void unsetPercent();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPercent <em>Percent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percent</em>' attribute is set.
	 * @see #unsetPercent()
	 * @see #getPercent()
	 * @see #setPercent(String)
	 * @generated
	 */
	boolean isSetPercent();

	/**
	 * Returns the value of the '<em><b>Per Mille</b></em>' attribute.
	 * The default value is <code>"\u2030"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Mille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Mille</em>' attribute.
	 * @see #isSetPerMille()
	 * @see #unsetPerMille()
	 * @see #setPerMille(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_PerMille()
	 * @model default="\u2030" unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='per-mille'"
	 * @generated
	 */
	String getPerMille();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPerMille <em>Per Mille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Mille</em>' attribute.
	 * @see #isSetPerMille()
	 * @see #unsetPerMille()
	 * @see #getPerMille()
	 * @generated
	 */
	void setPerMille(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPerMille <em>Per Mille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerMille()
	 * @see #getPerMille()
	 * @see #setPerMille(String)
	 * @generated
	 */
	void unsetPerMille();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPerMille <em>Per Mille</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Per Mille</em>' attribute is set.
	 * @see #unsetPerMille()
	 * @see #getPerMille()
	 * @see #setPerMille(String)
	 * @generated
	 */
	boolean isSetPerMille();

	/**
	 * Returns the value of the '<em><b>Zero Digit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zero Digit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero Digit</em>' attribute.
	 * @see #isSetZeroDigit()
	 * @see #unsetZeroDigit()
	 * @see #setZeroDigit(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_ZeroDigit()
	 * @model default="0" unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='zero-digit'"
	 * @generated
	 */
	String getZeroDigit();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getZeroDigit <em>Zero Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero Digit</em>' attribute.
	 * @see #isSetZeroDigit()
	 * @see #unsetZeroDigit()
	 * @see #getZeroDigit()
	 * @generated
	 */
	void setZeroDigit(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getZeroDigit <em>Zero Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZeroDigit()
	 * @see #getZeroDigit()
	 * @see #setZeroDigit(String)
	 * @generated
	 */
	void unsetZeroDigit();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getZeroDigit <em>Zero Digit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zero Digit</em>' attribute is set.
	 * @see #unsetZeroDigit()
	 * @see #getZeroDigit()
	 * @see #setZeroDigit(String)
	 * @generated
	 */
	boolean isSetZeroDigit();

	/**
	 * Returns the value of the '<em><b>Digit</b></em>' attribute.
	 * The default value is <code>"#"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digit</em>' attribute.
	 * @see #isSetDigit()
	 * @see #unsetDigit()
	 * @see #setDigit(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_Digit()
	 * @model default="#" unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='digit'"
	 * @generated
	 */
	String getDigit();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDigit <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digit</em>' attribute.
	 * @see #isSetDigit()
	 * @see #unsetDigit()
	 * @see #getDigit()
	 * @generated
	 */
	void setDigit(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDigit <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDigit()
	 * @see #getDigit()
	 * @see #setDigit(String)
	 * @generated
	 */
	void unsetDigit();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getDigit <em>Digit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Digit</em>' attribute is set.
	 * @see #unsetDigit()
	 * @see #getDigit()
	 * @see #setDigit(String)
	 * @generated
	 */
	boolean isSetDigit();

	/**
	 * Returns the value of the '<em><b>Pattern Separator</b></em>' attribute.
	 * The default value is <code>";"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Separator</em>' attribute.
	 * @see #isSetPatternSeparator()
	 * @see #unsetPatternSeparator()
	 * @see #setPatternSeparator(String)
	 * @see org.w3._1999.xsl.transform.XSLT20Package#getDecimalFormatType_PatternSeparator()
	 * @model default=";" unsettable="true" dataType="org.w3._1999.xsl.transform.Char"
	 *        extendedMetaData="kind='attribute' name='pattern-separator'"
	 * @generated
	 */
	String getPatternSeparator();

	/**
	 * Sets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPatternSeparator <em>Pattern Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Separator</em>' attribute.
	 * @see #isSetPatternSeparator()
	 * @see #unsetPatternSeparator()
	 * @see #getPatternSeparator()
	 * @generated
	 */
	void setPatternSeparator(String value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPatternSeparator <em>Pattern Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPatternSeparator()
	 * @see #getPatternSeparator()
	 * @see #setPatternSeparator(String)
	 * @generated
	 */
	void unsetPatternSeparator();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xsl.transform.DecimalFormatType#getPatternSeparator <em>Pattern Separator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pattern Separator</em>' attribute is set.
	 * @see #unsetPatternSeparator()
	 * @see #getPatternSeparator()
	 * @see #setPatternSeparator(String)
	 * @generated
	 */
	boolean isSetPatternSeparator();

} // DecimalFormatType
