package kelasi.ac.za.kelasi_api.domain.lecture;

public class LectureRole
{
    private String roleId, email, date;

    private LectureRole(){}

    public String getRoleId() {
        return roleId;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public LectureRole(Builder builder)
    {
        this.email = builder.email;
        this.roleId = builder.roleId;
        this.date = builder.date;
    }

    public static class Builder
    {
        private String roleId, email, date;

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder roleId(String roleId){
            this.roleId = roleId;
            return this;
        }

        public Builder date(String date){
            this.date = date;
            return this;
        }


        public LectureRole build(){
            return new LectureRole(this);
        }
    }

    @Override
    public String toString() {
        return "LectureRole{" + "roleId='" + roleId + '\'' + "," +
                " email='" + email + '\'' + ", date='" + date + '\'' + '}';
    }
}
