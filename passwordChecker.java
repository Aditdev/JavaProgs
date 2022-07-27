class passwordChecker {
	public static boolean isValidPassword(String password) {
		boolean flag = false;
		String regex = "[A-Za-z]{8,10}[^A-Za-z0-9]{2,}{2,[0-9]{4}";

		if (password.matches(regex)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		String password = "gftdrstr8645";
		System.out.println("The password of the customer is " + password);
		if (isValidPassword(password))
			System.out.println("The password is valid!");
		else
			System.out.println("The password is not valid!");
	}
}