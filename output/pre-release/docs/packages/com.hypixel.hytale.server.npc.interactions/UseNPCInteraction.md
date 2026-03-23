---
title: "UseNPCInteraction"
kind: "class"
package: "com.hypixel.hytale.server.npc.interactions"
fqcn: "com.hypixel.hytale.server.npc.interactions.UseNPCInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.interactions`

```java
public class UseNPCInteraction extends SimpleInstantInteraction
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `DEFAULT_ID` | `"*UseNPC"` |
| `public static final` | `RootInteraction` | `DEFAULT_ROOT` | `new RootInteraction("*UseNPC", "*UseNPC")` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `DEFAULT_ID` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `UseNPCInteraction(String id)` |
| `protected` | `` | `UseNPCInteraction()` |
| `protected final` | `void` | `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `public` | `String` | `toString()` |
