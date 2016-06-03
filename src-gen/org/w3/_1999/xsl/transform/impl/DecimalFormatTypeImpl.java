/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.DecimalFormatType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Format Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getDecimalSeparator <em>Decimal Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getGroupingSeparator <em>Grouping Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getInfinity <em>Infinity</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getMinusSign <em>Minus Sign</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getNaN <em>Na N</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getPercent <em>Percent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getPerMille <em>Per Mille</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getZeroDigit <em>Zero Digit</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getDigit <em>Digit</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.DecimalFormatTypeImpl#getPatternSeparator <em>Pattern Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecimalFormatTypeImpl extends ElementOnlyVersionedElementTypeImpl implements DecimalFormatType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalSeparator() <em>Decimal Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL_SEPARATOR_EDEFAULT = ".";

	/**
	 * The cached value of the '{@link #getDecimalSeparator() <em>Decimal Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalSeparator()
	 * @generated
	 * @ordered
	 */
	protected String decimalSeparator = DECIMAL_SEPARATOR_EDEFAULT;

	/**
	 * This is true if the Decimal Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean decimalSeparatorESet;

	/**
	 * The default value of the '{@link #getGroupingSeparator() <em>Grouping Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPING_SEPARATOR_EDEFAULT = ",";

	/**
	 * The cached value of the '{@link #getGroupingSeparator() <em>Grouping Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingSeparator()
	 * @generated
	 * @ordered
	 */
	protected String groupingSeparator = GROUPING_SEPARATOR_EDEFAULT;

	/**
	 * This is true if the Grouping Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupingSeparatorESet;

	/**
	 * The default value of the '{@link #getInfinity() <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfinity()
	 * @generated
	 * @ordered
	 */
	protected static final String INFINITY_EDEFAULT = "Infinity";

	/**
	 * The cached value of the '{@link #getInfinity() <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfinity()
	 * @generated
	 * @ordered
	 */
	protected String infinity = INFINITY_EDEFAULT;

	/**
	 * This is true if the Infinity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean infinityESet;

	/**
	 * The default value of the '{@link #getMinusSign() <em>Minus Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinusSign()
	 * @generated
	 * @ordered
	 */
	protected static final String MINUS_SIGN_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getMinusSign() <em>Minus Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinusSign()
	 * @generated
	 * @ordered
	 */
	protected String minusSign = MINUS_SIGN_EDEFAULT;

	/**
	 * This is true if the Minus Sign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minusSignESet;

	/**
	 * The default value of the '{@link #getNaN() <em>Na N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaN()
	 * @generated
	 * @ordered
	 */
	protected static final String NA_N_EDEFAULT = "NaN";

	/**
	 * The cached value of the '{@link #getNaN() <em>Na N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaN()
	 * @generated
	 * @ordered
	 */
	protected String naN = NA_N_EDEFAULT;

	/**
	 * This is true if the Na N attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean naNESet;

	/**
	 * The default value of the '{@link #getPercent() <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercent()
	 * @generated
	 * @ordered
	 */
	protected static final String PERCENT_EDEFAULT = "%";

	/**
	 * The cached value of the '{@link #getPercent() <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercent()
	 * @generated
	 * @ordered
	 */
	protected String percent = PERCENT_EDEFAULT;

	/**
	 * This is true if the Percent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentESet;

	/**
	 * The default value of the '{@link #getPerMille() <em>Per Mille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerMille()
	 * @generated
	 * @ordered
	 */
	protected static final String PER_MILLE_EDEFAULT = "\u2030";

	/**
	 * The cached value of the '{@link #getPerMille() <em>Per Mille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerMille()
	 * @generated
	 * @ordered
	 */
	protected String perMille = PER_MILLE_EDEFAULT;

	/**
	 * This is true if the Per Mille attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean perMilleESet;

	/**
	 * The default value of the '{@link #getZeroDigit() <em>Zero Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroDigit()
	 * @generated
	 * @ordered
	 */
	protected static final String ZERO_DIGIT_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getZeroDigit() <em>Zero Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroDigit()
	 * @generated
	 * @ordered
	 */
	protected String zeroDigit = ZERO_DIGIT_EDEFAULT;

	/**
	 * This is true if the Zero Digit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zeroDigitESet;

	/**
	 * The default value of the '{@link #getDigit() <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigit()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGIT_EDEFAULT = "#";

	/**
	 * The cached value of the '{@link #getDigit() <em>Digit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigit()
	 * @generated
	 * @ordered
	 */
	protected String digit = DIGIT_EDEFAULT;

	/**
	 * This is true if the Digit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean digitESet;

	/**
	 * The default value of the '{@link #getPatternSeparator() <em>Pattern Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_SEPARATOR_EDEFAULT = ";";

	/**
	 * The cached value of the '{@link #getPatternSeparator() <em>Pattern Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSeparator()
	 * @generated
	 * @ordered
	 */
	protected String patternSeparator = PATTERN_SEPARATOR_EDEFAULT;

	/**
	 * This is true if the Pattern Separator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patternSeparatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalFormatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.DECIMAL_FORMAT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecimalSeparator() {
		return decimalSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalSeparator(String newDecimalSeparator) {
		String oldDecimalSeparator = decimalSeparator;
		decimalSeparator = newDecimalSeparator;
		boolean oldDecimalSeparatorESet = decimalSeparatorESet;
		decimalSeparatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR, oldDecimalSeparator, decimalSeparator, !oldDecimalSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecimalSeparator() {
		String oldDecimalSeparator = decimalSeparator;
		boolean oldDecimalSeparatorESet = decimalSeparatorESet;
		decimalSeparator = DECIMAL_SEPARATOR_EDEFAULT;
		decimalSeparatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR, oldDecimalSeparator, DECIMAL_SEPARATOR_EDEFAULT, oldDecimalSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecimalSeparator() {
		return decimalSeparatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupingSeparator() {
		return groupingSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingSeparator(String newGroupingSeparator) {
		String oldGroupingSeparator = groupingSeparator;
		groupingSeparator = newGroupingSeparator;
		boolean oldGroupingSeparatorESet = groupingSeparatorESet;
		groupingSeparatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR, oldGroupingSeparator, groupingSeparator, !oldGroupingSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupingSeparator() {
		String oldGroupingSeparator = groupingSeparator;
		boolean oldGroupingSeparatorESet = groupingSeparatorESet;
		groupingSeparator = GROUPING_SEPARATOR_EDEFAULT;
		groupingSeparatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR, oldGroupingSeparator, GROUPING_SEPARATOR_EDEFAULT, oldGroupingSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupingSeparator() {
		return groupingSeparatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfinity() {
		return infinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfinity(String newInfinity) {
		String oldInfinity = infinity;
		infinity = newInfinity;
		boolean oldInfinityESet = infinityESet;
		infinityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__INFINITY, oldInfinity, infinity, !oldInfinityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInfinity() {
		String oldInfinity = infinity;
		boolean oldInfinityESet = infinityESet;
		infinity = INFINITY_EDEFAULT;
		infinityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__INFINITY, oldInfinity, INFINITY_EDEFAULT, oldInfinityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInfinity() {
		return infinityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinusSign() {
		return minusSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinusSign(String newMinusSign) {
		String oldMinusSign = minusSign;
		minusSign = newMinusSign;
		boolean oldMinusSignESet = minusSignESet;
		minusSignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__MINUS_SIGN, oldMinusSign, minusSign, !oldMinusSignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinusSign() {
		String oldMinusSign = minusSign;
		boolean oldMinusSignESet = minusSignESet;
		minusSign = MINUS_SIGN_EDEFAULT;
		minusSignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__MINUS_SIGN, oldMinusSign, MINUS_SIGN_EDEFAULT, oldMinusSignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinusSign() {
		return minusSignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNaN() {
		return naN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaN(String newNaN) {
		String oldNaN = naN;
		naN = newNaN;
		boolean oldNaNESet = naNESet;
		naNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__NA_N, oldNaN, naN, !oldNaNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNaN() {
		String oldNaN = naN;
		boolean oldNaNESet = naNESet;
		naN = NA_N_EDEFAULT;
		naNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__NA_N, oldNaN, NA_N_EDEFAULT, oldNaNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNaN() {
		return naNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPercent() {
		return percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercent(String newPercent) {
		String oldPercent = percent;
		percent = newPercent;
		boolean oldPercentESet = percentESet;
		percentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__PERCENT, oldPercent, percent, !oldPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercent() {
		String oldPercent = percent;
		boolean oldPercentESet = percentESet;
		percent = PERCENT_EDEFAULT;
		percentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__PERCENT, oldPercent, PERCENT_EDEFAULT, oldPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercent() {
		return percentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerMille() {
		return perMille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerMille(String newPerMille) {
		String oldPerMille = perMille;
		perMille = newPerMille;
		boolean oldPerMilleESet = perMilleESet;
		perMilleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__PER_MILLE, oldPerMille, perMille, !oldPerMilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerMille() {
		String oldPerMille = perMille;
		boolean oldPerMilleESet = perMilleESet;
		perMille = PER_MILLE_EDEFAULT;
		perMilleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__PER_MILLE, oldPerMille, PER_MILLE_EDEFAULT, oldPerMilleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerMille() {
		return perMilleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZeroDigit() {
		return zeroDigit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroDigit(String newZeroDigit) {
		String oldZeroDigit = zeroDigit;
		zeroDigit = newZeroDigit;
		boolean oldZeroDigitESet = zeroDigitESet;
		zeroDigitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__ZERO_DIGIT, oldZeroDigit, zeroDigit, !oldZeroDigitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZeroDigit() {
		String oldZeroDigit = zeroDigit;
		boolean oldZeroDigitESet = zeroDigitESet;
		zeroDigit = ZERO_DIGIT_EDEFAULT;
		zeroDigitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__ZERO_DIGIT, oldZeroDigit, ZERO_DIGIT_EDEFAULT, oldZeroDigitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZeroDigit() {
		return zeroDigitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDigit() {
		return digit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigit(String newDigit) {
		String oldDigit = digit;
		digit = newDigit;
		boolean oldDigitESet = digitESet;
		digitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__DIGIT, oldDigit, digit, !oldDigitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDigit() {
		String oldDigit = digit;
		boolean oldDigitESet = digitESet;
		digit = DIGIT_EDEFAULT;
		digitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__DIGIT, oldDigit, DIGIT_EDEFAULT, oldDigitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDigit() {
		return digitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPatternSeparator() {
		return patternSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternSeparator(String newPatternSeparator) {
		String oldPatternSeparator = patternSeparator;
		patternSeparator = newPatternSeparator;
		boolean oldPatternSeparatorESet = patternSeparatorESet;
		patternSeparatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR, oldPatternSeparator, patternSeparator, !oldPatternSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPatternSeparator() {
		String oldPatternSeparator = patternSeparator;
		boolean oldPatternSeparatorESet = patternSeparatorESet;
		patternSeparator = PATTERN_SEPARATOR_EDEFAULT;
		patternSeparatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR, oldPatternSeparator, PATTERN_SEPARATOR_EDEFAULT, oldPatternSeparatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPatternSeparator() {
		return patternSeparatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NAME:
				return getName();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR:
				return getDecimalSeparator();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR:
				return getGroupingSeparator();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__INFINITY:
				return getInfinity();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__MINUS_SIGN:
				return getMinusSign();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NA_N:
				return getNaN();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PERCENT:
				return getPercent();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PER_MILLE:
				return getPerMille();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__ZERO_DIGIT:
				return getZeroDigit();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DIGIT:
				return getDigit();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR:
				return getPatternSeparator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NAME:
				setName((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR:
				setDecimalSeparator((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR:
				setGroupingSeparator((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__INFINITY:
				setInfinity((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__MINUS_SIGN:
				setMinusSign((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NA_N:
				setNaN((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PERCENT:
				setPercent((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PER_MILLE:
				setPerMille((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__ZERO_DIGIT:
				setZeroDigit((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DIGIT:
				setDigit((String)newValue);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR:
				setPatternSeparator((String)newValue);
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
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR:
				unsetDecimalSeparator();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR:
				unsetGroupingSeparator();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__INFINITY:
				unsetInfinity();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__MINUS_SIGN:
				unsetMinusSign();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NA_N:
				unsetNaN();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PERCENT:
				unsetPercent();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PER_MILLE:
				unsetPerMille();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__ZERO_DIGIT:
				unsetZeroDigit();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DIGIT:
				unsetDigit();
				return;
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR:
				unsetPatternSeparator();
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
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DECIMAL_SEPARATOR:
				return isSetDecimalSeparator();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__GROUPING_SEPARATOR:
				return isSetGroupingSeparator();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__INFINITY:
				return isSetInfinity();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__MINUS_SIGN:
				return isSetMinusSign();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__NA_N:
				return isSetNaN();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PERCENT:
				return isSetPercent();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PER_MILLE:
				return isSetPerMille();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__ZERO_DIGIT:
				return isSetZeroDigit();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__DIGIT:
				return isSetDigit();
			case XSLT20Package.DECIMAL_FORMAT_TYPE__PATTERN_SEPARATOR:
				return isSetPatternSeparator();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", decimalSeparator: ");
		if (decimalSeparatorESet) result.append(decimalSeparator); else result.append("<unset>");
		result.append(", groupingSeparator: ");
		if (groupingSeparatorESet) result.append(groupingSeparator); else result.append("<unset>");
		result.append(", infinity: ");
		if (infinityESet) result.append(infinity); else result.append("<unset>");
		result.append(", minusSign: ");
		if (minusSignESet) result.append(minusSign); else result.append("<unset>");
		result.append(", naN: ");
		if (naNESet) result.append(naN); else result.append("<unset>");
		result.append(", percent: ");
		if (percentESet) result.append(percent); else result.append("<unset>");
		result.append(", perMille: ");
		if (perMilleESet) result.append(perMille); else result.append("<unset>");
		result.append(", zeroDigit: ");
		if (zeroDigitESet) result.append(zeroDigit); else result.append("<unset>");
		result.append(", digit: ");
		if (digitESet) result.append(digit); else result.append("<unset>");
		result.append(", patternSeparator: ");
		if (patternSeparatorESet) result.append(patternSeparator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DecimalFormatTypeImpl
