import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
	@Id
	private Long id;

	private String name;

	private Long schoolId;

	private String schoolName;

	// Join with PK
	// @ManyToOne
	// @JoinColumn(name = "schoolId", insertable = false ,updatable = false)
	// private School school;

	// Join with Not PK
	 @ManyToOne
	 @JoinColumn(name = "schoolName", referencedColumnName = "name", insertable = false ,updatable = false)
	 private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student{" +
			"id=" + id +
			", name='" + name + '\'' +
			", schoolId=" + schoolId +
			", schoolName='" + schoolName + '\'' +
			", school=" + school +
			'}';
	}
}
