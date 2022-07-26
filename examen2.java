package MainApp;

/**
 *
 * @author fundacion
 */
import MainApp.Customer;
import MainApp.Account;
public class MyJoin extends Customer {
    public static void main(String args[]) {

        Customer[] arr1 = new Customer[];
        Account[] arr2 = new Account[]

        MyJoin s1 = new MyJoin(arr1, arr2, "id");

        System.out.println(s1);

    }

    private MyJoin(Customer[] arr1, Account[] arr2, String id) {
        int a = arr1[0];
        int b = arr2[0];
        if (a == b) {
            System.out.println(arr1, arr2, a);
        }
    }
}
