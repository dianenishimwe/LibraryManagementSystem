package Library;

public class StudentMember extends Member{
    public StudentMember(String memberId, String memberName, String email, String address) {
        super(memberId, memberName, email, address);
    }

    @Override
    public double calculateLateFees(int daysLate) {
        return daysLate *100;
    }
}
