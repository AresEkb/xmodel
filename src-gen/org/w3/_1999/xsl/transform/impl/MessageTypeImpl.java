/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.MessageType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.MessageTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.MessageTypeImpl#getTerminate <em>Terminate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends SequenceConstructorImpl implements MessageType {
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
     * The default value of the '{@link #getTerminate() <em>Terminate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminate()
     * @generated
     * @ordered
     */
    protected static final String TERMINATE_EDEFAULT = "no";

    /**
     * The cached value of the '{@link #getTerminate() <em>Terminate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminate()
     * @generated
     * @ordered
     */
    protected String terminate = TERMINATE_EDEFAULT;

    /**
     * This is true if the Terminate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminateESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.MESSAGE_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.MESSAGE_TYPE__SELECT, oldSelect, select));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTerminate() {
        return terminate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTerminate(String newTerminate) {
        String oldTerminate = terminate;
        terminate = newTerminate;
        boolean oldTerminateESet = terminateESet;
        terminateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.MESSAGE_TYPE__TERMINATE, oldTerminate, terminate, !oldTerminateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTerminate() {
        String oldTerminate = terminate;
        boolean oldTerminateESet = terminateESet;
        terminate = TERMINATE_EDEFAULT;
        terminateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.MESSAGE_TYPE__TERMINATE, oldTerminate, TERMINATE_EDEFAULT, oldTerminateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTerminate() {
        return terminateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XSLT20Package.MESSAGE_TYPE__SELECT:
                return getSelect();
            case XSLT20Package.MESSAGE_TYPE__TERMINATE:
                return getTerminate();
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
            case XSLT20Package.MESSAGE_TYPE__SELECT:
                setSelect((String)newValue);
                return;
            case XSLT20Package.MESSAGE_TYPE__TERMINATE:
                setTerminate((String)newValue);
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
            case XSLT20Package.MESSAGE_TYPE__SELECT:
                setSelect(SELECT_EDEFAULT);
                return;
            case XSLT20Package.MESSAGE_TYPE__TERMINATE:
                unsetTerminate();
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
            case XSLT20Package.MESSAGE_TYPE__SELECT:
                return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
            case XSLT20Package.MESSAGE_TYPE__TERMINATE:
                return isSetTerminate();
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
        result.append(", terminate: ");
        if (terminateESet) result.append(terminate); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //MessageTypeImpl
