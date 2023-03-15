public class pet {

    enum Kind {
        DOG,
        CAT,
        OTHER,
    }

    final private Kind kind;
    private String name;
    private String birth;
    private double weight;

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

    public static pet parsePet(String line) {
        String[] parts = line.split(",");
        String kind = parts[0];
        String name = parts[1];
        double weight = parts.length > 2 ? Double.parseDouble(parts[2]) : 0.0;
        String birth = parts.length > 3 ? parts[3] : null;
        return new pet(kind, name, birth, weight);
    }

    public static Kind parseKind(String line) {
        try {
            return Kind.valueOf(line.toUpperCase())
        } catch (IllegalArgumentException e) {
            return Kind.OTHER;
        }
    }
}
