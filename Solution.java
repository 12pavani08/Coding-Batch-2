class Solution {
    public int compress(char[] chars) {
        int indexResult=0,index=0;
        while (index < chars.length){
            char ch=chars[index];
            int count=1;
            while(index +1<chars.length&&chars[index + 1]==ch){
                index++;
                count++;
                
            }
            chars[indexResult++]=ch;
            index++;
            if(count == 1) continue;
            for(char c:String.valueOf(count).toCharArray()){
                chars[indexResult++]=c;
            }
        }
        
        return indexResult;
    }
}
