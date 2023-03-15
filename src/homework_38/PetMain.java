package homework_38;

import homework_38.Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PetMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Pet> pets = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            pets.add(Pet.parsePet(br.readLine()));
        }

        for (Pet pet : pets) {
            System.out.println(pet.getPetString());
        }
    }


}