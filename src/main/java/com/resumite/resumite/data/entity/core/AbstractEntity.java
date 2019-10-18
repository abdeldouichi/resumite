package com.resumite.resumite.data.entity.core;

import com.resumite.resumite.data.entity.IoDate;
import org.springframework.data.mapping.model.MutablePersistentEntity;

import javax.persistence.*;


@MappedSuperclass
public abstract class AbstractEntity /*implements MutablePersistentEntity*/{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Version
    private int CounterUpdate;

    @Transient
    private Number revision;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "IO_DATE")
    protected IoDate ioDate;

}
