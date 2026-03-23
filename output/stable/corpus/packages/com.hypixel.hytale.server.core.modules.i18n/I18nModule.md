# I18nModule

Type: class | Package: com.hypixel.hytale.server.core.modules.i18n | Extends: JavaPlugin

public class I18nModule extends JavaPlugin

Plugin class that registers components, systems, and commands for the i18n subsystem.

## Constants

- public static final PluginManifest MANIFEST
- public static final String DEFAULT_LANGUAGE
- public static final Path FALLBACK_LANG_PATH
- public static final String FILE_EXTENSION
- public static final String SERVER_ASSETS
- public static final String LANGUAGE_ASSETS
- public static final Path DEFAULT_GENERATED_PATH

## Methods

- public static I18nModule get()
- super(parent)
- @Override protected void setup()
- @Override protected void start()
- private void loadMessagesFromPack(AssetPack pack)
- @Nonnull public UpdateTranslations[] getUpdatePacketsForChanges(String languageKey, @Nonnull Map<String, Map<String, String>> changed, @Nonnull Map<String, Map<String, String>> removed)
- private void addDefaultMessages(@Nonnull Map<String, String> messages, boolean isInitial)
- private int loadMessages(String languageKey, @Nonnull Path languagePath)
- private int loadMessagesFrom(@Nonnull Map<String, String> messages, String prefix, @Nonnull Path path)
- @Nonnull private String getPrefix(@Nonnull Path languagePath, @Nonnull Path path)
- @Nonnull public Map<String, String> getMessages(String language)
- public Map<String, String> getMessages(@Nonnull Map<String, Map<String, String>> languageMap, @Nullable String language)
- public void sendTranslations(@Nonnull PacketHandler packetHandler, String language)
- @Nullable public String getMessage(String language, @Nonnull String key)
- public I18nAssetMonitorHandler(Path languagesPath)
- @Override public Object getKey()
- public boolean test(Path path, EventKind eventKind)
- public void accept(Map<Path, EventKind> map)

Also in this package: I18nAssetMonitorHandler

Complete API:
  public static I18nModule get()
  protected void setup()
  protected void start()
  private void loadMessagesFromPack(AssetPack pack)
  public UpdateTranslations[] getUpdatePacketsForChanges(String languageKey, Map<String,Map<String,String>> changed, Map<String,Map<String,String>> removed)
  private void addDefaultMessages(Map<String,String> messages, boolean isInitial)
  private int loadMessages(String languageKey, Path languagePath)
  private int loadMessagesFrom(Map<String,String> messages, String prefix, Path path)
  private String getPrefix(Path languagePath, Path path)
  public Map<String,String> getMessages(String language)
  public Map<String,String> getMessages(Map<String,Map<String,String>> languageMap, String language)
  public void sendTranslations(PacketHandler packetHandler, String language)
  public String getMessage(String language, String key)

Fields:
public static final PluginManifest MANIFEST
public static final String DEFAULT_LANGUAGE
public static final Path FALLBACK_LANG_PATH
public static final String FILE_EXTENSION
public static final String SERVER_ASSETS
public static final String LANGUAGE_ASSETS
public static final Path DEFAULT_GENERATED_PATH
private static I18nModule instance
private final Map<String,String> fallbacks
private final Map<String,Map<String,String>> languages
private final Map<String,Map<String,String>> cachedLanguages
