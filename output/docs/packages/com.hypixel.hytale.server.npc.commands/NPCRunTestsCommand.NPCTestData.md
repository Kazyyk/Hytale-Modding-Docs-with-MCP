---
title: "NPCRunTestsCommand.NPCTestData"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCRunTestsCommand.NPCTestData"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public static class NPCRunTestsCommand.NPCTestData implements Component<EntityStore>
```

Inner class of [NPCRunTestsCommand](NPCRunTestsCommand.md). An ECS component attached to the player entity during an NPC test session to track test state. Stores the list of NPC roles being tested, flock sizes, the current test index, the set of failed roles, and the UUID of the currently spawned test NPC.

The component type is registered by `NPCPlugin` and retrieved via `NPCPlugin.get().getNpcTestDataComponentType()`.

## Fields

```java
private final IntList npcRoles
```

List of role indices to test.

```java
private final IntList flockSizes
```

Flock size for each role (parallel to `npcRoles`).

```java
private final IntSet failedRoles
```

Set of role indices that have been marked as failed.

```java
private int index
```

Current position in the test sequence.

```java
private UUID targetUUID
```

UUID of the currently spawned test NPC entity.

## Methods

```java
public static ComponentType<EntityStore, NPCRunTestsCommand.NPCTestData> getComponentType()
```

Returns the component type, delegating to `NPCPlugin.get().getNpcTestDataComponentType()`.

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Creates a deep copy of the test data, copying the roles list, index, and failed roles set.

## Related Types

- [NPCRunTestsCommand](NPCRunTestsCommand.md) -- parent command using this component
