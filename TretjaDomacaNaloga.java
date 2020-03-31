class TretjaDomacaNaloga
{
  public static void main(String[] args)
  {
    boolean pra = true;
    int stevec;
    int n = Integer.parseInt(args[0]);
    System.out.print("Praštevila manjša ali enaka od " + n + " so števila: 2 ");
    if (n == 1) {
    System.out.print("Število 1 ni praštevilo, ker nima dveh deliteljev.");
    }
    else {
        for(stevec = 3;stevec <= n;stevec++) {
           for(int i = 2; i <= stevec/2; i++) {
             if(stevec % i == 0) {
               pra = false;
             }
           }
           if(pra == true) {
           System.out.print(stevec + " ");
            }
        pra = true;
        }
      }
   }
}
