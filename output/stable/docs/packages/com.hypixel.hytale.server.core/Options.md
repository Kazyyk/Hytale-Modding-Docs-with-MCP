---
title: "Options"
kind: "class"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.Options"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "core"
  - "server"
  - "cli"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public class Options
```

Defines all command-line options for the Hytale server using `joptsimple`. Each option is a `public static final OptionSpec` field. Provides the `parse(String[])` method to process arguments and populates the `OptionSet` accessible via `getOptionSet()`.

## Key Option Specs

| Name | Type | Description |
|---|---|---|
| `HELP` | `Void` | Print help message. |
| `VERSION` | `Void` | Print version information. |
| `BIND` | `InetSocketAddress` | Port(s) to listen on (default: 5520). |
| `TRANSPORT` | `TransportType` | Transport type (default: QUIC). |
| `ASSET_DIRECTORY` | `Path` | Asset directory (default: `../HytaleAssets`). |
| `MODS_DIRECTORIES` | `Path` | Additional mod directories. |
| `SINGLEPLAYER` | `Void` | Run in singleplayer mode. |
| `UNIVERSE` | `Path` | Universe directory. |
| `AUTH_MODE` | `AuthMode` | Authentication mode (default: AUTHENTICATED). |
| `BOOT_COMMAND` | `String` | Commands to run on boot. |

## Inner Classes

| Type | Kind | Description |
|---|---|---|
| `AuthMode` | enum | `AUTHENTICATED`, `OFFLINE`, `INSECURE` |
| `LevelValueConverter` | class | Converts `name:LEVEL` strings to `Map.Entry<String, Level>`. |
| `PathConverter` | class | Validates and converts path strings. |
| `SocketAddressValueConverter` | class | Parses `host:port` strings to `InetSocketAddress`. |
| `StringToPathMapConverter` | class | Parses `key=path` maps. |
| `UUIDConverter` | class | Parses UUID strings. |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `OptionSet` | `getOptionSet()` |
| `public static` | `<T> T` | `getOrDefault(OptionSpec<T> optionSpec, @Nonnull OptionSet optionSet, T def)` |
| `public static` | `boolean` | `parse(String[] args)` |
