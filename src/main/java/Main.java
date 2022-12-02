import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
    private final static String BOT_TOKEN_SECRET = "api_secret";
    private final static String BOT_USERNAME = "bot_username";

    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            ScanningBot olxSniperBot = new OlxScanningBot(BOT_TOKEN_SECRET, BOT_USERNAME);
            botsApi.registerBot(olxSniperBot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}