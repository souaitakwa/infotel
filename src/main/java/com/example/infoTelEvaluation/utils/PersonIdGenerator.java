package com.example.infoTelEvaluation.utils;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PersonIdGenerator implements IdentifierGenerator {

	
	public static final String generatorName = "myGenerator";

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) throws HibernateException {
        return UUID.randomUUID().toString().replace("-", "");
    }

	
}
