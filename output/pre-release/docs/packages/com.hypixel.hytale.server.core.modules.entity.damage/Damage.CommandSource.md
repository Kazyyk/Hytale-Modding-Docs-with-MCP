---
title: "Damage.CommandSource"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.Damage.CommandSource"
api_surface: true
extends: ~
implements:
  - "Damage.Source"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "command"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class Damage.CommandSource implements Damage.Source
```

A [Damage.Source](Damage.Source.md) that identifies a command as the origin of the damage. Tracks both the `CommandSender` who executed the command and the command name.

## Constructors

```java
public CommandSource(@Nonnull CommandSender commandSender, @Nonnull AbstractCommand cmd)
```

Creates a command source from a sender and a command object. The command name is extracted via `cmd.getName()`.

```java
public CommandSource(@Nonnull CommandSender commandSender, @Nullable String commandName)
```

Creates a command source from a sender and an explicit command name string.

## Methods

```java
@Nonnull
@Override
public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns a localized death message using the `server.general.killedByCommand` translation key, parameterized with the sender's display name and the command name (or "Unknown" if null).

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `commandSender` | `CommandSender` | `private final` | The sender who executed the command. |
| `commandName` | `String` | `private final` | Name of the command, or `null`. |

## Related Types

- [Damage](Damage.md) -- the damage event
- [Damage.Source](Damage.Source.md) -- parent interface
