---
title: "PluginListPage"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.pages"
fqcn: "com.hypixel.hytale.server.core.plugin.pages.PluginListPage"
api_surface: true
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "plugin"
---
**Package:** `com.hypixel.hytale.server.core.plugin.pages`

```java
public class PluginListPage extends InteractiveCustomUIPage<PluginListPage.PluginListPageEventData>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `PluginListPage.PluginDetails` | `selectedPlugin` |
| `private` | `PluginListPageManager.SessionSettings` | `playerSessionSettings` |
| `private final` | `PluginManifest` | `manifest` |
| `private final` | `PluginIdentifier` | `identifier` |
| `private` | `String` | `plugin` |
| `private` | `String` | `option` |
| `private` | `String` | `type` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `PluginListPage(@Nonnull PlayerRef playerRef)` |
| `public` | `void` | `build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull PluginListPage.PluginListPageEventData data)` |
| `public` | `void` | `onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
| `private` | `void` | `buildPluginList(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)` |
| `private` | `void` | `selectPlugin(@Nonnull String playerSelectedPlugin, @Nonnull UICommandBuilder commandBuilder)` |
| `private` | `void` | `checkBoxChanged(@Nonnull String pluginName, @Nonnull UICommandBuilder commandBuilder)` |
| `public` | `void` | `handlePluginChangeEvent(@Nonnull PluginIdentifier plugin, boolean activeState)` |
