/**
 */
package org.w3._1999.xsl.transform.impl;

import java.math.BigDecimal;

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

import org.w3._1999.xsl.transform.ParamType;
import org.w3._1999.xsl.transform.TemplateType;
import org.w3._1999.xsl.transform.VariableType;
import org.w3._1999.xsl.transform.VersionedElementType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getSequenceConstructorGroup <em>Sequence Constructor Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getInstructionGroup <em>Instruction Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getLiteralResultElementGroup <em>Literal Result Element Group</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getLiteralResultElement <em>Literal Result Element</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.TemplateTypeImpl#getAs <em>As</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateTypeImpl extends VersionedElementTypeImpl implements TemplateType {
	/**
	 * The default value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected String match = MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal priority = PRIORITY_EDEFAULT;

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
	protected TemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.TEMPLATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getParam() {
		return getMixed().list(XSLT20Package.Literals.TEMPLATE_TYPE__PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSequenceConstructorGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XSLT20Package.Literals.TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableType> getVariable() {
		return getSequenceConstructorGroup().list(XSLT20Package.Literals.TEMPLATE_TYPE__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInstructionGroup() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.TEMPLATE_TYPE__INSTRUCTION_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedElementType> getInstruction() {
		return getInstructionGroup().list(XSLT20Package.Literals.TEMPLATE_TYPE__INSTRUCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLiteralResultElementGroup() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLiteralResultElement() {
		return getLiteralResultElementGroup().list(XSLT20Package.Literals.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.TEMPLATE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getSequenceConstructorGroup().<FeatureMap.Entry>list(XSLT20Package.Literals.TEMPLATE_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(String newMatch) {
		String oldMatch = match;
		match = newMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TEMPLATE_TYPE__MATCH, oldMatch, match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(BigDecimal newPriority) {
		BigDecimal oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TEMPLATE_TYPE__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TEMPLATE_TYPE__MODE, oldMode, mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TEMPLATE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.TEMPLATE_TYPE__AS, oldAs, as, !oldAsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XSLT20Package.TEMPLATE_TYPE__AS, oldAs, AS_EDEFAULT, oldAsESet));
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
			case XSLT20Package.TEMPLATE_TYPE__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				return ((InternalEList<?>)getSequenceConstructorGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION_GROUP:
				return ((InternalEList<?>)getInstructionGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION:
				return ((InternalEList<?>)getInstruction()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				return ((InternalEList<?>)getLiteralResultElementGroup()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT:
				return ((InternalEList<?>)getLiteralResultElement()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XSLT20Package.TEMPLATE_TYPE__ANY1:
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
			case XSLT20Package.TEMPLATE_TYPE__PARAM:
				return getParam();
			case XSLT20Package.TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				if (coreType) return getSequenceConstructorGroup();
				return ((FeatureMap.Internal)getSequenceConstructorGroup()).getWrapper();
			case XSLT20Package.TEMPLATE_TYPE__VARIABLE:
				return getVariable();
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION_GROUP:
				if (coreType) return getInstructionGroup();
				return ((FeatureMap.Internal)getInstructionGroup()).getWrapper();
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION:
				return getInstruction();
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				if (coreType) return getLiteralResultElementGroup();
				return ((FeatureMap.Internal)getLiteralResultElementGroup()).getWrapper();
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT:
				return getLiteralResultElement();
			case XSLT20Package.TEMPLATE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XSLT20Package.TEMPLATE_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case XSLT20Package.TEMPLATE_TYPE__MATCH:
				return getMatch();
			case XSLT20Package.TEMPLATE_TYPE__PRIORITY:
				return getPriority();
			case XSLT20Package.TEMPLATE_TYPE__MODE:
				return getMode();
			case XSLT20Package.TEMPLATE_TYPE__NAME:
				return getName();
			case XSLT20Package.TEMPLATE_TYPE__AS:
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
			case XSLT20Package.TEMPLATE_TYPE__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends ParamType>)newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				((FeatureMap.Internal)getSequenceConstructorGroup()).set(newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends VariableType>)newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION_GROUP:
				((FeatureMap.Internal)getInstructionGroup()).set(newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				((FeatureMap.Internal)getLiteralResultElementGroup()).set(newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__MATCH:
				setMatch((String)newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__PRIORITY:
				setPriority((BigDecimal)newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__MODE:
				setMode(newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__NAME:
				setName((String)newValue);
				return;
			case XSLT20Package.TEMPLATE_TYPE__AS:
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
			case XSLT20Package.TEMPLATE_TYPE__PARAM:
				getParam().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				getSequenceConstructorGroup().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__VARIABLE:
				getVariable().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION_GROUP:
				getInstructionGroup().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				getLiteralResultElementGroup().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__ANY:
				getAny().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__ANY1:
				getAny1().clear();
				return;
			case XSLT20Package.TEMPLATE_TYPE__MATCH:
				setMatch(MATCH_EDEFAULT);
				return;
			case XSLT20Package.TEMPLATE_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case XSLT20Package.TEMPLATE_TYPE__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case XSLT20Package.TEMPLATE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSLT20Package.TEMPLATE_TYPE__AS:
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
			case XSLT20Package.TEMPLATE_TYPE__PARAM:
				return !getParam().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__SEQUENCE_CONSTRUCTOR_GROUP:
				return !getSequenceConstructorGroup().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__VARIABLE:
				return !getVariable().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION_GROUP:
				return !getInstructionGroup().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__INSTRUCTION:
				return !getInstruction().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT_GROUP:
				return !getLiteralResultElementGroup().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__LITERAL_RESULT_ELEMENT:
				return !getLiteralResultElement().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__ANY:
				return !getAny().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__ANY1:
				return !getAny1().isEmpty();
			case XSLT20Package.TEMPLATE_TYPE__MATCH:
				return MATCH_EDEFAULT == null ? match != null : !MATCH_EDEFAULT.equals(match);
			case XSLT20Package.TEMPLATE_TYPE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case XSLT20Package.TEMPLATE_TYPE__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case XSLT20Package.TEMPLATE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSLT20Package.TEMPLATE_TYPE__AS:
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
		result.append(" (match: ");
		result.append(match);
		result.append(", priority: ");
		result.append(priority);
		result.append(", mode: ");
		result.append(mode);
		result.append(", name: ");
		result.append(name);
		result.append(", as: ");
		if (asESet) result.append(as); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TemplateTypeImpl
