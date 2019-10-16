/**
 */
package Studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.SemesterContainer#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see Studyprogram.StudyprogramPackage#getSemesterContainer()
 * @model
 * @generated
 */
public interface SemesterContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link Studyprogram.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see Studyprogram.StudyprogramPackage#getSemesterContainer_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // SemesterContainer
