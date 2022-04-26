import java.time.LocalDateTime;
import java.util.Scanner;

public class MyFest extends Festival implements MyFestActionCallbacks {
    MyFest(Artist[] artists, String name, String cartel, String location, LocalDateTime dateTime, Stage [] stages) {
        super(artists, name, cartel, location, dateTime, stages);
    }


    public void iniciar(){
        Stage [] stages = getStages();
        for(int i = 0; i < stages.length; i++){
            MyScreen myScreen = new MyScreen();
            myScreen.setVisible(true);
            myScreen.setLocation(400*i, 200);
            Artist [] artists  = stages[i].getArtists();
            Runnable run;
            if(i == 0){
                run = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < artists.length; i++) {
                                artists[i].play(myScreen);
                                Thread.sleep(1500);
                                for (int j = 0; j < artists[i].getSongs().length; j++) {
                                    Thread.sleep((long) artists[i].getSongs()[j].getDuration() + 1500);
                                }
                                if (artists[i] == artists[artists.length - 1]) {
                                    Thread.sleep(5000);
                                    myScreen.dispose();
                                }
                            }
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                    }
                };
                myScreen.setAlwaysOnTop(true);
            }
            else{
                run = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < artists.length; i++) {
                                artists[i].play(myScreen, "");
                                Thread.sleep(1500);
                                for (int j = 0; j < artists[i].getSongs().length; j++) {
                                    Thread.sleep((long) artists[i].getSongs()[j].getDuration() + 1500);
                                }
                                if (artists[i] == artists[artists.length - 1]) {
                                    Thread.sleep(5000);
                                    myScreen.dispose();
                                }
                            }
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                    }
                };
            }
            new Thread(run).start();
        }

        }

    @Override
    public void showMessage(Screen screen) {
        screen.setVisible(true);
        String message = String.format("""
                %s
                ------------------
                Lugar: %s
                Fecha: %s-%s-%s
                Hora: %s:%s
                Artistas: """,
                getName(),
                getLocation(),
                getDateTime().getDayOfMonth(),
                getDateTime().getMonth(),
                getDateTime().getYear(),
                getDateTime().getHour(),
                getDateTime().getMinute()
                );
        Artist [] artists = getArtists();
        for(int i = 0; i < artists.length; i++){
            message += artists[i].getName() + ", ";
        }
        message += "\n";
        screen.setBounds(900,0,420, 850);
        screen.out(message, "Times New Roman", 16, Colors.DARK_GRAY);
        screen.showImage(getCartel());
    }

    @Override
    public void personalizar() throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        int opcion;
        Artist[] artists = getArtists();
        String menu = "Cuál artista quieres que comience?(Ingresa el número relacionado con la opción deseada)";
        for (int i = 0; i < artists.length; i++) {
            menu += String.format("\n%d. %s", i + 1, artists[i].getName());
        }
        menu += "\nOpcion: ";
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print(menu);
            opcion = reader.nextInt();
            if (opcion < 1 || opcion > artists.length) {
                System.out.println("Ingrese una opcion valida, por favor");
                Thread.sleep(3000);
            }
        } while (opcion < 1 || opcion > artists.length);
        setFirstArtist(opcion);
        int opc2;
        do {
            System.out.print("Cuantos escenarios quiere que haya (de 1 a 3): ");
            opc2 = reader.nextInt();
        } while (opc2 > 3 || opc2 < 1);
        ponerStages(opc2);
    }

    private void ponerStages(int opc){
        Artist[] artists = getArtists();
        if(opc == 1) { }
        else if(opc == 2) {
            Artist[] art1 = new Artist[artists.length/2];
            Artist[] art2 = new Artist[artists.length- art1.length];
            for(int i = 0; i < art2.length; i++){
                art2[i] = artists[i];
            }
            for(int i = art2.length; i < artists.length; i++){
                art1[i - art2.length] = artists[i];
            }
            Stage[] esc = {
                    new Stage(art2, "Main"),
                    new Stage(art1, "Second")
            };
            setStages(esc);
        }
        else if(opc == 3){
            Artist[] art1 = new Artist[artists.length/3];
            Artist[] art2 = new Artist[artists.length/3];
            Artist[] art3 = new Artist[artists.length- art1.length - art2.length];
            for(int i = 0; i < art3.length; i++){
                art3[i] = artists[i];
            }
            for(int i = art3.length; i < art3.length + art1.length; i++){
                art1[i - art3.length] = artists[i];
            }
            for(int i = art3.length + art1.length; i < artists.length ;i++){
                art2[i - art3.length - art1.length] = artists[i];
            }
            Stage[] esc = {
                    new Stage(art3, "Main"),
                    new Stage(art1, "Second"),
                    new Stage(art2, "Third")
            };
            setStages(esc);
        }

    }

    private void setFirstArtist(int opc){
        Artist [] artists = getArtists();
        Artist temp = artists[0];
        artists[0] = artists [opc - 1];
        artists[opc - 1] = temp;
    }

    @Override
    public void preguntar(Screen screen) throws InterruptedException {
        screen.setVisible(true);
        screen.out("\nTe gustaría personalizar este concierto?\n(responder en terminal)", "Times New Roman", 22, Colors.FussionRed);
        Scanner reader = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("Te gustaría personalizar este concierto? s/n: ");
            respuesta = reader.nextLine();
            switch (respuesta.toLowerCase()) {
                case "s":
                    personalizar();
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Ingrese una respuesta valida, por favor");
            }
        } while (!respuesta.toLowerCase().equals("s") && !respuesta.toLowerCase().equals("n"));
    }
}

