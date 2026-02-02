class FinalVariable {
    final int max = 100;
    void display() {
        System.out.println("Max Variable : " + max);
    }
    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.display();
    }
}