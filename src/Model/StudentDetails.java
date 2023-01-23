/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 91887
 */
public class StudentDetails {
    String NUID;
    String FirstName;
    String LastName;
    String CollegeName;
    long PhoneNo;
    String EmailId;
    long PPhoneNo;
    String PEmailId;
    String StreetName;
    int  AptNo;
    String City;
    String ZipCode;
    String PStreetName;
    int  PAptNo;
    String PCity;
    String PZipCode;

  
    public StudentDetails(){
        this.NUID = "";
        this.FirstName = "";
        this.LastName = "";
        this.CollegeName = "";
        this.PhoneNo = 0L;
        this.EmailId = "";
        this.PPhoneNo = 0L;
        this.PEmailId = "";
        this.StreetName = "";
        this.AptNo = 0;
        this.City = "";
        this.ZipCode = "";
        this.PStreetName = "";
        this.PAptNo = 0;
        this.PCity = "";
        this.PZipCode = "";
    
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

    public long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(long PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public long getPPhoneNo() {
        return PPhoneNo;
    }

    public void setPPhoneNo(long PPhoneNo) {
        this.PPhoneNo = PPhoneNo;
    }

    public String getPEmailId() {
        return PEmailId;
    }

    public void setPEmailId(String PEmailId) {
        this.PEmailId = PEmailId;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public int getAptNo() {
        return AptNo;
    }

    public void setAptNo(int AptNo) {
        this.AptNo = AptNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getPStreetName() {
        return PStreetName;
    }

    public void setPStreetName(String PStreetName) {
        this.PStreetName = PStreetName;
    }

    public int getPAptNo() {
        return PAptNo;
    }

    public void setPAptNo(int PAptNo) {
        this.PAptNo = PAptNo;
    }

    public String getPCity() {
        return PCity;
    }

    public void setPCity(String PCity) {
        this.PCity = PCity;
    }

    public String getPZipCode() {
        return PZipCode;
    }

    public void setPZipCode(String PZipCode) {
        this.PZipCode = PZipCode;
    }

    
   
}
