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

import org.w3._1999.xsl.transform.ApplyTemplatesType;
import org.w3._1999.xsl.transform.SortType;
import org.w3._1999.xsl.transform.WithParamType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Templates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl#getWithParam <em>With Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ApplyTemplatesTypeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyTemplatesTypeImpl extends ElementOnlyVersionedElementTypeImpl implements ApplyTemplatesType {
	/**
	 * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_EDEFAULT = "child::node()";

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
	 * This is true if the Select attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectESet;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Object mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyTemplatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.APPLY_TEMPLATES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.APPLY_TEMPLATES_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortType> getSort() {
		return getGroup().list(XSLT20Package.Literals.APPLY_TEMPLATES_TYPE__SORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WithParamType> getWithParam() {
		return getGroup().list(XSLT20Package.Literals.APPLY_TEMPLATES_TYPE__WITH_PARAM);
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
		boolean oldSelectESet = selectESet;
		selectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.APPLY_TEMPLATES_TYPE__SELECT, oldSelect, select, !oldSelectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelect() {
		String oldSelect = select;
		boolean oldSelectESet = selectESet;
		select = SELECT_EDEFAULT;
		selectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.APPLY_TEMPLATES_TYPE__SELECT, oldSelect, SELECT_EDEFAULT, oldSelectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelect() {
		return selectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Object newMode) {
		Object oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.APPLY_TEMPLATES_TYPE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.APPLY_TEMPLATES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case XSLT20Package.APPLY_TEMPLATES_TYPE__WITH_PARAM:
				return ((InternalEList<?>)getWithParam()).basicRemove(otherEnd, msgs);
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
			case XSLT20Package.APPLY_TEMPLATES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SORT:
				return getSort();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__WITH_PARAM:
				return getWithParam();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SELECT:
				return getSelect();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__MODE:
				return getMode();
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
			case XSLT20Package.APPLY_TEMPLATES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortType>)newValue);
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__WITH_PARAM:
				getWithParam().clear();
				getWithParam().addAll((Collection<? extends WithParamType>)newValue);
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SELECT:
				setSelect((String)newValue);
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__MODE:
				setMode(newValue);
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
			case XSLT20Package.APPLY_TEMPLATES_TYPE__GROUP:
				getGroup().clear();
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SORT:
				getSort().clear();
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__WITH_PARAM:
				getWithParam().clear();
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SELECT:
				unsetSelect();
				return;
			case XSLT20Package.APPLY_TEMPLATES_TYPE__MODE:
				setMode(MODE_EDEFAULT);
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
			case XSLT20Package.APPLY_TEMPLATES_TYPE__GROUP:
				return !getGroup().isEmpty();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SORT:
				return !getSort().isEmpty();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__WITH_PARAM:
				return !getWithParam().isEmpty();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__SELECT:
				return isSetSelect();
			case XSLT20Package.APPLY_TEMPLATES_TYPE__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
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
		if (selectESet) result.append(select); else result.append("<unset>");
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //ApplyTemplatesTypeImpl
