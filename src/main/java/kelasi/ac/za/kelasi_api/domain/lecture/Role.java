package kelasi.ac.za.kelasi_api.domain.lecture;

public class Role
{
    private String role, Id;

    private Role(){}

    public String getRole() {
        return role;
    }

    public String getId() {
        return Id;
    }

    public Role(Builder builder){
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

        public Role build(){
            return new Role(this);
        }
    }

    @Override
    public String toString() {
        return "Role{" + "role='" + role + '\'' + ", Id='" + Id + '\'' + '}';
    }
}
