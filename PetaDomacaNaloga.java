import java.io.*;

public class PetaDomacaNaloga {


  public static void main(String[] args) throws Exception {

        InputStreamReader vt = new InputStreamReader(System.in);
        BufferedReader vhod = new BufferedReader(vt);

        System.out.println("Izberi ime datoteke v obliki 'ime.txt'.");
        String imeDatoteke = vhod.readLine();

        System.out.println("Vnesi besedilo, ki se bo zapisalo v kreirani datoteki.");
        String besedilo = vhod.readLine();

        zapisiVdatoteko(imeDatoteke, besedilo);
        String rezultat = preberiDatoteko(imeDatoteke);

        System.out.println("Datoteka z imenom " + imeDatoteke + " je uspesno kreirana.");

        System.out.println("Izberi ime druge datoteke v obliki 'ime.txt'.");
        String ime2Datoteke = vhod.readLine();

        String obrnjenRezultat = obrniNiz(rezultat);
        zapisiVdatoteko(ime2Datoteke, obrnjenRezultat);

        System.out.println(preberiDatoteko(ime2Datoteke));


  }

  //metoda ki obrne niz
  public static String obrniNiz(String s) {

      char[] in = s.toCharArray();
      int begin = 0;
      int end = in.length-1;
      char temp;
      while(end > begin) {
          temp = in[begin];
          in[begin] = in[end];
          in[end] = temp;
          end--;
          begin++;
      }
      return new String(in);

  }

  //metoda ki zapise v datoteko
  public static void zapisiVdatoteko(String ime, String vsebina) throws Exception {

    FileWriter fw = new FileWriter(ime);
    PrintWriter dat = new PrintWriter(fw);

    dat.println(vsebina);
    dat.close();

  }

  //metoda ki prebere iz datoteke

  public static String preberiDatoteko(String imeDatoteke) throws Exception {

        FileReader fr = new FileReader(imeDatoteke);
        BufferedReader dat = new BufferedReader(fr);

        String rezultat = "";

        while(dat.ready()) {

          rezultat = dat.readLine();
        }
        dat.close();

        return new String(rezultat);
      }
}
