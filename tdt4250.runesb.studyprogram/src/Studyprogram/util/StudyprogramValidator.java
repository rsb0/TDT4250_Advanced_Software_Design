/**
 */
package Studyprogram.util;

import Studyprogram.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Studyprogram.StudyprogramPackage
 * @generated
 */
public class StudyprogramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyprogramValidator INSTANCE = new StudyprogramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Studyprogram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyprogramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyprogramPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyprogramPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyprogramPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyprogramPackage.SEMESTER_CONTAINER:
				return validateSemesterContainer((SemesterContainer)value, diagnostics, context);
			case StudyprogramPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case StudyprogramPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case StudyprogramPackage.COURSE_SLOT:
				return validateCourseSlot((CourseSlot)value, diagnostics, context);
			case StudyprogramPackage.PROGRAM_CODE:
				return validateProgramCode((ProgramCode)value, diagnostics, context);
			case StudyprogramPackage.PROGRAM_TYPE:
				return validateProgramType((ProgramType)value, diagnostics, context);
			case StudyprogramPackage.COURSE_SLOT_TYPE:
				return validateCourseSlotType((CourseSlotType)value, diagnostics, context);
			case StudyprogramPackage.SEMESTER_TYPE:
				return validateSemesterType((SemesterType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(university, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniversity_courseCodesMustBeUnique(university, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseCodesMustBeUnique constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUniversity_courseCodesMustBeUnique(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! courseCodesAreUnique(university)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseCodesMustBeUnique", getObjectLabel(university, context) },
						 new Object[] { university },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean courseCodesAreUnique(University university) {
		for (int i = 0 ; i < university.getCourses().size() - 1 ; i++) {
			for (int j = i + 1 ; j < university.getCourses().size() ; j++) {
				if(university.getCourses().get(i).getCourseCode().equals(university.getCourses().get(j).getCourseCode())){
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_semesterMustHaveThirtyCredits(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_allCoursesInElectiveCourseListMustHaveSameAmountOfCredits(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the semesterMustHaveThirtyCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_semesterMustHaveThirtyCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! semesterHasThirtyCredits(semester)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "semesterMustHaveThirtyCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean semesterHasThirtyCredits(Semester semester) {
		float credits = 0;
		EList<CourseSlot> courseSlots = semester.getCourseSlots();
		for (int i = 0 ; i < courseSlots.size() ; i++) {
			CourseSlot slot = courseSlots.get(i);
			if (slot.getCourseSlotType() == CourseSlotType.COMPULSORY) {
				credits += slot.getCompulsoryCourse().getCredits();
			} else if (slot.getCourseSlotType() == CourseSlotType.ELECTIVE) {
				credits += slot.getElectiveCourses().get(0).getCredits();
			}
		}
		return (credits == 30);
	}

	/**
	 * Validates the allCoursesInElectiveCourseListMustHaveSameAmountOfCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_allCoursesInElectiveCourseListMustHaveSameAmountOfCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! allElectiveCoursesHaveEqualCredit(semester)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "allCoursesInElectiveCourseListMustHaveSameAmountOfCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean allElectiveCoursesHaveEqualCredit(Semester semester) {
		EList<CourseSlot> courseSlots = semester.getCourseSlots();
		for (int i = 0 ; i < courseSlots.size() ; i++) {
			CourseSlot slot = courseSlots.get(i);
			if(slot.getCourseSlotType() == CourseSlotType.ELECTIVE && slot.getElectiveCourses().size() > 1) {
				float electiveCourseCredits = slot.getElectiveCourses().get(0).getCredits();
				for (int j = 1 ; i < slot.getElectiveCourses().size() ; i++) {
					if (slot.getElectiveCourses().get(j).getCredits() != electiveCourseCredits) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterContainer(SemesterContainer semesterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semesterContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseSlot(CourseSlot courseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseSlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseSlot_courseListIsEmptyIfSlotIsCopulsory(courseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseSlot_compulsoryCourseIsEmptyIfSlotIsElective(courseSlot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseListIsEmptyIfSlotIsCopulsory constraint of '<em>Course Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseSlot_courseListIsEmptyIfSlotIsCopulsory(CourseSlot courseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! courseListIsEmpty(courseSlot)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseListIsEmptyIfSlotIsCopulsory", getObjectLabel(courseSlot, context) },
						 new Object[] { courseSlot },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean courseListIsEmpty(CourseSlot courseSlot) {
		if (courseSlot.getCourseSlotType() == CourseSlotType.COMPULSORY) {
			return (courseSlot.getElectiveCourses().size() == 0);
		}
		else {
			return true;
		}
	}

	/**
	 * Validates the compulsoryCourseIsEmptyIfSlotIsElective constraint of '<em>Course Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseSlot_compulsoryCourseIsEmptyIfSlotIsElective(CourseSlot courseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (compulsoryCourseIsEmpty(courseSlot)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "compulsoryCourseIsEmptyIfSlotIsElective", getObjectLabel(courseSlot, context) },
						 new Object[] { courseSlot },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean compulsoryCourseIsEmpty(CourseSlot courseSlot) {
		if(courseSlot.getCourseSlotType() == CourseSlotType.ELECTIVE) {
			return(courseSlot.getCompulsoryCourse().eIsProxy());
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramCode(ProgramCode programCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramType(ProgramType programType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseSlotType(CourseSlotType courseSlotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyprogramValidator
