package com.blue.dp25.VisitorPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
