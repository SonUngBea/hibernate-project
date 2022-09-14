import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	@Id
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "schoolId")
	private Long schoolId;

	@Column(name = "schoolName")
	private String schoolName;

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
			'}';
	}
}
