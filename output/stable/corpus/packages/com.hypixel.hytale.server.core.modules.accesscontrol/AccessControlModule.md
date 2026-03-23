# AccessControlModule

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol | Extends: JavaPlugin

public class AccessControlModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static AccessControlModule instance
- private final HytaleWhitelistProvider whitelistProvider
- private final HytaleBanProvider banProvider
- private final List<AccessProvider> providerRegistry
- private final Map<String,BanParser> parsers

## Methods

- public static AccessControlModule get()
- @Override protected void setup()
- @Override protected void start()
- @Override protected void shutdown()
- public void registerBanParser(String type, BanParser banParser)
- public void registerAccessProvider(AccessProvider provider)
- public Ban parseBan(String type, JsonObject object)
- @Nonnull private CompletableFuture<Optional<String>> getDisconnectReason(UUID uuid)

Complete API:
  public static AccessControlModule get()
  protected void setup()
  protected void start()
  protected void shutdown()
  public void registerBanParser(String type, BanParser banParser)
  public void registerAccessProvider(AccessProvider provider)
  public Ban parseBan(String type, JsonObject object)
  private CompletableFuture<Optional<String>> getDisconnectReason(UUID uuid)

Fields:
public static final PluginManifest MANIFEST
private static AccessControlModule instance
private final HytaleWhitelistProvider whitelistProvider
private final HytaleBanProvider banProvider
private final List<AccessProvider> providerRegistry
private final Map<String,BanParser> parsers
