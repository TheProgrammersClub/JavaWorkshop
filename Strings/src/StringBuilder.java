class StringBuilderExample{  
	
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");now original string is changed  
		System.out.println(sb);prints Hello Java  
	}  
}  

class StringBuilderExample{  
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");now original string is changed  
		System.out.println(sb);prints HJavaello  
	}  
}  

class StringBuilderExample{  
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);prints HJavalo  
	}  
}  

class StringBuilderExample{  
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello");  
		sb.reverse();  
		System.out.println(sb);prints olleH  
	}  
}  

class StringBuilderExample{  
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}  
}  