package in.ExcelExport.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="student_dtls")
@Entity
public class ExcelEntity {
	@Id
	private Integer studentRollNo;
	private String studentName;
	private Integer StudentStandard;
	private Double studentPercentage;
	
	@Column(name="created_date",updatable = false)
	@CreationTimestamp
	private LocalDate createddate;
	@Column(name="updated_date",insertable = false)
	@UpdateTimestamp
	private LocalDate updateddate;
	public Integer getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(Integer studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentStandard() {
		return StudentStandard;
	}
	public void setStudentStandard(Integer studentStandard) {
		StudentStandard = studentStandard;
	}
	public Double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(Double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
	public LocalDate getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}
	public LocalDate getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}
	@Override
	public String toString() {
		return "ExcelEntity [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", StudentStandard="
				+ StudentStandard + ", studentPercentage=" + studentPercentage + ", createddate=" + createddate
				+ ", updateddate=" + updateddate + "]";
	}
	
	
}
