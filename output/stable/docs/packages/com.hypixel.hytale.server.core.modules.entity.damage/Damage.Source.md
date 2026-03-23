---
title: "Damage.Source"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.Source"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public interface Damage.Source
```

Interface for identifying the origin of a [Damage](Damage.md) event and generating a localized death message. Implementations include [Damage.EntitySource](Damage.EntitySource.md), [Damage.ProjectileSource](Damage.ProjectileSource.md), [Damage.CommandSource](Damage.CommandSource.md), and [Damage.EnvironmentSource](Damage.EnvironmentSource.md). The null source (`Damage.NULL_SOURCE`) is an anonymous implementation used for sourceless damage such as fall damage or drowning.

## Methods

```java
@Nonnull
default Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns a localized death message for the kill feed. The default implementation looks up the `DamageCause` by index and produces a translation key of the form `server.general.killedBy` parameterized with the cause name. Implementations override this to provide source-specific messages (e.g., "killed by [player]" or "killed by command").

## Related Types

- [Damage](Damage.md) -- the damage event that carries a source
- [Damage.EntitySource](Damage.EntitySource.md) -- entity-originated damage
- [Damage.CommandSource](Damage.CommandSource.md) -- command-originated damage
- [Damage.EnvironmentSource](Damage.EnvironmentSource.md) -- environment-originated damage
- [DamageCause](DamageCause.md) -- asset used in the default death message
