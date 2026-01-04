package JDBC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	// ID VALIDATION

	public static Error ID(int s) {

		String id = s + "";
		if (id.length() > 5)

			return new Error(true, "ID length should not be Greater than 5");

		for (int i = 0; i < id.length(); i++) {

			if (id.charAt(i) < '0' || id.charAt(i) > '9')

				return new Error(true, "ID must be in Digits");

		}

		return new Error(false, "");

	}

	// NAME VALIDATION

	public static Error Name(String name)

	{

		if (name.length() < 3)
			return new Error(true, "Name must have a minimum legth of 3");
		for (int i = 0; i < name.length(); i++)

		{

			if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))
				continue;
			else
				return new Error(true, "Name must be characters(Alphabets)");

		}

		return new Error(false, "");

	}

	// MARKS VALIDATIONs

	public static Error Mark(int[] arr) {

		boolean f = true;

		for (int i = 0; i < arr.length; i++)

		{

			String k = arr[i] + "";

			int val = 0;

			for (int j = 0; j < k.length(); j++) {

				if (k.charAt(j) < '0' || k.charAt(j) > '9')
					return new Error(true, "Marks should be in Digits");

				else if (f && k.charAt(j) == '0')
					continue;

				else {
					f = false;
					val += (Math.pow(10, (k.length() - j - 1)) * (k.charAt(j) - '0'));
				}

			}

			if (val > 100)
				return new Error(true, "Marks should not be Greater than 100");

		}

		return new Error(false, "");

	}

//PASSWORD VALIDATION

	public static Error Password(String Pwd)

	{

		String regex_dig = "^(?=.*[0-9])", regex_lower = "(?=.*[a-z])";

		String regex_upper = "(?=.*[A-Z])", regex_len = ".{8,20}";

		Pattern p_dig = Pattern.compile(regex_dig);

		Pattern p_lower = Pattern.compile(regex_lower);

		Pattern p_upper = Pattern.compile(regex_upper);

		Pattern p_len = Pattern.compile(regex_len);

		Matcher m1 = p_dig.matcher(Pwd);

		Matcher m2 = p_lower.matcher(Pwd);

		Matcher m3 = p_upper.matcher(Pwd);

		Matcher m4 = p_len.matcher(Pwd);

		if (!m1.matches())
			return new Error(true, "Atleast 1 digit should be in Password");

		if (!m2.matches())
			return new Error(true, "Atleast 1 Lower_case should be in password");

		if (!m3.matches())
			return new Error(true, "Atleast 1 Upper_case should be in password");

		if (!m4.matches())
			return new Error(true, "Password Length must be in the range of [8 - 20]");

		return new Error(false, "");

	}

}
