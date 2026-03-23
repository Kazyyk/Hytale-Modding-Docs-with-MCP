---
title: "DeployablesSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.system"
fqcn: "com.hypixel.hytale.builtin.deployables.system.DeployablesSystem"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "deployables"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables.system`

```java
public class DeployablesSystem
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private static` | `void` | `spawnParticleEffect( @Nonnull Ref<EntityStore> sourceRef, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Vector3d position, @Nonnull ModelParticle particle )` |
| `@Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `tick( float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `private static` | `void` | `deregisterOwner( @Nonnull Ref<EntityStore> ref, @Nonnull DeployableComponent deployableComponent, @Nonnull DeployableConfig deployableConfig )` |
| `@Override public` | `void` | `onEntityAdded( @Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `@Override public` | `void` | `onEntityRemove( @Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |

## Inner Types

- `DeployablesSystem.DeployableOwnerTicker`
- `DeployablesSystem.DeployableRegisterer`
- `DeployablesSystem.DeployableTicker`
