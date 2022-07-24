package com.alki.mortaback.dev;

import com.alki.mortaback.data.model.SensitiveApp;
import com.alki.mortaback.data.model.ThreatType;
import com.alki.mortaback.data.repositories.SensitiveAppRepository;
import com.alki.mortaback.data.repositories.ThreatTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Component
public class InitTestData implements ApplicationRunner {

    private final SensitiveAppRepository sensitiveAppRepository;
    private final ThreatTypeRepository threatTypeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        populateApps();
        populateThreatTypes();
    }

   private void populateThreatTypes(){
       List<ThreatType> threats =
               Arrays.asList(
                       ThreatType.builder()
                               .mask(1)
                               .localizedName("Финансы прямой доступ")
                               .severityLevel(3)
                               .name("Money direct access")
                               .build(),
                       ThreatType.builder()
                               .mask(2)
                               .localizedName("Финансы непрямой доступ")
                               .severityLevel(2)
                               .name("Money inderect access")
                               .build(),
                       ThreatType.builder()
                               .mask(4)
                               .localizedName("Социальная сеть")
                               .severityLevel(2)
                               .name("Social Network")
                               .build(),
                       ThreatType.builder()
                               .mask(8)
                               .localizedName("Мессенджер")
                               .severityLevel(1)
                               .name("Messenger")
                               .build(),
                       ThreatType.builder()
                               .mask(16)
                               .localizedName("Почта")
                               .severityLevel(2)
                               .name("EMail")
                               .build(),
                       ThreatType.builder()
                               .mask(32)
                               .localizedName("Пуш Аутентификатор")
                               .severityLevel(2)
                               .name("Push Authenticator")
                               .build(),
                       ThreatType.builder()
                               .mask(64)
                               .localizedName("Личные данные")
                               .severityLevel(2)
                               .name("Personal data")
                               .build()
               );
       threatTypeRepository.saveAll(threats);
   }

    private void populateApps(){
        List<SensitiveApp> apps =
                Arrays.asList(
                        SensitiveApp.builder()
                                .activityName("com.blizzard.bma")
                                .description("Аутентификатор blizzard")
                                .howBlockInfo("Нужно открепить аутентификатор, если нет доступа к учетной записи это можно сделать на странице по ссылке")
                                .link("https://eu.battle.net/support/ru/help/product/battlenet/316/977/solution")
                                .threatTypeMask(32)
                                .build(),
                        SensitiveApp.builder()
                                .activityName("com.facebook.lite")
                                .description("Социальная сеть")
                                .threatTypeMask(68).build(),
                        SensitiveApp.builder()
                                .activityName("com.idamob.tinkoff.android")
                                .description("Банковское приложение")
                                .howBlockInfo("1. Установите на все подозреваемые карты нулевые лимиты, таким образом запретив траты.\n" +
                                        "2. Смените пароль аккаунта.\n" +
                                        "3. Заблокируйте привязанный телефонный номер/сим-карту\n" +
                                        "4. Обратитесь на горячую линию 8 800 555-7778")
                                .link("https://www.tinkoff.ru/cards/debit-cards/tinkoff-black/help/protect-card/")
                                .phone("8-800-555-7778")
                                .threatTypeMask(97).build(),
                        SensitiveApp.builder()
                                .activityName("com.instagram.android")
                                .description("Социальная сеть фотографий")
                                .howBlockInfo("Смените пароль, Это разлогинит аккаунт на всех устройствах")
                                .link("https://help.instagram.com/369001149843369/?helpref=hc_fnav&bc[0]=%D0%A1%D0%BF%D1%80%D0%B0%D0%B2%D0%BE%D1%87%D0%BD%D1%8B%D0%B9%20%D1%86%D0%B5%D0%BD%D1%82%D1%80%20Instagram&bc[1]=%D0%9A%D0%BE%D0%BD%D1%84%D0%B8%D0%B4%D0%B5%D0%BD%D1%86%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D1%8C%20%D0%B8%20%D0%B1%D0%B5%D0%B7%D0%BE%D0%BF%D0%B0%D1%81%D0%BD%D0%BE%D1%81%D1%82%D1%8C&bc[2]=%D0%92%D1%85%D0%BE%D0%B4%20%D0%B8%20%D0%BF%D0%B0%D1%80%D0%BE%D0%BB%D1%8C")
                                .threatTypeMask(68).build(),
                        SensitiveApp.builder()
                                .activityName("com.patreon.android")
                                .description("Социальная сеть авторов")
                                .howBlockInfo("При смене пароля аккаунт автоматически выходит на всех устройствах.")
                                .link("\"https://support.patreon.com/hc/en-us/articles/360036537271-Reset-password\"")
                                .threatTypeMask(68).build(),
                        SensitiveApp.builder()
                                .activityName("com.skype.rider")
                                .description("Мессенджер")
                                .howBlockInfo("При смене пароля аккаунт автоматически разлогинивается на всех устройствах.")
                                .link("https://support.skype.com/ru/faq/FA95/kak-izmenit-ili-sbrosit-parol-v-skype")
                                .threatTypeMask(8).build(),
                        SensitiveApp.builder()
                                .activityName("com.valvesoftware.android.steam.community")
                                .description("Аутентификатор Steam")
                                .howBlockInfo("Это можно сделать на странице «Об аккаунте» в разделе «Настройка Steam Guard». Нажмите на кнопку «Выйти на всех других устройствах» внизу страницы. Таким образом вы отмените авторизацию на всех устройствах, в том числе и на том, которое используете в настоящий момент \n")
                                .link("https://support.steampowered.com/kb_article.php?l=russian&ref=4020-ALZM-5519#deauthorize")
                                .threatTypeMask(40).build(),
                        SensitiveApp.builder()
                                .activityName("com.viber.voip")
                                .description("Мессенджер")
                                .link("https://help.viber.com/ru/%D1%83%D1%87%D1%91%D1%82%D0%BD%D0%B0%D1%8F-%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C-%D0%B8-%D0%BD%D0%B0%D1%81%D1%82%D1%80%D0%BE%D0%B9%D0%BA%D0%B8")
                                .threatTypeMask(8).build(),
                        SensitiveApp.builder()
                                .activityName("logo.com.mbanking")
                                .description("Банковское приложение")
                                .howBlockInfo("1. Сообщите об утере по номеру 8 800 333-0303 или в ближайшем отделении банка.\n" +
                                        "2. По возможности смените номер привязанного телефона и пароль.\n")
                                .link("https://www.psbank.ru/Bank/Security")
                                .phone("8-800-333-0303")
                                .threatTypeMask(97).build(),
                        SensitiveApp.builder()
                                .activityName("com.android.gmail")
                                .description("Почтовый клиент")
                                .howBlockInfo("В настройках Google аккаунта смените пароль, выйдите из устройств.\n" +
                                                "Это отключит все приложения связанные с Google аккаунтом.\n" +
                                                "Если настроена функция поиска устройства, то можно заблокировать весь телефон. \n"
                                        ).link("https://myaccount.google.com/security")
                                .threatTypeMask(16).build(),
                        SensitiveApp.builder()
                                .activityName("com.Slack")
                                .description("Мессенджер")
                                .howBlockInfo("Заблокировать аккаунт можно из настроек польщователя, так-же администратор рабочего пространства может сделать это.\n"
                                        ).link("https://slack.com/intl/en-ru/help/articles/204475027-Deactivate-a-members-account#free,-standard,-and-plus-plans-1")
                                .threatTypeMask(8).build(),
                        SensitiveApp.builder()
                                .activityName("com.avito.android")
                                .description("Торговая площадка")
                                .howBlockInfo("1. Заблокируйте номер." +
                                        "2. Смените пароль, почту и номер телефона. Перед удалением номера нужно добавить новый, т.к. аккаунт обязан быьт привязан к хотя бы одному номеру.\n"
                                        ).link("https://support.avito.ru/sections/408")
                                .threatTypeMask(10).build(),
                        SensitiveApp.builder()
                                .activityName("ru.yoo.money")
                                .description("Платежная система")
                                .howBlockInfo("1. Позвоните по телефону 8-800-250-66-99, сообщите номер счета.\nn" +
                                        "2. При возможности сотрите данные с телефона удаленно, заблокируйте симкарту с номером, на который зарегистрирован кошелек.\n"
                                        ).link("https://yoomoney.ru/security?_openstat=template%3Bifooter%3Bhelp%3Bsecurity")
                                .threatTypeMask(97)
                                .phone("8-800-250-6699").build(),
                        SensitiveApp.builder()
                                .activityName("tv.twitch.android.app")
                                .description("Площадка для стриминга")
                                .howBlockInfo("Для выхода со всех устройств достаточно сменить пароль.\n"
                                        ).link("https://help.twitch.tv/s/article/twitch-account-settings?language=ru")
                                .threatTypeMask(4).build(),
                        SensitiveApp.builder()
                                .activityName("ru.letobank.Prometheus")
                                .description("Банк")
                                .howBlockInfo("1. Заблокируйте карту по телефону +7-495-532-13-00 или в ближайшем отделении банка. Возможно вам понадобится кодовое слово и паспорт." +
                                        "2. При доступе к аккаунту смените номер телефона и пароль")
                                .threatTypeMask(97)
                                .phone("+7-495-532-1300")
                        .phone("+7-495-532-13-00").build(),
                        SensitiveApp.builder()
                                .activityName("ru.sberbankmobile")
                                .description("Банк")
                                .howBlockInfo("1. В блоке «Мобильные приложения» системы Сбербанк ОнЛайн Вы можете просмотреть свои подключенные к системе устройства и отключить их.\n" +
                                        "2. При недоступности сбербанка-онлайн заблокировать карту можно по телефону 900\n" +
                                        "3. Смените привязанный номер телефона и пароль в сбербанк-онлайн или в ближайшем отделении\n"
                                        ).link("https://www.sberbank.ru/ru/person/help/debet_cards_faq/1423")
                                .phone("8-800-555-5550")
                                .threatTypeMask(97).build(),
                        SensitiveApp.builder()
                                .activityName("ru.rostel")
                                .description("Портал госуслуг")
                                .howBlockInfo("1. Измените пароль на портале госуслуг с другого устройства .\n" +
                                        "2. Обратитесь в ближайшее отделение госуслуг")
                                .link("https://www.gosuslugi.ru/help/faq/c-1/2")
                                .threatTypeMask(40).build()
                        );

        sensitiveAppRepository.saveAll(apps);
    }
}
