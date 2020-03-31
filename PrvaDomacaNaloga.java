import java.time.YearMonth;

class PrvaDomacaNaloga
{
    public static void main(String[] args)
    {
        //sprememnljivke
        YearMonth mesecRojstva = YearMonth.of(1982, 8);
        int stDni = mesecRojstva.lengthOfMonth();
        double r = stDni;
        double obseg = 2*Math.PI*r;
        //izpis
        System.out.println(" \u0061 \t \u0062 \t \u0063 \n \u010D \t \u0064 \t \u0065 \n \u0066 \t \u0067 \t \u0068 \n \u0069 \t \u006A \t \u006B \n \u006C \t \u006D \t \u006E \n \u006F \t \u0070 \t \u0072 \n \u0073 \t \u0161 \t \u0074 \n \u0075 \t \u0076 \t \u007A \n \u017E");
        System.out.print(Math.round(obseg));



    }
}
