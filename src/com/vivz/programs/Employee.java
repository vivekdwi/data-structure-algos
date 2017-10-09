package com.vivz.programs;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;

/**
 * {@link Employee} class with Custom Comparable
 * and Comparator Interfaces.
 *
 * Created by vivekdwivedi on 10/9/2017.
 */
public class Employee implements Comparable<Employee>{
    private int id;

    private String name;

    private int salary;

    private int age;

    private Date dateOfJoining;

    public Employee(int pId, String pName, int pSalary, int pAge, Date pDateOfJoining) {
        id = pId;
        name = pName;
        salary = pSalary;
        age = pAge;
        dateOfJoining = pDateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int pSalary) {
        salary = pSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int pAge) {
        age = pAge;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date pDateOfJoining) {
        dateOfJoining = pDateOfJoining;
    }

    @Override
    public boolean equals(Object obj) {

        if(null == obj)
            return false;

        if(getClass() != obj.getClass())
            return false;

        if (!(obj instanceof Employee))
            return false;

        final Employee lEmployee = (Employee) obj;

        if(this.id != lEmployee.id)
            return false;

        if((this.name == null) ? (lEmployee.name != null) : this.name.equals(lEmployee.name))
            return false;

        if(this.salary != lEmployee.salary)
            return false;

        if(this.age != lEmployee.age)
            return false;

        if(this.dateOfJoining != lEmployee.dateOfJoining && (this.dateOfJoining == null || !this.dateOfJoining.equals(lEmployee.dateOfJoining)))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lResult = 5;
        lResult = 31 * lResult + this.id;
        lResult = 31 * lResult + (this.name != null ? this.name.hashCode() : 0);
        lResult = 31 * lResult + this.salary;
        lResult = 31 * lResult + this.age;
        lResult = 31 * lResult + (this.dateOfJoining != null ? this.dateOfJoining.hashCode() : 0);
        return lResult;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param obj the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Employee obj) {
        return this.id-obj.id;
    }

    public static final Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.age-o2.age;
        }
    };

    public static final Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public static final Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary-o2.salary;
        }
    };

    public static final Comparator<Employee> dateOfJoiningComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.dateOfJoining.compareTo(o2.dateOfJoining);
        }
    };

    public static final Comparator<Map.Entry<Integer,Employee>> nameMapComparator = new Comparator<Map.Entry<Integer, Employee>>() {
        @Override
        public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
            return o1.getValue().name.compareTo(o2.getValue().name);
        }
    };
}
