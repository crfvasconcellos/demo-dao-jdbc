package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class programDepartment {
    static void main() {

        DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();

//        System.out.println("=== Test 1: Department Insert ===");
//        Department newDepartment = new Department(null,"Law");
//        departmentDao.insert(newDepartment);
//        if (newDepartment.getId() != null){
//            System.out.println("Inserted New ID = " + newDepartment.getId());
//            System.out.println(newDepartment);
//        }
//
//        System.out.println("=== Test 2: Department DeletById ===");
//        departmentDao.deleteById(6);
//        System.out.println("Deletd ID");

        System.out.println("=== Test 3: Department FindById ===");
        Department dep = departmentDao.findbyId(4);
        System.out.println(dep);

        System.out.println("=== Test 4: Department update ===");
        Department dep2 = departmentDao.findbyId(4);
        System.out.println("Before: " + dep2);
        dep2.setName("Clothes");
        departmentDao.update(dep2);
        System.out.println("After: " + dep2);
    }
}
