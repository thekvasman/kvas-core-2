package task.generics;

import task.models.BigBox;
import task.models.MediumBox;
import task.models.MicroBox;
import task.models.SmallBox;
import java.util.List;

public class Generics {


  public static void main(String[] args) {

  }

  //TODO: Сделайте рефакторинг метода так , что бы это метод мог работать не только с BigBox , а еще и с любыми его наследниками
  //  используйте для этого дженерики
  public boolean checkBoxInList(List<BigBox> list, BigBox item) {
    return list.contains(item);
  }

  //TODO: Таким же образом реализуйте метод добавления коробок в список при помощи дженериков . Тоесть , этот метод будет принимать
  // BigBox и его наследников и добавлять в список BigBox и его наследников

  //TODO: Так же реализуйте метод который будет проходится по списку с MediumBox и его наследников и выводить на экран содежимое каждого элемента

  //TODO: реализуйте Метод для копирования элементов из одного списка с BigBox и его наследников в другой список BigBox и его наследников

  private static BigBox generateBigBox() {
    BigBox bigBox = new BigBox();
    bigBox.setMediumBox(generateMediumBox());
    bigBox.setHeight(20);
    bigBox.setLength(20);
    bigBox.setSize("big");
    bigBox.setWidth(20);
    return bigBox;
  }

  private static MediumBox generateMediumBox() {
    MediumBox mediumBox = new MediumBox();
    mediumBox.setSmallBox(generatSmallBox());
    mediumBox.setHeight(15);
    mediumBox.setLength(15);
    mediumBox.setSize("medium");
    mediumBox.setWidth(15);
    return mediumBox;
  }

  private static SmallBox generatSmallBox() {
    SmallBox smallBox = new SmallBox();
    smallBox.setMicroBox(generatMicroBox());
    smallBox.setHeight(10);
    smallBox.setLength(10);
    smallBox.setSize("small");
    smallBox.setWidth(10);
    return smallBox;
  }

  private static MicroBox generatMicroBox() {
    MicroBox microBox = new MicroBox();
    microBox.setHeight(5);
    microBox.setLength(5);
    microBox.setSize("small");
    microBox.setWidth(5);
    return microBox;
  }


}
