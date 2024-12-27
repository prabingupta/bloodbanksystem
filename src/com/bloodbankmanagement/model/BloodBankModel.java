
package com.bloodbankmanagement.model;

/**
 *
 * @author prabinkumargupta
 */
public class BloodBankModel {
    private int donorId;
    private String donorfullname;
    private short age;
    private String contact;
    private String bloodgroup;
    private String address;
    private String email;
    private String gender;
    
    public BloodBankModel() {
        
    }
    // constructor
    public BloodBankModel(int donorId, String donorfullname, short age,String contact,String bloodgroup,String address, String email,String gender) {
        this.donorId = donorId;
        this.donorfullname = donorfullname;
        this.age = age;
        this.contact = contact;
        this.bloodgroup = bloodgroup;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }
     public int getDonorId(){
         return donorId;
     }
     
     public void setDonorId(int donorId){
         this.donorId = donorId;
     }
     
     public String getDonorFullname(){
         return donorfullname;
     }
     
     public void setDonorfullname(String donorfullname){
         this.donorfullname = donorfullname;
     }
     
     public short getAge(){
         return age;
     }
     
     public void setAge(short age){
         this.age = age;
      }
        
      public String getContact(){
         return contact;
     }
     
     public void setMobilenumber(String contact){
         this.contact= contact;
      }
        
    
      public String getBloodgroup(){
         return bloodgroup;
     }
     
     public void setAge(String bloodgroup){
         this.bloodgroup = bloodgroup;
      }
        
     public String getAddress(){
         return address;
     }
     
     public void setAddress(String address){
         this.address = address;
      }
    
     public String  getEmail(){
         return email;
     }
     
     public void setEmail(String email){
         this.email= email;
      }
     
      public String getGender(){
         return gender;
     }
     
     public void setGender(String gender){
         this.gender = gender;
      }
        
              
    }

