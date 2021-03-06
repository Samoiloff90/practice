package fightingTask;

/**
 * Напишите программу по следующему описанию.
 * Есть класс "Воин". От него создаются два экземпляра-юнита.
 * Каждому устанавливается здоровье в 100 очков. В случайном порядке они бьют друг друга.
 * Тот, кто бьет, здоровья не теряет. У того, кого бьют, оно уменьшается на 20 очков от одного удара.
 * После каждого удара надо выводить сообщение, какой юнит атаковал, и сколько у противника осталось здоровья.
 * Как только у кого-то заканчивается ресурс здоровья, программа завершается сообщением о том, кто одержал победу.
 * */

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior(10, "Roman");
        Warrior warrior2 = new Warrior(10, "Oleg");

        War.fight(warrior1, warrior2);
    }
}