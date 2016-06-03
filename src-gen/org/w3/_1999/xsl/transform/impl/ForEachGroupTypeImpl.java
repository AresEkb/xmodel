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

import org.w3._1999.xsl.transform.ForEachGroupType;
import org.w3._1999.xsl.transform.SortType;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.VersionedElementType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getGroupAdjacent <em>Group Adjacent</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getGroupStartingWith <em>Group Starting With</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getGroupEndingWith <em>Group Ending With</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.ForEachGroupTypeImpl#getCollation <em>Collation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachGroupTypeImpl extends VersionedElementTypeImpl implements ForEachGroupType {
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
	 * The default value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected String groupBy = GROUP_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupAdjacent() <em>Group Adjacent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAdjacent()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ADJACENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupAdjacent() <em>Group Adjacent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAdjacent()
	 * @generated
	 * @ordered
	 */
	protected String groupAdjacent = GROUP_ADJACENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupStartingWith() <em>Group Starting With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupStartingWith()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_STARTING_WITH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupStartingWith() <em>Group Starting With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupStartingWith()
	 * @generated
	 * @ordered
	 */
	protected String groupStartingWith = GROUP_STARTING_WITH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupEndingWith() <em>Group Ending With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupEndingWith()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ENDING_WITH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupEndingWith() <em>Group Ending With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupEndingWith()
	 * @generated
	 * @ordered
	 */
	protected String groupEndingWith = GROUP_ENDING_WITH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForEachGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.FOR_EACH_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortType> getSort() {
		return getMixed().list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__SORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSequenceConstructorGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableType> getVariable() {
		return getSequenceConstructorGroup().list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInstructionGroup() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedElementType> getInstruction() {
		return getInstructionGroup().list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__INSTRUCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLiteralResultElementGroup() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLiteralResultElement() {
		return getLiteralResultElementGroup().list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.FOR_EACH_GROUP_TYPE__ANY1);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FOR_EACH_GROUP_TYPE__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupBy() {
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupBy(String newGroupBy) {
		String oldGroupBy = groupBy;
		groupBy = newGroupBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_BY, oldGroupBy, groupBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupAdjacent() {
		return groupAdjacent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupAdjacent(String newGroupAdjacent) {
		String oldGroupAdjacent = groupAdjacent;
		groupAdjacent = newGroupAdjacent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ADJACENT, oldGroupAdjacent, groupAdjacent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupStartingWith() {
		return groupStartingWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupStartingWith(String newGroupStartingWith) {
		String oldGroupStartingWith = groupStartingWith;
		groupStartingWith = newGroupStartingWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH, oldGroupStartingWith, groupStartingWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupEndingWith() {
		return groupEndingWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupEndingWith(String newGroupEndingWith) {
		String oldGroupEndingWith = groupEndingWith;
		groupEndingWith = newGroupEndingWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH, oldGroupEndingWith, groupEndingWith));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.FOR_EACH_GROUP_TYPE__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				return ((InternalEList<?>)getSequenceConstructorGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP:
				return ((InternalEList<?>)getInstructionGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION:
				return ((InternalEList<?>)getInstruction()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				return ((InternalEList<?>)getLiteralResultElementGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT:
				return ((InternalEList<?>)getLiteralResultElement()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY1:
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
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SORT:
				return getSort();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				if (coreType) return getSequenceConstructorGroup();
				return ((FeatureMap.Internal)getSequenceConstructorGroup()).getWrapper();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__VARIABLE:
				return getVariable();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP:
				if (coreType) return getInstructionGroup();
				return ((FeatureMap.Internal)getInstructionGroup()).getWrapper();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION:
				return getInstruction();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				if (coreType) return getLiteralResultElementGroup();
				return ((FeatureMap.Internal)getLiteralResultElementGroup()).getWrapper();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT:
				return getLiteralResultElement();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SELECT:
				return getSelect();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_BY:
				return getGroupBy();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ADJACENT:
				return getGroupAdjacent();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH:
				return getGroupStartingWith();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH:
				return getGroupEndingWith();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__COLLATION:
				return getCollation();
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
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends SortType>)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				((FeatureMap.Internal)getSequenceConstructorGroup()).set(newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends VariableType>)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP:
				((FeatureMap.Internal)getInstructionGroup()).set(newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				((FeatureMap.Internal)getLiteralResultElementGroup()).set(newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SELECT:
				setSelect((String)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_BY:
				setGroupBy((String)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ADJACENT:
				setGroupAdjacent((String)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH:
				setGroupStartingWith((String)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH:
				setGroupEndingWith((String)newValue);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__COLLATION:
				setCollation((String)newValue);
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
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SORT:
				getSort().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				getSequenceConstructorGroup().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__VARIABLE:
				getVariable().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP:
				getInstructionGroup().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				getLiteralResultElementGroup().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY:
				getAny().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY1:
				getAny1().clear();
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_BY:
				setGroupBy(GROUP_BY_EDEFAULT);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ADJACENT:
				setGroupAdjacent(GROUP_ADJACENT_EDEFAULT);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH:
				setGroupStartingWith(GROUP_STARTING_WITH_EDEFAULT);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH:
				setGroupEndingWith(GROUP_ENDING_WITH_EDEFAULT);
				return;
			case XSLT20Package.FOR_EACH_GROUP_TYPE__COLLATION:
				setCollation(COLLATION_EDEFAULT);
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
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SORT:
				return !getSort().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				return !getSequenceConstructorGroup().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__VARIABLE:
				return !getVariable().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION_GROUP:
				return !getInstructionGroup().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__INSTRUCTION:
				return !getInstruction().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				return !getLiteralResultElementGroup().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__LITERAL_RESULT_ELEMENT:
				return !getLiteralResultElement().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY:
				return !getAny().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__ANY1:
				return !getAny1().isEmpty();
			case XSLT20Package.FOR_EACH_GROUP_TYPE__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_BY:
				return GROUP_BY_EDEFAULT == null ? groupBy != null : !GROUP_BY_EDEFAULT.equals(groupBy);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ADJACENT:
				return GROUP_ADJACENT_EDEFAULT == null ? groupAdjacent != null : !GROUP_ADJACENT_EDEFAULT.equals(groupAdjacent);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_STARTING_WITH:
				return GROUP_STARTING_WITH_EDEFAULT == null ? groupStartingWith != null : !GROUP_STARTING_WITH_EDEFAULT.equals(groupStartingWith);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__GROUP_ENDING_WITH:
				return GROUP_ENDING_WITH_EDEFAULT == null ? groupEndingWith != null : !GROUP_ENDING_WITH_EDEFAULT.equals(groupEndingWith);
			case XSLT20Package.FOR_EACH_GROUP_TYPE__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
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
		result.append(", groupBy: ");
		result.append(groupBy);
		result.append(", groupAdjacent: ");
		result.append(groupAdjacent);
		result.append(", groupStartingWith: ");
		result.append(groupStartingWith);
		result.append(", groupEndingWith: ");
		result.append(groupEndingWith);
		result.append(", collation: ");
		result.append(collation);
		result.append(')');
		return result.toString();
	}

} //ForEachGroupTypeImpl
