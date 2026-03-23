---
title: "DesyncDamageCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage.commands"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.commands.DesyncDamageCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "command"
  - "debug"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage.commands`

```java
public class DesyncDamageCommand extends CommandBase
```

A debug command (`/desyncdamage`) that toggles the `CAUSE_DESYNC` flag on [DamageSystems.FilterUnkillable](DamageSystems.FilterUnkillable.md). When enabled, all damage to all entities is cancelled, useful for debugging damage desynchronization issues.

## Constructor

```java
public DesyncDamageCommand()
```

Registers the command with name `"desyncdamage"` and description key `"server.commands.damage.desyncdamage.desc"`.

## Methods

```java
@Override
protected void executeSync(@Nonnull CommandContext context)
```

Toggles `DamageSystems.FilterUnkillable.CAUSE_DESYNC` and sends a feedback message indicating the new state.

## Related Types

- [DamageSystems.FilterUnkillable](DamageSystems.FilterUnkillable.md) -- the system whose flag this command toggles
- [DamageModule](DamageModule.md) -- registers this command
