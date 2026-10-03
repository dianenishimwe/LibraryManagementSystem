package Library;

public class LibrarianMember extends Member{
    public LibrarianMember(String memberId, String memberName, String email, String address) {
        super(memberId, memberName, email, address);
    }

    @Override
    public double calculateLateFees(int daysLate) {
        return 0;
    }
}
