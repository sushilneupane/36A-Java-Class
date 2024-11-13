public class OperatorClass{
    public static void main(String[]args){
        /*Arithematic operators
         * +,_,*,/,%
         */
        int intVar1=10,intVar2=20;
        int addOper=intVar1+intVar2; //10+20
        int minusOper=intVar1-intVar2; //10-20
        int miltOper=intVar1*intVar2;  //10*20
        int divOper=intVar1/intVar2; // 10/20
        int modOper=intVar1%intVar2; //10%20

        //Assignment operators
        int assignVar=10;
        assignVar+=10; //10+10
        assignVar-=10;//20-10
        assignVar*=2;//10*2
        assignVar/=5;//20/5
        assignVar%=2;//4%2

    //unary operators
        int unaryVar=20;
        unaryVar++;//unaryVar+=1; 20+1;21
        unaryVar--;//unaryvar-=1; 20-1=19

    //Relational Operators
        int realVar1=20,relVar2=30;
        boolean equalOper=realVar1 == realVar2;//realVar1==realVar2?
        boolean greaterOper=realVar1 > realVar2;//realVar1>realVar2?
        boolean lessEqualOper=realVar1 <= realVar2;//realVar1<=realVar2?
        boolean notEqualOper=realVar1 != realvar2;//realVar1!=realVar2?

    //Logical operators
        int logVar1=10, logVar2=20, logVar3=20;
        boolean andOper = true&&true;
        boolean andOperVar=(logVar1<logvar2)&&(logVar1==logVar2);//20<30 true,20==30 not true(false)
        boolean orOper=true||false;
        boolean orOperVar=(logVar1<logVar2) || (logVar1==logVar3);
        boolean notOper=!(logVar1<logVar2);//!true=false
    /*Ternary Operators
    string status;
    int marking =40;
    if(marking > 40);
    status = "fail";
    */
    int marking=40;
    String status = (marking>40) ? "Pass" : "Fail";
    System.out.println("Status :"+status);

    
    }
}