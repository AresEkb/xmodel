/**
 */
package org.w3._1999.xsl.transform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Yes Or No Or Omit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       One of the values "yes" or "no" or "omit".
 *     
 * <!-- end-model-doc -->
 * @see org.w3._1999.xsl.transform.XSLT20Package#getYesOrNoOrOmit()
 * @model extendedMetaData="name='yes-or-no-or-omit'"
 * @generated
 */
public enum YesOrNoOrOmit implements Enumerator {
    /**
     * The '<em><b>Yes</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YES_VALUE
     * @generated
     * @ordered
     */
    YES(0, "yes", "yes"),

    /**
     * The '<em><b>No</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_VALUE
     * @generated
     * @ordered
     */
    NO(1, "no", "no"),

    /**
     * The '<em><b>Omit</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OMIT_VALUE
     * @generated
     * @ordered
     */
    OMIT(2, "omit", "omit");

    /**
     * The '<em><b>Yes</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Yes</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YES
     * @model name="yes"
     * @generated
     * @ordered
     */
    public static final int YES_VALUE = 0;

    /**
     * The '<em><b>No</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO
     * @model name="no"
     * @generated
     * @ordered
     */
    public static final int NO_VALUE = 1;

    /**
     * The '<em><b>Omit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Omit</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OMIT
     * @model name="omit"
     * @generated
     * @ordered
     */
    public static final int OMIT_VALUE = 2;

    /**
     * An array of all the '<em><b>Yes Or No Or Omit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final YesOrNoOrOmit[] VALUES_ARRAY =
        new YesOrNoOrOmit[] {
            YES,
            NO,
            OMIT,
        };

    /**
     * A public read-only list of all the '<em><b>Yes Or No Or Omit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<YesOrNoOrOmit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Yes Or No Or Omit</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static YesOrNoOrOmit get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            YesOrNoOrOmit result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Yes Or No Or Omit</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static YesOrNoOrOmit getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            YesOrNoOrOmit result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Yes Or No Or Omit</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static YesOrNoOrOmit get(int value) {
        switch (value) {
            case YES_VALUE: return YES;
            case NO_VALUE: return NO;
            case OMIT_VALUE: return OMIT;
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
    private YesOrNoOrOmit(int value, String name, String literal) {
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
    
} //YesOrNoOrOmit