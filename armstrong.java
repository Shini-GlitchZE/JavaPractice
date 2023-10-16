

class armstrong{
    public static void main(String args[]){

   int number = 153;
   int hun = number / 100;
   int newnum = number - (hun*100);
   int ten = newnum / 10;
   int one = newnum % 10;
   if((hun*hun*hun) + (ten*ten*ten) +(one*one*one) ==number){
    System.out.println("The number is an armstrong number");

   }
   else{
    System.out.println("The number is not an armstrong number");
   }
    



}
}


  