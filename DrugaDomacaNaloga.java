class DrugaDomacaNaloga
 {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
    int f0 = 1, f1 = 1;
    int vsota = 2;
    System.out.print(f0 + " " + f1);

		for(int i=3; i <= n; i++)
		{
			int f2 = f0 + f1;
      System.out.print(" " + f2);
      for(int j = 1; j <= n; i++)
        {
          vsota = vsota + f2;break;
        }
      f0 = f1;
      f1 = f2;
		}
    System.out.println("\n");
    System.out.print(vsota);
	}
}
