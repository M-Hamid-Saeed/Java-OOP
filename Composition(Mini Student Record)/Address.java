public class Address {
  private String city;
  private String town;
  private String country;
  private PhoneNum phone;
  private String streetAddress;
    

    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String return the town
     */
    public String getTown() {
        return town;
    }

    /**
     * @param town the town to set
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return PhoneNum return the phone
     */
    public PhoneNum getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(PhoneNum phone) {
        this.phone = phone;
    }

    /**
     * @return String return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public Address(String city,String town,String country,String streetAddress,PhoneNum phone)
    {
        setCity(city);
        setCountry(country);
        setPhone(phone);
        setStreetAddress(streetAddress);
        setTown(town);
    }
    public String toString()
    {
        return String.format("%nCountry--> %s%n City --> %s%n Town --> %s%n Street Address--> %s%n----%s",getCountry(),getCity(),getTown(),getStreetAddress(),getPhone());

    }

}
