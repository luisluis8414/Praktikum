package io.fp.drucker;

public class Person {
    private String eMail;
    private MemberType memberType;

    public Person(String eMail, MemberType memberType)
    {
        this.eMail=eMail;
        this.memberType=memberType;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public MemberType getMemberType() {
        return memberType;
    }
    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    @Override 
    public String toString()
    {
        return eMail + ", with role: " +memberType;
    }
}
