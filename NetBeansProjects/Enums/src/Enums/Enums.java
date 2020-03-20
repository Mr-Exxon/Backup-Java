/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Enums;
class Enums 
{
 private int minum;
 enum drink  
{
 //mendefinisikan variable yang dimiliki enum
 Milk_Tea, Brown_Sugar, Fresh_Milk, Coffee
}
    //set and get method
    public void setMinum(int minum) 
    {
     this.minum = minum;
    }

    public int getMinum() 
    {
     return minum;
    }
           
    public static void main(String[] args)
    {
        //Objek arr[] Untuk menampung data yang dimiliki oleh enum drink
        drink arr[] = drink.values();
        //Melooping serta Mencetak SEMUA nilai Pada Enum
        for(drink Minum : arr)
            System.out.println(Minum);
        
    }
}