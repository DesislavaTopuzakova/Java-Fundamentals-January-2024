package songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //логиката на задачата -> входни данни, алгоритми, изходни данни
        Scanner scanner = new Scanner(System.in);
        int countSongs = Integer.parseInt(scanner.nextLine()); //брой песните
        List<Song> songsList = new ArrayList<>();

        for (int count = 1; count <= countSongs; count++) {
            String data = scanner.nextLine(); //"{typeList}_{name}_{time}"
            String[] songData = data.split("_");
            //"{typeList}_{name}_{time}".split("_") -> ["{typeList}", "{name}", "{time}"]
            String typeList = songData[0]; //плейлиста на песента
            String name = songData[1]; //име на песента
            String time = songData[2]; //времетраенето на песента

            //ПЕСЕН
            Song song = new Song(typeList, name, time);

            //добавям песента към списъка с въведени песни
            songsList.add(song);
        }

        //пълен списък с въведените песни

        String command = scanner.nextLine();
        //1. all -> имената на всички песни в листа
        //2. име на плейлист -> имената на всички песни в плейлиста
        if (command.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            //command е име на плейлист
            for (Song song : songsList) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
