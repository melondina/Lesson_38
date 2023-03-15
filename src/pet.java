public class pet {

    enum Kind {
        DOG,
        CAT,
        OTHER,
    }

    Kind kind;
    String name;
    String birth;
    double weight;

    public pet(Kind kind, String name, String birth, double weight) {
        this.kind = kind;
        this.name = name;
        this.birth = birth;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Kind getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public double getWeight() {
        return weight;
    }
}
