package com.sh.gsondemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class FromJsonExample {
	public static void main(String[] args) {

		Gson gson = new Gson();

		try (Reader reader = new FileReader("/home/impadmin/Downloads/temp/employee.json")) {

			// Convert JSON File to Java Object
			Employee emp = gson.fromJson(reader, Employee.class);

			// print staff object
			System.out.println(emp.getName());
			System.out.println(emp.getAge());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
