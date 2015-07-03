/**
 */
package org.w3._1999.xsl.transform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.FunctionType;
import org.w3._1999.xsl.transform.ParamType;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.VersionedElementType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.FunctionTypeImpl#getAs <em>As</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTypeImpl extends VersionedElementTypeImpl implements FunctionType {
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
     * The default value of the '{@link #getOverride() <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverride()
     * @generated
     * @ordered
     */
    protected static final YesOrNo OVERRIDE_EDEFAULT = YesOrNo.YES;

    /**
     * The cached value of the '{@link #getOverride() <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverride()
     * @generated
     * @ordered
     */
    protected YesOrNo override = OVERRIDE_EDEFAULT;

    /**
     * This is true if the Override attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean overrideESet;

    /**
     * The default value of the '{@link #getAs() <em>As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAs()
     * @generated
     * @ordered
     */
    protected static final String AS_EDEFAULT = "item()*";

    /**
     * The cached value of the '{@link #getAs() <em>As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAs()
     * @generated
     * @ordered
     */
    protected String as = AS_EDEFAULT;

    /**
     * This is true if the As attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XSLT20Package.Literals.FUNCTION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParamType> getParam() {
        return getMixed().list(XSLT20Package.Literals.FUNCTION_TYPE__PARAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getSequenceConstructorGroup() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableType> getVariable() {
        return getSequenceConstructorGroup().list(XSLT20Package.Literals.FUNCTION_TYPE__VARIABLE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getInstructionGroup() {
        return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FUNCTION_TYPE__INSTRUCTION_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VersionedElementType> getInstruction() {
        return getInstructionGroup().list(XSLT20Package.Literals.FUNCTION_TYPE__INSTRUCTION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getLiteralResultElementGroup() {
        return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> getLiteralResultElement() {
        return getLiteralResultElementGroup().list(XSLT20Package.Literals.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FUNCTION_TYPE__ANY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny1() {
        return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FUNCTION_TYPE__ANY1);
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
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FUNCTION_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesOrNo getOverride() {
        return override;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOverride(YesOrNo newOverride) {
        YesOrNo oldOverride = override;
        override = newOverride == null ? OVERRIDE_EDEFAULT : newOverride;
        boolean oldOverrideESet = overrideESet;
        overrideESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FUNCTION_TYPE__OVERRIDE, oldOverride, override, !oldOverrideESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOverride() {
        YesOrNo oldOverride = override;
        boolean oldOverrideESet = overrideESet;
        override = OVERRIDE_EDEFAULT;
        overrideESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.FUNCTION_TYPE__OVERRIDE, oldOverride, OVERRIDE_EDEFAULT, oldOverrideESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOverride() {
        return overrideESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAs() {
        return as;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAs(String newAs) {
        String oldAs = as;
        as = newAs;
        boolean oldAsESet = asESet;
        asESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FUNCTION_TYPE__AS, oldAs, as, !oldAsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAs() {
        String oldAs = as;
        boolean oldAsESet = asESet;
        as = AS_EDEFAULT;
        asESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.FUNCTION_TYPE__AS, oldAs, AS_EDEFAULT, oldAsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAs() {
        return asESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XSLT20Package.FUNCTION_TYPE__PARAM:
                return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
                return ((InternalEList<?>)getSequenceConstructorGroup()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__VARIABLE:
                return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION_GROUP:
                return ((InternalEList<?>)getInstructionGroup()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION:
                return ((InternalEList<?>)getInstruction()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
                return ((InternalEList<?>)getLiteralResultElementGroup()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT:
                return ((InternalEList<?>)getLiteralResultElement()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case XSLT20Package.FUNCTION_TYPE__ANY1:
                return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
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
            case XSLT20Package.FUNCTION_TYPE__PARAM:
                return getParam();
            case XSLT20Package.FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
                if (coreType) return getSequenceConstructorGroup();
                return ((FeatureMap.Internal)getSequenceConstructorGroup()).getWrapper();
            case XSLT20Package.FUNCTION_TYPE__VARIABLE:
                return getVariable();
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION_GROUP:
                if (coreType) return getInstructionGroup();
                return ((FeatureMap.Internal)getInstructionGroup()).getWrapper();
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION:
                return getInstruction();
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
                if (coreType) return getLiteralResultElementGroup();
                return ((FeatureMap.Internal)getLiteralResultElementGroup()).getWrapper();
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT:
                return getLiteralResultElement();
            case XSLT20Package.FUNCTION_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case XSLT20Package.FUNCTION_TYPE__ANY1:
                if (coreType) return getAny1();
                return ((FeatureMap.Internal)getAny1()).getWrapper();
            case XSLT20Package.FUNCTION_TYPE__NAME:
                return getName();
            case XSLT20Package.FUNCTION_TYPE__OVERRIDE:
                return getOverride();
            case XSLT20Package.FUNCTION_TYPE__AS:
                return getAs();
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
            case XSLT20Package.FUNCTION_TYPE__PARAM:
                getParam().clear();
                getParam().addAll((Collection<? extends ParamType>)newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
                ((FeatureMap.Internal)getSequenceConstructorGroup()).set(newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__VARIABLE:
                getVariable().clear();
                getVariable().addAll((Collection<? extends VariableType>)newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION_GROUP:
                ((FeatureMap.Internal)getInstructionGroup()).set(newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
                ((FeatureMap.Internal)getLiteralResultElementGroup()).set(newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__ANY1:
                ((FeatureMap.Internal)getAny1()).set(newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__NAME:
                setName((String)newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__OVERRIDE:
                setOverride((YesOrNo)newValue);
                return;
            case XSLT20Package.FUNCTION_TYPE__AS:
                setAs((String)newValue);
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
            case XSLT20Package.FUNCTION_TYPE__PARAM:
                getParam().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
                getSequenceConstructorGroup().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__VARIABLE:
                getVariable().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION_GROUP:
                getInstructionGroup().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
                getLiteralResultElementGroup().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__ANY:
                getAny().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__ANY1:
                getAny1().clear();
                return;
            case XSLT20Package.FUNCTION_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XSLT20Package.FUNCTION_TYPE__OVERRIDE:
                unsetOverride();
                return;
            case XSLT20Package.FUNCTION_TYPE__AS:
                unsetAs();
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
            case XSLT20Package.FUNCTION_TYPE__PARAM:
                return !getParam().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
                return !getSequenceConstructorGroup().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__VARIABLE:
                return !getVariable().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION_GROUP:
                return !getInstructionGroup().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__INSTRUCTION:
                return !getInstruction().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
                return !getLiteralResultElementGroup().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__LITERAL_RESULT_ELEMENT:
                return !getLiteralResultElement().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__ANY:
                return !getAny().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__ANY1:
                return !getAny1().isEmpty();
            case XSLT20Package.FUNCTION_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XSLT20Package.FUNCTION_TYPE__OVERRIDE:
                return isSetOverride();
            case XSLT20Package.FUNCTION_TYPE__AS:
                return isSetAs();
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
        result.append(", override: ");
        if (overrideESet) result.append(override); else result.append("<unset>");
        result.append(", as: ");
        if (asESet) result.append(as); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //FunctionTypeImpl
