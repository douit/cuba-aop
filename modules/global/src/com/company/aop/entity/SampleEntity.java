package com.company.aop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "AOP_SAMPLE_ENTITY")
@Entity(name = "aop$SampleEntity")
public class SampleEntity extends StandardEntity {
    private static final long serialVersionUID = -8567760642372773565L;

    private static final Logger log = LoggerFactory.getLogger(SampleEntity.class);

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Model
    public void doMethod() {
        log.info("hello there");
    }
}