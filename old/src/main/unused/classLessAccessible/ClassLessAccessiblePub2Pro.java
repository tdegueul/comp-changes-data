package main.unused.classLessAccessible;

public class ClassLessAccessiblePub2Pro {

	public class ClassLessAccessiblePub2ProInner {
		
		public int publicField;
		private int privateField;
		
		public int publicMethod() {
			return 0;
		}
		
		public int privateMethod() {
			return 0;
		}
	}
}
