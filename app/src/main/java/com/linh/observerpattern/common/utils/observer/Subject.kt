package com.linh.observerpattern.common.utils.observer

abstract class Subject {
    private val observers = ArrayList<Observer>()

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers(data: Any) {
        for (observer in observers) {
            observer.update(data)
        }
    }
}