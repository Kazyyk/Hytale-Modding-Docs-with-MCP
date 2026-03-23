---
title: "AnchorActionModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.anchoraction"
fqcn: "com.hypixel.hytale.server.core.modules.anchoraction.AnchorActionModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "anchoraction"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.anchoraction`

```java
public class AnchorActionModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static final` | `HytaleLogger` | `LOGGER` |
| `private static` | `AnchorActionModule` | `instance` |
| `private final` | `Map<String,AnchorActionHandler>` | `handlers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AnchorActionModule` | `get()` |
| `public` | `void` | `register(String action, AnchorActionHandler handler)` |
| `public` | `void` | `register(String action, AnchorActionModule.WorldThreadAnchorActionHandler handler)` |
| `public` | `void` | `unregister(String action)` |
| `public` | `boolean` | `tryHandle(PlayerRef playerRef, String rawData)` |

## Inner Types

- `AnchorActionModule.WorldThreadAnchorActionHandler`
