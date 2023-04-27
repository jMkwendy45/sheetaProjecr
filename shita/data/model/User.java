package shita.data.model;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    public   String firstName;
    private  String lastName;
    private  String address;
    private  String phoneNumber;
    private  String email;
    private  int id;

}
