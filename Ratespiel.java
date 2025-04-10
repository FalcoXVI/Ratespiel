/**
 * Klasse Ratespiel
 * 
 * @author (Nikola) 
 * @version (2025-03-04)
 */
public class Ratespiel
{
    private static int antwortAnzahl = 5; //Ganzzahlen sind int 

    public static void main(String[] args) {
        System.out.println("Wir spielen ein Ratespiel!\n");
        antwortVonNummer(0);
        System.out.println("\n Hier Kommt die nächste Antwort/Frage: ");
        antwortVonNummer(1);
        System.out.println("\n Hier Kommt die nächste Antwort/Frage: ");
        antwortVonNummer(2);
        System.out.println("\n Hier Kommt die nächste Antwort/Frage: ");
        antwortVonNummer(3);
        System.out.println("\n Hier Kommt die nächste Antwort/Frage: ");
        antwortVonNummer(4);
        System.out.println("\n Danke fürs Mitspielen");

        //etc. weitere Antworten/Fragen eibauen
    }
    
    private static String antwort( int antwortNummer){ //antwortNummer 0 bis 5 -> 6 Antworten sind im "Spiel"
        if(antwortNummer >= 0 && antwortNummer < antwortAnzahl) {
            var antworten = new String[antwortAnzahl];
            antworten[0] = "Oxford University";
            antworten[1] = "Basilica di San Pietro";
            antworten[2] = "Vienna";
            antworten[3] = "Leberkas Pepi";
            antworten[4] = "Rot Weiß Rot";

            return antworten[antwortNummer]; //Ziel
        } else {
            return "Für diese antwortNummer "+ antwortNummer + " gibt es noch keine Antwort";
        }
    } 

    private static String frage(int antwortNummer) {// neu Hilfsmethode 
        // var antwortAnzahl = 5; //Wird durch Klassenvariable ersetzt
        if (antwortNummer >= 0 && antwortNummer < antwortAnzahl) { //zumindest 0 oder hrößer als 5
            var fragen = new String[antwortAnzahl]; // ein Array für 6 Elemente

            fragen[0] = "Welche ist die berühmteste Universitet";
            fragen[1] = "Welche ist die größte Kathedrale der Welt";
            fragen[2] = "Wien auf Englisch?";
            fragen[3] = "Lokal in Wien?";
            fragen[4] = "Die Farben der Österreichischen Flagge";
            //TODO weitere Fragen

            return fragen[antwortNummer]; //z.B. 0, 1, 2 etc.
        }else{ //wenn antwort Negativ oder nicht vorhanden
            return "Für diese antwort gibt es noch keine Frage";  
        }
    }
    //Hilfsmethode
    private static void fragenUndWarten()
    {
        var startZeit = System.currentTimeMillis();
        var endeZeit = startZeit + 10000; // 10 Sekunden dazuzählen zur Startzeit

        //System.currentTimeMillis() > endeZeit // dann soll die Antwort ausgegeben werden

        while(System.currentTimeMillis() < endeZeit) // wiederhole Solange bis
        {
            // warten und nachfragen ob, schon 10 Sekunden vergangen sind
        }
    }

    private static void fragenUndAntworten()
    {
        var startZeit = System.currentTimeMillis();
        var endeZeit = startZeit + 10000; // 10 Sekunden dazuzählen zur Startzeit

        //System.currentTimeMillis() > endeZeit // dann soll die Antwort ausgegeben werden

        while(System.currentTimeMillis() < endeZeit) // wiederhole Solange bis
        {
            // warten und nachfragen ob, schon 10 Sekunden vergangen sind
        }
    }

    private static void antworten(){
        System.out.println("Alle Antworten");
        int i = 0;
        while (i < antwortAnzahl) {
            System.out.println( antwort(i));
            i++;
        }
    }

    private static void Fragen(){
        //while-schleife
        System.out.println("Alle Fragen: ");
        var i = 0; //neue bei einem index Array beginne ich? -< index
        while( i < antwortAnzahl) { //neu lange soll wiederholt werden? bis i maximal den Wert 5 hat --> größter Index im Array
            System.out.println( frage(i)); //im ersten Schleifendurchlauf hat i den Wert 0
            i = i + 1; //die Index-Variable wird um 1 erhöht
            // im 2. Schleifendurchlauf hat i den Wert 1
        }
    }
    //Das spiel
    private static void antwortVonNummer(int antwortNummer) {
        if (antwortNummer >= 0 && antwortNummer < antwortAnzahl){
                System.out.println(antwort(antwortNummer));
                fragenUndWarten();
                System.out.println(frage(antwortNummer));
            } else {
                System.out.println("Für diese antwortNummer " + antwortNummer + " gibt es keine Frage");
            }
    }
}
