---
title: "ComponentUpdate"
kind: "abstract class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ComponentUpdate"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public abstract class ComponentUpdate
```

Abstract polymorphic base class for ECS component updates sent in entity replication packets. Uses VarInt type-ID discriminated union with 26 concrete subtypes.

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

- [ComponentUpdateType](ComponentUpdateType.md)
- [EntityUpdate](EntityUpdate.md)
- [ActiveAnimationsUpdate](ActiveAnimationsUpdate.md)
- [AudioUpdate](AudioUpdate.md)
- [BlockUpdate](BlockUpdate.md)
- [CombatTextUpdate](CombatTextUpdate.md)
- [DynamicLightUpdate](DynamicLightUpdate.md)
- [EntityEffectsUpdate](EntityEffectsUpdate.md)
- [EntityStatsUpdate](EntityStatsUpdate.md)
- [EquipmentUpdate](EquipmentUpdate.md)
- [HitboxCollisionUpdate](HitboxCollisionUpdate.md)
- [IntangibleUpdate](IntangibleUpdate.md)
- [InteractableUpdate](InteractableUpdate.md)
- [InteractionsUpdate](InteractionsUpdate.md)
- [InvulnerableUpdate](InvulnerableUpdate.md)
- [ItemUpdate](ItemUpdate.md)
