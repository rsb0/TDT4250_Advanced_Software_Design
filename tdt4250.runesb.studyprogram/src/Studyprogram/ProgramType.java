/**
 */
package Studyprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Program Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Studyprogram.StudyprogramPackage#getProgramType()
 * @model
 * @generated
 */
public enum ProgramType implements Enumerator {
	/**
	 * The '<em><b>Bachelors</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELORS_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELORS(0, "bachelors", "bachelors"),

	/**
	 * The '<em><b>Masters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTERS_VALUE
	 * @generated
	 * @ordered
	 */
	MASTERS(1, "masters", "masters"),

	/**
	 * The '<em><b>Integrated Masters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTERS_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATED_MASTERS(2, "integratedMasters", "integratedMasters");

	/**
	 * The '<em><b>Bachelors</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELORS
	 * @model name="bachelors"
	 * @generated
	 * @ordered
	 */
	public static final int BACHELORS_VALUE = 0;

	/**
	 * The '<em><b>Masters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTERS
	 * @model name="masters"
	 * @generated
	 * @ordered
	 */
	public static final int MASTERS_VALUE = 1;

	/**
	 * The '<em><b>Integrated Masters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTERS
	 * @model name="integratedMasters"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATED_MASTERS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Program Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgramType[] VALUES_ARRAY =
		new ProgramType[] {
			BACHELORS,
			MASTERS,
			INTEGRATED_MASTERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Program Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgramType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Program Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgramType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Program Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgramType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Program Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramType get(int value) {
		switch (value) {
			case BACHELORS_VALUE: return BACHELORS;
			case MASTERS_VALUE: return MASTERS;
			case INTEGRATED_MASTERS_VALUE: return INTEGRATED_MASTERS;
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
	private ProgramType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ProgramType
