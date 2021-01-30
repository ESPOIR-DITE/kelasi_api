package kelasi.ac.za.kelasi_api.domain.course.subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SubjectResource {
    @Id
    private String id;
    private String resourceTypeId;
    private Date date;
    private String description;
    private String subjectId;

    public SubjectResource() {
    }

    public SubjectResource(Builder builder) {
        this.id = builder.id;
        this.resourceTypeId = builder.resourceTypeId;
        this.date = builder.date;
        this.description = builder.description;
        this.subjectId = builder.subjectId;
    }

    public String getId() {
        return id;
    }

    public String getResourceTypeId() {
        return resourceTypeId;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getSubjectId() {
        return subjectId;
    }
    public static class Builder{
        private String id;
        private String resourceTypeId;
        private Date date;
        private String description;
        private String subjectId;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildResourceTypeId(String resourceTypeId){
            this.resourceTypeId = resourceTypeId;
            return this;
        }
        public Builder buildDate(Date date){
            this.date = date;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public Builder buildSubjectId(String subjectId){
            this.subjectId = subjectId;
            return this;
        }
        public SubjectResource build(){
            return new SubjectResource(this);
        }
    }
}
