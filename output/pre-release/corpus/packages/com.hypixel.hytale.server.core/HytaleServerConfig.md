# HytaleServerConfig

Type: class | Package: com.hypixel.hytale.server.core

public class HytaleServerConfig

The server configuration model, loaded from `config.json`. Manages server name, MOTD, password, max players, max view radius, default world/gamemode, connection timeouts, rate limits, module configs, log levels, mod configs, player storage provider, auth credential store, update config, and backup config. Supports versioned codec deserialization (current version: 4) with legacy migration.

## Inner Classes

- Defaults | class | Default world name and game mode settings.
- Module | class | Per-module configuration with enabled flag and nested document data.
- TimeoutProfile | class | Connection timeout durations for each authentication/setup phase.

## Key Methods

- @Nonnull public static HytaleServerConfig load()
- @Nonnull public static CompletableFuture<Void> save(@Nonnull HytaleServerConfig hytaleServerConfig)
- public String getServerName()
- public void setServerName(@Nonnull String serverName)
- public String getMotd()
- public int getMaxPlayers()
- public void setMaxPlayers(int maxPlayers)
- public int getMaxViewRadius()
- @Nonnull public HytaleServerConfig.Defaults getDefaults()
- @Nonnull public Map<String, HytaleServerConfig.Module> getModules()
- @Nonnull public Map<PluginIdentifier, ModConfig> getModConfig()
- public boolean shouldSkipModValidation()
- public void markChanged()

Also in this package: AuthMode, AuthModeConverter, Constants, Defaults, HytaleServer, LevelValueConverter, MaybeBoolCodec, Message, Module, NameMatching, Options, ParamValueCodec, PathConverter, PathType, RecoveryMode, ShutdownReason, SocketAddressValueConverter, StringToPathMapConverter, TimeoutProfile, UUIDConverter

Complete API:
  public static void setBoot(HytaleServerConfig serverConfig, PluginIdentifier identifier, boolean enabled)
  public String getServerName()
  public void setServerName(String serverName)
  public String getMotd()
  public void setMotd(String motd)
  public String getPassword()
  public void setPassword(String password)
  public boolean isDisplayTmpTagsInStrings()
  public void setDisplayTmpTagsInStrings(boolean displayTmpTagsInStrings)
  public int getMaxPlayers()
  public void setMaxPlayers(int maxPlayers)
  public int getMaxViewRadius()
  public void setMaxViewRadius(int maxViewRadius)
  public HytaleServerConfig.Defaults getDefaults()
  public void setDefaults(HytaleServerConfig.Defaults defaults)
  public HytaleServerConfig.TimeoutProfile getConnectionTimeouts()
  public void setConnectionTimeouts(HytaleServerConfig.TimeoutProfile connectionTimeouts)
  public RateLimitConfig getRateLimitConfig()
  public void setRateLimitConfig(RateLimitConfig rateLimitConfig)
  public Map<String,HytaleServerConfig.Module> getModules()
  public HytaleServerConfig.Module getModule(String moduleName)
  public void setModules(Map<String,HytaleServerConfig.Module> modules)
  public Map<String,Level> getLogLevels()
  public void setLogLevels(Map<String,Level> logLevels)
  public Map<PluginIdentifier,ModConfig> getModConfig()
  public void setModConfig(Map<PluginIdentifier,ModConfig> modConfig)
  public boolean getDefaultModsEnabled()
  public PlayerStorageProvider getPlayerStorageProvider()
  public void setPlayerStorageProvider(PlayerStorageProvider playerStorageProvider)
  public AuthCredentialStoreProvider getAuthCredentialStoreProvider()
  public void setAuthCredentialStoreProvider(AuthCredentialStoreProvider provider)
  public UpdateConfig getUpdateConfig()
  public void setUpdateConfig(UpdateConfig updateConfig)
  public BackupConfig getBackupConfig()
  public void setBackupConfig(BackupConfig backupConfig)
  public HostAddress getFallbackServer()
  public void setFallbackServer(HostAddress fallbackServer)
  public ServerWorldMapConfig getWorldMapConfig()
  public void setWorldMapConfig(ServerWorldMapConfig worldMapConfig)
  public void removeModule(String module)
  public void markChanged()
  public boolean consumeHasChanged()
  public static HytaleServerConfig load()
  public static HytaleServerConfig load(Path path)
  public static CompletableFuture<Void> save(HytaleServerConfig hytaleServerConfig)
  public static CompletableFuture<Void> save(Path path, HytaleServerConfig hytaleServerConfig)

Fields:
public static final int VERSION
public static final int DEFAULT_MAX_VIEW_RADIUS
public static final Path PATH
public static final BuilderCodec<HytaleServerConfig> CODEC
private final transient AtomicBoolean hasChanged
private String serverName
private String motd
private String password
private int maxPlayers
private int maxViewRadius
private HytaleServerConfig.Defaults defaults
private HytaleServerConfig.TimeoutProfile connectionTimeouts
private RateLimitConfig rateLimitConfig
private Map<String,HytaleServerConfig.Module> modules
private Map<String,Level> logLevels
private transient Map<PluginIdentifier,ModConfig> legacyPluginConfig
private Map<PluginIdentifier,ModConfig> modConfig
private Boolean defaultModsEnabled
private Map<String,HytaleServerConfig.Module> unmodifiableModules
private Map<String,Level> unmodifiableLogLevels
private PlayerStorageProvider playerStorageProvider
private BsonDocument authCredentialStoreConfig
private transient AuthCredentialStoreProvider authCredentialStoreProvider
private boolean displayTmpTagsInStrings
private UpdateConfig updateConfig
private BackupConfig backupConfig
private ServerWorldMapConfig worldMapConfig
private HostAddress fallbackServer
