/**
 */
package Studyprogram.impl;

import Studyprogram.CourseSlot;
import Studyprogram.Semester;
import Studyprogram.SemesterType;
import Studyprogram.StudyprogramPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.impl.SemesterImpl#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link Studyprogram.impl.SemesterImpl#getCourseSlots <em>Course Slots</em>}</li>
 *   <li>{@link Studyprogram.impl.SemesterImpl#getSemesterType <em>Semester Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected int semesterNumber = SEMESTER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseSlots() <em>Course Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseSlot> courseSlots;

	/**
	 * The default value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterType SEMESTER_TYPE_EDEFAULT = SemesterType.SPRING;

	/**
	 * The cached value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected SemesterType semesterType = SEMESTER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNumber(int newSemesterNumber) {
		int oldSemesterNumber = semesterNumber;
		semesterNumber = newSemesterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER__SEMESTER_NUMBER, oldSemesterNumber, semesterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseSlot> getCourseSlots() {
		if (courseSlots == null) {
			courseSlots = new EObjectContainmentEList<CourseSlot>(CourseSlot.class, this, StudyprogramPackage.SEMESTER__COURSE_SLOTS);
		}
		return courseSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterType getSemesterType() {
		return semesterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterType(SemesterType newSemesterType) {
		SemesterType oldSemesterType = semesterType;
		semesterType = newSemesterType == null ? SEMESTER_TYPE_EDEFAULT : newSemesterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER__SEMESTER_TYPE, oldSemesterType, semesterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER__COURSE_SLOTS:
				return ((InternalEList<?>)getCourseSlots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER__SEMESTER_NUMBER:
				return getSemesterNumber();
			case StudyprogramPackage.SEMESTER__COURSE_SLOTS:
				return getCourseSlots();
			case StudyprogramPackage.SEMESTER__SEMESTER_TYPE:
				return getSemesterType();
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
			case StudyprogramPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber((Integer)newValue);
				return;
			case StudyprogramPackage.SEMESTER__COURSE_SLOTS:
				getCourseSlots().clear();
				getCourseSlots().addAll((Collection<? extends CourseSlot>)newValue);
				return;
			case StudyprogramPackage.SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType)newValue);
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
			case StudyprogramPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber(SEMESTER_NUMBER_EDEFAULT);
				return;
			case StudyprogramPackage.SEMESTER__COURSE_SLOTS:
				getCourseSlots().clear();
				return;
			case StudyprogramPackage.SEMESTER__SEMESTER_TYPE:
				setSemesterType(SEMESTER_TYPE_EDEFAULT);
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
			case StudyprogramPackage.SEMESTER__SEMESTER_NUMBER:
				return semesterNumber != SEMESTER_NUMBER_EDEFAULT;
			case StudyprogramPackage.SEMESTER__COURSE_SLOTS:
				return courseSlots != null && !courseSlots.isEmpty();
			case StudyprogramPackage.SEMESTER__SEMESTER_TYPE:
				return semesterType != SEMESTER_TYPE_EDEFAULT;
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
		result.append(" (semesterNumber: ");
		result.append(semesterNumber);
		result.append(", semesterType: ");
		result.append(semesterType);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
