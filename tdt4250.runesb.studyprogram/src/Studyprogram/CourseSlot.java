/**
 */
package Studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.CourseSlot#getCourseSlotType <em>Course Slot Type</em>}</li>
 *   <li>{@link Studyprogram.CourseSlot#getCompulsoryCourse <em>Compulsory Course</em>}</li>
 *   <li>{@link Studyprogram.CourseSlot#getElectiveCourses <em>Elective Courses</em>}</li>
 * </ul>
 *
 * @see Studyprogram.StudyprogramPackage#getCourseSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseListIsEmptyIfSlotIsCopulsory compulsoryCourseIsEmptyIfSlotIsElective'"
 * @generated
 */
public interface CourseSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Slot Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Studyprogram.CourseSlotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Slot Type</em>' attribute.
	 * @see Studyprogram.CourseSlotType
	 * @see #setCourseSlotType(CourseSlotType)
	 * @see Studyprogram.StudyprogramPackage#getCourseSlot_CourseSlotType()
	 * @model required="true"
	 * @generated
	 */
	CourseSlotType getCourseSlotType();

	/**
	 * Sets the value of the '{@link Studyprogram.CourseSlot#getCourseSlotType <em>Course Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Slot Type</em>' attribute.
	 * @see Studyprogram.CourseSlotType
	 * @see #getCourseSlotType()
	 * @generated
	 */
	void setCourseSlotType(CourseSlotType value);

	/**
	 * Returns the value of the '<em><b>Compulsory Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compulsory Course</em>' reference.
	 * @see #setCompulsoryCourse(Course)
	 * @see Studyprogram.StudyprogramPackage#getCourseSlot_CompulsoryCourse()
	 * @model
	 * @generated
	 */
	Course getCompulsoryCourse();

	/**
	 * Sets the value of the '{@link Studyprogram.CourseSlot#getCompulsoryCourse <em>Compulsory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compulsory Course</em>' reference.
	 * @see #getCompulsoryCourse()
	 * @generated
	 */
	void setCompulsoryCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' reference list.
	 * The list contents are of type {@link Studyprogram.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' reference list.
	 * @see Studyprogram.StudyprogramPackage#getCourseSlot_ElectiveCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getElectiveCourses();

} // CourseSlot
