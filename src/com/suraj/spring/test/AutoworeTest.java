package com.suraj.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Pancard;
import com.suraj.spring.beans.Passport;
import com.suraj.spring.beans.Person;

public class AutoworeTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			Person person = context.getBean("person", Person.class);
			System.out.println(person.getPersonId()+"\t"+person.getPersonName());
			Passport passport = person.getPassport();
			Pancard pancard = person.getPancard();
			if (passport != null) {
				System.out.println(passport.getPassportNum()+"\t"+passport.getName());
			}
			if (pancard != null) {
				System.out.println(pancard.getPanNum()+"\t"+pancard.getPanName());
			}
		}catch(BeansException e) {
			e.printStackTrace();
		}finally {
			if (context != null) {
				((AbstractApplicationContext) context).close();
			}
		}
	}
}
