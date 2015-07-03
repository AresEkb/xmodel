/**
 */
package org.w3._2001.xml.schema.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2001.xml.schema.Attribute;
import org.w3._2001.xml.schema.FormChoice;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.UseType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeImpl#isInheritable <em>Inheritable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends AnnotatedImpl implements Attribute {
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
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected static final QName REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected QName ref = REF_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final QName TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected QName type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUse()
     * @generated
     * @ordered
     */
    protected static final UseType USE_EDEFAULT = UseType.OPTIONAL;

    /**
     * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUse()
     * @generated
     * @ordered
     */
    protected UseType use = USE_EDEFAULT;

    /**
     * This is true if the Use attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean useESet;

    /**
     * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected String default_ = DEFAULT_EDEFAULT;

    /**
     * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixed()
     * @generated
     * @ordered
     */
    protected static final String FIXED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixed()
     * @generated
     * @ordered
     */
    protected String fixed = FIXED_EDEFAULT;

    /**
     * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForm()
     * @generated
     * @ordered
     */
    protected static final FormChoice FORM_EDEFAULT = FormChoice.QUALIFIED;

    /**
     * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForm()
     * @generated
     * @ordered
     */
    protected FormChoice form = FORM_EDEFAULT;

    /**
     * This is true if the Form attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean formESet;

    /**
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected static final String TARGET_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #isInheritable() <em>Inheritable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInheritable()
     * @generated
     * @ordered
     */
    protected static final boolean INHERITABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInheritable() <em>Inheritable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInheritable()
     * @generated
     * @ordered
     */
    protected boolean inheritable = INHERITABLE_EDEFAULT;

    /**
     * This is true if the Inheritable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inheritableESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType getSimpleType() {
        return (LocalSimpleType)getMixed().get(XMLSchema11Package.Literals.ATTRIBUTE__SIMPLE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(LocalSimpleType newSimpleType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.ATTRIBUTE__SIMPLE_TYPE, newSimpleType);
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
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getRef() {
        return ref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRef(QName newRef) {
        QName oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__REF, oldRef, ref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(QName newType) {
        QName oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseType getUse() {
        return use;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUse(UseType newUse) {
        UseType oldUse = use;
        use = newUse == null ? USE_EDEFAULT : newUse;
        boolean oldUseESet = useESet;
        useESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__USE, oldUse, use, !oldUseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUse() {
        UseType oldUse = use;
        boolean oldUseESet = useESet;
        use = USE_EDEFAULT;
        useESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.ATTRIBUTE__USE, oldUse, USE_EDEFAULT, oldUseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUse() {
        return useESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefault() {
        return default_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefault(String newDefault) {
        String oldDefault = default_;
        default_ = newDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__DEFAULT, oldDefault, default_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFixed() {
        return fixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFixed(String newFixed) {
        String oldFixed = fixed;
        fixed = newFixed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__FIXED, oldFixed, fixed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormChoice getForm() {
        return form;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setForm(FormChoice newForm) {
        FormChoice oldForm = form;
        form = newForm == null ? FORM_EDEFAULT : newForm;
        boolean oldFormESet = formESet;
        formESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__FORM, oldForm, form, !oldFormESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetForm() {
        FormChoice oldForm = form;
        boolean oldFormESet = formESet;
        form = FORM_EDEFAULT;
        formESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.ATTRIBUTE__FORM, oldForm, FORM_EDEFAULT, oldFormESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetForm() {
        return formESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInheritable() {
        return inheritable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInheritable(boolean newInheritable) {
        boolean oldInheritable = inheritable;
        inheritable = newInheritable;
        boolean oldInheritableESet = inheritableESet;
        inheritableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE__INHERITABLE, oldInheritable, inheritable, !oldInheritableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInheritable() {
        boolean oldInheritable = inheritable;
        boolean oldInheritableESet = inheritableESet;
        inheritable = INHERITABLE_EDEFAULT;
        inheritableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.ATTRIBUTE__INHERITABLE, oldInheritable, INHERITABLE_EDEFAULT, oldInheritableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInheritable() {
        return inheritableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.ATTRIBUTE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.ATTRIBUTE__NAME:
                return getName();
            case XMLSchema11Package.ATTRIBUTE__REF:
                return getRef();
            case XMLSchema11Package.ATTRIBUTE__TYPE:
                return getType();
            case XMLSchema11Package.ATTRIBUTE__USE:
                return getUse();
            case XMLSchema11Package.ATTRIBUTE__DEFAULT:
                return getDefault();
            case XMLSchema11Package.ATTRIBUTE__FIXED:
                return getFixed();
            case XMLSchema11Package.ATTRIBUTE__FORM:
                return getForm();
            case XMLSchema11Package.ATTRIBUTE__TARGET_NAMESPACE:
                return getTargetNamespace();
            case XMLSchema11Package.ATTRIBUTE__INHERITABLE:
                return isInheritable();
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
            case XMLSchema11Package.ATTRIBUTE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__NAME:
                setName((String)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__REF:
                setRef((QName)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__TYPE:
                setType((QName)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__USE:
                setUse((UseType)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__DEFAULT:
                setDefault((String)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__FIXED:
                setFixed((String)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__FORM:
                setForm((FormChoice)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE__INHERITABLE:
                setInheritable((Boolean)newValue);
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
            case XMLSchema11Package.ATTRIBUTE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)null);
                return;
            case XMLSchema11Package.ATTRIBUTE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE__REF:
                setRef(REF_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE__USE:
                unsetUse();
                return;
            case XMLSchema11Package.ATTRIBUTE__DEFAULT:
                setDefault(DEFAULT_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE__FIXED:
                setFixed(FIXED_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE__FORM:
                unsetForm();
                return;
            case XMLSchema11Package.ATTRIBUTE__TARGET_NAMESPACE:
                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE__INHERITABLE:
                unsetInheritable();
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
            case XMLSchema11Package.ATTRIBUTE__SIMPLE_TYPE:
                return getSimpleType() != null;
            case XMLSchema11Package.ATTRIBUTE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XMLSchema11Package.ATTRIBUTE__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
            case XMLSchema11Package.ATTRIBUTE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case XMLSchema11Package.ATTRIBUTE__USE:
                return isSetUse();
            case XMLSchema11Package.ATTRIBUTE__DEFAULT:
                return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
            case XMLSchema11Package.ATTRIBUTE__FIXED:
                return FIXED_EDEFAULT == null ? fixed != null : !FIXED_EDEFAULT.equals(fixed);
            case XMLSchema11Package.ATTRIBUTE__FORM:
                return isSetForm();
            case XMLSchema11Package.ATTRIBUTE__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
            case XMLSchema11Package.ATTRIBUTE__INHERITABLE:
                return isSetInheritable();
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
        result.append(", ref: ");
        result.append(ref);
        result.append(", type: ");
        result.append(type);
        result.append(", use: ");
        if (useESet) result.append(use); else result.append("<unset>");
        result.append(", default: ");
        result.append(default_);
        result.append(", fixed: ");
        result.append(fixed);
        result.append(", form: ");
        if (formESet) result.append(form); else result.append("<unset>");
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(", inheritable: ");
        if (inheritableESet) result.append(inheritable); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AttributeImpl
