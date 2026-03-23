# Options

Type: class | Package: com.hypixel.hytale.server.core

public class Options

Defines all command-line options for the Hytale server using `joptsimple`. Each option is a `public static final OptionSpec` field. Provides the `parse(String[])` method to process arguments and populates the `OptionSet` accessible via `getOptionSet()`.

## Key Option Specs

- Void HELP
- Void VERSION
- InetSocketAddress BIND
- TransportType TRANSPORT
- Path ASSET_DIRECTORY
- Path MODS_DIRECTORIES
- Void SINGLEPLAYER
- Path UNIVERSE
- AuthMode AUTH_MODE
- String BOOT_COMMAND

## Inner Classes

- AuthMode | enum | AUTHENTICATED`, `OFFLINE`, `INSECURE
- LevelValueConverter | class | Converts `name:LEVEL` strings to `Map.Entry<String, Level>`.
- PathConverter | class | Validates and converts path strings.
- SocketAddressValueConverter | class | Parses `host:port` strings to `InetSocketAddress`.
- StringToPathMapConverter | class | Parses `key=path` maps.
- UUIDConverter | class | Parses UUID strings.

## Methods

- public static OptionSet getOptionSet()
- public static <T> T getOrDefault(OptionSpec<T> optionSpec, @Nonnull OptionSet optionSet, T def)
- public static boolean parse(String[] args)

Also in this package: AuthMode, AuthModeConverter, Constants, Defaults, HytaleServer, HytaleServerConfig, LevelValueConverter, MaybeBoolCodec, Message, Module, NameMatching, ParamValueCodec, PathConverter, PathType, RecoveryMode, ShutdownReason, SocketAddressValueConverter, StringToPathMapConverter, TimeoutProfile, UUIDConverter

Complete API:
  public static OptionSet getOptionSet()
  public static T getOrDefault(OptionSpec<T> optionSpec, OptionSet optionSet, T def)
  public static boolean parse(String[] args)

Fields:
public static final OptionParser PARSER
public static final OptionSpec<Void> HELP
public static final OptionSpec<Void> VERSION
public static final OptionSpec<Void> BARE
public static final OptionSpec<Entry<String,Level>> LOG_LEVELS
public static final OptionSpec<InetSocketAddress> BIND
public static final OptionSpec<TransportType> TRANSPORT
public static final OptionSpec<Void> DISABLE_CPB_BUILD
public static final OptionSpec<Path> PREFAB_CACHE_DIRECTORY
public static final OptionSpec<Path> ASSET_DIRECTORY
public static final OptionSpec<Path> MODS_DIRECTORIES
public static final OptionSpec<Void> ACCEPT_EARLY_PLUGINS
public static final OptionSpec<Path> EARLY_PLUGIN_DIRECTORIES
public static final OptionSpec<Void> VALIDATE_ASSETS
public static final OptionSpec<ValidationOption> VALIDATE_PREFABS
public static final OptionSpec<Void> VALIDATE_WORLD_GEN
public static final OptionSpec<Void> SHUTDOWN_AFTER_VALIDATE
public static final OptionSpec<Path> GENERATE_ASSET_SCHEMA
public static final OptionSpec<Path> GENERATE_CONFIG_SCHEMA
public static final OptionSpec<Path> WORLD_GEN_DIRECTORY
public static final OptionSpec<Void> DISABLE_FILE_WATCHER
public static final OptionSpec<Void> DISABLE_SENTRY
public static final OptionSpec<Void> DISABLE_ASSET_COMPARE
public static final OptionSpec<Void> BACKUP
public static final OptionSpec<Integer> BACKUP_FREQUENCY_MINUTES
public static final OptionSpec<Path> BACKUP_DIRECTORY
public static final OptionSpec<Integer> BACKUP_MAX_COUNT
public static final OptionSpec<Integer> BACKUP_ARCHIVE_MAX_COUNT
public static final OptionSpec<Void> SINGLEPLAYER
public static final OptionSpec<String> OWNER_NAME
public static final OptionSpec<UUID> OWNER_UUID
public static final OptionSpec<Integer> CLIENT_PID
public static final OptionSpec<Path> UNIVERSE
public static final OptionSpec<Void> EVENT_DEBUG
public static final OptionSpec<Boolean> FORCE_NETWORK_FLUSH
public static final OptionSpec<Map<String,Path>> MIGRATIONS
public static final OptionSpec<String> MIGRATE_WORLDS
public static final OptionSpec<String> BOOT_COMMAND
public static final OptionSpec<Void> IGNORE_BROKEN_MODS
public static final String ALLOW_SELF_OP_COMMAND_STRING
public static final OptionSpec<Void> ALLOW_SELF_OP_COMMAND
public static final OptionSpec<Options.AuthMode> AUTH_MODE
public static final OptionSpec<String> SESSION_TOKEN
public static final OptionSpec<String> IDENTITY_TOKEN
public static final OptionSpec<Void> VERIFY_WORLDS
public static final OptionSpec<Options.RecoveryMode> RECOVERY_MODE
private static OptionSet optionSet
