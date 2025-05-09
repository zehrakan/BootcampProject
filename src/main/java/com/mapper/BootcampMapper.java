import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BootcampMapper {

    @Mapping(target = "name", source = "name")
    Bootcamp createBootcampRequestToBootcamp(CreateBootcampRequest request);

    @Mapping(target = "id", source = "id")
    GetBootcampResponse bootcampToGetBootcampResponse(Bootcamp bootcamp);
}
