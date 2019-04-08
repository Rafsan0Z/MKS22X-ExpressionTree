public class ExpressionTree{



  /*return the expression as an infix notation string with parenthesis*/
  /* The sample tree would be: "(3 + (2 * 10))"     */
  public String toString(){
    if(isOp()){
      char op = getOp() + " ";
      String one = getLeft().toString() + " ";
      String two = getRight().toString();
      return "(" + one+op+two+ ")";
    }
    return getValue() + "";
  }

  /*return the expression as a postfix notation string without parenthesis*/
  /* The sample tree would be: "3 2 10 * +"     */
  public String toStringPostfix(){
    if(isOp()){
      char op = getOp();
      String first = getLeft().toStringPostfix() + " ";
      String second = getRight().toStringPostfix() + " ";
      return first+second+op;
    }
    return getValue() + "";
  }

  /*return the expression as a prefix notation string without parenthesis*/
  /* The sample tree would be: "+ 3 * 2 10"     */

  public String toStringPrefix(){
    if(isOp()){
      char op = getOp() + " ";
      String next = getLeft().toStringPrefix() + " ";
      String then = getRight().toStringPrefix();
      return op+next+then;
    }
    return getValue() + "";
  }

  /*return the value of the specified expression tree*/
  public double evaluate(){
    /*you are to write this method*/
    return 0.0;
    }

  /*use the correct operator on both a and b, and return that value*/
  private double apply(char op, double a, double b){
    if(op == "+"){return a + b;}
    else if(op == "-"){return a - b;}
    else if(op == "*"){return a*b;}
    else if(op == "/"){return a/b;}
    else if(op == "%"){return a%b;}
    }
