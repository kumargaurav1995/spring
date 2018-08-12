package springFirst;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Triangle triangle =new Triangle();
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));	
		Triangle triangle=(Triangle)factory.getBean("triangle");		
triangle.draw();
	}

}
