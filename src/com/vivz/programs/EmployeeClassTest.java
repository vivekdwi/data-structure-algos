package com.vivz.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * {@link EmployeeClassTest} is an Example of Sorting HashMap
 * based on Employee Object Values and Employee Name.
 * This Class is also an Example of removing Duplicates Values
 * from List of User Defined Object Properties.
 *
 * Created by vivekdwivedi on 10/9/2017.
 */
public class EmployeeClassTest {
    public static void main(String[] args) throws ParseException{
        Map<Integer, Employee> lMap = new TreeMap<Integer,Employee>();
        SimpleDateFormat lDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        lMap.put(1, new Employee(1,"vivek",15000, 22,lDateFormat.parse("10/05/2015")));
        lMap.put(2, new Employee(2,"dwivedi",20000, 23,lDateFormat.parse("10/06/2015")));
        lMap.put(3, new Employee(3,"shalu",10000, 21,lDateFormat.parse("10/07/2015")));
        lMap.put(4, new Employee(4,"vikas",90000, 28,lDateFormat.parse("10/04/2015")));
        lMap.put(5, new Employee(5,"vineet",25000, 29,lDateFormat.parse("10/03/2015")));
        System.out.println("Unsorted Map :: "+lMap);
        List<Map.Entry<Integer,Employee>> lEmployees = new ArrayList<>(lMap.entrySet());
        Collections.sort(lEmployees,Employee.nameMapComparator);
        System.out.println("Sorted Map List :: "+lEmployees);
        Map<Integer,Employee> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Employee> entry : lEmployees){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Sorted Map :: "+sortedMap);

        List<Employee> lEmployeeList = new ArrayList<>();
        lEmployeeList.add(new Employee(1,"vivek",15000, 22,lDateFormat.parse("10/05/2015")));
        lEmployeeList.add(new Employee(2,"vivek",20000, 23,lDateFormat.parse("10/06/2015")));
        lEmployeeList.add(new Employee(3,"shalu",10000, 21,lDateFormat.parse("10/07/2015")));
        lEmployeeList.add(new Employee(4,"vikas",90000, 28,lDateFormat.parse("10/04/2015")));
        lEmployeeList.add(new Employee(5,"vineet",25000, 29,lDateFormat.parse("10/03/2015")));

        System.out.println("Unsorted List :: "+lEmployeeList);

        Set<Employee> lEmployeeSet = new TreeSet<>(Employee.nameComparator);
        lEmployeeSet.addAll(lEmployeeList);
        System.out.println("Set Size :: "+lEmployeeSet.size());
        System.out.println("Employee Set :: "+lEmployeeSet);


    }
}
