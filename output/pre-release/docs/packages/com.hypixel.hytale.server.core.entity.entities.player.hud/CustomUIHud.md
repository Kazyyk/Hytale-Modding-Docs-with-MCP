---
title: "CustomUIHud"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.hud"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.hud.CustomUIHud"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "hud"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.hud`

```java
public abstract class CustomUIHud
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `PlayerRef` | `playerRef` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `show()` |
| `public` | `void` | `update(boolean clear, UICommandBuilder commandBuilder)` |
| `@Nonnull public` | `PlayerRef` | `getPlayerRef()` |
| `protected abstract` | `void` | `build(UICommandBuilder var1)` |
