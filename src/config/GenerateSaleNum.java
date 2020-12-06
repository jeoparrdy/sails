package config;

public class GenerateSaleNum {
    int fact;
    String number;

    public String SerialNumber(int fact){
        this.fact = fact + 1;
        if ((this.fact>=10000000)&&(this.fact<=100000000)){
            number = "" + this.fact;
        }
        if ((this.fact>=1000000)&&(this.fact<=10000000)){
            number = "0" + this.fact;
        }
        if((this.fact>=100000)&&(this.fact<=1000000)){
            number="00"+this.fact;
        }
        if((this.fact>=10000)&&(this.fact<=100000)){
            number="000"+this.fact;
        }
        if((this.fact>=1000)&&(this.fact<=10000)){
            number="0000"+this.fact;
        }
        if((this.fact>=100)&&(this.fact<=1000)){
            number="00000"+this.fact;
        }
        if((this.fact>=100)&&(this.fact<=1000)){
            number="000000"+this.fact;
        }
        if((this.fact>=10)&&(this.fact<=100)){
            number="0000000"+this.fact;
        }
        if(this.fact<10){
            number="00000000"+this.fact;
        }
        return number;
    }
}
