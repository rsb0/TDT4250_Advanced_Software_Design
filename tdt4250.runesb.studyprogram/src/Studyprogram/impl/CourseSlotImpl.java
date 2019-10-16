/**
 */
package Studyprogram.impl;

import Studyprogram.Course;
import Studyprogram.CourseSlot;
import Studyprogram.CourseSlotType;
import Studyprogram.StudyprogramPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.impl.CourseSlotImpl#getCourseSlotType <em>Course Slot Type</em>}</li>
 *   <li>{@link Studyprogram.impl.CourseSlotImpl#getCompulsoryCourse <em>Compulsory Course</em>}</li>
 *   <li>{@link Studyprogram.impl.CourseSlotImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseSlotImpl extends MinimalEObjectImpl.Container implements CourseSlot {
	/**
	 * The default value of the '{@link #getCourseSlotType() <em>Course Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlotType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseSlotType COURSE_SLOT_TYPE_EDEFAULT = CourseSlotType.COMPULSORY;

	/**
	 * The cached value of the '{@link #getCourseSlotType() <em>Course Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlotType()
	 * @generated
	 * @ordered
	 */
	protected CourseSlotType courseSlotType = COURSE_SLOT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompulsoryCourse() <em>Compulsory Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompulsoryCourse()
	 * @generated
	 * @ordered
	 */
	protected Course compulsoryCourse;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electiveCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.COURSE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSlotType getCourseSlotType() {
		return courseSlotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseSlotType(CourseSlotType newCourseSlotType) {
		CourseSlotType oldCourseSlotType = courseSlotType;
		courseSlotType = newCourseSlotType == null ? COURSE_SLOT_TYPE_EDEFAULT : newCourseSlotType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.COURSE_SLOT__COURSE_SLOT_TYPE, oldCourseSlotType, courseSlotType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCompulsoryCourse() {
		if (compulsoryCourse != null && compulsoryCourse.eIsProxy()) {
			InternalEObject oldCompulsoryCourse = (InternalEObject)compulsoryCourse;
			compulsoryCourse = (Course)eResolveProxy(oldCompulsoryCourse);
			if (compulsoryCourse != oldCompulsoryCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyprogramPackage.COURSE_SLOT__COMPULSORY_COURSE, oldCompulsoryCourse, compulsoryCourse));
			}
		}
		return compulsoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCompulsoryCourse() {
		return compulsoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompulsoryCourse(Course newCompulsoryCourse) {
		Course oldCompulsoryCourse = compulsoryCourse;
		compulsoryCourse = newCompulsoryCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.COURSE_SLOT__COMPULSORY_COURSE, oldCompulsoryCourse, compulsoryCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyprogramPackage.COURSE_SLOT__ELECTIVE_COURSES);
		}
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramPackage.COURSE_SLOT__COURSE_SLOT_TYPE:
				return getCourseSlotType();
			case StudyprogramPackage.COURSE_SLOT__COMPULSORY_COURSE:
				if (resolve) return getCompulsoryCourse();
				return basicGetCompulsoryCourse();
			case StudyprogramPackage.COURSE_SLOT__ELECTIVE_COURSES:
				return getElectiveCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramPackage.COURSE_SLOT__COURSE_SLOT_TYPE:
				setCourseSlotType((CourseSlotType)newValue);
				return;
			case StudyprogramPackage.COURSE_SLOT__COMPULSORY_COURSE:
				setCompulsoryCourse((Course)newValue);
				return;
			case StudyprogramPackage.COURSE_SLOT__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.COURSE_SLOT__COURSE_SLOT_TYPE:
				setCourseSlotType(COURSE_SLOT_TYPE_EDEFAULT);
				return;
			case StudyprogramPackage.COURSE_SLOT__COMPULSORY_COURSE:
				setCompulsoryCourse((Course)null);
				return;
			case StudyprogramPackage.COURSE_SLOT__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.COURSE_SLOT__COURSE_SLOT_TYPE:
				return courseSlotType != COURSE_SLOT_TYPE_EDEFAULT;
			case StudyprogramPackage.COURSE_SLOT__COMPULSORY_COURSE:
				return compulsoryCourse != null;
			case StudyprogramPackage.COURSE_SLOT__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (courseSlotType: ");
		result.append(courseSlotType);
		result.append(')');
		return result.toString();
	}

} //CourseSlotImpl
