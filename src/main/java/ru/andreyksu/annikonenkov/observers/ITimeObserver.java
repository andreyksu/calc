package ru.andreyksu.annikonenkov.observers;

/**
 * Служит автоматического вызова, с целью обновления отображаемых часов/времени.
 * Вызов данного метода выполняет модель.
 */
public interface ITimeObserver {

    void timeUpdate();

}
