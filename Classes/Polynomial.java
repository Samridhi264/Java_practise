
public class Polynomial {


    private int dynamicArray[];
    int nextIndex;
    public Polynomial()
    {
        dynamicArray=new int[1];
        nextIndex=0;
    }
    private void doubleArray(int degree)
    {
        int temp[]=this.dynamicArray;
        this.dynamicArray=new int [degree+1];
        for(int i=0;i<temp.length;i++)
            this.dynamicArray[i]=temp[i];
        this.nextIndex=this.dynamicArray.length;
    }
    public void setCoefficient(int degree, int coeff){
        if(nextIndex<=degree)
            doubleArray(degree);
        this.dynamicArray[degree]=coeff;
    }
   
    public void print(){
        for(int i=0;i<this.dynamicArray.length;i++)
        {
            if(this.dynamicArray[i]!=0)
                System.out.print(this.dynamicArray[i]+"x"+i+" ");
        }
    }
  
    public Polynomial add(Polynomial p){
        int max=(this.nextIndex>p.nextIndex)?this.nextIndex:p.nextIndex;
        int temp[]=new int[max];
        for(int i=0;i<this.nextIndex;i++)
            temp[i]=this.dynamicArray[i];
        for(int i=0;i<p.nextIndex;i++)
            temp[i]=temp[i]+p.dynamicArray[i];
        Polynomial p2=new Polynomial();
        p2.doubleArray(max);
        p2.dynamicArray=temp;
        return p2;
    }
   
    public Polynomial subtract(Polynomial p){
        int max=(this.nextIndex>p.nextIndex)?this.nextIndex:p.nextIndex;
        int temp[]=new int[max];
        for(int i=0;i<this.nextIndex;i++)
            temp[i]=this.dynamicArray[i];
        for(int i=0;i<p.nextIndex;i++)
            temp[i]=temp[i]-p.dynamicArray[i];
        Polynomial p2=new Polynomial();
        p2.doubleArray(max);
        p2.dynamicArray=temp;
        return p2;
    }
    
    public Polynomial multiply(Polynomial p){
        int max=this.nextIndex+p.nextIndex;
        int temp[]=new int[max];
        int i=0,j=0;
        for(i=0;i<this.nextIndex;i++)
        {
            if(this.dynamicArray[i]!=0)
                for(j=0;j<p.nextIndex;j++)
                {
                    if(p.dynamicArray[j]!=0)
                    {
                        temp[i+j]=this.dynamicArray[i]*p.dynamicArray[j]+temp[i+j];
                    }
                }
        }
        Polynomial p2=new Polynomial();
        p2.doubleArray(max);
        p2.dynamicArray=temp;
        return p2;
    }

}
