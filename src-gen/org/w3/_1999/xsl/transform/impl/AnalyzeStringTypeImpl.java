/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.AnalyzeStringType;
import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analyze String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl#getMatchingSubstring <em>Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl#getNonMatchingSubstring <em>Non Matching Substring</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AnalyzeStringTypeImpl#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyzeStringTypeImpl extends ElementOnlyVersionedElementTypeImpl implements AnalyzeStringType {
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
     * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegex()
     * @generated
     * @ordered
     */
    protected static final String REGEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegex()
     * @generated
     * @ordered
     */
    protected String regex = REGEX_EDEFAULT;

    /**
     * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlags()
     * @generated
     * @ordered
     */
    protected static final String FLAGS_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlags()
     * @generated
     * @ordered
     */
    protected String flags = FLAGS_EDEFAULT;

    /**
     * This is true if the Flags attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flagsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalyzeStringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.ANALYZE_STRING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getMatchingSubstring() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMatchingSubstring(SequenceConstructor newMatchingSubstring, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING, newMatchingSubstring, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatchingSubstring(SequenceConstructor newMatchingSubstring) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING, newMatchingSubstring);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceConstructor getNonMatchingSubstring() {
        return (SequenceConstructor)getMixed().get(XSLT20Package.Literals.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNonMatchingSubstring(SequenceConstructor newNonMatchingSubstring, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(XSLT20Package.Literals.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING, newNonMatchingSubstring, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNonMatchingSubstring(SequenceConstructor newNonMatchingSubstring) {
        ((FeatureMap.Internal)getMixed()).set(XSLT20Package.Literals.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING, newNonMatchingSubstring);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SequenceConstructor> getFallback() {
        return getMixed().list(XSLT20Package.Literals.ANALYZE_STRING_TYPE__FALLBACK);
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ANALYZE_STRING_TYPE__SELECT, oldSelect, select));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRegex() {
        return regex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRegex(String newRegex) {
        String oldRegex = regex;
        regex = newRegex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ANALYZE_STRING_TYPE__REGEX, oldRegex, regex));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFlags() {
        return flags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlags(String newFlags) {
        String oldFlags = flags;
        flags = newFlags;
        boolean oldFlagsESet = flagsESet;
        flagsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ANALYZE_STRING_TYPE__FLAGS, oldFlags, flags, !oldFlagsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFlags() {
        String oldFlags = flags;
        boolean oldFlagsESet = flagsESet;
        flags = FLAGS_EDEFAULT;
        flagsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.ANALYZE_STRING_TYPE__FLAGS, oldFlags, FLAGS_EDEFAULT, oldFlagsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFlags() {
        return flagsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XSLT20Package.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING:
                return basicSetMatchingSubstring(null, msgs);
            case XSLT20Package.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING:
                return basicSetNonMatchingSubstring(null, msgs);
            case XSLT20Package.ANALYZE_STRING_TYPE__FALLBACK:
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
            case XSLT20Package.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING:
                return getMatchingSubstring();
            case XSLT20Package.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING:
                return getNonMatchingSubstring();
            case XSLT20Package.ANALYZE_STRING_TYPE__FALLBACK:
                return getFallback();
            case XSLT20Package.ANALYZE_STRING_TYPE__SELECT:
                return getSelect();
            case XSLT20Package.ANALYZE_STRING_TYPE__REGEX:
                return getRegex();
            case XSLT20Package.ANALYZE_STRING_TYPE__FLAGS:
                return getFlags();
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
            case XSLT20Package.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING:
                setMatchingSubstring((SequenceConstructor)newValue);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING:
                setNonMatchingSubstring((SequenceConstructor)newValue);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__FALLBACK:
                getFallback().clear();
                getFallback().addAll((Collection<? extends SequenceConstructor>)newValue);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__SELECT:
                setSelect((String)newValue);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__REGEX:
                setRegex((String)newValue);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__FLAGS:
                setFlags((String)newValue);
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
            case XSLT20Package.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING:
                setMatchingSubstring((SequenceConstructor)null);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING:
                setNonMatchingSubstring((SequenceConstructor)null);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__FALLBACK:
                getFallback().clear();
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__SELECT:
                setSelect(SELECT_EDEFAULT);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__REGEX:
                setRegex(REGEX_EDEFAULT);
                return;
            case XSLT20Package.ANALYZE_STRING_TYPE__FLAGS:
                unsetFlags();
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
            case XSLT20Package.ANALYZE_STRING_TYPE__MATCHING_SUBSTRING:
                return getMatchingSubstring() != null;
            case XSLT20Package.ANALYZE_STRING_TYPE__NON_MATCHING_SUBSTRING:
                return getNonMatchingSubstring() != null;
            case XSLT20Package.ANALYZE_STRING_TYPE__FALLBACK:
                return !getFallback().isEmpty();
            case XSLT20Package.ANALYZE_STRING_TYPE__SELECT:
                return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
            case XSLT20Package.ANALYZE_STRING_TYPE__REGEX:
                return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
            case XSLT20Package.ANALYZE_STRING_TYPE__FLAGS:
                return isSetFlags();
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
        result.append(", regex: ");
        result.append(regex);
        result.append(", flags: ");
        if (flagsESet) result.append(flags); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AnalyzeStringTypeImpl
