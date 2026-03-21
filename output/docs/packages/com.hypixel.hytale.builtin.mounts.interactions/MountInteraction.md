---
title: "MountInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.interactions"
fqcn: "com.hypixel.hytale.builtin.mounts.interactions.MountInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "mounts"
  - "interactions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.mounts.interactions`

```java
public class MountInteraction extends SimpleInstantInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<MountInteraction>` | `CODEC` |
| `private` | `com.hypixel.hytale.math.vector.Vector3f` | `attachmentOffset` |
| `private` | `MountController` | `controller` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
