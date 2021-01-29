package kelasi.ac.za.kelasi_api.domain.institution;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class Institution {
@Id
    private String id;
    private String name;
    private String slogan;

    public Institution(){

    }

    private Institution(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.slogan = builder.slogan;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlogan() {
        return slogan;
    }

    public static class Builder{

        private String id;
        private String name;
        private String slogan;


        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder slogan(String slogan) {
            this.slogan = slogan;
            return this;
        }

        public Builder copy(Institution institution){
            this.id = institution.id;
            this.name = institution.name;
            this.slogan = institution.slogan;

            return this;
        }

        public Institution build() {
            return new Institution(this);
        }

    }

    @Override
    public String toString() {
        return "Institution{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", slogan='" + slogan + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institution institution = (Institution) o;
        return id.equals(institution.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
