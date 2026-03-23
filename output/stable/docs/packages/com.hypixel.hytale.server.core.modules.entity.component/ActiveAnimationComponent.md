---
title: "ActiveAnimationComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.ActiveAnimationComponent"
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
public class ActiveAnimationComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `isNetworkOutdated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, ActiveAnimationComponent>` | `getComponentType()` |
| `` | `public String[]` | `getActiveAnimations()` |
| `` | `public void` | `setPlayingAnimation(AnimationSlot slot, @Nullable String animation)` |
| `` | `public boolean` | `consumeNetworkOutdated()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
