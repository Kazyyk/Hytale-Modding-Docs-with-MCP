---
title: "Operation"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.operation"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.operation.Operation"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.operation`

```java
public interface Operation
```

Core interface for interaction operations. An operation represents a single step in an interaction sequence, handling ticking, simulation, cooldowns, and data dependencies. Operations can be nested via the inner `NestedOperation` interface, and may carry label-based tags for branching control flow.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `tick(@Nonnull Ref<EntityStore> var1, @Nonnull LivingEntity var2, boolean var3, float var4, @Nonnull InteractionType var5, @Nonnull InteractionContext var6, @Nonnull CooldownHandler var7)` | `void` | Executes this operation for one tick. |
| `simulateTick(@Nonnull Ref<EntityStore> var1, @Nonnull LivingEntity var2, boolean var3, float var4, @Nonnull InteractionType var5, @Nonnull InteractionContext var6, @Nonnull CooldownHandler var7)` | `void` | Simulates this operation for one tick without side effects. |
| `handle(@Nonnull Ref<EntityStore> ref, boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context)` | `void` | Default handler invoked during interaction processing. No-op by default. |
| `getWaitForDataFrom()` | `WaitForDataFrom` | Returns the data dependency for this operation. |
| `getRules()` | `InteractionRules` | Returns the interaction rules. Returns null by default. |
| `getTags()` | `Int2ObjectMap<IntSet>` | Returns label-indexed tag sets. Returns an empty map by default. |
| `getInnerOperation()` | `Operation` | Unwraps nested operations, following the `NestedOperation` chain to the leaf. |

## Inner Interfaces

| Interface | Description |
|---|---|
| `NestedOperation` | Marks an operation that wraps another via `inner()`. |
