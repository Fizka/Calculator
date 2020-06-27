package com.Maths;

import java.util.LinkedList;

public class MagicFormula{

    Stack<String> myStack = new Stack<String>();
    LinkedList<String> stackONP = new LinkedList<String>();

    public double MagicEquationOne(String equation) throws Exception{
        Stack<String> myStack = new Stack<String>();
        LinkedList<String> stackONP = new LinkedList<String>();

        for(int i = 0; i < equation.length(); i++){

            if(equation.charAt(i) == '(' || equation.charAt(i) == '^')
            {
                myStack.push(equation.charAt(i) + "");

            } else if(equation.charAt(i) == '+' || equation.charAt(i) == '-')
            {

                while(!myStack.isEmpty() && (myStack.top().equals("*") ||
                        myStack.top().equals("/") || myStack.top().equals("^")))
                {

                    stackONP.add(myStack.top());
                    myStack.pop();

                }

                myStack.push(equation.charAt(i) + "");

            } else if(equation.charAt(i)=='*' || equation.charAt(i)=='/')
            {

                while(!myStack.isEmpty() && myStack.top().equals("^"))
                {

                    stackONP.add(myStack.top());
                    myStack.pop();

                }
                myStack.push(equation.charAt(i)+"");

            } else if(!myStack.isEmpty() && equation.charAt(i)==')')
            {

                while(!myStack.isEmpty() && !myStack.top().equals("("))
                {

                    stackONP.add(myStack.top());
                    myStack.pop();

                }

                myStack.pop();

            } else if(equation.charAt(i)>='0' && equation.charAt(i)<='9')

                stackONP.add(equation.charAt(i)+"");

        }
        while(!myStack.isEmpty()){

            stackONP.add(myStack.top());
            myStack.pop();

        }

        myStack = Processing(stackONP, myStack);
        System.out.println("Score: " + myStack.top());

        return Double.parseDouble(myStack.top());
    }

    public Stack Processing(LinkedList<String> stosONPIn, Stack stackIn) throws Exception
    {

        double tempFirst;
        double tempSecond;

        Stack<String> myStack = stackIn;
        LinkedList<String> stackONP = stosONPIn;

        for(int i=0; i<stackONP.size(); i++)
        {
            if(stackONP.get(i).charAt(0) < '0' || stackONP.get(i).charAt(0) > '9')
            {

                if(stackONP.get(i).charAt(0) == '*')
                {

                    tempFirst = Double.parseDouble(myStack.top());
                    myStack.pop();

                    tempSecond = Double.parseDouble(myStack.top());
                    myStack.pop();

                    myStack.push(String.valueOf(tempFirst * tempSecond));

                } else if(stackONP.get(i).charAt(0) == '/')
                {

                    tempFirst = Double.parseDouble(myStack.top());
                    myStack.pop();

                    tempSecond = Double.parseDouble(myStack.top());
                    myStack.pop();

                    try
                    {
                        myStack.push(String.valueOf(tempSecond / tempFirst));

                    } catch (ArithmeticException e)
                    {
                        System.out.println("Zero");
                    }

                } else if(stackONP.get(i).charAt(0)=='+')
                {

                    tempFirst = Double.parseDouble(myStack.top());
                    myStack.pop();

                    tempSecond = Double.parseDouble(myStack.top());
                    myStack.pop();

                    myStack.push(String.valueOf( tempFirst + tempSecond));

                } else if(stackONP.get(i).charAt(0)=='-')
                {

                    tempFirst = Double.parseDouble(myStack.top());
                    myStack.pop();

                    tempSecond = Double.parseDouble(myStack.top());
                    myStack.pop();

                    myStack.push(String.valueOf(tempSecond - tempFirst));

                } else if(stackONP.get(i).charAt(0)=='^')
                {

                    tempFirst = Double.parseDouble(myStack.top());
                    myStack.pop();

                    tempSecond = Double.parseDouble(myStack.top());
                    myStack.pop();

                    myStack.push(String.valueOf(Math.pow(tempSecond, tempFirst)));

                }
            } else
            {

                myStack.push(stackONP.get(i));
            }
        }

        return myStack;
    }

}
