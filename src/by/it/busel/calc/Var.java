package by.it.busel.calc;

/**
 * a class that is a general specimen of a math expression
 */
class Var implements Operation {
    /**
     * a method, which creates a Var expression of a certain type (Scalar, Vector, Matrix) depending on
     * the value that contains the String-argument "operand"
     *
     * @param operand a String-object containing a Var expression
     * @return a Var expression
     */
    static Var createVar(String operand) throws CalcException {
        if (operand.matches(Patterns.SCALAR)) {
            return new Scalar(operand);
        } else if (operand.matches(Patterns.VECTOR)) {
            return new Vector(operand);
        } else if (operand.matches(Patterns.MATRIX)) {
            return new Matrix(operand);
        } else if (Storage.containsKey(operand)) {
            return Storage.getVarFromStorage(operand);
        } else {
            throw new CalcException("A wrong format of input expression or (an) unsaved Var-expression(s)!\nCheck the expression You inputted. Then re-enter your expression, please!");
//            return null;
        }

    }

    @Override
    public String toString() {
        return "exampleVar.toString()";
    }

    /**
     * a method that informs whether a mathematical operation of addition can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be added
     * @return a result of addition
     */
    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException("The operation \"addition\" " + other + " + " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of addition can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be added
     * @return a result of addition
     */
    @Override
    public Var add(Scalar other) throws CalcException {
        throw new CalcException("The operation \"addition\" " + other + " + " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of addition can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be added
     * @return a result of addition
     */
    @Override
    public Var add(Vector other) throws CalcException {
        throw new CalcException("The operation \"addition\" " + other + " + " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of addition can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be added
     * @return a result of addition
     */
    @Override
    public Var add(Matrix other) throws CalcException {
        throw new CalcException("The operation \"addition\" " + other + " + " + this + " can not be performed.");
    }


    /**
     * a method that informs whether a mathematical operation of subtraction can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be subtracted
     * @return a result of subtraction
     */
    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException("The operation \"subtraction\" " + other + " - " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of subtraction can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be subtracted
     * @return a result of subtraction
     */
    @Override
    public Var sub(Scalar other) throws CalcException {
        throw new CalcException("The operation \"subtraction\" " + other + " - " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of subtraction can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be subtracted
     * @return a result of subtraction
     */
    @Override
    public Var sub(Vector other) throws CalcException {
        throw new CalcException("The operation \"subtraction\" " + other + " - " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of subtraction can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is to be subtracted
     * @return a result of subtraction
     */
    @Override
    public Var sub(Matrix other) throws CalcException {
        throw new CalcException("The operation \"subtraction\" " + other + " - " + this + " can not be performed.");
    }


    /**
     * a method that informs whether a mathematical operation of multiplication can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is a multiplier
     * @return a result of a multiplication
     */
    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException("The operation \"multiplication\" " + other + " * " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of multiplication can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is a multiplier
     * @return a result of a multiplication
     */
    @Override
    public Var mul(Scalar other) throws CalcException {
        throw new CalcException("The operation \"multiplication\" " + other + " * " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of multiplication can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is a multiplier
     * @return a result of a multiplication
     */
    @Override
    public Var mul(Vector other) throws CalcException {
        throw new CalcException("The operation \"multiplication\" " + other + " * " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of multiplication can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is a multiplier
     * @return a result of a multiplication
     */
    @Override
    public Var mul(Matrix other) throws CalcException {
        throw new CalcException("The operation \"multiplication\" " + other + " * " + this + " can not be performed.");
    }


    /**
     * a method that informs whether a mathematical operation of division can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is divisor
     * @return a result of division
     */
    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("The operation \"division\" " + other + " / " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of division can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is divisor
     * @return a result of division
     */
    @Override
    public Var div(Scalar other) throws CalcException {
        throw new CalcException("The operation \"division\" " + other + " / " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of division can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is divisor
     * @return a result of division
     */
    @Override
    public Var div(Vector other) throws CalcException {
        throw new CalcException("The operation \"division\" " + other + " / " + this + " can not be performed.");
    }

    /**
     * a method that informs whether a mathematical operation of division can not be performed
     *
     * @param other an instance of Var-class or its subclasses, which is divisor
     * @return a result of division
     */
    @Override
    public Var div(Matrix other) throws CalcException {
        throw new CalcException("The operation \"division\" " + other + " / " + this + " can not be performed.");
    }

}