/**
 */
package Studyprogram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Studyprogram.StudyprogramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyprogramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Studyprogram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tdt4250/runesb/studyprogram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdt4250.runesb.studyprogram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyprogramPackage eINSTANCE = Studyprogram.impl.StudyprogramPackageImpl.init();

	/**
	 * The meta object id for the '{@link Studyprogram.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.CourseImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Studyprogram.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.UniversityImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__PROGRAMS = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Studyprogram.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.SemesterImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Course Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_SLOTS = 1;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Studyprogram.impl.SemesterContainerImpl <em>Semester Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.SemesterContainerImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getSemesterContainer()
	 * @generated
	 */
	int SEMESTER_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_CONTAINER__SEMESTERS = 0;

	/**
	 * The number of structural features of the '<em>Semester Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semester Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Studyprogram.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.ProgramImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMESTERS = SEMESTER_CONTAINER__SEMESTERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = SEMESTER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_CODE = SEMESTER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALISATION = SEMESTER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NUMBER_OF_YEARS = SEMESTER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Program Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_TYPE = SEMESTER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = SEMESTER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = SEMESTER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Studyprogram.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.SpecialisationImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 5;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTERS = SEMESTER_CONTAINER__SEMESTERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = SEMESTER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Specialisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SUB_SPECIALISATION = SEMESTER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = SEMESTER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = SEMESTER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Studyprogram.impl.CourseSlotImpl <em>Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.impl.CourseSlotImpl
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getCourseSlot()
	 * @generated
	 */
	int COURSE_SLOT = 6;

	/**
	 * The feature id for the '<em><b>Course Slot Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__COURSE_SLOT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Compulsory Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__COMPULSORY_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Elective Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__ELECTIVE_COURSES = 2;

	/**
	 * The number of structural features of the '<em>Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Studyprogram.ProgramCode <em>Program Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.ProgramCode
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getProgramCode()
	 * @generated
	 */
	int PROGRAM_CODE = 7;

	/**
	 * The meta object id for the '{@link Studyprogram.ProgramType <em>Program Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.ProgramType
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getProgramType()
	 * @generated
	 */
	int PROGRAM_TYPE = 8;

	/**
	 * The meta object id for the '{@link Studyprogram.CourseSlotType <em>Course Slot Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.CourseSlotType
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getCourseSlotType()
	 * @generated
	 */
	int COURSE_SLOT_TYPE = 9;

	/**
	 * The meta object id for the '{@link Studyprogram.SemesterType <em>Semester Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Studyprogram.SemesterType
	 * @see Studyprogram.impl.StudyprogramPackageImpl#getSemesterType()
	 * @generated
	 */
	int SEMESTER_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link Studyprogram.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see Studyprogram.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Studyprogram.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see Studyprogram.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see Studyprogram.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see Studyprogram.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link Studyprogram.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see Studyprogram.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Studyprogram.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Studyprogram.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see Studyprogram.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link Studyprogram.University#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see Studyprogram.University#getPrograms()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Programs();

	/**
	 * Returns the meta object for class '{@link Studyprogram.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see Studyprogram.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Semester#getSemesterNumber <em>Semester Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Number</em>'.
	 * @see Studyprogram.Semester#getSemesterNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link Studyprogram.Semester#getCourseSlots <em>Course Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Slots</em>'.
	 * @see Studyprogram.Semester#getCourseSlots()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseSlots();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Semester#getSemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Type</em>'.
	 * @see Studyprogram.Semester#getSemesterType()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterType();

	/**
	 * Returns the meta object for class '{@link Studyprogram.SemesterContainer <em>Semester Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Container</em>'.
	 * @see Studyprogram.SemesterContainer
	 * @generated
	 */
	EClass getSemesterContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link Studyprogram.SemesterContainer#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see Studyprogram.SemesterContainer#getSemesters()
	 * @see #getSemesterContainer()
	 * @generated
	 */
	EReference getSemesterContainer_Semesters();

	/**
	 * Returns the meta object for class '{@link Studyprogram.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see Studyprogram.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Studyprogram.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Program#getProgramCode <em>Program Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Code</em>'.
	 * @see Studyprogram.Program#getProgramCode()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ProgramCode();

	/**
	 * Returns the meta object for the containment reference list '{@link Studyprogram.Program#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisation</em>'.
	 * @see Studyprogram.Program#getSpecialisation()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specialisation();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Program#getNumberOfYears <em>Number Of Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Years</em>'.
	 * @see Studyprogram.Program#getNumberOfYears()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_NumberOfYears();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Program#getProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Type</em>'.
	 * @see Studyprogram.Program#getProgramType()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ProgramType();

	/**
	 * Returns the meta object for class '{@link Studyprogram.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see Studyprogram.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Studyprogram.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Studyprogram.Specialisation#getSubSpecialisation <em>Sub Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Specialisation</em>'.
	 * @see Studyprogram.Specialisation#getSubSpecialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_SubSpecialisation();

	/**
	 * Returns the meta object for class '{@link Studyprogram.CourseSlot <em>Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Slot</em>'.
	 * @see Studyprogram.CourseSlot
	 * @generated
	 */
	EClass getCourseSlot();

	/**
	 * Returns the meta object for the attribute '{@link Studyprogram.CourseSlot#getCourseSlotType <em>Course Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Slot Type</em>'.
	 * @see Studyprogram.CourseSlot#getCourseSlotType()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EAttribute getCourseSlot_CourseSlotType();

	/**
	 * Returns the meta object for the reference '{@link Studyprogram.CourseSlot#getCompulsoryCourse <em>Compulsory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compulsory Course</em>'.
	 * @see Studyprogram.CourseSlot#getCompulsoryCourse()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EReference getCourseSlot_CompulsoryCourse();

	/**
	 * Returns the meta object for the reference list '{@link Studyprogram.CourseSlot#getElectiveCourses <em>Elective Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elective Courses</em>'.
	 * @see Studyprogram.CourseSlot#getElectiveCourses()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EReference getCourseSlot_ElectiveCourses();

	/**
	 * Returns the meta object for enum '{@link Studyprogram.ProgramCode <em>Program Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program Code</em>'.
	 * @see Studyprogram.ProgramCode
	 * @generated
	 */
	EEnum getProgramCode();

	/**
	 * Returns the meta object for enum '{@link Studyprogram.ProgramType <em>Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program Type</em>'.
	 * @see Studyprogram.ProgramType
	 * @generated
	 */
	EEnum getProgramType();

	/**
	 * Returns the meta object for enum '{@link Studyprogram.CourseSlotType <em>Course Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Slot Type</em>'.
	 * @see Studyprogram.CourseSlotType
	 * @generated
	 */
	EEnum getCourseSlotType();

	/**
	 * Returns the meta object for enum '{@link Studyprogram.SemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Type</em>'.
	 * @see Studyprogram.SemesterType
	 * @generated
	 */
	EEnum getSemesterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyprogramFactory getStudyprogramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Studyprogram.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.CourseImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link Studyprogram.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.UniversityImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__PROGRAMS = eINSTANCE.getUniversity_Programs();

		/**
		 * The meta object literal for the '{@link Studyprogram.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.SemesterImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_NUMBER = eINSTANCE.getSemester_SemesterNumber();

		/**
		 * The meta object literal for the '<em><b>Course Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_SLOTS = eINSTANCE.getSemester_CourseSlots();

		/**
		 * The meta object literal for the '<em><b>Semester Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_TYPE = eINSTANCE.getSemester_SemesterType();

		/**
		 * The meta object literal for the '{@link Studyprogram.impl.SemesterContainerImpl <em>Semester Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.SemesterContainerImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getSemesterContainer()
		 * @generated
		 */
		EClass SEMESTER_CONTAINER = eINSTANCE.getSemesterContainer();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_CONTAINER__SEMESTERS = eINSTANCE.getSemesterContainer_Semesters();

		/**
		 * The meta object literal for the '{@link Studyprogram.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.ProgramImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Program Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__PROGRAM_CODE = eINSTANCE.getProgram_ProgramCode();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALISATION = eINSTANCE.getProgram_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Number Of Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NUMBER_OF_YEARS = eINSTANCE.getProgram_NumberOfYears();

		/**
		 * The meta object literal for the '<em><b>Program Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__PROGRAM_TYPE = eINSTANCE.getProgram_ProgramType();

		/**
		 * The meta object literal for the '{@link Studyprogram.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.SpecialisationImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Specialisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SUB_SPECIALISATION = eINSTANCE.getSpecialisation_SubSpecialisation();

		/**
		 * The meta object literal for the '{@link Studyprogram.impl.CourseSlotImpl <em>Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.impl.CourseSlotImpl
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getCourseSlot()
		 * @generated
		 */
		EClass COURSE_SLOT = eINSTANCE.getCourseSlot();

		/**
		 * The meta object literal for the '<em><b>Course Slot Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_SLOT__COURSE_SLOT_TYPE = eINSTANCE.getCourseSlot_CourseSlotType();

		/**
		 * The meta object literal for the '<em><b>Compulsory Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_SLOT__COMPULSORY_COURSE = eINSTANCE.getCourseSlot_CompulsoryCourse();

		/**
		 * The meta object literal for the '<em><b>Elective Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_SLOT__ELECTIVE_COURSES = eINSTANCE.getCourseSlot_ElectiveCourses();

		/**
		 * The meta object literal for the '{@link Studyprogram.ProgramCode <em>Program Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.ProgramCode
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getProgramCode()
		 * @generated
		 */
		EEnum PROGRAM_CODE = eINSTANCE.getProgramCode();

		/**
		 * The meta object literal for the '{@link Studyprogram.ProgramType <em>Program Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.ProgramType
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getProgramType()
		 * @generated
		 */
		EEnum PROGRAM_TYPE = eINSTANCE.getProgramType();

		/**
		 * The meta object literal for the '{@link Studyprogram.CourseSlotType <em>Course Slot Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.CourseSlotType
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getCourseSlotType()
		 * @generated
		 */
		EEnum COURSE_SLOT_TYPE = eINSTANCE.getCourseSlotType();

		/**
		 * The meta object literal for the '{@link Studyprogram.SemesterType <em>Semester Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Studyprogram.SemesterType
		 * @see Studyprogram.impl.StudyprogramPackageImpl#getSemesterType()
		 * @generated
		 */
		EEnum SEMESTER_TYPE = eINSTANCE.getSemesterType();

	}

} //StudyprogramPackage
