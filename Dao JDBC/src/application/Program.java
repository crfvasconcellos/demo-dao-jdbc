package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    static void main() {


        SellerDao sellerDao = DaoFactory.CreateSellerDao();

        System.out.println("=== Test 1: Seller findById ===");
        Seller seller = sellerDao.findbyId(3);
        System.out.println(seller);



    }
}
