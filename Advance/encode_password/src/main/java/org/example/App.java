package org.example;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String password = "123456789";
       String encode = BCrypt.hashpw(password, BCrypt.gensalt(12));
        System.out.println(encode);

       /*
       BCrypt.gensalt xác định số vòng, số vòng dao động từ 4-30,
       số vòng càng lớn thì thời gian thực hiện băm càng lâu.
        */

        boolean valuate = BCrypt.checkpw(password, encode);
        System.out.println(valuate);


    }

}
