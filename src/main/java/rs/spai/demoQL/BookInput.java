package rs.spai.demoQL;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInput {
    private String title;
    private Integer publicationYear;
    private String language;
    private Integer nbPages;
    private Integer idC;       
    private Integer idAuthor; 
}