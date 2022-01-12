package com.slstyo.lmsku.entity;

import com.slstyo.lmsku.entity.audit.AuditModel;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Course extends AuditModel implements Serializable {

    private static final long serialVersionUID = 7114332873967556283L;

    @Id
    @GeneratedValue(generator = "uid")
    @GenericGenerator(name = "uid", strategy = "uuid2")
    @Column(length = 36)
    private String Id;

    @Column(nullable = false)
    private String name;
    private String shortDescription;
    private LocalDateTime startDate;
    private LocalDateTime endData;


}
