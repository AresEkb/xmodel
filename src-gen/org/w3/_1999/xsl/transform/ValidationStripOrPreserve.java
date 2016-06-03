/**
 */
package org.w3._1999.xsl.transform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Validation Strip Or Preserve</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       Describes different ways of type-annotating an element or attribute.
 *     
 * <!-- end-model-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Package#getValidationStripOrPreserve()
 * @model extendedMetaData="name='validation-strip-or-preserve'"
 * @generated
 */
public enum ValidationStripOrPreserve implements Enumerator {
	/**
	 * The '<em><b>Preserve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE(0, "preserve", "preserve"),

	/**
	 * The '<em><b>Strip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRIP_VALUE
	 * @generated
	 * @ordered
	 */
	STRIP(1, "strip", "strip");

	/**
	 * The '<em><b>Preserve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preserve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVE
	 * @model name="preserve"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_VALUE = 0;

	/**
	 * The '<em><b>Strip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRIP
	 * @model name="strip"
	 * @generated
	 * @ordered
	 */
	public static final int STRIP_VALUE = 1;

	/**
	 * An array of all the '<em><b>Validation Strip Or Preserve</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValidationStripOrPreserve[] VALUES_ARRAY =
		new ValidationStripOrPreserve[] {
			PRESERVE,
			STRIP,
		};

	/**
	 * A public read-only list of all the '<em><b>Validation Strip Or Preserve</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValidationStripOrPreserve> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Validation Strip Or Preserve</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidationStripOrPreserve get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidationStripOrPreserve result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Validation Strip Or Preserve</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidationStripOrPreserve getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidationStripOrPreserve result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Validation Strip Or Preserve</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidationStripOrPreserve get(int value) {
		switch (value) {
			case PRESERVE_VALUE: return PRESERVE;
			case STRIP_VALUE: return STRIP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ValidationStripOrPreserve(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ValidationStripOrPreserve
