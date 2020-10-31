package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public Money() {
        hryvnia = 3;
        kopecks = 5;
    }

    public Money(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public Money(long hryvnia, byte kopecks) {
        this.kopecks = kopecks;
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }
    public Money addition(Money that)
    {
        Money res=new Money();

        if(this.kopecks>=100)
        {
            int tmp=this.kopecks%100;
            this.kopecks=(byte)tmp;
            int tmp2=this.kopecks/100;
            this.hryvnia=this.hryvnia+(byte)tmp2;
        }
        if(that.kopecks>=100)
        {
            int tmp=that.kopecks%100;
            that.kopecks=(byte)tmp;
            int tmp2=that.kopecks/100;
            that.hryvnia=that.hryvnia+(byte)tmp2;
        }
        res.hryvnia=this.hryvnia+that.hryvnia;
        int tmp3=this.kopecks+that.kopecks;
       res.kopecks=(byte)tmp3;
       if(res.kopecks>=100)
       {
           int tmp=res.kopecks%100;
           res.kopecks=(byte)tmp;
           int tmp2=res.kopecks/100;
           res.hryvnia=res.hryvnia+(byte)tmp2;
       }
return res;
    }
    public Money subtraction(Money that)
    {
        Money res=new Money();
        res.hryvnia=this.hryvnia- that.hryvnia;
        if(this.kopecks>=that.kopecks)
        {
            int tmp=this.kopecks- that.kopecks;
            res.kopecks=(byte)tmp;
        }
        else
        {

            if(res.hryvnia>=1)
            {
                res.hryvnia=res.hryvnia-1;
                int tmp=this.kopecks+100;
                this.kopecks=(byte)tmp;
                int tmp3=this.kopecks-that.kopecks;
                res.kopecks=(byte)tmp3;

            }
            else
            {
                int tmp2=this.kopecks- that.kopecks;
            }
        }
        return res;
    }
    public Money multiply(double ch)
    {
        Money res=new Money();
        res.hryvnia=this.hryvnia*(long)ch;
        int tmp=this.kopecks*(byte)ch;
        res.kopecks=(byte)tmp;
        return res;

    }
    public Money division(double ch)
    {
        Money res=new Money();
        res.hryvnia=this.hryvnia/(long)ch;
        int tmp=this.kopecks/(byte)ch;
        res.kopecks=(byte)tmp;
        return res;

    }
    public boolean equals(Money that)
    {
        boolean res=false;
        if((this.hryvnia==that.hryvnia)&&(this.kopecks==that.kopecks))res=true;
        return res;
    }
    @Override
    public String toString() {
        return  hryvnia + "," + kopecks;
    }
}
