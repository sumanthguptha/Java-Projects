
public class Datatypes {

	public static void main(String[] args) {
			int a=57;// it is an expression and int is a datatype
			System.out.println(a);
			
			// order of datatypes in value storages 
			byte v1=91;			//	 max value to be stored 127 beyond that it shows error range(-127 to 128)
			short v2=34000;		//	 2 bytes,range b/w (-32768 to 32767)
			char v5='A';	//2 bytes	upto here integer datatypes
			int v3=123456;		//	 4 bytes b/w(-2147483648 to 2147483647)
			long v4=2184598		//	 8 bytes 
			
			float v6=4500.00F;	//4 bytes value is highest datatype when compared with long
			//1.0E20 it means 10 to the power of 20 so it is considered as highest value storaged in float than long
			
			double v7=4500.00;  //8 bytes value is higher than float 
			
			boolean v8=true;	// 1 byte
					
			System.out.println(Long.MIN_value);
			
	}

}
