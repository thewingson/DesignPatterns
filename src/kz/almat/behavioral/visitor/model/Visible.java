package kz.almat.behavioral.visitor.model;

import kz.almat.behavioral.visitor.ReportVisitor;

public interface Visible {

    String accept(ReportVisitor visitor);

}
