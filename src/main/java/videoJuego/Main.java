package videoJuego;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<VideoJuego> listaVideo= new ArrayList<VideoJuego>();

        VideoJuego video1= new VideoJuego(123, "Super Mario 64","Nintendo 64", 2, "rol");
        VideoJuego video2= new VideoJuego(124, "CCGo","Nintendo 63", 2, "rol");
        VideoJuego video3= new VideoJuego(125, "The Legend of Zelda","Nintendo 64", 1, "rol");
        VideoJuego video4= new VideoJuego(126, "Hallo","Nintendo 63", 2, "roles");
        VideoJuego video5= new VideoJuego(127, "Mario Kart 64","Nintendo 64", 1, "roles");

        listaVideo.add(video1);
        listaVideo.add(video2);
        listaVideo.add(video3);
        listaVideo.add(video4);
        listaVideo.add(video5);
    //recorremos la lista
        for (VideoJuego video: listaVideo
             ) {
            System.out.println("Titulo: " + video.getTitulo()+" "+ "Consola: " + video.getConsola() +" "+ "Cant jugadores: "
                    + video.getCantidadJugadores());
        }

   //cambio de nombre y jugadores

        video1.setTitulo("Banjo-Kazooie");
        video1.setCantidadJugadores(4);
        video5.setTitulo("GoldenEye 007");
        video5.setCantidadJugadores(10);

    //recorremos para consola nintendo 64
        for (VideoJuego video: listaVideo
        ) {
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }
    }
}