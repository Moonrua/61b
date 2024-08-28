
public class IntList {
    public int first;
    public IntList last;

    public IntList(int a,IntList b) {
        first = a;
        last = b;
    }

    public int size(){
        if(last == null){
            return 1;
        }
        return 1+this.last.size();
    }

    public int size_it(){
        IntList p = this;
        int tot = 0;
        while(p != null){
            tot += 1;
            p = p.last;
        }

        return tot;
    }

    public Integer get(int p){
        if(p==1){
            return first;
        }
        return last.get(p-1);
    }

    public Integer get_it(int p){
        int tmp=0;
        IntList ptr = this;
        while(p!=0){
            p-=1;
            tmp=ptr.first;
            ptr=ptr.last;
        }
        return tmp;
    }

    public static void main(String[] args) {
        IntList L = new IntList(1,null);
        L = new IntList(2,L);
        L = new IntList(3,L);

        System.out.println(L.size());
        System.out.println(L.size_it());
        System.out.println(L.get_it(1));
        System.out.println(L.get_it(3));
    }
}
