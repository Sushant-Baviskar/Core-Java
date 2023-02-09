package OOPs;

enum Days {
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday;

	public static void main(String[] args) {
		for(Days d:Days.values())
		{
			System.out.println(d);
		}
		
		System.out.println("Index of Monday is "+ Days.valueOf("Monday"));
		System.out.println("Index of Monday is "+ Days.valueOf("Monday").ordinal());
	}

}
