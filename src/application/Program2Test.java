package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2Test {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST1 INSERT DEPARTMENT ===");
        Department dep = new Department(null, "Music");
        departmentDao.insert(dep);
        System.out.println("Inserted! New id = " + dep.getId());

        System.out.println("\n=== TEST2 FIND DEPARTMENT BY ID ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST3 UPDATE DEPARTMENT ===");
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST4 DELETE DEPARTMENT ===");
        departmentDao.deleteById(8);
        System.out.println("Delete completed");

    }
}

