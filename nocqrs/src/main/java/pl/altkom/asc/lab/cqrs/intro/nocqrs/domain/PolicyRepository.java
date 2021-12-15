package pl.altkom.asc.lab.cqrs.intro.nocqrs.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

public interface PolicyRepository {
    void add(Policy policy);
    Policy withNumber(String number);
    List<Policy> find(PolicyFilter filter);

    @Getter
    @Builder
    public class PolicyFilter {
        private String number;
        private String holderFirstName;
        private String holderLastName;
        private LocalDate startDateFrom;
        private LocalDate startDateTo;
        private String carPlateNumber;
    }
}
