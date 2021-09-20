import dao.BeersDao;
import model.Beer;


import java.sql.*;


public class MainApp {
    public static void main(String[] args) {



        try {
            //Beer beer = new Beer(7000, "Pearl", 0, 0, 1.35, 2, 6);
            BeersDao beersDao = new BeersDao();

           beersDao.deleteBeer(6001);
           beersDao.deleteBeer(7000);
            beersDao.getAllBeers().forEach(System.out::println);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
