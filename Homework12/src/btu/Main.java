package btu;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String language;
        String parameters;
        Scanner input = new Scanner(System.in);
        System.out.print("enter language - (ka, en, ru): ");
        language = input.nextLine();
        System.out.print("enter parameters (ex: p-7-s-1-15-w-7-11): ");
        parameters = input.nextLine();
        String[] params = parameters.split("-");
        int number_of_p = 1,start_number_of_s = 1, end_number_of_s = 1, start_number_of_w = 1, end_number_of_w = 1;
        try {
            number_of_p = Integer.parseInt(params[1]);
        } catch (NumberFormatException ignored){
        }
        if(params[4].equals("w")) {
            try {
                end_number_of_s = Integer.parseInt(params[3]);
            } catch (NumberFormatException ignored) {
            }
            if(params.length == 6) {
                try {
                    end_number_of_w = Integer.parseInt(params[5]);
                } catch (NumberFormatException ignored) {
                }
            }else {
                try {
                    start_number_of_w = Integer.parseInt(params[5]);
                } catch (NumberFormatException ignored) {
                }
                try {
                    end_number_of_w = Integer.parseInt(params[6]);
                } catch (NumberFormatException ignored) {
                }
            }
        }else {
            if (params.length == 7 && params[5].equals("w")) {
                try {
                    start_number_of_s = Integer.parseInt(params[3]);
                } catch (NumberFormatException ignored) {
                }
                try {
                    end_number_of_s = Integer.parseInt(params[4]);
                } catch (NumberFormatException ignored) {
                }
                try {
                    end_number_of_w = Integer.parseInt(params[6]);
                } catch (NumberFormatException ignored) {
                }
            }
        }
        if (params.length == 8) {
            try {
                start_number_of_s = Integer.parseInt(params[3]);
            } catch (NumberFormatException ignored) {
            }
            try {
                end_number_of_s = Integer.parseInt(params[4]);
            } catch (NumberFormatException ignored) {
            }
            try {
                start_number_of_w = Integer.parseInt(params[6]);
            } catch (NumberFormatException ignored) {
            }
            try {
                end_number_of_w = Integer.parseInt(params[7]);
            } catch (NumberFormatException ignored) {
            }
        }
        String alphabet = switch (language) {
            case "en" -> "abcdefghijklmnopqrstuvwxyz";
            case "ru" -> "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            default -> "აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ";
        };
        for(int i=0; i<number_of_p; i++) {
            generate_words(start_number_of_s, end_number_of_s, start_number_of_w, end_number_of_w, alphabet);
        }

    }
    public static void  generate_words(int start_number_of_s,int end_number_of_s, int start_number_of_w, int end_number_of_w, String alphabet) {
        Random random = new SecureRandom();
        int rand_length_of_sentence = random.nextInt(end_number_of_s - start_number_of_s + 1) + start_number_of_s;
        StringBuilder sentence = new StringBuilder();
        for(int i=0; i < rand_length_of_sentence; i++) {
            int rand_length_of_word = random.nextInt(end_number_of_w - start_number_of_w + 1) + start_number_of_w;
            StringBuilder sb = new StringBuilder(rand_length_of_word);
            for(int j=0; j < rand_length_of_word; j++){
                sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            sentence.append(sb).append(" ");
        }
        System.out.println(sentence);
    }
}