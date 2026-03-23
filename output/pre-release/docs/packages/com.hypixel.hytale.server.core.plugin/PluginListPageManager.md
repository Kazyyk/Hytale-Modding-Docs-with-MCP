---
title: "PluginListPageManager"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.PluginListPageManager"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public class PluginListPageManager
```

Manages plugin list UI pages. Notifies registered pages when plugins are enabled or disabled.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `PluginListPageManager` | `get()` |
| `public` | `void` | `registerPluginListPage(@Nonnull PluginListPage page)` |
| `public` | `void` | `deregisterPluginListPage(@Nonnull PluginListPage page)` |
| `public` | `void` | `notifyPluginChange(@Nonnull Map<PluginIdentifier, PluginBase> plugins, @Nonnull PluginIdentifier pluginIdentifier)` |

## Inner Classes

### SessionSettings

`Component<EntityStore>` that stores per-player plugin list display settings.
