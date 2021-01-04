package kz.almat.behavioral.visitor;

public interface ReportVisitor {

    String visitProductReport();

    String visitOrderReport();

    String visitEmployeeReport();

}
