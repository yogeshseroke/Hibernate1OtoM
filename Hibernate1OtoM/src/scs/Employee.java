package scs;
import javax.persistence.*;
@Entity
@Table(name="emp")
public class Employee {
@Id
private int empid;
@Column
private String empname;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
}
