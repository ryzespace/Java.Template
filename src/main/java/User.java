public class User {
    private String email;
    private String password;
    private String confirmPassword;
    private String ConfirmPassword;
    private String phoneNumber;
    private String birthDate;
    private String street;
    private String postalCode;
    private String country;
    private String language;
    private boolean newsletterEmail;
    private boolean isNewsletterSms;
}

//Gettery & Settery

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public String getPassword() { return password ; }
public void setPassword(String password) { this.password = password; }


public String getConfirmPassword() { return confirmPassword; }
public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }

public String getPhoneNumber() { return phoneNumber; }
public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

public String getBirthDate() { return birthDate; }
public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

public String getStreet() { return street; }
public void setStreet(String street) { this.street = street; }

public String getPostalCode() { return postalCode; }
public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

public String getCountry() { return country; }
public void setCountry(String country) { this.country = country; }

public String getLanguage() { return language; }
public void setLanguage(String language) { this.language = language; }

public boolean isNewsletterEmail() { return newsletterEmail; }
public void setNewsletterEmail(boolean newsletterEmail) { this.newsletterEmail = newsletterEmail; }


public boolean isNewsletterSms() { return newsletterSms; }
public void setNewsletterSms(boolean newsletterSms) { this.newsletterSms = newsletterSms; }