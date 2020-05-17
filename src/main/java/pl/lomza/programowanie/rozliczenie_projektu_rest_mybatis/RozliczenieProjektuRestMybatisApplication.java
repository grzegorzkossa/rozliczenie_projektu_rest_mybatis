package pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
@MapperScan(value = "pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.mappers")
public class RozliczenieProjektuRestMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RozliczenieProjektuRestMybatisApplication.class, args);
	}
}
