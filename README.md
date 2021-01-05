# Revision
## Entities
- Project
    - Name
    - Teacher
    - Students
- Student
    - FirstName
    - LastName
    - Projects
- Teacher
    - FirstName
    - LastName
- Compte
    - Amount
    - Salary
    - Teacher
    - Salary (Transient)
## Relations
- OneToOne : Teacher And Compte
- ManyToOne or OneToMany (same thing)  :  Project And Teacher
- ManyToMany : Project and Student
