class Calculator {

String brandname;

int price;

String type;

Calculator ()
{

this.brandname= brandname;



this.price= price;

this.type = type;

}
int subtraction(int a, int b, int c){

int sub =a-b-c;

return sub;
}

int subtraction(int a, int b){

int total =a-b;

return total;
}

double subtraction (int d, double e){

double total= d-e;

return total;
}

public static void main(String[] args){


Calculator c = new Calculator();

int ad = 10;

int bd = 15;


int cd=25;

int res= c.subtraction(ad, bd, cd); 
System.out.println(res);



int kl = 70;

int mn = 20;

int tot =c.subtraction(kl, mn);

System.out.println(tot);
int k=65;
doble l=55;
double subst=c.substraction(k,l);
System.out.println(subst);
}
}