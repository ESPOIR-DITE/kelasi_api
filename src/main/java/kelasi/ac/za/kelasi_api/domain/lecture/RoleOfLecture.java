package kelasi.ac.za.kelasi_api.domain.lecture;

public class RoleOfLecture
{
    private String role, Id;

    private RoleOfLecture(){}

    public String getRole() {
        return role;
    }

    public String getId() {
        return Id;
    }

    public RoleOfLecture(Builder builder){
        this.Id = builder.Id;
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
        return "Role{" + "role='" + role + '\'' + ", Id='" + Id + '\'' + '}';
    }
}
