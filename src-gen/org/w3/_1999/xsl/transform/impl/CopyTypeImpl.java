/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.CopyType;
import org.w3._1999.xsl.transform.ValidationType;
import org.w3._1999.xsl.transform.XSLT20Factory;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl#getCopyNamespaces <em>Copy Namespaces</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl#getInheritNamespaces <em>Inherit Namespaces</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl#getUseAttributeSets <em>Use Attribute Sets</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.CopyTypeImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyTypeImpl extends SequenceConstructorImpl implements CopyType {
    /**
     * The default value of the '{@link #getCopyNamespaces() <em>Copy Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyNamespaces()
     * @generated
     * @ordered
     */
    protected static final YesOrNo COPY_NAMESPACES_EDEFAULT = YesOrNo.YES;

    /**
     * The cached value of the '{@link #getCopyNamespaces() <em>Copy Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyNamespaces()
     * @generated
     * @ordered
     */
    protected YesOrNo copyNamespaces = COPY_NAMESPACES_EDEFAULT;

    /**
     * This is true if the Copy Namespaces attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean copyNamespacesESet;

    /**
     * The default value of the '{@link #getInheritNamespaces() <em>Inherit Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritNamespaces()
     * @generated
     * @ordered
     */
    protected static final YesOrNo INHERIT_NAMESPACES_EDEFAULT = YesOrNo.YES;

    /**
     * The cached value of the '{@link #getInheritNamespaces() <em>Inherit Namespaces</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritNamespaces()
     * @generated
     * @ordered
     */
    protected YesOrNo inheritNamespaces = INHERIT_NAMESPACES_EDEFAULT;

    /**
     * This is true if the Inherit Namespaces attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inheritNamespacesESet;

    /**
     * The default value of the '{@link #getUseAttributeSets() <em>Use Attribute Sets</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseAttributeSets()
     * @generated
     * @ordered
     */
    @SuppressWarnings("unchecked")
    protected static final List<String> USE_ATTRIBUTE_SETS_EDEFAULT = (List<String>)XSLT20Factory.eINSTANCE.createFromString(XSLT20Package.eINSTANCE.getQNames(), "");

    /**
     * The cached value of the '{@link #getUseAttributeSets() <em>Use Attribute Sets</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUseAttributeSets()
     * @generated
     * @ordered
     */
    protected List<String> useAttributeSets = USE_ATTRIBUTE_SETS_EDEFAULT;

    /**
     * This is true if the Use Attribute Sets attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useAttributeSetsESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidation()
     * @generated
     * @ordered
     */
    protected static final ValidationType VALIDATION_EDEFAULT = ValidationType.STRICT;

    /**
     * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidation()
     * @generated
     * @ordered
     */
    protected ValidationType validation = VALIDATION_EDEFAULT;

    /**
     * This is true if the Validation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean validationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CopyTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.COPY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNo getCopyNamespaces() {
        return copyNamespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCopyNamespaces(YesOrNo newCopyNamespaces) {
        YesOrNo oldCopyNamespaces = copyNamespaces;
        copyNamespaces = newCopyNamespaces == null ? COPY_NAMESPACES_EDEFAULT : newCopyNamespaces;
        boolean oldCopyNamespacesESet = copyNamespacesESet;
        copyNamespacesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_TYPE__COPY_NAMESPACES, oldCopyNamespaces, copyNamespaces, !oldCopyNamespacesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCopyNamespaces() {
        YesOrNo oldCopyNamespaces = copyNamespaces;
        boolean oldCopyNamespacesESet = copyNamespacesESet;
        copyNamespaces = COPY_NAMESPACES_EDEFAULT;
        copyNamespacesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.COPY_TYPE__COPY_NAMESPACES, oldCopyNamespaces, COPY_NAMESPACES_EDEFAULT, oldCopyNamespacesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCopyNamespaces() {
        return copyNamespacesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNo getInheritNamespaces() {
        return inheritNamespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInheritNamespaces(YesOrNo newInheritNamespaces) {
        YesOrNo oldInheritNamespaces = inheritNamespaces;
        inheritNamespaces = newInheritNamespaces == null ? INHERIT_NAMESPACES_EDEFAULT : newInheritNamespaces;
        boolean oldInheritNamespacesESet = inheritNamespacesESet;
        inheritNamespacesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_TYPE__INHERIT_NAMESPACES, oldInheritNamespaces, inheritNamespaces, !oldInheritNamespacesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInheritNamespaces() {
        YesOrNo oldInheritNamespaces = inheritNamespaces;
        boolean oldInheritNamespacesESet = inheritNamespacesESet;
        inheritNamespaces = INHERIT_NAMESPACES_EDEFAULT;
        inheritNamespacesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.COPY_TYPE__INHERIT_NAMESPACES, oldInheritNamespaces, INHERIT_NAMESPACES_EDEFAULT, oldInheritNamespacesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInheritNamespaces() {
        return inheritNamespacesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getUseAttributeSets() {
        return useAttributeSets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseAttributeSets(List<String> newUseAttributeSets) {
        List<String> oldUseAttributeSets = useAttributeSets;
        useAttributeSets = newUseAttributeSets;
        boolean oldUseAttributeSetsESet = useAttributeSetsESet;
        useAttributeSetsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_TYPE__USE_ATTRIBUTE_SETS, oldUseAttributeSets, useAttributeSets, !oldUseAttributeSetsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUseAttributeSets() {
        List<String> oldUseAttributeSets = useAttributeSets;
        boolean oldUseAttributeSetsESet = useAttributeSetsESet;
        useAttributeSets = USE_ATTRIBUTE_SETS_EDEFAULT;
        useAttributeSetsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.COPY_TYPE__USE_ATTRIBUTE_SETS, oldUseAttributeSets, USE_ATTRIBUTE_SETS_EDEFAULT, oldUseAttributeSetsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUseAttributeSets() {
        return useAttributeSetsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationType getValidation() {
        return validation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidation(ValidationType newValidation) {
        ValidationType oldValidation = validation;
        validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
        boolean oldValidationESet = validationESet;
        validationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.COPY_TYPE__VALIDATION, oldValidation, validation, !oldValidationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValidation() {
        ValidationType oldValidation = validation;
        boolean oldValidationESet = validationESet;
        validation = VALIDATION_EDEFAULT;
        validationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.COPY_TYPE__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValidation() {
        return validationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XSLT20Package.COPY_TYPE__COPY_NAMESPACES:
                return getCopyNamespaces();
            case XSLT20Package.COPY_TYPE__INHERIT_NAMESPACES:
                return getInheritNamespaces();
            case XSLT20Package.COPY_TYPE__USE_ATTRIBUTE_SETS:
                return getUseAttributeSets();
            case XSLT20Package.COPY_TYPE__TYPE:
                return getType();
            case XSLT20Package.COPY_TYPE__VALIDATION:
                return getValidation();
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
            case XSLT20Package.COPY_TYPE__COPY_NAMESPACES:
                setCopyNamespaces((YesOrNo)newValue);
                return;
            case XSLT20Package.COPY_TYPE__INHERIT_NAMESPACES:
                setInheritNamespaces((YesOrNo)newValue);
                return;
            case XSLT20Package.COPY_TYPE__USE_ATTRIBUTE_SETS:
                setUseAttributeSets((List<String>)newValue);
                return;
            case XSLT20Package.COPY_TYPE__TYPE:
                setType((String)newValue);
                return;
            case XSLT20Package.COPY_TYPE__VALIDATION:
                setValidation((ValidationType)newValue);
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
            case XSLT20Package.COPY_TYPE__COPY_NAMESPACES:
                unsetCopyNamespaces();
                return;
            case XSLT20Package.COPY_TYPE__INHERIT_NAMESPACES:
                unsetInheritNamespaces();
                return;
            case XSLT20Package.COPY_TYPE__USE_ATTRIBUTE_SETS:
                unsetUseAttributeSets();
                return;
            case XSLT20Package.COPY_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case XSLT20Package.COPY_TYPE__VALIDATION:
                unsetValidation();
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
            case XSLT20Package.COPY_TYPE__COPY_NAMESPACES:
                return isSetCopyNamespaces();
            case XSLT20Package.COPY_TYPE__INHERIT_NAMESPACES:
                return isSetInheritNamespaces();
            case XSLT20Package.COPY_TYPE__USE_ATTRIBUTE_SETS:
                return isSetUseAttributeSets();
            case XSLT20Package.COPY_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case XSLT20Package.COPY_TYPE__VALIDATION:
                return isSetValidation();
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
        result.append(" (copyNamespaces: ");
        if (copyNamespacesESet) result.append(copyNamespaces); else result.append("<unset>");
        result.append(", inheritNamespaces: ");
        if (inheritNamespacesESet) result.append(inheritNamespaces); else result.append("<unset>");
        result.append(", useAttributeSets: ");
        if (useAttributeSetsESet) result.append(useAttributeSets); else result.append("<unset>");
        result.append(", type: ");
        result.append(type);
        result.append(", validation: ");
        if (validationESet) result.append(validation); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //CopyTypeImpl
