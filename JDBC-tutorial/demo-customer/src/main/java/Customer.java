import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String fullName;
    private Date dob;
    private String address;
    private String email;
    private String mobile;

    @Override
    public String toString() {
        return id + " - " + fullName + " - " + dob + " - " +
                address + " - " + email + " - " + mobile;
    }
}
