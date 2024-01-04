package com.crudOpe.payload;

public class ReservationRequest {
private long flightId;
private String firstName;
private String lastName;
private String middleName;
private String email;
private String phone;
private String nameOfTheCard;
private String cardNumber;
private String cvv;
private String expiryDate;
public long getFlightId() {
return flightId;
}
public void setFlightId(long flightId) {
this.flightId = flightId;
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public String getMiddleName() {
return middleName;
}
public void setMiddleName(String middleName) {
this.middleName = middleName;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}
public String getNameOfTheCard() {
return nameOfTheCard;
}
public void setNameOfTheCard(String nameOfTheCard) {
this.nameOfTheCard = nameOfTheCard;
}
public String getCardNumber() {
return cardNumber;
}
public void setCardNumber(String cardNumber) {
this.cardNumber = cardNumber;
}
public String getCvv() {
return cvv;
}
public void setCvv(String cvv) {
this.cvv = cvv;
}
public String getExpiryDate() {
return expiryDate;
}
public void setExpiryDate(String expiryDate) {
this.expiryDate = expiryDate;
}
}