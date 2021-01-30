package kelasi.ac.za.kelasi_api.domain.lecture;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoleOfLecture {
    @Id
    private String id;
    private String role;

    public RoleOfLecture(){}

    public String getRole() {
        return role;
    }

    public String getId() {
        return id;
    }

    public RoleOfLecture(Builder builder){
        this.id = builder.Id;
        this.role = builder.role;
    }

    public static class Builder
    {
        private String role, Id;

        public Builder Id(String Id){
            this.Id = Id;
            return this;
        }

        public Builder role(String role){
            this.role = role;
            return this;
        }

        public RoleOfLecture build(){
            return new RoleOfLecture(this);
        }
    }

    @Override
    public String toString() {
        return "Role{" + "role='" + role + '\'' + ", Id='" + id + '\'' + '}';
    }
}
