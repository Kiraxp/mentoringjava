package com.slstyo.lmsku.entity;

import com.slstyo.lmsku.entity.audit.AuditModel;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Section extends AuditModel implements Serializable {

    private static final long serialVersionUID = 8293767083587645467L;

    @Id
    @GeneratedValue(generator = "uid")
    @GenericGenerator(name = "uid", strategy = "uuid2")
    @Column(length = 36)
    private String id;

    @Column(nullable = false)
    private String name;


}
