class Boolean1 {
    public static void main(String[] args) {

        int x = 15;
        boolean value1 = x > 44;
        boolean value2 = x < 7;

        boolean logicOR = value1 || value2;
        System.out.println("'LogicalOR': x < 7 is " + logicOR);

        boolean logicAND = value1 && value2;
        System.out.println("'LogicalAND': x > 44 is " + logicAND);

        boolean logicNOT1 = !value1;
        System.out.println("'LogicalNOT1': x > 44 is " + logicNOT1);

        boolean logicNOT2 = !value2;
        System.out.println("'LogicalNOT2': x < 7 is " + logicNOT2);
    }
}
