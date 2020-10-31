package org.itstep.task07;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {

    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public Complex minus(Complex that){
        Complex res=new Complex();
        res.real=this.real-that.real;
        res.imaginary=this.imaginary-that.imaginary;
        return res;
    }
    public Complex plus(Complex that)
    {
        Complex res=new Complex();
        res.real=this.real+that.real;
        res.imaginary=this.imaginary+that.imaginary;
        return res;

    }
    public Complex times(Complex that)
    {
        Complex res=new Complex();
        res.real=this.real*that.real;
        res.imaginary=this.imaginary*that.imaginary+ res.real;
        res.real=0.0;
        return res;

    }
    @Override
    public String toString(){
        if(real==0.0 && imaginary!=0.0)
        {
            return imaginary+"i";
        }
        else if(imaginary!=0.0 && imaginary>=0)
        {return real + " + "+ imaginary+"i";}
        else if(imaginary<0){
            return real + " - "+ imaginary*(-1)+"i";
        }
        else if(imaginary==0.0 && real==0.0)
        {
            return "0.0";
        }
        else {
            return real+"";
        }
    }
}
