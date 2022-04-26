public class Artist extends Artista implements ArtistActionCallbacks{
    Artist(String name, String genre, Song[] songs) {
        super(name, genre, songs);
    }

    @Override
    public void play(MyScreen myScreen) throws InterruptedException {
        Song [] songs = getSongs();
        Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i < songs.length; i++) {
                            myScreen.getContentPane().removeAll();
                            myScreen.repaint();
                            myScreen.setTitle(String.format("%s - %s",getName(),songs[i].getName()));
                            double any = myScreen.showVid(songs[i]);
                            songs[i].setDuration(any);
                            Thread.sleep((long) songs[i].getDuration());
                        }

                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }

                }
            };
            Thread runs = new Thread(run);
            runs.start();
        }

    public void play(MyScreen myScreen, String s) throws InterruptedException {
        Song [] songs = getSongs();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < songs.length; i++) {
                        myScreen.getContentPane().removeAll();
                        myScreen.repaint();
                        myScreen.setTitle(String.format("%s - %s",getName(),songs[i].getName()));
                        double any = myScreen.showVid(songs[i],"");
                        songs[i].setDuration(any);
                        Thread.sleep((long) songs[i].getDuration());
                    }

                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

            }
        };
        Thread runs = new Thread(run);
        runs.start();
    }
}

