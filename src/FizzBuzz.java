public class FizzBuzz {
    public class Solution {
        public List<String> fizzBuzz(int n) {

            List listOfStrings = new ArrayList<String>();

            for(int i = 1 ; i <= n ; i ++){
                if( i % 3 == 0 && i % 5 == 0 ){
                    listOfStrings.add("FizzBuzz");
                }
                else if( i % 3 == 0 ){
                    listOfStrings.add("Fizz");
                }
                else if(i % 5 ==0){
                    listOfStrings.add("Buzz");
                }
                else {
                    listOfStrings.add(String.valueOf(i));
                }
            }
            return listOfStrings;
        }
    }
}
