package scs;
import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name="dept")
public class Dept {
@Id
private int deptid;
@Column
private String deptname;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="deptid",referencedColumnName="deptid")
private Set empref;
public Set getEmpref() {
	return empref;
}
public void setEmpref(Set empref) {
	this.empref = empref;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}

}
