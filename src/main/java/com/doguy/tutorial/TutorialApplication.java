package com.doguy.tutorial;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {


		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	// The line above is commented out and was used in older versions of Spring Framework.
	// XmlBeanFactory was a class used to create a BeanFactory from an XML configuration file,
	// but it has been deprecated and removed in more recent versions of Spring Framework.
	// Instead, you should use ApplicationContext implementations like ClassPathXmlApplicationContext.

	// Create an ApplicationContext object by loading the XML configuration file.
	// The ApplicationContext interface provides a way to access Spring beans and their configurations.
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

	// Get the bean named "alien" from the ApplicationContext.
	// The getBean() method retrieves an instance of the bean with the specified id from the context.
	// Here, the bean with id "alien" is retrieved and cast to the Alien class.
		Alien alien = (Alien) factory.getBean("alien");

	// Call the 'code' method on the retrieved Alien bean instance.
	// This method will execute the logic defined in the Alien class, which likely interacts with other beans.
	// For example, it might use the Laptop bean to perform some action.
		alien.code();


	}

}
