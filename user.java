
import java.util.*;

public class user {
	private String userID;
    private int username;
    private String useremail;
    private String password;
    private int gender;
    private String country;

}
public user() {
	username = "";
	userID = 0;
	useremail = "";
	password ="";
	gender="";
	country="";
}
public user (String n , int id, String ema){
	Name = n ;
	ID = id ;
	Email = ema;
}
public user (user b){
	this.username=b.username;
	this.userID=b.userID;
	this.Email=b.Email;
}
