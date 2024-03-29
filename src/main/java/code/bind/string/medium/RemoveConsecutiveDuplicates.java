package code.bind.string.medium;


public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String ist="aabcca";
		String second="AAABBCCDDDEFGH";
		
		char[] secondCharArr=second.toCharArray();
		int n=removeConsChar(secondCharArr);
		for(int i=0;i<n;i++){
			System.out.print(secondCharArr[i]);
		}
	}
	
	public static int  removeConsChar(char[] charArray){
		int index=0;
		int left=0;
		int right=0;
		
		while(right<charArray.length){
			while(right<charArray.length && charArray[left]==charArray[right]){
				right++;
			}
			charArray[index++]=charArray[left];
			left=right;
		}
		
		return index;
	}
}
