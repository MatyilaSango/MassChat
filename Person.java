/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masschatui;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Sango
 */
public class Person implements java.io.Serializable {
    String Name;
    String Surname;
    long phoneNumber;
    String userName;
    long passWord;
    long dateOfBirth;
    String gender;
    transient BufferedImage image;
    String ImageAddress;
    Date regDate;
    ArrayList<Contact> ContactList = new ArrayList();
    int Blocked = 1; //'1' means 'Active', '0' means 'Blocked'.
    
    
    public class Contact{
        String Name;
        long pNumber;

        public long getpNumber() {
            return pNumber;
        }   
    }

    public void setContactList(Contact contact) {
        ContactList.add(contact);
    }
    
    public Person(){
    }
    
    public Person(String name, String surname, long dateOfbirth, String username, long password, long phonenumber, String gendr, Date regDate_){
        Name = name;
        Surname = surname;
        dateOfBirth = dateOfbirth;
        userName = username;
        passWord = password;
        phoneNumber = phonenumber;
        gender = gendr;
        regDate = regDate_;
    }
    
    public void imageSet(BufferedImage imag){
        image=imag;
    }
    
    public void Activate_Block(){
        if(Blocked == 1){
            Blocked=0; //Blocked
        }
        else{
            Blocked=1; //Activate
        }
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public long getPassWord() {
        return passWord;
    }

    public String getGender() {
        return gender;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getRegDate() {
        return regDate;
    }

    public int getBlocked() {
        return Blocked;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String getImageAddress() {
        return ImageAddress;
    }

    public void setImageAddress(String ImageAddress) {
        this.ImageAddress = ImageAddress;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(long passWord) {
        this.passWord = passWord;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
