---
title: "NPCWorldCommandBase"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCWorldCommandBase"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public abstract class NPCWorldCommandBase extends AbstractWorldCommand
```

Abstract base class for NPC commands that operate on a single NPC within a world context. Extends `AbstractWorldCommand` and adds automatic NPC target resolution: if an entity argument is provided, that entity is used; otherwise the player's look-target is resolved via `TargetUtil.getTargetEntity()`. The resolved entity is validated to have an `NPCEntity` component before the subclass `execute` method is called.

## Fields

```java
@Nonnull
protected static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_OR_ARG
```

Error message displayed when the sender is not a player and no entity argument is provided.

```java
@Nonnull
protected static final Message MESSAGE_COMMANDS_ERRORS_NO_ENTITY_IN_VIEW
```

Error message displayed when no entity is found in the player's view.

```java
@Nonnull
protected final EntityWrappedArg entityArg
```

Optional entity argument for specifying the target NPC by entity ID.

## Constructors

```java
public NPCWorldCommandBase(@Nonnull String name, @Nonnull String description)
```

```java
public NPCWorldCommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
```

```java
public NPCWorldCommandBase(@Nonnull String description)
```

## Methods

```java
@Override
protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
```

Resolves the target NPC and delegates to the abstract `execute` overload.

```java
protected abstract void execute(@Nonnull CommandContext var1, @Nonnull NPCEntity var2, @Nonnull World var3, @Nonnull Store<EntityStore> var4, @Nonnull Ref<EntityStore> var5)
```

Subclasses implement this to define command behavior on the resolved NPC.

```java
@Nullable
protected static NPCEntity ensureIsNPC(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, Ref<EntityStore> ref)
```

Validates that the given entity reference has an `NPCEntity` component. Returns the component on success, or `null` with an error message if the entity is not an NPC.

## Known Subclasses

- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md)
- [NPCAppearanceCommand](NPCAppearanceCommand.md)
- [NPCDumpCommand](NPCDumpCommand.md)
- [NPCGiveCommand](NPCGiveCommand.md)
- [NPCRoleCommand](NPCRoleCommand.md)
- [NPCAttackCommand.SetAttackCommand](NPCAttackCommand.SetAttackCommand.md)
- [NPCAttackCommand.ClearAttackCommand](NPCAttackCommand.ClearAttackCommand.md)
- [NPCPathCommand.SetPathCommand](NPCPathCommand.SetPathCommand.md)
- [NPCPathCommand.PolygonPathCommand](NPCPathCommand.PolygonPathCommand.md)
- [NPCRoleCommand.GetRoleCommand](NPCRoleCommand.GetRoleCommand.md)
- [NPCGiveCommand.GiveNothingCommand](NPCGiveCommand.GiveNothingCommand.md)

## Related Types

- [NPCCommandUtils](NPCCommandUtils.md) -- standalone utility with similar NPC resolution
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- extends this for multi-NPC selection
