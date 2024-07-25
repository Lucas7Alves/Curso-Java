package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import entites.Contract;
import entites.Installment;

public class ContractService {
  private OnlinePaymentService onService;

  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

  public ContractService(OnlinePaymentService onService) {
    this.onService = onService;
  }

  public void processContract(Contract contract, Integer months) throws ParseException {
    Calendar calendar = Calendar.getInstance();
    Date date = contract.getDate();

    calendar.setTime(date);
    calendar.get(Calendar.MONTH);
    String dayContract;
    String yearContract;
    if (calendar.get(Calendar.MONTH) >= 10) {
      dayContract = String.format("%d", calendar.get(Calendar.DAY_OF_MONTH));
      yearContract = String.format("%d", calendar.get(Calendar.YEAR));      
    } else {
      dayContract = String.format("0"+"%d", calendar.get(Calendar.DAY_OF_MONTH));
      yearContract = String.format("0"+"%d", calendar.get(Calendar.YEAR));
    }

    double value = contract.getTotalValue() / months;
    for (int i = 1; i <= months; i++) {
      value += onService.interest(value, i);
      value += onService.paymentFee(value);
      
      String month = String.format("0"+"%d", calendar.get(Calendar.MONTH) + i + 1);
      String contractNew = dayContract +"/"+ month +"/"+ yearContract;
      date = sdf.parse(contractNew);
      Installment installment = new Installment(date, value);
      contract.getInstallments().add(installment);
      value = contract.getTotalValue() / months;
    }
  }
}
