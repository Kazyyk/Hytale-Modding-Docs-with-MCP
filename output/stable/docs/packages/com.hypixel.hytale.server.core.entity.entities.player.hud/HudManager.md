---
title: "HudManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.hud"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.hud.HudManager"
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
public class HudManager
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Set<HudComponent>` | `DEFAULT_HUD_COMPONENTS` |
| `private final` | `Set<HudComponent>` | `visibleHudComponents` |
| `private final` | `Set<HudComponent>` | `unmodifiableVisibleHudComponents` |
| `private` | `CustomUIHud` | `customHud` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `CustomUIHud` | `getCustomHud()` |
| `@Nonnull public` | `Set<HudComponent>` | `getVisibleHudComponents()` |
| `public` | `void` | `setVisibleHudComponents(PlayerRef ref, HudComponent hudComponents)` |
| `public` | `void` | `setVisibleHudComponents(PlayerRef ref, Set<HudComponent> hudComponents)` |
| `public` | `void` | `showHudComponents(PlayerRef ref, HudComponent hudComponents)` |
| `public` | `void` | `showHudComponents(PlayerRef ref, Set<HudComponent> hudComponents)` |
| `public` | `void` | `hideHudComponents(PlayerRef ref, HudComponent hudComponents)` |
| `public` | `void` | `setCustomHud(PlayerRef ref, CustomUIHud hud)` |
| `public` | `void` | `resetHud(PlayerRef ref)` |
| `public` | `void` | `resetUserInterface(PlayerRef ref)` |
| `public` | `void` | `sendVisibleHudComponents(PacketHandler packetHandler)` |
| `@Nonnull @Override public` | `String` | `toString()` |
