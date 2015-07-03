/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.TextType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TextTypeImpl#getDisableOutputEscaping <em>Disable Output Escaping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextTypeImpl extends TextElementBaseTypeImpl implements TextType {
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
    protected TextTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.TEXT_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TEXT_TYPE__DISABLE_OUTPUT_ESCAPING, oldDisableOutputEscaping, disableOutputEscaping, !oldDisableOutputEscapingESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.TEXT_TYPE__DISABLE_OUTPUT_ESCAPING, oldDisableOutputEscaping, DISABLE_OUTPUT_ESCAPING_EDEFAULT, oldDisableOutputEscapingESet));
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
            case XSLT20Package.TEXT_TYPE__DISABLE_OUTPUT_ESCAPING:
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
            case XSLT20Package.TEXT_TYPE__DISABLE_OUTPUT_ESCAPING:
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
            case XSLT20Package.TEXT_TYPE__DISABLE_OUTPUT_ESCAPING:
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
            case XSLT20Package.TEXT_TYPE__DISABLE_OUTPUT_ESCAPING:
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
        result.append(" (disableOutputEscaping: ");
        if (disableOutputEscapingESet) result.append(disableOutputEscaping); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TextTypeImpl
