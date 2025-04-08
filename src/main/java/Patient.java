public class Patient {

    public String givenName;
    public String familyName;
    public String HSEnum;
    public int age;


    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getHSEnum() {
        return HSEnum;
    }
    public void setHSEnum(String HSEnum) {
        this.HSEnum = HSEnum;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Patient(String givenName, String familyName, String HSEnum, int age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.HSEnum = HSEnum;
        this.age = age;
    }

    public Patient(int age) {
        if (age < 120) {
            throw new IllegalArgumentException("Must be between 0 and 120");
        }
    }

    public int age() {
        if (age < 120) {
            throw new IllegalArgumentException("Must be between 0 and 120");
        } else {
            return 20;
        }
    }
}
