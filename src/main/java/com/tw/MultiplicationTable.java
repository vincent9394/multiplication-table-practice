package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if(isValid(start,end)){
            return generateTable(start,end);
        }

        return null;

    }

    public Boolean isValid(int start, int end) {
        return isInRange(start)&&isInRange(end)&&isStartNotBiggerThanEnd(start,end);


    }

    public Boolean isInRange(int number) {

        return number >= 1 && number <=1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {

        return start <= end;
    }

    public String generateTable(int start, int end) {
        String table = "";
        for(int i=start; i<=end; i++){
            table = table + generateLine(start,i) ;
            if (i<end){
                table +=  "\n";
            }
        }
        return table;
    }

    public String generateLine(int start, int row) {
        String singleLine ="";
        for(int i=start; i<=row; i++){
            singleLine =singleLine + generateSingleExpression(i,row) + "  ";
        }
        singleLine= singleLine.trim();
        return singleLine;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        String  singleUnit=  multiplicand + "*" + multiplier + "=" + (multiplicand * multiplier);
        return singleUnit;
    }
}
