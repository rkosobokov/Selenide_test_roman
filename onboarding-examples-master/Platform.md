# [Компоненты Платформы](Platform.md)
Проба собрать информацию о технологических компонентах Платформы и способах работы с ними.

### Контакты команд разработки
https://confluence.bftcom.com/pages/viewpage.action?pageId=167020485

#### Добавить информацию о дефекте (баг) Платформы
[Требования к оформлению задач поддержки прикладных команд в Jira](https://confluence.bftcom.com/pages/viewpage.action?pageId=244177590)

### 3.1. Благородные сервисы
Сервисы хранящие данные подсистем. И обеспечивающие безопасность распределенных транзакций (за счет работы transact-manager)

[Благородный Реестр Сервисов](https://confluence.bftcom.com/pages/viewpage.action?pageId=278255805)

[Документация по сервисам агрегатов](https://confluence.bftcom.com/pages/viewpage.action?pageId=174185433)

[В помощь разработчику сервисов агрегатов](https://confluence.bftcom.com/pages/viewpage.action?pageId=174185457)

[Руководство по локальному запуску агрегатного сервиса](https://confluence.bftcom.com/pages/viewpage.action?pageId=315162911)

### 3.2. N2O
Корпоративный фреймворк для разработки фронтенд-приложений

[N2O и разработка фронта](https://confluence.bftcom.com/pages/viewpage.action?pageId=194007391)

https://ps.n2oapp.net/docs/clientService/startpage

https://sandbox.n2oapp.net/


### 3.3. GraphQL-меш  
Единая витрина данных для фронтенд приложений (есть тенденция создания отдельных витрин под каждый модуль)

[Презентация на HighLoad++ от Яндекса](https://confluence.bftcom.com/pages/viewpage.action?pageId=281129040&preview=%2F281129040%2F281129041%2FGraphQL%2B%D0%BA%D0%B0%D0%BA%2B%D0%BD%D0%B5%2B%D0%B2%D1%8B%D1%81%D1%82%D1%80%D0%B5%D0%BB%D0%B8%D1%82%D1%8C%2B%D1%81%D0%B5%D0%B1%D0%B5%2B%D0%B2%2B%D0%BD%D0%BE%D0%B3%D1%83_%D0%90%D0%BB%D0%B5%D0%BA%D1%81%D0%B0%D0%BD%D0%B4%D1%80%2B%D0%9F%D0%BE%D0%BB%D1%8F%D0%BA%D0%BE%D0%B2,%2B%D0%9C%D0%B8%D1%85%D0%B0%D0%B8%D0%BB%2B%D0%A1%D1%83%D1%80%D0%B8%D0%BD%2B%28%D0%AF%D0%BD%D0%B4%D0%B5%D0%BA%D1%81%29_%D0%B2%D0%B5%D1%80.3.pdf)

[Инструкция по работе с GRAPHQL MESH](https://confluence.bftcom.com/pages/viewpage.action?pageId=250218231)

[[PS-GraphQL] Модуль GraphQL](https://confluence.bftcom.com/pages/viewpage.action?pageId=268205224)

[ФО. Работа с GraphQLMesh](https://confluence.bftcom.com/pages/viewpage.action?pageId=201986234)

[GrapQL Mash и всё, что с ним связано](https://confluence.bftcom.com/pages/viewpage.action?pageId=195069759)

[АПСО. Требования разработке GraphQL-запросов](https://confluence.bftcom.com/pages/viewpage.action?pageId=235930068)

[Добавление источников в graphql mesh](https://confluence.bftcom.com/pages/viewpage.action?pageId=189456385)

[Управление кэшем на уровне GraphQL-Mesh](https://confluence.bftcom.com/pages/viewpage.action?pageId=262101856)

[Прото-файлы для мэша](https://confluence.bftcom.com/display/DASIS/graphql)


### 3.3. Transaction-manager
Реализация ACID для микросервисной среды Платформы ЕЦП   
https://confluence.bftcom.com/pages/viewpage.action?pageId=240622794


### 3.3. Cert-manager
Сервис выдачи сертификатов для работы с внешними системами (??)


### 3.4. Authz
Сервис авторизации внутренних межсистемных запросов (???)


### 3.5. DMN (ЖС, подсистема Жизненных Ситуаций)
Сервис вычисления вычисления права на Меру (соц обеспечения),  
а также реакции на события в РПУ (через Окно целостности)

https://confluence.bftcom.com/pages/viewpage.action?pageId=293950733

### 3.5. Окно целостности 
Брокер сообщений (Kafka) с данными об измененных объектов (ФЛ)  
Часть РПУ (?)

### 3.6. Журналирование (ELK)
https://confluence.bftcom.com/pages/viewpage.action?pageId=313491028

### 3.7. РПУ
Реестр Получателей Услуг  
[АПСО.ПУВ.Отправка данных в РПУ и другими смежными модулями](https://confluence.bftcom.com/pages/viewpage.action?pageId=295402209)