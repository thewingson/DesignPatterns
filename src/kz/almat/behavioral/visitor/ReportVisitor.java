package kz.almat.behavioral.visitor;

import kz.almat.behavioral.visitor.model.Employee;
import kz.almat.behavioral.visitor.model.Order;
import kz.almat.behavioral.visitor.model.Product;

public interface ReportVisitor {

    String visitProductReport(Product product);

    String visitOrderReport(Order order);

    String visitEmployeeReport(Employee employee);

}
