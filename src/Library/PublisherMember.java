package Library;

public class PublisherMember extends Member{
    public PublisherMember(String memberId, String memberName, String email, String address) {
        super(memberId, memberName, email, address);
    }

    @Override
    public double calculateLateFees(int daysLate) {
        return daysLate*200;
    }
}
