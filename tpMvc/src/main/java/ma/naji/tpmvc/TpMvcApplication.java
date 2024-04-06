package ma.naji.tpmvc;
import ma.naji.tpmvc.Entities.Patient;
import ma.naji.tpmvc.Repositories.PatientRepositery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class, args);
    }

    //@Bean
    CommandLineRunner start(PatientRepositery patientRepositery){
        return  args -> {
            patientRepositery.save(new Patient(null,"Hassan",
                    new Date(),false,120));
            patientRepositery.save(new Patient(null,"Wahid",
                    new Date(),false,122));
            patientRepositery.save(new Patient(null,"karim",
                    new Date(),false,123));
        };
    }

}
