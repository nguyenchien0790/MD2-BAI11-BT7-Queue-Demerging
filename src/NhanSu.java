public class NhanSu {
    private String name;
    private String genDer;
    private int dateOfBirth;

    public NhanSu() {
    }

    public NhanSu(String name, String genDer, int dateOfBirth) {
        this.name = name;
        this.genDer = genDer;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenDer() {
        return genDer;
    }

    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "NhanSu{" +
                "name='" + name + '\'' +
                ", genDer='" + genDer + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
