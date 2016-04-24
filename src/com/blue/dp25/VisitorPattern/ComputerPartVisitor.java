package com.blue.dp25.VisitorPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
