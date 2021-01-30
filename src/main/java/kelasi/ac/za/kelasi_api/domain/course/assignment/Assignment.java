package kelasi.ac.za.kelasi_api.domain.course.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/***
 * Should hhave the following attributes
 * #id
 * #assgnmentTypeId
 * #uploadingDate
 * #dueDate
 * #weight
 */
@Entity
public class Assignment {
    @Id
    private String id;
    private String assignmentTypeId;
    private Date uploadingDate;
    private Date dueDate;
    private String weight;

    public Assignment() {
    }

    public Assignment(Builder builder) {
        this.id = builder.id;
        this.assignmentTypeId = builder.assignmentTypeId;
        this.uploadingDate = builder.uploadingDate;
        this.dueDate = builder.dueDate;
        this.weight = builder.weight;
    }

    public String getId() {
        return id;
    }

    public String getAssignmentTypeId() {
        return assignmentTypeId;
    }

    public Date getUploadingDate() {
        return uploadingDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getWeight() {
        return weight;
    }
    public static class Builder{
        private String id;
        private String assignmentTypeId;
        private Date uploadingDate;
        private Date dueDate;
        private String weight;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildAssignmentTypeId(String assignmentTypeId){
            this.assignmentTypeId = assignmentTypeId;
            return this;
        }
        public Builder buildUploadDate(Date uploadingDate){
            this.uploadingDate = uploadingDate;
            return this;
        }
        public Builder buildDueDate(Date dueDate ){
            this.dueDate = dueDate;
            return this;
        }
        public Builder buildWeight(String weight){
            this.weight = weight;
            return this;
        }
        public Assignment build(){
            return new Assignment(this);
        }
    }
}
