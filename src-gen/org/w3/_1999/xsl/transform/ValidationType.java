/**
 */
package org.w3._1999.xsl.transform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Validation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       Describes different ways of type-annotating an element or attribute.
 *     
 * <!-- end-model-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Package#getValidationType()
 * @model extendedMetaData="name='validation-type'"
 * @generated
 */
public enum ValidationType implements Enumerator {
    /**
     * The '<em><b>Strict</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRICT_VALUE
     * @generated
     * @ordered
     */
    STRICT(0, "strict", "strict"),

    /**
     * The '<em><b>Lax</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LAX_VALUE
     * @generated
     * @ordered
     */
    LAX(1, "lax", "lax"),

    /**
     * The '<em><b>Preserve</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRESERVE_VALUE
     * @generated
     * @ordered
     */
    PRESERVE(2, "preserve", "preserve"),

    /**
     * The '<em><b>Strip</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRIP_VALUE
     * @generated
     * @ordered
     */
    STRIP(3, "strip", "strip");

    /**
     * The '<em><b>Strict</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Strict</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRICT
     * @model name="strict"
     * @generated
     * @ordered
     */
    public static final int STRICT_VALUE = 0;

    /**
     * The '<em><b>Lax</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lax</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LAX
     * @model name="lax"
     * @generated
     * @ordered
     */
    public static final int LAX_VALUE = 1;

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
    public static final int PRESERVE_VALUE = 2;

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
    public static final int STRIP_VALUE = 3;

    /**
     * An array of all the '<em><b>Validation Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ValidationType[] VALUES_ARRAY =
        new ValidationType[] {
            STRICT,
            LAX,
            PRESERVE,
            STRIP,
        };

    /**
     * A public read-only list of all the '<em><b>Validation Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ValidationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Validation Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ValidationType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ValidationType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Validation Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ValidationType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ValidationType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Validation Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ValidationType get(int value) {
        switch (value) {
            case STRICT_VALUE: return STRICT;
            case LAX_VALUE: return LAX;
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
    private ValidationType(int value, String name, String literal) {
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
    
} //ValidationType
