---
title: "AttitudeView"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.attitude"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.attitude.AttitudeView"
api_surface: false
extends: "PrioritisedProviderView<IAttitudeProvider, AttitudeView>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.attitude`

```java
public class AttitudeView extends PrioritisedProviderView<IAttitudeProvider, AttitudeView>
```

Extends `PrioritisedProviderView` to provide AttitudeView functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `World` | `world` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AttitudeView(World world)` |
| `@Nonnull public` | `Attitude` | `getAttitude(@Nonnull Ref<EntityStore> ref, @Nonnull Role self, @Nonnull Ref<EntityStore> target, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `boolean` | `isOutdated(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
| `public` | `AttitudeView` | `getUpdatedView(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `initialiseEntity(@Nonnull Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent)` |
| `@Override public` | `void` | `cleanup()` |
| `@Override public` | `void` | `onWorldRemoved()` |
