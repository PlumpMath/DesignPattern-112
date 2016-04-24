package com.blue.dp25.VisitorPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
