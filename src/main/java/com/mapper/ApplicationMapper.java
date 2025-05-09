import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {

    @Mapping(target = "applicantId", source = "applicantId")
    Application createApplicationRequestToApplication(CreateApplicationRequest request);

    @Mapping(target = "id", source = "id")
    GetApplicationResponse applicationToGetApplicationResponse(Application application);
}
