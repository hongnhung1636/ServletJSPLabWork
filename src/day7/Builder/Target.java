package day7.Builder;


import com.sun.media.sound.InvalidDataException;

public class Target
{
    private int targetid;
    private String targetname;
    private String targetaddress;
    private int targetage;
    private String targetcountry;

    public Target (Builder builder ){
        targetid = builder.id;
        targetname = builder.name;
        targetaddress =builder.address;
        targetage = builder.age;
        targetcountry = builder.country;
    }

    private boolean rules() throws InvalidDataException{
        try {
            if (targetid  == 0 || targetname.isEmpty() || targetage < 20 || targetaddress.isEmpty()){
                throw new InvalidDataException();
            }
            else {
                return true;
            }
        }catch (InvalidDataException e){
            e.printStackTrace();
            return false;
        }
    }

    public static class Builder{

        private int id;
        private String name;
        private String address;
        private int age;
        private String country;

        public Builder(int i, String name, String address, int age, String country) {
            this.setId(i);
            this.setName(name);
            this.setAddress(address);
            this.setAge(age);
            this.setCountry(country);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Target build() throws InvalidDataException {
            Target a = new Target(this);
            if (a.rules())
            {
                System.out.println("Object is built");
                return a;
            }
            else
            {System.out.println("Object can't be built");
                return null;
            }

        }
    }



}

