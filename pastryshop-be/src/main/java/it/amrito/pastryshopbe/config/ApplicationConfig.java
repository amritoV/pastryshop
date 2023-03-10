package it.amrito.pastryshopbe.config;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties("app")
@Validated
@Data
public class ApplicationConfig {

    @NotNull(message = "configurare il periodo di di validità di una scheda prodotto")
    @Min(1)
    private Integer productValidityDays;

    @NotNull
    @DecimalMin("1")
    @DecimalMax("100")
    private Double firstDayPercentage;

    @NotNull
    @DecimalMin("1")
    @DecimalMax("100")
    private Double secondDayPercentage;

    @NotNull
    @DecimalMin("1")
    @DecimalMax("100")
    private Double thirdDayPercentage;
}
