/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001.xml.schema.All;
import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.Assertion;
import org.w3._2001.xml.schema.Attribute;
import org.w3._2001.xml.schema.AttributeGroupRef;
import org.w3._2001.xml.schema.ExplicitGroup;
import org.w3._2001.xml.schema.GroupRef;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.OpenContentType;
import org.w3._2001.xml.schema.RestrictionType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getOpenContent <em>Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getFacetGroup <em>Facet Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getFacet <em>Facet</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionTypeImpl extends AnnotatedImpl implements RestrictionType {
    /**
     * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected static final QName BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected QName base = BASE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.RESTRICTION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenContentType getOpenContent() {
        return (OpenContentType)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__OPEN_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpenContent(OpenContentType newOpenContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__OPEN_CONTENT, newOpenContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupRef getGroup() {
        return (GroupRef)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__GROUP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(GroupRef newGroup) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__GROUP, newGroup);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public All getAll() {
        return (All)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__ALL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAll(All newAll) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__ALL, newAll);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getChoice() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__CHOICE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoice(ExplicitGroup newChoice) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__CHOICE, newChoice);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getSequence() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__SEQUENCE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence(ExplicitGroup newSequence) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__SEQUENCE, newSequence);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType getSimpleType() {
        return (LocalSimpleType)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__SIMPLE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(LocalSimpleType newSimpleType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__SIMPLE_TYPE, newSimpleType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup1() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE__GROUP1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFacetGroup() {
        return (FeatureMap)getGroup1().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE__FACET_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> getFacet() {
        return getFacetGroup().list(XMLSchema11Package.Literals.RESTRICTION_TYPE__FACET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        return (FeatureMap)getGroup1().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE__ANY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup2() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE__GROUP2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttribute() {
        return getGroup2().list(XMLSchema11Package.Literals.RESTRICTION_TYPE__ATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeGroupRef> getAttributeGroup() {
        return getGroup2().list(XMLSchema11Package.Literals.RESTRICTION_TYPE__ATTRIBUTE_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyAttributeType getAnyAttribute1() {
        return (AnyAttributeType)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE__ANY_ATTRIBUTE1, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnyAttribute1(AnyAttributeType newAnyAttribute1) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE__ANY_ATTRIBUTE1, newAnyAttribute1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Assertion> getAssert() {
        return getMixed().list(XMLSchema11Package.Literals.RESTRICTION_TYPE__ASSERT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase(QName newBase) {
        QName oldBase = base;
        base = newBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.RESTRICTION_TYPE__BASE, oldBase, base));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP1:
                return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
            case XMLSchema11Package.RESTRICTION_TYPE__FACET_GROUP:
                return ((InternalEList<?>)getFacetGroup()).basicRemove(otherEnd, msgs);
            case XMLSchema11Package.RESTRICTION_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP2:
                return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
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
            case XMLSchema11Package.RESTRICTION_TYPE__OPEN_CONTENT:
                return getOpenContent();
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP:
                return getGroup();
            case XMLSchema11Package.RESTRICTION_TYPE__ALL:
                return getAll();
            case XMLSchema11Package.RESTRICTION_TYPE__CHOICE:
                return getChoice();
            case XMLSchema11Package.RESTRICTION_TYPE__SEQUENCE:
                return getSequence();
            case XMLSchema11Package.RESTRICTION_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP1:
                if (coreType) return getGroup1();
                return ((FeatureMap.Internal)getGroup1()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE__FACET_GROUP:
                if (coreType) return getFacetGroup();
                return ((FeatureMap.Internal)getFacetGroup()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE__FACET:
                return getFacet();
            case XMLSchema11Package.RESTRICTION_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP2:
                if (coreType) return getGroup2();
                return ((FeatureMap.Internal)getGroup2()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE:
                return getAttribute();
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case XMLSchema11Package.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                return getAnyAttribute1();
            case XMLSchema11Package.RESTRICTION_TYPE__ASSERT:
                return getAssert();
            case XMLSchema11Package.RESTRICTION_TYPE__BASE:
                return getBase();
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
            case XMLSchema11Package.RESTRICTION_TYPE__OPEN_CONTENT:
                setOpenContent((OpenContentType)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP:
                setGroup((GroupRef)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ALL:
                setAll((All)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__CHOICE:
                setChoice((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__SEQUENCE:
                setSequence((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP1:
                ((FeatureMap.Internal)getGroup1()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__FACET_GROUP:
                ((FeatureMap.Internal)getFacetGroup()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP2:
                ((FeatureMap.Internal)getGroup2()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE:
                getAttribute().clear();
                getAttribute().addAll((Collection<? extends Attribute>)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                getAttributeGroup().addAll((Collection<? extends AttributeGroupRef>)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ASSERT:
                getAssert().clear();
                getAssert().addAll((Collection<? extends Assertion>)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__BASE:
                setBase((QName)newValue);
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
            case XMLSchema11Package.RESTRICTION_TYPE__OPEN_CONTENT:
                setOpenContent((OpenContentType)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP:
                setGroup((GroupRef)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ALL:
                setAll((All)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__CHOICE:
                setChoice((ExplicitGroup)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__SEQUENCE:
                setSequence((ExplicitGroup)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP1:
                getGroup1().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__FACET_GROUP:
                getFacetGroup().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ANY:
                getAny().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP2:
                getGroup2().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE:
                getAttribute().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__ASSERT:
                getAssert().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE__BASE:
                setBase(BASE_EDEFAULT);
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
            case XMLSchema11Package.RESTRICTION_TYPE__OPEN_CONTENT:
                return getOpenContent() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP:
                return getGroup() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__ALL:
                return getAll() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__CHOICE:
                return getChoice() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__SEQUENCE:
                return getSequence() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__SIMPLE_TYPE:
                return getSimpleType() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP1:
                return !getGroup1().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__FACET_GROUP:
                return !getFacetGroup().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__FACET:
                return !getFacet().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__ANY:
                return !getAny().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__GROUP2:
                return !getGroup2().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                return !getAttributeGroup().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                return getAnyAttribute1() != null;
            case XMLSchema11Package.RESTRICTION_TYPE__ASSERT:
                return !getAssert().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE__BASE:
                return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
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
        result.append(" (base: ");
        result.append(base);
        result.append(')');
        return result.toString();
    }

} //RestrictionTypeImpl
