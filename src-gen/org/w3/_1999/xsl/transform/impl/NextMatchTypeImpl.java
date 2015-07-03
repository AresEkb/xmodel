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

import org.w3._1999.xsl.transform.NextMatchType;
import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.WithParamType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Match Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NextMatchTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NextMatchTypeImpl#getWithParam <em>With Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.NextMatchTypeImpl#getFallback <em>Fallback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NextMatchTypeImpl extends ElementOnlyVersionedElementTypeImpl implements NextMatchType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NextMatchTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.NEXT_MATCH_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.NEXT_MATCH_TYPE__GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WithParamType> getWithParam() {
        return getGroup().list(XSLT20Package.Literals.NEXT_MATCH_TYPE__WITH_PARAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SequenceConstructor> getFallback() {
        return getGroup().list(XSLT20Package.Literals.NEXT_MATCH_TYPE__FALLBACK);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XSLT20Package.NEXT_MATCH_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case XSLT20Package.NEXT_MATCH_TYPE__WITH_PARAM:
                return ((InternalEList<?>)getWithParam()).basicRemove(otherEnd, msgs);
            case XSLT20Package.NEXT_MATCH_TYPE__FALLBACK:
                return ((InternalEList<?>)getFallback()).basicRemove(otherEnd, msgs);
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
            case XSLT20Package.NEXT_MATCH_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case XSLT20Package.NEXT_MATCH_TYPE__WITH_PARAM:
                return getWithParam();
            case XSLT20Package.NEXT_MATCH_TYPE__FALLBACK:
                return getFallback();
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
            case XSLT20Package.NEXT_MATCH_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case XSLT20Package.NEXT_MATCH_TYPE__WITH_PARAM:
                getWithParam().clear();
                getWithParam().addAll((Collection<? extends WithParamType>)newValue);
                return;
            case XSLT20Package.NEXT_MATCH_TYPE__FALLBACK:
                getFallback().clear();
                getFallback().addAll((Collection<? extends SequenceConstructor>)newValue);
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
            case XSLT20Package.NEXT_MATCH_TYPE__GROUP:
                getGroup().clear();
                return;
            case XSLT20Package.NEXT_MATCH_TYPE__WITH_PARAM:
                getWithParam().clear();
                return;
            case XSLT20Package.NEXT_MATCH_TYPE__FALLBACK:
                getFallback().clear();
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
            case XSLT20Package.NEXT_MATCH_TYPE__GROUP:
                return !getGroup().isEmpty();
            case XSLT20Package.NEXT_MATCH_TYPE__WITH_PARAM:
                return !getWithParam().isEmpty();
            case XSLT20Package.NEXT_MATCH_TYPE__FALLBACK:
                return !getFallback().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //NextMatchTypeImpl
