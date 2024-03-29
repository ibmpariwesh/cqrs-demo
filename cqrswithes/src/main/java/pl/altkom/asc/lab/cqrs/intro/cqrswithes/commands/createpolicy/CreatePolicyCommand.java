package pl.altkom.asc.lab.cqrs.intro.cqrswithes.commands.createpolicy;

import lombok.Getter;
import lombok.Setter;
import pl.altkom.asc.lab.cqrs.intro.cqrswithes.cqs.Command;

import java.time.LocalDate;

@Getter
@Setter
public class CreatePolicyCommand implements Command<CreatePolicyResult> {
    private String    offerNumber;
    private LocalDate purchaseDate;
    private LocalDate policyStartDate;
}
