# GenerateDefaultLanguageEvent

Type: class | Package: com.hypixel.hytale.server.core.modules.i18n.event | Implements: IEvent

public class GenerateDefaultLanguageEvent implements IEvent<Void>

Server lifecycle event.

## Methods

- putTranslationFile(String filename, TranslationMap translations) | void | Instance method.

Also in this package: MessagesUpdated

Complete API:
  public void putTranslationFile(String filename, TranslationMap translations)

Fields:
private final ConcurrentHashMap<String,TranslationMap> translationFiles
