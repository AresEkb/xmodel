/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.ParamType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl#getAs <em>As</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ParamTypeImpl#getTunnel <em>Tunnel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamTypeImpl extends SequenceConstructorImpl implements ParamType {
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
	 * The default value of the '{@link #getAs() <em>As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAs()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_EDEFAULT = null;

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
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo REQUIRED_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo required = REQUIRED_EDEFAULT;

	/**
	 * This is true if the Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requiredESet;

	/**
	 * The default value of the '{@link #getTunnel() <em>Tunnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnel()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo TUNNEL_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getTunnel() <em>Tunnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTunnel()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo tunnel = TUNNEL_EDEFAULT;

	/**
	 * This is true if the Tunnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tunnelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.PARAM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.PARAM_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.PARAM_TYPE__SELECT, oldSelect, select));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.PARAM_TYPE__AS, oldAs, as));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(YesOrNo newRequired) {
		YesOrNo oldRequired = required;
		required = newRequired == null ? REQUIRED_EDEFAULT : newRequired;
		boolean oldRequiredESet = requiredESet;
		requiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.PARAM_TYPE__REQUIRED, oldRequired, required, !oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequired() {
		YesOrNo oldRequired = required;
		boolean oldRequiredESet = requiredESet;
		required = REQUIRED_EDEFAULT;
		requiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.PARAM_TYPE__REQUIRED, oldRequired, REQUIRED_EDEFAULT, oldRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequired() {
		return requiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getTunnel() {
		return tunnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTunnel(YesOrNo newTunnel) {
		YesOrNo oldTunnel = tunnel;
		tunnel = newTunnel == null ? TUNNEL_EDEFAULT : newTunnel;
		boolean oldTunnelESet = tunnelESet;
		tunnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.PARAM_TYPE__TUNNEL, oldTunnel, tunnel, !oldTunnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTunnel() {
		YesOrNo oldTunnel = tunnel;
		boolean oldTunnelESet = tunnelESet;
		tunnel = TUNNEL_EDEFAULT;
		tunnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.PARAM_TYPE__TUNNEL, oldTunnel, TUNNEL_EDEFAULT, oldTunnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTunnel() {
		return tunnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.PARAM_TYPE__NAME:
				return getName();
			case XSLT20Package.PARAM_TYPE__SELECT:
				return getSelect();
			case XSLT20Package.PARAM_TYPE__AS:
				return getAs();
			case XSLT20Package.PARAM_TYPE__REQUIRED:
				return getRequired();
			case XSLT20Package.PARAM_TYPE__TUNNEL:
				return getTunnel();
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
			case XSLT20Package.PARAM_TYPE__NAME:
				setName((String)newValue);
				return;
			case XSLT20Package.PARAM_TYPE__SELECT:
				setSelect((String)newValue);
				return;
			case XSLT20Package.PARAM_TYPE__AS:
				setAs((String)newValue);
				return;
			case XSLT20Package.PARAM_TYPE__REQUIRED:
				setRequired((YesOrNo)newValue);
				return;
			case XSLT20Package.PARAM_TYPE__TUNNEL:
				setTunnel((YesOrNo)newValue);
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
			case XSLT20Package.PARAM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSLT20Package.PARAM_TYPE__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case XSLT20Package.PARAM_TYPE__AS:
				setAs(AS_EDEFAULT);
				return;
			case XSLT20Package.PARAM_TYPE__REQUIRED:
				unsetRequired();
				return;
			case XSLT20Package.PARAM_TYPE__TUNNEL:
				unsetTunnel();
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
			case XSLT20Package.PARAM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSLT20Package.PARAM_TYPE__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case XSLT20Package.PARAM_TYPE__AS:
				return AS_EDEFAULT == null ? as != null : !AS_EDEFAULT.equals(as);
			case XSLT20Package.PARAM_TYPE__REQUIRED:
				return isSetRequired();
			case XSLT20Package.PARAM_TYPE__TUNNEL:
				return isSetTunnel();
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
		result.append(", select: ");
		result.append(select);
		result.append(", as: ");
		result.append(as);
		result.append(", required: ");
		if (requiredESet) result.append(required); else result.append("<unset>");
		result.append(", tunnel: ");
		if (tunnelESet) result.append(tunnel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParamTypeImpl
