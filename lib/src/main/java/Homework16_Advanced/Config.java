package Homework16_Advanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Config {
    public StudentDao studentDao() {
        return new StudentDaoImpl();
    }
}

