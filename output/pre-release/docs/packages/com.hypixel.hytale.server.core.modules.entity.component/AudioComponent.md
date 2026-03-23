---
title: "AudioComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.AudioComponent"
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
public class AudioComponent implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `IntList` | `soundEventIds` |
| `private` | `boolean` | `isNetworkOutdated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, AudioComponent>` | `getComponentType()` |
| `` | `public int[]` | `getSoundEventIds()` |
| `` | `public void` | `addSound(int soundIndex)` |
| `` | `public boolean` | `consumeNetworkOutdated()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
