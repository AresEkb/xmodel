/**
 */
package org.w3._1999.xhtml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._1999.xhtml.ParamType1;
import org.w3._1999.xhtml.ValuetypeType1;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.ParamType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ParamType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ParamType1Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ParamType1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.ParamType1Impl#getValuetype <em>Valuetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamType1Impl extends MinimalEObjectImpl.Container implements ParamType1 {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

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
     * The default value of the '{@link #getValuetype() <em>Valuetype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuetype()
     * @generated
     * @ordered
     */
    protected static final ValuetypeType1 VALUETYPE_EDEFAULT = ValuetypeType1.DATA;

    /**
     * The cached value of the '{@link #getValuetype() <em>Valuetype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuetype()
     * @generated
     * @ordered
     */
    protected ValuetypeType1 valuetype = VALUETYPE_EDEFAULT;

    /**
     * This is true if the Valuetype attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valuetypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParamType1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getParamType1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.PARAM_TYPE1__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.PARAM_TYPE1__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.PARAM_TYPE1__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.PARAM_TYPE1__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuetypeType1 getValuetype() {
        return valuetype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValuetype(ValuetypeType1 newValuetype) {
        ValuetypeType1 oldValuetype = valuetype;
        valuetype = newValuetype == null ? VALUETYPE_EDEFAULT : newValuetype;
        boolean oldValuetypeESet = valuetypeESet;
        valuetypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.PARAM_TYPE1__VALUETYPE, oldValuetype, valuetype, !oldValuetypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValuetype() {
        ValuetypeType1 oldValuetype = valuetype;
        boolean oldValuetypeESet = valuetypeESet;
        valuetype = VALUETYPE_EDEFAULT;
        valuetypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.PARAM_TYPE1__VALUETYPE, oldValuetype, VALUETYPE_EDEFAULT, oldValuetypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValuetype() {
        return valuetypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XHTML11Package.PARAM_TYPE1__ID:
                return getId();
            case XHTML11Package.PARAM_TYPE1__NAME:
                return getName();
            case XHTML11Package.PARAM_TYPE1__TYPE:
                return getType();
            case XHTML11Package.PARAM_TYPE1__VALUE:
                return getValue();
            case XHTML11Package.PARAM_TYPE1__VALUETYPE:
                return getValuetype();
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
            case XHTML11Package.PARAM_TYPE1__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.PARAM_TYPE1__NAME:
                setName((String)newValue);
                return;
            case XHTML11Package.PARAM_TYPE1__TYPE:
                setType((String)newValue);
                return;
            case XHTML11Package.PARAM_TYPE1__VALUE:
                setValue((String)newValue);
                return;
            case XHTML11Package.PARAM_TYPE1__VALUETYPE:
                setValuetype((ValuetypeType1)newValue);
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
            case XHTML11Package.PARAM_TYPE1__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.PARAM_TYPE1__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XHTML11Package.PARAM_TYPE1__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case XHTML11Package.PARAM_TYPE1__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case XHTML11Package.PARAM_TYPE1__VALUETYPE:
                unsetValuetype();
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
            case XHTML11Package.PARAM_TYPE1__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.PARAM_TYPE1__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XHTML11Package.PARAM_TYPE1__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case XHTML11Package.PARAM_TYPE1__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case XHTML11Package.PARAM_TYPE1__VALUETYPE:
                return isSetValuetype();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", type: ");
        result.append(type);
        result.append(", value: ");
        result.append(value);
        result.append(", valuetype: ");
        if (valuetypeESet) result.append(valuetype); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ParamType1Impl
