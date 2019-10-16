/**
 */
package Studyprogram.tests;

import Studyprogram.Specialisation;
import Studyprogram.StudyprogramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialisationTest extends SemesterContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialisationTest.class);
	}

	/**
	 * Constructs a new Specialisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Specialisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Specialisation getFixture() {
		return (Specialisation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogramFactory.eINSTANCE.createSpecialisation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SpecialisationTest
