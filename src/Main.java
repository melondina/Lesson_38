public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet(Pet.Kind.DOG, "July", null,0);
        System.out.println(pet.getPetString());
    }
}