/**
 */
package Studyprogram.impl;

import Studyprogram.Program;
import Studyprogram.ProgramCode;
import Studyprogram.ProgramType;
import Studyprogram.Specialisation;
import Studyprogram.StudyprogramPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Studyprogram.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link Studyprogram.impl.ProgramImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link Studyprogram.impl.ProgramImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link Studyprogram.impl.ProgramImpl#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link Studyprogram.impl.ProgramImpl#getProgramType <em>Program Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends SemesterContainerImpl implements Program {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramCode() <em>Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected static final ProgramCode PROGRAM_CODE_EDEFAULT = ProgramCode.MTDT;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected ProgramCode programCode = PROGRAM_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisation;

	/**
	 * The default value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected int numberOfYears = NUMBER_OF_YEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramType() <em>Program Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramType()
	 * @generated
	 * @ordered
	 */
	protected static final ProgramType PROGRAM_TYPE_EDEFAULT = ProgramType.BACHELORS;

	/**
	 * The cached value of the '{@link #getProgramType() <em>Program Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramType()
	 * @generated
	 * @ordered
	 */
	protected ProgramType programType = PROGRAM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramCode getProgramCode() {
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramCode(ProgramCode newProgramCode) {
		ProgramCode oldProgramCode = programCode;
		programCode = newProgramCode == null ? PROGRAM_CODE_EDEFAULT : newProgramCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__PROGRAM_CODE, oldProgramCode, programCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpecialisation() {
		if (specialisation == null) {
			specialisation = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, StudyprogramPackage.PROGRAM__SPECIALISATION);
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfYears(int newNumberOfYears) {
		int oldNumberOfYears = numberOfYears;
		numberOfYears = newNumberOfYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__NUMBER_OF_YEARS, oldNumberOfYears, numberOfYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramType getProgramType() {
		return programType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramType(ProgramType newProgramType) {
		ProgramType oldProgramType = programType;
		programType = newProgramType == null ? PROGRAM_TYPE_EDEFAULT : newProgramType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__PROGRAM_TYPE, oldProgramType, programType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.PROGRAM__SPECIALISATION:
				return ((InternalEList<?>)getSpecialisation()).basicRemove(otherEnd, msgs);
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
			case StudyprogramPackage.PROGRAM__NAME:
				return getName();
			case StudyprogramPackage.PROGRAM__PROGRAM_CODE:
				return getProgramCode();
			case StudyprogramPackage.PROGRAM__SPECIALISATION:
				return getSpecialisation();
			case StudyprogramPackage.PROGRAM__NUMBER_OF_YEARS:
				return getNumberOfYears();
			case StudyprogramPackage.PROGRAM__PROGRAM_TYPE:
				return getProgramType();
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
			case StudyprogramPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.PROGRAM__PROGRAM_CODE:
				setProgramCode((ProgramCode)newValue);
				return;
			case StudyprogramPackage.PROGRAM__SPECIALISATION:
				getSpecialisation().clear();
				getSpecialisation().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case StudyprogramPackage.PROGRAM__NUMBER_OF_YEARS:
				setNumberOfYears((Integer)newValue);
				return;
			case StudyprogramPackage.PROGRAM__PROGRAM_TYPE:
				setProgramType((ProgramType)newValue);
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
			case StudyprogramPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.PROGRAM__PROGRAM_CODE:
				setProgramCode(PROGRAM_CODE_EDEFAULT);
				return;
			case StudyprogramPackage.PROGRAM__SPECIALISATION:
				getSpecialisation().clear();
				return;
			case StudyprogramPackage.PROGRAM__NUMBER_OF_YEARS:
				setNumberOfYears(NUMBER_OF_YEARS_EDEFAULT);
				return;
			case StudyprogramPackage.PROGRAM__PROGRAM_TYPE:
				setProgramType(PROGRAM_TYPE_EDEFAULT);
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
			case StudyprogramPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.PROGRAM__PROGRAM_CODE:
				return programCode != PROGRAM_CODE_EDEFAULT;
			case StudyprogramPackage.PROGRAM__SPECIALISATION:
				return specialisation != null && !specialisation.isEmpty();
			case StudyprogramPackage.PROGRAM__NUMBER_OF_YEARS:
				return numberOfYears != NUMBER_OF_YEARS_EDEFAULT;
			case StudyprogramPackage.PROGRAM__PROGRAM_TYPE:
				return programType != PROGRAM_TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", programCode: ");
		result.append(programCode);
		result.append(", numberOfYears: ");
		result.append(numberOfYears);
		result.append(", programType: ");
		result.append(programType);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
