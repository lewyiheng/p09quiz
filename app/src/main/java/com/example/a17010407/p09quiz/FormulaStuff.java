package com.example.a17010407.p09quiz;

public class FormulaStuff {
    private String formName;
    private String formula;
    private String type;

    public FormulaStuff(String formName, String formula, String type) {
        this.formName = formName;
        this.formula = formula;
        this.type = type;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FormulaStuff{" +
                "formName='" + formName + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
