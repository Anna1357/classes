package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 2;
        denominator = 10;
    }
    public Fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Fraction addition(Fraction that) {
        Fraction res = new Fraction();
        if(this.denominator == that.denominator) {
            res.numerator = this.numerator + that.numerator;
            res.denominator = this.denominator;
        } else {
            res.numerator = this.numerator * that.denominator + that.numerator * this.denominator;
            res.denominator = this.denominator * that.denominator;
        }
        if(res.denominator==res.numerator)
        {
            res.denominator=1;
            res.numerator=1;
        }
        return res;
    }
    public Fraction subtraction(Fraction that)
    {
        Fraction res = new Fraction();
        if(this.denominator == that.denominator) {
            res.numerator = this.numerator - that.numerator;
            res.denominator = this.denominator;
        } else {
            res.numerator = this.numerator * that.denominator - that.numerator * this.denominator;
            res.denominator = this.denominator * that.denominator;
        }
        if(res.denominator==res.numerator)
        {
            res.denominator=1;
            res.numerator=1;
        }
        return res;
    }
    public Fraction multiplication(Fraction that) {
        Fraction res = new Fraction();
        res.numerator = this.numerator * that.numerator;
        res.denominator = this.denominator * that.denominator;
        if(res.denominator==res.numerator)
        {
            res.denominator=1;
            res.numerator=1;
        }
        return res;
    }
    public Fraction division(Fraction that) {
        Fraction res = new Fraction();
        res.numerator = this.numerator * that.denominator ;
        res.denominator = this.denominator *that.numerator;
        if(res.denominator==res.numerator)
        {
            res.denominator=1;
            res.numerator=1;
        }
        else if(res.numerator>=res.denominator)
        {
            if(res.numerator% res.denominator==0)
            {res.numerator= res.numerator/res.denominator;
            res.denominator=1;}
            else
            {
                int ob=0;
                int l=res.denominator;
                int del=2;
                for(int i=0;i<l;i++)
                {
                    if(res.numerator%del==0 && res.denominator%del==0)
                    {
                        ob=del;
                    }
                    else del++;
                }
                res.numerator=res.numerator/ob;
                res.denominator=res.denominator/ob;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return  numerator + "/" + denominator;
    }
}

