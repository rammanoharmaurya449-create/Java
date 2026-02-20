class ExceptionDemo{
    static void fun(){
        try{
            throw new NullPointerException("this is Demo");
        }catch(NullPointerException e){
            System.out.println("cought  inside fun method");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            fun();
        }catch(NullPointerException e){
            System.out.println("cought  inside main method");
        }
    }
}