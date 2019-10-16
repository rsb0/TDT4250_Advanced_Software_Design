/**
 */
package Studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link Studyprogram.Semester#getCourseSlots <em>Course Slots</em>}</li>
 *   <li>{@link Studyprogram.Semester#getSemesterType <em>Semester Type</em>}</li>
 * </ul>
 *
 * @see Studyprogram.StudyprogramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterMustHaveThirtyCredits allCoursesInElectiveCourseListMustHaveSameAmountOfCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see Studyprogram.StudyprogramPackage#getSemester_SemesterNumber()
	 * @model required="true" transient="true"
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link Studyprogram.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Slots</b></em>' containment reference list.
	 * The list contents are of type {@link Studyprogram.CourseSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Slots</em>' containment reference list.
	 * @see Studyprogram.StudyprogramPackage#getSemester_CourseSlots()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseSlot> getCourseSlots();

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Studyprogram.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see Studyprogram.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see Studyprogram.StudyprogramPackage#getSemester_SemesterType()
	 * @model required="true"
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link Studyprogram.Semester#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see Studyprogram.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

} // Semester
