---
title: "Interaction"
kind: "abstract class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Interaction"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "interaction"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public abstract class Interaction
```

Abstract polymorphic base class for the interaction/ability system. Uses VarInt type-ID discriminated union with 45 concrete subtypes. Contains common fields for effects, timing, rules, and camera.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [WaitForDataFrom](WaitForDataFrom.md) | `waitForDataFrom` | No |  Default: `WaitForDataFrom.Client`. |
| [InteractionEffects](InteractionEffects.md) | `effects` | Yes |  |
| `float` | `horizontalSpeedMultiplier` | No |  |
| `float` | `runTime` | No |  |
| `boolean` | `cancelOnItemChange` | No |  |
| `Map<`[GameMode](GameMode.md)`, `[InteractionSettings](InteractionSettings.md)`>` | `settings` | Yes |  |
| [InteractionRules](InteractionRules.md) | `rules` | Yes |  |
| `int``[]` | `tags` | Yes |  |
| [InteractionCameraSettings](InteractionCameraSettings.md) | `camera` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `MAX_SIZE` | 1,677,721,605 |

## Methods

Concrete subtypes are identified by a VarInt type ID prefix during deserialization.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [InteractionEffects](InteractionEffects.md)
- [InteractionRules](InteractionRules.md)
- [InteractionSettings](InteractionSettings.md)
- [InteractionCameraSettings](InteractionCameraSettings.md)
- [InteractionType](InteractionType.md)
- [GameMode](GameMode.md)
