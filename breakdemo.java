class breakdemo
{
 public static void main(String args[])
 {
  System.out.println("Break stateemnt");
  int i;
  for(i=0;i<10;i++)
  {
   if (i==5)
     {
     break;
     }
   System.out.println(i);
   }
   System.out.println("Continue statement");
   for (i=0;i<10;i++)
   {
    if(i==5)
     {
     continue;
     }
    System.out.println(i);
   }
  }
}
  