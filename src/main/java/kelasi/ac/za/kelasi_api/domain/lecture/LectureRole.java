package kelasi.ac.za.kelasi_api.domain.lecture;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LectureRole {
    @Id
    private String id;
    private String roleId, email, date;

    public LectureRole(){}

    public String getId() {
        return id;
    }

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
        this.id = builder.id;
    }

    public static class Builder
    {
        private String id;
        private String roleId, email, date;

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder buildId(String id){
            this.id = id;
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
