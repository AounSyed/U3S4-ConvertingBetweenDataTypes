public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        int x = 128;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short y = 128;
        System.out.println((byte)(y));
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte g = 127;
        g++;
        System.out.println(g);
        g++;
        System.out.println(g);
        
        
        
    }    
}
