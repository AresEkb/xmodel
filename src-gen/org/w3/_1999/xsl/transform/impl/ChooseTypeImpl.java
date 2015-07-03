/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.ChooseType;
import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.WhenType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choose Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ChooseTypeImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ChooseTypeImpl#getOtherwise <em>Otherwise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChooseTypeImpl extends ElementOnlyVersionedElementTypeImpl implements ChooseType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChooseTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.CHOOSE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WhenType> getWhen() {
        return getMixed().list(XSLT20Package.Literals.CHOOSE_TYPE__WHEN);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getOtherwise() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.CHOOSE_TYPE__OTHERWISE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOtherwise(SequenceConstructor newOtherwise, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.CHOOSE_TYPE__OTHERWISE, newOtherwise, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOtherwise(SequenceConstructor newOtherwise) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.CHOOSE_TYPE__OTHERWISE, newOtherwise);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XSLT20Package.CHOOSE_TYPE__WHEN:
                return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
            case XSLT20Package.CHOOSE_TYPE__OTHERWISE:
                return basicSetOtherwise(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XSLT20Package.CHOOSE_TYPE__WHEN:
                return getWhen();
            case XSLT20Package.CHOOSE_TYPE__OTHERWISE:
                return getOtherwise();
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
            case XSLT20Package.CHOOSE_TYPE__WHEN:
                getWhen().clear();
                getWhen().addAll((Collection<? extends WhenType>)newValue);
                return;
            case XSLT20Package.CHOOSE_TYPE__OTHERWISE:
                setOtherwise((SequenceConstructor)newValue);
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
            case XSLT20Package.CHOOSE_TYPE__WHEN:
                getWhen().clear();
                return;
            case XSLT20Package.CHOOSE_TYPE__OTHERWISE:
                setOtherwise((SequenceConstructor)null);
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
            case XSLT20Package.CHOOSE_TYPE__WHEN:
                return !getWhen().isEmpty();
            case XSLT20Package.CHOOSE_TYPE__OTHERWISE:
                return getOtherwise() != null;
        }
        return super.eIsSet(featureID);
    }

} //ChooseTypeImpl
