/**
 */
package org.w3._2001.xml.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qname List Item Member1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getQnameListItemMember1()
 * @model extendedMetaData="name='qnameList_._item_._member_._1'"
 * @generated
 */
public enum QnameListItemMember1 implements Enumerator {
    /**
     * The '<em><b>Defined</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFINED_VALUE
     * @generated
     * @ordered
     */
    DEFINED(0, "defined", "##defined"),

    /**
     * The '<em><b>Defined Sibling</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFINED_SIBLING_VALUE
     * @generated
     * @ordered
     */
    DEFINED_SIBLING(1, "definedSibling", "##definedSibling");

    /**
     * The '<em><b>Defined</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Defined</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFINED
     * @model name="defined" literal="##defined"
     * @generated
     * @ordered
     */
    public static final int DEFINED_VALUE = 0;

    /**
     * The '<em><b>Defined Sibling</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Defined Sibling</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFINED_SIBLING
     * @model name="definedSibling" literal="##definedSibling"
     * @generated
     * @ordered
     */
    public static final int DEFINED_SIBLING_VALUE = 1;

    /**
     * An array of all the '<em><b>Qname List Item Member1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final QnameListItemMember1[] VALUES_ARRAY =
        new QnameListItemMember1[] {
            DEFINED,
            DEFINED_SIBLING,
        };

    /**
     * A public read-only list of all the '<em><b>Qname List Item Member1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<QnameListItemMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Qname List Item Member1</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static QnameListItemMember1 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            QnameListItemMember1 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Qname List Item Member1</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static QnameListItemMember1 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            QnameListItemMember1 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Qname List Item Member1</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static QnameListItemMember1 get(int value) {
        switch (value) {
            case DEFINED_VALUE: return DEFINED;
            case DEFINED_SIBLING_VALUE: return DEFINED_SIBLING;
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
    private QnameListItemMember1(int value, String name, String literal) {
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
    
} //QnameListItemMember1
