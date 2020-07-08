package kelasi.ac.za.kelasi_api.domain.course.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

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
}
