public class PhoneNum {
    private int countryCode;
    private int cityCode;
    private int lineNum;

    /**
     * @return int return the countryCode
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return int return the cityCode
     */
    public int getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode the cityCode to set
     */
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return int return the lineNum
     */
    public int getLineNum() {
        return lineNum;
    }

    /**
     * @param lineNum the lineNum to set
     */
    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }
    //Constructor
    public PhoneNum(int countryCode,int cityCode,int lineNum)
    {
        setLineNum(lineNum);
        setCityCode(cityCode);
        setCountryCode(countryCode);
    }
    public String toString()
    {
        return String.format("%nCountry Code --> %5d%n City Code --> %5d%n Line Number --> %5d",getCountryCode(),getCityCode(),getLineNum());

    }
}
