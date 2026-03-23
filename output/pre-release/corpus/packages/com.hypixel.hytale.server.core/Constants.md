# Constants

Type: class | Package: com.hypixel.hytale.server.core

public final class Constants

Server-wide constants derived from command-line options and runtime checks. Provides static final flags for debug mode, singleplayer mode, self-op permission, fresh universe detection, network flush behavior, and the universe path. Also defines the ordered list of core plugin manifests (`CORE_PLUGINS`) that are registered during server startup.

## Constants

- public static final boolean DEBUG` (= `true`)
- public static final boolean SINGLEPLAYER
- public static final boolean ALLOWS_SELF_OP_COMMAND
- public static final boolean FRESH_UNIVERSE
- public static final boolean FORCE_NETWORK_FLUSH
- public static final Path UNIVERSE_PATH
- @Nonnull public static final PluginManifest[] CORE_PLUGINS

## Methods

- public static void init()
- public static boolean shouldSkipModValidation()

Also in this package: AuthMode, AuthModeConverter, Defaults, HytaleServer, HytaleServerConfig, LevelValueConverter, MaybeBoolCodec, Message, Module, NameMatching, Options, ParamValueCodec, PathConverter, PathType, RecoveryMode, ShutdownReason, SocketAddressValueConverter, StringToPathMapConverter, TimeoutProfile, UUIDConverter

Complete API:
  public static void init()
  private static boolean checkFreshUniverse()
  private static Path getUniversePath()

Fields:
private static final OptionSet OPTION_SET
public static final boolean DEBUG
public static final boolean SINGLEPLAYER
public static final boolean ALLOWS_SELF_OP_COMMAND
public static final boolean FRESH_UNIVERSE
public static final boolean FORCE_NETWORK_FLUSH
public static final Path UNIVERSE_PATH
public static final PluginManifest[] CORE_PLUGINS
