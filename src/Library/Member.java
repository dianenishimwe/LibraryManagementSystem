package Library;

public  abstract class   Member {
    private String memberId;
    private String memberName;
    private String email;
    private String address;
// construtor


    public Member(String memberId, String memberName, String email, String address) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.address = address;
    }
    //getter and setter

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //tostring

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public abstract double calculateLateFees(int daysLate);
}

