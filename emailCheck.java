class emailCheck {
	public static boolean isValidEmail(String email) {
		boolean flag = false;
		String regex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in|edu.*)";

		if (email.matches(regex)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		String email = "BaburaoApte@StarGarage.in";
		System.out.println("The Email Id of the customer is " + email);
		if (isValidEmail(email))
			System.out.println("The Email Id is valid!");
		else
			System.out.println("The Email Id is invalid!");
	}
}