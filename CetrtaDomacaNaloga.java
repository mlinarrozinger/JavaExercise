import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class CetrtaDomacaNaloga {

  public static void main(String[] args) {

    String besedilo = "Both the Themes gallery and the Quick Styles gallery" +
    "provide reset commands so that you can always restore the look of your "+
    "document to the original contained in your current template. " +
    "On the Insert tab, the galleries include items that are designed " +
    "to coordinate with the overall look of your document. You can use these " +
    "galleries to insert tables, headers, footers, lists, cover pages, and " +
    "other document building blocks. When you create pictures, charts, " +
    "or diagrams, they also coordinate with your current document look. " +
    "You can easily change the formatting of selected text in the document " +
    "text by choosing a look for the selected text from the Quick Styles " +
    "gallery on the Home tab. You can also format text directly by using the " +
    "other controls on the Home tab. Most controls offer a choice of using " +
    "the look from the current theme or using a format that you specify " +
    "directly. To change the overall look of your document, choose new Theme " +
    "elements on the Page Layout tab.";


    stevecZnakov(besedilo);
    stPojavitevZnaka(besedilo);
    System.out.println("\nStevilo samoglasnikov v besedilu je: " + prestejSamoglasnike(besedilo));
  }


  private static void stPojavitevZnaka(String s) {


    Map<Character, Integer> stevecZnakovMap = new HashMap<Character, Integer>();
        //zanka ki gre cez vse znake v stringu
        for(int i = 0; i < s.length(); i++){

            char c = s.toLowerCase().charAt(i);
            //izpustimo presledke, '.' in ','
            if(c == ' ' || c == '.' || c == ',')
                continue;
            // ce znak v tabeli ze obstaja mu povecamo vrednost za 1
            if(stevecZnakovMap.containsKey(c)){
                stevecZnakovMap.put(c, stevecZnakovMap.get(c) + 1);
            }else{
                //drugace mu dodelimo vrednost 1
                stevecZnakovMap.put(c, 1);
            }

            //int indeksZnaka = i;
          }
            System.out.println("\nStevilo posamicnih znakov v besedilu je: " + stevecZnakovMap);
            System.out.println();
    //Prikaz kje se posamezen znak v besedilu pojavi zadnjic
    Set<Map.Entry<Character, Integer>> prikazKljucevVrednosti = stevecZnakovMap.entrySet();
    for(Map.Entry<Character, Integer> entry : prikazKljucevVrednosti){
        System.out.println("Znak: " + entry.getKey() + " se zadnjic pojavi na: " + s.toLowerCase().lastIndexOf(entry.getKey()) + ". mestu.");

    }

  }


  public static int prestejSamoglasnike(String s) {
    int stevec = 0;
    for(int i = 0; i < s.length(); i++) {
      char c = s.toLowerCase().charAt(i);

      switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          stevec++;
        default:
      }
    }
    return stevec;
  }

  public static void stevecZnakov(String s) {

    Set<Character> set = new HashSet<Character>();

    for (Character c : s.toLowerCase().toCharArray()) {
        if(c == ' ' || c == '.' || c == ',')
          continue;
        set.add(c);
        }
    System.out.println("\nV besedilu se pojavljajo naslednji znaki: " + set);

      }

}
