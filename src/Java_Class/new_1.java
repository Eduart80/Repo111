package Java_Class;
    public class new_1 {

            public static void main(String[] args) {
                // hours and days
                byte nHours = 24;
                short nDays = 365;
                System.out.println("Numbers of Hours per day " + nHours +", and "+ nDays + " days per year.");

                //# of employee
                int nEmployee = 452;
                System.out.println("Vet company has " + nEmployee + " employees.");

                //population
                long nPopulation = 7_000_000L;
                System.out.println("Population in this country is "+ nPopulation +" peoples.");

                //interest rate
                float pRate = 30.5f;
                System.out.println("Our bank rate for houses is "+pRate +"%");

                // bank account
                double accBank = 2569.99;
                System.out.println("Bank account balance $"+ accBank +" dollars.");

                //sun direction
                int sunRise = 90;
                boolean sunDir = true;
                char orientation = 'E';   //E = East
                System.out.println("Sun rise on "+ sunRise + " degree " + orientation);

                //name
                char nameIn = 'E';
                char lastIN ='Z';
                System.out.println("This homework is from " + nameIn + lastIN);

                int abc=2;
                abc++;
                System.out.println(abc++); //post increment
                System.out.println(++abc); //pree increment
                System.out.println(++abc); //6
                System.out.println(++abc); //7

                int abc2=2;
                abc2--;
                System.out.println(abc2++); //post increment
                System.out.println(++abc2); //pree increment
                System.out.println(abc2++); //6
                System.out.println(++abc2); //7




        }

    }
