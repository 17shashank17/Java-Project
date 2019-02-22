import java.util.*;
class Token {
   public static final int UNKNOWN = -1;
   public static final int NUMBER = 0;
   public static final int OPERATOR = 1;
   public static final int LEFT_PARENTHESIS = 2;
   public static final int RIGHT_PARENTHESIS = 3;
   
   private int type;
   private double value;
   private char operator;
   private int precedence;
   
   public Token() {
       type = UNKNOWN;
   }
   
   public Token(String contents) {
       switch(contents) {
           case "+":
               type = OPERATOR;
               operator = contents.charAt(0);
               precedence = 1;
               break;
           case "-":
               type = OPERATOR;
               operator = contents.charAt(0);
               precedence = 1;
               break;
           case "*":
               type = OPERATOR;
               operator = contents.charAt(0);
               precedence = 2;
               break;
           case "/":
               type = OPERATOR;
               operator = contents.charAt(0);
               precedence = 2;
               break;
           case "(":
               type = LEFT_PARENTHESIS;
               break;
           case ")":
               type = RIGHT_PARENTHESIS;
               break;
           default:
               type = NUMBER;
               try {
                   value = Double.parseDouble(contents);
               } catch (Exception ex) {
                   type = UNKNOWN;
               }
       }
   }
   
   public Token(double x) {
       type = NUMBER;
       value = x;
   }
   
   int getType() { return type; }
   double getValue() { return value; }
   int getPrecedence() { return precedence; }
   
   Token operate(double a,double b) {
       double result = 0;
       switch(operator) {
           case '+':
               result = a + b;
               break;
           case '-':
               result = a - b;
               break;
           case '*':
               result = a * b;
               break;
           case '/':
               result = a / b;
               break;
       }
       return new Token(result);
   }
 }


public class FullCalculator {

    private TokenStack operatorStack;
    private TokenStack valueStack;
    private boolean error;
    
    public FullCalculator() {
        operatorStack = new TokenStack();
        valueStack = new TokenStack();
        error = false;
    }

    private void processOperator(Token t) {
        Token A = null, B = null;
        if (valueStack.isEmpty()) {
            System.out.println("Expression error.");
            error = true;
            return;
        } else {
            B = valueStack.top();
            valueStack.pop();
        }
        if (valueStack.isEmpty()) {
            System.out.println("Expression error.");
            error = true;
            return;
        } else {
            A = valueStack.top();
            valueStack.pop();
        }
        Token R = t.operate(A.getValue(), B.getValue());
        valueStack.push(R);
    }

    public double processInput(String input) {
        // The tokens that make up the input
        String[] parts = input.split(" ");
        Token[] tokens = new Token[parts.length];
        for (int n = 0; n < parts.length; n++) {
            tokens[n] = new Token(parts[n]);
        }

        // Main loop - process all input tokens
        for (int n = 0; n < tokens.length; n++) {
            Token nextToken = tokens[n];
            if (nextToken.getType() == Token.NUMBER) {
                valueStack.push(nextToken);
            } else if (nextToken.getType() == Token.OPERATOR) {
                if (operatorStack.isEmpty() || nextToken.getPrecedence() > operatorStack.top().getPrecedence()) {
                    operatorStack.push(nextToken);
                } else {
                    while (!operatorStack.isEmpty() && nextToken.getPrecedence() <= operatorStack.top().getPrecedence()) {
                        Token toProcess = operatorStack.top();
                        operatorStack.pop();
                        processOperator(toProcess);
                    }
                    operatorStack.push(nextToken);
                }
            } else if (nextToken.getType() == Token.LEFT_PARENTHESIS) {
                operatorStack.push(nextToken);
            } else if (nextToken.getType() == Token.RIGHT_PARENTHESIS) {
                while (!operatorStack.isEmpty() && operatorStack.top().getType() == Token.OPERATOR) {
                    Token toProcess = operatorStack.top();
                    operatorStack.pop();
                    processOperator(toProcess);
                }
                if (!operatorStack.isEmpty() && operatorStack.top().getType() == Token.LEFT_PARENTHESIS) {
                    operatorStack.pop();
                } else {
                    System.out.println("Error: unbalanced parenthesis.");
                    error = true;
                }
            }

        }
        // Empty out the operator stack at the end of the input
        while (!operatorStack.isEmpty() && operatorStack.top().getType() == Token.OPERATOR) {
            Token toProcess = operatorStack.top();
            operatorStack.pop();
            processOperator(toProcess);
        }
        // Print the result if no error has been seen.
        if(error == false) {
            Token result = valueStack.top();
            valueStack.pop();
            if (!operatorStack.isEmpty() || !valueStack.isEmpty()) {
                System.out.println("Expression error.");
            } else {
                //System.out.println("The result is " + result.getValue());
              return result.getValue();
            }
        }
    return 0;
    }
}