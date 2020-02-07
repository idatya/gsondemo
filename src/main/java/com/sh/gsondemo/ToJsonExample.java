package com.sh.gsondemo;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ToJsonExample {
	public static void main(String[] args) {

		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		Employee emp = createEmployeeObject();

        // Java objects to String
        // String json = gson.toJson(staff);

        // Java objects to File
        try (FileWriter writer = new FileWriter("/home/impadmin/Downloads/temp/employee.json")) {
            gson.toJson(emp, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
	}
	
	private static Employee createEmployeeObject() {

        Employee emp = new Employee();

        emp.setName("aditya");
        emp.setAge(35);
        emp.setPosition(new String[]{"MLSE", "Technical", "Engineer"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(20000));
            put("2018", new BigDecimal(30000));
        }};
        emp.setSalary(salary);
        emp.setSkills(Arrays.asList("java", "python", "spark", "hive"));

        return emp;

    }
}
