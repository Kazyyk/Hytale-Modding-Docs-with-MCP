---
title: "I18nModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.i18n"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.I18nModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "modules"
  - "i18n"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.i18n`

```java
public class I18nModule extends JavaPlugin
```

Plugin class that registers components, systems, and commands for the i18n subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` | `PluginManifest.corePlugin(I18nModule.class).depends(AssetModule.class).build()` |
| `public static final` | `String` | `DEFAULT_LANGUAGE` | `"en-US"` |
| `public static final` | `Path` | `FALLBACK_LANG_PATH` | `Paths.get("fallback.lang")` |
| `public static final` | `String` | `FILE_EXTENSION` | `".lang"` |
| `public static final` | `String` | `SERVER_ASSETS` | `"Server"` |
| `public static final` | `String` | `LANGUAGE_ASSETS` | `"Languages"` |
| `public static final` | `Path` | `DEFAULT_GENERATED_PATH` | `Path.of("Server", "Languages", "en-US")` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static I18nModule` | `get()` |
| `` | `` | `super(parent)` |
| `@Override protected` | `void` | `setup()` |
| `@Override protected` | `void` | `start()` |
| `` | `private void` | `loadMessagesFromPack(AssetPack pack)` |
| `@Nonnull public` | `UpdateTranslations[]` | `getUpdatePacketsForChanges(String languageKey, @Nonnull Map<String, Map<String, String>> changed, @Nonnull Map<String, Map<String, String>> removed)` |
| `` | `private void` | `addDefaultMessages(@Nonnull Map<String, String> messages, boolean isInitial)` |
| `` | `private int` | `loadMessages(String languageKey, @Nonnull Path languagePath)` |
| `` | `private int` | `loadMessagesFrom(@Nonnull Map<String, String> messages, String prefix, @Nonnull Path path)` |
| `@Nonnull private` | `String` | `getPrefix(@Nonnull Path languagePath, @Nonnull Path path)` |
| `@Nonnull public` | `Map<String, String>` | `getMessages(String language)` |
| `` | `public Map<String, String>` | `getMessages(@Nonnull Map<String, Map<String, String>> languageMap, @Nullable String language)` |
| `` | `public void` | `sendTranslations(@Nonnull PacketHandler packetHandler, String language)` |
| `@Nullable public` | `String` | `getMessage(String language, @Nonnull String key)` |
| `` | `public` | `I18nAssetMonitorHandler(Path languagesPath)` |
| `@Override public` | `Object` | `getKey()` |
| `` | `public boolean` | `test(Path path, EventKind eventKind)` |
| `` | `public void` | `accept(Map<Path, EventKind> map)` |
