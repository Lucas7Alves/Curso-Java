package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import entites.Contract;
import entites.Installment;

public class ContractService {
  private OnlinePaymentService onService;

  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public ContractService(OnlinePaymentService onService) {
    this.onService = onService;
  }

  public void processContract(Contract contract, Integer months) throws ParseException {

    double basicQuota = contract.getTotalValue() / months;

    for (int i = 1; i <= months; i++) {
      LocalDate dueDate = contract.getDate().plusMonths(i);

      double interest = onService.interest(basicQuota, i);
      double fee = onService.paymentFee(basicQuota + interest);

      double quota = basicQuota + interest + fee;

      contract.getInstallments().add(new Installment(dueDate, quota));
    }
  }
}
