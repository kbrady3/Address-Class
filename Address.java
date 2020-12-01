//Kabrina Brady

public class Address {
    //house number, a street, an optional apartment number, a city, a state, and a postal code
    String houseNum;
    String street;
    String aptNum;
    String city;
    String state;
    String zip;

    //House
    public Address(String houseNum, String street, String city, String state, String zip) {
        setHouseNum(houseNum);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    //Condo (includes apartment number)
    public Address(String houseNum, String street, String aptNum, String city, String state, String zip){
        setHouseNum(houseNum);
        setStreet(street);
        setAptNum(aptNum);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    public void print(){
        String houseNum = getHouseNum();
        String street = getStreet();
        String aptNum = getAptNum();
        String city = getCity();
        String state = getState();
        String zip = getZip();

        if (aptNum != null){
            String condo = houseNum + " " + street + " " + aptNum + " " + city + " " + state + " " + zip;
            System.out.println(condo);
        }
        else{
            String house = houseNum + " " + street + " " + city + " " + state + " " + zip;
            System.out.println(house);
        }
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state.length() == 2){
            this.state = state;
        }
        else{
            this.state = null;
            throw new IllegalArgumentException("Object not created.");
        }
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        if (zip.length() == 5){
            this.zip = zip;
        }
        else{
            this.zip = null;
            throw new IllegalArgumentException("Object not created.");
        }
    }
}