package kelasi.ac.za.kelasi_api.domain.course.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssignmentFile {
    @Id
    private String assignmentId;
    private String fileId;

    public AssignmentFile() {
    }

    public AssignmentFile(Builder builder) {
        this.assignmentId = builder.assignmentId;
        this.fileId = builder.fileId;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public String getFileId() {
        return fileId;
    }
    public static class Builder{
        private String assignmentId;
        private String fileId;
        public Builder buildAssignmentId(String assignmentId){
            this.assignmentId = assignmentId;
            return this;
        }
        public Builder buildFileId(String fileId){
            this.fileId = fileId;
            return this;
        }
        public AssignmentFile build(){
            return new AssignmentFile(this);
        }
    }
}
