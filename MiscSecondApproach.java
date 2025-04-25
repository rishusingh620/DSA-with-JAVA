public class MiscSecondApproach {


        static int[] reverseArray(int[]arr){

            int n=arr.length;
            int[]ans=new int[n];
            int i=n-1,j=0;
            while(i>=0){
                ans[j++]=arr[i--];

            }
            return ans;
        }

        public static void main(String[] args) {

            int[]arr={1,2,3,4,5};
            int[]ans=reverseArray(arr);

            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]+" ");
            }
        }

    }
