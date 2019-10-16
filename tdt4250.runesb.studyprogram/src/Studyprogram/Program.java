/**
 */
package Studyprogram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.Program#getName <em>Name</em>}</li>
 *   <li>{@link Studyprogram.Program#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link Studyprogram.Program#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link Studyprogram.Program#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link Studyprogram.Program#getProgramType <em>Program Type</em>}</li>
 * </ul>
 *
 * @see Studyprogram.StudyprogramPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends SemesterContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Studyprogram.StudyprogramPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Studyprogram.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' attribute.
	 * The literals are from the enumeration {@link Studyprogram.ProgramCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Code</em>' attribute.
	 * @see Studyprogram.ProgramCode
	 * @see #setProgramCode(ProgramCode)
	 * @see Studyprogram.StudyprogramPackage#getProgram_ProgramCode()
	 * @model
	 * @generated
	 */
	ProgramCode getProgramCode();

	/**
	 * Sets the value of the '{@link Studyprogram.Program#getProgramCode <em>Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Code</em>' attribute.
	 * @see Studyprogram.ProgramCode
	 * @see #getProgramCode()
	 * @generated
	 */
	void setProgramCode(ProgramCode value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' containment reference list.
	 * The list contents are of type {@link Studyprogram.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' containment reference list.
	 * @see Studyprogram.StudyprogramPackage#getProgram_Specialisation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisation();

	/**
	 * Returns the value of the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Years</em>' attribute.
	 * @see #setNumberOfYears(int)
	 * @see Studyprogram.StudyprogramPackage#getProgram_NumberOfYears()
	 * @model
	 * @generated
	 */
	int getNumberOfYears();

	/**
	 * Sets the value of the '{@link Studyprogram.Program#getNumberOfYears <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Years</em>' attribute.
	 * @see #getNumberOfYears()
	 * @generated
	 */
	void setNumberOfYears(int value);

	/**
	 * Returns the value of the '<em><b>Program Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Studyprogram.ProgramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Type</em>' attribute.
	 * @see Studyprogram.ProgramType
	 * @see #setProgramType(ProgramType)
	 * @see Studyprogram.StudyprogramPackage#getProgram_ProgramType()
	 * @model required="true"
	 * @generated
	 */
	ProgramType getProgramType();

	/**
	 * Sets the value of the '{@link Studyprogram.Program#getProgramType <em>Program Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Type</em>' attribute.
	 * @see Studyprogram.ProgramType
	 * @see #getProgramType()
	 * @generated
	 */
	void setProgramType(ProgramType value);

} // Program
