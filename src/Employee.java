public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    private final Date birthDate;

    public Employee(String firstName, String lastName,
                    String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
                firstName, lastName, socialSecurityNumber);
    }


}
