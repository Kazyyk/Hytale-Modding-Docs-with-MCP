---
title: "PlayerSleep"
kind: "interface"
package: "com.hypixel.hytale.builtin.beds.sleep.components"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.components.PlayerSleep"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "sleep"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.components`

```java
public sealed interface PlayerSleep permits PlayerSleep.FullyAwake, PlayerSleep.MorningWakeUp, PlayerSleep.NoddingOff, PlayerSleep.Slumber
```

Interface defining: `ofHours()`, `MorningWakeUp()`, `PlayerSomnolence()`, `plus()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `MorningWakeUp(@Nullable Instant gameTimeStart)` | `record` | public method. |
| `NoddingOff(Instant realTimeStart)` | `record` | public method. |
| `Slumber(Instant gameTimeStart)` | `record` | public method. |
