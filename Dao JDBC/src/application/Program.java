package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("\n=== Test 3: Seller findAll ===");
        List<Seller> list2 = sellerDao.findAll();

        for (Seller obj: list2){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 4: Seller Insert ===");
        Seller newSeller = new Seller(null,"Claudio","claudio@mail.com",new Date(),5500.0,dep);

        sellerDao.insert(newSeller);
        if (newSeller.getId() != null){
            System.out.println("Inserted! New Id = " + newSeller.getId());
            System.out.println(newSeller);
        }

        System.out.println("\n=== Test 5: Seller Update ===");
        seller = sellerDao.findbyId(1);
        System.out.println("Before: " + seller);
        seller.setName("Maria Moraes");
        sellerDao.update(seller);
        System.out.println("Update completed");
        System.out.println("After: " + seller);

        System.out.println("\n=== Test 6: Seller Delete ===");
        System.out.println("Enter id for delete test: ");
        Scanner sc = new Scanner(System.in);
        int idfordelete = sc.nextInt();

        sellerDao.deleteById(idfordelete);
        System.out.println("Deleted!");


    }
}
