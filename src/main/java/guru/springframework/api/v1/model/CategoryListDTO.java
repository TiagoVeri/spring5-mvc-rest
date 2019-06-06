package guru.springframework.api.v1.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//Original source listed Categories using a new class
@Data
@AllArgsConstructor
public class CategoryListDTO {

	List<CategoryDTO> categories;
}
