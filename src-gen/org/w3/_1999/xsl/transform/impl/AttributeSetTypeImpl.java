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

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xsl.transform.AttributeSetType;
import org.w3._1999.xsl.transform.AttributeType;
import org.w3._1999.xsl.transform.XSLT20Factory;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.AttributeSetTypeImpl#getUseAttributeSets <em>Use Attribute Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeSetTypeImpl extends ElementOnlyVersionedElementTypeImpl implements AttributeSetType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.ATTRIBUTE_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.ATTRIBUTE_SET_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeType> getAttribute() {
		return getGroup().list(XSLT20Package.Literals.ATTRIBUTE_SET_TYPE__ATTRIBUTE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_SET_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS, oldUseAttributeSets, useAttributeSets, !oldUseAttributeSetsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS, oldUseAttributeSets, USE_ATTRIBUTE_SETS_EDEFAULT, oldUseAttributeSetsESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.ATTRIBUTE_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.ATTRIBUTE_SET_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case XSLT20Package.ATTRIBUTE_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XSLT20Package.ATTRIBUTE_SET_TYPE__ATTRIBUTE:
				return getAttribute();
			case XSLT20Package.ATTRIBUTE_SET_TYPE__NAME:
				return getName();
			case XSLT20Package.ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS:
				return getUseAttributeSets();
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
			case XSLT20Package.ATTRIBUTE_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XSLT20Package.ATTRIBUTE_SET_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends AttributeType>)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_SET_TYPE__NAME:
				setName((String)newValue);
				return;
			case XSLT20Package.ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS:
				setUseAttributeSets((List<String>)newValue);
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
			case XSLT20Package.ATTRIBUTE_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XSLT20Package.ATTRIBUTE_SET_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case XSLT20Package.ATTRIBUTE_SET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSLT20Package.ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS:
				unsetUseAttributeSets();
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
			case XSLT20Package.ATTRIBUTE_SET_TYPE__GROUP:
				return !getGroup().isEmpty();
			case XSLT20Package.ATTRIBUTE_SET_TYPE__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case XSLT20Package.ATTRIBUTE_SET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSLT20Package.ATTRIBUTE_SET_TYPE__USE_ATTRIBUTE_SETS:
				return isSetUseAttributeSets();
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
		result.append(", useAttributeSets: ");
		if (useAttributeSetsESet) result.append(useAttributeSets); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AttributeSetTypeImpl
