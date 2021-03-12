package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	public static final Pattern VALID_EMAIL_PHONE_REGEX = Pattern.compile("\\(?(84)\\)?([ .-]?)([0-9]*)",
			Pattern.CASE_INSENSITIVE);

	public static boolean validateEmail(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}
	public static boolean validatePhone(String phone) {
		if(phone.length() >15  || phone.length() < 8 ) return false;
		Matcher matcher = VALID_EMAIL_PHONE_REGEX.matcher(phone);
		return matcher.find();
	}
}
