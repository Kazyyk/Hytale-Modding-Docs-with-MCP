---
title: "BuilderTool"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.BuilderTool"
api_surface: true
extends: null
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, BuilderTool>>"
  - "NetworkSerializable<BuilderToolState>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "buildertool"
  - "asset"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config`

```java
public class BuilderTool implements JsonAssetWithMap<String, DefaultAssetMap<String, BuilderTool>>, NetworkSerializable<BuilderToolState>
```

Asset defining a builder tool with configurable arguments and optional brush data. Tools are loaded from JSON and associated with items via `BuilderToolData`. Supports runtime argument updates, item metadata serialization, and network packet conversion.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `TOOL_DATA_KEY` |
| `public static final` | `KeyedCodec<BrushData.Values>` | `BRUSH_DATA_KEY_CODEC` |
| `public static final` | `BuilderTool` | `DEFAULT` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `DefaultAssetMap<String, BuilderTool>` | `getAssetMap()` |
| `public static` | `BuilderTool` | `getActiveBuilderTool(Player player)` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getBrushConfigurationCommand()` |
| `public` | `boolean` | `isBrush()` |
| `public` | `BrushData` | `getBrushData()` |
| `public` | `Map<String, ToolArg>` | `getArgs()` |
| `public` | `MapProvidedMapCodec<Object, ToolArg>` | `getArgsCodec()` |
| `public` | `BuilderTool.ArgData` | `getItemArgData(ItemStack itemStack)` |
| `public` | `ItemStack` | `createItemStack(String itemId, int quantity, BuilderTool.ArgData argData)` |
| `public` | `ItemStack` | `updateArgMetadata(ItemStack itemStack, BuilderToolArgGroup group, String id, String value)` |
| `public` | `BuilderToolState` | `toPacket()` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `BuilderTool.ArgData` | record | Holds tool arguments and brush values |
