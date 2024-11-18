class Example {
    int num;

    public Example(int num) {
        this.num = num; // 'this' refers to the instance variable
    }

    public void display() {
        System.out.println("Value of num: " + this.num);
    }

    public static void main(String[] args) {
        Example obj = new Example(10);
        obj.display();
    }
}
