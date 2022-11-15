package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

import static lotto.Constant.*;

public class LottoDrawing {
    List<Integer> winningNumbers = new ArrayList<>();
    int bonusNumber;
    public LottoDrawing(String inputWinning, String inputBonus){
        List<Integer> winningNumbers = convertStringToNumberList(inputWinning);
        int bonusNumber = convertStringToInteger(inputBonus);

        Lotto winningLotto = new Lotto(winningNumbers);
        winningNumbers = winningLotto.getNumbers();

        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    private List<Integer> convertStringToNumberList(String input) {
        String[] tempInputs = input.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String number : tempInputs) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }

    private int convertStringToInteger(String input){
        return Integer.parseInt(input);
    }

}
