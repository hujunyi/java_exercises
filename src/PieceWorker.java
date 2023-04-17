public class PieceWorker extends Employee{

    private final double wage;
    private final int pieces;

    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber, Date birthDate, double wage, int pieces){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.wage = wage;
        this.pieces = pieces;
    }


    @Override
    public double earnings() {
        return wage * pieces;
    }

}
