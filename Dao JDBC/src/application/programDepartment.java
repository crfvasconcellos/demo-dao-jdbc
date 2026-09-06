package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class programDepartment {
    static void main() {

        DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();

        System.out.println("=== Test 1: Department Insert ===");
        Department newDepartment = new Department(null,"Law");
        departmentDao.insert(newDepartment);
        if (newDepartment.getId() != null){
            System.out.println("Inserted New ID = " + newDepartment.getId());
            System.out.println(newDepartment);
        }

        System.out.println("=== Test 2: Department DeletById ===");
        departmentDao.deleteById(6);
        System.out.println("Deletd ID");

    }
}
