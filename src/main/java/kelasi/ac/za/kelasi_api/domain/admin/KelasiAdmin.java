package kelasi.ac.za.kelasi_api.domain.admin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KelasiAdmin {
    @Id
    private String email;
    private String name;
    private String surname;
    private String phoneNumber;

    private KelasiAdmin() {
    }

    public KelasiAdmin(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.surname = builder.surname;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static class Builder{
        private String email;
        private String name;
        private String surname;
        private String phoneNumber;

        public Builder buildEmail(String email){
            this.email = email;
            return this;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildSurname(String surname){
            this.surname= surname;
            return this;
        }
        public Builder buildPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public KelasiAdmin build(){
            return new KelasiAdmin(this);
        }
    }
}
