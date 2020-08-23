package kelasi.ac.za.kelasi_api.domain.institution;

import java.util.Objects;

public class Classe {

    private String id;
    private String title;
    private String description;

    public Classe(){

    }

    private Classe(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{

        private String id;
        private String title;
        private String description;


        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Classe classe){
            this.id = classe.id;
            this.title = classe.title;
            this.description = classe.description;

            return this;
        }

        public Classe build() {
            return new Classe(this);
        }


    }

    @Override
    public String toString() {
        return "Classe{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classe classe = (Classe) o;
        return id.equals(classe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
