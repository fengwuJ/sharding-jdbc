package com.example.sharding.common;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Properties;

@Component
@Slf4j
public class MyKeyGenerator extends IdentityGenerator implements ShardingKeyGenerator {

    @Getter
    @Setter
    private Properties properties;

    @Override
    public Comparable<?> generateKey() {
        return generateId();
    }

    @Override
    public String getType() {
        return "myKeyGen";
    }

    public Serializable generate(SharedSessionContractImplementor s, Object obj) {
        return generateId();
    }

    private Long generateId(){
        return System.currentTimeMillis();
    }
}
