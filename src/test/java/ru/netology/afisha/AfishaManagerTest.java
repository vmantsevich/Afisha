package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    @Test
    public void shouldFindAll() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-Невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-Невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLast() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLimit10() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Ввысь");
        manager.addFilm("Назад в будущее");
        manager.addFilm("Мсители");
        manager.addFilm("Патриот");
        manager.addFilm("9 рота");
        manager.addFilm("Аватар");
        manager.addFilm("Хитман");
        manager.addFilm("Звездные войны");
        manager.addFilm("Остров");

        String[] expected = {"Остров", "Звездные войны", "Хитман", "Аватар", "9 рота", "Патриот", "Мсители", "Назад в будущее", "Ввысь", "Отель Белград"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}