package vn.edu.iuh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import vn.edu.iuh.model.Author;
import vn.edu.iuh.model.Course;
import vn.edu.iuh.repository.AuthorRepository;
import vn.edu.iuh.service.CourseService;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootApiCourseCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiCourseCrudApplication.class, args);
    }

//    @Bean
    CommandLineRunner run(CourseService courseService, AuthorRepository authorRepository) {
        return args -> {
            Author author = authorRepository.save(new Author("Hữu Huy"));
            courseService.save(new Course("Lap trinh C++", "Hoc mien phi 7 ngay", 100, author));
        };
    }
}
