package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    static void main() {


        SellerDao sellerDao = DaoFactory.CreateSellerDao();

        System.out.println("=== Test 1: Seller findById ===");
        Seller seller = sellerDao.findbyId(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: Seller findByDepartment ===");
        Department dep = new Department(2,"Eletronics");
        List<Seller> list = sellerDao.findByDepartment(dep);

        for (Seller obj: list){
            System.out.println(obj);
        }


    }
}
