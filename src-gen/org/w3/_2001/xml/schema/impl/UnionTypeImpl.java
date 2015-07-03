/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.UnionType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.UnionTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.UnionTypeImpl#getMemberTypes <em>Member Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnionTypeImpl extends AnnotatedImpl implements UnionType {
    /**
     * The default value of the '{@link #getMemberTypes() <em>Member Types</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMemberTypes()
     * @generated
     * @ordered
     */
    protected static final List<QName> MEMBER_TYPES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMemberTypes() <em>Member Types</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMemberTypes()
     * @generated
     * @ordered
     */
    protected List<QName> memberTypes = MEMBER_TYPES_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.UNION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LocalSimpleType> getSimpleType() {
        return getMixed().list(XMLSchema11Package.Literals.UNION_TYPE__SIMPLE_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<QName> getMemberTypes() {
        return memberTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMemberTypes(List<QName> newMemberTypes) {
        List<QName> oldMemberTypes = memberTypes;
        memberTypes = newMemberTypes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.UNION_TYPE__MEMBER_TYPES, oldMemberTypes, memberTypes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.UNION_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.UNION_TYPE__MEMBER_TYPES:
                return getMemberTypes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMLSchema11Package.UNION_TYPE__SIMPLE_TYPE:
                getSimpleType().clear();
                getSimpleType().addAll((Collection<? extends LocalSimpleType>)newValue);
                return;
            case XMLSchema11Package.UNION_TYPE__MEMBER_TYPES:
                setMemberTypes((List<QName>)newValue);
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
            case XMLSchema11Package.UNION_TYPE__SIMPLE_TYPE:
                getSimpleType().clear();
                return;
            case XMLSchema11Package.UNION_TYPE__MEMBER_TYPES:
                setMemberTypes(MEMBER_TYPES_EDEFAULT);
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
            case XMLSchema11Package.UNION_TYPE__SIMPLE_TYPE:
                return !getSimpleType().isEmpty();
            case XMLSchema11Package.UNION_TYPE__MEMBER_TYPES:
                return MEMBER_TYPES_EDEFAULT == null ? memberTypes != null : !MEMBER_TYPES_EDEFAULT.equals(memberTypes);
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
        result.append(" (memberTypes: ");
        result.append(memberTypes);
        result.append(')');
        return result.toString();
    }

} //UnionTypeImpl
