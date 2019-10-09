package javaCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TryToFindDelivery {

    public static void main(String[] args) {

      //  а. Напишите скрипт или автоматический тест или команду в unix консоли,
        //  который проверить что на странице https://rozetka.com.ua/ есть текст "Доставка по всей Украине"


        // отключить уведомление, блокирующее работу скрипта
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // инициализация драйвера
        WebDriver dr = new ChromeDriver();

        // неявное ожидание, чтоб подождало если понадобится
        dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        // окно браузера на весь экран
        dr.manage().window().maximize();

        // выполнить вход на сайт
        dr.get("https://rozetka.com.ua/");

        // код страницы в переменную
        String source = dr.getPageSource();

        // задаем условие - если такой элемент есть, то вывести одно, если нет - другое.
        if (source.contains("Доставка по всей Украине"))System.out.println("Элемент присутствует на странице");
        else System.out.println("Элемент пропал");

}}
