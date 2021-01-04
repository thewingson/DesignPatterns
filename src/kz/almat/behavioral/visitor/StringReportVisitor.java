package kz.almat.behavioral.visitor;

import kz.almat.behavioral.visitor.model.Employee;
import kz.almat.behavioral.visitor.model.Order;
import kz.almat.behavioral.visitor.model.Product;

public class StringReportVisitor implements ReportVisitor {
    @Override
    public String visitProductReport(Product product) {
        return product.getName() + " /" + product.getBarcode() + " /" + product.getCount();
    }

    @Override
    public String visitOrderReport(Order order) {
        return order.getDate() + " /" + order.getAddress() + " /" + order.getSumm();
    }

    @Override
    public String visitEmployeeReport(Employee employee) {
        return employee.getFullName() + " /" + employee.getPosition() + " /" + employee.getSalary();
    }
}
