/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bingo;

/**
 *
 * @author Asus
 */
public class Bingo {
    private String name;

    // buat  konstruktornya
    public Bingo(String name) {
        this.name = name;
        singSong();
    }

    // method buat cetak lagu
    private void singSong() {
        String[] bingo = {"B", "I", "N", "G", "O"};
        
        // buat perulangan bersarang
        for (int clapCount = 0; clapCount <= bingo.length; clapCount++) {
            // bagian pembukanya
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And " + name + " was his name-o.");

            // 3 baris lirik utamanya
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < bingo.length; j++) {
                    if (j < clapCount) {
                        System.out.print("(clap)");
                    } else {
                        System.out.print(bingo[j]);
                    }

                    // kasih "-" hanya kalau bukan huruf terakhir
                    if (j < bingo.length - 1) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

            // penutup lirik
            System.out.println("And " + name + " was his name-o.\n");
        }
    }
}
