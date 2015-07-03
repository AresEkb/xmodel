/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.Level;
import org.w3._1999.xsl.transform.NumberType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getLetterValue <em>Letter Value</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getGroupingSeparator <em>Grouping Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NumberTypeImpl#getGroupingSize <em>Grouping Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberTypeImpl extends VersionedElementTypeImpl implements NumberType {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelect()
     * @generated
     * @ordered
     */
    protected static final String SELECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelect()
     * @generated
     * @ordered
     */
    protected String select = SELECT_EDEFAULT;

    /**
     * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected static final Level LEVEL_EDEFAULT = Level.SINGLE;

    /**
     * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected Level level = LEVEL_EDEFAULT;

    /**
     * This is true if the Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean levelESet;

    /**
     * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected static final String COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected String count = COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected static final String FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected String from = FROM_EDEFAULT;

    /**
     * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected static final String FORMAT_EDEFAULT = "1";

    /**
     * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected String format = FORMAT_EDEFAULT;

    /**
     * This is true if the Format attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean formatESet;

    /**
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * The default value of the '{@link #getLetterValue() <em>Letter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLetterValue()
     * @generated
     * @ordered
     */
    protected static final String LETTER_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLetterValue() <em>Letter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLetterValue()
     * @generated
     * @ordered
     */
    protected String letterValue = LETTER_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdinal()
     * @generated
     * @ordered
     */
    protected static final String ORDINAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdinal()
     * @generated
     * @ordered
     */
    protected String ordinal = ORDINAL_EDEFAULT;

    /**
     * The default value of the '{@link #getGroupingSeparator() <em>Grouping Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupingSeparator()
     * @generated
     * @ordered
     */
    protected static final String GROUPING_SEPARATOR_EDEFAULT = null;

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
     * The default value of the '{@link #getGroupingSize() <em>Grouping Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupingSize()
     * @generated
     * @ordered
     */
    protected static final String GROUPING_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGroupingSize() <em>Grouping Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupingSize()
     * @generated
     * @ordered
     */
    protected String groupingSize = GROUPING_SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumberTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.NUMBER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSelect() {
        return select;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelect(String newSelect) {
        String oldSelect = select;
        select = newSelect;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__SELECT, oldSelect, select));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Level getLevel() {
        return level;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLevel(Level newLevel) {
        Level oldLevel = level;
        level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
        boolean oldLevelESet = levelESet;
        levelESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__LEVEL, oldLevel, level, !oldLevelESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLevel() {
        Level oldLevel = level;
        boolean oldLevelESet = levelESet;
        level = LEVEL_EDEFAULT;
        levelESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.NUMBER_TYPE__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLevel() {
        return levelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCount() {
        return count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCount(String newCount) {
        String oldCount = count;
        count = newCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__COUNT, oldCount, count));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(String newFrom) {
        String oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFormat() {
        return format;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormat(String newFormat) {
        String oldFormat = format;
        format = newFormat;
        boolean oldFormatESet = formatESet;
        formatESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__FORMAT, oldFormat, format, !oldFormatESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFormat() {
        String oldFormat = format;
        boolean oldFormatESet = formatESet;
        format = FORMAT_EDEFAULT;
        formatESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.NUMBER_TYPE__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFormat() {
        return formatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang() {
        return lang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang(String newLang) {
        String oldLang = lang;
        lang = newLang;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__LANG, oldLang, lang));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLetterValue() {
        return letterValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLetterValue(String newLetterValue) {
        String oldLetterValue = letterValue;
        letterValue = newLetterValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__LETTER_VALUE, oldLetterValue, letterValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOrdinal() {
        return ordinal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrdinal(String newOrdinal) {
        String oldOrdinal = ordinal;
        ordinal = newOrdinal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__ORDINAL, oldOrdinal, ordinal));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__GROUPING_SEPARATOR, oldGroupingSeparator, groupingSeparator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGroupingSize() {
        return groupingSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroupingSize(String newGroupingSize) {
        String oldGroupingSize = groupingSize;
        groupingSize = newGroupingSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.NUMBER_TYPE__GROUPING_SIZE, oldGroupingSize, groupingSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XSLT20Package.NUMBER_TYPE__VALUE:
                return getValue();
            case XSLT20Package.NUMBER_TYPE__SELECT:
                return getSelect();
            case XSLT20Package.NUMBER_TYPE__LEVEL:
                return getLevel();
            case XSLT20Package.NUMBER_TYPE__COUNT:
                return getCount();
            case XSLT20Package.NUMBER_TYPE__FROM:
                return getFrom();
            case XSLT20Package.NUMBER_TYPE__FORMAT:
                return getFormat();
            case XSLT20Package.NUMBER_TYPE__LANG:
                return getLang();
            case XSLT20Package.NUMBER_TYPE__LETTER_VALUE:
                return getLetterValue();
            case XSLT20Package.NUMBER_TYPE__ORDINAL:
                return getOrdinal();
            case XSLT20Package.NUMBER_TYPE__GROUPING_SEPARATOR:
                return getGroupingSeparator();
            case XSLT20Package.NUMBER_TYPE__GROUPING_SIZE:
                return getGroupingSize();
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
            case XSLT20Package.NUMBER_TYPE__VALUE:
                setValue((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__SELECT:
                setSelect((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__LEVEL:
                setLevel((Level)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__COUNT:
                setCount((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__FROM:
                setFrom((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__FORMAT:
                setFormat((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__LETTER_VALUE:
                setLetterValue((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__ORDINAL:
                setOrdinal((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__GROUPING_SEPARATOR:
                setGroupingSeparator((String)newValue);
                return;
            case XSLT20Package.NUMBER_TYPE__GROUPING_SIZE:
                setGroupingSize((String)newValue);
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
            case XSLT20Package.NUMBER_TYPE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__SELECT:
                setSelect(SELECT_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__LEVEL:
                unsetLevel();
                return;
            case XSLT20Package.NUMBER_TYPE__COUNT:
                setCount(COUNT_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__FORMAT:
                unsetFormat();
                return;
            case XSLT20Package.NUMBER_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__LETTER_VALUE:
                setLetterValue(LETTER_VALUE_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__ORDINAL:
                setOrdinal(ORDINAL_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__GROUPING_SEPARATOR:
                setGroupingSeparator(GROUPING_SEPARATOR_EDEFAULT);
                return;
            case XSLT20Package.NUMBER_TYPE__GROUPING_SIZE:
                setGroupingSize(GROUPING_SIZE_EDEFAULT);
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
            case XSLT20Package.NUMBER_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case XSLT20Package.NUMBER_TYPE__SELECT:
                return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
            case XSLT20Package.NUMBER_TYPE__LEVEL:
                return isSetLevel();
            case XSLT20Package.NUMBER_TYPE__COUNT:
                return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
            case XSLT20Package.NUMBER_TYPE__FROM:
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case XSLT20Package.NUMBER_TYPE__FORMAT:
                return isSetFormat();
            case XSLT20Package.NUMBER_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XSLT20Package.NUMBER_TYPE__LETTER_VALUE:
                return LETTER_VALUE_EDEFAULT == null ? letterValue != null : !LETTER_VALUE_EDEFAULT.equals(letterValue);
            case XSLT20Package.NUMBER_TYPE__ORDINAL:
                return ORDINAL_EDEFAULT == null ? ordinal != null : !ORDINAL_EDEFAULT.equals(ordinal);
            case XSLT20Package.NUMBER_TYPE__GROUPING_SEPARATOR:
                return GROUPING_SEPARATOR_EDEFAULT == null ? groupingSeparator != null : !GROUPING_SEPARATOR_EDEFAULT.equals(groupingSeparator);
            case XSLT20Package.NUMBER_TYPE__GROUPING_SIZE:
                return GROUPING_SIZE_EDEFAULT == null ? groupingSize != null : !GROUPING_SIZE_EDEFAULT.equals(groupingSize);
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
        result.append(" (value: ");
        result.append(value);
        result.append(", select: ");
        result.append(select);
        result.append(", level: ");
        if (levelESet) result.append(level); else result.append("<unset>");
        result.append(", count: ");
        result.append(count);
        result.append(", from: ");
        result.append(from);
        result.append(", format: ");
        if (formatESet) result.append(format); else result.append("<unset>");
        result.append(", lang: ");
        result.append(lang);
        result.append(", letterValue: ");
        result.append(letterValue);
        result.append(", ordinal: ");
        result.append(ordinal);
        result.append(", groupingSeparator: ");
        result.append(groupingSeparator);
        result.append(", groupingSize: ");
        result.append(groupingSize);
        result.append(')');
        return result.toString();
    }

} //NumberTypeImpl
