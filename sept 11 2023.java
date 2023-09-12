class Boolean1 {
    public static void main(String[] args) {

        int x = 8;
        boolean value1 = x > 4, value2 = x < 10, value3 = x == 4, value4 = x == 10, value5 = x != 4, value6 = x != 10, value7 = x >= 4, value8 = x >= 10, value9 = x <= 4, value10 = x <= 10;

        boolean logicOR = value1 || value2;
        System.out.println("'LogicalOR': x < 10 is " + logicOR);

        boolean logicAND = value1 && value2;
        System.out.println("'LogicalAND': x > 4 is " + logicAND);

        boolean logicNOT1 = !value1;
        System.out.println("'LogicalNOT1': x > 4 is " + logicNOT1);

        boolean logicNOT2 = !value2;
        System.out.println("'LogicalNOT2': x < 10 is " + logicNOT2);
    
        boolean logicEQUAL1 = value3;
        System.out.println( "'LogicalEQUAL' : x == 4 is " + logicEQUAL1);

        boolean logicEQUAL2 = value4;
        System.out.println( "'logicalEQUAL' : x == 10 is " + logicEQUAL2);

        boolean logicNOTEQUAL1 = value5;
        System.out.println("'logicalNOTEQUAL' : x != 4 is " + logicNOTEQUAL1);

        boolean logicNOTEQUAL2 = value6;
        System.out.println( "'logicalNOTEQUAL' : x !=10 is " + logicNOTEQUAL2);

        boolean logicGREATEREQUAL1 = value7;
        System.out.println("'logicalGREATEREQUAL' : x >=4 is " + logicGREATEREQUAL1);

       boolean logicGREATEREQUAL2 = value8;
       System.out.println("'logicalGREATEREQUAL' : x >=10 is " + logicGREATEREQUAL2);

       boolean logicLESSEREQUAL1 = value9;
       System.out.println("'logicalLESSEREQUAL' : x <=4 is " + logicLESSEREQUAL1);

       boolean logicalLESSEREQUAL2 = value10;
       System.out.println("'logicalLESSEREQUAL' : x <=10 is " + logicalLESSEREQUAL2);



    }
}
