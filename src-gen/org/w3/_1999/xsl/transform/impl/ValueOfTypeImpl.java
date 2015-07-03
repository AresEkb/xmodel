/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.ValueOfType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ValueOfTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ValueOfTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ValueOfTypeImpl#getDisableOutputEscaping <em>Disable Output Escaping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueOfTypeImpl extends SequenceConstructorImpl implements ValueOfType {
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
     * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeparator()
     * @generated
     * @ordered
     */
    protected static final String SEPARATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeparator()
     * @generated
     * @ordered
     */
    protected String separator = SEPARATOR_EDEFAULT;

    /**
     * The default value of the '{@link #getDisableOutputEscaping() <em>Disable Output Escaping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisableOutputEscaping()
     * @generated
     * @ordered
     */
    protected static final YesOrNo DISABLE_OUTPUT_ESCAPING_EDEFAULT = YesOrNo.NO;

    /**
     * The cached value of the '{@link #getDisableOutputEscaping() <em>Disable Output Escaping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisableOutputEscaping()
     * @generated
     * @ordered
     */
    protected YesOrNo disableOutputEscaping = DISABLE_OUTPUT_ESCAPING_EDEFAULT;

    /**
     * This is true if the Disable Output Escaping attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disableOutputEscapingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueOfTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.VALUE_OF_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.VALUE_OF_TYPE__SELECT, oldSelect, select));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeparator(String newSeparator) {
        String oldSeparator = separator;
        separator = newSeparator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.VALUE_OF_TYPE__SEPARATOR, oldSeparator, separator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNo getDisableOutputEscaping() {
        return disableOutputEscaping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisableOutputEscaping(YesOrNo newDisableOutputEscaping) {
        YesOrNo oldDisableOutputEscaping = disableOutputEscaping;
        disableOutputEscaping = newDisableOutputEscaping == null ? DISABLE_OUTPUT_ESCAPING_EDEFAULT : newDisableOutputEscaping;
        boolean oldDisableOutputEscapingESet = disableOutputEscapingESet;
        disableOutputEscapingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING, oldDisableOutputEscaping, disableOutputEscaping, !oldDisableOutputEscapingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDisableOutputEscaping() {
        YesOrNo oldDisableOutputEscaping = disableOutputEscaping;
        boolean oldDisableOutputEscapingESet = disableOutputEscapingESet;
        disableOutputEscaping = DISABLE_OUTPUT_ESCAPING_EDEFAULT;
        disableOutputEscapingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING, oldDisableOutputEscaping, DISABLE_OUTPUT_ESCAPING_EDEFAULT, oldDisableOutputEscapingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDisableOutputEscaping() {
        return disableOutputEscapingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XSLT20Package.VALUE_OF_TYPE__SELECT:
                return getSelect();
            case XSLT20Package.VALUE_OF_TYPE__SEPARATOR:
                return getSeparator();
            case XSLT20Package.VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING:
                return getDisableOutputEscaping();
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
            case XSLT20Package.VALUE_OF_TYPE__SELECT:
                setSelect((String)newValue);
                return;
            case XSLT20Package.VALUE_OF_TYPE__SEPARATOR:
                setSeparator((String)newValue);
                return;
            case XSLT20Package.VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING:
                setDisableOutputEscaping((YesOrNo)newValue);
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
            case XSLT20Package.VALUE_OF_TYPE__SELECT:
                setSelect(SELECT_EDEFAULT);
                return;
            case XSLT20Package.VALUE_OF_TYPE__SEPARATOR:
                setSeparator(SEPARATOR_EDEFAULT);
                return;
            case XSLT20Package.VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING:
                unsetDisableOutputEscaping();
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
            case XSLT20Package.VALUE_OF_TYPE__SELECT:
                return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
            case XSLT20Package.VALUE_OF_TYPE__SEPARATOR:
                return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
            case XSLT20Package.VALUE_OF_TYPE__DISABLE_OUTPUT_ESCAPING:
                return isSetDisableOutputEscaping();
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
        result.append(" (select: ");
        result.append(select);
        result.append(", separator: ");
        result.append(separator);
        result.append(", disableOutputEscaping: ");
        if (disableOutputEscapingESet) result.append(disableOutputEscaping); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ValueOfTypeImpl
