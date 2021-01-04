package kz.almat.behavioral.visitor;

import kz.almat.behavioral.visitor.model.Employee;
import kz.almat.behavioral.visitor.model.Order;
import kz.almat.behavioral.visitor.model.Product;
import kz.almat.behavioral.visitor.model.Visible;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("ASD", "courier", 50000.0f);
        Product product = new Product("apple", "123123", 50);
        Order order = new Order("2020-01-01", "2 mkr", 3150.0f);
        List<Visible> items = new ArrayList<>();
        items.add(employee);
        items.add(product);
        items.add(order);

        ReportVisitor reportVisitor = new StringReportVisitor();
        for (Visible item : items) {
            System.out.println(item.accept(reportVisitor));
        }

    }

}
