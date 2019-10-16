/**
 */
package Studyprogram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link Studyprogram.Specialisation#getSubSpecialisation <em>Sub Specialisation</em>}</li>
 * </ul>
 *
 * @see Studyprogram.StudyprogramPackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends SemesterContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Studyprogram.StudyprogramPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Studyprogram.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Specialisation</b></em>' containment reference list.
	 * The list contents are of type {@link Studyprogram.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specialisation</em>' containment reference list.
	 * @see Studyprogram.StudyprogramPackage#getSpecialisation_SubSpecialisation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSubSpecialisation();

} // Specialisation
