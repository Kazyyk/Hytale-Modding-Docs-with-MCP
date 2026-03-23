---
title: "MovementAudioComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.MovementAudioComponent"
api_surface: false
extends: null
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "modules"
  - "entity"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.component`

```java
public class MovementAudioComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `float` | `NO_REPEAT` |
| `private` | `int` | `lastInsideBlockTypeId` |
| `private` | `float` | `nextMoveInRepeat` |
| `protected` | `Ref<EntityStore>` | `owner` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, MovementAudioComponent>` | `getComponentType()` |
| `@Nonnull public` | `MovementAudioComponent.ShouldHearPredicate` | `getShouldHearPredicate(Ref<EntityStore> ref)` |
| `` | `public int` | `getLastInsideBlockTypeId()` |
| `` | `public void` | `setLastInsideBlockTypeId(int lastInsideBlockTypeId)` |
| `` | `public boolean` | `canMoveInRepeat()` |
| `` | `public boolean` | `tickMoveInRepeat(float dt)` |
| `` | `public void` | `setNextMoveInRepeat(float nextMoveInRepeat)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
| `` | `public boolean` | `test(@Nonnull Ref<EntityStore> targetRef)` |
