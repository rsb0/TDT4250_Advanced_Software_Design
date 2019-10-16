/**
 */
package Studyprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Program Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Studyprogram.StudyprogramPackage#getProgramCode()
 * @model
 * @generated
 */
public enum ProgramCode implements Enumerator {
	/**
	 * The '<em><b>MTDT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTDT_VALUE
	 * @generated
	 * @ordered
	 */
	MTDT(0, "MTDT", "MTDT"),

	/**
	 * The '<em><b>MIDT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDT(1, "MIDT", "MIDT"),

	/**
	 * The '<em><b>BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT(2, "BIT", "BIT"),

	/**
	 * The '<em><b>MIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIT_VALUE
	 * @generated
	 * @ordered
	 */
	MIT(3, "MIT", "MIT"),

	/**
	 * The '<em><b>MTIOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTIOT_VALUE
	 * @generated
	 * @ordered
	 */
	MTIOT(4, "MTIOT", "MTIOT"),

	/**
	 * The '<em><b>MTPROD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTPROD_VALUE
	 * @generated
	 * @ordered
	 */
	MTPROD(5, "MTPROD", "MTPROD");

	/**
	 * The '<em><b>MTDT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTDT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTDT_VALUE = 0;

	/**
	 * The '<em><b>MIDT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDT_VALUE = 1;

	/**
	 * The '<em><b>BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VALUE = 2;

	/**
	 * The '<em><b>MIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIT_VALUE = 3;

	/**
	 * The '<em><b>MTIOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTIOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTIOT_VALUE = 4;

	/**
	 * The '<em><b>MTPROD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTPROD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTPROD_VALUE = 5;

	/**
	 * An array of all the '<em><b>Program Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgramCode[] VALUES_ARRAY =
		new ProgramCode[] {
			MTDT,
			MIDT,
			BIT,
			MIT,
			MTIOT,
			MTPROD,
		};

	/**
	 * A public read-only list of all the '<em><b>Program Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgramCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Program Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgramCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Program Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgramCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Program Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgramCode get(int value) {
		switch (value) {
			case MTDT_VALUE: return MTDT;
			case MIDT_VALUE: return MIDT;
			case BIT_VALUE: return BIT;
			case MIT_VALUE: return MIT;
			case MTIOT_VALUE: return MTIOT;
			case MTPROD_VALUE: return MTPROD;
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
	private ProgramCode(int value, String name, String literal) {
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
	
} //ProgramCode
