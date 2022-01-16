public class PhoneNumber{
  private int countryCode;
  private int cityCode;
  private int lineNumber;

public void setcityCode(int cityCode){
    this.cityCode=cityCode;
}
public int getcityCode(){
    return this.cityCode;
}
public void setcountryCode(int countryCode){
    this.countryCode=countryCode;
}
public int getcountryCode(){
return this.countryCode;
}
public void setlineNumber(int lineNumber){
    this.lineNumber=lineNumber;
}
public int getlineNumber(){
return this.lineNumber;
}
//constructor
public PhoneNumber(int countryCode,int lineNumber,int cityCode){
    setcityCode(cityCode);
    setcountryCode(countryCode);
    setlineNumber(lineNumber);
}

}