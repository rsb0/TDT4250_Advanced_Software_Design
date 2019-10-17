# TDT4250 Advanced Software Design exercise 3
## Changes to Ecore model from exercise 1:
- Specialisation: Have removed attribute selectionsemester, Container reference to program, and container reference to parrent specialisation. It still has attributes name and 0-n reference to subspecialisations. Reference to subspecialisation is moved to parrent class Semestercontainer.
- program: moved contained reference to Specialisation into superclass Semestercontainer 
- Semester: Added enumerated type attribute "semesterType" which is either spring or fall
- courseSlot: Added enumerated attribute courseSlotType with possible values elective or compulsory. CourseSlot now has a 1-1 reference to Course if the slot is compulsory, and a 0-n reference to Course for elective courses. Which one of the two references that point to courses in a given course is decided by the courseSlotType attribute.
- Removed semesters and specialisations from the University EClass.
- Removed electiveCourseSlot and CompulsoryCorseSlot EClasses.
- Added enumerated datatypes courseSlotType and SemesterType.

## Transformation:
tdt4250.runesb.studyprogram/model contains the Ecore model, the genmodel, and a serialized instance of the studyprogram Ecore model named 'University.xmi'.

tdt4250.runesb.acceleo.studyprogram contains EcoreToHtml.mtl, which performs the transformation,  in /src folder, as well as an html transformation of the University2.xmi model, in the /target folder.

EcoreToHtml.mtl contains the template generateElement which is the main template that initialises the transform it creates a landingpage html file with links to the different programs' pages. EcoreToHtml also contains 4 other templates named generate(anEClass : Eclass) which takes four different arguments in order to transform Program (which in turn generates a new html file for this program's page), Semester, CourseSlot and Specialisation to html. I have mainly used Acceleos for loops and and if statements to loop over programs, specialisations, semesters, and course slots, and used ordered and unordered lists in html to organize the transformed model.

To launch EcoreToHtml.mtl: run as Acceleo Application and set run configurations as follows:
- Project: tdt4250.runesb.acceleo.studyprogram
- Main Class: tdt4250.runesb.acceleo.studyprogram.main.EcoreToHtml
- Model: /tdt4250.runesb.studyprogram/model/University.xmi
- Target: /tdt4250.runesb.acceleo.studyprogram/target

Click apply and run, and find the transformed .html files in tdt4250.runesb.acceleo.studyprogram/target.
