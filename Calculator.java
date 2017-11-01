public class Calculator{
    private int val1;
    private int val2;
    private String operation;

    public Calculator(){}

    public void setOperandOne(int val){
        this.val1 = val;
    }
    public void setOperandTwo(int val){
        this.val2 = val;
    }
    public void setOperation(String op){
        this.operation = op;
    }
    public int getResults(){
        int results = 0;
        if(this.operation == "+"){
            results = this.val1 + this.val2;
            return results;
        } else if(this.operation == "-") {
            results = this.val1 - this.val2;
            return results;
        } else if (this.operation == "/"){
            results = this.val1 / this.val2;
            return results;
        } else if (this.operation == "*"){
            results = this.val1 * this.val2;
            return results;
        } else {
            System.out.println("Can not perform that operation");
            return results;
        }
    }
}