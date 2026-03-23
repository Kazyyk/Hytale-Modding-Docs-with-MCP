# MessageUtil

Type: class | Package: com.hypixel.hytale.server.core.util

public class MessageUtil

Utility class for message formatting, ANSI rendering, and internationalization text processing. Provides ICU-style message formatting with support for plural rules, select expressions, number/date/time formatting, and nested parameter substitution. Includes plural category implementations for 17+ languages.

## Key Static Methods

- toAnsiString(Message) | AttributedString | Converts a `Message` to an ANSI-styled string for terminal output, applying hex color codes.
- hexToStyle(String) | AttributedStyle | Parses a hex color string and returns the nearest 256-color ANSI style.
- containsControlCharacters(String) | boolean | Checks for ASCII control characters, DEL, and C1 control codes (U+0080..U+009F).
- formatMessageToPlainString(FormattedMessage) | String | Recursively formats a `FormattedMessage` to plain text, resolving translation keys via `I18nModule`.
- sendSuccessReply(PlayerRef, int, Message) | void | Sends a `SuccessReply` packet to a player. Deprecated.
- sendFailureReply(PlayerRef, int, Message) | void | Sends a `FailureReply` packet to a player. Deprecated.
- formatText(String, Map<String, ParamValue>, Map<String, FormattedMessage>) | String | ICU-style text formatter supporting `{key}`, `{key, format}`, and `{key, format, options}` patterns.

## Format Types

The `formatText` method supports these format specifiers:

- upper | Converts string parameter to uppercase.
- lower | Converts string parameter to lowercase.
- number | Formats as number with `integer` or `decimal` options.
- plural | ICU plural selection with `zero`, `one`, `two`, `few`, `many`, `other` keywords.
- date | Formats a timestamp as a localized short date.
- time | Formats a timestamp as a localized short time.
- select | ICU select expression choosing text by key match.

Also in this package: AssetUtil, BsonUtil, ChangeReason, Config, ConsoleColorUtil, DumpUtil, EventTitleUtil, FillerBlockUtil, FillerFetcher, HashUtil, NotificationUtil, PlayerTextData, PositionUtil, PrefabUtil, ProcessUtil, ServiceHttpClientFactory, TargetBuffer, TargetBufferLocation, TargetUtil, TempAssetIdUtil (and 4 more)

Complete API:
  public static AttributedString toAnsiString(Message message)
  public static AttributedStyle hexToStyle(String str)
  public static boolean containsControlCharacters(String message)
  public static String formatMessageToPlainString(FormattedMessage msg)
  public static void sendSuccessReply(PlayerRef playerRef, int token)
  public static void sendSuccessReply(PlayerRef playerRef, int token, Message message)
  public static void sendFailureReply(PlayerRef playerRef, int token, Message message)
  public static String formatText(String text, Map<String,ParamValue> params, Map<String,FormattedMessage> messageParams)
  private static int findMatchingBrace(String text, int start)
  private static int trimStart(String text, int start, int end)
  private static int trimEnd(String text, int start, int end)
  private static Map<String,String> parsePluralOptions(String options)
  private static String getPluralCategory(int n, String locale)
  private static String getEnglishPluralCategory(int n)
  private static String getFrenchPluralCategory(int n)
  private static String getGermanPluralCategory(int n)
  private static String getPortuguesePluralCategory(int n)
  private static String getPortugueseBrazilianPluralCategory(int n)
  private static String getRussianPluralCategory(int n)
  private static String getSpanishPluralCategory(int n)
  private static String getPolishPluralCategory(int n)
  private static String getTurkishPluralCategory(int n)
  private static String getUkrainianPluralCategory(int n)
  private static String getItalianPluralCategory(int n)
  private static String getDutchPluralCategory(int n)
  private static String getDanishPluralCategory(int n)
  private static String getFinnishPluralCategory(int n)
  private static String getNorwegianPluralCategory(int n)
  private static String getChinesePluralCategory(int n)
  private static String getJapanesePluralCategory(int n)
  private static String getKoreanPluralCategory(int n)
  private static Map<String,String> parseSelectOptions(String options)
  private static Instant parseDateTime(ParamValue value)

Fields:
private static final String[] ICU_PLURAL_KEYWORDS
