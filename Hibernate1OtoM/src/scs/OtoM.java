package scs;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class OtoM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Dept d=new Dept();
		d.setDeptid(1);
		d.setDeptname("IT");
		Employee e1=new Employee();
		e1.setEmpid(101);
		e1.setEmpname("yogesh");
		Employee e2=new Employee();
		e2.setEmpid(102);
		e2.setEmpname("sandeep");
		
		Set st=new HashSet<>();
		st.add(e1);
		st.add(e2);
		
		d.setEmpref(st);
		Transaction tx=s.beginTransaction();
		s.save(d);
		tx.commit();
		s.close();
		sf.close();
	}

}
