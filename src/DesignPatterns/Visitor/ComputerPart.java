package DesignPatterns.Visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}