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

import org.w3._1999.xsl.transform.SequenceConstructor;
import org.w3._1999.xsl.transform.SequenceType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceTypeImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SequenceTypeImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceTypeImpl extends ElementOnlyVersionedElementTypeImpl implements SequenceType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.SEQUENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.SEQUENCE_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceConstructor> getFallback() {
		return getGroup().list(XSLT20Package.Literals.SEQUENCE_TYPE__FALLBACK);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SEQUENCE_TYPE__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.SEQUENCE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.SEQUENCE_TYPE__FALLBACK:
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
			case XSLT20Package.SEQUENCE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XSLT20Package.SEQUENCE_TYPE__FALLBACK:
				return getFallback();
			case XSLT20Package.SEQUENCE_TYPE__SELECT:
				return getSelect();
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
			case XSLT20Package.SEQUENCE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XSLT20Package.SEQUENCE_TYPE__FALLBACK:
				getFallback().clear();
				getFallback().addAll((Collection<? extends SequenceConstructor>)newValue);
				return;
			case XSLT20Package.SEQUENCE_TYPE__SELECT:
				setSelect((String)newValue);
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
			case XSLT20Package.SEQUENCE_TYPE__GROUP:
				getGroup().clear();
				return;
			case XSLT20Package.SEQUENCE_TYPE__FALLBACK:
				getFallback().clear();
				return;
			case XSLT20Package.SEQUENCE_TYPE__SELECT:
				setSelect(SELECT_EDEFAULT);
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
			case XSLT20Package.SEQUENCE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case XSLT20Package.SEQUENCE_TYPE__FALLBACK:
				return !getFallback().isEmpty();
			case XSLT20Package.SEQUENCE_TYPE__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
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
		result.append(')');
		return result.toString();
	}

} //SequenceTypeImpl
