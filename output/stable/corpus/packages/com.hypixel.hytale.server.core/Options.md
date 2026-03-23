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
