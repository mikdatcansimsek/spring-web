package yteintern.springweb;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record User(
        @NotBlank
        String name,
        @NotBlank
        String surname,
        @Min(12)
        @Max(100)
        Integer age,
        @NotBlank(message = "email can't be empty")
        @Email(message = "email must be calid")
        String email,
        String tcKimlikNo,
        @PastOrPresent
        LocalDate bithDate,
        @Size(max = 250)
        String address,
        @NotBlank
        String username
) {

    public boolean isUsernameValid(){
        return !username.equals("admin");
    }

}
