

public class Practice {
	
	
	
	public static int indexOf(String s, String[] data, int size ) {
		//traverse the oversize array looking for an exact match with s
		for(int i = 0; i < size; i++) {
			if(data[i].equals(s))
				return i; //match found

		}
		//if match found return the index
		
		//not found return -1
		return -1;
		
	}

	

}
