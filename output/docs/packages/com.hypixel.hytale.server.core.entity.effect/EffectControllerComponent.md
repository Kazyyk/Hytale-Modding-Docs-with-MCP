---
title: "EffectControllerComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.effect"
fqcn: "com.hypixel.hytale.server.core.entity.effect.EffectControllerComponent"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "effect"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.effect`

```java
public class EffectControllerComponent implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `Int2ObjectMap<ActiveEntityEffect>` | `activeEffects` |
| `protected` | `int[]` | `cachedActiveEffectIndexes` |
| `protected` | `ObjectList<EntityEffectUpdate>` | `changes` |
| `protected` | `boolean` | `isNetworkOutdated` |
| `protected` | `Model` | `originalModel` |
| `protected` | `int` | `activeModelChangeEntityEffectIndex` |
| `protected` | `boolean` | `isInvulnerable` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, EffectControllerComponent>` | `getComponentType()` |
| `public` | `boolean` | `isInvulnerable()` |
| `public` | `void` | `setInvulnerable(boolean invulnerable)` |
| `public` | `boolean` | `addEffect(@Nonnull Ref<EntityStore> ownerRef, @Nonnull EntityEffect entityEffect, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `boolean` | `addEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull EntityEffect entityEffect, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `boolean` | `addEffect( @Nonnull Ref<EntityStore> ownerRef, @Nonnull EntityEffect entityEffect, float duration, @Nonnull OverlapBehavior overlapBehavior, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `boolean` | `addEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull EntityEffect entityEffect, float duration, @Nonnull OverlapBehavior overlapBehavior, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `boolean` | `addInfiniteEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull EntityEffect entityEffect, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `void` | `setModelChange( @Nonnull Ref<EntityStore> ownerRef, @Nonnull EntityEffect entityEffect, int entityEffectIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `void` | `tryResetModelChange(@Nonnull Ref<EntityStore> ownerRef, int activeEffectIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `addActiveEntityEffects(@Nonnull ActiveEntityEffect[] activeEntityEffects)` |
| `public` | `void` | `removeEffect(@Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `removeEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull RemovalBehavior removalBehavior, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `private` | `void` | `addChange(@Nonnull EntityEffectUpdate update)` |
| `public` | `void` | `clearEffects(@Nonnull Ref<EntityStore> ownerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `invalidateCache()` |
| `@Nonnull public` | `Int2ObjectMap<ActiveEntityEffect>` | `getActiveEffects()` |
| `public` | `int[]` | `getActiveEffectIndexes()` |
| `public` | `boolean` | `consumeNetworkOutdated()` |
| `@Nonnull public` | `EntityEffectUpdate[]` | `consumeChanges()` |
| `public` | `void` | `clearChanges()` |
| `@Nonnull public` | `EntityEffectUpdate[]` | `createInitUpdates()` |
| `@Nullable public` | `ActiveEntityEffect[]` | `getAllActiveEntityEffects()` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Nonnull public` | `EffectControllerComponent` | `clone()` |
