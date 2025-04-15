/**
 * Klasse Ratespiel
 * 
 * @author (Nikola) 
 * @version (2025-03-04)
 */
public class Ratespiel
{
    private static int antwortAnzahl = 40; //Ganzzahlen sind int

    public static void main(String[] args) {
        System.out.println("Wir spielen ein Ratespiel!\n");
        int lenght = 40; // the number should be get dynamically later
        for(int i = 0; i<length; i++){
            antwortVonNummer(i);
            if(i != lenght - 1){
                System.out.println("\n Hier Kommt die nächste Antwort/Frage: ");                            
            }
        } 


        System.out.println("\n Danke fürs Mitspielen");

        //etc. weitere Antworten/Fragen eibauen


        /*  SPOILER BARRIER
        
        
        
        
        
        
        
        
        
        
        */
    }
    
    private static String antwort( int antwortNummer){ //antwortNummer 0 bis 5 -> 6 Antworten sind im "Spiel"
        if(antwortNummer >= 0 && antwortNummer < antwortAnzahl) {
            var antworten = new String[antwortAnzahl];
            antworten[0] = "Oxford University";
            antworten[1] = "Basilica di San Pietro";
            antworten[2] = "Vienna";
            antworten[3] = "Leberkas Pepi";
            antworten[4] = "Rot Weiß Rot";
            antworten[5] = "Albert Einstein";
            antworten[6] = "Paris";
            antworten[7] = "Amazonas";
            antworten[8] = "Mount Everest";
            antworten[9] = "Mars";
            antworten[10] = "George Washington";
            antworten[11] = "William Shakespeare";
            antworten[12] = "China";
            antworten[13] = "Nil";
            antworten[14] = "Pazifik";
            antworten[15] = "Leonardo da Vinci";
            antworten[16] = "Jupiter";
            antworten[17] = "Tesla";
            antworten[18] = "Sahara";
            antworten[19] = "Fußball";
            antworten[20] = "Mount Fuji";
            antworten[21] = "Pablo Picasso";
            antworten[22] = "Ludwig van Beethoven";
            antworten[23] = "Berlin";
            antworten[24] = "Python";
            antworten[25] = "Oktoberfest";
            antworten[26] = "Harvard";
            antworten[27] = "Big Ben";
            antworten[28] = "Rio de Janeiro";
            antworten[29] = "Nelson Mandela";
            antworten[30] = "Eiffelturm";
            antworten[31] = "Currywurst";
            antworten[32] = "Google";
            antworten[33] = "Facebook";
            antworten[34] = "Wolfgang Amadeus Mozart";
            antworten[35] = "Schokolade";
            antworten[36] = "Himalaya";
            antworten[37] = "New York";
            antworten[38] = "Rotkäppchen";
            antworten[39] = "Bitcoin";

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
            fragen[5] = "Wer entwickelte die Relativitätstheorie?";
            fragen[6] = "Hauptstadt von Frankreich?";
            fragen[7] = "Größter Regenwald?";
            fragen[8] = "Höchster Berg der Erde?";
            fragen[9] = "Welcher Planet ist der vierte von der Sonne?";
            fragen[10] = "Wer war der erste Präsident der USA?";
            fragen[11] = "Wer schrieb 'Romeo und Julia'?";
            fragen[12] = "Welches Land hat die meisten Einwohner?";
            fragen[13] = "Längster Fluss der Welt?";
            fragen[14] = "Größter Ozean der Erde?";
            fragen[15] = "Wer malte das letzte Abendmahl?";
            fragen[16] = "Größter Planet im Sonnensystem?";
            fragen[17] = "Welche Firma wurde von Elon Musk gegründet?";
            fragen[18] = "Größte Wüste der Welt?";
            fragen[19] = "Beliebtester Sport der Welt?";
            fragen[20] = "Berühmter Vulkan in Japan?";
            fragen[21] = "Spanischer Maler mit vielen Formen?";
            fragen[22] = "Wer komponierte die 9. Sinfonie?";
            fragen[23] = "Hauptstadt von Deutschland?";
            fragen[24] = "Beliebte Programmiersprache mit Schlange?";
            fragen[25] = "Bekanntes Fest in München?";
            fragen[26] = "Eliteuniversität in den USA?";
            fragen[27] = "Große Uhr in London?";
            fragen[28] = "Brasilianische Stadt mit Christusstatue?";
            fragen[29] = "Kämpfte gegen Apartheid in Südafrika?";
            fragen[30] = "Wahrzeichen von Paris?";
            fragen[31] = "Typisches Berliner Fast-Food?";
            fragen[32] = "Bekannte Suchmaschine?";
            fragen[33] = "Größtes soziales Netzwerk (ehemals)?";
            fragen[34] = "Berühmter Komponist aus Salzburg?";
            fragen[35] = "Süßigkeit aus Kakao?";
            fragen[36] = "Gebirge mit dem Everest?";
            fragen[37] = "Stadt, die nie schläft?";
            fragen[38] = "Märchen mit einem Wolf?";
            fragen[39] = "Bekannteste Kryptowährung?";
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
