const {By, Builder} = require('selenium-webdriver');
const assert = require("assert");

describe('Навигация по меню', function () {
    let driver;

    before(async function () {
        driver = await new Builder().forBrowser('chrome').build();
    });

    it('Проверка работы кнопок на меню модулей', async function () {
        await driver.get('http://localhost:52070/');

        let title = await driver.getTitle();
        assert.equal("React App", title);


        /*
        Неявное время ожидания (implicit wait): Неявное время ожидания - это время, которое WebDriver ожидает до того, как выдать ошибку, если элемент не найден. Это позволяет избежать слишком быстрых запросов к элементам на странице, пока они еще не загружены или не появились на странице.
       */

        await driver.manage().setTimeouts({implicit: 500});

        async function pause() {
            await driver.sleep(1000);
        }
        const inputElement = await driver.findElement(By.xpath('//*[@id="n2o-root"]/div/section/div/section/div[2]/div/div/div/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div/div/p')); // Идентификатор элемента

        // Проверка наличия элемента
        expect(inputElement).to.exist;

        // Получение текстового значения элемента
        const text = await inputElement.getAttribute('value');

        // Проверка типа данных элемента
        expect(text).to.be.a('string');
    });










    after(async () => await driver.quit());
});