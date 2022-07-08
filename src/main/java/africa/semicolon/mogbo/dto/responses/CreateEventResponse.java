package africa.semicolon.mogbo.dto.responses;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateEventResponse {
    private String partyName;
    private String partyLocation;
    private String createdBy;
}
