package edu.escuelaing.arsw;

public class Calculator {
    LinkednList<Double> list;

    public Calculator(LinkednList<Double> link) {
       list = link;

    }
    public double mean() {
        double cont = 0;
        for (Double i : list){
            cont +=i;

        }
        return cont / list.size();

    }
    public double Std_dev(){
        double cont = 0;
        for (Double i : list){
            cont += Math.pow(i-mean(),2);
        }
        return Math.sqrt(cont / (list.size()-1)) ;
    }
}
