package HW8;
/*
Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

Необходимо создать класс Manager в который нужно добавить следующие методы:
getNumberOfSubordinates - получить количество подчиненных
setNumberOfSubordinates

 в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
*/
public final class worker extends EmployeeK{
    int sal;

    public worker(double BaseSalary, String Name, double Salary) {
        super(BaseSalary, Name, Salary);
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }

}
