package DivideAndConquer;

public class MajorityElement {
    public static void main(String[] args) {

        System.out.println(maj(new int[]{2,3,2}));
    }
    public static int maj(int []a){

        return majority(a,0,a.length-1);
    }
    public static int majority(int[] a , int l , int r ){
        if(l==r){
            return a[l];
        }
        int mid = (l+r)/2;
        int ml = majority(a,l,mid);
        int mr = majority(a,mid+1,r);
        if (ml==mr){
            return ml;
        }
        int cntL = 0 , cntR = 0;
        for (int i = l; i<=r ; i++){
            if(a[i]==ml) cntL++;
            if(a[i]==mr) cntR++;
        }
        if(cntL>cntR){
            return ml;
        }

        return mr;


    }
}
