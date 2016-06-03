/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.SortType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._1999.xsl.transform.YesOrNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getCaseOrder <em>Case Order</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.SortTypeImpl#getStable <em>Stable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortTypeImpl extends SequenceConstructorImpl implements SortType {
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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = "text";

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * This is true if the Data Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeESet;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_EDEFAULT = "ascending";

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected String order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

	/**
	 * The default value of the '{@link #getCaseOrder() <em>Case Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseOrder() <em>Case Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOrder()
	 * @generated
	 * @ordered
	 */
	protected String caseOrder = CASE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected String collation = COLLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStable() <em>Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStable()
	 * @generated
	 * @ordered
	 */
	protected static final YesOrNo STABLE_EDEFAULT = YesOrNo.YES;

	/**
	 * The cached value of the '{@link #getStable() <em>Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStable()
	 * @generated
	 * @ordered
	 */
	protected YesOrNo stable = STABLE_EDEFAULT;

	/**
	 * This is true if the Stable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.SORT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__DATA_TYPE, oldDataType, dataType, !oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataType() {
		String oldDataType = dataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataType = DATA_TYPE_EDEFAULT;
		dataTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.SORT_TYPE__DATA_TYPE, oldDataType, DATA_TYPE_EDEFAULT, oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataType() {
		return dataTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(String newOrder) {
		String oldOrder = order;
		order = newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		String oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.SORT_TYPE__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return orderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaseOrder() {
		return caseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOrder(String newCaseOrder) {
		String oldCaseOrder = caseOrder;
		caseOrder = newCaseOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__CASE_ORDER, oldCaseOrder, caseOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollation() {
		return collation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollation(String newCollation) {
		String oldCollation = collation;
		collation = newCollation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo getStable() {
		return stable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStable(YesOrNo newStable) {
		YesOrNo oldStable = stable;
		stable = newStable == null ? STABLE_EDEFAULT : newStable;
		boolean oldStableESet = stableESet;
		stableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.SORT_TYPE__STABLE, oldStable, stable, !oldStableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStable() {
		YesOrNo oldStable = stable;
		boolean oldStableESet = stableESet;
		stable = STABLE_EDEFAULT;
		stableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.SORT_TYPE__STABLE, oldStable, STABLE_EDEFAULT, oldStableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStable() {
		return stableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.SORT_TYPE__SELECT:
				return getSelect();
			case XSLT20Package.SORT_TYPE__LANG:
				return getLang();
			case XSLT20Package.SORT_TYPE__DATA_TYPE:
				return getDataType();
			case XSLT20Package.SORT_TYPE__ORDER:
				return getOrder();
			case XSLT20Package.SORT_TYPE__CASE_ORDER:
				return getCaseOrder();
			case XSLT20Package.SORT_TYPE__COLLATION:
				return getCollation();
			case XSLT20Package.SORT_TYPE__STABLE:
				return getStable();
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
			case XSLT20Package.SORT_TYPE__SELECT:
				setSelect((String)newValue);
				return;
			case XSLT20Package.SORT_TYPE__LANG:
				setLang((String)newValue);
				return;
			case XSLT20Package.SORT_TYPE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case XSLT20Package.SORT_TYPE__ORDER:
				setOrder((String)newValue);
				return;
			case XSLT20Package.SORT_TYPE__CASE_ORDER:
				setCaseOrder((String)newValue);
				return;
			case XSLT20Package.SORT_TYPE__COLLATION:
				setCollation((String)newValue);
				return;
			case XSLT20Package.SORT_TYPE__STABLE:
				setStable((YesOrNo)newValue);
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
			case XSLT20Package.SORT_TYPE__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case XSLT20Package.SORT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XSLT20Package.SORT_TYPE__DATA_TYPE:
				unsetDataType();
				return;
			case XSLT20Package.SORT_TYPE__ORDER:
				unsetOrder();
				return;
			case XSLT20Package.SORT_TYPE__CASE_ORDER:
				setCaseOrder(CASE_ORDER_EDEFAULT);
				return;
			case XSLT20Package.SORT_TYPE__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case XSLT20Package.SORT_TYPE__STABLE:
				unsetStable();
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
			case XSLT20Package.SORT_TYPE__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case XSLT20Package.SORT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case XSLT20Package.SORT_TYPE__DATA_TYPE:
				return isSetDataType();
			case XSLT20Package.SORT_TYPE__ORDER:
				return isSetOrder();
			case XSLT20Package.SORT_TYPE__CASE_ORDER:
				return CASE_ORDER_EDEFAULT == null ? caseOrder != null : !CASE_ORDER_EDEFAULT.equals(caseOrder);
			case XSLT20Package.SORT_TYPE__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case XSLT20Package.SORT_TYPE__STABLE:
				return isSetStable();
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
		result.append(", lang: ");
		result.append(lang);
		result.append(", dataType: ");
		if (dataTypeESet) result.append(dataType); else result.append("<unset>");
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(", caseOrder: ");
		result.append(caseOrder);
		result.append(", collation: ");
		result.append(collation);
		result.append(", stable: ");
		if (stableESet) result.append(stable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SortTypeImpl
