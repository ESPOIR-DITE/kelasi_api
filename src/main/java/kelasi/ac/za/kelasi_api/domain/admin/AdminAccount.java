package kelasi.ac.za.kelasi_api.domain.admin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminAccount {
    @Id
    private String id;
    private String email;
    private String institutionId;
    private String password;
    private String description;

    private AdminAccount() {
    }

    public AdminAccount(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;
        this.email = builder.email;
        this.institutionId = builder.institutionId;
        this.password = builder.password;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }
    public static class Builder{
        private String id;
        private String email;
        private String institutionId;
        private String password;
        private String description;

        public Builder(String id){
            this.id= id;
        }
        public Builder buildEmail(String email){
            this.email = email;
            return this;
        }
        public Builder buildInstitutionId(String institutionId){
            this.institutionId = institutionId;
            return this;
        }
        public Builder buildPassword(String password){
            this.password = password;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public AdminAccount build(){
            return new AdminAccount(this);
        }
    }
}
