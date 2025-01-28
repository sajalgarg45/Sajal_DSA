package JAVA10_Recursion;

/*
if arr[start]<=arr[mid] -> that part is sorted

case 1)
    now check if key>=arr[start] and key<=[mid]
    end = mid-1
else start = mid+1

case 2)
if key>=arr[mid] and key<=arr[end]
start = mid+1
    else end = mid-1
 */

public class JAVA10_RotatedBS {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        int target = 4;
        Search(arr,target,0,arr.length-1);
        System.out.println(Search(arr,target,0,arr.length-1));
    }
    static int Search(int[]arr, int target,int s , int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr [mid]){
                Search(arr,target,s,mid-1);
            }
            else{
                return Search(arr,target,mid+1, e);
            }
        }
        if (target>=arr[mid] && target<=arr[e]){
            return Search(arr,target,mid+1,e);
        }
        else{
            return Search(arr,target,s,mid-1);
        }
    }
}
