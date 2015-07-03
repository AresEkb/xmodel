/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.CharacterMapType;
import org.w3._1999.xsl.transform.OutputCharacterType;
import org.w3._1999.xsl.transform.XSLT20Factory;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl#getOutputCharacter <em>Output Character</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CharacterMapTypeImpl#getUseCharacterMaps <em>Use Character Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterMapTypeImpl extends ElementOnlyVersionedElementTypeImpl implements CharacterMapType {
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
     * The default value of the '{@link #getUseCharacterMaps() <em>Use Character Maps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseCharacterMaps()
     * @generated
     * @ordered
     */
    @SuppressWarnings("unchecked")
    protected static final List<String> USE_CHARACTER_MAPS_EDEFAULT = (List<String>)XSLT20Factory.eINSTANCE.createFromString(XSLT20Package.eINSTANCE.getQNames(), "");

    /**
     * The cached value of the '{@link #getUseCharacterMaps() <em>Use Character Maps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseCharacterMaps()
     * @generated
     * @ordered
     */
    protected List<String> useCharacterMaps = USE_CHARACTER_MAPS_EDEFAULT;

    /**
     * This is true if the Use Character Maps attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useCharacterMapsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharacterMapTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.CHARACTER_MAP_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputCharacterType> getOutputCharacter() {
        return getMixed().list(XSLT20Package.Literals.CHARACTER_MAP_TYPE__OUTPUT_CHARACTER);
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.CHARACTER_MAP_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getUseCharacterMaps() {
        return useCharacterMaps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseCharacterMaps(List<String> newUseCharacterMaps) {
        List<String> oldUseCharacterMaps = useCharacterMaps;
        useCharacterMaps = newUseCharacterMaps;
        boolean oldUseCharacterMapsESet = useCharacterMapsESet;
        useCharacterMapsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS, oldUseCharacterMaps, useCharacterMaps, !oldUseCharacterMapsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseCharacterMaps() {
        List<String> oldUseCharacterMaps = useCharacterMaps;
        boolean oldUseCharacterMapsESet = useCharacterMapsESet;
        useCharacterMaps = USE_CHARACTER_MAPS_EDEFAULT;
        useCharacterMapsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS, oldUseCharacterMaps, USE_CHARACTER_MAPS_EDEFAULT, oldUseCharacterMapsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseCharacterMaps() {
        return useCharacterMapsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XSLT20Package.CHARACTER_MAP_TYPE__OUTPUT_CHARACTER:
                return ((InternalEList<?>)getOutputCharacter()).basicRemove(otherEnd, msgs);
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
            case XSLT20Package.CHARACTER_MAP_TYPE__OUTPUT_CHARACTER:
                return getOutputCharacter();
            case XSLT20Package.CHARACTER_MAP_TYPE__NAME:
                return getName();
            case XSLT20Package.CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS:
                return getUseCharacterMaps();
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
            case XSLT20Package.CHARACTER_MAP_TYPE__OUTPUT_CHARACTER:
                getOutputCharacter().clear();
                getOutputCharacter().addAll((Collection<? extends OutputCharacterType>)newValue);
                return;
            case XSLT20Package.CHARACTER_MAP_TYPE__NAME:
                setName((String)newValue);
                return;
            case XSLT20Package.CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS:
                setUseCharacterMaps((List<String>)newValue);
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
            case XSLT20Package.CHARACTER_MAP_TYPE__OUTPUT_CHARACTER:
                getOutputCharacter().clear();
                return;
            case XSLT20Package.CHARACTER_MAP_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XSLT20Package.CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS:
                unsetUseCharacterMaps();
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
            case XSLT20Package.CHARACTER_MAP_TYPE__OUTPUT_CHARACTER:
                return !getOutputCharacter().isEmpty();
            case XSLT20Package.CHARACTER_MAP_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XSLT20Package.CHARACTER_MAP_TYPE__USE_CHARACTER_MAPS:
                return isSetUseCharacterMaps();
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
        result.append(", useCharacterMaps: ");
        if (useCharacterMapsESet) result.append(useCharacterMaps); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CharacterMapTypeImpl
