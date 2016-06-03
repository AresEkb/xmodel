/**
 */
package org.w3._1999.xsl.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._1999.xsl.transform.OutputCharacterType;
import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Character Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputCharacterTypeImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link org.w3._1999.xsl.transform.impl.OutputCharacterTypeImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputCharacterTypeImpl extends ElementOnlyVersionedElementTypeImpl implements OutputCharacterType {
	/**
	 * The default value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected String character = CHARACTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputCharacterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSLT20Package.Literals.OUTPUT_CHARACTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacter() {
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacter(String newCharacter) {
		String oldCharacter = character;
		character = newCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_CHARACTER_TYPE__CHARACTER, oldCharacter, character));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSLT20Package.OUTPUT_CHARACTER_TYPE__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__CHARACTER:
				return getCharacter();
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__STRING:
				return getString();
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
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__CHARACTER:
				setCharacter((String)newValue);
				return;
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__STRING:
				setString((String)newValue);
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
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__CHARACTER:
				setCharacter(CHARACTER_EDEFAULT);
				return;
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__STRING:
				setString(STRING_EDEFAULT);
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
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__CHARACTER:
				return CHARACTER_EDEFAULT == null ? character != null : !CHARACTER_EDEFAULT.equals(character);
			case XSLT20Package.OUTPUT_CHARACTER_TYPE__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
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
		result.append(" (character: ");
		result.append(character);
		result.append(", string: ");
		result.append(string);
		result.append(')');
		return result.toString();
	}

} //OutputCharacterTypeImpl
